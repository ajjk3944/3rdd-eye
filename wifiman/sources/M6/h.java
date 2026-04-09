package M6;

import K6.C3128a;
import K6.InterfaceC3140m;
import K6.l0;
import android.bluetooth.BluetoothManager;
import gg.y;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class h implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f12705a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f12706b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f12707c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8708a f12708d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC8708a f12709e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC8708a f12710f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC8708a f12711g;

    public h(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4, InterfaceC8708a interfaceC8708a5, InterfaceC8708a interfaceC8708a6, InterfaceC8708a interfaceC8708a7) {
        this.f12705a = interfaceC8708a;
        this.f12706b = interfaceC8708a2;
        this.f12707c = interfaceC8708a3;
        this.f12708d = interfaceC8708a4;
        this.f12709e = interfaceC8708a5;
        this.f12710f = interfaceC8708a6;
        this.f12711g = interfaceC8708a7;
    }

    public static h a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4, InterfaceC8708a interfaceC8708a5, InterfaceC8708a interfaceC8708a6, InterfaceC8708a interfaceC8708a7) {
        return new h(interfaceC8708a, interfaceC8708a2, interfaceC8708a3, interfaceC8708a4, interfaceC8708a5, interfaceC8708a6, interfaceC8708a7);
    }

    public static g c(l0 l0Var, C3128a c3128a, String str, BluetoothManager bluetoothManager, y yVar, x xVar, InterfaceC3140m interfaceC3140m) {
        return new g(l0Var, c3128a, str, bluetoothManager, yVar, xVar, interfaceC3140m);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c((l0) this.f12705a.get(), (C3128a) this.f12706b.get(), (String) this.f12707c.get(), (BluetoothManager) this.f12708d.get(), (y) this.f12709e.get(), (x) this.f12710f.get(), (InterfaceC3140m) this.f12711g.get());
    }
}
