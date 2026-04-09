package P6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class D implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f18052a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f18053b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f18054c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8708a f18055d;

    public D(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        this.f18052a = interfaceC8708a;
        this.f18053b = interfaceC8708a2;
        this.f18054c = interfaceC8708a3;
        this.f18055d = interfaceC8708a4;
    }

    public static D a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        return new D(interfaceC8708a, interfaceC8708a2, interfaceC8708a3, interfaceC8708a4);
    }

    public static C c(m mVar, q qVar, boolean z10, boolean z11) {
        return new C(mVar, qVar, z10, z11);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C get() {
        return c((m) this.f18052a.get(), (q) this.f18053b.get(), ((Boolean) this.f18054c.get()).booleanValue(), ((Boolean) this.f18055d.get()).booleanValue());
    }
}
