package com.Story.DTO;

public class StoryDTO {

    String storyTitle;

    String storyContent;

    int progress;

    String soundUrl;

    public StoryDTO(String storyTitle, String storyContent, int progress, String soundUrl) {
        this.storyTitle = storyTitle;
        this.storyContent = storyContent;
        this.progress = progress;
        this.soundUrl = soundUrl;
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    public String getStoryContent() {
        return storyContent;
    }

    public void setStoryContent(String storyContent) {
        this.storyContent = storyContent;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getSoundUrl() {
        return soundUrl;
    }

    public void setSoundUrl(String soundUrl) {
        this.soundUrl = soundUrl;
    }
}
