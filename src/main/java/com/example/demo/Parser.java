package com.example.demo;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Parser {

    public static void main(String[] args) throws IOException, InterruptedException {
        //Получаем список каналов

        Document doc = Jsoup.connect("https://tv.mail.ru/perm/").userAgent("Chrome/4.0.249.0 Safari/532.5").referrer("http://google.com").get();
       ArrayList<Channel>ChannelsList = new ArrayList<>();
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       Map<Integer,String> ChannelUrlMap = new HashMap<>();
       ArrayList<String>TimeList = new ArrayList<>();
       ArrayList<String>TvProgramList = new ArrayList<>();
       ArrayList<TvProgram>Program = new ArrayList<>();


       Elements listChannel = doc.getElementsByAttributeValue("class","p-channels__item__info__title__link");


       int id = 0;

       for(Element element : listChannel.select("a")){
           String title = element.text();
           String url = element.attr("href");
           id ++;
           ChannelsList.add(new Channel(title,url,id));
           ChannelUrlMap.put(id,url);
           System.out.println(id + " " +"\""+title.toUpperCase()+"\"");
           }
        System.out.println("Нажмите на клавиатуре цифру соответствующую каналу из списка выше");


        //Получаем список телепрограмм на выбраном канале и за определённую дату
           Integer ChannelNumber = Integer.parseInt(bufferedReader.readLine());
           Document doc2 = Jsoup.connect("https://tv.mail.ru"+ChannelUrlMap.get(ChannelNumber)).userAgent("Chrome/4.0.249.0 Safari/532.5").referrer("http://google.com").get();
           Elements listTimeTvProgram =doc2.getElementsByAttributeValue("class","p-programms__item__time-value");

           for (Element element : listTimeTvProgram.select("span")){
               String time = element.text();
               TimeList.add(time);
           }

           Elements listTvProgram =doc2.getElementsByAttributeValue("class","p-programms__item__name-link");

           for (Element element : listTvProgram.select("span")){
               String tvProgram = element.text();
               TvProgramList.add(tvProgram);

           }
           int i=0;
           for(String s : TimeList){
               Program.add(new TvProgram(s,TvProgramList.get(i)));
               System.out.println(Program.get(i));
               i++;

           }



        }




    }











