package mg.studio.weatherappdesign;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class MainActivity extends AppCompatActivity {
    final int REFRESH=0;
    final int INIT=1;

    boolean initDone=false;

    ProgressPopup progressPopup=new ProgressPopup();
    Weather weather=new Weather();

    private TextView textView_Today;
    private TextView textView_tempToday;
    private TextView textView_location;
    private TextView textView_date;
    private TextView textView_news;
    private TextView textView_future_1;
    private TextView textView_future_2;
    private TextView textView_future_3;
    private TextView textView_future_4;

    private ImageView imageView_weatherConditionToday;
    private ImageView imageView_future_1;
    private ImageView imageView_future_2;
    private ImageView imageView_future_3;
    private ImageView imageView_future_4;


    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case REFRESH:
                    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    //设置显示的星期几
                    try{
                        Date today=format.parse(weather.getList().get(1).getDt_txt());
                        //设置今天是星期几
                        textView_Today.setText(getWeekOfDate(today));
                        //设置今天的温度
                        textView_tempToday.setText(String.valueOf(weather.getList().get(1).getMain().getTemp()).substring(0,1));
                        //设置今天的天气大图标
                        imageView_weatherConditionToday.setImageResource(getWeatherImgIdUp(weather.getList().get(1).getWeather().get(0).getDescription()));
                        //设置当前日期
                        textView_date.setText(weather.getList().get(1).getDt_txt());
                        //设置news，设置成最后一次刷新天气的时间
                        textView_news.setText("最后刷新："+format.format(new Date()));

                        //设置底部四个小图标以及小图标下的文字
                        imageView_future_1.setImageResource(getWeatherImgIdSmall(weather.getList().get(10).getWeather().get(0).getDescription()));
                        textView_future_1.setText(getWeekOfDate(format.parse(weather.getList().get(10).getDt_txt())).substring(0,3));
                        imageView_future_2.setImageResource(getWeatherImgIdSmall(weather.getList().get(18).getWeather().get(0).getDescription()));
                        textView_future_2.setText(getWeekOfDate(format.parse(weather.getList().get(18).getDt_txt())).substring(0,3));
                        imageView_future_3.setImageResource(getWeatherImgIdSmall(weather.getList().get(26).getWeather().get(0).getDescription()));
                        textView_future_3.setText(getWeekOfDate(format.parse(weather.getList().get(26).getDt_txt())).substring(0,3));
                        imageView_future_4.setImageResource(getWeatherImgIdSmall(weather.getList().get(34).getWeather().get(0).getDescription()));
                        textView_future_4.setText(getWeekOfDate(format.parse(weather.getList().get(34).getDt_txt())).substring(0,3));

                        Toast.makeText(MainActivity.this, "天气更新成功！", Toast.LENGTH_SHORT).show();

                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    break;

                case INIT:
                    DownloadUpdate downloadUpdate=new DownloadUpdate();
                    downloadUpdate.execute();
                    initDone=true;
                    break;
                    default:
                        break;


            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_Today=findViewById(R.id.textView_today);
        textView_tempToday=findViewById(R.id.temperature_of_the_day);
        textView_location=findViewById(R.id.tv_location);
        textView_date=findViewById(R.id.tv_date);
        textView_news=findViewById(R.id.tv_news);
        textView_future_1=findViewById(R.id.textView_future_1);
        textView_future_2=findViewById(R.id.textView_future_2);
        textView_future_3=findViewById(R.id.textView_future_3);
        textView_future_4=findViewById(R.id.textView_future_4);
        imageView_weatherConditionToday=findViewById(R.id.img_weather_condition);
        imageView_future_1=findViewById(R.id.imageView_future_1);
        imageView_future_2=findViewById(R.id.imageView_future_2);
        imageView_future_3=findViewById(R.id.imageView_future_3);
        imageView_future_4=findViewById(R.id.imageView_future_4);

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if(initDone==false){
            Message initMessage=new Message();
            initMessage.what=INIT;
            handler.sendMessage(initMessage);
        }
    }

    public void btnClick(View view) {
        new DownloadUpdate().execute();
    }


    private class DownloadUpdate extends AsyncTask<Void, Void, String> {
        @Override
        protected void onPreExecute() {
            progressPopup.show("刷新中...请稍后");
        }

        @Override
        protected String doInBackground(Void... voids) {
            OkHttpClient client=new OkHttpClient();
            Request request=new Request.Builder()
                    .url("http://api.openweathermap.org/data/2.5/forecast?id=1814905&APPID=e9a6dbb8323ea31323e8b75873e0a6cf&lang=zh_cn&units=metric")
                    .build();

            try{
                Response response=client.newCall(request).execute();
                int times=0;
                while(response.code()!=200){
                    response=client.newCall(request).execute();
                    times++;
                    Thread.sleep(1000);
                }

                //取每天早上6点的天气为当天的天气
                if(response.code()==200){
                    Gson gson=new Gson();
                    weather=gson.fromJson(response.body().string(), Weather.class);
                }

            }catch(Exception e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            if(weather.getCod().equals("")){
                Toast.makeText(MainActivity.this, "刷新失败，请检查网络！", Toast.LENGTH_SHORT).show();
            }else{
                Message message=new Message();
                message.what=REFRESH;
                handler.sendMessage(message);
                progressPopup.dismiss();
            }

        }
    }

    //等待提示
    class ProgressPopup {
        // 声明PopupWindow
        private PopupWindow popupWindow;
        // 声明PopupWindow对应的视图
        private View popupView;
        // 声明平移动画
        private TranslateAnimation animation;

        private void show(String s) {
            this.popupView = View.inflate(MainActivity.this, R.layout.popup_progress, null);
            TextView textView = popupView.findViewById(R.id.textView_popupProgress);
            textView.setText(s);
            // 参数2,3：指明popupwindow的宽度和高度
            popupWindow = new PopupWindow(popupView, 400, 300);
            WindowManager.LayoutParams lp = getWindow().getAttributes();
            lp.alpha = 0.4f;
            getWindow().setAttributes(lp);
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public void onDismiss() {
                    WindowManager.LayoutParams lp = getWindow().getAttributes();
                    lp.alpha = 1f;
                    getWindow().setAttributes(lp);
                }
            });

            // 设置点击popupwindow外屏幕其它地方消失
            popupWindow.setFocusable(false);
            popupWindow.setOutsideTouchable(false);
            // 平移动画相对于手机屏幕的底部开始，X轴不变，Y轴从1变0
            animation = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0,
                    Animation.RELATIVE_TO_PARENT, 1, Animation.RELATIVE_TO_PARENT, 0);
            animation.setInterpolator(new AccelerateInterpolator());
            animation.setDuration(200);
            // 设置popupWindow的显示位置，此处是在手机屏幕底部且水平居中的位置
            popupWindow.showAtLocation(MainActivity.this.getWindow().getDecorView(), Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 0, 0);
            popupView.startAnimation(animation);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE, WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
        }

        private void dismiss() {
            popupWindow.dismiss();
            popupView = null;
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
        }
    }


    public String getWeekOfDate(Date date) {
        String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }

    public int getWeatherImgIdUp(String s){
        if(s.contains("晴")){
            return R.drawable.sunny_up;
        }else if(s.contains("风")){
            return R.drawable.windy_up;
        }else if(s.contains("雨")){
            return R.drawable.rainy_up;
        }else if(s.contains("云")){
            return R.drawable.partly_sunny_up;
        }
        return R.drawable.sunny_up;
    }

    public int getWeatherImgIdSmall(String s){
        if(s.contains("晴")){
            return R.drawable.sunny_small;
        }else if(s.contains("风")){
            return R.drawable.windy_small;
        }else if(s.contains("雨")){
            return R.drawable.rainy_small;
        }else if(s.contains("云")){
            return R.drawable.partly_sunny_small;
        }
        return R.drawable.sunny_small;
    }
}
