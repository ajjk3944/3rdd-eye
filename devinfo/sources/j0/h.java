package j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f26899a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26900b;

    /* renamed from: c, reason: collision with root package name */
    public final i0.f f26901c;

    public h(int i4, int i10, i0.f fVar) {
        this.f26899a = i4;
        this.f26900b = i10;
        this.f26901c = fVar;
        if (i4 < 0) {
            f0.a.a("startIndex should be >= 0");
        }
        if (i10 > 0) {
            return;
        }
        f0.a.a("size should be > 0");
    }
}
