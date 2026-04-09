package rb;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21520a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q3.a f21521d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z9.b f21522g;

    public /* synthetic */ t(q3.a aVar, z9.b bVar, int i10) {
        this.f21520a = i10;
        this.f21521d = aVar;
        this.f21522g = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21520a) {
            case 0:
                q3.a aVar = this.f21521d;
                z9.b bVar = this.f21522g;
                aVar.getClass();
                synchronized (bVar) {
                }
                u uVar = (u) aVar.f20680g;
                int i10 = qb.v.f20828a;
                uVar.onVideoDisabled(bVar);
                break;
            default:
                q3.a aVar2 = this.f21521d;
                z9.b bVar2 = this.f21522g;
                u uVar2 = (u) aVar2.f20680g;
                int i11 = qb.v.f20828a;
                uVar2.onVideoEnabled(bVar2);
                break;
        }
    }
}
