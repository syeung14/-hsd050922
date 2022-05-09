package com.agiledeveloper;

public class TV implements RemoteControlled {
  private int volume = 1;

  public int getVolume() {
    return volume;
  }

  public void setVolume(int value) {
    volume = value;
  }

  @Override
  public void up() {
    volume++;
  }

  @Override
  public void down() {
    volume--;
  }
}
