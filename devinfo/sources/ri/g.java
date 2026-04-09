package ri;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32974a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ si.a f32975b;

    public /* synthetic */ g(si.a aVar, int i4) {
        this.f32974a = i4;
        this.f32975b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32974a) {
            case 0:
                this.f32975b.c();
                break;
            case 1:
                this.f32975b.cancel();
                break;
            case 2:
                this.f32975b.c();
                break;
            default:
                this.f32975b.c();
                break;
        }
    }
}
