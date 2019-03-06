package mg.studio.weatherappdesign;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChongQingGson {

    /**
     * cod : 200
     * message : 0.0044
     * cnt : 38
     * list : [{"dt":1551592800,"main":{"temp":14.77,"temp_min":13.01,"temp_max":14.77,"pressure":1014.46,"sea_level":1014.46,"grnd_level":925.55,"humidity":76,"temp_kf":1.76},"weather":[{"id":800,"main":"Clear","description":"晴","icon":"02d"}],"clouds":{"all":8},"wind":{"speed":1.27,"deg":305},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-03 06:00:00"},{"dt":1551603600,"main":{"temp":15.49,"temp_min":14.17,"temp_max":15.49,"pressure":1011.09,"sea_level":1011.09,"grnd_level":922.66,"humidity":68,"temp_kf":1.32},"weather":[{"id":800,"main":"Clear","description":"晴","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":0.52,"deg":339.501},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-03 09:00:00"},{"dt":1551614400,"main":{"temp":9.25,"temp_min":8.37,"temp_max":9.25,"pressure":1012.9,"sea_level":1012.9,"grnd_level":923.54,"humidity":86,"temp_kf":0.88},"weather":[{"id":800,"main":"Clear","description":"晴","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":0.86,"deg":354.501},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-03 12:00:00"},{"dt":1551625200,"main":{"temp":4.68,"temp_min":4.24,"temp_max":4.68,"pressure":1013.96,"sea_level":1013.96,"grnd_level":923.77,"humidity":91,"temp_kf":0.44},"weather":[{"id":800,"main":"Clear","description":"晴","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":0.9,"deg":98.0039},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-03 15:00:00"},{"dt":1551636000,"main":{"temp":2.48,"temp_min":2.48,"temp_max":2.48,"pressure":1013.26,"sea_level":1013.26,"grnd_level":922.83,"humidity":89,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"晴","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.01,"deg":119},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-03 18:00:00"},{"dt":1551646800,"main":{"temp":1.73,"temp_min":1.73,"temp_max":1.73,"pressure":1011.76,"sea_level":1011.76,"grnd_level":921.09,"humidity":89,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"晴","icon":"02n"}],"clouds":{"all":8},"wind":{"speed":1.02,"deg":113.501},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-03 21:00:00"},{"dt":1551657600,"main":{"temp":2.86,"temp_min":2.86,"temp_max":2.86,"pressure":1012.02,"sea_level":1012.02,"grnd_level":921.39,"humidity":92,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":24},"wind":{"speed":1,"deg":111.5},"rain":{"3h":0.005},"sys":{"pod":"d"},"dt_txt":"2019-03-04 00:00:00"},{"dt":1551668400,"main":{"temp":12.21,"temp_min":12.21,"temp_max":12.21,"pressure":1010.72,"sea_level":1010.72,"grnd_level":921.44,"humidity":81,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":12},"wind":{"speed":1.46,"deg":120.501},"rain":{"3h":0.015},"sys":{"pod":"d"},"dt_txt":"2019-03-04 03:00:00"},{"dt":1551679200,"main":{"temp":16.09,"temp_min":16.09,"temp_max":16.09,"pressure":1007.21,"sea_level":1007.21,"grnd_level":918.88,"humidity":71,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"多云","icon":"03d"}],"clouds":{"all":44},"wind":{"speed":1.36,"deg":106.505},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-04 06:00:00"},{"dt":1551690000,"main":{"temp":16.13,"temp_min":16.13,"temp_max":16.13,"pressure":1005.01,"sea_level":1005.01,"grnd_level":916.94,"humidity":68,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"阴，多云","icon":"04d"}],"clouds":{"all":92},"wind":{"speed":1.07,"deg":109.502},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-04 09:00:00"},{"dt":1551700800,"main":{"temp":11.76,"temp_min":11.76,"temp_max":11.76,"pressure":1006.23,"sea_level":1006.23,"grnd_level":917.59,"humidity":80,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":68},"wind":{"speed":0.76,"deg":85.0025},"rain":{"3h":0.15},"sys":{"pod":"n"},"dt_txt":"2019-03-04 12:00:00"},{"dt":1551711600,"main":{"temp":9.51,"temp_min":9.51,"temp_max":9.51,"pressure":1008.22,"sea_level":1008.22,"grnd_level":919.16,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.07,"deg":163.502},"rain":{"3h":1.55},"sys":{"pod":"n"},"dt_txt":"2019-03-04 15:00:00"},{"dt":1551722400,"main":{"temp":9.21,"temp_min":9.21,"temp_max":9.21,"pressure":1009.1,"sea_level":1009.1,"grnd_level":919.83,"humidity":99,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"中雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":0.93,"deg":167.5},"rain":{"3h":6.61},"sys":{"pod":"n"},"dt_txt":"2019-03-04 18:00:00"},{"dt":1551733200,"main":{"temp":9.07,"temp_min":9.07,"temp_max":9.07,"pressure":1008.9,"sea_level":1008.9,"grnd_level":919.58,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":0.84,"deg":188.5},"rain":{"3h":1.75},"sys":{"pod":"n"},"dt_txt":"2019-03-04 21:00:00"},{"dt":1551744000,"main":{"temp":9.1,"temp_min":9.1,"temp_max":9.1,"pressure":1010.46,"sea_level":1010.46,"grnd_level":920.98,"humidity":100,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"中雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":0.91,"deg":277.501},"rain":{"3h":3.24},"sys":{"pod":"d"},"dt_txt":"2019-03-05 00:00:00"},{"dt":1551754800,"main":{"temp":10.18,"temp_min":10.18,"temp_max":10.18,"pressure":1012.02,"sea_level":1012.02,"grnd_level":923.07,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.12,"deg":282},"rain":{"3h":0.61},"sys":{"pod":"d"},"dt_txt":"2019-03-05 03:00:00"},{"dt":1551765600,"main":{"temp":10.39,"temp_min":10.39,"temp_max":10.39,"pressure":1011.64,"sea_level":1011.64,"grnd_level":923.04,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.17,"deg":278.007},"rain":{"3h":1.58},"sys":{"pod":"d"},"dt_txt":"2019-03-05 06:00:00"},{"dt":1551776400,"main":{"temp":9.97,"temp_min":9.97,"temp_max":9.97,"pressure":1011.98,"sea_level":1011.98,"grnd_level":923.27,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.16,"deg":305.002},"rain":{"3h":1.56},"sys":{"pod":"d"},"dt_txt":"2019-03-05 09:00:00"},{"dt":1551787200,"main":{"temp":9.46,"temp_min":9.46,"temp_max":9.46,"pressure":1014.34,"sea_level":1014.34,"grnd_level":925.15,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.07,"deg":14.5003},"rain":{"3h":0.5},"sys":{"pod":"n"},"dt_txt":"2019-03-05 12:00:00"},{"dt":1551798000,"main":{"temp":8.95,"temp_min":8.95,"temp_max":8.95,"pressure":1016.43,"sea_level":1016.43,"grnd_level":926.7,"humidity":94,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":0.96,"deg":29.0011},"rain":{"3h":0.11},"sys":{"pod":"n"},"dt_txt":"2019-03-05 15:00:00"},{"dt":1551808800,"main":{"temp":8.76,"temp_min":8.76,"temp_max":8.76,"pressure":1017.47,"sea_level":1017.47,"grnd_level":927.28,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":0.87,"deg":354.502},"rain":{"3h":0.71},"sys":{"pod":"n"},"dt_txt":"2019-03-05 18:00:00"},{"dt":1551819600,"main":{"temp":8.6,"temp_min":8.6,"temp_max":8.6,"pressure":1017.12,"sea_level":1017.12,"grnd_level":926.77,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.11,"deg":107.503},"rain":{"3h":2.69},"sys":{"pod":"n"},"dt_txt":"2019-03-05 21:00:00"},{"dt":1551830400,"main":{"temp":8.45,"temp_min":8.45,"temp_max":8.45,"pressure":1018.46,"sea_level":1018.46,"grnd_level":928.02,"humidity":99,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"中雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":1.21,"deg":81.5005},"rain":{"3h":4.56},"sys":{"pod":"d"},"dt_txt":"2019-03-06 00:00:00"},{"dt":1551841200,"main":{"temp":10.13,"temp_min":10.13,"temp_max":10.13,"pressure":1019.11,"sea_level":1019.11,"grnd_level":929.12,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":0.81,"deg":43.5004},"rain":{"3h":0.87},"sys":{"pod":"d"},"dt_txt":"2019-03-06 03:00:00"},{"dt":1551852000,"main":{"temp":10.16,"temp_min":10.16,"temp_max":10.16,"pressure":1018.04,"sea_level":1018.04,"grnd_level":928.37,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":0.26,"deg":175},"rain":{"3h":1.47},"sys":{"pod":"d"},"dt_txt":"2019-03-06 06:00:00"},{"dt":1551862800,"main":{"temp":10.28,"temp_min":10.28,"temp_max":10.28,"pressure":1016.66,"sea_level":1016.66,"grnd_level":927.22,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":88},"wind":{"speed":0.53,"deg":78.0003},"rain":{"3h":0.89},"sys":{"pod":"d"},"dt_txt":"2019-03-06 09:00:00"},{"dt":1551873600,"main":{"temp":8.86,"temp_min":8.86,"temp_max":8.86,"pressure":1018.05,"sea_level":1018.05,"grnd_level":928.04,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":76},"wind":{"speed":0.76,"deg":85.0031},"rain":{"3h":0.09},"sys":{"pod":"n"},"dt_txt":"2019-03-06 12:00:00"},{"dt":1551884400,"main":{"temp":7.87,"temp_min":7.87,"temp_max":7.87,"pressure":1019.56,"sea_level":1019.56,"grnd_level":929.16,"humidity":97,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":80},"wind":{"speed":1.27,"deg":114},"rain":{"3h":0.030000000000001},"sys":{"pod":"n"},"dt_txt":"2019-03-06 15:00:00"},{"dt":1551895200,"main":{"temp":7.43,"temp_min":7.43,"temp_max":7.43,"pressure":1019.81,"sea_level":1019.81,"grnd_level":929,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.97,"deg":133.502},"rain":{"3h":0.080000000000002},"sys":{"pod":"n"},"dt_txt":"2019-03-06 18:00:00"},{"dt":1551906000,"main":{"temp":6.42,"temp_min":6.42,"temp_max":6.42,"pressure":1020.05,"sea_level":1020.05,"grnd_level":929.03,"humidity":98,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.67,"deg":133.502},"rain":{"3h":1.3},"sys":{"pod":"n"},"dt_txt":"2019-03-06 21:00:00"},{"dt":1551916800,"main":{"temp":6.4,"temp_min":6.4,"temp_max":6.4,"pressure":1020.8,"sea_level":1020.8,"grnd_level":929.44,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":2.49,"deg":132},"rain":{"3h":0.91},"sys":{"pod":"d"},"dt_txt":"2019-03-07 00:00:00"},{"dt":1551927600,"main":{"temp":8.45,"temp_min":8.45,"temp_max":8.45,"pressure":1021.22,"sea_level":1021.22,"grnd_level":930.32,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10d"}],"clouds":{"all":88},"wind":{"speed":3.32,"deg":129.004},"rain":{"3h":0.040000000000003},"sys":{"pod":"d"},"dt_txt":"2019-03-07 03:00:00"},{"dt":1551938400,"main":{"temp":9.46,"temp_min":9.46,"temp_max":9.46,"pressure":1019.18,"sea_level":1019.18,"grnd_level":928.84,"humidity":93,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"多云","icon":"04d"}],"clouds":{"all":80},"wind":{"speed":2.86,"deg":126.501},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-07 06:00:00"},{"dt":1551949200,"main":{"temp":9.19,"temp_min":9.19,"temp_max":9.19,"pressure":1017.06,"sea_level":1017.06,"grnd_level":926.82,"humidity":90,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"多云","icon":"03d"}],"clouds":{"all":36},"wind":{"speed":2.97,"deg":125.503},"rain":{},"sys":{"pod":"d"},"dt_txt":"2019-03-07 09:00:00"},{"dt":1551960000,"main":{"temp":6.19,"temp_min":6.19,"temp_max":6.19,"pressure":1018.5,"sea_level":1018.5,"grnd_level":927.79,"humidity":86,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"晴，少云","icon":"02n"}],"clouds":{"all":24},"wind":{"speed":3.26,"deg":128.003},"rain":{},"sys":{"pod":"n"},"dt_txt":"2019-03-07 12:00:00"},{"dt":1551970800,"main":{"temp":5.46,"temp_min":5.46,"temp_max":5.46,"pressure":1019.79,"sea_level":1019.79,"grnd_level":928.48,"humidity":84,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":88},"wind":{"speed":2.41,"deg":128.502},"rain":{"3h":0.049999999999997},"sys":{"pod":"n"},"dt_txt":"2019-03-07 15:00:00"},{"dt":1551981600,"main":{"temp":4.43,"temp_min":4.43,"temp_max":4.43,"pressure":1019.65,"sea_level":1019.65,"grnd_level":927.99,"humidity":95,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.42,"deg":116.005},"rain":{"3h":0.81},"snow":{"3h":0.135},"sys":{"pod":"n"},"dt_txt":"2019-03-07 18:00:00"},{"dt":1551992400,"main":{"temp":3.67,"temp_min":3.67,"temp_max":3.67,"pressure":1018.33,"sea_level":1018.33,"grnd_level":926.53,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"小雨","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":1.16,"deg":112.506},"rain":{"3h":0.67},"snow":{"3h":0.42},"sys":{"pod":"n"},"dt_txt":"2019-03-07 21:00:00"}]
     * city : {"id":1814905,"name":"Chongqing Shi","coord":{"lat":30.25,"lon":107.75},"country":"CN"}
     */

    private String cod;
    private double message;
    private int cnt;
    private CityBean city;
    private List<ListBean> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CityBean {
        /**
         * id : 1814905
         * name : Chongqing Shi
         * coord : {"lat":30.25,"lon":107.75}
         * country : CN
         */

        private int id;
        private String name;
        private CoordBean coord;
        private String country;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CoordBean getCoord() {
            return coord;
        }

        public void setCoord(CoordBean coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public static class CoordBean {
            /**
             * lat : 30.25
             * lon : 107.75
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ListBean {
        /**
         * dt : 1551592800
         * main : {"temp":14.77,"temp_min":13.01,"temp_max":14.77,"pressure":1014.46,"sea_level":1014.46,"grnd_level":925.55,"humidity":76,"temp_kf":1.76}
         * weather : [{"id":800,"main":"Clear","description":"晴","icon":"02d"}]
         * clouds : {"all":8}
         * wind : {"speed":1.27,"deg":305}
         * rain : {}
         * sys : {"pod":"d"}
         * dt_txt : 2019-03-03 06:00:00
         * snow : {"3h":0.135}
         */

        private int dt;
        private MainBean main;
        private CloudsBean clouds;
        private WindBean wind;
        private RainBean rain;
        private SysBean sys;
        private String dt_txt;
        private SnowBean snow;
        private List<WeatherBean> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public MainBean getMain() {
            return main;
        }

        public void setMain(MainBean main) {
            this.main = main;
        }

        public CloudsBean getClouds() {
            return clouds;
        }

        public void setClouds(CloudsBean clouds) {
            this.clouds = clouds;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public RainBean getRain() {
            return rain;
        }

        public void setRain(RainBean rain) {
            this.rain = rain;
        }

        public SysBean getSys() {
            return sys;
        }

        public void setSys(SysBean sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public SnowBean getSnow() {
            return snow;
        }

        public void setSnow(SnowBean snow) {
            this.snow = snow;
        }

        public List<WeatherBean> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = weather;
        }

        public static class MainBean {
            /**
             * temp : 14.77
             * temp_min : 13.01
             * temp_max : 14.77
             * pressure : 1014.46
             * sea_level : 1014.46
             * grnd_level : 925.55
             * humidity : 76
             * temp_kf : 1.76
             */

            private double temp;
            private double temp_min;
            private double temp_max;
            private double pressure;
            private double sea_level;
            private double grnd_level;
            private int humidity;
            private double temp_kf;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public double getTemp_min() {
                return temp_min;
            }

            public void setTemp_min(double temp_min) {
                this.temp_min = temp_min;
            }

            public double getTemp_max() {
                return temp_max;
            }

            public void setTemp_max(double temp_max) {
                this.temp_max = temp_max;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getSea_level() {
                return sea_level;
            }

            public void setSea_level(double sea_level) {
                this.sea_level = sea_level;
            }

            public double getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(double grnd_level) {
                this.grnd_level = grnd_level;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(double temp_kf) {
                this.temp_kf = temp_kf;
            }
        }

        public static class CloudsBean {
            /**
             * all : 8
             */

            private int all;

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class WindBean {
        }

        public static class RainBean {
        }

        public static class SysBean {
            /**
             * pod : d
             */

            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class SnowBean {
            /**
             * 3h : 0.135
             */

            @SerializedName("3h")
            private double _$3h;

            public double get_$3h() {
                return _$3h;
            }

            public void set_$3h(double _$3h) {
                this._$3h = _$3h;
            }
        }

        public static class WeatherBean {
            /**
             * id : 800
             * main : Clear
             * description : 晴
             * icon : 02d
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}
