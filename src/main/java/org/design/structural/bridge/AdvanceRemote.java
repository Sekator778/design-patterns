package org.design.structural.bridge;

public class AdvanceRemote extends BasicRemote {
    public AdvanceRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
