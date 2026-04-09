package K6;

import z2.InterfaceC8708a;

/* renamed from: K6.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3137j implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10371a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f10372b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f10373c;

    public C3137j(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        this.f10371a = interfaceC8708a;
        this.f10372b = interfaceC8708a2;
        this.f10373c = interfaceC8708a3;
    }

    public static C3137j a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        return new C3137j(interfaceC8708a, interfaceC8708a2, interfaceC8708a3);
    }

    public static F c(boolean z10, InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return (F) y2.e.d(AbstractC3131d.f(z10, interfaceC8708a, interfaceC8708a2));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public F get() {
        return c(((Boolean) this.f10371a.get()).booleanValue(), this.f10372b, this.f10373c);
    }
}
