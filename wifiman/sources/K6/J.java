package K6;

import android.bluetooth.BluetoothGattCharacteristic;
import com.polidea.rxandroidble3.internal.BleIllegalOperationException;

/* loaded from: classes3.dex */
public class J extends F {
    public J(G g10) {
        super(g10);
    }

    @Override // K6.F
    public BleIllegalOperationException a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        I6.q.q(this.f10293a.a(bluetoothGattCharacteristic, i10), new Object[0]);
        return null;
    }
}
