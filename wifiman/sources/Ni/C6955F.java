package ni;

import mh.InterfaceC6824a;
import ni.AbstractC6991w;

/* renamed from: ni.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6955F implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6991w.b f54698a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6991w f54699b;

    public C6955F(AbstractC6991w.b bVar, AbstractC6991w abstractC6991w) {
        this.f54698a = bVar;
        this.f54699b = abstractC6991w;
    }

    @Override // mh.InterfaceC6824a
    public Object invoke() {
        return AbstractC6991w.b.D(this.f54698a, this.f54699b);
    }
}
