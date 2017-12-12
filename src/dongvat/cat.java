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
public class cat extends Dongvat
{
    private int chanmeo;
    private String moe;

        public cat()
        {

        }
public cat (int chanmeo, String moe)
{
    this.chanmeo = chanmeo;
    this.moe = moe;
}
public cat (String name,String moe, int chan, int chanmeo)
{
    super(name, chan);
    this.chanmeo = chanmeo;
    this.moe = moe;
}
    public int getChanmeo() {
        return chanmeo;
    }

    public void setChanmeo(int chanmeo) {
        this.chanmeo = chanmeo;
    }

    public String getMoe() {
        return moe;
    }

    public void setMoe(String moe) {
        this.moe = moe;
    }
    @Override
    public int SoChan()
  {
      return chanmeo;
  }
    @Override
    public String Ten()
{
    return moe;
}
}