package ed;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends f {

    /* renamed from: t, reason: collision with root package name */
    public final float f23297t;

    public g(float f10) {
        super(0);
        this.f23297t = f10 - 0.001f;
    }

    @Override // ed.f
    public final void m(float f10, float f11, float f12, x xVar) {
        double d10 = this.f23297t;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d10) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d10, 2.0d) - Math.pow(fSqrt, 2.0d));
        xVar.d(f11 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d10) - d10))) + fSqrt2, 270.0f, 0.0f);
        xVar.c(f11, (float) (-((Math.sqrt(2.0d) * d10) - d10)));
        xVar.c(f11 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d10) - d10))) + fSqrt2);
    }
}
