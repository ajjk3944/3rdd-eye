package wg;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f36707b;

    public /* synthetic */ t(a aVar, int i4) {
        this.f36706a = i4;
        this.f36707b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36706a) {
            case 0:
                this.f36707b.f36640a = true;
                break;
            default:
                this.f36707b.f36640a = false;
                break;
        }
    }
}
