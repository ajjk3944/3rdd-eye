package zt;

/* loaded from: classes.dex */
public final class a0 implements m0, f, au.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f27524a;

    public a0(o0 o0Var) {
        this.f27524a = o0Var;
    }

    @Override // au.o
    public final f a(pq.h hVar, int i10, yt.a aVar) {
        return ((((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != yt.a.DROP_OLDEST) && !((i10 == 0 || i10 == -3) && aVar == yt.a.SUSPEND)) ? new au.h(this, hVar, i10, aVar) : this;
    }

    @Override // zt.m0
    public final Object getValue() {
        return this.f27524a.getValue();
    }

    @Override // zt.f
    public final Object l(g gVar, pq.c cVar) {
        return this.f27524a.l(gVar, cVar);
    }
}
