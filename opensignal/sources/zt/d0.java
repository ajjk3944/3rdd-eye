package zt;

import wt.t0;

/* loaded from: classes.dex */
public final class d0 extends rq.c {
    public t0 B;
    public /* synthetic */ Object D;
    public final /* synthetic */ e0 E;
    public int F;

    /* renamed from: r, reason: collision with root package name */
    public e0 f27537r;

    /* renamed from: x, reason: collision with root package name */
    public g f27538x;

    /* renamed from: y, reason: collision with root package name */
    public g0 f27539y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, pq.c cVar) {
        super(cVar);
        this.E = e0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return e0.j(this.E, null, this);
    }
}
