package K6;

import android.bluetooth.BluetoothGattCharacteristic;
import com.polidea.rxandroidble3.internal.BleIllegalOperationException;

/* loaded from: classes3.dex */
public class p0 extends F {
    public p0(G g10) {
        super(g10);
    }

    @Override // K6.F
    public BleIllegalOperationException a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        return new BleIllegalOperationException(this.f10293a.a(bluetoothGattCharacteristic, i10), bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getProperties(), i10);
    }
}
