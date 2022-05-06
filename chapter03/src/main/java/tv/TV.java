package tv;

public class TV {
	private int channel; // 0 ~ 255 로테이션 기능
	private int volume; // 0 ~ 100 로테이션 기능
	private boolean power;

	TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return this.channel;
	}

	public void getVolume() {

	}

	public void isPower() {

	}

	public void channel(boolean up) {
		channel(channel + (up ? 1 : -1));
	}

	public void channel(int channel) {
		this.channel = channel;
		if (channel < 0) {
			this.channel = 255;
		} else if (channel > 255) {
			this.channel = 0;
		}
	}

	public void volume(boolean up) {
		volume(volume + (up ? 1 : -1));
	}

	public void volume(int volume) {
		this.volume = volume;
		if (volume < 0) {
			this.volume = 100;
		} else if (volume > 100) {
			this.volume = 0;
		}
	}

	public void power(boolean power) {
		this.power = (power ? true : false);
	}

	public void status() {
		System.out.println("TV[chnnel=" + channel + ", volume=" + volume + ", power=" + (power ? "on" : "off") + "]");
	}

}
