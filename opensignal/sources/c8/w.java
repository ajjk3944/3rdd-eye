package c8;

import androidx.lifecycle.p0;

/* loaded from: classes.dex */
public final class w implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3375a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f3376b;

    /* renamed from: c, reason: collision with root package name */
    public final l8.n f3377c;

    public /* synthetic */ w(d0 d0Var, l8.n nVar, int i10) {
        this.f3375a = i10;
        this.f3376b = d0Var;
        this.f3377c = nVar;
    }

    @Override // c8.l
    public final Object a(pq.c cVar) {
        switch (this.f3375a) {
            case 0:
                return wt.w.x(new p0(3, this), (rq.c) cVar);
            default:
                return wt.w.x(new p0(4, this), (rq.c) cVar);
        }
    }
}
