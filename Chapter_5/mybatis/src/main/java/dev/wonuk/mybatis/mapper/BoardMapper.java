package dev.wonuk.mybatis.mapper;

import dev.wonuk.mybatis.dto.BoardDto;

public interface BoardMapper {
    int createBoard(BoardDto dto);
}
