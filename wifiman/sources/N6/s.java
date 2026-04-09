package N6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class s implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f15372a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f15373b;

    public s(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        this.f15372a = interfaceC8708a;
        this.f15373b = interfaceC8708a2;
    }

    public static s a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return new s(interfaceC8708a, interfaceC8708a2);
    }

    public static r c(P6.G g10, P6.x xVar) {
        return new r(g10, xVar);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((P6.G) this.f15372a.get(), (P6.x) this.f15373b.get());
    }
}
