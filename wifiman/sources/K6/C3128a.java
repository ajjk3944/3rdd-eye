package K6;

import android.bluetooth.BluetoothGatt;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: K6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3128a {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f10338a = new AtomicReference();

    C3128a() {
    }

    public BluetoothGatt a() {
        return (BluetoothGatt) this.f10338a.get();
    }

    public void b(BluetoothGatt bluetoothGatt) {
        r.Y.a(this.f10338a, null, bluetoothGatt);
    }
}
