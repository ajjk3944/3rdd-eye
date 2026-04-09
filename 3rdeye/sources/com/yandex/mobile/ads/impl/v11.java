package com.yandex.mobile.ads.impl;

import N7.C1094a9;

/* loaded from: classes3.dex */
public final class v11 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f34270a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f34271b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f34272c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f34273d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f34274e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f34275f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f34276g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f34277a;

        /* renamed from: b, reason: collision with root package name */
        public String f34278b;

        /* renamed from: c, reason: collision with root package name */
        public int f34279c;

        /* renamed from: d, reason: collision with root package name */
        public int f34280d;

        /* renamed from: e, reason: collision with root package name */
        public int f34281e;

        /* renamed from: f, reason: collision with root package name */
        public int f34282f;

        /* renamed from: g, reason: collision with root package name */
        public int f34283g;

        /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(int r9) {
            /*
                Method dump skipped, instructions count: 194
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.v11.a.a(int):boolean");
        }
    }

    public static int a(int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        if ((i & (-2097152)) != -2097152 || (i10 = (i >>> 19) & 3) == 1 || (i11 = (i >>> 17) & 3) == 0 || (i12 = (i >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i14 = f34271b[i13];
        if (i10 == 2) {
            i14 /= 2;
        } else if (i10 == 0) {
            i14 /= 4;
        }
        int i15 = (i >>> 9) & 1;
        if (i11 == 3) {
            return ((((i10 == 3 ? f34272c[i12 - 1] : f34273d[i12 - 1]) * 12) / i14) + i15) * 4;
        }
        int i16 = i10 == 3 ? i11 == 2 ? f34274e[i12 - 1] : f34275f[i12 - 1] : f34276g[i12 - 1];
        if (i10 == 3) {
            return C1094a9.d(i16, 144, i14, i15);
        }
        return C1094a9.d(i11 == 1 ? 72 : 144, i16, i14, i15);
    }

    public static int b(int i) {
        int i10;
        int i11;
        if ((i & (-2097152)) != -2097152 || (i10 = (i >>> 19) & 3) == 1 || (i11 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i12 = (i >>> 12) & 15;
        int i13 = (i >>> 10) & 3;
        if (i12 != 0 && i12 != 15 && i13 != 3) {
            if (i11 == 1) {
                return i10 == 3 ? 1152 : 576;
            }
            if (i11 == 2) {
                return 1152;
            }
            if (i11 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        }
        return -1;
    }
}
