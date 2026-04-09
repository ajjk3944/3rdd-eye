package y9;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25923a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xr.a f25924d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Exception f25925g;

    public /* synthetic */ h(xr.a aVar, Exception exc, int i10) {
        this.f25923a = i10;
        this.f25924d = aVar;
        this.f25925g = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25923a;
        Exception exc = this.f25925g;
        xr.a aVar = this.f25924d;
        switch (i10) {
            case 0:
                j jVar = (j) aVar.f25483g;
                int i11 = qb.v.f20828a;
                jVar.onAudioCodecError(exc);
                break;
            default:
                j jVar2 = (j) aVar.f25483g;
                int i12 = qb.v.f20828a;
                jVar2.onAudioSinkError(exc);
                break;
        }
    }
}
