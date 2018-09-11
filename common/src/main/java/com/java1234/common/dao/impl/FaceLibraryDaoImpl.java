package com.java1234.common.dao.impl;

import com.java1234.common.dao.FaceLibraryDao;
import com.java1234.common.dao.impl.mapper.FaceLibraryMapper;
import com.java1234.common.entity.FaceLibrary;
import com.java1234.common.entity.FaceLibraryExample;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FaceLibraryDaoImpl implements FaceLibraryDao {
    @Autowired
    private FaceLibraryMapper faceLibraryMapper;

    public int insert(FaceLibrary record) {
        return this.faceLibraryMapper.insert(record);
    }

    public int save(FaceLibrary record) {
        return this.faceLibraryMapper.insertSelective(record);
    }

    public int deleteByExample(FaceLibraryExample example) {
        return this.faceLibraryMapper.deleteByExample(example);
    }

    public int deleteById(Long id) {
        return this.faceLibraryMapper.deleteByPrimaryKey(id);
    }

    public int updateById(FaceLibrary record) {
        return this.faceLibraryMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(FaceLibrary record) {
        return this.faceLibraryMapper.updateByPrimaryKey(record);
    }

    public int updateByExampleSelective(FaceLibrary record, FaceLibraryExample example) {
        return this.faceLibraryMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(FaceLibrary record, FaceLibraryExample example) {
        return this.faceLibraryMapper.updateByExample(record, example);
    }

    public List<FaceLibrary> listByExample(FaceLibraryExample example) {
        return this.faceLibraryMapper.selectByExample(example);
    }

    public FaceLibrary getById(Long id) {
        return this.faceLibraryMapper.selectByPrimaryKey(id);
    }

    public int countByExample(FaceLibraryExample example) {
        return this.faceLibraryMapper.countByExample(example);
    }

   }