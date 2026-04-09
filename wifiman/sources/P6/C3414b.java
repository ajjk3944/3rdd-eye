package P6;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.content.Context;

/* renamed from: P6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3414b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18067a;

    public C3414b(Context context) {
        this.f18067a = context;
    }

    private BluetoothGatt b(BluetoothGattCallback bluetoothGattCallback, BluetoothDevice bluetoothDevice, boolean z10) {
        I6.q.p("Connecting without reflection", new Object[0]);
        return bluetoothDevice.connectGatt(this.f18067a, z10, bluetoothGattCallback, 2);
    }

    public BluetoothGatt a(BluetoothDevice bluetoothDevice, boolean z10, BluetoothGattCallback bluetoothGattCallback) {
        if (bluetoothDevice == null) {
            return null;
        }
        return b(bluetoothGattCallback, bluetoothDevice, z10);
    }
}
