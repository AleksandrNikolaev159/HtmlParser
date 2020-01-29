package com.example.demo;

import org.springframework.stereotype.Component;

@Component("tv")
public class TvProgram {
    private String time;
    private String TvShowTitle;


    public TvProgram(String time, String tvShowTitle) {
        this.time = time;
        TvShowTitle = tvShowTitle;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTvShowTitle() {
        return TvShowTitle;
    }

    public void setTvShowTitle(String tvShowTitle) {
        TvShowTitle = tvShowTitle;
    }

    @Override
    public String toString() {
        return "" +
                "Время трансляции : " + time +
                " , Название телепередачи : '" + TvShowTitle + '\'' ;
    }
}
