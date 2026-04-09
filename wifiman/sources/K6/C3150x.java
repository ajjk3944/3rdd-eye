package K6;

import z2.InterfaceC8708a;

/* renamed from: K6.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3150x implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10459a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f10460b;

    public C3150x(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        this.f10459a = interfaceC8708a;
        this.f10460b = interfaceC8708a2;
    }

    public static C3150x a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return new C3150x(interfaceC8708a, interfaceC8708a2);
    }

    public static C3149w c(O6.d dVar, M6.k kVar) {
        return new C3149w(dVar, kVar);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3149w get() {
        return c((O6.d) this.f10459a.get(), (M6.k) this.f10460b.get());
    }
}
