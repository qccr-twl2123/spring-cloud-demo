package com.java1234.service;

import com.java1234.common.dao.impl.mapper.FaceLibraryMapper;
import com.java1234.common.entity.FaceLibrary;
import com.java1234.common.entity.FaceLibraryExample;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaceLibraryService {

    @Autowired
    private FaceLibraryMapper faceLibraryMapper;

    public List<FaceLibrary> queryForList(String name){
        FaceLibraryExample example = new FaceLibraryExample();
        example.setOrderByClause("id desc");
        FaceLibraryExample.Criteria c = example.createCriteria();
        if(StringUtils.isNotBlank(name)){
            c.andNameEqualTo(name);
        }
        return  faceLibraryMapper.selectByExample(example);
    }
}
