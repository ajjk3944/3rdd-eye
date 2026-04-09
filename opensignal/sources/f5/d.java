package f5;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8454a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.sentry.internal.debugmeta.c f8455d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Exception f8456g;

    public /* synthetic */ d(io.sentry.internal.debugmeta.c cVar, Exception exc, int i10) {
        this.f8454a = i10;
        this.f8455d = cVar;
        this.f8456g = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8454a;
        Exception exc = this.f8456g;
        io.sentry.internal.debugmeta.c cVar = this.f8455d;
        switch (i10) {
            case 0:
                d5.w wVar = (d5.w) cVar.f12354g;
                int i11 = a5.d0.f105a;
                wVar.f7095a.O.onAudioCodecError(exc);
                break;
            default:
                d5.w wVar2 = (d5.w) cVar.f12354g;
                int i12 = a5.d0.f105a;
                wVar2.f7095a.O.onAudioSinkError(exc);
                break;
        }
    }
}
