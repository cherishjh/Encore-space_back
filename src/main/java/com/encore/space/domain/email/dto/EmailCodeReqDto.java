package com.encore.space.domain.email.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Schema(description = "인증번호 확인을 위한 dto")
public class EmailCodeReqDto {
    @Schema(description = "이메일")
    @NotBlank(message="이메일을 입력해주세요.")
    @Email(message = "올바른 이메일 형식을 입력해주세요.")
    private String email;
    private String code;
}
