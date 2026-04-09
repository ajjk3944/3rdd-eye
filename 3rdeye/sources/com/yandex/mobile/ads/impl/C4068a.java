package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4068a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f24347a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f24348b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: com.yandex.mobile.ads.impl.a$a, reason: collision with other inner class name */
    public static final class C0399a {

        /* renamed from: a, reason: collision with root package name */
        public final int f24349a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24350b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24351c;

        public /* synthetic */ C0399a(int i, int i10, String str, int i11) {
            this(i, i10, str);
        }

        private C0399a(int i, int i10, String str) {
            this.f24349a = i;
            this.f24350b = i10;
            this.f24351c = str;
        }
    }

    public static C0399a a(tf1 tf1Var, boolean z10) throws yf1 {
        int iB;
        int iB2;
        int iB3 = tf1Var.b(5);
        if (iB3 == 31) {
            iB3 = tf1Var.b(6) + 32;
        }
        int iB4 = tf1Var.b(4);
        if (iB4 == 15) {
            iB = tf1Var.b(24);
        } else {
            if (iB4 >= 13) {
                throw yf1.a((String) null, (Exception) null);
            }
            iB = f24347a[iB4];
        }
        int iB5 = tf1Var.b(4);
        String strA = fe.a("mp4a.40.", iB3);
        if (iB3 == 5 || iB3 == 29) {
            int iB6 = tf1Var.b(4);
            if (iB6 == 15) {
                iB2 = tf1Var.b(24);
            } else {
                if (iB6 >= 13) {
                    throw yf1.a((String) null, (Exception) null);
                }
                iB2 = f24347a[iB6];
            }
            iB = iB2;
            int iB7 = tf1Var.b(5);
            if (iB7 == 31) {
                iB7 = tf1Var.b(6) + 32;
            }
            iB3 = iB7;
            if (iB3 == 22) {
                iB5 = tf1Var.b(4);
            }
        }
        if (z10) {
            if (iB3 != 6 && iB3 != 7 && iB3 != 17 && iB3 != 1 && iB3 != 2 && iB3 != 3 && iB3 != 4) {
                switch (iB3) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw yf1.a("Unsupported audio object type: " + iB3);
                }
            }
            if (tf1Var.f()) {
                rs0.d("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (tf1Var.f()) {
                tf1Var.d(14);
            }
            boolean zF = tf1Var.f();
            if (iB5 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iB3 == 6 || iB3 == 20) {
                tf1Var.d(3);
            }
            if (zF) {
                if (iB3 == 22) {
                    tf1Var.d(16);
                }
                if (iB3 == 17 || iB3 == 19 || iB3 == 20 || iB3 == 23) {
                    tf1Var.d(3);
                }
                tf1Var.d(1);
            }
            switch (iB3) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iB8 = tf1Var.b(2);
                    if (iB8 == 2 || iB8 == 3) {
                        throw yf1.a("Unsupported epConfig: " + iB8);
                    }
            }
        }
        int i = f24348b[iB5];
        if (i != -1) {
            return new C0399a(iB, i, strA, 0);
        }
        throw yf1.a((String) null, (Exception) null);
    }
}
