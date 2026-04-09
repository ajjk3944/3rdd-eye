package P6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class k implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f18085a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f18086b;

    public k(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        this.f18085a = interfaceC8708a;
        this.f18086b = interfaceC8708a2;
    }

    public static k a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return new k(interfaceC8708a, interfaceC8708a2);
    }

    public static C3422j c(o oVar, String[][] strArr) {
        return new C3422j(oVar, strArr);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3422j get() {
        return c((o) this.f18085a.get(), (String[][]) this.f18086b.get());
    }
}
