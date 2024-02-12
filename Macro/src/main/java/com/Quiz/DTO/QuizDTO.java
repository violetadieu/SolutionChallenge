package com.Quiz.DTO;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class QuizDTO {

    int stageId;

    int stageStar;

    String stageNum;

    ArrayList<WordDTO>words;

    public QuizDTO(int stageId, int stageStar, String stageNum, ArrayList<WordDTO> words) {
        this.stageId = stageId;
        this.stageStar = stageStar;
        this.stageNum = stageNum;
        this.words = words;
    }

    public int getStageId() {
        return stageId;
    }

    public void setStageId(int stageId) {
        this.stageId = stageId;
    }

    public int getStageStar() {
        return stageStar;
    }

    public void setStageStar(int stageStar) {
        this.stageStar = stageStar;
    }

    public String getStageNum() {
        return stageNum;
    }

    public void setStageNum(String stageNum) {
        this.stageNum = stageNum;
    }

    public ArrayList<WordDTO> getWords() {
        return words;
    }

    public void setWords(ArrayList<WordDTO> words) {
        this.words = words;
    }
}
