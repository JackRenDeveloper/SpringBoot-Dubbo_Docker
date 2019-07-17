package com.elvis.entity.user;

import java.io.Serializable;
import java.util.List;

/**
 * @Author JackRen
 * @Date 2019/07/17 上午10:59
 */
public class ArticleEntity implements Serializable {

    private String id;
    private String title;
    private String content;
    private com.elvis.entity.user.UserEntity userEntity;
    private List<com.elvis.entity.user.CommentEntity> commentEntityList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public com.elvis.entity.user.UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public List<CommentEntity> getCommentEntityList() {
        return commentEntityList;
    }

    public void setCommentEntityList(List<CommentEntity> commentEntityList) {
        this.commentEntityList = commentEntityList;
    }

    @Override
    public String toString() {
        return "ArticleEntity{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", userEntity=" + userEntity +
                ", commentEntityList=" + commentEntityList +
                '}';
    }
}
