package f5;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8466a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f8467d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f8468g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f8469r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f8470x;

    public /* synthetic */ e(Object obj, String str, long j, long j7, int i10) {
        this.f8466a = i10;
        this.f8470x = obj;
        this.f8467d = str;
        this.f8468g = j;
        this.f8469r = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8466a;
        Object obj = this.f8470x;
        switch (i10) {
            case 0:
                d5.w wVar = (d5.w) ((io.sentry.internal.debugmeta.c) obj).f12354g;
                int i11 = a5.d0.f105a;
                wVar.f7095a.O.onAudioDecoderInitialized(this.f8467d, this.f8468g, this.f8469r);
                break;
            case 1:
                rb.u uVar = (rb.u) ((q3.a) obj).f20680g;
                int i12 = qb.v.f20828a;
                uVar.onVideoDecoderInitialized(this.f8467d, this.f8468g, this.f8469r);
                break;
            case 2:
                d5.w wVar2 = (d5.w) ((q3.a) obj).f20680g;
                int i13 = a5.d0.f105a;
                wVar2.f7095a.O.onVideoDecoderInitialized(this.f8467d, this.f8468g, this.f8469r);
                break;
            default:
                y9.j jVar = (y9.j) ((xr.a) obj).f25483g;
                int i14 = qb.v.f20828a;
                jVar.onAudioDecoderInitialized(this.f8467d, this.f8468g, this.f8469r);
                break;
        }
    }
}
