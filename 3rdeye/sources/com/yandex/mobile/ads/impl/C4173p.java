package com.yandex.mobile.ads.impl;

import com.google.android.gms.ads.AdRequest;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.yandex.mobile.ads.impl.dc0;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4173p {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f31541a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f31542b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f31543c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f31544d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f31545e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, Sdk$SDKError.b.WEBVIEW_ERROR_VALUE, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f31546f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: com.yandex.mobile.ads.impl.p$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f31547a;

        /* renamed from: b, reason: collision with root package name */
        public final int f31548b;

        /* renamed from: c, reason: collision with root package name */
        public final int f31549c;

        /* renamed from: d, reason: collision with root package name */
        public final int f31550d;

        /* renamed from: e, reason: collision with root package name */
        public final int f31551e;

        public /* synthetic */ a(int i, int i10, int i11, int i12, int i13, String str) {
            this(str, i, i10, i11, i12);
        }

        private a(String str, int i, int i10, int i11, int i12) {
            this.f31547a = str;
            this.f31549c = i;
            this.f31548b = i10;
            this.f31550d = i11;
            this.f31551e = i12;
        }
    }

    private static int a(int i, int i10) {
        int i11 = i10 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f31542b;
        if (i >= 3 || i10 < 0) {
            return -1;
        }
        int[] iArr2 = f31546f;
        if (i11 >= 19) {
            return -1;
        }
        int i12 = iArr[i];
        if (i12 == 44100) {
            return ((i10 % 2) + iArr2[i11]) * 2;
        }
        int i13 = f31545e[i11];
        return i12 == 32000 ? i13 * 6 : i13 * 4;
    }

    public static dc0 b(uf1 uf1Var, String str, String str2, a40 a40Var) {
        uf1Var.f(2);
        int i = f31542b[(uf1Var.t() & 192) >> 6];
        int iT = uf1Var.t();
        int i10 = f31544d[(iT & 14) >> 1];
        if ((iT & 1) != 0) {
            i10++;
        }
        if (((uf1Var.t() & 30) >> 1) > 0 && (2 & uf1Var.t()) != 0) {
            i10 += 2;
        }
        return new dc0.a().b(str).e((uf1Var.a() <= 0 || (uf1Var.t() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").c(i10).l(i).a(a40Var).d(str2).a();
    }

    public static dc0 a(uf1 uf1Var, String str, String str2, a40 a40Var) {
        int i = f31542b[(uf1Var.t() & 192) >> 6];
        int iT = uf1Var.t();
        int i10 = f31544d[(iT & 56) >> 3];
        if ((iT & 4) != 0) {
            i10++;
        }
        return new dc0.a().b(str).e("audio/ac3").c(i10).l(i).a(a40Var).d(str2).a();
    }

    public static int a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f31541a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static a a(tf1 tf1Var) {
        int i;
        String str;
        int i10;
        int i11;
        int i12;
        int iB;
        int i13;
        int i14;
        int i15;
        String str2;
        int i16;
        int i17;
        int iE = tf1Var.e();
        tf1Var.d(40);
        boolean z10 = tf1Var.b(5) > 10;
        tf1Var.c(iE);
        if (z10) {
            tf1Var.d(16);
            int iB2 = tf1Var.b(2);
            if (iB2 == 0) {
                i = 0;
            } else if (iB2 == 1) {
                i = 1;
            } else if (iB2 == 2) {
                i = 2;
            }
            tf1Var.d(3);
            int iB3 = (tf1Var.b(11) + 1) * 2;
            int iB4 = tf1Var.b(2);
            if (iB4 == 3) {
                i14 = f31543c[tf1Var.b(2)];
                i13 = 6;
                iB = 3;
            } else {
                iB = tf1Var.b(2);
                i13 = f31541a[iB];
                i14 = f31542b[iB4];
            }
            int i18 = i13 * 256;
            int iB5 = tf1Var.b(3);
            boolean zF = tf1Var.f();
            int i19 = f31544d[iB5] + (zF ? 1 : 0);
            tf1Var.d(10);
            if (tf1Var.f()) {
                tf1Var.d(8);
            }
            if (iB5 == 0) {
                tf1Var.d(5);
                if (tf1Var.f()) {
                    tf1Var.d(8);
                }
            }
            if (i == 1 && tf1Var.f()) {
                tf1Var.d(16);
            }
            if (tf1Var.f()) {
                if (iB5 > 2) {
                    tf1Var.d(2);
                }
                if ((iB5 & 1) == 0 || iB5 <= 2) {
                    i16 = 6;
                } else {
                    i16 = 6;
                    tf1Var.d(6);
                }
                if ((iB5 & 4) != 0) {
                    tf1Var.d(i16);
                }
                if (zF && tf1Var.f()) {
                    tf1Var.d(5);
                }
                if (i == 0) {
                    if (tf1Var.f()) {
                        i17 = 6;
                        tf1Var.d(6);
                    } else {
                        i17 = 6;
                    }
                    if (iB5 == 0 && tf1Var.f()) {
                        tf1Var.d(i17);
                    }
                    if (tf1Var.f()) {
                        tf1Var.d(i17);
                    }
                    int iB6 = tf1Var.b(2);
                    if (iB6 == 1) {
                        tf1Var.d(5);
                    } else if (iB6 == 2) {
                        tf1Var.d(12);
                    } else if (iB6 == 3) {
                        int iB7 = tf1Var.b(5);
                        if (tf1Var.f()) {
                            tf1Var.d(5);
                            if (tf1Var.f()) {
                                tf1Var.d(4);
                            }
                            if (tf1Var.f()) {
                                tf1Var.d(4);
                            }
                            if (tf1Var.f()) {
                                tf1Var.d(4);
                            }
                            if (tf1Var.f()) {
                                tf1Var.d(4);
                            }
                            if (tf1Var.f()) {
                                tf1Var.d(4);
                            }
                            if (tf1Var.f()) {
                                tf1Var.d(4);
                            }
                            if (tf1Var.f()) {
                                tf1Var.d(4);
                            }
                            if (tf1Var.f()) {
                                if (tf1Var.f()) {
                                    tf1Var.d(4);
                                }
                                if (tf1Var.f()) {
                                    tf1Var.d(4);
                                }
                            }
                        }
                        if (tf1Var.f()) {
                            tf1Var.d(5);
                            if (tf1Var.f()) {
                                tf1Var.d(7);
                                if (tf1Var.f()) {
                                    tf1Var.d(8);
                                }
                            }
                        }
                        tf1Var.d((iB7 + 2) * 8);
                        tf1Var.c();
                    }
                    if (iB5 < 2) {
                        if (tf1Var.f()) {
                            tf1Var.d(14);
                        }
                        if (iB5 == 0 && tf1Var.f()) {
                            tf1Var.d(14);
                        }
                    }
                    if (tf1Var.f()) {
                        if (iB == 0) {
                            tf1Var.d(5);
                        } else {
                            for (int i20 = 0; i20 < i13; i20++) {
                                if (tf1Var.f()) {
                                    tf1Var.d(5);
                                }
                            }
                        }
                    }
                }
            }
            if (tf1Var.f()) {
                tf1Var.d(5);
                if (iB5 == 2) {
                    tf1Var.d(4);
                }
                if (iB5 >= 6) {
                    tf1Var.d(2);
                }
                if (tf1Var.f()) {
                    tf1Var.d(8);
                }
                if (iB5 == 0 && tf1Var.f()) {
                    tf1Var.d(8);
                }
                if (iB4 < 3) {
                    tf1Var.h();
                }
            }
            if (i == 0 && iB != 3) {
                tf1Var.h();
            }
            if (i == 2 && (iB == 3 || tf1Var.f())) {
                i15 = 6;
                tf1Var.d(6);
            } else {
                i15 = 6;
            }
            if (tf1Var.f() && tf1Var.b(i15) == 1 && tf1Var.b(8) == 1) {
                str2 = "audio/eac3-joc";
            } else {
                str2 = "audio/eac3";
            }
            str = str2;
            i10 = i18;
            i = i14;
            i12 = i19;
            i11 = iB3;
        } else {
            tf1Var.d(32);
            int iB8 = tf1Var.b(2);
            String str3 = iB8 == 3 ? null : "audio/ac3";
            int iA = a(iB8, tf1Var.b(6));
            tf1Var.d(8);
            int iB9 = tf1Var.b(3);
            if ((iB9 & 1) != 0 && iB9 != 1) {
                tf1Var.d(2);
            }
            if ((iB9 & 4) != 0) {
                tf1Var.d(2);
            }
            if (iB9 == 2) {
                tf1Var.d(2);
            }
            i = iB8 < 3 ? f31542b[iB8] : -1;
            str = str3;
            i10 = 1536;
            i11 = iA;
            i12 = f31544d[iB9] + (tf1Var.f() ? 1 : 0);
        }
        return new a(i12, i, i11, i10, 0, str);
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return a((b10 & 192) >> 6, b10 & 63);
    }
}
