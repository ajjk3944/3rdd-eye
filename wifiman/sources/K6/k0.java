package K6;

import android.bluetooth.BluetoothGatt;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class k0 implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10387a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f10388b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f10389c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8708a f10390d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC8708a f10391e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC8708a f10392f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC8708a f10393g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC8708a f10394h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC8708a f10395i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC8708a f10396j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC8708a f10397k;

    public k0(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4, InterfaceC8708a interfaceC8708a5, InterfaceC8708a interfaceC8708a6, InterfaceC8708a interfaceC8708a7, InterfaceC8708a interfaceC8708a8, InterfaceC8708a interfaceC8708a9, InterfaceC8708a interfaceC8708a10, InterfaceC8708a interfaceC8708a11) {
        this.f10387a = interfaceC8708a;
        this.f10388b = interfaceC8708a2;
        this.f10389c = interfaceC8708a3;
        this.f10390d = interfaceC8708a4;
        this.f10391e = interfaceC8708a5;
        this.f10392f = interfaceC8708a6;
        this.f10393g = interfaceC8708a7;
        this.f10394h = interfaceC8708a8;
        this.f10395i = interfaceC8708a9;
        this.f10396j = interfaceC8708a10;
        this.f10397k = interfaceC8708a11;
    }

    public static k0 a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4, InterfaceC8708a interfaceC8708a5, InterfaceC8708a interfaceC8708a6, InterfaceC8708a interfaceC8708a7, InterfaceC8708a interfaceC8708a8, InterfaceC8708a interfaceC8708a9, InterfaceC8708a interfaceC8708a10, InterfaceC8708a interfaceC8708a11) {
        return new k0(interfaceC8708a, interfaceC8708a2, interfaceC8708a3, interfaceC8708a4, interfaceC8708a5, interfaceC8708a6, interfaceC8708a7, interfaceC8708a8, interfaceC8708a9, interfaceC8708a10, interfaceC8708a11);
    }

    public static j0 c(O6.d dVar, l0 l0Var, BluetoothGatt bluetoothGatt, Object obj, Object obj2, Object obj3, Object obj4, M6.k kVar, InterfaceC8708a interfaceC8708a, gg.y yVar, D d10) {
        return new j0(dVar, l0Var, bluetoothGatt, (n0) obj, (g0) obj2, (P) obj3, (C3149w) obj4, kVar, interfaceC8708a, yVar, d10);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j0 get() {
        return c((O6.d) this.f10387a.get(), (l0) this.f10388b.get(), (BluetoothGatt) this.f10389c.get(), this.f10390d.get(), this.f10391e.get(), this.f10392f.get(), this.f10393g.get(), (M6.k) this.f10394h.get(), this.f10395i, (gg.y) this.f10396j.get(), (D) this.f10397k.get());
    }
}
