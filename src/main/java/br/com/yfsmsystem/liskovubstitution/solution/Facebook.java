package br.com.yfsmsystem.liskovubstitution.solution;

import br.com.yfsmsystem.liskovubstitution.problem.SocialMedia;

public class Facebook implements SocialMedia,SocialPostAndMediaManager,VideoCallManager {
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
