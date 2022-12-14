package com.example.Student_201904385.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
@ApiModel(value="유저 Post 요청")
@NoArgsConstructor
public class PostUserRequest {
    @ApiModelProperty(value = "사용자 ID", example = "12345678")
    private String id;
    @ApiModelProperty(value = "사용자 이름", example = "테스터")
    private String name;
    private String email;
    private String address;
    private String password;
    //@JsonProperty("phone_number")
    private String phoneNumber;

    private String userId;          // userId 추가

}