package com.aibots.blesample.comm;


import com.aibots.fastble.data.BleDevice;

public interface Observer {

    void disConnected(BleDevice bleDevice);
}
