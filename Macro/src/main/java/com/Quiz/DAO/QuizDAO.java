package com.Quiz.DAO;

import com.Quiz.DTO.QuizDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QuizDAO {
    @Autowired
    SqlSessionTemplate sqlSession;

    String namespace="com.Comment";

    public void insert_comment(QuizDTO quizDto){
        sqlSession.insert(namespace+".insert_comment", quizDto);
        sqlSession.update(namespace+".update_comment_plus", quizDto.getArticle_id());
    }

    public QuizDTO select_comment(int comment_id){
        QuizDTO quizDto =new QuizDTO();
        quizDto =sqlSession.selectOne(namespace+".select_comment",comment_id);
        return quizDto;
    }

    public void delete_comment(QuizDTO quizDto){
        sqlSession.delete(namespace+".delete_comment", quizDto.getComment_id());
        sqlSession.update(namespace+".update_comment_minus", quizDto.getArticle_id());
    }

}
