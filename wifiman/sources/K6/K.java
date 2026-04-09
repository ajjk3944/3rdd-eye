package K6;

import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class K implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10296a;

    public K(InterfaceC8708a interfaceC8708a) {
        this.f10296a = interfaceC8708a;
    }

    public static K a(InterfaceC8708a interfaceC8708a) {
        return new K(interfaceC8708a);
    }

    public static J c(G g10) {
        return new J(g10);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public J get() {
        return c((G) this.f10296a.get());
    }
}
