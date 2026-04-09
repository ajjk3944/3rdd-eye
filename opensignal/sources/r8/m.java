package r8;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f21353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21354c;

    public /* synthetic */ m(v vVar, String str, int i10) {
        this.f21352a = i10;
        this.f21353b = vVar;
        this.f21354c = str;
    }

    @Override // r8.t
    public final void run() {
        switch (this.f21352a) {
            case 0:
                this.f21353b.q(this.f21354c);
                break;
            case 1:
                this.f21353b.p(this.f21354c);
                break;
            default:
                this.f21353b.s(this.f21354c);
                break;
        }
    }
}
