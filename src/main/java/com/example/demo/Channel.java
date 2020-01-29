package com.example.demo;

public class Channel {
    private String title;
    private String url;
    private int ChannelId;

    public Channel(String title, String url, int channelId) {
        this.title = title;
        this.url = url;
        ChannelId = channelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getChannelId() {
        return ChannelId;
    }

    public void setChannelId(int channelId) {
        ChannelId = channelId;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", ChannelId=" + ChannelId +
                '}';
    }
}

