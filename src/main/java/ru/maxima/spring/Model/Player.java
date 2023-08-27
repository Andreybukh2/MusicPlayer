package ru.maxima.spring.Intrfaces.Model;

import ru.maxima.spring.Intrfaces.Music;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    public Music music;
    private List<Music> listOfMusic;
    public void playMusic() {
        listOfMusic.forEach(forElements -> System.out.println(forElements.getSong()));
    }
}
