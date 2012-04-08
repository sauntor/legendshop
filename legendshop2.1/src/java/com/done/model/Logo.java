package com.done.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * Logo generated by MyEclipse Persistence Tools
 */

public class Logo implements java.io.Serializable {

    // Fields
    private MultipartFile file;

    private Integer id;

    private String banner;

    private String url;

    private String userId;

    private String userName;

    private String memo;

    // Constructors

    /** default constructor */
    public Logo() {
    }

    /** minimal constructor */
    public Logo(Integer id) {
        this.id = id;
    }

    /** full constructor */
    public Logo(Integer id, String banner, String url, String userId, String userName) {
        this.id = id;
        this.banner = banner;
        this.url = url;
        this.userId = userId;
        this.userName = userName;
    }

    // Property accessors

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBanner() {
        return this.banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

}