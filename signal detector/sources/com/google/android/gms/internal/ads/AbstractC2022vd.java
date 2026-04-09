package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import f4.InterfaceFutureC2326a;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.vd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2022vd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17311a = 25;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f17287b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f17288c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f17289d = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f17290e = {44100, 48000, 32000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f17291f = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f17292g = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f17293h = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] i = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f17294j = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: k, reason: collision with root package name */
    public static final P7 f17295k = new P7(0);

    /* renamed from: l, reason: collision with root package name */
    public static final J4 f17296l = new J4(4, "", "gads:pan:experiment_id");

    /* renamed from: m, reason: collision with root package name */
    public static final P7 f17297m = new P7(11);

    /* renamed from: n, reason: collision with root package name */
    public static final P7 f17298n = new P7(15);

    /* renamed from: o, reason: collision with root package name */
    public static final P7 f17299o = new P7(27);

    /* renamed from: p, reason: collision with root package name */
    public static final C0748Tl f17300p = new C0748Tl(1);

    /* renamed from: q, reason: collision with root package name */
    public static final C0748Tl f17301q = new C0748Tl(9);

    /* renamed from: r, reason: collision with root package name */
    public static final C0748Tl f17302r = new C0748Tl(14);

    /* renamed from: s, reason: collision with root package name */
    public static final C0748Tl f17303s = new C0748Tl(18);

    /* renamed from: t, reason: collision with root package name */
    public static final Object f17304t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static final C0748Tl f17305u = new C0748Tl(27);

    /* renamed from: v, reason: collision with root package name */
    public static final C1122et f17306v = new C1122et(4);

    /* renamed from: w, reason: collision with root package name */
    public static final C1122et f17307w = new C1122et(8);

    /* renamed from: x, reason: collision with root package name */
    public static final C1122et f17308x = new C1122et(12);

    /* renamed from: y, reason: collision with root package name */
    public static final C1122et f17309y = new C1122et(15);

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f17310z = {0, 0, 0, 1};

    /* renamed from: A, reason: collision with root package name */
    public static final float[] f17280A = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: B, reason: collision with root package name */
    public static final Object f17281B = new Object();

    /* renamed from: C, reason: collision with root package name */
    public static int[] f17282C = new int[10];

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f17283D = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f17284E = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f17285F = {67108863, 33554431};

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f17286G = {26, 25};

    public static void A(long[] jArr) {
        jArr[10] = 0;
        int i3 = 0;
        while (i3 < 10) {
            long j6 = jArr[i3];
            long j7 = j6 / 67108864;
            jArr[i3] = j6 - (j7 << 26);
            int i6 = i3 + 1;
            long j8 = jArr[i6] + j7;
            jArr[i6] = j8;
            long j9 = j8 / 33554432;
            jArr[i6] = j8 - (j9 << 25);
            i3 += 2;
            jArr[i3] = jArr[i3] + j9;
        }
        long j10 = jArr[0];
        long j11 = jArr[10];
        long j12 = j10 + (j11 << 4);
        jArr[0] = j12;
        long j13 = j11 + j11 + j12;
        jArr[0] = j13;
        long j14 = j13 + j11;
        jArr[0] = j14;
        jArr[10] = 0;
        long j15 = j14 / 67108864;
        jArr[0] = j14 - (j15 << 26);
        jArr[1] = jArr[1] + j15;
    }

    public static boolean B(int i3, C2036vr c2036vr, boolean z6) throws P4 {
        if (c2036vr.B() < 7) {
            if (z6) {
                return false;
            }
            int iB = c2036vr.B();
            StringBuilder sb = new StringBuilder(String.valueOf(iB).length() + 18);
            sb.append("too short header: ");
            sb.append(iB);
            throw P4.a(null, sb.toString());
        }
        if (c2036vr.K() != i3) {
            if (z6) {
                return false;
            }
            throw P4.a(null, "expected header type ".concat(String.valueOf(Integer.toHexString(i3))));
        }
        if (c2036vr.K() == 118 && c2036vr.K() == 111 && c2036vr.K() == 114 && c2036vr.K() == 98 && c2036vr.K() == 105 && c2036vr.K() == 115) {
            return true;
        }
        if (z6) {
            return false;
        }
        throw P4.a(null, "expected characters 'vorbis'");
    }

    public static boolean C(byte[] bArr, int i3, TP tp) {
        int i6;
        String str = tp.f11397m;
        if (Objects.equals(str, "video/avc")) {
            byte b5 = bArr[4];
            if (((b5 & 96) >> 5) == 0 && ((i6 = b5 & 31) == 1 || i6 == 9 || i6 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, "video/hevc")) {
            T2.d dVarT = T(new V0(4, i3 + 4, bArr));
            int i7 = dVarT.f3569a;
            if (i7 == 35) {
                return false;
            }
            if (i7 <= 14 && i7 % 2 == 0 && dVarT.f3571c == tp.f11377D - 1) {
                return false;
            }
        }
        return true;
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
    public static com.google.android.gms.internal.ads.Xz D(int r23, int r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2022vd.D(int, int, byte[]):com.google.android.gms.internal.ads.Xz");
    }

    public static void E(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    public static void F(String str, String str2) {
        synchronized (f17304t) {
            Log.e(str, N(str2, null));
        }
    }

    public static void G(long[] jArr, long[] jArr2, long[] jArr3) {
        long j6 = jArr2[0];
        long j7 = jArr3[0];
        long j8 = j6 * j7;
        long j9 = jArr3[1];
        long j10 = jArr2[1];
        long j11 = (j10 * j7) + (j6 * j9);
        long j12 = jArr3[2];
        long j13 = jArr2[2];
        long j14 = ((j10 + j10) * j9) + (j6 * j12) + (j13 * j7);
        long j15 = jArr3[3];
        long j16 = jArr2[3];
        long j17 = (j10 * j12) + (j13 * j9) + (j6 * j15) + (j16 * j7);
        long j18 = jArr3[4];
        long j19 = jArr2[4];
        long j20 = (j10 * j15) + (j16 * j9);
        long j21 = j20 + j20 + (j13 * j12) + (j6 * j18) + (j19 * j7);
        long j22 = jArr3[5];
        long j23 = jArr2[5];
        long j24 = (j13 * j15) + (j16 * j12) + (j10 * j18) + (j19 * j9) + (j6 * j22) + (j23 * j7);
        long j25 = jArr3[6];
        long j26 = jArr2[6];
        long j27 = (j16 * j15) + (j10 * j22) + (j23 * j9);
        long j28 = j27 + j27 + (j13 * j18) + (j19 * j12) + (j6 * j25) + (j26 * j7);
        long j29 = jArr3[7];
        long j30 = jArr2[7];
        long j31 = (j16 * j18) + (j19 * j15) + (j13 * j22) + (j23 * j12) + (j10 * j25) + (j26 * j9) + (j6 * j29) + (j30 * j7);
        long j32 = jArr3[8];
        long j33 = jArr2[8];
        long j34 = (j16 * j22) + (j23 * j15) + (j10 * j29) + (j30 * j9);
        long j35 = j34 + j34 + (j19 * j18) + (j13 * j25) + (j26 * j12) + (j6 * j32) + (j33 * j7);
        long j36 = jArr3[9];
        long j37 = jArr2[9];
        long j38 = (j19 * j22) + (j23 * j18) + (j16 * j25) + (j26 * j15) + (j13 * j29) + (j30 * j12) + (j10 * j32) + (j33 * j9) + (j6 * j36) + (j7 * j37);
        long j39 = (j23 * j22) + (j16 * j29) + (j30 * j15) + (j10 * j36) + (j9 * j37);
        long j40 = (j23 * j29) + (j30 * j22) + (j16 * j36) + (j15 * j37);
        long j41 = (j30 * j29) + (j23 * j36) + (j22 * j37);
        long j42 = (j30 * j32) + (j33 * j29) + (j26 * j36) + (j25 * j37);
        long j43 = (j29 * j37) + (j30 * j36);
        w(new long[]{j8, j11, j14, j17, j21, j24, j28, j31, j35, j38, j39 + j39 + (j19 * j25) + (j26 * j18) + (j13 * j32) + (j33 * j12), (j23 * j25) + (j26 * j22) + (j19 * j29) + (j30 * j18) + (j16 * j32) + (j33 * j15) + (j13 * j36) + (j12 * j37), j40 + j40 + (j26 * j25) + (j19 * j32) + (j33 * j18), (j26 * j29) + (j30 * j25) + (j23 * j32) + (j33 * j22) + (j19 * j36) + (j18 * j37), j41 + j41 + (j26 * j32) + (j33 * j25), j42, j43 + j43 + (j33 * j32), (j32 * j37) + (j33 * j36), (j37 + j37) * j36}, jArr);
    }

    public static int H(int i3) {
        if (i3 == 20) {
            return 63750;
        }
        if (i3 == 30) {
            return 2250000;
        }
        switch (i3) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i3) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static int I(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return 0;
        }
        try {
            return sharedPreferences.getInt(str, 0);
        } catch (ClassCastException unused) {
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.C1431kf J(int r41, int r42, byte[] r43) {
        /*
            Method dump skipped, instructions count: 2181
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2022vd.J(int, int, byte[]):com.google.android.gms.internal.ads.kf");
    }

    public static void K(String str, String str2, Throwable th) {
        synchronized (f17304t) {
            Log.e(str, N(str2, th));
        }
    }

    public static void L(long[] jArr, long[] jArr2) {
        long j6 = jArr2[0];
        long j7 = j6 * j6;
        long j8 = jArr2[1];
        long j9 = (j6 + j6) * j8;
        long j10 = jArr2[2];
        long j11 = (j6 * j10) + (j8 * j8);
        long j12 = jArr2[3];
        long j13 = (j6 * j12) + (j8 * j10);
        long j14 = jArr2[4];
        long j15 = (j10 * j10) + (j8 * 4 * j12) + ((j6 + j6) * j14);
        long j16 = jArr2[5];
        long j17 = (j10 * j12) + (j8 * j14) + (j6 * j16);
        long j18 = jArr2[6];
        long j19 = (j12 * j12) + (j10 * j14) + (j6 * j18) + ((j8 + j8) * j16);
        long j20 = jArr2[7];
        long j21 = (j12 * j14) + (j10 * j16) + (j8 * j18) + (j6 * j20);
        long j22 = jArr2[8];
        long j23 = (j12 * j16) + (j8 * j20);
        long j24 = j23 + j23 + (j10 * j18) + (j6 * j22);
        long j25 = j24 + j24 + (j14 * j14);
        long j26 = jArr2[9];
        long j27 = (j14 * j16) + (j12 * j18) + (j10 * j20) + (j8 * j22) + (j6 * j26);
        long j28 = (j8 * j26) + (j12 * j20);
        long j29 = j28 + j28 + (j16 * j16) + (j14 * j18) + (j10 * j22);
        long j30 = (j16 * j18) + (j14 * j20) + (j12 * j22) + (j10 * j26);
        long j31 = (j12 * j26) + (j16 * j20);
        long j32 = j31 + j31 + (j14 * j22);
        long j33 = j32 + j32 + (j18 * j18);
        long j34 = (j18 * j20) + (j16 * j22) + (j14 * j26);
        long j35 = (j20 * j20) + (j18 * j22) + ((j16 + j16) * j26);
        long j36 = (j18 * j26) + (j20 * j22);
        w(new long[]{j7, j9, j11 + j11, j13 + j13, j15, j17 + j17, j19 + j19, j21 + j21, j25, j27 + j27, j29 + j29, j30 + j30, j33, j34 + j34, j35 + j35, j36 + j36, (j20 * 4 * j26) + (j22 * j22), (j22 + j22) * j26, (j26 + j26) * j26}, jArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.C1343iz M(byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.C1431kf r35) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2022vd.M(byte[], int, int, com.google.android.gms.internal.ads.kf):com.google.android.gms.internal.ads.iz");
    }

    public static String N(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f17304t) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
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
        return AbstractC1135f5.o(new StringBuilder(String.valueOf(strReplace2).length() + length + 3 + 1), str, "\n  ", strReplace2, "\n");
    }

    public static long[] O(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i3 = 0; i3 < 10; i3++) {
            int i6 = f17283D[i3];
            jArr[i3] = (((((bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8)) | ((bArr[i6 + 2] & 255) << 16)) | ((bArr[i6 + 3] & 255) << 24)) >> f17284E[i3]) & f17285F[i3 & 1];
        }
        return jArr;
    }

    public static byte[] P(long[] jArr) {
        long j6;
        int[] iArr;
        int i3;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i6 = 0;
        int i7 = 0;
        while (true) {
            j6 = 19;
            iArr = f17286G;
            if (i7 >= 2) {
                break;
            }
            int i8 = 0;
            while (i8 < 9) {
                long j7 = jArrCopyOf[i8];
                int i9 = -((int) (((j7 >> 31) & j7) >> iArr[i8 & 1]));
                jArrCopyOf[i8] = j7 + (i9 << r15);
                i8++;
                jArrCopyOf[i8] = jArrCopyOf[i8] - i9;
            }
            long j8 = jArrCopyOf[9];
            jArrCopyOf[9] = j8 + (r6 << 25);
            jArrCopyOf[0] = jArrCopyOf[0] - ((-((int) (((j8 >> 31) & j8) >> 25))) * 19);
            i7++;
        }
        long j9 = jArrCopyOf[0];
        jArrCopyOf[0] = j9 + (r3 << 26);
        jArrCopyOf[1] = jArrCopyOf[1] - (-((int) (((j9 >> 31) & j9) >> 26)));
        int i10 = 0;
        while (true) {
            iArr2 = f17285F;
            if (i10 >= 2) {
                break;
            }
            int i11 = i6;
            while (i11 < 9) {
                long j10 = jArrCopyOf[i11];
                int i12 = i6;
                long j11 = j10 >> iArr[i11 & 1];
                jArrCopyOf[i11] = iArr2[r16] & j10;
                i11++;
                jArrCopyOf[i11] = jArrCopyOf[i11] + ((int) j11);
                i6 = i12;
                i10 = i10;
                j6 = j6;
            }
            i10++;
        }
        int i13 = i6;
        jArrCopyOf[9] = jArrCopyOf[9] & 33554431;
        jArrCopyOf[i13] = (((int) (r2 >> 25)) * j6) + jArrCopyOf[i13];
        int i14 = ~((((int) r4) - 67108845) >> 31);
        for (int i15 = 1; i15 < 10; i15++) {
            int i16 = ~(((int) jArrCopyOf[i15]) ^ iArr2[i15 & 1]);
            int i17 = i16 & (i16 << 16);
            int i18 = i17 & (i17 << 8);
            int i19 = i18 & (i18 << 4);
            int i20 = i19 & (i19 << 2);
            i14 &= (i20 & (i20 + i20)) >> 31;
        }
        jArrCopyOf[i13] = jArrCopyOf[i13] - (67108845 & i14);
        long j12 = 33554431 & i14;
        jArrCopyOf[1] = jArrCopyOf[1] - j12;
        for (i3 = 2; i3 < 10; i3 += 2) {
            jArrCopyOf[i3] = jArrCopyOf[i3] - (67108863 & i14);
            int i21 = i3 + 1;
            jArrCopyOf[i21] = jArrCopyOf[i21] - j12;
        }
        for (int i22 = i13; i22 < 10; i22++) {
            jArrCopyOf[i22] = jArrCopyOf[i22] << f17284E[i22];
        }
        byte[] bArr = new byte[32];
        for (int i23 = i13; i23 < 10; i23++) {
            int i24 = f17283D[i23];
            long j13 = bArr[i24];
            long j14 = jArrCopyOf[i23];
            bArr[i24] = (byte) (j13 | (j14 & 255));
            bArr[i24 + 1] = (byte) (bArr[r5] | ((j14 >> 8) & 255));
            bArr[i24 + 2] = (byte) (bArr[r5] | ((j14 >> 16) & 255));
            bArr[i24 + 3] = (byte) (bArr[r4] | ((j14 >> 24) & 255));
        }
        return bArr;
    }

    public static int Q(byte[] bArr, int i3, int i6, boolean[] zArr) {
        int i7 = i6 - i3;
        AbstractC0582Jp.h0(i7 >= 0);
        if (i7 == 0) {
            return i6;
        }
        if (zArr[0]) {
            R(zArr);
            return i3 - 3;
        }
        if (i7 > 1 && zArr[1] && bArr[i3] == 1) {
            R(zArr);
            return i3 - 2;
        }
        if (i7 > 2 && zArr[2] && bArr[i3] == 0 && bArr[i3 + 1] == 1) {
            R(zArr);
            return i3 - 1;
        }
        int i8 = i6 - 1;
        int i9 = i3 + 2;
        while (i9 < i8) {
            byte b5 = bArr[i9];
            if ((b5 & 254) == 0) {
                int i10 = i9 - 2;
                if (bArr[i10] == 0 && bArr[i9 - 1] == 0 && b5 == 1) {
                    R(zArr);
                    return i10;
                }
                i9 = i10;
            }
            i9 += 3;
        }
        zArr[0] = i7 <= 2 ? !(i7 != 2 ? !(zArr[1] && bArr[i8] == 1) : !(zArr[2] && bArr[i6 + (-2)] == 0 && bArr[i8] == 1)) : bArr[i6 + (-3)] == 0 && bArr[i6 + (-2)] == 0 && bArr[i8] == 1;
        zArr[1] = i7 <= 1 ? zArr[2] && bArr[i8] == 0 : bArr[i6 + (-2)] == 0 && bArr[i8] == 0;
        zArr[2] = bArr[i8] == 0;
        return i6;
    }

    public static void R(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String S(List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            byte[] bArr = (byte[]) list.get(i3);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                JB jb = LB.f9635b;
                C1476lN.v(4, "initialCapacity");
                Object[] objArrCopyOf = new Object[4];
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i6 >= length2) {
                        break;
                    }
                    int iQ = Q(bArr, i6, length2, zArr);
                    if (iQ != length2) {
                        Integer numValueOf = Integer.valueOf(iQ);
                        int length3 = objArrCopyOf.length;
                        int i8 = i7 + 1;
                        int iD = GB.d(length3, i8);
                        if (iD > length3) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                        }
                        objArrCopyOf[i7] = numValueOf;
                        i7 = i8;
                    }
                    i6 = iQ + 3;
                }
                C1197gC c1197gCO = LB.o(i7, objArrCopyOf);
                for (int i9 = 0; i9 < c1197gCO.f14229d; i9++) {
                    if (((Integer) c1197gCO.get(i9)).intValue() + 3 < length) {
                        V0 v0 = new V0(((Integer) c1197gCO.get(i9)).intValue() + 3, length, bArr);
                        T2.d dVarT = T(v0);
                        if (dVarT.f3569a == 33 && dVarT.f3570b == 0) {
                            v0.d(4);
                            int iH = v0.h(3);
                            v0.a();
                            Vx vxU = U(v0, true, iH, null);
                            return AbstractC1224gm.a(vxU.f12115a, vxU.f12116b, vxU.f12117c, vxU.f12118d, vxU.f12119e, vxU.f12120f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static T2.d T(V0 v0) {
        v0.a();
        return new T2.d(v0.h(6), v0.h(6), v0.h(3) - 1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.Vx U(com.google.android.gms.internal.ads.V0 r18, boolean r19, int r20, com.google.android.gms.internal.ads.Vx r21) {
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
            int r3 = r2.f12115a
            boolean r7 = r2.f12116b
            int r8 = r2.f12117c
            int r10 = r2.f12118d
            int[] r4 = r2.f12119e
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
            com.google.android.gms.internal.ads.Vx r11 = new com.google.android.gms.internal.ads.Vx
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2022vd.U(com.google.android.gms.internal.ads.V0, boolean, int, com.google.android.gms.internal.ads.Vx):com.google.android.gms.internal.ads.Vx");
    }

    public static void V(V0 v0) {
        int iJ = v0.j() + 1;
        v0.d(8);
        for (int i3 = 0; i3 < iJ; i3++) {
            v0.j();
            v0.j();
            v0.a();
        }
        v0.d(20);
    }

    public static String W(TP tp) {
        String str;
        String str2 = tp.f11397m;
        if (Objects.equals(str2, "video/dolby-vision") && (str = tp.f11394j) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return "video/avc";
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return str2;
    }

    public static int a(int i3) {
        int i6;
        int i7;
        int i8;
        int i9;
        if ((i3 & (-2097152)) != -2097152 || (i6 = (i3 >>> 19) & 3) == 1 || (i7 = (i3 >>> 17) & 3) == 0 || (i8 = (i3 >>> 12) & 15) == 0 || i8 == 15 || (i9 = (i3 >>> 10) & 3) == 3) {
            return -1;
        }
        int i10 = i8 - 1;
        int i11 = f17290e[i9];
        if (i6 == 2) {
            i11 /= 2;
        } else if (i6 == 0) {
            i11 /= 4;
        }
        int i12 = (i3 >>> 9) & 1;
        if (i7 == 3) {
            return ((((i6 == 3 ? f17291f[i10] : f17292g[i10]) * 12) / i11) + i12) * 4;
        }
        int i13 = i6 == 3 ? i7 == 2 ? f17293h[i10] : i[i10] : f17294j[i10];
        if (i6 == 3) {
            return ((i13 * 144) / i11) + i12;
        }
        return (((i7 == 1 ? 72 : 144) * i13) / i11) + i12;
    }

    public static int b(int i3, byte[] bArr) {
        int i6;
        synchronized (f17281B) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < i3) {
                while (true) {
                    try {
                        if (i7 >= i3 - 2) {
                            i7 = i3;
                            break;
                        }
                        int i9 = i7 + 1;
                        if (bArr[i7] == 0 && bArr[i9] == 0 && bArr[i7 + 2] == 3) {
                            break;
                        }
                        i7 = i9;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i7 < i3) {
                    int[] iArr = f17282C;
                    int length = iArr.length;
                    if (length <= i8) {
                        f17282C = Arrays.copyOf(iArr, length + length);
                    }
                    f17282C[i8] = i7;
                    i7 += 3;
                    i8++;
                }
            }
            i6 = i3 - i8;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                int i13 = f17282C[i12] - i10;
                System.arraycopy(bArr, i10, bArr, i11, i13);
                int i14 = i11 + i13;
                int i15 = i14 + 1;
                bArr[i14] = 0;
                i11 = i14 + 2;
                bArr[i15] = 0;
                i10 += i13 + 3;
            }
            System.arraycopy(bArr, i10, bArr, i11, i6 - i11);
        }
        return i6;
    }

    public static C1834s4 c(A4 a42) throws NumberFormatException {
        long j6;
        boolean z6;
        long j7;
        long j8;
        long j9;
        long jL;
        long j10;
        long j11;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = a42.f6928c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jL2 = str != null ? l(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i3 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z6 = false;
            j7 = 0;
            j8 = 0;
            while (i3 < strArrSplit.length) {
                String strTrim = strArrSplit[i3].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j8 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j7 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z6 = true;
                }
                i3++;
            }
            j6 = 0;
            i3 = 1;
        } else {
            j6 = 0;
            z6 = false;
            j7 = 0;
            j8 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jL3 = str3 != null ? l(str3) : j6;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j9 = jCurrentTimeMillis;
            jL = l(str4);
        } else {
            j9 = jCurrentTimeMillis;
            jL = j6;
        }
        String str5 = (String) map.get("ETag");
        if (i3 != 0) {
            long j12 = (j8 * 1000) + j9;
            if (z6) {
                j11 = j12;
            } else {
                Long.signum(j7);
                j11 = (j7 * 1000) + j12;
            }
            j10 = j12;
        } else {
            j10 = (jL2 <= j6 || jL3 < jL2) ? j6 : (jL3 - jL2) + j9;
            j11 = j10;
        }
        C1834s4 c1834s4 = new C1834s4();
        c1834s4.f16671a = a42.f6927b;
        c1834s4.f16672b = str5;
        c1834s4.f16676f = j10;
        c1834s4.f16675e = j11;
        c1834s4.f16673c = jL2;
        c1834s4.f16674d = jL;
        c1834s4.f16677g = map;
        c1834s4.f16678h = a42.f6929d;
        return c1834s4;
    }

    public static String d(JSONObject jSONObject, String str, String str2) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i3);
                if (jSONObjectOptJSONObject != null) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("including");
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("excluding");
                    if (r(jSONArrayOptJSONArray2, str) && !r(jSONArrayOptJSONArray3, str)) {
                        return jSONObjectOptJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    public static void f(P2 p22, T2 t22) {
        for (int i3 = 0; i3 < p22.a(); i3++) {
            long jH = p22.h(i3);
            ArrayList arrayListI = p22.i(jH);
            if (!arrayListI.isEmpty()) {
                if (i3 == p22.a() - 1) {
                    throw new IllegalStateException();
                }
                long jH2 = p22.h(i3 + 1) - p22.h(i3);
                if (jH2 > 0) {
                    t22.mo4b(new N2(arrayListI, jH, jH2));
                }
            }
        }
    }

    public static void g(InterfaceFutureC2326a interfaceFutureC2326a, String str) {
        YD yd = new YD(str, 4);
        interfaceFutureC2326a.a(new CD(interfaceFutureC2326a, 0, yd), AbstractC0640Nf.f10011g);
    }

    public static void h(String str, String str2) {
        synchronized (f17304t) {
            Log.d(str, N(str2, null));
        }
    }

    public static void i(String str, boolean z6) throws P4 {
        if (!z6) {
            throw P4.a(null, str);
        }
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i3 = 0; i3 < 10; i3++) {
            jArr[i3] = jArr2[i3] + jArr3[i3];
        }
    }

    public static long k(C2036vr c2036vr, int i3, int i6) {
        c2036vr.E(i3);
        if (c2036vr.B() < 5) {
            return -9223372036854775807L;
        }
        int iB = c2036vr.b();
        if ((8388608 & iB) != 0 || ((iB >> 8) & 8191) != i6 || (iB & 32) == 0 || c2036vr.K() < 7 || c2036vr.B() < 7 || (c2036vr.K() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c2036vr.H(0, 6, bArr);
        long j6 = bArr[0];
        long j7 = bArr[1];
        long j8 = bArr[2];
        long j9 = bArr[3] & 255;
        return ((j6 & 255) << 25) | ((j7 & 255) << 17) | ((j8 & 255) << 9) | (j9 + j9) | ((bArr[4] & 255) >> 7);
    }

    public static long l(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e6) {
            if ("0".equals(str) || "-1".equals(str)) {
                I4.a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", I4.d("Unable to parse dateStr: %s, falling back to 0", str), e6);
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
    public static com.google.android.gms.internal.ads.C1239h0 m(com.google.android.gms.internal.ads.C1443kr r11, boolean r12) throws com.google.android.gms.internal.ads.P4 {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2022vd.m(com.google.android.gms.internal.ads.kr, boolean):com.google.android.gms.internal.ads.h0");
    }

    public static Rx n(C2036vr c2036vr, boolean z6, boolean z7) throws P4 {
        if (z6) {
            B(3, c2036vr, false);
        }
        c2036vr.k((int) c2036vr.a(), StandardCharsets.UTF_8);
        long jA = c2036vr.a();
        String[] strArr = new String[(int) jA];
        for (int i3 = 0; i3 < jA; i3++) {
            strArr[i3] = c2036vr.k((int) c2036vr.a(), StandardCharsets.UTF_8);
        }
        if (z7 && (c2036vr.K() & 1) == 0) {
            throw P4.a(null, "framing bit expected to be set");
        }
        return new Rx(2, strArr);
    }

    public static HashMap o(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            Log.d("vd", "decode object failure");
            return null;
        }
    }

    public static void p(String str, String str2) {
        synchronized (f17304t) {
            Log.i(str, N(str2, null));
        }
    }

    public static void q(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i3 = 0; i3 < 10; i3++) {
            jArr[i3] = jArr2[i3] - jArr3[i3];
        }
    }

    public static boolean r(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                String strOptString = jSONArray.optString(i3);
                try {
                } catch (PatternSyntaxException e6) {
                    p2.j.f22785C.f22795h.f("RtbAdapterMap.hasAtleastOneRegexMatch", e6);
                }
                if ((((Boolean) C2841s.f23267e.f23270c.a(H9.gc)).booleanValue() ? Pattern.compile(strOptString, 2) : Pattern.compile(strOptString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int s(TP tp) {
        String strW = W(tp);
        if (Objects.equals(strW, "video/avc")) {
            return 1;
        }
        return Objects.equals(strW, "video/hevc") ? 2 : 0;
    }

    public static final ResolveInfo t(Intent intent, ArrayList arrayList, Context context) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= listQueryIntentActivities.size()) {
                        break;
                    }
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i3).activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                    i3++;
                }
            }
            arrayList.addAll(listQueryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            p2.j.f22785C.f22795h.f("OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent", th);
            return resolveInfo;
        }
    }

    public static U3 u(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            String str = (String) list.get(i3);
            String str2 = Vt.f12096a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                v("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C2047w1.b(new C2036vr(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e6) {
                    z("VorbisUtil", "Failed to parse vorbis picture", e6);
                }
            } else {
                arrayList.add(new P1(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new U3(arrayList);
    }

    public static void v(String str, String str2) {
        synchronized (f17304t) {
            Log.w(str, N(str2, null));
        }
    }

    public static void w(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j6 = jArr[8];
        long j7 = jArr[18];
        long j8 = j6 + (j7 << 4);
        jArr[8] = j8;
        long j9 = j7 + j7 + j8;
        jArr[8] = j9;
        jArr[8] = j9 + j7;
        long j10 = jArr[7];
        long j11 = jArr[17];
        long j12 = j10 + (j11 << 4);
        jArr[7] = j12;
        long j13 = j11 + j11 + j12;
        jArr[7] = j13;
        jArr[7] = j13 + j11;
        long j14 = jArr[6];
        long j15 = jArr[16];
        long j16 = j14 + (j15 << 4);
        jArr[6] = j16;
        long j17 = j15 + j15 + j16;
        jArr[6] = j17;
        jArr[6] = j17 + j15;
        long j18 = jArr[5];
        long j19 = jArr[15];
        long j20 = j18 + (j19 << 4);
        jArr[5] = j20;
        long j21 = j19 + j19 + j20;
        jArr[5] = j21;
        jArr[5] = j21 + j19;
        long j22 = jArr[4];
        long j23 = jArr[14];
        long j24 = j22 + (j23 << 4);
        jArr[4] = j24;
        long j25 = j23 + j23 + j24;
        jArr[4] = j25;
        jArr[4] = j25 + j23;
        long j26 = jArr[3];
        long j27 = jArr[13];
        long j28 = j26 + (j27 << 4);
        jArr[3] = j28;
        long j29 = j27 + j27 + j28;
        jArr[3] = j29;
        jArr[3] = j29 + j27;
        long j30 = jArr[2];
        long j31 = jArr[12];
        long j32 = j30 + (j31 << 4);
        jArr[2] = j32;
        long j33 = j31 + j31 + j32;
        jArr[2] = j33;
        jArr[2] = j33 + j31;
        long j34 = jArr[1];
        long j35 = jArr[11];
        long j36 = j34 + (j35 << 4);
        jArr[1] = j36;
        long j37 = j35 + j35 + j36;
        jArr[1] = j37;
        jArr[1] = j37 + j35;
        long j38 = jArr[0];
        long j39 = jArr[10];
        long j40 = j38 + (j39 << 4);
        jArr[0] = j40;
        long j41 = j39 + j39 + j40;
        jArr[0] = j41;
        jArr[0] = j41 + j39;
        A(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static int x(C1443kr c1443kr) throws P4 {
        int iH = c1443kr.h(4);
        if (iH == 15) {
            if (c1443kr.b() >= 24) {
                return c1443kr.h(24);
            }
            throw P4.a(null, "AAC header insufficient data");
        }
        if (iH < 13) {
            return f17287b[iH];
        }
        throw P4.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static final Intent y(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static void z(String str, String str2, Throwable th) {
        synchronized (f17304t) {
            Log.w(str, N(str2, th));
        }
    }

    public abstract HashMap e();

    public String toString() throws IOException {
        switch (this.f17311a) {
            case 25:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(e());
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
