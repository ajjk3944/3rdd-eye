package N6;

import P6.I;
import z2.InterfaceC8708a;

/* renamed from: N6.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3372g implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f15358a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f15359b;

    public C3372g(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        this.f15358a = interfaceC8708a;
        this.f15359b = interfaceC8708a2;
    }

    public static C3372g a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return new C3372g(interfaceC8708a, interfaceC8708a2);
    }

    public static C3371f c(I i10, j jVar) {
        return new C3371f(i10, jVar);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3371f get() {
        return c((I) this.f15358a.get(), (j) this.f15359b.get());
    }
}
