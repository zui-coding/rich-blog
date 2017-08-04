package com.zuicoding.platform.blog.dao;

import com.zuicoding.platform.blog.modal.WpUser;
import com.zuicoding.platform.blog.modal.WpUsersKey;
import org.apache.ibatis.annotations.Param;

public interface WpUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_users
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    int deleteByPrimaryKey(WpUsersKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_users
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    int insert(WpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_users
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    int insertSelective(WpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_users
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    WpUser selectByPrimaryKey(WpUsersKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_users
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    int updateByPrimaryKeySelective(WpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_users
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    int updateByPrimaryKey(WpUser record);

    WpUser selectUserByUserNameAndPassword(@Param("userName")String userName,
                                           @Param("password")String password
                                           );
}