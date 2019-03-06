package mg.studio.weatherappdesign;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class MainActivity extends AppCompatActivity {
    ChongQingGson chongQingGson=new ChongQingGson();
    private TextView text1;
    private ImageView imgToday;
    private TextView date;
    private TextView temp;
    private ImageView img_1;
    private TextView text_1;
    private ImageView img_2;
    private TextView text_2;
    private ImageView img_3;
    private TextView text_3;
    private ImageView img_4;
    private TextView text_4;
    private Button button;
    private int time=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=findViewById(R.id.text1);
        imgToday=findViewById(R.id.img_weather_condition);
        date=findViewById(R.id.tv_date);
        temp=findViewById(R.id.temperature_of_the_day);
        img_1=findViewById(R.id.img_1);
        img_2=findViewById(R.id.img_2);
        img_3=findViewById(R.id.img_3);
        img_4=findViewById(R.id.img_4);
        text_1=findViewById(R.id.text_1);
        text_2=findViewById(R.id.text_2);
        text_3=findViewById(R.id.text_3);
        text_4=findViewById(R.id.text_4);
        button=findViewById(R.id.button);
    }

    public void btnClick(View view) {
        new DownloadUpdate().execute();
        Toast.makeText(MainActivity.this, "天气更新成功！", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if(time==0){
            new DownloadUpdate().execute();
        }
    }

    private class DownloadUpdate extends AsyncTask<String, Void, String> {


        @Override
        protected String doInBackground(String... strings) {
            String stringUrl = "http://api.openweathermap.org/data/2.5/forecast?id=1814905&APPID=dcf02ed9d4802ec1ce458867dec8ee90&lang=zh_cn&units=metric";
            HttpURLConnection urlConnection = null;
            BufferedReader reader;

            try {
                URL url = new URL(stringUrl);

                // Create the request to get the information from the server, and open the connection
                urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");

                urlConnection.connect();

                // Read the input stream into a String
                InputStream inputStream = urlConnection.getInputStream();
                StringBuffer buffer = new StringBuffer();
                if (inputStream == null) {
                    // Nothing to do.
                    return null;
                }
                reader = new BufferedReader(new InputStreamReader(inputStream));

                String line;
                while ((line = reader.readLine()) != null) {
                    buffer.append(line);
                }

                if (buffer.length() == 0) {
                    // Stream was empty.  No point in parsing.
                    return null;
                }
                //The temperature
                return buffer.toString();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (ProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(String temperature) {
            chongQingGson=new Gson().fromJson(temperature,ChongQingGson.class);
            text1.setText(getWeek(0));
            imgToday.setImageResource(getWeatherIcon(chongQingGson.getList().get(3).getWeather().get(0).getDescription()));
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            date.setText(format.format(new Date()));

            temp.setText(String.valueOf(chongQingGson.getList().get(3).getMain().getTemp()).substring(0,1));

            img_1.setImageResource(getWeatherIcon(chongQingGson.getList().get(11).getWeather().get(0).getDescription()));
            img_2.setImageResource(getWeatherIcon(chongQingGson.getList().get(19).getWeather().get(0).getDescription()));
            img_3.setImageResource(getWeatherIcon(chongQingGson.getList().get(27).getWeather().get(0).getDescription()));
            img_4.setImageResource(getWeatherIcon(chongQingGson.getList().get(35).getWeather().get(0).getDescription()));

            text_1.setText(getWeek(1).substring(0,3));
            text_2.setText(getWeek(2).substring(0,3));
            text_3.setText(getWeek(3).substring(0,3));
            text_4.setText(getWeek(4).substring(0,3));

        }
    }


    public static String getWeek(int dayCompareToday) {
        Calendar calendar=Calendar.getInstance();
        String[] str1=new String[]{"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return str1[(calendar.DAY_OF_WEEK+dayCompareToday)%7];
    }

    public int getWeatherIcon(String s){
        int result=0;
        if(s.contains("晴")){
            result=R.drawable.sunny_small;
        }else if(s.contains("雨")){
            result=R.drawable.rainy_small;
        }else if(s.contains("云")){
            result=R.drawable.partly_sunny_small;
        }else if(s.contains("风")){
            result=R.drawable.windy_small;
        }
        return result;
    }
}
