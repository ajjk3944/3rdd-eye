package M6;

import K6.l0;
import android.bluetooth.BluetoothGatt;
import gg.y;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class m implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f12720a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f12721b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f12722c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8708a f12723d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC8708a f12724e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC8708a f12725f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC8708a f12726g;

    public m(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4, InterfaceC8708a interfaceC8708a5, InterfaceC8708a interfaceC8708a6, InterfaceC8708a interfaceC8708a7) {
        this.f12720a = interfaceC8708a;
        this.f12721b = interfaceC8708a2;
        this.f12722c = interfaceC8708a3;
        this.f12723d = interfaceC8708a4;
        this.f12724e = interfaceC8708a5;
        this.f12725f = interfaceC8708a6;
        this.f12726g = interfaceC8708a7;
    }

    public static m a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4, InterfaceC8708a interfaceC8708a5, InterfaceC8708a interfaceC8708a6, InterfaceC8708a interfaceC8708a7) {
        return new m(interfaceC8708a, interfaceC8708a2, interfaceC8708a3, interfaceC8708a4, interfaceC8708a5, interfaceC8708a6, interfaceC8708a7);
    }

    public static l c(l0 l0Var, BluetoothGatt bluetoothGatt, L6.c cVar, x xVar, y yVar, y yVar2, InterfaceC8708a interfaceC8708a) {
        return new l(l0Var, bluetoothGatt, cVar, xVar, yVar, yVar2, interfaceC8708a);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c((l0) this.f12720a.get(), (BluetoothGatt) this.f12721b.get(), (L6.c) this.f12722c.get(), (x) this.f12723d.get(), (y) this.f12724e.get(), (y) this.f12725f.get(), this.f12726g);
    }
}
