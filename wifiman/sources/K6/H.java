package K6;

import P6.C3421i;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class H implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10295a;

    public H(InterfaceC8708a interfaceC8708a) {
        this.f10295a = interfaceC8708a;
    }

    public static H a(InterfaceC8708a interfaceC8708a) {
        return new H(interfaceC8708a);
    }

    public static G c(C3421i c3421i) {
        return new G(c3421i);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public G get() {
        return c((C3421i) this.f10295a.get());
    }
}
