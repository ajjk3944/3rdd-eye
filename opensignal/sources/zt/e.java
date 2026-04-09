package zt;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f27540a;

    public e(f fVar) {
        this.f27540a = fVar;
    }

    @Override // zt.f
    public final Object l(g gVar, pq.c cVar) {
        br.w wVar = new br.w();
        wVar.f2917a = au.c.f2321b;
        Object objL = this.f27540a.l(new d(this, wVar, gVar), cVar);
        return objL == qq.a.COROUTINE_SUSPENDED ? objL : lq.b0.f15562a;
    }
}
