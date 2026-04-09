package M6;

import G6.N;
import K6.i0;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public interface k {
    i a(int i10);

    f b(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr);

    a c(BluetoothGattCharacteristic bluetoothGattCharacteristic, N.c cVar, N.d dVar, i0 i0Var, byte[] bArr);

    n d();

    w e(long j10, TimeUnit timeUnit);

    b f(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr);

    e g(int i10, long j10, TimeUnit timeUnit);
}
