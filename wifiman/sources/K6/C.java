package K6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class C implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10285a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f10286b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f10287c;

    public C(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        this.f10285a = interfaceC8708a;
        this.f10286b = interfaceC8708a2;
        this.f10287c = interfaceC8708a3;
    }

    public static C a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
        return new C(interfaceC8708a, interfaceC8708a2, interfaceC8708a3);
    }

    public static A c(String str, P6.G g10, gg.s sVar) {
        return new A(str, g10, sVar);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public A get() {
        return c((String) this.f10285a.get(), (P6.G) this.f10286b.get(), (gg.s) this.f10287c.get());
    }
}
