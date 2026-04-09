package wg;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f36663b;

    public /* synthetic */ f(g gVar, int i4) {
        this.f36662a = i4;
        this.f36663b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36662a) {
            case 0:
                s sVar = s.f36694b;
                g gVar = this.f36663b;
                gVar.j(sVar);
                gVar.j(s.f36695c);
                gVar.j(s.f36696d);
                gVar.j(s.f36697e);
                gVar.j(s.f36698f);
                gVar.j(s.f36699h);
                gVar.j(s.g);
                gVar.j(s.f36702l);
                gVar.f36673m.postDelayed(this, 800L);
                break;
            case 1:
                this.f36663b.f36640a = true;
                break;
            default:
                this.f36663b.f36640a = false;
                break;
        }
    }
}
