package r4;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f24159a;

    /* renamed from: b, reason: collision with root package name */
    public float f24160b;

    /* renamed from: c, reason: collision with root package name */
    public int f24161c;

    /* renamed from: d, reason: collision with root package name */
    public int f24162d;

    /* renamed from: e, reason: collision with root package name */
    public float f24163e;

    /* renamed from: f, reason: collision with root package name */
    public float f24164f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24165g;

    /* renamed from: h, reason: collision with root package name */
    public final float f24166h;

    public a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f24159a = i10;
        this.f24160b = m0.a.a(f10, f11, f12);
        this.f24161c = i11;
        this.f24163e = f13;
        this.f24162d = i12;
        this.f24164f = f14;
        this.f24165g = i13;
        d(f15, f11, f12, f14);
        this.f24166h = b(f14);
    }

    public static a c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = length;
                    int i16 = i12;
                    int i17 = i10;
                    int i18 = length2;
                    int i19 = i14;
                    a aVar2 = new a(i17, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f24166h < aVar.f24166h) {
                        if (aVar2.f24166h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i20 = i17 + 1;
                    i14 = i19 + 1;
                    i12 = i16;
                    i10 = i20;
                    length = i15;
                    length2 = i18;
                }
                i12++;
                i10 = i10;
                length = length;
            }
        }
        return aVar;
    }

    public final float a(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = 0.0f;
        }
        float f12 = i11 / 2.0f;
        return (f10 - ((i10 + f12) * f11)) / (i12 + f12);
    }

    public final float b(float f10) {
        if (g()) {
            return Math.abs(f10 - this.f24164f) * this.f24159a;
        }
        return Float.MAX_VALUE;
    }

    public final void d(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f();
        int i10 = this.f24161c;
        if (i10 > 0 && f14 > 0.0f) {
            float f15 = this.f24160b;
            this.f24160b = f15 + Math.min(f14 / i10, f12 - f15);
        } else if (i10 > 0 && f14 < 0.0f) {
            float f16 = this.f24160b;
            this.f24160b = f16 + Math.max(f14 / i10, f11 - f16);
        }
        int i11 = this.f24161c;
        float f17 = i11 > 0 ? this.f24160b : 0.0f;
        this.f24160b = f17;
        float fA = a(f10, i11, f17, this.f24162d, this.f24165g);
        this.f24164f = fA;
        float f18 = (this.f24160b + fA) / 2.0f;
        this.f24163e = f18;
        int i12 = this.f24162d;
        if (i12 <= 0 || fA == f13) {
            return;
        }
        float f19 = (f13 - fA) * this.f24165g;
        float fMin = Math.min(Math.abs(f19), f18 * 0.1f * i12);
        if (f19 > 0.0f) {
            this.f24163e -= fMin / this.f24162d;
            this.f24164f += fMin / this.f24165g;
        } else {
            this.f24163e += fMin / this.f24162d;
            this.f24164f -= fMin / this.f24165g;
        }
    }

    public int e() {
        return this.f24161c + this.f24162d + this.f24165g;
    }

    public final float f() {
        return (this.f24164f * this.f24165g) + (this.f24163e * this.f24162d) + (this.f24160b * this.f24161c);
    }

    public final boolean g() {
        int i10 = this.f24165g;
        if (i10 <= 0 || this.f24161c <= 0 || this.f24162d <= 0) {
            return i10 <= 0 || this.f24161c <= 0 || this.f24164f > this.f24160b;
        }
        float f10 = this.f24164f;
        float f11 = this.f24163e;
        return f10 > f11 && f11 > this.f24160b;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f24159a + ", smallCount=" + this.f24161c + ", smallSize=" + this.f24160b + ", mediumCount=" + this.f24162d + ", mediumSize=" + this.f24163e + ", largeCount=" + this.f24165g + ", largeSize=" + this.f24164f + ", cost=" + this.f24166h + "]";
    }
}
