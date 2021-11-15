package com.bluewind.boot.module.sys.sysidtable.mapper;

import com.bluewind.boot.module.sys.sysidtable.entity.SysIdTable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author liuxingyu01
 * @date 2021-04-05-21:48
 **/
@Repository
public interface SysIdTableMapper {

    List<SysIdTable> getSysIdTableList(Map<String, String> map);

    Integer checkExistByIdCode(String idCode);

    int addOneIdTable(SysIdTable sysIdTable);

    int deleteOne(String idId);

    SysIdTable getOneIdTable(String idId);

    int updateIdTable(SysIdTable sysIdTable);
}
