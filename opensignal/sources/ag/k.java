package ag;

/* loaded from: classes.dex */
public final class k implements xf.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f360a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f361b = false;

    /* renamed from: c, reason: collision with root package name */
    public xf.c f362c;

    /* renamed from: d, reason: collision with root package name */
    public final i f363d;

    public k(i iVar) {
        this.f363d = iVar;
    }

    @Override // xf.g
    public final xf.g f(String str) {
        if (this.f360a) {
            throw new xf.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f360a = true;
        this.f363d.i(this.f362c, str, this.f361b);
        return this;
    }

    @Override // xf.g
    public final xf.g g(boolean z10) {
        if (this.f360a) {
            throw new xf.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f360a = true;
        this.f363d.g(this.f362c, z10 ? 1 : 0, this.f361b);
        return this;
    }
}
