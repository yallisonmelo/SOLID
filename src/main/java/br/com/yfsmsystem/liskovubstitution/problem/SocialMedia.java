package br.com.yfsmsystem.liskovubstitution.problem;

public interface SocialMedia {

    public abstract  void chatWithFriend();

    public abstract void publishPost(Object post);

    public abstract  void sendPhotosAndVideos();

    public abstract  void groupVideoCall(String... users);
}
