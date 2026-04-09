package f5;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8510a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f8511d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8512g;

    public /* synthetic */ h(Object obj, boolean z10, int i10) {
        this.f8510a = i10;
        this.f8512g = obj;
        this.f8511d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8510a;
        boolean z10 = this.f8511d;
        Object obj = this.f8512g;
        switch (i10) {
            case 0:
                d5.w wVar = (d5.w) ((io.sentry.internal.debugmeta.c) obj).f12354g;
                int i11 = a5.d0.f105a;
                d5.z zVar = wVar.f7095a;
                if (zVar.F0 != z10) {
                    zVar.F0 = z10;
                    zVar.I.f(23, new com.google.android.exoplayer2.q(3, z10));
                    break;
                }
                break;
            case 1:
                ((no.d) obj).f18469a.g(Boolean.valueOf(z10));
                break;
            default:
                y9.j jVar = (y9.j) ((xr.a) obj).f25483g;
                int i12 = qb.v.f20828a;
                jVar.onSkipSilenceEnabledChanged(z10);
                break;
        }
    }
}
