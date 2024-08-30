package com.example.demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.dto.TodoListDto;

@Mapper
public interface TodoListRepository {
    List<TodoListDto> getAllTodoList();
}
