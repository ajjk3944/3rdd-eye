package I6;

import K6.InterfaceC3140m;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class d implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f8643a;

    public d(InterfaceC8708a interfaceC8708a) {
        this.f8643a = interfaceC8708a;
    }

    public static d a(InterfaceC8708a interfaceC8708a) {
        return new d(interfaceC8708a);
    }

    public static InterfaceC3140m c(J5.b bVar) {
        return (InterfaceC3140m) y2.e.d(b.b(bVar));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3140m get() {
        return c((J5.b) this.f8643a.get());
    }
}
