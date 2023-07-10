package br.com.yfsmsystem.liskovubstitution.solution;

public class WhatsApp implements SocialMedia,VideoCallManager {
    @Override
    public void chatWithFriend() {
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
