package L6;

import P6.C3421i;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class d implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f11247a;

    public d(InterfaceC8708a interfaceC8708a) {
        this.f11247a = interfaceC8708a;
    }

    public static d a(InterfaceC8708a interfaceC8708a) {
        return new d(interfaceC8708a);
    }

    public static c c(C3421i c3421i) {
        return new c(c3421i);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((C3421i) this.f11247a.get());
    }
}
