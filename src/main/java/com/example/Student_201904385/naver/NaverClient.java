package com.example.Student_201904385.naver;

import com.example.Student_201904385.naver.dto.SearchLocalReq;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
@PropertySource("classpath:application-api-key.properties")
public class NaverClient {
    @Value("${naver.client.id}")
    private String naverClientId;

    @Value("${naver.client.secret}")
    private String naverClientSecret;

    @Value("${naver.url.search.local}")
    private String naverUrlSearchLocal;

    // searchLocal 구현
    public String searchLocal(SearchLocalReq searchLocalReq) {

        var uri = UriComponentsBuilder.fromUriString(naverUrlSearchLocal)
                .queryParams(searchLocalReq.toMultiValueMap())
                .build()
                .encode()
                .toUri();


        var headers = new HttpHeaders();
        // 클라이언트 Id, Secret 추가
        headers.set("X-Naver-Client-Id", naverClientId);
        headers.set("X-Naver-Client-Secret", naverClientSecret);

        headers.setContentType(MediaType.APPLICATION_JSON);
        var httpEntity = new HttpEntity<>(headers);

        var responseType = new ParameterizedTypeReference<String>(){};

        var responseEntity = new RestTemplate().exchange(
                uri,
                HttpMethod.GET,
                httpEntity,
                responseType
        );

        return responseEntity.getBody();
    }

}
