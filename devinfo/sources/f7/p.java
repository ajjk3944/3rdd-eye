package f7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23781a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f23782b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23783c;

    public /* synthetic */ p(x xVar, String str, int i4) {
        this.f23781a = i4;
        this.f23782b = xVar;
        this.f23783c = str;
    }

    @Override // f7.w
    public final void run() {
        switch (this.f23781a) {
            case 0:
                this.f23782b.r(this.f23783c);
                break;
            case 1:
                this.f23782b.q(this.f23783c);
                break;
            default:
                this.f23782b.t(this.f23783c);
                break;
        }
    }
}
