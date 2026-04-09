package f5;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8471a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f8472d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8473g;

    public /* synthetic */ f(int i10, long j, Object obj) {
        this.f8471a = i10;
        this.f8473g = obj;
        this.f8472d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8471a;
        long j = this.f8472d;
        Object obj = this.f8473g;
        switch (i10) {
            case 0:
                d5.w wVar = (d5.w) ((io.sentry.internal.debugmeta.c) obj).f12354g;
                int i11 = a5.d0.f105a;
                wVar.f7095a.O.onAudioPositionAdvancing(j);
                break;
            default:
                y9.j jVar = (y9.j) ((xr.a) obj).f25483g;
                int i12 = qb.v.f20828a;
                jVar.onAudioPositionAdvancing(j);
                break;
        }
    }
}
