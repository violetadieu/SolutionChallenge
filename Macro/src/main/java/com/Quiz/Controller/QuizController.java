package com.Quiz.Controller;

import com.Quiz.DAO.QuizDAO;
import com.Quiz.DTO.QuizDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class QuizController {

    @Autowired
    QuizDAO quizDAO;

    //퀴즈 로드
    @RequestMapping(value = "/quiz/load", method = RequestMethod.PUT)
    @ResponseBody
    public Map<String,Object> comment_insert(@RequestParam("stageNum") String stageNum){
        Map<String, Object> map = new HashMap<String, Object>();
        QuizDTO quizDto =null;
        try {
            quizDto=quizDAO.load_quiz(stageNum);
            map.put("content",quizDto);
            map.put("result","complete");
        } catch (Exception e) {
            map.put("result","fail");
            e.printStackTrace();
        }
        return map;
    }


}
