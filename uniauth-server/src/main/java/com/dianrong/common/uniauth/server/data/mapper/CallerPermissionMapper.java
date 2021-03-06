package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.CallerPermission;
import com.dianrong.common.uniauth.server.data.entity.CallerPermissionExample;
import java.util.List;

import com.dianrong.common.uniauth.server.support.audit.MapperAudit;
import org.apache.ibatis.annotations.Param;

@MapperAudit
public interface CallerPermissionMapper {

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * caller_permission
   *
   * @mbggenerated Mon Jan 23 17:45:27 CST 2017
   */
  int countByExample(CallerPermissionExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * caller_permission
   *
   * @mbggenerated Mon Jan 23 17:45:27 CST 2017
   */
  int deleteByExample(CallerPermissionExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * caller_permission
   *
   * @mbggenerated Mon Jan 23 17:45:27 CST 2017
   */
  int insert(CallerPermission record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * caller_permission
   *
   * @mbggenerated Mon Jan 23 17:45:27 CST 2017
   */
  int insertSelective(CallerPermission record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * caller_permission
   *
   * @mbggenerated Mon Jan 23 17:45:27 CST 2017
   */
  List<CallerPermission> selectByExample(CallerPermissionExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * caller_permission
   *
   * @mbggenerated Mon Jan 23 17:45:27 CST 2017
   */
  int updateByExampleSelective(@Param("record") CallerPermission record,
      @Param("example") CallerPermissionExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * caller_permission
   *
   * @mbggenerated Mon Jan 23 17:45:27 CST 2017
   */
  int updateByExample(@Param("record") CallerPermission record,
      @Param("example") CallerPermissionExample example);
}
