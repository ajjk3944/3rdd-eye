package qc;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public float f32238a;

    /* renamed from: b, reason: collision with root package name */
    public float f32239b;

    public z.c a(float f10) {
        double dB = b(f10);
        double d10 = z.d.f37797a;
        double d11 = d10 - 1.0d;
        return new z.c(f10, (float) (Math.exp((d10 / d11) * dB) * this.f32238a * this.f32239b), (long) (Math.exp(dB / d11) * 1000.0d));
    }

    public double b(float f10) {
        float[] fArr = z.b.f37793a;
        return Math.log((Math.abs(f10) * 0.35f) / (this.f32238a * this.f32239b));
    }
}
