package com.corry.biolearning.Shareclass;

public class ForumModel {

    public String getEmailPoster() {
        return emailPoster;
    }

    public void setEmailPoster(String emailPoster) {
        this.emailPoster = emailPoster;
    }

    public String getMessagePoster() {
        return messagePoster;
    }

    public void setMessagePoster(String messagePoster) {
        this.messagePoster = messagePoster;
    }

    String emailPoster;
    String messagePoster;

    public ForumModel(){

    }

    public ForumModel(String emailPoster , String messagePoster){

        this.emailPoster = emailPoster;
        this.messagePoster = messagePoster;
    }





}
