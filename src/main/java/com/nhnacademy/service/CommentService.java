package com.nhnacademy.service;

import com.nhnacademy.domain.Comment;

import java.util.List;

public interface CommentService {

    int boardCommentExist(long boardId);

    List<Comment> findByBoardId(long boardId);

    int registerComment(long boardId, String userName, String content);

    int modifyComment(long id, String content, String modifierName);

    int deleteComment(long id);

    int findByBoardIdTotalCount(long boardId);

}