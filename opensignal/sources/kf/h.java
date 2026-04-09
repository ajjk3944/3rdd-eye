package kf;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f14312c = new h(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f14313a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14314b;

    public h(int i10, int i11) {
        this.f14313a = i10;
        this.f14314b = i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f14313a);
        sb2.append(", length = ");
        return h0.b.i(this.f14314b, "]", sb2);
    }
}
