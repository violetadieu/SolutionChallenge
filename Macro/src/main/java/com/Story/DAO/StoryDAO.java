package com.Story.DAO;

import com.Story.DTO.StoryDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StoryDAO {
    @Autowired
    SqlSessionTemplate sqlSession;

    String namespace="com.Story";

    public StoryDTO load_story(String storyTitle){
        return sqlSession.selectOne(namespace+".load_story",storyTitle);
    }
    
}
