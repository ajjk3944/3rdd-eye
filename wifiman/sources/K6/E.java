package K6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class E implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10292a;

    public E(InterfaceC8708a interfaceC8708a) {
        this.f10292a = interfaceC8708a;
    }

    public static E a(InterfaceC8708a interfaceC8708a) {
        return new E(interfaceC8708a);
    }

    public static D c(F f10) {
        return new D(f10);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public D get() {
        return c((F) this.f10292a.get());
    }
}
