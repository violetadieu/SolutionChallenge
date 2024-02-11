package com.Quiz.DTO;

public class WordDTO {
    //단어 패키지 넘버
    int package_num=0;
    String content="";

    String pronounce_file_url="";

    public WordDTO(int package_num, String content, String pronounce_file_url) {
        this.package_num = package_num;
        this.content = content;
        this.pronounce_file_url = pronounce_file_url;
    }

    public int getPackage_num() {
        return package_num;
    }

    public void setPackage_num(int package_num) {
        this.package_num = package_num;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPronounce_file_url() {
        return pronounce_file_url;
    }

    public void setPronounce_file_url(String pronounce_file_url) {
        this.pronounce_file_url = pronounce_file_url;
    }
}
