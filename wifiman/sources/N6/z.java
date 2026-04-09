package N6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class z implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f15413a;

    public z(InterfaceC8708a interfaceC8708a) {
        this.f15413a = interfaceC8708a;
    }

    public static z a(InterfaceC8708a interfaceC8708a) {
        return new z(interfaceC8708a);
    }

    public static y c(gg.y yVar) {
        return new y(yVar);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        return c((gg.y) this.f15413a.get());
    }
}
