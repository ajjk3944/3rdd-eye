package K6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class M implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10306a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f10307b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f10308c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8708a f10309d;

    public M(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        this.f10306a = interfaceC8708a;
        this.f10307b = interfaceC8708a2;
        this.f10308c = interfaceC8708a3;
        this.f10309d = interfaceC8708a4;
    }

    public static M a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        return new M(interfaceC8708a, interfaceC8708a2, interfaceC8708a3, interfaceC8708a4);
    }

    public static L c(O6.d dVar, Object obj, G6.N n10, M6.k kVar) {
        return new L(dVar, (N) obj, n10, kVar);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public L get() {
        return c((O6.d) this.f10306a.get(), this.f10307b.get(), (G6.N) this.f10308c.get(), (M6.k) this.f10309d.get());
    }
}
