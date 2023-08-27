package ru.maxima.spring.Intrfaces.Model;

import ru.maxima.spring.Intrfaces.Music;
import lombok.Data;

@Data
public class MusicType03 implements Music {
    private String name;
    public MusicType03(){
        System.out.println("Это музыкальный тип03");
    }
    @Override
    public String getSong() {
        return "Песня из музыкального типа03";
    }
}
