package K6;

import z2.InterfaceC8708a;

/* renamed from: K6.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3152z implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10463a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f10464b;

    public C3152z(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        this.f10463a = interfaceC8708a;
        this.f10464b = interfaceC8708a2;
    }

    public static C3152z a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return new C3152z(interfaceC8708a, interfaceC8708a2);
    }

    public static C3151y c(O6.a aVar, M6.g gVar) {
        return new C3151y(aVar, gVar);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3151y get() {
        return c((O6.a) this.f10463a.get(), (M6.g) this.f10464b.get());
    }
}
