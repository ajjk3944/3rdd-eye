package wt;

/* loaded from: classes.dex */
public final class f0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24614a;

    public f0(boolean z10) {
        this.f24614a = z10;
    }

    @Override // wt.p0
    public final boolean b() {
        return this.f24614a;
    }

    @Override // wt.p0
    public final e1 d() {
        return null;
    }

    public final String toString() {
        return h0.b.r(new StringBuilder("Empty{"), this.f24614a ? "Active" : "New", '}');
    }
}
