package zt;

import wt.t0;

/* loaded from: classes.dex */
public final class n0 extends rq.c {
    public t0 B;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ o0 F;
    public int G;

    /* renamed from: r, reason: collision with root package name */
    public o0 f27573r;

    /* renamed from: x, reason: collision with root package name */
    public g f27574x;

    /* renamed from: y, reason: collision with root package name */
    public p0 f27575y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, pq.c cVar) {
        super(cVar);
        this.F = o0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.l(null, this);
    }
}
