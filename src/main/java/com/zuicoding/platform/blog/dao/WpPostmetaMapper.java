package com.zuicoding.platform.blog.dao;

import com.zuicoding.platform.blog.modal.WpPostmeta;

import java.util.List;

public interface WpPostmetaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_postmeta
     *
     * @mbg.generated Fri Jul 14 15:17:38 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_postmeta
     *
     * @mbg.generated Fri Jul 14 15:17:38 CST 2017
     */
    int insert(WpPostmeta record);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_postmeta
     *
     * @mbg.generated Fri Jul 14 15:17:38 CST 2017
     */
    List<WpPostmeta> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_postmeta
     *
     * @mbg.generated Fri Jul 14 15:17:38 CST 2017
     */
    int updateByPrimaryKey(WpPostmeta record);
}