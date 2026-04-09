package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class jb0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f29046a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f29047b;

        /* renamed from: c, reason: collision with root package name */
        public final int f29048c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f29049d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f29050e;

        /* renamed from: f, reason: collision with root package name */
        public final long f29051f;

        public /* synthetic */ a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j4, int i10) {
            this(jArr, iArr, i, jArr2, iArr2, j4);
        }

        private a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j4) {
            this.f29046a = jArr;
            this.f29047b = iArr;
            this.f29048c = i;
            this.f29049d = jArr2;
            this.f29050e = iArr2;
            this.f29051f = j4;
        }
    }

    public static a a(int i, long[] jArr, int[] iArr, long j4) {
        int i10 = 1;
        int i11 = 8192 / i;
        int i12 = 0;
        for (int i13 : iArr) {
            int i14 = s82.f32899a;
            i12 += ((i13 + i11) - 1) / i11;
        }
        long[] jArr2 = new long[i12];
        int[] iArr2 = new int[i12];
        long[] jArr3 = new long[i12];
        int[] iArr3 = new int[i12];
        int i15 = 0;
        int i16 = 0;
        int iMax = 0;
        for (int i17 = 0; i17 < iArr.length; i17 += i10) {
            int i18 = iArr[i17];
            long j10 = jArr[i17];
            while (i18 > 0) {
                int iMin = Math.min(i11, i18);
                jArr2[i16] = j10;
                int i19 = i * iMin;
                iArr2[i16] = i19;
                iMax = Math.max(iMax, i19);
                int i20 = i10;
                jArr3[i16] = i15 * j4;
                iArr3[i16] = i20;
                j10 += iArr2[i16];
                i15 += iMin;
                i18 -= iMin;
                i16 += i20;
                i10 = i20;
                i11 = i11;
            }
        }
        return new a(jArr2, iArr2, iMax, jArr3, iArr3, j4 * i15, 0);
    }
}
