package com.example.devprep.resume;

import lombok.*;

public class ResumeDto {

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class resumeRequestDto {
        private ResumeEnum.Job job;
        private ResumeEnum.Stack stack;
        private Boolean career;
        private String project;
        private String note;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class resumeResponseDto {
        private ResumeEnum.Job job;
        private ResumeEnum.Stack stack;
        private Boolean career;
        private String project;
        private String note;
    }


}
