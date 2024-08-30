package com.example.demo.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
@Builder
public class TodoListDto {
    private int id;
    private String contents;
    private boolean isChecked;
    private Date createdDate;
    private Date updatedDate;
}
