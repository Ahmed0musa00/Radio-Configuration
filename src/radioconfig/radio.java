
package radioconfig;


public class radio {

private int channel;
private int volume;
private String on_off;


public radio()
{
   channel=1;
   volume=50;
   on_off="off";
}


public int change_ch(int chanel)
{
  channel=chanel;
  return channel;
}

public int change_vol(int vol)
{
  volume=vol;
  return  volume;
}
public String change_state(String state)
{
  on_off=state;
  return on_off;
}
    
}
