package Chapter8_1;

public class Television implements RemoteControl {
	private int volume;
	
	//turnOn() 
	public void turnOn() {System.out.println("TV를 켭니다.");}	
	
	//turnOff() 
	public void turnOff() {System.out.println("TV를 끕니다.");}
	
	//setVolume()
	public void setVolume(int volume) 
	{
		if(volume>RemoteControl.MAX_VOLUME) 
		{
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME)
		{
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
}