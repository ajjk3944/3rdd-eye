package o5;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18897a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f18898d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f0 f18899g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q f18900r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v f18901x;

    public /* synthetic */ c0(e0 e0Var, f0 f0Var, q qVar, v vVar, int i10) {
        this.f18897a = i10;
        this.f18898d = e0Var;
        this.f18899g = f0Var;
        this.f18900r = qVar;
        this.f18901x = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18897a) {
            case 0:
                e0 e0Var = this.f18898d;
                this.f18899g.onLoadStarted(e0Var.f18922a, e0Var.f18923b, this.f18900r, this.f18901x);
                break;
            case 1:
                e0 e0Var2 = this.f18898d;
                this.f18899g.onLoadCompleted(e0Var2.f18922a, e0Var2.f18923b, this.f18900r, this.f18901x);
                break;
            default:
                e0 e0Var3 = this.f18898d;
                this.f18899g.onLoadCanceled(e0Var3.f18922a, e0Var3.f18923b, this.f18900r, this.f18901x);
                break;
        }
    }
}
