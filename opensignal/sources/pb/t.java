package pb;

/* loaded from: classes.dex */
public final class t implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20425a;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.t f20426d;

    /* renamed from: g, reason: collision with root package name */
    public String f20427g;

    /* renamed from: r, reason: collision with root package name */
    public final int f20428r;

    /* renamed from: x, reason: collision with root package name */
    public final int f20429x;

    public t(int i10) {
        this.f20425a = i10;
        switch (i10) {
            case 1:
                this.f20426d = new io.sentry.t(27);
                this.f20427g = "exoPlayer";
                this.f20428r = 8000;
                this.f20429x = 8000;
                break;
            default:
                this.f20426d = new io.sentry.t(27);
                this.f20428r = 8000;
                this.f20429x = 8000;
                break;
        }
    }

    @Override // pb.m
    public final n a() {
        switch (this.f20425a) {
            case 0:
                return new u(this.f20427g, this.f20428r, this.f20429x, this.f20426d);
            default:
                return new u(this.f20427g, this.f20428r, this.f20429x, this.f20426d);
        }
    }
}
