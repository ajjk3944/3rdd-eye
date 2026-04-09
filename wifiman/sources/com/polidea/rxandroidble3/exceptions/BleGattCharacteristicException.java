package com.polidea.rxandroidble3.exceptions;

import H6.a;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;

/* loaded from: classes3.dex */
public class BleGattCharacteristicException extends BleGattException {

    /* renamed from: d, reason: collision with root package name */
    public final BluetoothGattCharacteristic f39272d;

    public BleGattCharacteristicException(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10, a aVar) {
        super(bluetoothGatt, i10, aVar);
        this.f39272d = bluetoothGattCharacteristic;
    }
}
