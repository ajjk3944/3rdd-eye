package Li;

import Ii.InterfaceC3091y0;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;

/* loaded from: classes4.dex */
final class B implements N, InterfaceC3220g, Mi.o {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ N f11830a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3091y0 f11831b;

    public B(N n10, InterfaceC3091y0 interfaceC3091y0) {
        this.f11830a = n10;
        this.f11831b = interfaceC3091y0;
    }

    @Override // Li.D, Li.InterfaceC3220g
    public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
        return this.f11830a.b(interfaceC3221h, interfaceC5380e);
    }

    @Override // Mi.o
    public InterfaceC3220g d(InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        return P.d(this, interfaceC5384i, i10, aVar);
    }

    @Override // Li.N
    public Object getValue() {
        return this.f11830a.getValue();
    }
}
