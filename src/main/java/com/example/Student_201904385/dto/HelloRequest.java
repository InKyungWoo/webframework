package com.example.Student_201904385.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelloRequest {
    @ApiModelProperty(value = "사용자 이름", example = "Inkyung")
    private String name;            // getter,setter 대신 @Data
    @ApiModelProperty(value = "사용자 레벨", example = "1")
    private int level;
    @ApiModelProperty(value = "사용자 주소", example = "hufs")
    private String address;

}
