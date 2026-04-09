package hf;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10688a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f10689d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f10690g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f10691r;

    public /* synthetic */ p(q qVar, long j, String str, int i10) {
        this.f10688a = i10;
        this.f10689d = qVar;
        this.f10690g = j;
        this.f10691r = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10688a) {
            case 0:
                q qVar = this.f10689d;
                qVar.f10704o.f13708b.a(new p(qVar, this.f10690g, this.f10691r, 1));
                break;
            default:
                l lVar = this.f10689d.f10698g;
                s sVar = lVar.f10678n;
                if (sVar == null || !sVar.f10716x.get()) {
                    ((kf.c) lVar.f10675i.f14309d).h(this.f10690g, this.f10691r);
                    break;
                }
                break;
        }
    }
}
