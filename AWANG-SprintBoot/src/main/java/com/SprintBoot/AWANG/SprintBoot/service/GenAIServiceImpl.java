package com.SprintBoot.AWANG.SprintBoot.service;

import com.SprintBoot.AWANG.SprintBoot.controller.ChatRequest;
import dev.langchain4j.model.openai.OpenAiChatModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenAIServiceImpl implements GenAIService{
    @Value("${openai.api-key}")
    String apiKey;
    @Value("${model}")
    String modelName;

    @Override
    public String getResponse(ChatRequest request) {
        var model = OpenAiChatModel.builder()
                .apiKey(apiKey)
                .modelName(modelName)
                .build();

        return model.generate(request.question());
    }
}
