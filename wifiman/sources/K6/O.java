package K6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class O implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10313a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f10314b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f10315c;

    public O(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        this.f10313a = interfaceC8708a;
        this.f10314b = interfaceC8708a2;
        this.f10315c = interfaceC8708a3;
    }

    public static O a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        return new O(interfaceC8708a, interfaceC8708a2, interfaceC8708a3);
    }

    public static N c(G6.N n10, int i10, int i11) {
        return new N(n10, i10, i11);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public N get() {
        return c((G6.N) this.f10313a.get(), ((Integer) this.f10314b.get()).intValue(), ((Integer) this.f10315c.get()).intValue());
    }
}
