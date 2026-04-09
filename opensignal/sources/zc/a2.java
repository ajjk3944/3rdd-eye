package zc;

/* loaded from: classes.dex */
public final class a2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26857a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o1 f26858d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f26859g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f26860r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d2 f26861x;

    public /* synthetic */ a2(d2 d2Var, o1 o1Var, long j, boolean z10, int i10) {
        this.f26857a = i10;
        this.f26858d = o1Var;
        this.f26859g = j;
        this.f26860r = z10;
        this.f26861x = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26857a) {
            case 0:
                d2 d2Var = this.f26861x;
                o1 o1Var = this.f26858d;
                d2Var.w1(o1Var);
                d2Var.I1(o1Var, this.f26859g, this.f26860r);
                break;
            default:
                d2 d2Var2 = this.f26861x;
                o1 o1Var2 = this.f26858d;
                d2Var2.w1(o1Var2);
                d2Var2.I1(o1Var2, this.f26859g, this.f26860r);
                break;
        }
    }
}
