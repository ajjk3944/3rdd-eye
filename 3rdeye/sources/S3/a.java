package S3;

/* compiled from: Arrangement.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f11889a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11890b;

    /* renamed from: c, reason: collision with root package name */
    public int f11891c;

    /* renamed from: d, reason: collision with root package name */
    public int f11892d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11893e;

    /* renamed from: f, reason: collision with root package name */
    public final float f11894f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11895g;

    /* renamed from: h, reason: collision with root package name */
    public final float f11896h;

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(int r4, float r5, float r6, float r7, int r8, float r9, int r10, float r11, int r12, float r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.a.<init>(int, float, float, float, int, float, int, float, int, float):void");
    }

    public static a a(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i = 1;
        for (int i10 : iArr3) {
            int length = iArr2.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = iArr2[i11];
                int length2 = iArr.length;
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = length;
                    int i15 = i11;
                    int i16 = i;
                    int i17 = length2;
                    int i18 = i13;
                    a aVar2 = new a(i16, f11, f12, f13, iArr[i13], f14, i12, f15, i10, f10);
                    float f16 = aVar2.f11896h;
                    if (aVar == null || f16 < aVar.f11896h) {
                        if (f16 == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i19 = i16 + 1;
                    i13 = i18 + 1;
                    i11 = i15;
                    i = i19;
                    length = i14;
                    length2 = i17;
                }
                i11++;
                i = i;
                length = length;
            }
        }
        return aVar;
    }

    public final String toString() {
        return "Arrangement [priority=" + this.f11889a + ", smallCount=" + this.f11891c + ", smallSize=" + this.f11890b + ", mediumCount=" + this.f11892d + ", mediumSize=" + this.f11893e + ", largeCount=" + this.f11895g + ", largeSize=" + this.f11894f + ", cost=" + this.f11896h + "]";
    }
}
