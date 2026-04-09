package K6;

import android.bluetooth.BluetoothGatt;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class o0 implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10441a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f10442b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f10443c;

    public o0(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        this.f10441a = interfaceC8708a;
        this.f10442b = interfaceC8708a2;
        this.f10443c = interfaceC8708a3;
    }

    public static o0 a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        return new o0(interfaceC8708a, interfaceC8708a2, interfaceC8708a3);
    }

    public static n0 c(O6.d dVar, BluetoothGatt bluetoothGatt, M6.k kVar) {
        return new n0(dVar, bluetoothGatt, kVar);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n0 get() {
        return c((O6.d) this.f10441a.get(), (BluetoothGatt) this.f10442b.get(), (M6.k) this.f10443c.get());
    }
}
