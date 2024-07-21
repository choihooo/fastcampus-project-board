package com.fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class Article {
    // 실제 데이터
    private Long id;
    private String title; // 제목
    private String content; // 본문
    private String hashtag; // 해시태그
    
    // 메타 데이터
    private LocalDateTime createdAt; // 생성일시
    private String createdBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; // 수정자
}
