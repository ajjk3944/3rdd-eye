package M6;

import K6.l0;
import android.bluetooth.BluetoothGatt;
import gg.z;

/* loaded from: classes3.dex */
public class i extends I6.t {

    /* renamed from: e, reason: collision with root package name */
    private final int f12712e;

    i(l0 l0Var, BluetoothGatt bluetoothGatt, x xVar, int i10) {
        super(bluetoothGatt, l0Var, H6.a.f7641l, xVar);
        this.f12712e = i10;
    }

    @Override // I6.t
    protected z d(l0 l0Var) {
        return l0Var.f().P();
    }

    @Override // I6.t
    protected boolean g(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.requestMtu(this.f12712e);
    }

    @Override // I6.t
    public String toString() {
        return "MtuRequestOperation{" + super.toString() + ", mtu=" + this.f12712e + '}';
    }
}
