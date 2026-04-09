package wt;

/* loaded from: classes.dex */
public final class k extends w0 implements j {

    /* renamed from: x, reason: collision with root package name */
    public final b1 f24627x;

    public k(b1 b1Var) {
        this.f24627x = b1Var;
    }

    @Override // wt.j
    public final boolean c(Throwable th2) {
        return j().t(th2);
    }

    @Override // wt.w0
    public final boolean k() {
        return true;
    }

    @Override // wt.w0
    public final void l(Throwable th2) {
        this.f24627x.o(j());
    }
}
