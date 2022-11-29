package com.example.Student_201904385.naver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SearchLocalRes {                   // 네이버 검색해서 나오는 정보들 이렇게 받아옴
    private String lastBuildDate;
    private int total;
    private int start;
    private int display;
    private List<SearchLocalItem> items;        // Items 배열
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class SearchLocalItem {       // class 안에 class
        private String title;
        private String link;
        private String category;
        private String description;
        private String telephone;
        private String address;
        private String roadAddress;
        private int mapx;
        private int mapy;
    }
}
