package r8;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f21356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21357c;

    public /* synthetic */ n(v vVar, int i10, int i11) {
        this.f21355a = i11;
        this.f21356b = vVar;
        this.f21357c = i10;
    }

    @Override // r8.t
    public final void run() {
        switch (this.f21355a) {
            case 0:
                this.f21356b.o(this.f21357c);
                break;
            case 1:
                this.f21356b.r(this.f21357c);
                break;
            default:
                this.f21356b.n(this.f21357c);
                break;
        }
    }
}
