package com.polidea.rxandroidble3.exceptions;

import H6.a;
import L6.b;
import android.bluetooth.BluetoothGatt;

/* loaded from: classes3.dex */
public class BleGattException extends BleException {

    /* renamed from: a, reason: collision with root package name */
    private final BluetoothGatt f39274a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39275b;

    /* renamed from: c, reason: collision with root package name */
    private final a f39276c;

    public BleGattException(BluetoothGatt bluetoothGatt, int i10, a aVar) {
        super(a(bluetoothGatt, i10, aVar));
        this.f39274a = bluetoothGatt;
        this.f39275b = i10;
        this.f39276c = aVar;
    }

    private static String a(BluetoothGatt bluetoothGatt, int i10, a aVar) {
        if (i10 == -1) {
            return String.format("GATT exception from MAC address %s, with type %s", d(bluetoothGatt), aVar);
        }
        return String.format("GATT exception from %s, status %d (%s), type %s. (Look up status 0x%02x here %s)", b.c(bluetoothGatt), Integer.valueOf(i10), R6.a.a(i10), aVar, Integer.valueOf(i10), "https://cs.android.com/android/platform/superproject/+/master:packages/modules/Bluetooth/system/stack/include/gatt_api.h");
    }

    private static String d(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null || bluetoothGatt.getDevice() == null) {
            return null;
        }
        return bluetoothGatt.getDevice().getAddress();
    }

    public a c() {
        return this.f39276c;
    }

    public BleGattException(BluetoothGatt bluetoothGatt, a aVar) {
        this(bluetoothGatt, -1, aVar);
    }
}
