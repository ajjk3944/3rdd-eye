package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Pair;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class nn1 {
    public static final rt B;

    /* renamed from: m, reason: collision with root package name */
    public static final ah f14348m;

    /* renamed from: n, reason: collision with root package name */
    public static final ah f14349n;

    /* renamed from: o, reason: collision with root package name */
    public static final ah f14350o;

    /* renamed from: y, reason: collision with root package name */
    public static final lo0 f14360y;

    /* renamed from: z, reason: collision with root package name */
    public static final lo0 f14361z;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f14338a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f14339b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f14340c = {64, AppLovinMediationAdapter.ERROR_CHILD_USER, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, Segment.SHARE_MINIMUM, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, Buffer.SEGMENTING_THRESHOLD, 6144, 7680};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f14341d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f14342e = {5, 8, 10, 12};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f14343f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f14344h = {9, 11, 13, 16};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f14345i = {5, 8, 10, 12};
    public static final byte[] j = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f14346k = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* renamed from: l, reason: collision with root package name */
    public static final oa f14347l = new oa("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html", 4);

    /* renamed from: p, reason: collision with root package name */
    public static final o90 f14351p = new o90(0);

    /* renamed from: q, reason: collision with root package name */
    public static final o90 f14352q = new o90(8);

    /* renamed from: r, reason: collision with root package name */
    public static final o90 f14353r = new o90(13);

    /* renamed from: s, reason: collision with root package name */
    public static final o90 f14354s = new o90(17);

    /* renamed from: t, reason: collision with root package name */
    public static final o90 f14355t = new o90(21);

    /* renamed from: u, reason: collision with root package name */
    public static final o90 f14356u = new o90(25);

    /* renamed from: v, reason: collision with root package name */
    public static final lo0 f14357v = new lo0(3);

    /* renamed from: w, reason: collision with root package name */
    public static final lo0 f14358w = new lo0(7);

    /* renamed from: x, reason: collision with root package name */
    public static final lo0 f14359x = new lo0(11);
    public static final kc1 A = new kc1(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final byte[] C = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    static {
        int i4 = 6;
        int i10 = 14;
        f14348m = new ah(i4);
        f14349n = new ah(i10);
        int i11 = 18;
        f14350o = new ah(i11);
        f14360y = new lo0(i10);
        f14361z = new lo0(i11);
        B = new rt(25, new av0(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, i4), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    }

    public static void A(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static Cursor B(SQLiteDatabase sQLiteDatabase, int i4) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i4 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i4 == 1) {
            strArr2[0] = "total_requests";
        } else if (i4 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static void C(rt rtVar, l90 l90Var, kc1 kc1Var) {
        av0 av0Var = (av0) l90Var.f13426b;
        av0 av0Var2 = (av0) rtVar.f15753b;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) av0Var2.f9422b;
        long[] jArr3 = (long[]) av0Var.f9423c;
        long[] jArr4 = (long[]) av0Var.f9422b;
        ls.i(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) av0Var2.f9423c;
        ls.o(jArr5, jArr3, jArr4);
        ls.E(jArr5, jArr5, kc1Var.f13128b);
        long[] jArr6 = kc1Var.f13127a;
        long[] jArr7 = (long[]) av0Var2.f9424d;
        ls.E(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) rtVar.f15754c;
        ls.E(jArr8, (long[]) l90Var.f13427c, kc1Var.f13129c);
        kc1Var.a(jArr2, (long[]) av0Var.f9424d);
        ls.i(jArr, jArr2, jArr2);
        ls.o(jArr2, jArr7, jArr5);
        ls.i(jArr5, jArr7, jArr5);
        ls.i(jArr7, jArr, jArr8);
        ls.o(jArr8, jArr, jArr8);
    }

    public static int D(hk0 hk0Var, int[] iArr) {
        int i4 = 0;
        for (int i10 = 0; i10 < 3 && hk0Var.g(); i10++) {
            i4++;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i4; i12++) {
            i11 += 1 << iArr[i12];
        }
        return hk0Var.h(iArr[i4]) + i11;
    }

    public static void E(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    public static void F(rt rtVar, l90 l90Var, kc1 kc1Var) {
        av0 av0Var = (av0) l90Var.f13426b;
        av0 av0Var2 = (av0) rtVar.f15753b;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) av0Var2.f9422b;
        long[] jArr3 = (long[]) av0Var.f9423c;
        long[] jArr4 = (long[]) av0Var.f9422b;
        ls.i(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) av0Var2.f9423c;
        ls.o(jArr5, jArr3, jArr4);
        ls.E(jArr5, jArr5, kc1Var.f13127a);
        long[] jArr6 = kc1Var.f13128b;
        long[] jArr7 = (long[]) av0Var2.f9424d;
        ls.E(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) rtVar.f15754c;
        ls.E(jArr8, (long[]) l90Var.f13427c, kc1Var.f13129c);
        kc1Var.a(jArr2, (long[]) av0Var.f9424d);
        ls.i(jArr, jArr2, jArr2);
        ls.o(jArr2, jArr7, jArr5);
        ls.i(jArr5, jArr7, jArr5);
        ls.o(jArr7, jArr, jArr8);
        ls.i(jArr8, jArr, jArr8);
    }

    public static hk0 G(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new hk0(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b11 = bArrCopyOf[0];
        if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
            for (int i4 = 0; i4 < bArrCopyOf.length - 1; i4 += 2) {
                byte b12 = bArrCopyOf[i4];
                int i10 = i4 + 1;
                bArrCopyOf[i4] = bArrCopyOf[i10];
                bArrCopyOf[i10] = b12;
            }
        }
        int length = bArrCopyOf.length;
        hk0 hk0Var = new hk0(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            hk0 hk0Var2 = new hk0(bArrCopyOf, length);
            while (hk0Var2.b() >= 16) {
                hk0Var2.f(2);
                int iH = hk0Var2.h(14);
                int iMin = Math.min(8 - hk0Var.f11895c, 14);
                int i11 = hk0Var.f11895c;
                int i12 = (8 - i11) - iMin;
                byte[] bArr2 = hk0Var.f11893a;
                int i13 = hk0Var.f11894b;
                byte b13 = (byte) (((65280 >> i11) | ((1 << i12) - 1)) & bArr2[i13]);
                bArr2[i13] = b13;
                int i14 = 14 - iMin;
                int i15 = iH & 16383;
                bArr2[i13] = (byte) (b13 | ((i15 >>> i14) << i12));
                int i16 = i13 + 1;
                while (i14 > 8) {
                    i14 -= 8;
                    hk0Var.f11893a[i16] = (byte) (i15 >>> i14);
                    i16++;
                }
                byte[] bArr3 = hk0Var.f11893a;
                byte b14 = (byte) (bArr3[i16] & ((1 << r7) - 1));
                bArr3[i16] = b14;
                bArr3[i16] = (byte) (((i15 & ((1 << i14) - 1)) << (8 - i14)) | b14);
                hk0Var.f(14);
                hk0Var.m();
            }
        }
        int length2 = bArrCopyOf.length;
        hk0Var.f11893a = bArrCopyOf;
        hk0Var.f11894b = 0;
        hk0Var.f11895c = 0;
        hk0Var.f11896d = length2;
        return hk0Var;
    }

    public static void H(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void I(rt rtVar, av0 av0Var) {
        av0 av0Var2 = (av0) rtVar.f15753b;
        long[] jArr = (long[]) av0Var2.f9422b;
        long[] jArr2 = (long[]) av0Var.f9422b;
        long[] jArr3 = new long[10];
        ls.I(jArr, jArr2);
        long[] jArr4 = (long[]) av0Var2.f9424d;
        long[] jArr5 = (long[]) av0Var.f9423c;
        ls.I(jArr4, jArr5);
        long[] jArr6 = (long[]) rtVar.f15754c;
        ls.I(jArr6, (long[]) av0Var.f9424d);
        ls.i(jArr6, jArr6, jArr6);
        long[] jArr7 = (long[]) av0Var2.f9423c;
        ls.i(jArr7, jArr2, jArr5);
        ls.I(jArr3, jArr7);
        ls.i(jArr7, jArr4, jArr);
        ls.o(jArr4, jArr4, jArr);
        ls.o(jArr, jArr3, jArr7);
        ls.o(jArr6, jArr6, jArr4);
    }

    public static int J(int i4, int i10) {
        int i11 = (~(i4 ^ i10)) & 255;
        int i12 = i11 & (i11 << 4);
        int i13 = i12 & (i12 << 2);
        return (i13 & (i13 + i13)) >> 7;
    }

    public static void K(kc1 kc1Var, int i4, byte b10) {
        kc1[][] kc1VarArr = mc1.f13867d;
        int i10 = (b10 & 255) >> 7;
        int i11 = (-i10) & b10;
        int i12 = b10 - (i11 + i11);
        kc1Var.b(kc1VarArr[i4][0], J(i12, 1));
        kc1Var.b(kc1VarArr[i4][1], J(i12, 2));
        kc1Var.b(kc1VarArr[i4][2], J(i12, 3));
        kc1Var.b(kc1VarArr[i4][3], J(i12, 4));
        kc1Var.b(kc1VarArr[i4][4], J(i12, 5));
        kc1Var.b(kc1VarArr[i4][5], J(i12, 6));
        kc1Var.b(kc1VarArr[i4][6], J(i12, 7));
        kc1Var.b(kc1VarArr[i4][7], J(i12, 8));
        long[] jArr = kc1Var.f13129c;
        long[] jArr2 = kc1Var.f13127a;
        long[] jArr3 = kc1Var.f13128b;
        long[] jArrCopyOf = Arrays.copyOf(jArr3, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr, 10);
        for (int i13 = 0; i13 < jArrCopyOf3.length; i13++) {
            jArrCopyOf3[i13] = -jArrCopyOf3[i13];
        }
        mq0.n(jArr2, jArrCopyOf, i10);
        mq0.n(jArr3, jArrCopyOf2, i10);
        mq0.n(jArr, jArrCopyOf3, i10);
    }

    public static byte[] L(byte[] bArr) {
        int i4;
        byte[] bArr2 = new byte[256];
        for (int i10 = 0; i10 < 256; i10++) {
            bArr2[i10] = (byte) (1 & ((bArr[i10 >> 3] & 255) >> (i10 & 7)));
        }
        for (int i11 = 0; i11 < 256; i11++) {
            if (bArr2[i11] != 0) {
                for (int i12 = 1; i12 <= 6 && (i4 = i11 + i12) < 256; i12++) {
                    byte b10 = bArr2[i4];
                    if (b10 != 0) {
                        byte b11 = bArr2[i11];
                        int i13 = b10 << i12;
                        int i14 = b11 + i13;
                        if (i14 <= 15) {
                            bArr2[i11] = (byte) i14;
                            bArr2[i4] = 0;
                        } else {
                            int i15 = b11 - i13;
                            if (i15 >= -15) {
                                bArr2[i11] = (byte) i15;
                                while (true) {
                                    if (i4 >= 256) {
                                        break;
                                    }
                                    if (bArr2[i4] == 0) {
                                        bArr2[i4] = 1;
                                        break;
                                    }
                                    bArr2[i4] = 0;
                                    i4++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static long M(int i4, byte[] bArr) {
        return ((bArr[i4 + 2] & 255) << 16) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8);
    }

    public static long N(int i4, byte[] bArr) {
        return ((bArr[i4 + 3] & 255) << 24) | M(i4, bArr);
    }

    public static int a(int i4) {
        if (i4 == 2147385345 || i4 == -25230976 || i4 == 536864768 || i4 == -14745368) {
            return 1;
        }
        if (i4 == 1683496997 || i4 == 622876772) {
            return 2;
        }
        if (i4 == 1078008818 || i4 == -233094848) {
            return 3;
        }
        return (i4 == 1908687592 || i4 == -398277519) ? 4 : 0;
    }

    public static String b(JSONObject jSONObject, String str, String str2) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i4);
                if (jSONObjectOptJSONObject != null) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("including");
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("excluding");
                    if (l(jSONArrayOptJSONArray2, str) && !l(jSONArrayOptJSONArray3, str)) {
                        return jSONObjectOptJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    public static void c(p6 p6Var, ca.c cVar) {
        for (int i4 = 0; i4 < p6Var.b(); i4++) {
            long jL1 = p6Var.L1(i4);
            ArrayList arrayListG = p6Var.g(jL1);
            if (!arrayListG.isEmpty()) {
                if (i4 == p6Var.b() - 1) {
                    throw new IllegalStateException();
                }
                long jL12 = p6Var.L1(i4 + 1) - p6Var.L1(i4);
                if (jL12 > 0) {
                    cVar.mo160c(new n6(arrayListG, jL1, jL12));
                }
            }
        }
    }

    public static void d(String str, boolean z3) throws ua {
        if (!z3) {
            throw ua.a(null, str);
        }
    }

    public static void e(vd.b bVar, String str) {
        ka1 ka1Var = new ka1(str, 5);
        bVar.a(new q81(0, bVar, ka1Var), fx.g);
    }

    public static boolean f(y1 y1Var) {
        sk0 sk0Var = new sk0(8);
        int i4 = o.a(y1Var, sk0Var).f14493a;
        if (i4 != 1380533830 && i4 != 1380333108) {
            return false;
        }
        y1Var.M1(0, 4, sk0Var.f16446a);
        sk0Var.E(0);
        int iB = sk0Var.b();
        if (iB == 1463899717) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iB).length() + 23);
        sb2.append("Unsupported form type: ");
        sb2.append(iB);
        ls.D("WavHeaderReader", sb2.toString());
        return false;
    }

    public static byte[] g(byte[] bArr) {
        int i4;
        byte[] bArr2 = new byte[64];
        int i10 = 0;
        while (true) {
            if (i10 >= 32) {
                break;
            }
            int i11 = i10 + i10;
            bArr2[i11] = (byte) (bArr[i10] & 15);
            bArr2[i11 + 1] = (byte) ((bArr[i10] & 255) >> 4);
            i10++;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < 63) {
            byte b10 = (byte) (bArr2[i12] + i13);
            bArr2[i12] = b10;
            int i14 = (b10 + 8) >> 4;
            bArr2[i12] = (byte) (b10 - (i14 << 4));
            i12++;
            i13 = i14;
        }
        bArr2[63] = (byte) (bArr2[63] + i13);
        rt rtVar = new rt(25);
        l90 l90Var = new l90(22);
        for (i4 = 1; i4 < 64; i4 += 2) {
            kc1 kc1Var = new kc1();
            K(kc1Var, i4 / 2, bArr2[i4]);
            l90.q(l90Var, rtVar);
            C(rtVar, l90Var, kc1Var);
        }
        av0 av0Var = new av0(6);
        av0.d(rtVar, av0Var);
        I(rtVar, av0Var);
        av0.d(rtVar, av0Var);
        I(rtVar, av0Var);
        av0.d(rtVar, av0Var);
        I(rtVar, av0Var);
        av0.d(rtVar, av0Var);
        I(rtVar, av0Var);
        for (int i15 = 0; i15 < 64; i15 += 2) {
            kc1 kc1Var2 = new kc1();
            K(kc1Var2, i15 / 2, bArr2[i15]);
            l90.q(l90Var, rtVar);
            C(rtVar, l90Var, kc1Var2);
        }
        av0 av0Var2 = new av0(rtVar);
        long[] jArr = new long[10];
        ls.I(jArr, (long[]) av0Var2.f9422b);
        long[] jArr2 = new long[10];
        ls.I(jArr2, (long[]) av0Var2.f9423c);
        long[] jArr3 = new long[10];
        ls.I(jArr3, (long[]) av0Var2.f9424d);
        long[] jArr4 = new long[10];
        ls.I(jArr4, jArr3);
        long[] jArr5 = new long[10];
        ls.o(jArr5, jArr2, jArr);
        ls.E(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        ls.E(jArr6, jArr, jArr2);
        ls.E(jArr6, jArr6, mc1.f13864a);
        ls.i(jArr6, jArr6, jArr4);
        ls.v(jArr6, jArr6);
        if (MessageDigest.isEqual(ls.O(jArr5), ls.O(jArr6))) {
            return av0Var2.l();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static int h(int i4) {
        switch (i4) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static long i(sk0 sk0Var, int i4, int i10) {
        sk0Var.E(i4);
        if (sk0Var.B() < 5) {
            return -9223372036854775807L;
        }
        int iB = sk0Var.b();
        if ((8388608 & iB) != 0 || ((iB >> 8) & 8191) != i10 || (iB & 32) == 0 || sk0Var.K() < 7 || sk0Var.B() < 7 || (sk0Var.K() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        sk0Var.H(0, 6, bArr);
        long j8 = bArr[0];
        long j9 = bArr[1];
        long j10 = bArr[2];
        long j11 = bArr[3] & 255;
        return ((j8 & 255) << 25) | ((j9 & 255) << 17) | ((j10 & 255) << 9) | (j11 + j11) | ((bArr[4] & 255) >> 7);
    }

    public static mx0 j(sk0 sk0Var, boolean z3, boolean z10) throws ua {
        if (z3) {
            t(3, sk0Var, false);
        }
        sk0Var.k((int) sk0Var.a(), StandardCharsets.UTF_8);
        long jA = sk0Var.a();
        String[] strArr = new String[(int) jA];
        for (int i4 = 0; i4 < jA; i4++) {
            strArr[i4] = sk0Var.k((int) sk0Var.a(), StandardCharsets.UTF_8);
        }
        if (z10 && (sk0Var.K() & 1) == 0) {
            throw ua.a(null, "framing bit expected to be set");
        }
        return new mx0(2, strArr);
    }

    public static jn1 k() {
        ClassLoader classLoader = nn1.class.getClassLoader();
        if (jn1.class.equals(jn1.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new nn1[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e10) {
                    Logger.getLogger(hn1.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(jn1.class.getSimpleName()), (Throwable) e10);
                }
            }
            if (arrayList.size() == 1) {
                return (jn1) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (jn1) jn1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static boolean l(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                String strOptString = jSONArray.optString(i4);
                try {
                } catch (PatternSyntaxException e2) {
                    ua.j.C.f35265h.f("RtbAdapterMap.hasAtleastOneRegexMatch", e2);
                }
                if ((((Boolean) va.s.f36163e.f36166c.a(sk.f16172ic)).booleanValue() ? Pattern.compile(strOptString, 2) : Pattern.compile(strOptString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] m(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) ml1.f13941e.f13943a.g("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i4 = bArrDigest[31] & 127;
        bArrDigest[31] = (byte) i4;
        bArrDigest[31] = (byte) (i4 | 64);
        return bArrDigest;
    }

    public static int n(SQLiteDatabase sQLiteDatabase, int i4) {
        int i10 = 0;
        if (i4 == 2) {
            return 0;
        }
        Cursor cursorB = B(sQLiteDatabase, i4);
        if (cursorB.getCount() > 0) {
            cursorB.moveToNext();
            i10 = cursorB.getInt(cursorB.getColumnIndexOrThrow("value"));
        }
        cursorB.close();
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int o(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4e
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r3]
        L1f:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r1 = r1 | r2
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5c
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 8
            r7 = r7[r2]
        L35:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r0 = r0 | r1
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5c
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 9
            r7 = r7[r2]
            goto L35
        L4e:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r4]
            goto L1f
        L5c:
            if (r0 == 0) goto L62
            int r7 = r7 * 16
            int r7 = r7 / 14
        L62:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nn1.o(byte[]):int");
    }

    public static final ResolveInfo p(Intent intent, ArrayList arrayList, Context context) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                int i4 = 0;
                while (true) {
                    if (i4 >= listQueryIntentActivities.size()) {
                        break;
                    }
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i4).activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                    i4++;
                }
            }
            arrayList.addAll(listQueryIntentActivities);
            return resolveInfo;
        } catch (Throwable th2) {
            ua.j.C.f35265h.f("OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent", th2);
            return resolveInfo;
        }
    }

    public static v8 q(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            String str = (String) list.get(i4);
            String str2 = bq0.f9768a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                ls.t("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(x3.b(new sk0(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e2) {
                    ls.y("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new q4(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new v8(arrayList);
    }

    public static final Intent r(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static o s(int i4, y1 y1Var, sk0 sk0Var) throws ua {
        o oVarA = o.a(y1Var, sk0Var);
        while (true) {
            int i10 = oVarA.f14493a;
            if (i10 == i4) {
                return oVarA;
            }
            a0.g.z(new StringBuilder(String.valueOf(i10).length() + 28), "Ignoring unknown WAV chunk: ", i10, "WavHeaderReader");
            long j8 = oVarA.f14494b;
            long j9 = 8 + j8;
            if ((1 & j8) != 0) {
                j9 = 9 + j8;
            }
            if (j9 > 2147483647L) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i10);
                throw ua.b(sb2.toString());
            }
            y1Var.K1((int) j9);
            oVarA = o.a(y1Var, sk0Var);
        }
    }

    public static boolean t(int i4, sk0 sk0Var, boolean z3) throws ua {
        if (sk0Var.B() < 7) {
            if (z3) {
                return false;
            }
            int iB = sk0Var.B();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iB).length() + 18);
            sb2.append("too short header: ");
            sb2.append(iB);
            throw ua.a(null, sb2.toString());
        }
        if (sk0Var.K() != i4) {
            if (z3) {
                return false;
            }
            throw ua.a(null, "expected header type ".concat(String.valueOf(Integer.toHexString(i4))));
        }
        if (sk0Var.K() == 118 && sk0Var.K() == 111 && sk0Var.K() == 114 && sk0Var.K() == 98 && sk0Var.K() == 105 && sk0Var.K() == 115) {
            return true;
        }
        if (z3) {
            return false;
        }
        throw ua.a(null, "expected characters 'vorbis'");
    }

    public static Pair u(RandomAccessFile randomAccessFile, int i4) throws IOException {
        int i10;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i4, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - byteBufferAllocate.capacity();
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        A(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i10 = -1;
        } else {
            int i11 = iCapacity - 22;
            int iMin = Math.min(i11, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            for (int i12 = 0; i12 < iMin; i12++) {
                i10 = i11 - i12;
                if (byteBufferAllocate.getInt(i10) == 101010256 && ((char) byteBufferAllocate.getShort(i10 + 20)) == i12) {
                    break;
                }
            }
            i10 = -1;
        }
        if (i10 == -1) {
            return null;
        }
        byteBufferAllocate.position(i10);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + i10));
    }

    public static void v(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    public static void w(SQLiteDatabase sQLiteDatabase, long j8, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j8));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j8)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static /* synthetic */ boolean x(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        ls.z(jArr2);
        byte[] bArrO = ls.O(jArr2);
        for (int i4 = 0; i4 < 32; i4++) {
            if (bArrO[i4] != 0) {
                return true;
            }
        }
        return false;
    }

    public static int y(int i4) {
        if (i4 == 20) {
            return 63750;
        }
        if (i4 == 30) {
            return 2250000;
        }
        switch (i4) {
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
                switch (i4) {
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

    public static int z(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
        if (sharedPreferences == null) {
            return 0;
        }
        try {
            return sharedPreferences.getInt(str, 0);
        } catch (ClassCastException unused) {
            return 0;
        }
    }
}
