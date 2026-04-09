package K6;

import z2.InterfaceC8708a;

/* renamed from: K6.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3138k implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10385a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f10386b;

    public C3138k(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        this.f10385a = interfaceC8708a;
        this.f10386b = interfaceC8708a2;
    }

    public static C3138k a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return new C3138k(interfaceC8708a, interfaceC8708a2);
    }

    public static M6.x c(gg.y yVar, G6.S s10) {
        return (M6.x) y2.e.d(AbstractC3131d.g(yVar, s10));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public M6.x get() {
        return c((gg.y) this.f10385a.get(), (G6.S) this.f10386b.get());
    }
}
