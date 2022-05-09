package com.agiledeveloper;

public class Remote {
  private RemoteControlled remoteControlled;

  public Remote(RemoteControlled theRemoteControlled) {
    remoteControlled = theRemoteControlled;
  }

  public void up() {
    remoteControlled.up();
  }

  public void down() {
    remoteControlled.down();
  }
}