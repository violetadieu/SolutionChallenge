package com.Quiz.DAO;

import com.Quiz.DTO.QuizDTO;
import com.Quiz.DTO.WordDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class QuizDAO {
    @Autowired
    SqlSessionTemplate sqlSession;

    String namespace="com.Quiz";

    public QuizDTO load_quiz(String stageNum){
        QuizDTO quizDTO=null;
        ArrayList<WordDTO> tmp=new ArrayList<WordDTO>();

        tmp.addAll(sqlSession.selectList(namespace+".load_word",stageNum));
        quizDTO=sqlSession.selectOne(namespace+".load_quiz",stageNum);

        quizDTO.setWords(tmp);
        return quizDTO;
    }

}
