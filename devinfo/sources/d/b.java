package d;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f21576b;

    public /* synthetic */ b(j jVar, int i4) {
        this.f21575a = i4;
        this.f21576b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21575a) {
            case 0:
                this.f21576b.invalidateOptionsMenu();
                break;
            default:
                j.k(this.f21576b);
                break;
        }
    }
}
