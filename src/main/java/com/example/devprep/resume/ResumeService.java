package com.example.devprep.resume;

public interface ResumeService {

    ResumeDto.resumeResponseDto createResume(ResumeDto.resumeRequestDto createResumeRequestDto);

    ResumeDto.resumeResponseDto updateResume(ResumeDto.resumeRequestDto updateResumeRequestDto, Long id);
}
