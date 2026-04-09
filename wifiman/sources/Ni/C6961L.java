package ni;

import mh.InterfaceC6824a;
import ni.AbstractC6991w;

/* renamed from: ni.L, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6961L implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6991w.c f54707a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6991w f54708b;

    public C6961L(AbstractC6991w.c cVar, AbstractC6991w abstractC6991w) {
        this.f54707a = cVar;
        this.f54708b = abstractC6991w;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return AbstractC6991w.c.u(this.f54707a, this.f54708b);
    }
}
