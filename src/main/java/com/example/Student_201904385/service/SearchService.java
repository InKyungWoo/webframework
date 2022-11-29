package com.example.Student_201904385.service;

import com.example.Student_201904385.naver.NaverClient;
import com.example.Student_201904385.naver.dto.SearchLocalReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SearchService {
    private final NaverClient naverClient;

    public String searchLocal(String query) {
        var req = new SearchLocalReq();
        req.setQuery(query);

        var res = naverClient.searchLocal(req);

        return res;
    }
}
