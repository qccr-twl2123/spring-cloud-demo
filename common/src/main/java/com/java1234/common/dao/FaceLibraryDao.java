package com.java1234.common.dao;

import com.java1234.common.entity.FaceLibrary;
import com.java1234.common.entity.FaceLibraryExample;
import java.util.List;

public interface FaceLibraryDao {
    int insert(FaceLibrary record);

    int save(FaceLibrary record);

    int deleteByExample(FaceLibraryExample example);

    int deleteById(Long id);

    int updateById(FaceLibrary record);

    int updateByPrimaryKey(FaceLibrary record);

    int updateByExampleSelective(FaceLibrary record, FaceLibraryExample example);

    int updateByExample(FaceLibrary record, FaceLibraryExample example);

    FaceLibrary getById(Long id);

    List<FaceLibrary> listByExample(FaceLibraryExample example);

    int countByExample(FaceLibraryExample example);

}