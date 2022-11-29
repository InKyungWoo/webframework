package com.example.Student_201904385.naver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchLocalReq {           // 파라미터 타입
    private String query = "";
    private Integer display = 1;        // 한 번에 표시할 검사 결과 개수
    private Integer start = 1;          // 검색 시작 위치
    private String sort = "random";     // 정렬 -random(기본값): 정확도순, -comment:카페, 리뷰 개수순

    public MultiValueMap<String, String> toMultiValueMap() {
        var map = new LinkedMultiValueMap<String, String>();

        map.add("query", query);
        map.add("display", display.toString());
        map.add("start", start.toString());
        map.add("sort", sort);

        return map;

    }
}
