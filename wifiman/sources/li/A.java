package Li;

import Ii.InterfaceC3091y0;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;

/* loaded from: classes4.dex */
final class A implements D, InterfaceC3220g, Mi.o {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ D f11828a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3091y0 f11829b;

    public A(D d10, InterfaceC3091y0 interfaceC3091y0) {
        this.f11828a = d10;
        this.f11829b = interfaceC3091y0;
    }

    @Override // Li.D, Li.InterfaceC3220g
    public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
        return this.f11828a.b(interfaceC3221h, interfaceC5380e);
    }

    @Override // Mi.o
    public InterfaceC3220g d(InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        return F.e(this, interfaceC5384i, i10, aVar);
    }
}
