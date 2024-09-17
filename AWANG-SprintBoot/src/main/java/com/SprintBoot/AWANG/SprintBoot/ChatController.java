package com.SprintBoot.AWANG.SprintBoot;

import dev.langchain4j.model.chat.ChatLanguageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    ChatLanguageModel chatLanguageModel;
    @Autowired
    public ChatController(ChatLanguageModel chatLanguageModel) {
        this.chatLanguageModel = chatLanguageModel;
    }
    @GetMapping("/chat")
    public String model(@RequestParam(value = "message", defaultValue = "What is Java Springboot") String message) {
        return chatLanguageModel.generate(message);
    }
}
