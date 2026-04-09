package f5;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8484a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8485d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f8486g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f8487r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f8488x;

    public /* synthetic */ g(Object obj, int i10, long j, long j7, int i11) {
        this.f8484a = i11;
        this.f8488x = obj;
        this.f8485d = i10;
        this.f8486g = j;
        this.f8487r = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8484a;
        Object obj = this.f8488x;
        switch (i10) {
            case 0:
                d5.w wVar = (d5.w) ((io.sentry.internal.debugmeta.c) obj).f12354g;
                int i11 = a5.d0.f105a;
                wVar.f7095a.O.onAudioUnderrun(this.f8485d, this.f8486g, this.f8487r);
                break;
            case 1:
                ((pb.e) obj).f20366b.onBandwidthSample(this.f8485d, this.f8486g, this.f8487r);
                break;
            case 2:
                ((r5.c) obj).f21230b.onBandwidthSample(this.f8485d, this.f8486g, this.f8487r);
                break;
            default:
                y9.j jVar = (y9.j) ((xr.a) obj).f25483g;
                int i12 = qb.v.f20828a;
                jVar.onAudioUnderrun(this.f8485d, this.f8486g, this.f8487r);
                break;
        }
    }
}
