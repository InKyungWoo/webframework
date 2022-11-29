package com.example.Student_201904385.service;

import com.example.Student_201904385.dto.SearchRequestDto;
import com.example.Student_201904385.naver.NaverClient;
import com.example.Student_201904385.naver.dto.SearchLocalReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SearchService {
    private final NaverClient naverClient;

    public SearchRequestDto searchLocal(String query) {     // String -> SearchRequestDto
        var req = new SearchLocalReq();
        req.setQuery(query);

        var res = naverClient.searchLocal(req);

        if (res.getTotal() > 0) {
            var item = res.getItems().stream().findFirst().get();       // getItems() 하면 리스트 통쨰로 나옴, stream() -> 배열 접근, findFirst() -> 첫번째 가져오기
            var result = new SearchRequestDto();
            result.setAddress(item.getAddress());
            result.setLink(item.getLink());
            result.setCategory(item.getCategory());
            result.setTitle(item.getTitle());
            result.setDescription(item.getDescription());
            result.setTelephone(item.getTelephone());
            result.setRoadAddress(item.getRoadAddress());

            return result;
        }

        return new SearchRequestDto();          // res -> SearchRequestDto
    }
}
