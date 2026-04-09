package N6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class H implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f15340a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f15341b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f15342c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8708a f15343d;

    public H(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        this.f15340a = interfaceC8708a;
        this.f15341b = interfaceC8708a2;
        this.f15342c = interfaceC8708a3;
        this.f15343d = interfaceC8708a4;
    }

    public static H a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        return new H(interfaceC8708a, interfaceC8708a2, interfaceC8708a3, interfaceC8708a4);
    }

    public static G c(P6.G g10, C3371f c3371f, y yVar, C3366a c3366a) {
        return new G(g10, c3371f, yVar, c3366a);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public G get() {
        return c((P6.G) this.f15340a.get(), (C3371f) this.f15341b.get(), (y) this.f15342c.get(), (C3366a) this.f15343d.get());
    }
}
