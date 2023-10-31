package com.example.demo.service;

import com.example.demo.dto.request.DummyRequest;
import com.example.demo.dto.response.DummyResponse;

public interface DummyService {

    DummyResponse dummyServiceFunction(DummyRequest dummyRequest);
}
