package com.Story.Controller;


import com.Story.DAO.StoryDAO;
import com.Story.DTO.StoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class StoryController {

    @Autowired
    StoryDAO storyDAO;

    //퀴즈 로드
    @RequestMapping(value = "/story/load", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> comment_insert(@RequestParam("storyTitle") String storyTitle){
        Map<String, Object> map = new HashMap<String, Object>();
        StoryDTO storyDTO =null;
        try {
            storyDTO=storyDAO.load_story(storyTitle);
            map.put("content",storyDTO);
            map.put("result","complete");
        } catch (Exception e) {
            map.put("result","fail");
            e.printStackTrace();
        }
        return map;
    }

}
