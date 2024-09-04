package com.example.demo.service;

import com.example.demo.model.FastApiRequest;
import com.example.demo.model.FastApiResponse;
import reactor.core.publisher.Mono;

public interface CallFastApiService {

    Mono<FastApiResponse> QueryFastApi(FastApiRequest fastApiRequest);
}
