package br.com.yfsmsystem.liskovubstitution.problem;

public class Facebook implements SocialMedia{

    //The Facebook implements all methods from the interface Social Media
    @Override
    public void chatWithFriend() {
        //applicable
    }

    @Override
    public void publishPost(Object post) {
        //applicable
    }

    @Override
    public void sendPhotosAndVideos() {
        //applicable
    }

    @Override
    public void groupVideoCall(String... users) {
        //applicable
    }
}
