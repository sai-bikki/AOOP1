package Music;

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // Local File Source
        MusicSource localFile = new LocalFileAdapter("C:\\Users\\ADMIN\\Downloads\\Song.mp3");
        MusicPlayer player = new MusicPlayer(localFile);

        // Adding Equalizer and Volume Control
        Map<String, Integer> eqSettings = new HashMap<>();
        eqSettings.put("bass", 70);
        eqSettings.put("treble", 50);

        MusicPlayer playerWithEqualizer = new EqualizerDecorator(player, eqSettings);
        MusicPlayer playerWithVolume = new VolumeControlDecorator(playerWithEqualizer, 80);

        System.out.println("--- Playing Local File with Enhancements ---");
        playerWithVolume.play();
    }
}
