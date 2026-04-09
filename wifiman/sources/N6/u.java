package N6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class u implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f15378a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f15379b;

    public u(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        this.f15378a = interfaceC8708a;
        this.f15379b = interfaceC8708a2;
    }

    public static u a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return new u(interfaceC8708a, interfaceC8708a2);
    }

    public static t c(r rVar, gg.y yVar) {
        return new t(rVar, yVar);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c((r) this.f15378a.get(), (gg.y) this.f15379b.get());
    }
}
