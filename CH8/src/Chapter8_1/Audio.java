package Chapter8_1;

public class Audio implements RemoteControl {
	// 개인 접근자
	private int volume;
	
	//turnOn() 추상 메소드의 실체
	public void turnOn() 
	{
		System.out.println("Audio를 재생합니다.");
	}	
	//turnOff()추상 메소드의 실체
	public void turnOff() 
	{
		System.out.println("Audio를 끕니다.");
	}
	//setVolume() 추상 메소드의 실체
	public void setVolume(int volume) 
	{
		if(volume>RemoteControl.MAX_VOLUME) 
		{
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME)
		{
			this.volume = RemoteControl.MIN_VOLUME;
		} else 
		{
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 " + this.volume);
	}
}
