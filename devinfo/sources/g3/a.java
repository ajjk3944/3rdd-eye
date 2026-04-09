package g3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mk.a f24452b;

    public /* synthetic */ a(int i4, mk.a aVar) {
        this.f24451a = i4;
        this.f24452b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24451a) {
            case 0:
                this.f24452b.invoke();
                break;
            case 1:
                this.f24452b.invoke();
                break;
            case 2:
                this.f24452b.invoke();
                break;
            default:
                this.f24452b.invoke();
                break;
        }
    }
}
