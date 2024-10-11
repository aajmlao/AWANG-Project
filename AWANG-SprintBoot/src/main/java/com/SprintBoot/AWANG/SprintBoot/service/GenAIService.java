package com.SprintBoot.AWANG.SprintBoot.service;

import com.SprintBoot.AWANG.SprintBoot.controller.ChatRequest;

public interface GenAIService {
    String getResponse(ChatRequest request);
}
