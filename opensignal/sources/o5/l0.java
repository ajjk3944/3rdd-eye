package o5;

/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18985a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f18986d;

    public /* synthetic */ l0(p0 p0Var, int i10) {
        this.f18985a = i10;
        this.f18986d = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18985a) {
            case 0:
                this.f18986d.f19013a0 = true;
                break;
            case 1:
                this.f18986d.x();
                break;
            default:
                p0 p0Var = this.f18986d;
                if (!p0Var.f19021g0) {
                    w wVar = p0Var.L;
                    wVar.getClass();
                    wVar.r(p0Var);
                    break;
                }
                break;
        }
    }
}
