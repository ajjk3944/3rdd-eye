package N6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class D implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f15325a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f15326b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f15327c;

    public D(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        this.f15325a = interfaceC8708a;
        this.f15326b = interfaceC8708a2;
        this.f15327c = interfaceC8708a3;
    }

    public static D a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        return new D(interfaceC8708a, interfaceC8708a2, interfaceC8708a3);
    }

    public static C c(P6.G g10, C3371f c3371f, y yVar) {
        return new C(g10, c3371f, yVar);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C get() {
        return c((P6.G) this.f15325a.get(), (C3371f) this.f15326b.get(), (y) this.f15327c.get());
    }
}
