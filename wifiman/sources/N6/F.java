package N6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class F implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f15332a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f15333b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f15334c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8708a f15335d;

    public F(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        this.f15332a = interfaceC8708a;
        this.f15333b = interfaceC8708a2;
        this.f15334c = interfaceC8708a3;
        this.f15335d = interfaceC8708a4;
    }

    public static F a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        return new F(interfaceC8708a, interfaceC8708a2, interfaceC8708a3, interfaceC8708a4);
    }

    public static E c(P6.G g10, C3371f c3371f, y yVar, C3366a c3366a) {
        return new E(g10, c3371f, yVar, c3366a);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public E get() {
        return c((P6.G) this.f15332a.get(), (C3371f) this.f15333b.get(), (y) this.f15334c.get(), (C3366a) this.f15335d.get());
    }
}
