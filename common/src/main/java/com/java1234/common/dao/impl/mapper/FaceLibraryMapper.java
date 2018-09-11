package com.java1234.common.dao.impl.mapper;

import com.java1234.common.entity.FaceLibrary;
import com.java1234.common.entity.FaceLibraryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface FaceLibraryMapper {
    int countByExample(FaceLibraryExample example);

    int deleteByExample(FaceLibraryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FaceLibrary record);

    int insertSelective(FaceLibrary record);

    List<FaceLibrary> selectByExampleWithBLOBs(FaceLibraryExample example);

    List<FaceLibrary> selectByExample(FaceLibraryExample example);

    FaceLibrary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FaceLibrary record, @Param("example") FaceLibraryExample example);

    int updateByExampleWithBLOBs(@Param("record") FaceLibrary record, @Param("example") FaceLibraryExample example);

    int updateByExample(@Param("record") FaceLibrary record, @Param("example") FaceLibraryExample example);

    int updateByPrimaryKeySelective(FaceLibrary record);

    int updateByPrimaryKeyWithBLOBs(FaceLibrary record);

    int updateByPrimaryKey(FaceLibrary record);
}