package com.polidea.rxandroidble3.exceptions;

import H6.a;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattDescriptor;

/* loaded from: classes3.dex */
public class BleGattDescriptorException extends BleGattException {

    /* renamed from: d, reason: collision with root package name */
    public final BluetoothGattDescriptor f39273d;

    public BleGattDescriptorException(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10, a aVar) {
        super(bluetoothGatt, i10, aVar);
        this.f39273d = bluetoothGattDescriptor;
    }
}
