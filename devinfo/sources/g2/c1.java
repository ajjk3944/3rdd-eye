package g2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final yb.i f24313a;

    /* renamed from: b, reason: collision with root package name */
    public f0 f24314b;

    /* renamed from: c, reason: collision with root package name */
    public final b1 f24315c = new b1(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public final b1 f24316d = new b1(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final b1 f24317e = new b1(this, 1);

    public c1(yb.i iVar) {
        this.f24313a = iVar;
    }

    public final f0 a() {
        f0 f0Var = this.f24314b;
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
