package com.example.demo.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class ManService {
    private final NameService nameService;

    private String email;
}
