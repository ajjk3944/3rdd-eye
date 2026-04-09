package G6;

import G6.InterfaceC2891a;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class t implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f7072a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f7073b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f7074c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8708a f7075d;

    public t(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        this.f7072a = interfaceC8708a;
        this.f7073b = interfaceC8708a2;
        this.f7074c = interfaceC8708a3;
        this.f7075d = interfaceC8708a4;
    }

    public static t a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        return new t(interfaceC8708a, interfaceC8708a2, interfaceC8708a3, interfaceC8708a4);
    }

    public static P6.x c(int i10, InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        return (P6.x) y2.e.d(InterfaceC2891a.c.s(i10, interfaceC8708a, interfaceC8708a2, interfaceC8708a3));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public P6.x get() {
        return c(((Integer) this.f7072a.get()).intValue(), this.f7073b, this.f7074c, this.f7075d);
    }
}
