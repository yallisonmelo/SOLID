package br.com.yfsmsystem.liskovubstitution.problem;

public class WhatsApp  implements SocialMedia{
    @Override
    public void chatWithFriend() {
        //applicable
    }

    @Override
    public void publishPost(Object post) {
        //Not Applicable
        //The Whatsapp does not implement publishPost
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
