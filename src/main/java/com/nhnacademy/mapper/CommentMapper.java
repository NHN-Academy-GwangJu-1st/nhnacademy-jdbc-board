package com.nhnacademy.mapper;

import com.nhnacademy.domain.Comment;
import com.nhnacademy.domain.CommentRegisterRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommentMapper {

    int boardCommentExist(long boardId);

    Comment findById(long id);

    List<Comment> findByBoardId(long boardId);

    int registerComment(CommentRegisterRequest commentRegisterRequest);

    int modifyComment(@Param("id") long id, @Param("content") String content);

    int deleteComment(long id);

}
