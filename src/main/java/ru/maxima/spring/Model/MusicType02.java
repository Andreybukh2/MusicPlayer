package ru.maxima.spring.Intrfaces.Model;

import ru.maxima.spring.Intrfaces.Music;
import lombok.Data;

@Data
public class MusicType02 implements Music {
    private String name;
    public MusicType02(){
        System.out.println("Это музыкальный тип02");
    }
    @Override
    public String getSong() {
        return "Песня из музыкального типа02";
    }
}
