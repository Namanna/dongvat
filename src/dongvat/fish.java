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
public class fish extends Dongvat{
    private int chanca;
    private String fish;
    
public fish()
    {
        
    }
public fish ( int chanca, String fish)
{
    this.chanca = chanca;
    this.fish = fish;
}
public fish(String name,String fish, int chan, int chanca)
{
    super(name, chan);
    this.chanca = chanca;
    this.fish = fish;
}

    public int getChanca() {
        return chanca;
    }

    public void setChanca(int chanca) {
        this.chanca = chanca;
    }

    public String getFishname() {
        return fish;
    }

    @Override
  public int SoChan()
  {
      return chanca;
  }
    @Override
    public String Ten()
{
    return fish;
}
}
