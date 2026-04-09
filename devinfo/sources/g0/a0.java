package g0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f24096a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24097b;

    /* renamed from: c, reason: collision with root package name */
    public final float f24098c;

    /* renamed from: d, reason: collision with root package name */
    public final float f24099d;

    public a0(float f10, float f11, float f12, float f13) {
        this.f24096a = f10;
        this.f24097b = f11;
        this.f24098c = f12;
        this.f24099d = f13;
        if (!((f10 >= 0.0f) & (f11 >= 0.0f) & (f12 >= 0.0f)) || !(f13 >= 0.0f)) {
            h0.a.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return d3.f.b(this.f24096a, a0Var.f24096a) && d3.f.b(this.f24097b, a0Var.f24097b) && d3.f.b(this.f24098c, a0Var.f24098c) && d3.f.b(this.f24099d, a0Var.f24099d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24099d) + r5.c.d(this.f24098c, r5.c.d(this.f24097b, Float.floatToIntBits(this.f24096a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) d3.f.c(this.f24096a)) + ", top=" + ((Object) d3.f.c(this.f24097b)) + ", end=" + ((Object) d3.f.c(this.f24098c)) + ", bottom=" + ((Object) d3.f.c(this.f24099d)) + ')';
    }
}
