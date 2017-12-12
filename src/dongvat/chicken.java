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
public class chicken extends Dongvat {
       private int changa;
    private String ga;

        public chicken()
        {

        }
public chicken (int changa,String ga)
{
    this.changa = changa;
    this.ga = ga;
}
public chicken (String name, String ga, int chan, int changa)
{
    super(name, chan);
    this.changa = changa;
    this.ga = ga;
}
    public int getChanga() {
        return changa;
    }

    public void setChanga(int chanmeo) {
        this.changa = changa;
    }

    public String getGa() {
        return ga;
    }

    public void setGa(String ga) {
        this.ga = ga;
    }
    public int Sochan()
  {
      return changa;
  }
public String Ten()
{
    return ga;
}

    @Override
    public int SoChan() {
        return changa;
    }
    public String ga()
    {
        return ga;
    }
}
