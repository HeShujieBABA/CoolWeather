package com.mypackage.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 何书杰 on 2017/9/23.
 */

public class NOW {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
