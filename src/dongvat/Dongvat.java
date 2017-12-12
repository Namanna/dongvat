/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dongvat;

/**
 *
 * @author lenovo
 */
public abstract class Dongvat {
private String name;
private int chan;
    public Dongvat()
{
    
}
   public Dongvat( String name, int chan)
   {
       this.name = name;
       this.chan = chan;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChan() {
        return chan;
    }

    public void setChan(int chan) {
        this.chan = chan;
    }
   
 public abstract int SoChan();
 public abstract String Ten();
    }
    

