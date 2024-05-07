package br.com.jornadaMilhas.dto;

import jakarta.validation.constraints.NotBlank;

public record UserProfileDto(
        byte[] userPicture,
        @NotBlank
        String userName,
        String comment) {
}
