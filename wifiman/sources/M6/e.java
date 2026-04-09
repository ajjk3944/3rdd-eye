package M6;

import K6.l0;
import android.bluetooth.BluetoothGatt;
import gg.z;

/* loaded from: classes3.dex */
public class e extends I6.t {

    /* renamed from: e, reason: collision with root package name */
    private final int f12684e;

    /* renamed from: f, reason: collision with root package name */
    private final x f12685f;

    e(l0 l0Var, BluetoothGatt bluetoothGatt, x xVar, int i10, x xVar2) {
        super(bluetoothGatt, l0Var, H6.a.f7644o, xVar);
        this.f12684e = i10;
        this.f12685f = xVar2;
    }

    private static String j(int i10) {
        return i10 != 0 ? i10 != 2 ? "CONNECTION_PRIORITY_HIGH" : "CONNECTION_PRIORITY_LOW_POWER" : "CONNECTION_PRIORITY_BALANCED";
    }

    @Override // I6.t
    protected z d(l0 l0Var) {
        x xVar = this.f12685f;
        return z.V(xVar.f12751a, xVar.f12752b, xVar.f12753c);
    }

    @Override // I6.t
    protected boolean g(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.requestConnectionPriority(this.f12684e);
    }

    @Override // I6.t
    public String toString() {
        return "ConnectionPriorityChangeOperation{" + super.toString() + ", connectionPriority=" + j(this.f12684e) + ", successTimeout=" + this.f12685f + '}';
    }
}
