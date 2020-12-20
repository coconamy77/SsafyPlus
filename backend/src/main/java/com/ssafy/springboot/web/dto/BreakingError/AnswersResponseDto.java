package com.ssafy.springboot.web.dto.BreakingError;

import com.ssafy.springboot.domain.BreakingError.Answers;
import lombok.Getter;

@Getter
public class AnswersResponseDto {

    private Long answerId;
    private String title;
    private String content;
    private String userEmail;
    private Long errorId;
    private Long likeCnt;
    private Long answerCnt;

    public AnswersResponseDto(Answers entity) {
        this.answerId = entity.getAnswerId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.userEmail = entity.getUser().getEmail();
        this.errorId = entity.getError().getErrorId();
        this.likeCnt = entity.getLikeCnt();
        this.answerCnt = entity.getAnswerCnt();
    }
}
