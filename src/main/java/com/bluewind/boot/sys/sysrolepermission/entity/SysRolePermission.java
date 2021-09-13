package com.bluewind.boot.sys.sysrolepermission.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author liuxingyu01
 * @date 2021-01-07-22:45
 **/
public class SysRolePermission {

    private Integer id;

    private String roleId;

    private String permissionId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public String getRoleId() {
        return roleId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        return "SysRolePermission{" +
                "id=" + id +
                ", roleId='" + roleId + '\'' +
                ", permissionId='" + permissionId + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
