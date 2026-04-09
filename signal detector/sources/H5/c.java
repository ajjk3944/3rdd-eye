package H5;

import E5.t;
import c5.C0412i;
import h5.InterfaceC2375i;
import p5.l;
import z5.C3030f;
import z5.InterfaceC3029e;
import z5.n0;

/* loaded from: classes3.dex */
public final class c implements InterfaceC3029e, n0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3030f f1816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f1817b;

    public c(d dVar, C3030f c3030f) {
        this.f1817b = dVar;
        this.f1816a = c3030f;
    }

    @Override // z5.n0
    public final void a(t tVar, int i) {
        this.f1816a.a(tVar, i);
    }

    @Override // h5.InterfaceC2370d
    public final void e(Object obj) {
        this.f1816a.e(obj);
    }

    @Override // z5.InterfaceC3029e
    public final B2.a g(Object obj, l lVar) {
        d dVar = this.f1817b;
        b bVar = new b(dVar, this, 1);
        B2.a aVarG = this.f1816a.g((C0412i) obj, bVar);
        if (aVarG != null) {
            d.f1818g.set(dVar, null);
        }
        return aVarG;
    }

    @Override // h5.InterfaceC2370d
    public final InterfaceC2375i getContext() {
        return this.f1816a.f24532e;
    }

    @Override // z5.InterfaceC3029e
    public final void i(Object obj) {
        this.f1816a.i(obj);
    }
}
