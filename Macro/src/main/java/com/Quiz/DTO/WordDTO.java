package com.Quiz.DTO;

public class WordDTO {
    //단어 패키지 넘버
    int wordStage=0;
    String wordContent="";

    String wordSoundUrl="";

    public WordDTO(int wordStage, String wordContent, String wordSoundUrl) {
        this.wordStage = wordStage;
        this.wordContent = wordContent;
        this.wordSoundUrl = wordSoundUrl;
    }

    public int getWordStage() {
        return wordStage;
    }

    public void setWordStage(int wordStage) {
        this.wordStage = wordStage;
    }

    public String getWordContent() {
        return wordContent;
    }

    public void setWordContent(String wordContent) {
        this.wordContent = wordContent;
    }

    public String getWordSoundUrl() {
        return wordSoundUrl;
    }

    public void setWordSoundUrl(String wordSoundUrl) {
        this.wordSoundUrl = wordSoundUrl;
    }
}
