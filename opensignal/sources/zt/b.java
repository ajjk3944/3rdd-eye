package zt;

/* loaded from: classes.dex */
public final class b extends au.f {

    /* renamed from: r, reason: collision with root package name */
    public final au.e f27525r;

    public b(au.e eVar, pq.h hVar, int i10, yt.a aVar) {
        super(hVar, i10, aVar);
        this.f27525r = eVar;
    }

    @Override // au.f
    public final Object b(yt.p pVar, a8.h hVar) {
        Object objW = this.f27525r.w(pVar, hVar);
        return objW == qq.a.COROUTINE_SUSPENDED ? objW : lq.b0.f15562a;
    }

    @Override // au.f
    public final au.f c(pq.h hVar, int i10, yt.a aVar) {
        return new b(this.f27525r, hVar, i10, aVar);
    }

    @Override // au.f
    public final String toString() {
        return "block[" + this.f27525r + "] -> " + super.toString();
    }
}
