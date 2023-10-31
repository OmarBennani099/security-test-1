package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.DummyRequest;
import com.example.demo.dto.response.DummyResponse;
import com.example.demo.service.DummyService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/dummy")
@RequiredArgsConstructor
public class DummyController {

    private final DummyService service;
    
    @PostMapping("/dummy")
    public ResponseEntity<DummyResponse> deposit(@RequestBody DummyRequest request) {
        return ResponseEntity.ok(service.dummyServiceFunction(request));
    }
}
