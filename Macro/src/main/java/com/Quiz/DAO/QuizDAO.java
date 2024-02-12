package com.Quiz.DAO;

import com.Quiz.DTO.QuizDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuizDAO {
    @Autowired
    SqlSessionTemplate sqlSession;

    String namespace="com.Quiz";

    public QuizDTO load_quiz(String stageNum){
        return sqlSession.selectOne(namespace+".load_quiz",stageNum);
    }

}
