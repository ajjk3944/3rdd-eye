package o1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f30360a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f30361b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f30362c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f30363d = 0.0f;

    public final void a(float f10, float f11, float f12, float f13) {
        this.f30360a = Math.max(f10, this.f30360a);
        this.f30361b = Math.max(f11, this.f30361b);
        this.f30362c = Math.min(f12, this.f30362c);
        this.f30363d = Math.min(f13, this.f30363d);
    }

    public final boolean b() {
        return (this.f30360a >= this.f30362c) | (this.f30361b >= this.f30363d);
    }

    public final void c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.f30360a += fIntBitsToFloat;
        this.f30361b += fIntBitsToFloat2;
        this.f30362c += fIntBitsToFloat;
        this.f30363d += fIntBitsToFloat2;
    }

    public final String toString() {
        return "MutableRect(" + com.bumptech.glide.c.u(this.f30360a) + ", " + com.bumptech.glide.c.u(this.f30361b) + ", " + com.bumptech.glide.c.u(this.f30362c) + ", " + com.bumptech.glide.c.u(this.f30363d) + ')';
    }
}
