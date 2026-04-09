package N6;

import z2.InterfaceC8708a;

/* renamed from: N6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3367b implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f15345a;

    public C3367b(InterfaceC8708a interfaceC8708a) {
        this.f15345a = interfaceC8708a;
    }

    public static C3367b a(InterfaceC8708a interfaceC8708a) {
        return new C3367b(interfaceC8708a);
    }

    public static C3366a c(int i10) {
        return new C3366a(i10);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3366a get() {
        return c(((Integer) this.f15345a.get()).intValue());
    }
}
