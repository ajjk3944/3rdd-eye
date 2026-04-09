package ec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y2 f23249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2 f23250b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f23251c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f23252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b3 f23253e;

    public z2(b3 b3Var, y2 y2Var, y2 y2Var2, long j, boolean z3) {
        this.f23249a = y2Var;
        this.f23250b = y2Var2;
        this.f23251c = j;
        this.f23252d = z3;
        this.f23253e = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23253e.L(this.f23249a, this.f23250b, this.f23251c, this.f23252d, null);
    }
}
