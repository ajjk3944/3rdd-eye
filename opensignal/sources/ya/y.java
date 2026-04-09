package ya;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26196a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f26197d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0 f26198g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f26199r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f26200x;

    public /* synthetic */ y(a0 a0Var, b0 b0Var, m mVar, r rVar, int i10) {
        this.f26196a = i10;
        this.f26197d = a0Var;
        this.f26198g = b0Var;
        this.f26199r = mVar;
        this.f26200x = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26196a) {
            case 0:
                a0 a0Var = this.f26197d;
                this.f26198g.onLoadCompleted(a0Var.f26035a, a0Var.f26036b, this.f26199r, this.f26200x);
                break;
            case 1:
                a0 a0Var2 = this.f26197d;
                this.f26198g.onLoadCanceled(a0Var2.f26035a, a0Var2.f26036b, this.f26199r, this.f26200x);
                break;
            default:
                a0 a0Var3 = this.f26197d;
                this.f26198g.onLoadStarted(a0Var3.f26035a, a0Var3.f26036b, this.f26199r, this.f26200x);
                break;
        }
    }
}
