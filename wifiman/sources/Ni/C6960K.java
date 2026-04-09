package ni;

import mh.InterfaceC6824a;
import ni.AbstractC6991w;

/* renamed from: ni.K, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6960K implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6991w.c f54705a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6991w f54706b;

    public C6960K(AbstractC6991w.c cVar, AbstractC6991w abstractC6991w) {
        this.f54705a = cVar;
        this.f54706b = abstractC6991w;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return AbstractC6991w.c.p(this.f54705a, this.f54706b);
    }
}
