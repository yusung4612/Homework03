package com.sparta.postcomment.dto;

import com.sparta.postcomment.entity.User;
import lombok.Getter;

@Getter
public class CommentRequestDto {
    private Long postId;
    private String comment;
    private User user;
}
