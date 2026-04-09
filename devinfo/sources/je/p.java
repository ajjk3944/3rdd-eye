package je;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f27588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f27589c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27590d;

    public /* synthetic */ p(q qVar, long j, String str, int i4) {
        this.f27587a = i4;
        this.f27588b = qVar;
        this.f27589c = j;
        this.f27590d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27587a) {
            case 0:
                q qVar = this.f27588b;
                qVar.f27603o.f28259b.a(new p(qVar, this.f27589c, this.f27590d, 1));
                break;
            default:
                m mVar = this.f27588b.g;
                s sVar = mVar.f27579n;
                if (sVar == null || !sVar.f27614e.get()) {
                    ((le.d) mVar.f27575i.f28716b).n(this.f27589c, this.f27590d);
                    break;
                }
                break;
        }
    }
}
