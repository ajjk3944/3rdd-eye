package I6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class p implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f8668a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f8669b;

    public p(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        this.f8668a = interfaceC8708a;
        this.f8669b = interfaceC8708a2;
    }

    public static p a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return new p(interfaceC8708a, interfaceC8708a2);
    }

    public static o c(J6.b bVar, InterfaceC8708a interfaceC8708a) {
        return new o(bVar, interfaceC8708a);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public o get() {
        return c((J6.b) this.f8668a.get(), this.f8669b);
    }
}
