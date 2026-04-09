package K6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class q0 implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10447a;

    public q0(InterfaceC8708a interfaceC8708a) {
        this.f10447a = interfaceC8708a;
    }

    public static q0 a(InterfaceC8708a interfaceC8708a) {
        return new q0(interfaceC8708a);
    }

    public static p0 c(G g10) {
        return new p0(g10);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public p0 get() {
        return c((G) this.f10447a.get());
    }
}
