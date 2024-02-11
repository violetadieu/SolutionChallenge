package com.Quiz.DTO;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class QuizDTO {

    int stage=0;
    WordDTO[] words=new WordDTO[300];


    public QuizDTO(int stage, WordDTO[] words) {
        this.stage = stage;
        this.words = words;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public WordDTO[] getWords() {
        return words;
    }

    public void setWords(WordDTO[] words) {
        this.words = words;
    }

}
