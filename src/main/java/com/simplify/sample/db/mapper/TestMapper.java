package com.simplify.sample.db.mapper;

import com.simplify.sample.db.dto.*;

import java.util.HashMap;
import java.util.List;

public interface TestMapper {
    public List<Test> getAll() throws Exception;
    void insertMainList(memberVO map) throws Exception;
    int checkUserInfo(memberVO map) throws Exception;
    void insertContent(contentVO con) throws Exception;
    List<contentVO> getAllContent() throws Exception;
    List<allcontentVO> getContent() throws Exception;
    contentVO getContentDetail(contentVO con) throws Exception;
    List<contentVO>  findContentById(contentVO con) throws Exception;
    void updateContent(contentVO con) throws Exception;
    void insertCommnet(commentVO con) throws Exception;
    List<commentVO> findCommentsByBoardId(contentVO con) throws Exception;
    void deleteContentById(int con) throws Exception;
    List<contentVO> searchContentByWriter(String id) throws Exception;
    List<contentVO> searchContentByContentWord(String word) throws Exception;
    List<contentVO> searchContentByContentWordTestVer(contentVO con) throws Exception;



}
