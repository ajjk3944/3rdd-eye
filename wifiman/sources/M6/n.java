package M6;

import K6.l0;
import android.bluetooth.BluetoothGatt;
import gg.z;

/* loaded from: classes3.dex */
public class n extends I6.t {
    n(l0 l0Var, BluetoothGatt bluetoothGatt, x xVar) {
        super(bluetoothGatt, l0Var, H6.a.f7640k, xVar);
    }

    @Override // I6.t
    protected z d(l0 l0Var) {
        return l0Var.g().P();
    }

    @Override // I6.t
    protected boolean g(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.readRemoteRssi();
    }

    @Override // I6.t
    public String toString() {
        return "ReadRssiOperation{" + super.toString() + '}';
    }
}
