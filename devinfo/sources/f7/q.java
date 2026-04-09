package f7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f23785b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23786c;

    public /* synthetic */ q(x xVar, int i4, int i10) {
        this.f23784a = i10;
        this.f23785b = xVar;
        this.f23786c = i4;
    }

    @Override // f7.w
    public final void run() {
        switch (this.f23784a) {
            case 0:
                this.f23785b.p(this.f23786c);
                break;
            case 1:
                this.f23785b.s(this.f23786c);
                break;
            default:
                this.f23785b.o(this.f23786c);
                break;
        }
    }
}
