/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
/**
 *
 * @author gudar
 */

//Objeto responsavel pela reproducao dos sons
public class Sound {
    
    
    static private Clip clip ;
    int tipo;
    
    public Sound() {
        
        
    }
    public Sound(int a) {
        tipo = a;
        
    }

    void playSound() {
    try {
        clip = AudioSystem.getClip();
        switch (tipo){//classifica qual faixa deve ser carregada
            case 1:
                File Heart = new File("Heart.wav");
                clip.open(AudioSystem.getAudioInputStream(Heart));
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                break;
            case 2:
                File Lungs = new File("Lungs.wav");
                clip.open(AudioSystem.getAudioInputStream(Lungs));
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                break;
            case 3:
                File Velcro = new File("Velcro.wav");
                clip.open(AudioSystem.getAudioInputStream(Velcro));
                break;
            case 4:
                File Velcro1 = new File("Velcro1.wav");
                clip.open(AudioSystem.getAudioInputStream(Velcro1));
                break;
        }
        
        
        clip.start();
        
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    }
}

    public void closesound(){
        if(clip != null){
                clip.close();
                clip = null;
            }
    }
}
