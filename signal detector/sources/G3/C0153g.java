package G3;

/* renamed from: G3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153g extends C0152f {

    /* renamed from: b, reason: collision with root package name */
    public final float f1559b;

    public C0153g(float f2) {
        super(0);
        this.f1559b = f2 - 0.001f;
    }

    @Override // G3.C0152f
    public final void k(float f2, float f5, float f6, y yVar) {
        double d6 = this.f1559b;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d6) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d6, 2.0d) - Math.pow(fSqrt, 2.0d));
        yVar.d(f5 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d6) - d6))) + fSqrt2, 270.0f, 0.0f);
        yVar.c(f5, (float) (-((Math.sqrt(2.0d) * d6) - d6)));
        yVar.c(f5 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d6) - d6))) + fSqrt2);
    }
}
