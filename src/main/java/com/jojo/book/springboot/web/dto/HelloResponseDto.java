package com.jojo.book.springboot.web.dto;

import com.jojo.book.springboot.Annotation.LengthStr;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    @LengthStr
    private final String name;
    private final int amount;
}
