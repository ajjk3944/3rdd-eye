package K6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class S implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10320a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f10321b;

    public S(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        this.f10320a = interfaceC8708a;
        this.f10321b = interfaceC8708a2;
    }

    public static S a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return new S(interfaceC8708a, interfaceC8708a2);
    }

    public static Q c(l0 l0Var, int i10) {
        return new Q(l0Var, i10);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Q get() {
        return c((l0) this.f10320a.get(), ((Integer) this.f10321b.get()).intValue());
    }
}
