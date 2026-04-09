package N6;

import z2.InterfaceC8708a;

/* renamed from: N6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3369d implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f15350a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f15351b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f15352c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8708a f15353d;

    public C3369d(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        this.f15350a = interfaceC8708a;
        this.f15351b = interfaceC8708a2;
        this.f15352c = interfaceC8708a3;
        this.f15353d = interfaceC8708a4;
    }

    public static C3369d a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        return new C3369d(interfaceC8708a, interfaceC8708a2, interfaceC8708a3, interfaceC8708a4);
    }

    public static C3368c c(P6.G g10, C3366a c3366a, C3371f c3371f, C3373h c3373h) {
        return new C3368c(g10, c3366a, c3371f, c3373h);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3368c get() {
        return c((P6.G) this.f15350a.get(), (C3366a) this.f15351b.get(), (C3371f) this.f15352c.get(), (C3373h) this.f15353d.get());
    }
}
