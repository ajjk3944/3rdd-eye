package f5;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8451a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.sentry.internal.debugmeta.c f8452d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d5.c f8453g;

    public /* synthetic */ c(io.sentry.internal.debugmeta.c cVar, d5.c cVar2, int i10) {
        this.f8451a = i10;
        this.f8452d = cVar;
        this.f8453g = cVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8451a) {
            case 0:
                io.sentry.internal.debugmeta.c cVar = this.f8452d;
                d5.c cVar2 = this.f8453g;
                d5.w wVar = (d5.w) cVar.f12354g;
                int i10 = a5.d0.f105a;
                d5.z zVar = wVar.f7095a;
                zVar.B0 = cVar2;
                zVar.O.onAudioEnabled(cVar2);
                break;
            default:
                io.sentry.internal.debugmeta.c cVar3 = this.f8452d;
                d5.c cVar4 = this.f8453g;
                cVar3.getClass();
                synchronized (cVar4) {
                }
                d5.w wVar2 = (d5.w) cVar3.f12354g;
                int i11 = a5.d0.f105a;
                d5.z zVar2 = wVar2.f7095a;
                zVar2.O.onAudioDisabled(cVar4);
                zVar2.f7128q0 = null;
                zVar2.B0 = null;
                break;
        }
    }
}
