package com.zuicoding.platform.blog.modal;

import java.util.Date;

public class WpUser extends WpUsersKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_users.user_login
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private String userLogin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_users.user_pass
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private String userPass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_users.user_nicename
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private String userNicename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_users.user_email
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private String userEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_users.user_url
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private String userUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_users.user_registered
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private Date userRegistered;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_users.user_activation_key
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private String userActivationKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_users.user_status
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private Integer userStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_users.display_name
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private String displayName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_users.user_login
     *
     * @return the value of wp_users.user_login
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public String getUserLogin() {
        return userLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_users.user_login
     *
     * @param userLogin the value for wp_users.user_login
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin == null ? null : userLogin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_users.user_pass
     *
     * @return the value of wp_users.user_pass
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_users.user_pass
     *
     * @param userPass the value for wp_users.user_pass
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_users.user_nicename
     *
     * @return the value of wp_users.user_nicename
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public String getUserNicename() {
        return userNicename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_users.user_nicename
     *
     * @param userNicename the value for wp_users.user_nicename
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setUserNicename(String userNicename) {
        this.userNicename = userNicename == null ? null : userNicename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_users.user_email
     *
     * @return the value of wp_users.user_email
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_users.user_email
     *
     * @param userEmail the value for wp_users.user_email
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_users.user_url
     *
     * @return the value of wp_users.user_url
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public String getUserUrl() {
        return userUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_users.user_url
     *
     * @param userUrl the value for wp_users.user_url
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl == null ? null : userUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_users.user_registered
     *
     * @return the value of wp_users.user_registered
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public Date getUserRegistered() {
        return userRegistered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_users.user_registered
     *
     * @param userRegistered the value for wp_users.user_registered
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setUserRegistered(Date userRegistered) {
        this.userRegistered = userRegistered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_users.user_activation_key
     *
     * @return the value of wp_users.user_activation_key
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public String getUserActivationKey() {
        return userActivationKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_users.user_activation_key
     *
     * @param userActivationKey the value for wp_users.user_activation_key
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setUserActivationKey(String userActivationKey) {
        this.userActivationKey = userActivationKey == null ? null : userActivationKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_users.user_status
     *
     * @return the value of wp_users.user_status
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_users.user_status
     *
     * @param userStatus the value for wp_users.user_status
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_users.display_name
     *
     * @return the value of wp_users.display_name
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_users.display_name
     *
     * @param displayName the value for wp_users.display_name
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }
}