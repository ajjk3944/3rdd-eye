package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class ls {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13609a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f13586b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f13587c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f13588d = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f13589e = {44100, 48000, 32000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f13590f = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] g = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f13591h = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f13592i = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] j = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: k, reason: collision with root package name */
    public static final ah f13593k = new ah(0);

    /* renamed from: l, reason: collision with root package name */
    public static final oa f13594l = new oa("gads:pan:experiment_id", "", 4);

    /* renamed from: m, reason: collision with root package name */
    public static final ah f13595m = new ah(11);

    /* renamed from: n, reason: collision with root package name */
    public static final ah f13596n = new ah(15);

    /* renamed from: o, reason: collision with root package name */
    public static final ah f13597o = new ah(27);

    /* renamed from: p, reason: collision with root package name */
    public static final o90 f13598p = new o90(1);

    /* renamed from: q, reason: collision with root package name */
    public static final o90 f13599q = new o90(9);

    /* renamed from: r, reason: collision with root package name */
    public static final o90 f13600r = new o90(14);

    /* renamed from: s, reason: collision with root package name */
    public static final o90 f13601s = new o90(18);

    /* renamed from: t, reason: collision with root package name */
    public static final Object f13602t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static final o90 f13603u = new o90(27);

    /* renamed from: v, reason: collision with root package name */
    public static final lo0 f13604v = new lo0(4);

    /* renamed from: w, reason: collision with root package name */
    public static final lo0 f13605w = new lo0(8);

    /* renamed from: x, reason: collision with root package name */
    public static final lo0 f13606x = new lo0(12);

    /* renamed from: y, reason: collision with root package name */
    public static final lo0 f13607y = new lo0(15);

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f13608z = {0, 0, 0, 1};
    public static final float[] A = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object B = new Object();
    public static int[] C = new int[10];
    public static final int[] D = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] E = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] F = {67108863, 33554431};
    public static final int[] G = {26, 25};

    public /* synthetic */ ls(int i4) {
        this.f13609a = i4;
    }

    public static boolean A(byte[] bArr, int i4, mx1 mx1Var) {
        int i10;
        String str = mx1Var.f14052m;
        if (Objects.equals(str, "video/avc")) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) == 0 && ((i10 = b10 & 31) == 1 || i10 == 9 || i10 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, "video/hevc")) {
            h0 h0VarU = U(new w2(bArr, 4, i4 + 4));
            int i11 = h0VarU.f11671a;
            if (i11 == 35) {
                return false;
            }
            if (i11 <= 14 && i11 % 2 == 0 && h0VarU.f11673c == mx1Var.D - 1) {
                return false;
            }
        }
        return true;
    }

    public static int B(int i4, sk0 sk0Var) {
        byte[] bArr = sk0Var.f16446a;
        int i10 = sk0Var.f16447b;
        int i11 = i10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10 + i4) {
                return i4;
            }
            if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                System.arraycopy(bArr, i11 + 2, bArr, i12, (i4 - (i11 - i10)) - 2);
                i4--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.k11 C(int r23, int r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ls.C(int, int, byte[]):com.google.android.gms.internal.ads.k11");
    }

    public static void D(String str, String str2) {
        synchronized (f13602t) {
            Log.e(str, L(str2, null));
        }
    }

    public static void E(long[] jArr, long[] jArr2, long[] jArr3) {
        long j8 = jArr2[0];
        long j9 = jArr3[0];
        long j10 = j8 * j9;
        long j11 = jArr3[1];
        long j12 = jArr2[1];
        long j13 = (j12 * j9) + (j8 * j11);
        long j14 = jArr3[2];
        long j15 = jArr2[2];
        long j16 = ((j12 + j12) * j11) + (j8 * j14) + (j15 * j9);
        long j17 = jArr3[3];
        long j18 = jArr2[3];
        long j19 = (j12 * j14) + (j15 * j11) + (j8 * j17) + (j18 * j9);
        long j20 = jArr3[4];
        long j21 = jArr2[4];
        long j22 = (j12 * j17) + (j18 * j11);
        long j23 = j22 + j22 + (j15 * j14) + (j8 * j20) + (j21 * j9);
        long j24 = jArr3[5];
        long j25 = jArr2[5];
        long j26 = (j15 * j17) + (j18 * j14) + (j12 * j20) + (j21 * j11) + (j8 * j24) + (j25 * j9);
        long j27 = jArr3[6];
        long j28 = jArr2[6];
        long j29 = (j18 * j17) + (j12 * j24) + (j25 * j11);
        long j30 = j29 + j29 + (j15 * j20) + (j21 * j14) + (j8 * j27) + (j28 * j9);
        long j31 = jArr3[7];
        long j32 = jArr2[7];
        long j33 = (j18 * j20) + (j21 * j17) + (j15 * j24) + (j25 * j14) + (j12 * j27) + (j28 * j11) + (j8 * j31) + (j32 * j9);
        long j34 = jArr3[8];
        long j35 = jArr2[8];
        long j36 = (j18 * j24) + (j25 * j17) + (j12 * j31) + (j32 * j11);
        long j37 = j36 + j36 + (j21 * j20) + (j15 * j27) + (j28 * j14) + (j8 * j34) + (j35 * j9);
        long j38 = jArr3[9];
        long j39 = jArr2[9];
        long j40 = (j21 * j24) + (j25 * j20) + (j18 * j27) + (j28 * j17) + (j15 * j31) + (j32 * j14) + (j12 * j34) + (j35 * j11) + (j8 * j38) + (j9 * j39);
        long j41 = (j25 * j24) + (j18 * j31) + (j32 * j17) + (j12 * j38) + (j11 * j39);
        long j42 = (j25 * j31) + (j32 * j24) + (j18 * j38) + (j17 * j39);
        long j43 = (j32 * j31) + (j25 * j38) + (j24 * j39);
        long j44 = (j32 * j34) + (j35 * j31) + (j28 * j38) + (j27 * j39);
        long j45 = (j31 * j39) + (j32 * j38);
        v(new long[]{j10, j13, j16, j19, j23, j26, j30, j33, j37, j40, j41 + j41 + (j21 * j27) + (j28 * j20) + (j15 * j34) + (j35 * j14), (j25 * j27) + (j28 * j24) + (j21 * j31) + (j32 * j20) + (j18 * j34) + (j35 * j17) + (j15 * j38) + (j14 * j39), j42 + j42 + (j28 * j27) + (j21 * j34) + (j35 * j20), (j28 * j31) + (j32 * j27) + (j25 * j34) + (j35 * j24) + (j21 * j38) + (j20 * j39), j43 + j43 + (j28 * j34) + (j35 * j27), j44, j45 + j45 + (j35 * j34), (j34 * j39) + (j35 * j38), (j39 + j39) * j38}, jArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.aw F(int r41, int r42, byte[] r43) {
        /*
            Method dump skipped, instructions count: 2164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ls.F(int, int, byte[]):com.google.android.gms.internal.ads.aw");
    }

    public static Charset G(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static void H(String str, String str2, Throwable th2) {
        synchronized (f13602t) {
            Log.e(str, L(str2, th2));
        }
    }

    public static void I(long[] jArr, long[] jArr2) {
        long j8 = jArr2[0];
        long j9 = j8 * j8;
        long j10 = jArr2[1];
        long j11 = (j8 + j8) * j10;
        long j12 = jArr2[2];
        long j13 = (j8 * j12) + (j10 * j10);
        long j14 = jArr2[3];
        long j15 = (j8 * j14) + (j10 * j12);
        long j16 = jArr2[4];
        long j17 = (j12 * j12) + (j10 * 4 * j14) + ((j8 + j8) * j16);
        long j18 = jArr2[5];
        long j19 = (j12 * j14) + (j10 * j16) + (j8 * j18);
        long j20 = jArr2[6];
        long j21 = (j14 * j14) + (j12 * j16) + (j8 * j20) + ((j10 + j10) * j18);
        long j22 = jArr2[7];
        long j23 = (j14 * j16) + (j12 * j18) + (j10 * j20) + (j8 * j22);
        long j24 = jArr2[8];
        long j25 = (j14 * j18) + (j10 * j22);
        long j26 = j25 + j25 + (j12 * j20) + (j8 * j24);
        long j27 = j26 + j26 + (j16 * j16);
        long j28 = jArr2[9];
        long j29 = (j16 * j18) + (j14 * j20) + (j12 * j22) + (j10 * j24) + (j8 * j28);
        long j30 = (j10 * j28) + (j14 * j22);
        long j31 = j30 + j30 + (j18 * j18) + (j16 * j20) + (j12 * j24);
        long j32 = (j18 * j20) + (j16 * j22) + (j14 * j24) + (j12 * j28);
        long j33 = (j14 * j28) + (j18 * j22);
        long j34 = j33 + j33 + (j16 * j24);
        long j35 = j34 + j34 + (j20 * j20);
        long j36 = (j20 * j22) + (j18 * j24) + (j16 * j28);
        long j37 = (j22 * j22) + (j20 * j24) + ((j18 + j18) * j28);
        long j38 = (j20 * j28) + (j22 * j24);
        v(new long[]{j9, j11, j13 + j13, j15 + j15, j17, j19 + j19, j21 + j21, j23 + j23, j27, j29 + j29, j31 + j31, j32 + j32, j35, j36 + j36, j37 + j37, j38 + j38, (j22 * 4 * j28) + (j24 * j24), (j24 + j24) * j28, (j28 + j28) * j28}, jArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.tz0 J(byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.aw r35) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ls.J(byte[], int, int, com.google.android.gms.internal.ads.aw):com.google.android.gms.internal.ads.tz0");
    }

    public static String K(int i4, int i10, int i11, int i12, int i13) {
        return i4 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static String L(String str, Throwable th2) {
        String strReplace;
        if (th2 != null) {
            synchronized (f13602t) {
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strReplace2 = strReplace.replace("\n", "\n  ");
        int length = String.valueOf(str).length();
        return a0.g.p(new StringBuilder(String.valueOf(strReplace2).length() + length + 3 + 1), str, "\n  ", strReplace2, "\n");
    }

    public static long[] M(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i4 = 0; i4 < 10; i4++) {
            int i10 = D[i4];
            jArr[i4] = (((((bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8)) | ((bArr[i10 + 2] & 255) << 16)) | ((bArr[i10 + 3] & 255) << 24)) >> E[i4]) & F[i4 & 1];
        }
        return jArr;
    }

    public static int N(int i4, int i10, byte[] bArr) {
        int iP = P(i4, bArr);
        if (i10 == 0 || i10 == 3) {
            return iP;
        }
        while (true) {
            int length = bArr.length;
            if (iP >= length - 1) {
                return length;
            }
            int i11 = iP + 1;
            if ((iP - i4) % 2 == 0 && bArr[i11] == 0) {
                return iP;
            }
            iP = P(i11, bArr);
        }
    }

    public static byte[] O(long[] jArr) {
        long j8;
        int[] iArr;
        int i4;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            j8 = 19;
            iArr = G;
            if (i11 >= 2) {
                break;
            }
            int i12 = 0;
            while (i12 < 9) {
                long j9 = jArrCopyOf[i12];
                int i13 = -((int) (((j9 >> 31) & j9) >> iArr[i12 & 1]));
                jArrCopyOf[i12] = j9 + (i13 << r15);
                i12++;
                jArrCopyOf[i12] = jArrCopyOf[i12] - i13;
            }
            long j10 = jArrCopyOf[9];
            jArrCopyOf[9] = j10 + (r6 << 25);
            jArrCopyOf[0] = jArrCopyOf[0] - ((-((int) (((j10 >> 31) & j10) >> 25))) * 19);
            i11++;
        }
        long j11 = jArrCopyOf[0];
        jArrCopyOf[0] = j11 + (r3 << 26);
        jArrCopyOf[1] = jArrCopyOf[1] - (-((int) (((j11 >> 31) & j11) >> 26)));
        int i14 = 0;
        while (true) {
            iArr2 = F;
            if (i14 >= 2) {
                break;
            }
            int i15 = i10;
            while (i15 < 9) {
                long j12 = jArrCopyOf[i15];
                int i16 = i10;
                long j13 = j12 >> iArr[i15 & 1];
                jArrCopyOf[i15] = iArr2[r16] & j12;
                i15++;
                jArrCopyOf[i15] = jArrCopyOf[i15] + ((int) j13);
                i10 = i16;
                i14 = i14;
                j8 = j8;
            }
            i14++;
        }
        int i17 = i10;
        jArrCopyOf[9] = jArrCopyOf[9] & 33554431;
        jArrCopyOf[i17] = (((int) (r2 >> 25)) * j8) + jArrCopyOf[i17];
        int i18 = ~((((int) r4) - 67108845) >> 31);
        for (int i19 = 1; i19 < 10; i19++) {
            int i20 = ~(((int) jArrCopyOf[i19]) ^ iArr2[i19 & 1]);
            int i21 = i20 & (i20 << 16);
            int i22 = i21 & (i21 << 8);
            int i23 = i22 & (i22 << 4);
            int i24 = i23 & (i23 << 2);
            i18 &= (i24 & (i24 + i24)) >> 31;
        }
        jArrCopyOf[i17] = jArrCopyOf[i17] - (67108845 & i18);
        long j14 = 33554431 & i18;
        jArrCopyOf[1] = jArrCopyOf[1] - j14;
        for (i4 = 2; i4 < 10; i4 += 2) {
            jArrCopyOf[i4] = jArrCopyOf[i4] - (67108863 & i18);
            int i25 = i4 + 1;
            jArrCopyOf[i25] = jArrCopyOf[i25] - j14;
        }
        for (int i26 = i17; i26 < 10; i26++) {
            jArrCopyOf[i26] = jArrCopyOf[i26] << E[i26];
        }
        byte[] bArr = new byte[32];
        for (int i27 = i17; i27 < 10; i27++) {
            int i28 = D[i27];
            long j15 = bArr[i28];
            long j16 = jArrCopyOf[i27];
            bArr[i28] = (byte) (j15 | (j16 & 255));
            bArr[i28 + 1] = (byte) (bArr[r5] | ((j16 >> 8) & 255));
            bArr[i28 + 2] = (byte) (bArr[r5] | ((j16 >> 16) & 255));
            bArr[i28 + 3] = (byte) (bArr[r4] | ((j16 >> 24) & 255));
        }
        return bArr;
    }

    public static int P(int i4, byte[] bArr) {
        while (true) {
            int length = bArr.length;
            if (i4 >= length) {
                return length;
            }
            if (bArr[i4] == 0) {
                return i4;
            }
            i4++;
        }
    }

    public static int Q(byte[] bArr, int i4, int i10, boolean[] zArr) {
        int i11 = i10 - i4;
        mq0.c0(i11 >= 0);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            S(zArr);
            return i4 - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i4] == 1) {
            S(zArr);
            return i4 - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i4] == 0 && bArr[i4 + 1] == 1) {
            S(zArr);
            return i4 - 1;
        }
        int i12 = i10 - 1;
        int i13 = i4 + 2;
        while (i13 < i12) {
            byte b10 = bArr[i13];
            if ((b10 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b10 == 1) {
                    S(zArr);
                    return i14;
                }
                i13 = i14;
            }
            i13 += 3;
        }
        zArr[0] = i11 <= 2 ? !(i11 != 2 ? !(zArr[1] && bArr[i12] == 1) : !(zArr[2] && bArr[i10 + (-2)] == 0 && bArr[i12] == 1)) : bArr[i10 + (-3)] == 0 && bArr[i10 + (-2)] == 0 && bArr[i12] == 1;
        zArr[1] = i11 <= 1 ? zArr[2] && bArr[i12] == 0 : bArr[i10 + (-2)] == 0 && bArr[i12] == 0;
        zArr[2] = bArr[i12] == 0;
        return i10;
    }

    public static int R(int i4) {
        return (i4 == 0 || i4 == 3) ? 1 : 2;
    }

    public static void S(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String T(List list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            byte[] bArr = (byte[]) list.get(i4);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                v41 v41Var = x41.f18307b;
                yr1.u(4, "initialCapacity");
                Object[] objArrCopyOf = new Object[4];
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i10 >= length2) {
                        break;
                    }
                    int iQ = Q(bArr, i10, length2, zArr);
                    if (iQ != length2) {
                        Integer numValueOf = Integer.valueOf(iQ);
                        int length3 = objArrCopyOf.length;
                        int i12 = i11 + 1;
                        int iD = s41.d(length3, i12);
                        if (iD > length3) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                        }
                        objArrCopyOf[i11] = numValueOf;
                        i11 = i12;
                    }
                    i10 = iQ + 3;
                }
                u51 u51VarS = x41.s(objArrCopyOf, i11);
                for (int i13 = 0; i13 < u51VarS.f17098d; i13++) {
                    if (((Integer) u51VarS.get(i13)).intValue() + 3 < length) {
                        w2 w2Var = new w2(bArr, ((Integer) u51VarS.get(i13)).intValue() + 3, length);
                        h0 h0VarU = U(w2Var);
                        if (h0VarU.f11671a == 33 && h0VarU.f11672b == 0) {
                            w2Var.d(4);
                            int iH = w2Var.h(3);
                            w2Var.a();
                            qx0 qx0VarW = W(w2Var, true, iH, null);
                            return ba0.a(qx0VarW.f15463a, qx0VarW.f15464b, qx0VarW.f15465c, qx0VarW.f15466d, qx0VarW.f15467e, qx0VarW.f15468f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static h0 U(w2 w2Var) {
        w2Var.a();
        return new h0(w2Var.h(6), w2Var.h(6), w2Var.h(3) - 1, false);
    }

    public static String V(byte[] bArr, int i4, int i10, Charset charset) {
        return (i10 <= i4 || i10 > bArr.length) ? "" : new String(bArr, i4, i10 - i4, charset);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.qx0 W(com.google.android.gms.internal.ads.w2 r18, boolean r19, int r20, com.google.android.gms.internal.ads.qx0 r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L41
            r2 = 2
            int r2 = r0.h(r2)
            boolean r7 = r0.g()
            r8 = 5
            int r8 = r0.h(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r0.g()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.h(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
        L3b:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L41:
            if (r2 == 0) goto L4f
            int r3 = r2.f15463a
            boolean r7 = r2.f15464b
            int r8 = r2.f15465c
            int r10 = r2.f15466d
            int[] r4 = r2.f15467e
            r12 = r3
            goto L3b
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.h(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r0.g()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r0.g()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.d(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.d(r5)
        L79:
            com.google.android.gms.internal.ads.qx0 r11 = new com.google.android.gms.internal.ads.qx0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ls.W(com.google.android.gms.internal.ads.w2, boolean, int, com.google.android.gms.internal.ads.qx0):com.google.android.gms.internal.ads.qx0");
    }

    public static void X(w2 w2Var) {
        int iJ = w2Var.j() + 1;
        w2Var.d(8);
        for (int i4 = 0; i4 < iJ; i4++) {
            w2Var.j();
            w2Var.j();
            w2Var.a();
        }
        w2Var.d(20);
    }

    public static String Y(mx1 mx1Var) {
        String str;
        String str2 = mx1Var.f14052m;
        if (Objects.equals(str2, "video/dolby-vision") && (str = mx1Var.j) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return "video/avc";
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return str2;
    }

    public static int a(int i4) {
        int i10;
        int i11;
        int i12;
        int i13;
        if ((i4 & (-2097152)) != -2097152 || (i10 = (i4 >>> 19) & 3) == 1 || (i11 = (i4 >>> 17) & 3) == 0 || (i12 = (i4 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i4 >>> 10) & 3) == 3) {
            return -1;
        }
        int i14 = i12 - 1;
        int i15 = f13589e[i13];
        if (i10 == 2) {
            i15 /= 2;
        } else if (i10 == 0) {
            i15 /= 4;
        }
        int i16 = (i4 >>> 9) & 1;
        if (i11 == 3) {
            return ((((i10 == 3 ? f13590f[i14] : g[i14]) * 12) / i15) + i16) * 4;
        }
        int i17 = i10 == 3 ? i11 == 2 ? f13591h[i14] : f13592i[i14] : j[i14];
        if (i10 == 3) {
            return ((i17 * 144) / i15) + i16;
        }
        return (((i11 == 1 ? 72 : 144) * i17) / i15) + i16;
    }

    public static int b(int i4, byte[] bArr) {
        int i10;
        synchronized (B) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i4) {
                while (true) {
                    try {
                        if (i11 >= i4 - 2) {
                            i11 = i4;
                            break;
                        }
                        int i13 = i11 + 1;
                        if (bArr[i11] == 0 && bArr[i13] == 0 && bArr[i11 + 2] == 3) {
                            break;
                        }
                        i11 = i13;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i11 < i4) {
                    int[] iArr = C;
                    int length = iArr.length;
                    if (length <= i12) {
                        C = Arrays.copyOf(iArr, length + length);
                    }
                    C[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i4 - i12;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = C[i16] - i14;
                System.arraycopy(bArr, i14, bArr, i15, i17);
                int i18 = i15 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i15 = i18 + 2;
                bArr[i19] = 0;
                i14 += i17 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i15, i10 - i15);
        }
        return i10;
    }

    public static Bundle c(Pair... pairArr) {
        Bundle bundle = new Bundle();
        if (((Boolean) va.s.f36163e.f36166c.a(sk.B2)).booleanValue()) {
            for (int i4 = 0; i4 < 2; i4++) {
                Pair pair = pairArr[i4];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }

    public static q7 d(q7 q7Var, String[] strArr, Map map) {
        int length;
        int i4 = 0;
        if (q7Var == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (q7) map.get(strArr[0]);
            }
            if (length2 > 1) {
                q7 q7Var2 = new q7();
                while (i4 < length2) {
                    q7Var2.c((q7) map.get(strArr[i4]));
                    i4++;
                }
                return q7Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                q7Var.c((q7) map.get(strArr[0]));
                return q7Var;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i4 < length) {
                    q7Var.c((q7) map.get(strArr[i4]));
                    i4++;
                }
            }
        }
        return q7Var;
    }

    public static x9 e(fa faVar) throws NumberFormatException {
        long j8;
        boolean z3;
        long j9;
        long j10;
        long j11;
        long jK;
        long j12;
        long j13;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = faVar.f11076c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jK2 = str != null ? k(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i4 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z3 = false;
            j9 = 0;
            j10 = 0;
            while (i4 < strArrSplit.length) {
                String strTrim = strArrSplit[i4].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j10 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j9 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z3 = true;
                }
                i4++;
            }
            j8 = 0;
            i4 = 1;
        } else {
            j8 = 0;
            z3 = false;
            j9 = 0;
            j10 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jK3 = str3 != null ? k(str3) : j8;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j11 = jCurrentTimeMillis;
            jK = k(str4);
        } else {
            j11 = jCurrentTimeMillis;
            jK = j8;
        }
        String str5 = (String) map.get("ETag");
        if (i4 != 0) {
            long j14 = (j10 * 1000) + j11;
            if (z3) {
                j13 = j14;
            } else {
                Long.signum(j9);
                j13 = (j9 * 1000) + j14;
            }
            j12 = j14;
        } else {
            j12 = (jK2 <= j8 || jK3 < jK2) ? j8 : (jK3 - jK2) + j11;
            j13 = j12;
        }
        x9 x9Var = new x9();
        x9Var.f18322a = faVar.f11075b;
        x9Var.f18323b = str5;
        x9Var.f18327f = j12;
        x9Var.f18326e = j13;
        x9Var.f18324c = jK2;
        x9Var.f18325d = jK;
        x9Var.g = map;
        x9Var.f18328h = faVar.f11077d;
        return x9Var;
    }

    public static void g(String str, String str2) {
        synchronized (f13602t) {
            Log.d(str, L(str2, null));
        }
    }

    public static void h(vb.a aVar, Throwable th2, String str) {
        ut.a((Context) vb.b.U0(aVar)).e(th2, str, ((Double) dm.f10521f.u()).floatValue());
    }

    public static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i4 = 0; i4 < 10; i4++) {
            jArr[i4] = jArr2[i4] + jArr3[i4];
        }
    }

    public static boolean j(sk0 sk0Var, e2 e2Var, int i4, c2 c2Var) {
        boolean z3;
        long jP = sk0Var.P();
        long j8 = jP >>> 16;
        if (j8 != i4) {
            return false;
        }
        boolean z10 = (j8 & 1) == 1;
        long j9 = jP >> 12;
        long j10 = jP >> 8;
        long j11 = jP >> 4;
        long j12 = jP >> 1;
        long j13 = jP & 1;
        int i10 = (int) (j11 & 15);
        if (i10 <= 7) {
            z3 = true;
            if (i10 != e2Var.g - 1) {
                return false;
            }
        } else {
            z3 = true;
            if (i10 > 10 || e2Var.g != 2) {
                return false;
            }
        }
        int i11 = (int) (j12 & 7);
        if (!(i11 == 0 || i11 == e2Var.f10675i) || j13 == 1) {
            return false;
        }
        try {
            long jO = sk0Var.o();
            if (!z10) {
                jO *= e2Var.f10669b;
            }
            long j14 = e2Var.j;
            if (j14 != 0 && jO > j14) {
                return false;
            }
            c2Var.f9923a = jO;
            int iQ = q((int) (j9 & 15), sk0Var);
            long j15 = e2Var.j;
            boolean z11 = (j15 == 0 || jO + ((long) iQ) >= j15) ? z3 : false;
            if (iQ == -1) {
                return false;
            }
            if ((!z11 && iQ < e2Var.f10668a) || iQ > e2Var.f10669b) {
                return false;
            }
            int i12 = e2Var.f10672e;
            int i13 = (int) (j10 & 15);
            if (i13 != 0) {
                if (i13 <= 11) {
                    if (i13 != e2Var.f10673f) {
                        return false;
                    }
                } else if (i13 != 12) {
                    if (i13 > 14) {
                        return false;
                    }
                    int iL = sk0Var.L();
                    if (i13 == 14) {
                        iL *= 10;
                    }
                    if (iL != i12) {
                        return false;
                    }
                } else if (sk0Var.K() * 1000 != i12) {
                    return false;
                }
            }
            int iK = sk0Var.K();
            int i14 = sk0Var.f16447b;
            byte[] bArr = sk0Var.f16446a;
            int i15 = i14 - 1;
            int i16 = 0;
            for (int i17 = sk0Var.f16447b; i17 < i15; i17++) {
                i16 = bq0.f9775i[i16 ^ (bArr[i17] & 255)];
            }
            String str = bq0.f9768a;
            if (iK != i16) {
                return false;
            }
            if (sk0Var.B() != 0) {
                int I = sk0Var.I();
                if ((I & 128) != 0) {
                    return false;
                }
                int i18 = (I & WebSocketProtocol.PAYLOAD_SHORT) >> 1;
                if ((i18 >= 2 && i18 <= 7) || (i18 >= 13 && i18 <= 31)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i18).length() + 57);
                    sb2.append("Ignoring frame where first subframe has a reserved type: ");
                    sb2.append(i18);
                    n("FlacFrameReader", sb2.toString());
                    return false;
                }
            }
            return z3;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static long k(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e2) {
            if ("0".equals(str) || "-1".equals(str)) {
                na.a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", na.d("Unable to parse dateStr: %s, falling back to 0", str), e2);
            return 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
    
        if (r11 != 3) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.k1 l(com.google.android.gms.internal.ads.hk0 r11, boolean r12) throws com.google.android.gms.internal.ads.ua {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ls.l(com.google.android.gms.internal.ads.hk0, boolean):com.google.android.gms.internal.ads.k1");
    }

    public static HashMap m(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            Log.d("ls", "decode object failure");
            return null;
        }
    }

    public static void n(String str, String str2) {
        synchronized (f13602t) {
            Log.i(str, L(str2, null));
        }
    }

    public static void o(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i4 = 0; i4 < 10; i4++) {
            jArr[i4] = jArr2[i4] - jArr3[i4];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean p(com.google.android.gms.internal.ads.sk0 r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r1.f16447b
        L6:
            int r3 = r1.B()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La5
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.b()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.P()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.L()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto La9
        L23:
            int r7 = r1.O()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.O()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L20
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L39
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L39
            if (r10 != 0) goto L39
            goto La5
        L39:
            r7 = 4
            if (r0 != r7) goto L69
            if (r24 != 0) goto L69
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L49
        L46:
            r4 = r6
            goto La5
        L49:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L69:
            if (r0 != r7) goto L79
            r3 = r10 & 64
            if (r3 == 0) goto L70
            goto L71
        L70:
            r4 = r6
        L71:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8b
        L79:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L81
            r3 = r4
            goto L82
        L81:
            r3 = r6
        L82:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L87
            goto L8b
        L87:
            r4 = r6
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L20
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L95
            goto L46
        L95:
            int r3 = r1.B()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L20
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L9f
            goto L46
        L9f:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L20
            r1.G(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        La5:
            r1.E(r2)
            return r4
        La9:
            r1.E(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ls.p(com.google.android.gms.internal.ads.sk0, int, int, boolean):boolean");
    }

    public static int q(int i4, sk0 sk0Var) {
        switch (i4) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i4 - 2);
            case 6:
                return sk0Var.K() + 1;
            case 7:
                return sk0Var.L() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i4 - 8);
            default:
                return -1;
        }
    }

    public static int r(mx1 mx1Var) {
        String strY = Y(mx1Var);
        if (Objects.equals(strY, "video/avc")) {
            return 1;
        }
        return Objects.equals(strY, "video/hevc") ? 2 : 0;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0297 A[Catch: all -> 0x0130, Exception -> 0x0255, OutOfMemoryError -> 0x025a, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c2 A[Catch: all -> 0x0130, Exception -> 0x02bc, OutOfMemoryError -> 0x02bf, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0300 A[Catch: all -> 0x0130, Exception -> 0x02bc, OutOfMemoryError -> 0x02bf, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0303 A[Catch: all -> 0x0130, Exception -> 0x02bc, OutOfMemoryError -> 0x02bf, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.g4 s(int r33, com.google.android.gms.internal.ads.sk0 r34, boolean r35, com.google.android.gms.internal.ads.w5 r36) {
        /*
            Method dump skipped, instructions count: 1339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ls.s(int, com.google.android.gms.internal.ads.sk0, boolean, com.google.android.gms.internal.ads.w5):com.google.android.gms.internal.ads.g4");
    }

    public static void t(String str, String str2) {
        synchronized (f13602t) {
            Log.w(str, L(str2, null));
        }
    }

    public static void u(ArrayList arrayList, oa oaVar) {
        String str = (String) oaVar.u();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public static void v(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j8 = jArr[8];
        long j9 = jArr[18];
        long j10 = j8 + (j9 << 4);
        jArr[8] = j10;
        long j11 = j9 + j9 + j10;
        jArr[8] = j11;
        jArr[8] = j11 + j9;
        long j12 = jArr[7];
        long j13 = jArr[17];
        long j14 = j12 + (j13 << 4);
        jArr[7] = j14;
        long j15 = j13 + j13 + j14;
        jArr[7] = j15;
        jArr[7] = j15 + j13;
        long j16 = jArr[6];
        long j17 = jArr[16];
        long j18 = j16 + (j17 << 4);
        jArr[6] = j18;
        long j19 = j17 + j17 + j18;
        jArr[6] = j19;
        jArr[6] = j19 + j17;
        long j20 = jArr[5];
        long j21 = jArr[15];
        long j22 = j20 + (j21 << 4);
        jArr[5] = j22;
        long j23 = j21 + j21 + j22;
        jArr[5] = j23;
        jArr[5] = j23 + j21;
        long j24 = jArr[4];
        long j25 = jArr[14];
        long j26 = j24 + (j25 << 4);
        jArr[4] = j26;
        long j27 = j25 + j25 + j26;
        jArr[4] = j27;
        jArr[4] = j27 + j25;
        long j28 = jArr[3];
        long j29 = jArr[13];
        long j30 = j28 + (j29 << 4);
        jArr[3] = j30;
        long j31 = j29 + j29 + j30;
        jArr[3] = j31;
        jArr[3] = j31 + j29;
        long j32 = jArr[2];
        long j33 = jArr[12];
        long j34 = j32 + (j33 << 4);
        jArr[2] = j34;
        long j35 = j33 + j33 + j34;
        jArr[2] = j35;
        jArr[2] = j35 + j33;
        long j36 = jArr[1];
        long j37 = jArr[11];
        long j38 = j36 + (j37 << 4);
        jArr[1] = j38;
        long j39 = j37 + j37 + j38;
        jArr[1] = j39;
        jArr[1] = j39 + j37;
        long j40 = jArr[0];
        long j41 = jArr[10];
        long j42 = j40 + (j41 << 4);
        jArr[0] = j42;
        long j43 = j41 + j41 + j42;
        jArr[0] = j43;
        jArr[0] = j43 + j41;
        z(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static int w(hk0 hk0Var) throws ua {
        int iH = hk0Var.h(4);
        if (iH == 15) {
            if (hk0Var.b() >= 24) {
                return hk0Var.h(24);
            }
            throw ua.a(null, "AAC header insufficient data");
        }
        if (iH < 13) {
            return f13586b[iH];
        }
        throw ua.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static u51 x(int i4, int i10, byte[] bArr) {
        if (i10 >= bArr.length) {
            return x41.l("");
        }
        v41 v41Var = x41.f18307b;
        yr1.u(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int iN = N(i10, i4, bArr);
        int i11 = 0;
        while (i10 < iN) {
            String str = new String(bArr, i10, iN - i10, G(i4));
            int length = objArrCopyOf.length;
            int i12 = i11 + 1;
            int iD = s41.d(length, i12);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i11] = str;
            i10 = R(i4) + iN;
            iN = N(i10, i4, bArr);
            i11 = i12;
        }
        u51 u51VarS = x41.s(objArrCopyOf, i11);
        return u51VarS.isEmpty() ? x41.l("") : u51VarS;
    }

    public static void y(String str, String str2, Throwable th2) {
        synchronized (f13602t) {
            Log.w(str, L(str2, th2));
        }
    }

    public static void z(long[] jArr) {
        jArr[10] = 0;
        int i4 = 0;
        while (i4 < 10) {
            long j8 = jArr[i4];
            long j9 = j8 / 67108864;
            jArr[i4] = j8 - (j9 << 26);
            int i10 = i4 + 1;
            long j10 = jArr[i10] + j9;
            jArr[i10] = j10;
            long j11 = j10 / 33554432;
            jArr[i10] = j10 - (j11 << 25);
            i4 += 2;
            jArr[i4] = jArr[i4] + j11;
        }
        long j12 = jArr[0];
        long j13 = jArr[10];
        long j14 = j12 + (j13 << 4);
        jArr[0] = j14;
        long j15 = j13 + j13 + j14;
        jArr[0] = j15;
        long j16 = j15 + j13;
        jArr[0] = j16;
        jArr[10] = 0;
        long j17 = j16 / 67108864;
        jArr[0] = j16 - (j17 << 26);
        jArr[1] = jArr[1] + j17;
    }

    public abstract HashMap f();

    public String toString() throws IOException {
        switch (this.f13609a) {
            case 25:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(f());
                    objectOutputStream.close();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException unused) {
                    return null;
                }
            default:
                return super.toString();
        }
    }
}
