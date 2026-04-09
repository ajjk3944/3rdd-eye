package Pi;

import Li.InterfaceC3220g;
import dh.InterfaceC5384i;

/* loaded from: classes4.dex */
final class b implements Dj.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3220g f18676a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5384i f18677b;

    public b(InterfaceC3220g interfaceC3220g, InterfaceC5384i interfaceC5384i) {
        this.f18676a = interfaceC3220g;
        this.f18677b = interfaceC5384i;
    }

    @Override // Dj.a
    public void b(Dj.b bVar) {
        bVar.getClass();
        bVar.j(new c(this.f18676a, bVar, this.f18677b));
    }
}
