package a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t implements w {

    /* renamed from: a, reason: collision with root package name */
    public final float f120a;

    /* renamed from: b, reason: collision with root package name */
    public final float f121b;

    /* renamed from: c, reason: collision with root package name */
    public final float f122c;

    /* renamed from: d, reason: collision with root package name */
    public final float f123d;

    public t(float f10, float f11) {
        int iY;
        this.f120a = f10;
        this.f121b = f11;
        if (Float.isNaN(f10) || Float.isNaN(0.0f) || Float.isNaN(f11) || Float.isNaN(1.0f)) {
            i0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", 0.0, " + f11 + ", 1.0.");
        }
        float[] fArr = new float[5];
        double d10 = 0.0f;
        double d11 = 3.0f;
        double d12 = 0.0f;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            iY = d11 == d12 ? 0 : p1.z.y((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, 0);
        } else {
            double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
            double d16 = (-d10) + d11;
            int iY2 = p1.z.y((float) ((-(d15 + d16)) / d14), fArr, 0);
            iY = p1.z.y((float) ((d15 - d16) / d14), fArr, iY2) + iY2;
            if (iY > 1) {
                float f12 = fArr[0];
                float f13 = fArr[1];
                if (f12 > f13) {
                    fArr[0] = f13;
                    fArr[1] = f12;
                } else if (f12 == f13) {
                    iY--;
                }
            }
        }
        int iY3 = p1.z.y(0.5f, fArr, iY) + iY;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i4 = 0; i4 < iY3; i4++) {
            float f14 = fArr[i4];
            float f15 = ((((((-2.0f) * f14) + 3.0f) * f14) + 0.0f) * f14) + 0.0f;
            fMin = Math.min(fMin, f15);
            fMax = Math.max(fMax, f15);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fMin) << 32) | (Float.floatToRawIntBits(fMax) & 4294967295L);
        this.f122c = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f123d = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e A[PHI: r3
  0x008e: PHI (r3v24 float) = (r3v5 float), (r3v12 float), (r3v18 float), (r3v28 float), (r3v34 float) binds: [B:123:0x022b, B:113:0x01fd, B:89:0x01b5, B:45:0x00df, B:21:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e A[PHI: r12
  0x015e: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:66:0x015c, B:79:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a0.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r27) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.t.a(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f120a == tVar.f120a && this.f121b == tVar.f121b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f) + r5.c.d(this.f121b, r5.c.d(0.0f, Float.floatToIntBits(this.f120a) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.f120a + ", b=0.0, c=" + this.f121b + ", d=1.0)";
    }
}
