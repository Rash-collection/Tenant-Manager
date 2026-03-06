/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mats;

import graphicker.Kolor;
import static graphicker.MageCons.printOn;
import static graphicker.MageCons.toImage;
import java.awt.image.BufferedImage;

/**
 *
 * @author rash4
 */
public final class Mages implements main.InitInOrder{
    private Mages(int res){
        if(res < 1 || res >= 5) throw new IllegalArgumentException();
        this.RESOLUTION = res;
    }
    @Override public void initialize(){
        this.list = this.constructImages();
    }
    private BufferedImage[] constructImages(){
        final int sqr = main.Generals.SQR * this.RESOLUTION;
        final int haf = sqr/2, qua = haf/2, eit = qua/2;
        final int dub = sqr*2, sub = dub*2;
        final var recto = toImage(()->{
            final var grit = new int[dub][dub];
            for(int row = 0; row < dub; row++){
                for(int col = 0; col < dub; col++){
                    grit[row][col] = Kolor.OLIVE;
                }
            }
            
            return grit;
        });
        final var lst = new BufferedImage[]{recto};
        return lst;
    }
    public BufferedImage getImage(int i){
        final int max = this.list.length;
        @annot.Description("never out of bounds, hence no 'throws' errors.")
        final int dex = ((i%max)+max)%max;
        return this.list[dex];
    }
    private int RESOLUTION;
    private BufferedImage[] list;
    
    public static Mages m(){return MAGA;}
    private final static Mages MAGA;
    static {
        MAGA = new Mages(1);
    }
}