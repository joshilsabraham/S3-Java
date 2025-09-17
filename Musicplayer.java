package jxh;

interface Media{
	void play();
	void stop();
	default void pause() { 
		System.out.println("Media Paused")
	}
	static void about() {
		System.out.println("This is a Media Interface")
	}
}

interface AdvancedMedia extends Media {
	void nextTrack();
}

class Music implements AdvancedMedia {
	public void play() {
		System.out.println("Playback Resumed");
	}
	stop nextTrack
	pause()
}

public class MusicPlayer{
	MusicPlayer
	play()
	pause()
	nextTrack()
	stop()
	about()

}
