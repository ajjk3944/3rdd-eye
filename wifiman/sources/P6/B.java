package P6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class B implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f18043a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f18044b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f18045c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8708a f18046d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC8708a f18047e;

    public B(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4, InterfaceC8708a interfaceC8708a5) {
        this.f18043a = interfaceC8708a;
        this.f18044b = interfaceC8708a2;
        this.f18045c = interfaceC8708a3;
        this.f18046d = interfaceC8708a4;
        this.f18047e = interfaceC8708a5;
    }

    public static B a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4, InterfaceC8708a interfaceC8708a5) {
        return new B(interfaceC8708a, interfaceC8708a2, interfaceC8708a3, interfaceC8708a4, interfaceC8708a5);
    }

    public static A c(m mVar, q qVar, int i10, int i11, boolean z10) {
        return new A(mVar, qVar, i10, i11, z10);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public A get() {
        return c((m) this.f18043a.get(), (q) this.f18044b.get(), ((Integer) this.f18045c.get()).intValue(), ((Integer) this.f18046d.get()).intValue(), ((Boolean) this.f18047e.get()).booleanValue());
    }
}
