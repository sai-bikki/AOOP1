package Music;

class LocalFileAdapter implements MusicSource {
    private String filePath;

    public LocalFileAdapter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void play() {
        System.out.println("Playing local file: " + filePath);
    }
}

