package com.polidea.rxandroidble3.exceptions;

import android.bluetooth.BluetoothGattCharacteristic;

/* loaded from: classes3.dex */
public class BleCannotSetCharacteristicNotificationException extends BleException {

    /* renamed from: a, reason: collision with root package name */
    private final BluetoothGattCharacteristic f39265a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39266b;

    public BleCannotSetCharacteristicNotificationException(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10, Throwable th2) {
        super(a(bluetoothGattCharacteristic, i10), th2);
        this.f39265a = bluetoothGattCharacteristic;
        this.f39266b = i10;
    }

    private static String a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        return c(i10) + " (code " + i10 + ") with characteristic UUID " + bluetoothGattCharacteristic.getUuid();
    }

    private static String c(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Unknown error" : "Cannot write client characteristic config descriptor" : "Cannot find client characteristic config descriptor" : "Cannot set local notification";
    }
}
