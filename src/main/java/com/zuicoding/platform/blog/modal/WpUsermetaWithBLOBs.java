package com.zuicoding.platform.blog.modal;

public class WpUsermetaWithBLOBs extends WpUsermeta {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wp_usermeta.meta_value
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    private String metaValue;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wp_usermeta.meta_value
     *
     * @return the value of wp_usermeta.meta_value
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public String getMetaValue() {
        return metaValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wp_usermeta.meta_value
     *
     * @param metaValue the value for wp_usermeta.meta_value
     *
     * @mbg.generated Fri Aug 04 11:24:08 CST 2017
     */
    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue == null ? null : metaValue.trim();
    }
}