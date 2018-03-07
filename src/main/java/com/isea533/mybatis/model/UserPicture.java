package com.isea533.mybatis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CW_GE_USER_PICTURE")
public class UserPicture {
    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Id
    @Column(name = "PICTURE_NAME")
    private String pictureName;

    @Column(name = "ID")
    private String id;

    @Column(name = "FEATURE")
    private String feature;

    @Column(name = "MD5")
    private String md5;

    @Column(name = "FACE_ID")
    private String faceId;

    @Column(name = "ADD_TIME")
    private Date addTime;

    @Column(name = "PICTURE_INDEX")
    private Short pictureIndex;

    /**
     * @return USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return PICTURE_NAME
     */
    public String getPictureName() {
        return pictureName;
    }

    /**
     * @param pictureName
     */
    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return FEATURE
     */
    public String getFeature() {
        return feature;
    }

    /**
     * @param feature
     */
    public void setFeature(String feature) {
        this.feature = feature;
    }

    /**
     * @return MD5
     */
    public String getMd5() {
        return md5;
    }

    /**
     * @param md5
     */
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /**
     * @return FACE_ID
     */
    public String getFaceId() {
        return faceId;
    }

    /**
     * @param faceId
     */
    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    /**
     * @return ADD_TIME
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * @param addTime
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * @return PICTURE_INDEX
     */
    public Short getPictureIndex() {
        return pictureIndex;
    }

    /**
     * @param pictureIndex
     */
    public void setPictureIndex(Short pictureIndex) {
        this.pictureIndex = pictureIndex;
    }
}