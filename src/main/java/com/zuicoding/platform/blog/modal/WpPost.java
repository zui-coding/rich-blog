package com.zuicoding.platform.blog.modal;

import java.util.Date;

public class WpPost extends WpPostKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_post.post_author
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private Long postAuthor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_post.post_date
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private Date postDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_post.post_date_gmt
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private Date postDateGmt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_post.post_status
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private String postStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_post.comment_status
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private String commentStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_post.ping_status
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private String pingStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_post.post_password
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private String postPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_post.post_name
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private String postName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_post.post_modified
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private Date postModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_post.post_modified_gmt
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private Date postModifiedGmt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_post.post_parent_id
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private Long postParentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_post.guid
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private String guid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_post.menu_order
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private Integer menuOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_post.post_type
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private String postType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_post.post_mime_type
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private String postMimeType;

    private String postTitle;

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_post.comment_count
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private Long commentCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_post.post_author
     *
     * @return the value of wp_post.post_author
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public Long getPostAuthor() {
        return postAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_post.post_author
     *
     * @param postAuthor the value for wp_post.post_author
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setPostAuthor(Long postAuthor) {
        this.postAuthor = postAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_post.post_date
     *
     * @return the value of wp_post.post_date
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public Date getPostDate() {
        return postDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_post.post_date
     *
     * @param postDate the value for wp_post.post_date
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_post.post_date_gmt
     *
     * @return the value of wp_post.post_date_gmt
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public Date getPostDateGmt() {
        return postDateGmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_post.post_date_gmt
     *
     * @param postDateGmt the value for wp_post.post_date_gmt
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setPostDateGmt(Date postDateGmt) {
        this.postDateGmt = postDateGmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_post.post_status
     *
     * @return the value of wp_post.post_status
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public String getPostStatus() {
        return postStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_post.post_status
     *
     * @param postStatus the value for wp_post.post_status
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus == null ? null : postStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_post.comment_status
     *
     * @return the value of wp_post.comment_status
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public String getCommentStatus() {
        return commentStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_post.comment_status
     *
     * @param commentStatus the value for wp_post.comment_status
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus == null ? null : commentStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_post.ping_status
     *
     * @return the value of wp_post.ping_status
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public String getPingStatus() {
        return pingStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_post.ping_status
     *
     * @param pingStatus the value for wp_post.ping_status
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus == null ? null : pingStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_post.post_password
     *
     * @return the value of wp_post.post_password
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public String getPostPassword() {
        return postPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_post.post_password
     *
     * @param postPassword the value for wp_post.post_password
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setPostPassword(String postPassword) {
        this.postPassword = postPassword == null ? null : postPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_post.post_name
     *
     * @return the value of wp_post.post_name
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public String getPostName() {
        return postName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_post.post_name
     *
     * @param postName the value for wp_post.post_name
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_post.post_modified
     *
     * @return the value of wp_post.post_modified
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public Date getPostModified() {
        return postModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_post.post_modified
     *
     * @param postModified the value for wp_post.post_modified
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setPostModified(Date postModified) {
        this.postModified = postModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_post.post_modified_gmt
     *
     * @return the value of wp_post.post_modified_gmt
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public Date getPostModifiedGmt() {
        return postModifiedGmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_post.post_modified_gmt
     *
     * @param postModifiedGmt the value for wp_post.post_modified_gmt
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setPostModifiedGmt(Date postModifiedGmt) {
        this.postModifiedGmt = postModifiedGmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_post.post_parent_id
     *
     * @return the value of wp_post.post_parent_id
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public Long getPostParentId() {
        return postParentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_post.post_parent_id
     *
     * @param postParentId the value for wp_post.post_parent_id
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setPostParentId(Long postParentId) {
        this.postParentId = postParentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_post.guid
     *
     * @return the value of wp_post.guid
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public String getGuid() {
        return guid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_post.guid
     *
     * @param guid the value for wp_post.guid
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_post.menu_order
     *
     * @return the value of wp_post.menu_order
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public Integer getMenuOrder() {
        return menuOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_post.menu_order
     *
     * @param menuOrder the value for wp_post.menu_order
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_post.post_type
     *
     * @return the value of wp_post.post_type
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public String getPostType() {
        return postType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_post.post_type
     *
     * @param postType the value for wp_post.post_type
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setPostType(String postType) {
        this.postType = postType == null ? null : postType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_post.post_mime_type
     *
     * @return the value of wp_post.post_mime_type
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public String getPostMimeType() {
        return postMimeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_post.post_mime_type
     *
     * @param postMimeType the value for wp_post.post_mime_type
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setPostMimeType(String postMimeType) {
        this.postMimeType = postMimeType == null ? null : postMimeType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_post.comment_count
     *
     * @return the value of wp_post.comment_count
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public Long getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_post.comment_count
     *
     * @param commentCount the value for wp_post.comment_count
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }
}