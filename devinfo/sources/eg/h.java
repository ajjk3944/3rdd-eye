package eg;

import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h implements p8.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg.f f23464a;

    public h(qg.f fVar) {
        this.f23464a = fVar;
    }

    @Override // p8.e
    public final void a(int i4, Object obj, Object obj2) {
        nk.k.e(obj2, "model");
        u.y(i4, "dataSource");
        qg.f fVar = this.f23464a;
        fVar.f32369l.setVisibility(0);
        fVar.f32369l.setAlpha(1.0f);
        fVar.j.setAlpha(0.0f);
        fVar.f32368k.setAlpha(0.0f);
    }

    @Override // p8.e
    public final void b(q8.e eVar) {
        nk.k.e(eVar, "target");
    }
}
