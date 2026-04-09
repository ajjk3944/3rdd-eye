package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import j$.util.Objects;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import q2.C2841s;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.bL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0933bL {

    /* renamed from: B, reason: collision with root package name */
    public static final C1879sw f13349B;

    /* renamed from: m, reason: collision with root package name */
    public static final P7 f13362m;

    /* renamed from: n, reason: collision with root package name */
    public static final P7 f13363n;

    /* renamed from: o, reason: collision with root package name */
    public static final P7 f13364o;

    /* renamed from: y, reason: collision with root package name */
    public static final C1122et f13374y;

    /* renamed from: z, reason: collision with root package name */
    public static final C1122et f13375z;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f13351a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f13352b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f13353c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f13354d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f13355e = {5, 8, 10, 12};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f13356f = {6, 9, 12, 15};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f13357g = {2, 4, 6, 8};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f13358h = {9, 11, 13, 16};
    public static final int[] i = {5, 8, 10, 12};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f13359j = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f13360k = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* renamed from: l, reason: collision with root package name */
    public static final J4 f13361l = new J4(4, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html", "gads:sdk_core_location");

    /* renamed from: p, reason: collision with root package name */
    public static final C0748Tl f13365p = new C0748Tl(0);

    /* renamed from: q, reason: collision with root package name */
    public static final C0748Tl f13366q = new C0748Tl(8);

    /* renamed from: r, reason: collision with root package name */
    public static final C0748Tl f13367r = new C0748Tl(13);

    /* renamed from: s, reason: collision with root package name */
    public static final C0748Tl f13368s = new C0748Tl(17);

    /* renamed from: t, reason: collision with root package name */
    public static final C0748Tl f13369t = new C0748Tl(21);

    /* renamed from: u, reason: collision with root package name */
    public static final C0748Tl f13370u = new C0748Tl(25);

    /* renamed from: v, reason: collision with root package name */
    public static final C1122et f13371v = new C1122et(3);

    /* renamed from: w, reason: collision with root package name */
    public static final C1122et f13372w = new C1122et(7);

    /* renamed from: x, reason: collision with root package name */
    public static final C1122et f13373x = new C1122et(11);

    /* renamed from: A, reason: collision with root package name */
    public static final C2115xF f13348A = new C2115xF(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f13350C = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    static {
        int i3 = 6;
        int i6 = 14;
        f13362m = new P7(i3);
        f13363n = new P7(i6);
        int i7 = 18;
        f13364o = new P7(i7);
        f13374y = new C1122et(i6);
        f13375z = new C1122et(i7);
        f13349B = new C1879sw(new C2041vw(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, i3), 2, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    }

    public static void A(C1443kr c1443kr) {
        c1443kr.f(3);
        c1443kr.f(8);
        boolean zG = c1443kr.g();
        boolean zG2 = c1443kr.g();
        if (zG) {
            c1443kr.f(5);
        }
        if (zG2) {
            c1443kr.f(6);
        }
    }

    public static /* synthetic */ boolean B(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        AbstractC2022vd.A(jArr2);
        byte[] bArrP = AbstractC2022vd.P(jArr2);
        for (int i3 = 0; i3 < 32; i3++) {
            if (bArrP[i3] != 0) {
                return true;
            }
        }
        return false;
    }

    public static int C(C1443kr c1443kr, int i3, int i6, int i7) {
        AbstractC0582Jp.m(Math.max(Math.max(i3, i6), i7) <= 31);
        int i8 = (1 << i3) - 1;
        int i9 = (1 << i6) - 1;
        long j6 = i8 + i9;
        long j7 = (int) j6;
        if (j6 != j7) {
            throw new ArithmeticException();
        }
        if (j7 + (1 << i7) != ((int) r6)) {
            throw new ArithmeticException();
        }
        if (c1443kr.b() >= i3) {
            int iH = c1443kr.h(i3);
            if (iH == i8) {
                if (c1443kr.b() >= i6) {
                    int iH2 = c1443kr.h(i6);
                    iH += iH2;
                    if (iH2 == i9) {
                        if (c1443kr.b() >= i7) {
                            return c1443kr.h(i7) + iH;
                        }
                    }
                }
            }
            return iH;
        }
        return -1;
    }

    public static void D(String str, boolean z6) throws C1924tn {
        if (z6) {
            return;
        }
        JB jb = LB.f9635b;
        throw new C1924tn(str, C1197gC.f14227e);
    }

    public static void E(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static long F(byte b5, byte b6) {
        int i3;
        int i6 = b5 & 255;
        int i7 = b5 & 3;
        if (i7 != 0) {
            i3 = 2;
            if (i7 != 1 && i7 != 2) {
                i3 = b6 & 63;
            }
        } else {
            i3 = 1;
        }
        int i8 = i6 >> 3;
        return i3 * (i8 >= 16 ? 2500 << r6 : i8 >= 12 ? 10000 << (i8 & 1) : (i8 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static void G(C1879sw c1879sw, Vu vu, C2115xF c2115xF) {
        C2041vw c2041vw = (C2041vw) vu.f12105a;
        C2041vw c2041vw2 = (C2041vw) c1879sw.f16823b;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) c2041vw2.f17369b;
        long[] jArr3 = (long[]) c2041vw.f17370c;
        long[] jArr4 = (long[]) c2041vw.f17369b;
        AbstractC2022vd.j(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) c2041vw2.f17370c;
        AbstractC2022vd.q(jArr5, jArr3, jArr4);
        AbstractC2022vd.G(jArr5, jArr5, c2115xF.f17563b);
        long[] jArr6 = c2115xF.f17562a;
        long[] jArr7 = (long[]) c2041vw2.f17371d;
        AbstractC2022vd.G(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) c1879sw.f16824c;
        AbstractC2022vd.G(jArr8, (long[]) vu.f12106b, c2115xF.f17564c);
        c2115xF.a(jArr2, (long[]) c2041vw.f17371d);
        AbstractC2022vd.j(jArr, jArr2, jArr2);
        AbstractC2022vd.q(jArr2, jArr7, jArr5);
        AbstractC2022vd.j(jArr5, jArr7, jArr5);
        AbstractC2022vd.j(jArr7, jArr, jArr8);
        AbstractC2022vd.q(jArr8, jArr, jArr8);
    }

    public static boolean H(String str) throws C1924tn {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        D("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        D("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        z();
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static int I(C1443kr c1443kr, int[] iArr) {
        int i3 = 0;
        for (int i6 = 0; i6 < 3 && c1443kr.g(); i6++) {
            i3++;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < i3; i8++) {
            i7 += 1 << iArr[i8];
        }
        return c1443kr.h(iArr[i3]) + i7;
    }

    public static void J(C1879sw c1879sw, Vu vu, C2115xF c2115xF) {
        C2041vw c2041vw = (C2041vw) vu.f12105a;
        C2041vw c2041vw2 = (C2041vw) c1879sw.f16823b;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) c2041vw2.f17369b;
        long[] jArr3 = (long[]) c2041vw.f17370c;
        long[] jArr4 = (long[]) c2041vw.f17369b;
        AbstractC2022vd.j(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) c2041vw2.f17370c;
        AbstractC2022vd.q(jArr5, jArr3, jArr4);
        AbstractC2022vd.G(jArr5, jArr5, c2115xF.f17562a);
        long[] jArr6 = c2115xF.f17563b;
        long[] jArr7 = (long[]) c2041vw2.f17371d;
        AbstractC2022vd.G(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) c1879sw.f16824c;
        AbstractC2022vd.G(jArr8, (long[]) vu.f12106b, c2115xF.f17564c);
        c2115xF.a(jArr2, (long[]) c2041vw.f17371d);
        AbstractC2022vd.j(jArr, jArr2, jArr2);
        AbstractC2022vd.q(jArr2, jArr7, jArr5);
        AbstractC2022vd.j(jArr5, jArr7, jArr5);
        AbstractC2022vd.q(jArr7, jArr, jArr8);
        AbstractC2022vd.j(jArr8, jArr, jArr8);
    }

    public static C1443kr K(byte[] bArr) {
        byte b5 = bArr[0];
        if (b5 == 127 || b5 == 100 || b5 == 64 || b5 == 113) {
            return new C1443kr(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b6 = bArrCopyOf[0];
        if (b6 == -2 || b6 == -1 || b6 == 37 || b6 == -14 || b6 == -24) {
            for (int i3 = 0; i3 < bArrCopyOf.length - 1; i3 += 2) {
                byte b7 = bArrCopyOf[i3];
                int i6 = i3 + 1;
                bArrCopyOf[i3] = bArrCopyOf[i6];
                bArrCopyOf[i6] = b7;
            }
        }
        int length = bArrCopyOf.length;
        C1443kr c1443kr = new C1443kr(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            C1443kr c1443kr2 = new C1443kr(bArrCopyOf, length);
            while (c1443kr2.b() >= 16) {
                c1443kr2.f(2);
                int iH = c1443kr2.h(14);
                int iMin = Math.min(8 - c1443kr.f15296c, 14);
                int i7 = c1443kr.f15296c;
                int i8 = (8 - i7) - iMin;
                byte[] bArr2 = c1443kr.f15294a;
                int i9 = c1443kr.f15295b;
                byte b8 = (byte) (((65280 >> i7) | ((1 << i8) - 1)) & bArr2[i9]);
                bArr2[i9] = b8;
                int i10 = 14 - iMin;
                int i11 = iH & 16383;
                bArr2[i9] = (byte) (b8 | ((i11 >>> i10) << i8));
                int i12 = i9 + 1;
                while (i10 > 8) {
                    i10 -= 8;
                    c1443kr.f15294a[i12] = (byte) (i11 >>> i10);
                    i12++;
                }
                byte[] bArr3 = c1443kr.f15294a;
                byte b9 = (byte) (bArr3[i12] & ((1 << r7) - 1));
                bArr3[i12] = b9;
                bArr3[i12] = (byte) (((i11 & ((1 << i10) - 1)) << (8 - i10)) | b9);
                c1443kr.f(14);
                c1443kr.m();
            }
        }
        int length2 = bArrCopyOf.length;
        c1443kr.f15294a = bArrCopyOf;
        c1443kr.f15295b = 0;
        c1443kr.f15296c = 0;
        c1443kr.f15297d = length2;
        return c1443kr;
    }

    public static void L(C1879sw c1879sw, C2041vw c2041vw) {
        C2041vw c2041vw2 = (C2041vw) c1879sw.f16823b;
        long[] jArr = (long[]) c2041vw2.f17369b;
        long[] jArr2 = (long[]) c2041vw.f17369b;
        long[] jArr3 = new long[10];
        AbstractC2022vd.L(jArr, jArr2);
        long[] jArr4 = (long[]) c2041vw2.f17371d;
        long[] jArr5 = (long[]) c2041vw.f17370c;
        AbstractC2022vd.L(jArr4, jArr5);
        long[] jArr6 = (long[]) c1879sw.f16824c;
        AbstractC2022vd.L(jArr6, (long[]) c2041vw.f17371d);
        AbstractC2022vd.j(jArr6, jArr6, jArr6);
        long[] jArr7 = (long[]) c2041vw2.f17370c;
        AbstractC2022vd.j(jArr7, jArr2, jArr5);
        AbstractC2022vd.L(jArr3, jArr7);
        AbstractC2022vd.j(jArr7, jArr4, jArr);
        AbstractC2022vd.q(jArr4, jArr4, jArr);
        AbstractC2022vd.q(jArr, jArr3, jArr7);
        AbstractC2022vd.q(jArr6, jArr6, jArr4);
    }

    public static int M(int i3, int i6) {
        int i7 = (~(i3 ^ i6)) & 255;
        int i8 = i7 & (i7 << 4);
        int i9 = i8 & (i8 << 2);
        return (i9 & (i9 + i9)) >> 7;
    }

    public static void N(C2115xF c2115xF, int i3, byte b5) {
        C2115xF[][] c2115xFArr = AbstractC2223zF.f17845d;
        int i6 = (b5 & 255) >> 7;
        int i7 = (-i6) & b5;
        int i8 = b5 - (i7 + i7);
        c2115xF.b(c2115xFArr[i3][0], M(i8, 1));
        c2115xF.b(c2115xFArr[i3][1], M(i8, 2));
        c2115xF.b(c2115xFArr[i3][2], M(i8, 3));
        c2115xF.b(c2115xFArr[i3][3], M(i8, 4));
        c2115xF.b(c2115xFArr[i3][4], M(i8, 5));
        c2115xF.b(c2115xFArr[i3][5], M(i8, 6));
        c2115xF.b(c2115xFArr[i3][6], M(i8, 7));
        c2115xF.b(c2115xFArr[i3][7], M(i8, 8));
        long[] jArr = c2115xF.f17564c;
        long[] jArr2 = c2115xF.f17562a;
        long[] jArr3 = c2115xF.f17563b;
        long[] jArrCopyOf = Arrays.copyOf(jArr3, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr, 10);
        for (int i9 = 0; i9 < jArrCopyOf3.length; i9++) {
            jArrCopyOf3[i9] = -jArrCopyOf3[i9];
        }
        AbstractC0582Jp.n(jArr2, jArrCopyOf, i6);
        AbstractC0582Jp.n(jArr3, jArrCopyOf2, i6);
        AbstractC0582Jp.n(jArr, jArrCopyOf3, i6);
    }

    public static byte[] O(byte[] bArr) {
        int i3;
        byte[] bArr2 = new byte[256];
        for (int i6 = 0; i6 < 256; i6++) {
            bArr2[i6] = (byte) (1 & ((bArr[i6 >> 3] & 255) >> (i6 & 7)));
        }
        for (int i7 = 0; i7 < 256; i7++) {
            if (bArr2[i7] != 0) {
                for (int i8 = 1; i8 <= 6 && (i3 = i7 + i8) < 256; i8++) {
                    byte b5 = bArr2[i3];
                    if (b5 != 0) {
                        byte b6 = bArr2[i7];
                        int i9 = b5 << i8;
                        int i10 = b6 + i9;
                        if (i10 <= 15) {
                            bArr2[i7] = (byte) i10;
                            bArr2[i3] = 0;
                        } else {
                            int i11 = b6 - i9;
                            if (i11 >= -15) {
                                bArr2[i7] = (byte) i11;
                                while (true) {
                                    if (i3 >= 256) {
                                        break;
                                    }
                                    if (bArr2[i3] == 0) {
                                        bArr2[i3] = 1;
                                        break;
                                    }
                                    bArr2[i3] = 0;
                                    i3++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static long P(int i3, byte[] bArr) {
        return ((bArr[i3 + 2] & 255) << 16) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8);
    }

    public static long Q(int i3, byte[] bArr) {
        return ((bArr[i3 + 3] & 255) << 24) | P(i3, bArr);
    }

    public static int a(int i3) {
        if (i3 == 2147385345 || i3 == -25230976 || i3 == 536864768 || i3 == -14745368) {
            return 1;
        }
        if (i3 == 1683496997 || i3 == 622876772) {
            return 2;
        }
        if (i3 == 1078008818 || i3 == -233094848) {
            return 3;
        }
        return (i3 == 1908687592 || i3 == -398277519) ? 4 : 0;
    }

    public static String b(String str, Context context, boolean z6, HashMap map) {
        String strD;
        E9 e9 = H9.f8643O0;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (((Boolean) g9.a(e9)).booleanValue() && !z6) {
            return str;
        }
        p2.j jVar = p2.j.f22785C;
        C1593nf c1593nf = jVar.f22811y;
        C2911G c2911g = jVar.f22790c;
        C1593nf c1593nf2 = jVar.f22811y;
        if (!c1593nf.a(context) || TextUtils.isEmpty(str) || (strD = c1593nf2.d(context)) == null) {
            return str;
        }
        String str2 = (String) g92.a(H9.f8602H0);
        if (((Boolean) g92.a(H9.f8595G0)).booleanValue() && str.contains(str2)) {
            if (c2911g.G(str)) {
                Map map2 = (Map) map.get("_ac");
                c1593nf2.getClass();
                c1593nf2.h(context, C1593nf.f(map2), "_ac", strD);
                return w(context, str).replace(str2, strD);
            }
            if (!c2911g.H(str)) {
                return str;
            }
            Map map3 = (Map) map.get("_ai");
            c1593nf2.getClass();
            c1593nf2.h(context, C1593nf.f(map3), "_ai", strD);
            return w(context, str).replace(str2, strD);
        }
        if (str.contains("fbs_aeid") || ((Boolean) g92.a(H9.f8590F0)).booleanValue()) {
            return str;
        }
        if (c2911g.G(str)) {
            Map map4 = (Map) map.get("_ac");
            c1593nf2.getClass();
            c1593nf2.h(context, C1593nf.f(map4), "_ac", strD);
            return r(w(context, str), "fbs_aeid", strD).toString();
        }
        if (!c2911g.H(str)) {
            return str;
        }
        Map map5 = (Map) map.get("_ai");
        c1593nf2.getClass();
        c1593nf2.h(context, C1593nf.f(map5), "_ai", strD);
        return r(w(context, str), "fbs_aeid", strD).toString();
    }

    public static String c(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z6 = false;
        String str = null;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            String str2 = ((C2) obj).f7493a.f17814g.f11397m;
            if (D4.b(str2)) {
                return "video/mp4";
            }
            if (D4.a(str2)) {
                z6 = true;
            } else if (D4.c(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z6 ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static ArrayList d(byte[] bArr) {
        long j6 = ((bArr[11] & 255) << 8) | (bArr[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((j6 * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static void e(long j6, C2036vr c2036vr, T0[] t0Arr) {
        int i3;
        int iB;
        while (true) {
            if (c2036vr.B() <= 1) {
                return;
            }
            int i6 = 0;
            while (true) {
                if (c2036vr.B() == 0) {
                    i3 = -1;
                    break;
                }
                int iK = c2036vr.K();
                i6 += iK;
                if (iK != 255) {
                    i3 = i6;
                    break;
                }
            }
            int i7 = 0;
            while (true) {
                if (c2036vr.B() == 0) {
                    i7 = -1;
                    break;
                }
                int iK2 = c2036vr.K();
                i7 += iK2;
                if (iK2 != 255) {
                    break;
                }
            }
            int i8 = c2036vr.f17355b + i7;
            if (i7 == -1 || i7 > c2036vr.B()) {
                AbstractC2022vd.v("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i8 = c2036vr.f17356c;
            } else if (i3 == 4 && i7 >= 8) {
                int iK3 = c2036vr.K();
                int iL = c2036vr.L();
                if (iL == 49) {
                    iB = c2036vr.b();
                    iL = 49;
                } else {
                    iB = 0;
                }
                int iK4 = c2036vr.K();
                if (iL == 47) {
                    c2036vr.G(1);
                    iL = 47;
                }
                boolean z6 = iK3 == 181 && (iL == 49 || iL == 47) && iK4 == 3;
                if (iL == 49) {
                    z6 &= iB == 1195456820;
                }
                if (z6) {
                    n(j6, c2036vr, t0Arr);
                }
            }
            c2036vr.E(i8);
        }
    }

    public static void f(MediaFormat mediaFormat, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            mediaFormat.setByteBuffer(A.f.i(i3, "csd-", new StringBuilder(String.valueOf(i3).length() + 4)), ByteBuffer.wrap((byte[]) list.get(i3)));
        }
    }

    public static void g(L9 l9, J9 j9, String... strArr) {
        if (j9 == null) {
            return;
        }
        p2.j.f22785C.f22797k.getClass();
        l9.a(j9, SystemClock.elapsedRealtime(), strArr);
    }

    public static boolean h(Context context) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 24) {
            return false;
        }
        if (i3 < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i3 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return H("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean i(InterfaceC2046w0 interfaceC2046w0) {
        C2036vr c2036vr = new C2036vr(8);
        int i3 = C1668p.a(interfaceC2046w0, c2036vr).f16088a;
        if (i3 != 1380533830 && i3 != 1380333108) {
            return false;
        }
        interfaceC2046w0.v(0, 4, c2036vr.f17354a);
        c2036vr.E(0);
        int iB = c2036vr.b();
        if (iB == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(iB);
        AbstractC2022vd.F("WavHeaderReader", sb.toString());
        return false;
    }

    public static byte[] j(byte[] bArr) {
        int i3;
        byte[] bArr2 = new byte[64];
        int i6 = 0;
        while (true) {
            if (i6 >= 32) {
                break;
            }
            int i7 = i6 + i6;
            bArr2[i7] = (byte) (bArr[i6] & 15);
            bArr2[i7 + 1] = (byte) ((bArr[i6] & 255) >> 4);
            i6++;
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < 63) {
            byte b5 = (byte) (bArr2[i8] + i9);
            bArr2[i8] = b5;
            int i10 = (b5 + 8) >> 4;
            bArr2[i8] = (byte) (b5 - (i10 << 4));
            i8++;
            i9 = i10;
        }
        bArr2[63] = (byte) (bArr2[63] + i9);
        C1879sw c1879sw = new C1879sw(2);
        Vu vu = new Vu(6);
        for (i3 = 1; i3 < 64; i3 += 2) {
            C2115xF c2115xF = new C2115xF();
            N(c2115xF, i3 / 2, bArr2[i3]);
            Vu.z(vu, c1879sw);
            G(c1879sw, vu, c2115xF);
        }
        C2041vw c2041vw = new C2041vw(6);
        C2041vw.e(c1879sw, c2041vw);
        L(c1879sw, c2041vw);
        C2041vw.e(c1879sw, c2041vw);
        L(c1879sw, c2041vw);
        C2041vw.e(c1879sw, c2041vw);
        L(c1879sw, c2041vw);
        C2041vw.e(c1879sw, c2041vw);
        L(c1879sw, c2041vw);
        for (int i11 = 0; i11 < 64; i11 += 2) {
            C2115xF c2115xF2 = new C2115xF();
            N(c2115xF2, i11 / 2, bArr2[i11]);
            Vu.z(vu, c1879sw);
            G(c1879sw, vu, c2115xF2);
        }
        C2041vw c2041vw2 = new C2041vw(c1879sw);
        long[] jArr = new long[10];
        AbstractC2022vd.L(jArr, (long[]) c2041vw2.f17369b);
        long[] jArr2 = new long[10];
        AbstractC2022vd.L(jArr2, (long[]) c2041vw2.f17370c);
        long[] jArr3 = new long[10];
        AbstractC2022vd.L(jArr3, (long[]) c2041vw2.f17371d);
        long[] jArr4 = new long[10];
        AbstractC2022vd.L(jArr4, jArr3);
        long[] jArr5 = new long[10];
        AbstractC2022vd.q(jArr5, jArr2, jArr);
        AbstractC2022vd.G(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        AbstractC2022vd.G(jArr6, jArr, jArr2);
        AbstractC2022vd.G(jArr6, jArr6, AbstractC2223zF.f17842a);
        AbstractC2022vd.j(jArr6, jArr6, jArr4);
        AbstractC2022vd.w(jArr6, jArr6);
        if (MessageDigest.isEqual(AbstractC2022vd.P(jArr5), AbstractC2022vd.P(jArr6))) {
            return c2041vw2.i();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static int k(int i3) {
        switch (i3) {
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

    public static XK l() {
        ClassLoader classLoader = AbstractC0933bL.class.getClassLoader();
        if (XK.class.equals(XK.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e6) {
                    throw new IllegalStateException(e6);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new AbstractC0933bL[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e7) {
                    Logger.getLogger(VK.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(XK.class.getSimpleName()), (Throwable) e7);
                }
            }
            if (arrayList.size() == 1) {
                return (XK) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (XK) XK.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e8) {
                throw new IllegalStateException(e8);
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static void m(int i3, long j6, String str, int i6, PriorityQueue priorityQueue) {
        Z7 z7 = new Z7(i6, j6, str);
        if ((priorityQueue.size() != i3 || (((Z7) priorityQueue.peek()).f12794c <= i6 && ((Z7) priorityQueue.peek()).f12792a <= j6)) && !priorityQueue.contains(z7)) {
            priorityQueue.add(z7);
            if (priorityQueue.size() > i3) {
                priorityQueue.poll();
            }
        }
    }

    public static void n(long j6, C2036vr c2036vr, T0[] t0Arr) {
        int iK = c2036vr.K();
        if ((iK & 64) != 0) {
            int i3 = iK & 31;
            c2036vr.G(1);
            int i6 = c2036vr.f17355b;
            for (T0 t02 : t0Arr) {
                int i7 = i3 * 3;
                c2036vr.E(i6);
                t02.a(i7, c2036vr);
                AbstractC0582Jp.h0(j6 != -9223372036854775807L);
                t02.c(j6, 1, i7, 0, null);
            }
        }
    }

    public static void o(MediaFormat mediaFormat, String str, int i3) {
        if (i3 != -1) {
            mediaFormat.setInteger(str, i3);
        }
    }

    public static byte[] p(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) YJ.f12629e.f12632a.c("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i3 = bArrDigest[31] & 127;
        bArrDigest[31] = (byte) i3;
        bArrDigest[31] = (byte) (i3 | 64);
        return bArrDigest;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int q(byte[] r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC0933bL.q(byte[]):int");
    }

    public static Uri r(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i3 = iIndexOf + 1;
        StringBuilder sb = new StringBuilder(str.substring(0, i3));
        A.f.w(sb, str2, "=", str3, "&");
        sb.append(str.substring(i3));
        return Uri.parse(sb.toString());
    }

    public static String s(String[] strArr, int i3, int i6) {
        int i7 = i6 + i3;
        if (strArr.length < i7) {
            u2.k.e("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i8 = i7 - 1;
            if (i3 >= i8) {
                sb.append(strArr[i8]);
                return sb.toString();
            }
            sb.append(strArr[i3]);
            sb.append(' ');
            i3++;
        }
    }

    public static void t(C1443kr c1443kr) {
        int iH;
        int iH2 = c1443kr.h(2);
        if (iH2 == 0) {
            c1443kr.f(6);
            return;
        }
        int iC = C(c1443kr, 5, 8, 16) + 1;
        if (iH2 == 1) {
            c1443kr.f(iC * 7);
            return;
        }
        if (iH2 == 2) {
            boolean zG = c1443kr.g();
            int i3 = true != zG ? 5 : 1;
            int i6 = true == zG ? 7 : 5;
            int i7 = true == zG ? 8 : 6;
            int i8 = 0;
            while (i8 < iC) {
                if (c1443kr.g()) {
                    c1443kr.f(7);
                    iH = 0;
                } else {
                    if (c1443kr.h(2) == 3 && c1443kr.h(i6) * i3 != 0) {
                        c1443kr.e();
                    }
                    iH = c1443kr.h(i7) * i3;
                    if (iH != 0 && iH != 180) {
                        c1443kr.e();
                    }
                    c1443kr.e();
                }
                if (iH != 0 && iH != 180 && c1443kr.g()) {
                    i8++;
                }
                i8++;
            }
        }
    }

    public static long u(int i3, long j6) {
        if (i3 == 1) {
            return j6;
        }
        int i6 = i3 >> 1;
        long j7 = (j6 * j6) % 1073807359;
        return (i3 & 1) == 0 ? u(i6, j7) % 1073807359 : ((u(i6, j7) % 1073807359) * j6) % 1073807359;
    }

    public static C1668p v(int i3, InterfaceC2046w0 interfaceC2046w0, C2036vr c2036vr) throws P4 {
        C1668p c1668pA = C1668p.a(interfaceC2046w0, c2036vr);
        while (true) {
            int i6 = c1668pA.f16088a;
            if (i6 == i3) {
                return c1668pA;
            }
            A.f.u(new StringBuilder(String.valueOf(i6).length() + 28), "Ignoring unknown WAV chunk: ", i6, "WavHeaderReader");
            long j6 = c1668pA.f16089b;
            long j7 = 8 + j6;
            if ((1 & j6) != 0) {
                j7 = 9 + j6;
            }
            if (j7 > 2147483647L) {
                StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 40);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i6);
                throw P4.b(sb.toString());
            }
            interfaceC2046w0.t((int) j7);
            c1668pA = C1668p.a(interfaceC2046w0, c2036vr);
        }
    }

    public static String w(Context context, String str) {
        p2.j jVar = p2.j.f22785C;
        String strB = jVar.f22811y.b(context);
        String strC = jVar.f22811y.c(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strB)) {
            str = r(str, "gmp_app_id", strB).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strC)) ? str : r(str, "fbs_aiid", strC).toString();
    }

    public static long x(int i3, String[] strArr) {
        long jA = (AbstractC1114el.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i6 = 1; i6 < i3; i6++) {
            jA = (((AbstractC1114el.a(strArr[i6]) + 2147483647L) % 1073807359) + ((jA * 16785407) % 1073807359)) % 1073807359;
        }
        return jA;
    }

    public static Pair y(RandomAccessFile randomAccessFile, int i3) throws IOException {
        int i6;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i3, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - byteBufferAllocate.capacity();
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        E(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i6 = -1;
        } else {
            int i7 = iCapacity - 22;
            int iMin = Math.min(i7, 65535);
            for (int i8 = 0; i8 < iMin; i8++) {
                i6 = i7 - i8;
                if (byteBufferAllocate.getInt(i6) == 101010256 && ((char) byteBufferAllocate.getShort(i6 + 20)) == i8) {
                    break;
                }
            }
            i6 = -1;
        }
        if (i6 == -1) {
            return null;
        }
        byteBufferAllocate.position(i6);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + i6));
    }

    public static void z() throws C1924tn {
        StringBuilder sb = new StringBuilder();
        C1476lN.v(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z6 = false;
        int i3 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z6) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int length = objArrCopyOf.length;
            int i6 = i3 + 1;
            int iD = GB.d(length, i6);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i3] = numValueOf;
            z6 = true;
            i3 = i6;
        }
        if (z6) {
            throw new C1924tn(sb.toString(), LB.o(i3, objArrCopyOf));
        }
    }
}
