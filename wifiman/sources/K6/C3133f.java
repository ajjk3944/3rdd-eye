package K6;

import z2.InterfaceC8708a;

/* renamed from: K6.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3133f implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10351a;

    public C3133f(InterfaceC8708a interfaceC8708a) {
        this.f10351a = interfaceC8708a;
    }

    public static C3133f a(InterfaceC8708a interfaceC8708a) {
        return new C3133f(interfaceC8708a);
    }

    public static int c(int i10) {
        return AbstractC3131d.b(i10);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c(((Integer) this.f10351a.get()).intValue()));
    }
}
