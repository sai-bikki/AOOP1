package Music;

//Bridge Pattern: Separate abstraction (MusicPlayer) from implementation (MusicSource)
class MusicPlayer {
 private MusicSource musicSource;

 public MusicPlayer(MusicSource musicSource) {
     this.musicSource = musicSource;
 }

 public void play() {
     musicSource.play();
 }
}
