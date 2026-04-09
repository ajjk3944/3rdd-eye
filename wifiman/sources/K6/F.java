package K6;

import android.bluetooth.BluetoothGattCharacteristic;
import com.polidea.rxandroidble3.internal.BleIllegalOperationException;

/* loaded from: classes3.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    protected final G f10293a;

    F(G g10) {
        this.f10293a = g10;
    }

    public abstract BleIllegalOperationException a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10);
}
