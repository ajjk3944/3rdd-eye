package P6;

/* loaded from: classes3.dex */
public class C implements x {

    /* renamed from: a, reason: collision with root package name */
    private final m f18048a;

    /* renamed from: b, reason: collision with root package name */
    private final q f18049b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18050c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18051d;

    C(m mVar, q qVar, boolean z10, boolean z11) {
        this.f18048a = mVar;
        this.f18049b = qVar;
        this.f18050c = z10;
        this.f18051d = z11;
    }

    private boolean c() {
        if (this.f18050c) {
            return false;
        }
        return !this.f18051d;
    }

    @Override // P6.x
    public boolean a() {
        return !c() || this.f18048a.a();
    }

    @Override // P6.x
    public boolean b() {
        return this.f18049b.a();
    }
}
