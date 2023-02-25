package com.user.service.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.net.http.HttpClient;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse {
    private String message;
    private boolean success;
    private HttpStatus status;

}
