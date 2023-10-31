package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.request.DummyRequest;
import com.example.demo.dto.response.DummyResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DummyServiceImpl implements DummyService {

    @Override
    public DummyResponse dummyServiceFunction(DummyRequest dummyRequest) {
	 return DummyResponse.builder().
		 newAmount(dummyRequest.getAmount() + 2000).
		 build();
    }
}
