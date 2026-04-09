package K6;

import android.bluetooth.BluetoothGatt;
import z2.InterfaceC8708a;

/* renamed from: K6.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3135h implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10363a;

    public C3135h(InterfaceC8708a interfaceC8708a) {
        this.f10363a = interfaceC8708a;
    }

    public static C3135h a(InterfaceC8708a interfaceC8708a) {
        return new C3135h(interfaceC8708a);
    }

    public static BluetoothGatt c(C3128a c3128a) {
        return (BluetoothGatt) y2.e.d(AbstractC3131d.d(c3128a));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BluetoothGatt get() {
        return c((C3128a) this.f10363a.get());
    }
}
