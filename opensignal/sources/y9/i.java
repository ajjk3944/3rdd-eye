package y9;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25926a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xr.a f25927d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z9.b f25928g;

    public /* synthetic */ i(xr.a aVar, z9.b bVar, int i10) {
        this.f25926a = i10;
        this.f25927d = aVar;
        this.f25928g = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25926a) {
            case 0:
                xr.a aVar = this.f25927d;
                z9.b bVar = this.f25928g;
                j jVar = (j) aVar.f25483g;
                int i10 = qb.v.f20828a;
                jVar.onAudioEnabled(bVar);
                break;
            default:
                xr.a aVar2 = this.f25927d;
                z9.b bVar2 = this.f25928g;
                aVar2.getClass();
                synchronized (bVar2) {
                }
                j jVar2 = (j) aVar2.f25483g;
                int i11 = qb.v.f20828a;
                jVar2.onAudioDisabled(bVar2);
                break;
        }
    }
}
