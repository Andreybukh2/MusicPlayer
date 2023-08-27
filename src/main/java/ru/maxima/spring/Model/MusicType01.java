package ru.maxima.spring.Intrfaces.Model;

import ru.maxima.spring.Intrfaces.Music;
import lombok.Data;

@Data
public class MusicType01 implements Music {
    private String name;
    public MusicType01(){
        System.out.println("Это музыкальный тип01");
    }
    @Override
    public String getSong() {
        return "Песня из музыкального типа01";
    }
}
