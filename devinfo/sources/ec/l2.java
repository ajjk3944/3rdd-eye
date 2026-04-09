package ec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f22866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22867c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q2 f22869e;

    public /* synthetic */ l2(q2 q2Var, a2 a2Var, long j, boolean z3, int i4) {
        this.f22865a = i4;
        this.f22866b = a2Var;
        this.f22867c = j;
        this.f22868d = z3;
        this.f22869e = q2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22865a) {
            case 0:
                q2 q2Var = this.f22869e;
                a2 a2Var = this.f22866b;
                q2Var.F(a2Var);
                q2Var.R(a2Var, this.f22867c, this.f22868d);
                break;
            default:
                q2 q2Var2 = this.f22869e;
                a2 a2Var2 = this.f22866b;
                q2Var2.F(a2Var2);
                q2Var2.R(a2Var2, this.f22867c, this.f22868d);
                break;
        }
    }
}
