package je;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f27584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.consent_sdk.d f27585c;

    public /* synthetic */ n(q qVar, com.google.android.gms.internal.consent_sdk.d dVar, int i4) {
        this.f27583a = i4;
        this.f27584b = qVar;
        this.f27585c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27583a) {
            case 0:
                this.f27584b.a(this.f27585c);
                break;
            default:
                this.f27584b.a(this.f27585c);
                break;
        }
    }
}
