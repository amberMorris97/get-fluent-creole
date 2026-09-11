package com.example.getfluentcreole.dto.request;

import com.example.getfluentcreole.models.FlashcardStatus;

public class UserFlashcardRequestDTO {
    private int userId;
    private int phraseId;
    private FlashcardStatus status;

    public UserFlashcardRequestDTO() {}

    public UserFlashcardRequestDTO(int userId, int phraseId, FlashcardStatus status) {
        this.userId = userId;
        this.phraseId = phraseId;
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPhraseId() {
        return phraseId;
    }

    public void setPhraseId(int phraseId) {
        this.phraseId = phraseId;
    }

    public FlashcardStatus getStatus() {
        return status;
    }

    public void setStatus(FlashcardStatus status) {
        this.status = status;
    }
}
