package Music;

class VolumeControlDecorator extends MusicPlayerDecorator {
    private int volume;

    public VolumeControlDecorator(MusicPlayer player, int volume) {
        super(player);
        this.volume = volume;
    }

    @Override
    public void play() {
        System.out.println("Setting volume to: " + volume);
        super.play();
    }
}
