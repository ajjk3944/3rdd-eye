package oh;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19482a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f19483d;

    public /* synthetic */ q(t tVar, int i10) {
        this.f19482a = i10;
        this.f19483d = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.f19482a) {
            case 0:
                o2.g gVar = new o2.g(2, this);
                t tVar = this.f19483d;
                tVar.B0 = gVar;
                while (tVar.C0) {
                    tVar.G(4, null);
                    io.sentry.config.a.h0(1000L);
                }
                break;
            case 1:
                p pVar = new p(0, this);
                while (!Thread.currentThread().isInterrupted()) {
                    io.sentry.config.a.h0(100L);
                    this.f19483d.E(pVar);
                }
                break;
            case 2:
                t tVar2 = this.f19483d;
                s sVar = new s(this, tVar2.f19498i0, 0);
                tVar2.f19501l0 = sVar;
                sVar.start();
                break;
            case 3:
                t tVar3 = this.f19483d;
                s sVar2 = new s(this, tVar3.f19497h0, 1);
                tVar3.f19502m0 = sVar2;
                sVar2.start();
                break;
            default:
                t tVar4 = this.f19483d;
                s sVar3 = new s(this, tVar4.f19499j0, 2);
                tVar4.f19503n0 = sVar3;
                sVar3.start();
                break;
        }
    }
}
