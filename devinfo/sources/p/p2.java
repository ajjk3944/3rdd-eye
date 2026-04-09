package p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f30817b;

    public /* synthetic */ p2(z2 z2Var, int i4) {
        this.f30816a = i4;
        this.f30817b = z2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30816a) {
            case 0:
                this.f30817b.s();
                break;
            default:
                k4.a aVar = this.f30817b.Q;
                if (aVar instanceof b3) {
                    aVar.b(null);
                    break;
                }
                break;
        }
    }
}
