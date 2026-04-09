package w;

/* loaded from: classes.dex */
public final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    public final float f24136a;

    /* renamed from: d, reason: collision with root package name */
    public final float f24137d;

    /* renamed from: g, reason: collision with root package name */
    public final float f24138g;

    /* renamed from: r, reason: collision with root package name */
    public final float f24139r;

    public n(float f10, float f11) {
        int iW;
        this.f24136a = f10;
        this.f24137d = f11;
        if (Float.isNaN(f10) || Float.isNaN(0.0f) || Float.isNaN(f11) || Float.isNaN(1.0f)) {
            v.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", 0.0, " + f11 + ", 1.0.");
        }
        float[] fArr = new float[5];
        double d6 = 0.0f;
        double d10 = 3.0f;
        double d11 = 0.0f;
        double d12 = d10 * 2.0d;
        double d13 = (d6 - d12) + d11;
        if (d13 == 0.0d) {
            iW = d10 == d11 ? 0 : g1.f0.w((float) ((d12 - d11) / (d12 - (d11 * 2.0d))), fArr, 0);
        } else {
            double d14 = -Math.sqrt((d10 * d10) - (d11 * d6));
            double d15 = (-d6) + d10;
            int iW2 = g1.f0.w((float) ((-(d14 + d15)) / d13), fArr, 0);
            iW = g1.f0.w((float) ((d14 - d15) / d13), fArr, iW2) + iW2;
            if (iW > 1) {
                float f12 = fArr[0];
                float f13 = fArr[1];
                if (f12 > f13) {
                    fArr[0] = f13;
                    fArr[1] = f12;
                } else if (f12 == f13) {
                    iW--;
                }
            }
        }
        int iW3 = g1.f0.w(0.5f, fArr, iW) + iW;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i10 = 0; i10 < iW3; i10++) {
            float f14 = fArr[i10];
            float f15 = ((((((-2.0f) * f14) + 3.0f) * f14) + 0.0f) * f14) + 0.0f;
            fMin = Math.min(fMin, f15);
            fMax = Math.max(fMax, f15);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fMin) << 32) | (Float.floatToRawIntBits(fMax) & 4294967295L);
        this.f24138g = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f24139r = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e A[PHI: r3
  0x008e: PHI (r3v24 float) = (r3v5 float), (r3v12 float), (r3v18 float), (r3v28 float), (r3v34 float) binds: [B:123:0x022b, B:113:0x01fd, B:89:0x01b5, B:45:0x00df, B:21:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e A[PHI: r12
  0x015e: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:66:0x015c, B:79:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // w.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r27) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.n.a(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f24136a == nVar.f24136a && this.f24137d == nVar.f24137d;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + g.a(g.a(Float.hashCode(this.f24136a) * 31, 0.0f, 31), this.f24137d, 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.f24136a + ", b=0.0, c=" + this.f24137d + ", d=1.0)";
    }
}
