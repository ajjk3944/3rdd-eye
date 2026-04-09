package jg;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f27644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27645c;

    public /* synthetic */ a(c cVar, int i4, int i10) {
        this.f27643a = i10;
        this.f27644b = cVar;
        this.f27645c = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27643a) {
            case 0:
                this.f27644b.notifyItemChanged(this.f27645c, 0);
                break;
            default:
                this.f27644b.notifyItemChanged(this.f27645c, 0);
                break;
        }
    }
}
