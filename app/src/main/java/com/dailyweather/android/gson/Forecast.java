package com.dailyweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    /**
     * daily_forecast是一个数组
     * 每一项是某天的天气
     * 只需定义出单日天气的实体类
     * 再用集合类型来声明就好了
     */
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String max;

        public String min;

    }

    public class More{

        @SerializedName("txt_d")
        public String info;
    }
}
