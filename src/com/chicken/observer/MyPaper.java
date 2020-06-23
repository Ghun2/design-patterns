package com.chicken.observer;

public class MyPaper {
    public static void main(String[] args) {
        NewsPaperData newspaperData = new NewsPaperData();

        CurrentContentDisplay currentContentDisplay = new CurrentContentDisplay(newspaperData);

        newspaperData.setPaperContents("오늘, 올해 최고의 폭염", "대한민국 월드컵 우승!", "나는 누구 인가?");
        newspaperData.setPaperContents("코로나 치료제 개발 완료!!", "대한민국 롤드컵 우승!", "외계인은 존재 하나?");
    }
}
