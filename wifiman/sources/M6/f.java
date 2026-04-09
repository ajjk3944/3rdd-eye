package M6;

import K6.l0;
import L6.b;
import P6.AbstractC3418f;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import gg.z;

/* loaded from: classes3.dex */
public class f extends I6.t {

    /* renamed from: e, reason: collision with root package name */
    private final BluetoothGattDescriptor f12686e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f12687f;

    /* renamed from: g, reason: collision with root package name */
    private final int f12688g;

    f(l0 l0Var, BluetoothGatt bluetoothGatt, x xVar, int i10, BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        super(bluetoothGatt, l0Var, H6.a.f7638i, xVar);
        this.f12688g = i10;
        this.f12686e = bluetoothGattDescriptor;
        this.f12687f = bArr;
    }

    @Override // I6.t
    protected z d(l0 l0Var) {
        return l0Var.e().N(AbstractC3418f.b(this.f12686e)).P().A(AbstractC3418f.c());
    }

    @Override // I6.t
    protected boolean g(BluetoothGatt bluetoothGatt) {
        this.f12686e.setValue(this.f12687f);
        BluetoothGattCharacteristic characteristic = this.f12686e.getCharacteristic();
        int writeType = characteristic.getWriteType();
        characteristic.setWriteType(this.f12688g);
        boolean zWriteDescriptor = bluetoothGatt.writeDescriptor(this.f12686e);
        characteristic.setWriteType(writeType);
        return zWriteDescriptor;
    }

    @Override // I6.t
    public String toString() {
        return "DescriptorWriteOperation{" + super.toString() + ", descriptor=" + new b.a(this.f12686e.getUuid(), this.f12687f, true) + '}';
    }
}
