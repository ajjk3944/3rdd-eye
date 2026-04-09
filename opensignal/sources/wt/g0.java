package wt;

/* loaded from: classes.dex */
public final class g0 extends h0 {

    /* renamed from: g, reason: collision with root package name */
    public final g f24619g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j0 f24620r;

    public g0(j0 j0Var, long j, g gVar) {
        this.f24620r = j0Var;
        this.f24622a = j;
        this.f24623d = -1;
        this.f24619g = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24619g.E(this.f24620r);
    }

    @Override // wt.h0
    public final String toString() {
        return super.toString() + this.f24619g;
    }
}
