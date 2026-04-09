package M6;

import K6.l0;
import L6.b;
import P6.AbstractC3418f;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import gg.z;

/* loaded from: classes3.dex */
public class b extends I6.t {

    /* renamed from: e, reason: collision with root package name */
    private final BluetoothGattCharacteristic f12668e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f12669f;

    b(l0 l0Var, BluetoothGatt bluetoothGatt, x xVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        super(bluetoothGatt, l0Var, H6.a.f7634e, xVar);
        this.f12668e = bluetoothGattCharacteristic;
        this.f12669f = bArr;
    }

    @Override // I6.t
    protected z d(l0 l0Var) {
        return l0Var.c().N(AbstractC3418f.a(this.f12668e.getUuid())).P().A(AbstractC3418f.c());
    }

    @Override // I6.t
    protected boolean g(BluetoothGatt bluetoothGatt) {
        this.f12668e.setValue(this.f12669f);
        return bluetoothGatt.writeCharacteristic(this.f12668e);
    }

    @Override // I6.t
    public String toString() {
        return "CharacteristicWriteOperation{" + super.toString() + ", characteristic=" + new b.a(this.f12668e.getUuid(), this.f12669f, true) + '}';
    }
}
