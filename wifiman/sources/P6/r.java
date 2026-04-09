package P6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class r implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f18096a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f18097b;

    public r(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        this.f18096a = interfaceC8708a;
        this.f18097b = interfaceC8708a2;
    }

    public static r a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return new r(interfaceC8708a, interfaceC8708a2);
    }

    public static q c(o oVar, String[][] strArr) {
        return new q(oVar, strArr);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q get() {
        return c((o) this.f18096a.get(), (String[][]) this.f18097b.get());
    }
}
