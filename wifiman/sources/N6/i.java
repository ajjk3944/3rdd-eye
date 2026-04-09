package N6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class i implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f15361a;

    public i(InterfaceC8708a interfaceC8708a) {
        this.f15361a = interfaceC8708a;
    }

    public static i a(InterfaceC8708a interfaceC8708a) {
        return new i(interfaceC8708a);
    }

    public static C3373h c(I6.o oVar) {
        return new C3373h(oVar);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3373h get() {
        return c((I6.o) this.f15361a.get());
    }
}
