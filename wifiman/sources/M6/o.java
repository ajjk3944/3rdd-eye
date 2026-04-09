package M6;

import K6.l0;
import android.bluetooth.BluetoothGatt;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class o implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f12727a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f12728b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f12729c;

    public o(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        this.f12727a = interfaceC8708a;
        this.f12728b = interfaceC8708a2;
        this.f12729c = interfaceC8708a3;
    }

    public static o a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        return new o(interfaceC8708a, interfaceC8708a2, interfaceC8708a3);
    }

    public static n c(l0 l0Var, BluetoothGatt bluetoothGatt, x xVar) {
        return new n(l0Var, bluetoothGatt, xVar);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c((l0) this.f12727a.get(), (BluetoothGatt) this.f12728b.get(), (x) this.f12729c.get());
    }
}
