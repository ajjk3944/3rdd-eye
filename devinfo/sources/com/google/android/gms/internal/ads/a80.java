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
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.AdError;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a80 {
    public static final ah A;
    public static final lo0 K;
    public static final lo0 L;

    /* renamed from: a, reason: collision with root package name */
    public static ExecutorService f9251a;

    /* renamed from: z, reason: collision with root package name */
    public static final ah f9274z;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f9252b = {AdError.CACHE_ERROR_CODE, AdError.SERVER_ERROR_CODE, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f9253c = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: d, reason: collision with root package name */
    public static final oa f9254d = new oa("gads:afs:csa:experiment_id", "", 4);

    /* renamed from: e, reason: collision with root package name */
    public static final oa f9255e = new oa("gads:app_index:experiment_id", "", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final oa f9256f = new oa("gads:block_autoclicks_experiment_id", "", 4);
    public static final oa g = new oa("gads:sdk_core_experiment_id", "", 4);

    /* renamed from: h, reason: collision with root package name */
    public static final oa f9257h = new oa("gads:spam_app_context:experiment_id", "", 4);

    /* renamed from: i, reason: collision with root package name */
    public static final oa f9258i = new oa("gads:temporary_experiment_id:1", "", 4);
    public static final oa j = new oa("gads:temporary_experiment_id:10", "", 4);

    /* renamed from: k, reason: collision with root package name */
    public static final oa f9259k = new oa("gads:temporary_experiment_id:11", "", 4);

    /* renamed from: l, reason: collision with root package name */
    public static final oa f9260l = new oa("gads:temporary_experiment_id:12", "", 4);

    /* renamed from: m, reason: collision with root package name */
    public static final oa f9261m = new oa("gads:temporary_experiment_id:13", "", 4);

    /* renamed from: n, reason: collision with root package name */
    public static final oa f9262n = new oa("gads:temporary_experiment_id:14", "", 4);

    /* renamed from: o, reason: collision with root package name */
    public static final oa f9263o = new oa("gads:temporary_experiment_id:15", "", 4);

    /* renamed from: p, reason: collision with root package name */
    public static final oa f9264p = new oa("gads:temporary_experiment_id:2", "", 4);

    /* renamed from: q, reason: collision with root package name */
    public static final oa f9265q = new oa("gads:temporary_experiment_id:3", "", 4);

    /* renamed from: r, reason: collision with root package name */
    public static final oa f9266r = new oa("gads:temporary_experiment_id:4", "", 4);

    /* renamed from: s, reason: collision with root package name */
    public static final oa f9267s = new oa("gads:temporary_experiment_id:5", "", 4);

    /* renamed from: t, reason: collision with root package name */
    public static final oa f9268t = new oa("gads:temporary_experiment_id:6", "", 4);

    /* renamed from: u, reason: collision with root package name */
    public static final oa f9269u = new oa("gads:temporary_experiment_id:7", "", 4);

    /* renamed from: v, reason: collision with root package name */
    public static final oa f9270v = new oa("gads:temporary_experiment_id:8", "", 4);

    /* renamed from: w, reason: collision with root package name */
    public static final oa f9271w = new oa("gads:temporary_experiment_id:9", "", 4);

    /* renamed from: x, reason: collision with root package name */
    public static final oa f9272x = new oa("gads:corewebview:experiment_id", "", 4);

    /* renamed from: y, reason: collision with root package name */
    public static final ah f9273y = new ah(1);
    public static final ah B = new ah(29);
    public static final o90 C = new o90(7);
    public static final o90 D = new o90(12);
    public static final o90 E = new o90(16);
    public static final o90 F = new o90(20);
    public static final o90 G = new o90(24);
    public static final lo0 H = new lo0(2);
    public static final lo0 I = new lo0(6);
    public static final lo0 J = new lo0(10);
    public static final String[] M = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    static {
        int i4 = 13;
        f9274z = new ah(i4);
        int i10 = 17;
        A = new ah(i10);
        K = new lo0(i4);
        L = new lo0(i10);
    }

    public static long A(int i4, String[] strArr) {
        long jA = (jz.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i10 = 1; i10 < i4; i10++) {
            jA = (((jz.a(strArr[i10]) + 2147483647L) % 1073807359) + ((jA * 16785407) % 1073807359)) % 1073807359;
        }
        return jA;
    }

    public static void B() throws pc0 {
        StringBuilder sb2 = new StringBuilder();
        yr1.u(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z3) {
                sb2.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb2.append("glError: ");
            sb2.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int length = objArrCopyOf.length;
            int i10 = i4 + 1;
            int iD = s41.d(length, i10);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i4] = numValueOf;
            z3 = true;
            i4 = i10;
        }
        if (z3) {
            throw new pc0(sb2.toString(), x41.s(objArrCopyOf, i4));
        }
    }

    public static void C(hk0 hk0Var) {
        hk0Var.f(3);
        hk0Var.f(8);
        boolean zG = hk0Var.g();
        boolean zG2 = hk0Var.g();
        if (zG) {
            hk0Var.f(5);
        }
        if (zG2) {
            hk0Var.f(6);
        }
    }

    public static void D(hk0 hk0Var, l1 l1Var) throws ua {
        hk0Var.f(2);
        boolean zG = hk0Var.g();
        int iH = hk0Var.h(8);
        for (int i4 = 0; i4 < iH; i4++) {
            hk0Var.f(2);
            if (hk0Var.g()) {
                hk0Var.f(5);
            }
            if (zG) {
                hk0Var.f(24);
            } else {
                if (hk0Var.g()) {
                    if (!hk0Var.g()) {
                        hk0Var.f(4);
                    }
                    l1Var.f13319c = hk0Var.h(6) + 1;
                }
                hk0Var.f(4);
            }
        }
        if (hk0Var.g()) {
            hk0Var.f(3);
            if (hk0Var.g()) {
                H(hk0Var);
            }
        }
    }

    public static byte[][] E(int[] iArr, q9[] q9VarArr) throws DigestException {
        long j8;
        int i4;
        int length;
        char c9;
        int i10 = 0;
        long jB = 0;
        while (true) {
            j8 = 1048576;
            if (i10 >= 3) {
                break;
            }
            jB += (q9VarArr[i10].b() + 1048575) / 1048576;
            i10++;
        }
        if (jB >= 2097151) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(jB).length() + 17);
            sb2.append("Too many chunks: ");
            sb2.append(jB);
            throw new DigestException(sb2.toString());
        }
        byte[][] bArr = new byte[iArr.length][];
        int i11 = 0;
        while (true) {
            length = iArr.length;
            c9 = 5;
            if (i11 >= length) {
                break;
            }
            int i12 = (int) jB;
            byte[] bArr2 = new byte[(M(iArr[i11]) * i12) + 5];
            bArr2[0] = 90;
            Q(i12, bArr2);
            bArr[i11] = bArr2;
            i11++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            String strK = K(iArr[i13]);
            try {
                messageDigestArr[i13] = MessageDigest.getInstance(strK);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(strK.concat(" digest not supported"), e2);
            }
        }
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (i4 = 3; i14 < i4; i4 = 3) {
            q9 q9Var = q9VarArr[i14];
            int i17 = i14;
            long jB2 = q9Var.b();
            long j9 = 0;
            while (jB2 > 0) {
                char c10 = c9;
                int i18 = i15;
                int iMin = (int) Math.min(jB2, j8);
                Q(iMin, bArr3);
                for (int i19 = 0; i19 < length; i19++) {
                    messageDigestArr[i19].update(bArr3);
                }
                try {
                    q9Var.e(messageDigestArr, j9, iMin);
                    int i20 = 0;
                    while (i20 < iArr.length) {
                        int i21 = iArr[i20];
                        byte[] bArr4 = bArr[i20];
                        int iM = M(i21);
                        q9 q9Var2 = q9Var;
                        MessageDigest messageDigest = messageDigestArr[i20];
                        long j10 = jB2;
                        int iDigest = messageDigest.digest(bArr4, (i18 * iM) + 5, iM);
                        if (iDigest != iM) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(iDigest).length());
                            sb3.append("Unexpected output size of ");
                            sb3.append(algorithm);
                            sb3.append(" digest: ");
                            sb3.append(iDigest);
                            throw new RuntimeException(sb3.toString());
                        }
                        i20++;
                        q9Var = q9Var2;
                        jB2 = j10;
                    }
                    q9 q9Var3 = q9Var;
                    long j11 = iMin;
                    j9 += j11;
                    i15 = i18 + 1;
                    jB2 -= j11;
                    c9 = c10;
                    q9Var = q9Var3;
                    j8 = 1048576;
                } catch (IOException e10) {
                    throw new DigestException(je.u.q(i18, i16, "Failed to digest chunk #", " of section #", new StringBuilder(String.valueOf(i18).length() + 37 + String.valueOf(i16).length())), e10);
                }
            }
            i16++;
            i14 = i17 + 1;
            j8 = 1048576;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i22 = 0; i22 < iArr.length; i22++) {
            int i23 = iArr[i22];
            byte[] bArr6 = bArr[i22];
            String strK2 = K(i23);
            try {
                bArr5[i22] = MessageDigest.getInstance(strK2).digest(bArr6);
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(strK2.concat(" digest not supported"), e11);
            }
        }
        return bArr5;
    }

    public static int F(int i4) {
        if (i4 == 513) {
            return 1;
        }
        if (i4 == 514) {
            return 2;
        }
        if (i4 == 769) {
            return 1;
        }
        switch (i4) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i4))));
        }
    }

    public static int G(hk0 hk0Var, int i4, int i10, int i11) {
        mq0.m(Math.max(Math.max(i4, i10), i11) <= 31);
        int i12 = (1 << i4) - 1;
        int i13 = (1 << i10) - 1;
        long j8 = i12 + i13;
        long j9 = (int) j8;
        if (j8 != j9) {
            throw new ArithmeticException();
        }
        if (j9 + (1 << i11) != ((int) r6)) {
            throw new ArithmeticException();
        }
        if (hk0Var.b() >= i4) {
            int iH = hk0Var.h(i4);
            if (iH == i12) {
                if (hk0Var.b() >= i10) {
                    int iH2 = hk0Var.h(i10);
                    iH += iH2;
                    if (iH2 == i13) {
                        if (hk0Var.b() >= i11) {
                            return hk0Var.h(i11) + iH;
                        }
                    }
                }
            }
            return iH;
        }
        return -1;
    }

    public static void H(hk0 hk0Var) throws ua {
        int iH = hk0Var.h(6);
        if (iH < 2 || iH > 42) {
            throw ua.b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iH)));
        }
        hk0Var.f(iH * 8);
    }

    public static void I(String str, boolean z3) throws pc0 {
        if (z3) {
            return;
        }
        v41 v41Var = x41.f18307b;
        throw new pc0(str, u51.f17096e);
    }

    public static long J(byte b10, byte b11) {
        int i4;
        int i10 = b10 & 255;
        int i11 = b10 & 3;
        if (i11 != 0) {
            i4 = 2;
            if (i11 != 1 && i11 != 2) {
                i4 = b11 & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i4 = 1;
        }
        int i12 = i10 >> 3;
        return i4 * (i12 >= 16 ? 2500 << r6 : i12 >= 12 ? 10000 << (i12 & 1) : (i12 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static String K(int i4) {
        if (i4 == 1) {
            return "SHA-256";
        }
        if (i4 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(d.h.q(i4, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i4).length() + 33)));
    }

    public static boolean L(String str) throws pc0 {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        I("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        I("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        B();
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static int M(int i4) {
        if (i4 == 1) {
            return 32;
        }
        if (i4 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(d.h.q(i4, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i4).length() + 33)));
    }

    public static ByteBuffer N(ByteBuffer byteBuffer, int i4) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i10 = i4 + iPosition;
        if (i10 < iPosition || i10 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i10);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i10);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static ByteBuffer O(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int iRemaining = byteBuffer.remaining();
            throw new IOException(d.h.q(iRemaining, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", new StringBuilder(String.valueOf(iRemaining).length() + 82)));
        }
        int i4 = byteBuffer.getInt();
        if (i4 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i4 <= byteBuffer.remaining()) {
            return N(byteBuffer, i4);
        }
        int iRemaining2 = byteBuffer.remaining();
        throw new IOException(je.u.q(i4, iRemaining2, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ", new StringBuilder(String.valueOf(i4).length() + 79 + String.valueOf(iRemaining2).length())));
    }

    public static byte[] P(ByteBuffer byteBuffer) throws IOException {
        int i4 = byteBuffer.getInt();
        if (i4 < 0) {
            throw new IOException("Negative length");
        }
        if (i4 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i4];
            byteBuffer.get(bArr);
            return bArr;
        }
        int iRemaining = byteBuffer.remaining();
        throw new IOException(je.u.q(i4, iRemaining, "Underflow while reading length-prefixed value. Length: ", ", available: ", new StringBuilder(String.valueOf(i4).length() + 68 + String.valueOf(iRemaining).length())));
    }

    public static void Q(int i4, byte[] bArr) {
        bArr[1] = (byte) (i4 & 255);
        bArr[2] = (byte) ((i4 >>> 8) & 255);
        bArr[3] = (byte) ((i4 >>> 16) & 255);
        bArr[4] = (byte) (i4 >> 24);
    }

    public static String a(String str, Context context, boolean z3, HashMap map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String strD;
        pk pkVar = sk.O0;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (((Boolean) rkVar.a(pkVar)).booleanValue() && !z3) {
            return str;
        }
        ua.j jVar = ua.j.C;
        dw dwVar = jVar.f35281y;
        ya.f0 f0Var = jVar.f35261c;
        dw dwVar2 = jVar.f35281y;
        if (!dwVar.a(context) || TextUtils.isEmpty(str) || (strD = dwVar2.d(context)) == null) {
            return str;
        }
        String str2 = (String) rkVar2.a(sk.H0);
        if (((Boolean) rkVar2.a(sk.G0)).booleanValue() && str.contains(str2)) {
            if (f0Var.G(str)) {
                Map map2 = (Map) map.get("_ac");
                dwVar2.getClass();
                dwVar2.h(context, "_ac", strD, dw.f(map2));
                return x(context, str).replace(str2, strD);
            }
            if (!f0Var.H(str)) {
                return str;
            }
            Map map3 = (Map) map.get("_ai");
            dwVar2.getClass();
            dwVar2.h(context, "_ai", strD, dw.f(map3));
            return x(context, str).replace(str2, strD);
        }
        if (str.contains("fbs_aeid") || ((Boolean) rkVar2.a(sk.F0)).booleanValue()) {
            return str;
        }
        if (f0Var.G(str)) {
            Map map4 = (Map) map.get("_ac");
            dwVar2.getClass();
            dwVar2.h(context, "_ac", strD, dw.f(map4));
            return q(x(context, str), "fbs_aeid", strD).toString();
        }
        if (!f0Var.H(str)) {
            return str;
        }
        Map map5 = (Map) map.get("_ai");
        dwVar2.getClass();
        dwVar2.h(context, "_ai", strD, dw.f(map5));
        return q(x(context, str), "fbs_aeid", strD).toString();
    }

    public static String b(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z3 = false;
        String str = null;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            String str2 = ((d6) obj).f10337a.g.f14052m;
            if (ia.b(str2)) {
                return "video/mp4";
            }
            if (ia.a(str2)) {
                z3 = true;
            } else if (ia.c(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z3 ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static Provider c() {
        for (int i4 = 0; i4 < 3; i4++) {
            Provider provider = Security.getProvider(M[i4]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static ArrayList d(byte[] bArr) {
        long j8 = ((bArr[11] & 255) << 8) | (bArr[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((j8 * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static synchronized Executor e() {
        try {
            if (f9251a == null) {
                String str = bq0.f9768a;
                f9251a = Executors.newSingleThreadExecutor(new cw("ExoPlayer:BackgroundExecutor"));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f9251a;
    }

    public static void f(long j8, sk0 sk0Var, u2[] u2VarArr) {
        int i4;
        int iB;
        while (true) {
            if (sk0Var.B() <= 1) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (sk0Var.B() == 0) {
                    i4 = -1;
                    break;
                }
                int iK = sk0Var.K();
                i10 += iK;
                if (iK != 255) {
                    i4 = i10;
                    break;
                }
            }
            int i11 = 0;
            while (true) {
                if (sk0Var.B() == 0) {
                    i11 = -1;
                    break;
                }
                int iK2 = sk0Var.K();
                i11 += iK2;
                if (iK2 != 255) {
                    break;
                }
            }
            int i12 = sk0Var.f16447b + i11;
            if (i11 == -1 || i11 > sk0Var.B()) {
                ls.t("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i12 = sk0Var.f16448c;
            } else if (i4 == 4 && i11 >= 8) {
                int iK3 = sk0Var.K();
                int iL = sk0Var.L();
                if (iL == 49) {
                    iB = sk0Var.b();
                    iL = 49;
                } else {
                    iB = 0;
                }
                int iK4 = sk0Var.K();
                if (iL == 47) {
                    sk0Var.G(1);
                    iL = 47;
                }
                boolean z3 = iK3 == 181 && (iL == 49 || iL == 47) && iK4 == 3;
                if (iL == 49) {
                    z3 &= iB == 1195456820;
                }
                if (z3) {
                    n(j8, sk0Var, u2VarArr);
                }
            }
            sk0Var.E(i12);
        }
    }

    public static void g(MediaFormat mediaFormat, List list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            mediaFormat.setByteBuffer(d.h.q(i4, "csd-", new StringBuilder(String.valueOf(i4).length() + 4)), ByteBuffer.wrap((byte[]) list.get(i4)));
        }
    }

    public static void h(vk vkVar, uk ukVar, String... strArr) {
        if (ukVar == null) {
            return;
        }
        ua.j.C.f35267k.getClass();
        vkVar.a(ukVar, SystemClock.elapsedRealtime(), strArr);
    }

    public static boolean i(Context context) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 24) {
            return false;
        }
        if (i4 < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i4 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return L("EGL_EXT_protected_content");
        }
        return false;
    }

    public static byte[] j() {
        int i4 = (((((~1070575321) & 53864535) | 741512112) + ((1070575321 & 1665624655) | 1758594712)) - 1358657052) ^ (1555319301 % 382697713);
        int i10 = (((((~1529195746) & 118097808) | 3345166) + ((1529195746 & 656934035) | 821390159)) - 940522761) ^ (1037127828 % 1034949299);
        int[] iArr = {350322227, 1077471394, 1759186290, 18931840, 769005128, 1847857001, 24413078, 1982275856, 1275373743};
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((iArr[7] % 1275373743) ^ d7.m((i12 & (~i11)) | i13, (i11 & i14) | i15, i16, i17));
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) i10);
        byteBufferAllocate.putInt(i4);
        return byteBufferAllocate.array();
    }

    public static X509Certificate[][] k(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        Pair pairU;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile2.length() < 22) {
                pairU = null;
            } else {
                pairU = nn1.u(randomAccessFile2, 0);
                if (pairU == null) {
                    pairU = nn1.u(randomAccessFile2, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                }
            }
            try {
                if (pairU == null) {
                    long length = randomAccessFile2.length();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 82);
                    sb2.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                    sb2.append(length);
                    sb2.append(" bytes");
                    throw new u9(sb2.toString());
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairU.first;
                long jLongValue = ((Long) pairU.second).longValue();
                long j8 = (-20) + jLongValue;
                if (j8 >= 0) {
                    randomAccessFile2.seek(j8);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new u9("ZIP64 APK not supported");
                    }
                }
                nn1.A(byteBuffer);
                long j9 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
                if (j9 >= jLongValue) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(j9).length() + 82 + String.valueOf(jLongValue).length());
                    sb3.append("ZIP Central Directory offset out of range: ");
                    sb3.append(j9);
                    sb3.append(". ZIP End of Central Directory offset: ");
                    sb3.append(jLongValue);
                    throw new u9(sb3.toString());
                }
                nn1.A(byteBuffer);
                if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j9 != jLongValue) {
                    throw new u9("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (j9 < 32) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j9).length() + 67);
                    sb4.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb4.append(j9);
                    throw new u9(sb4.toString());
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                randomAccessFile2.seek(j9 - byteBufferAllocate.capacity());
                randomAccessFile2.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                    throw new u9("No APK Signing Block before ZIP Central Directory");
                }
                long j10 = byteBufferAllocate.getLong(0);
                if (j10 < byteBufferAllocate.capacity() || j10 > 2147483639) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j10).length() + 37);
                    sb5.append("APK Signing Block size out of range: ");
                    sb5.append(j10);
                    throw new u9(sb5.toString());
                }
                int i4 = (int) (8 + j10);
                long j11 = j9 - i4;
                if (j11 < 0) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(j11).length() + 39);
                    sb6.append("APK Signing Block offset out of range: ");
                    sb6.append(j11);
                    throw new u9(sb6.toString());
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i4);
                byteBufferAllocate2.order(byteOrder);
                randomAccessFile2.seek(j11);
                long j12 = j9;
                randomAccessFile2.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                long j13 = byteBufferAllocate2.getLong(0);
                if (j13 != j10) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(j13).length() + 63 + String.valueOf(j10).length());
                    sb7.append("APK Signing Block sizes in header and footer do not match: ");
                    sb7.append(j13);
                    sb7.append(" vs ");
                    sb7.append(j10);
                    throw new u9(sb7.toString());
                }
                Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j11));
                ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                long jLongValue2 = ((Long) pairCreate.second).longValue();
                if (byteBuffer2.order() != byteOrder) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int iCapacity = byteBuffer2.capacity() - 24;
                randomAccessFile = randomAccessFile2;
                if (iCapacity < 8) {
                    StringBuilder sb8 = new StringBuilder(String.valueOf(iCapacity).length() + 17);
                    sb8.append("end < start: ");
                    sb8.append(iCapacity);
                    sb8.append(" < 8");
                    throw new IllegalArgumentException(sb8.toString());
                }
                int iCapacity2 = byteBuffer2.capacity();
                if (iCapacity > byteBuffer2.capacity()) {
                    StringBuilder sb9 = new StringBuilder(String.valueOf(iCapacity).length() + 19 + String.valueOf(iCapacity2).length());
                    sb9.append("end > capacity: ");
                    sb9.append(iCapacity);
                    sb9.append(" > ");
                    sb9.append(iCapacity2);
                    throw new IllegalArgumentException(sb9.toString());
                }
                int iLimit = byteBuffer2.limit();
                int iPosition = byteBuffer2.position();
                try {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iCapacity);
                    byteBuffer2.position(8);
                    ByteBuffer byteBufferSlice = byteBuffer2.slice();
                    byteBufferSlice.order(byteBuffer2.order());
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    int i10 = 0;
                    while (byteBufferSlice.hasRemaining()) {
                        i10++;
                        if (byteBufferSlice.remaining() < 8) {
                            StringBuilder sb10 = new StringBuilder(String.valueOf(i10).length() + 59);
                            sb10.append("Insufficient data to read size of APK Signing Block entry #");
                            sb10.append(i10);
                            throw new u9(sb10.toString());
                        }
                        long j14 = byteBufferSlice.getLong();
                        if (j14 < 4 || j14 > 2147483647L) {
                            StringBuilder sb11 = new StringBuilder(String.valueOf(i10).length() + 45 + String.valueOf(j14).length());
                            sb11.append("APK Signing Block entry #");
                            sb11.append(i10);
                            sb11.append(" size out of range: ");
                            sb11.append(j14);
                            throw new u9(sb11.toString());
                        }
                        int i11 = (int) j14;
                        int iPosition2 = byteBufferSlice.position() + i11;
                        if (i11 > byteBufferSlice.remaining()) {
                            int iRemaining = byteBufferSlice.remaining();
                            StringBuilder sb12 = new StringBuilder(String.valueOf(i10).length() + 45 + String.valueOf(i11).length() + 13 + String.valueOf(iRemaining).length());
                            sb12.append("APK Signing Block entry #");
                            sb12.append(i10);
                            sb12.append(" size out of range: ");
                            sb12.append(i11);
                            sb12.append(", available: ");
                            sb12.append(iRemaining);
                            throw new u9(sb12.toString());
                        }
                        if (byteBufferSlice.getInt() == 1896449818) {
                            X509Certificate[][] x509CertificateArrP = p(randomAccessFile.getChannel(), new t9(N(byteBufferSlice, i11 - 4), jLongValue2, j12, jLongValue, byteBuffer));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return x509CertificateArrP;
                        }
                        long j15 = j12;
                        byteBufferSlice.position(iPosition2);
                        j12 = j15;
                    }
                    throw new u9("No APK Signature Scheme v2 block in APK Signing Block");
                } catch (Throwable th2) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = randomAccessFile2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.h0 l(com.google.android.gms.internal.ads.hk0 r10) {
        /*
            r0 = 16
            int r1 = r10.h(r0)
            int r0 = r10.h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r10.h(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r10.h(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r10.h(r1)
            boolean r2 = r10.g()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r10.h(r2)
            boolean r5 = r10.g()
            if (r5 == 0) goto L47
            int r5 = r10.h(r4)
            if (r5 <= 0) goto L47
            r10.f(r1)
        L47:
            boolean r5 = r10.g()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            r8 = 1
            if (r8 == r5) goto L56
            r5 = r7
            goto L57
        L56:
            r5 = r6
        L57:
            int r10 = r10.h(r3)
            int[] r9 = com.google.android.gms.internal.ads.a80.f9252b
            if (r5 != r7) goto L66
            r7 = 13
            if (r10 != r7) goto L66
            r10 = r9[r7]
            goto L94
        L66:
            r7 = 0
            if (r5 != r6) goto L93
            r6 = 14
            if (r10 >= r6) goto L93
            r6 = r9[r10]
            int r2 = r2 % 5
            r7 = 8
            if (r2 == r8) goto L8c
            r8 = 11
            if (r2 == r1) goto L87
            if (r2 == r4) goto L8c
            if (r2 == r3) goto L7e
            goto L91
        L7e:
            if (r10 == r4) goto L84
            if (r10 == r7) goto L84
            if (r10 != r8) goto L91
        L84:
            int r10 = r6 + 1
            goto L94
        L87:
            if (r10 == r7) goto L84
            if (r10 != r8) goto L91
            goto L84
        L8c:
            if (r10 == r4) goto L84
            if (r10 != r7) goto L91
            goto L84
        L91:
            r10 = r6
            goto L94
        L93:
            r10 = r7
        L94:
            com.google.android.gms.internal.ads.h0 r1 = new com.google.android.gms.internal.ads.h0
            r2 = 0
            r1.<init>(r5, r0, r10, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a80.l(com.google.android.gms.internal.ads.hk0):com.google.android.gms.internal.ads.h0");
    }

    public static void m(int i4, long j8, String str, int i10, PriorityQueue priorityQueue) {
        kh khVar = new kh(i10, j8, str);
        if ((priorityQueue.size() != i4 || (((kh) priorityQueue.peek()).f13158c <= i10 && ((kh) priorityQueue.peek()).f13156a <= j8)) && !priorityQueue.contains(khVar)) {
            priorityQueue.add(khVar);
            if (priorityQueue.size() > i4) {
                priorityQueue.poll();
            }
        }
    }

    public static void n(long j8, sk0 sk0Var, u2[] u2VarArr) {
        int iK = sk0Var.K();
        if ((iK & 64) != 0) {
            int i4 = iK & 31;
            sk0Var.G(1);
            int i10 = sk0Var.f16447b;
            for (u2 u2Var : u2VarArr) {
                int i11 = i4 * 3;
                sk0Var.E(i10);
                u2Var.b(i11, sk0Var);
                mq0.c0(j8 != -9223372036854775807L);
                u2Var.d(j8, 1, i11, 0, null);
            }
        }
    }

    public static void o(MediaFormat mediaFormat, String str, int i4) {
        if (i4 != -1) {
            mediaFormat.setInteger(str, i4);
        }
    }

    public static X509Certificate[][] p(FileChannel fileChannel, t9 t9Var) throws CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferO = O((ByteBuffer) t9Var.f16755d);
                int i4 = 0;
                while (byteBufferO.hasRemaining()) {
                    i4++;
                    try {
                        arrayList.add(v(O(byteBufferO), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e2) {
                        throw new SecurityException(je.u.v(new StringBuilder(String.valueOf(i4).length() + 37), "Failed to parse/verify signer #", i4, " block"), e2);
                    }
                }
                if (i4 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j8 = t9Var.f16752a;
                long j9 = t9Var.f16753b;
                long j10 = t9Var.f16754c;
                ByteBuffer byteBuffer = (ByteBuffer) t9Var.f16756e;
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                r9 r9Var = new r9(fileChannel, 0L, j8);
                r9 r9Var2 = new r9(fileChannel, j9, j10 - j9);
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                nn1.A(byteBufferDuplicate);
                int iPosition = byteBufferDuplicate.position() + 16;
                if (j8 < 0 || j8 > 4294967295L) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 27);
                    sb2.append("uint32 value of out range: ");
                    sb2.append(j8);
                    throw new IllegalArgumentException(sb2.toString());
                }
                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j8);
                mx0 mx0Var = new mx0(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    iArr[i10] = ((Integer) it.next()).intValue();
                    i10++;
                }
                try {
                    byte[][] bArrE = E(iArr, new q9[]{r9Var, r9Var2, mx0Var});
                    for (int i11 = 0; i11 < size; i11++) {
                        int i12 = iArr[i11];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i12)), bArrE[i11])) {
                            throw new SecurityException(K(i12).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e10) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e10);
                }
            } catch (IOException e11) {
                throw new SecurityException("Failed to read list of signers", e11);
            }
        } catch (CertificateException e12) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e12);
        }
    }

    public static Uri q(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i4 = iIndexOf + 1;
        StringBuilder sb2 = new StringBuilder(str.substring(0, i4));
        je.u.B(sb2, str2, "=", str3, "&");
        sb2.append(str.substring(i4));
        return Uri.parse(sb2.toString());
    }

    public static r2 r(y1 y1Var, boolean z3, boolean z10) {
        r2 r2Var;
        long j8;
        sk0 sk0Var;
        int i4;
        int i10;
        long j9;
        int i11;
        int i12;
        int[] iArr;
        long jH1 = y1Var.H1();
        long j10 = -1;
        long j11 = 4096;
        if (jH1 != -1 && jH1 <= 4096) {
            j11 = jH1;
        }
        sk0 sk0Var2 = new sk0(64);
        int i13 = (int) j11;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            sk0Var2.y(8);
            if (!y1Var.O1(sk0Var2.f16446a, i14, 8, true)) {
                break;
            }
            long jP = sk0Var2.P();
            int iB = sk0Var2.b();
            if (jP == 1) {
                j8 = j10;
                y1Var.M1(8, 8, sk0Var2.f16446a);
                i4 = 16;
                sk0Var2.C(16);
                jP = sk0Var2.d();
                sk0Var = sk0Var2;
            } else {
                j8 = j10;
                if (jP == 0) {
                    long jH12 = y1Var.H1();
                    if (jH12 != j8) {
                        jP = (jH12 - y1Var.F1()) + 8;
                    }
                }
                sk0Var = sk0Var2;
                i4 = 8;
            }
            long j12 = jP;
            r2Var = null;
            long j13 = i4;
            if (j12 < j13) {
                i10 = 1;
                if (iB == 1718773093) {
                    if (i4 == 8) {
                        j12 = 8;
                        iB = 1718773093;
                    } else {
                        iB = 1718773093;
                    }
                }
                return new e5(iB, i4, j12);
            }
            i10 = 1;
            i15 += i4;
            if (iB == 1836019574) {
                i13 += (int) j12;
                if (jH1 != -1 && i13 > jH1) {
                    i13 = (int) jH1;
                }
                sk0Var2 = sk0Var;
                j10 = j8;
                i14 = 0;
            } else {
                if (iB == 1953653099 || iB == 1835297121 || iB == 1835626086) {
                    j9 = jH1;
                    i11 = 0;
                } else {
                    if (iB == 1836019558 || iB == 1836475768) {
                        i14 = i10;
                        break;
                    }
                    i16 |= (iB == 1835295092 ? 0 : i10) ^ 1;
                    if (iB == 1937007212) {
                        if (j12 > 1000000) {
                            i14 = 0;
                            break;
                        }
                        iB = 1937007212;
                    }
                    j9 = jH1;
                    if ((i15 + j12) - j13 >= i13) {
                        i14 = 0;
                        break;
                    }
                    int i17 = (int) (j12 - j13);
                    i15 += i17;
                    if (iB != 1718909296) {
                        i11 = 0;
                        if (i17 != 0) {
                            y1Var.J1(i17);
                        }
                    } else {
                        if (i17 < 8) {
                            return new e5(1718909296, 8, i17);
                        }
                        sk0Var.y(i17);
                        i11 = 0;
                        y1Var.M1(0, i17, sk0Var.f16446a);
                        int iB2 = sk0Var.b();
                        int i18 = (z(iB2, z10) ? 1 : 0) | i16;
                        sk0Var.G(4);
                        int iB3 = sk0Var.B() / 4;
                        if (i18 == 0 && iB3 > 0) {
                            iArr = new int[iB3];
                            int i19 = 0;
                            while (true) {
                                if (i19 >= iB3) {
                                    i12 = i18;
                                    break;
                                }
                                int iB4 = sk0Var.b();
                                iArr[i19] = iB4;
                                if (z(iB4, z10)) {
                                    i12 = i10;
                                    break;
                                }
                                i19++;
                            }
                        } else {
                            i12 = i18;
                            iArr = null;
                        }
                        if (i12 == 0) {
                            return new t7.m(iB2, iArr);
                        }
                        i16 = i12;
                    }
                }
                i14 = i11;
                sk0Var2 = sk0Var;
                jH1 = j9;
                j10 = j8;
            }
        }
        r2Var = null;
        return i16 == 0 ? w5.f17890b : z3 != i14 ? i14 != 0 ? s5.f15868c : s5.f15869d : r2Var;
    }

    public static String s(String[] strArr, int i4, int i10) {
        int i11 = i10 + i4;
        if (strArr.length < i11) {
            za.i.e("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i12 = i11 - 1;
            if (i4 >= i12) {
                sb2.append(strArr[i12]);
                return sb2.toString();
            }
            sb2.append(strArr[i4]);
            sb2.append(' ');
            i4++;
        }
    }

    public static void t(int i4, sk0 sk0Var) {
        sk0Var.y(7);
        byte[] bArr = sk0Var.f16446a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i4 >> 16) & 255);
        bArr[5] = (byte) ((i4 >> 8) & 255);
        bArr[6] = (byte) (i4 & 255);
    }

    public static void u(hk0 hk0Var) {
        int iH;
        int iH2 = hk0Var.h(2);
        if (iH2 == 0) {
            hk0Var.f(6);
            return;
        }
        int iG = G(hk0Var, 5, 8, 16) + 1;
        if (iH2 == 1) {
            hk0Var.f(iG * 7);
            return;
        }
        if (iH2 == 2) {
            boolean zG = hk0Var.g();
            int i4 = true != zG ? 5 : 1;
            int i10 = true == zG ? 7 : 5;
            int i11 = true == zG ? 8 : 6;
            int i12 = 0;
            while (i12 < iG) {
                if (hk0Var.g()) {
                    hk0Var.f(7);
                    iH = 0;
                } else {
                    if (hk0Var.h(2) == 3 && hk0Var.h(i10) * i4 != 0) {
                        hk0Var.e();
                    }
                    iH = hk0Var.h(i11) * i4;
                    if (iH != 0 && iH != 180) {
                        hk0Var.e();
                    }
                    hk0Var.e();
                }
                if (iH != 0 && iH != 180 && hk0Var.g()) {
                    i12++;
                }
                i12++;
            }
        }
    }

    public static X509Certificate[] v(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferO = O(byteBuffer);
        ByteBuffer byteBufferO2 = O(byteBuffer);
        byte[] bArrP = P(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrP2 = null;
        byte[] bArrP3 = null;
        int i4 = -1;
        int i10 = 0;
        while (byteBufferO2.hasRemaining()) {
            i10++;
            try {
                ByteBuffer byteBufferO3 = O(byteBufferO2);
                if (byteBufferO3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i11 = byteBufferO3.getInt();
                arrayList.add(Integer.valueOf(i11));
                if (i11 != 513 && i11 != 514 && i11 != 769) {
                    switch (i11) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i4 != -1) {
                    int iF = F(i11);
                    int iF2 = F(i4);
                    if (iF != 1 && iF2 == 1) {
                    }
                }
                bArrP3 = P(byteBufferO3);
                i4 = i11;
            } catch (IOException e2) {
                e = e2;
                throw new SecurityException(d.h.q(i10, "Failed to parse signature record #", new StringBuilder(String.valueOf(i10).length() + 34)), e);
            } catch (BufferUnderflowException e10) {
                e = e10;
                throw new SecurityException(d.h.q(i10, "Failed to parse signature record #", new StringBuilder(String.valueOf(i10).length() + 34)), e);
            }
        }
        if (i4 == -1) {
            if (i10 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i4 == 513 || i4 == 514) {
            str = "EC";
        } else if (i4 != 769) {
            switch (i4) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i4))));
            }
        } else {
            str = "DSA";
        }
        if (i4 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i4 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i4 != 769) {
            switch (i4) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i4))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrP));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferO);
            if (!signature.verify(bArrP3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferO.clear();
            ByteBuffer byteBufferO4 = O(byteBufferO);
            ArrayList arrayList2 = new ArrayList();
            int i12 = 0;
            while (byteBufferO4.hasRemaining()) {
                i12++;
                try {
                    ByteBuffer byteBufferO5 = O(byteBufferO4);
                    if (byteBufferO5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i13 = byteBufferO5.getInt();
                    arrayList2.add(Integer.valueOf(i13));
                    if (i13 == i4) {
                        bArrP2 = P(byteBufferO5);
                    }
                } catch (IOException e11) {
                    e = e11;
                    throw new IOException(d.h.q(i12, "Failed to parse digest record #", new StringBuilder(String.valueOf(i12).length() + 31)), e);
                } catch (BufferUnderflowException e12) {
                    e = e12;
                    throw new IOException(d.h.q(i12, "Failed to parse digest record #", new StringBuilder(String.valueOf(i12).length() + 31)), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iF3 = F(i4);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iF3), bArrP2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrP2)) {
                throw new SecurityException(K(iF3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferO6 = O(byteBufferO);
            ArrayList arrayList3 = new ArrayList();
            int i14 = 0;
            while (byteBufferO6.hasRemaining()) {
                i14++;
                byte[] bArrP4 = P(byteBufferO6);
                try {
                    arrayList3.add(new v9((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrP4)), bArrP4));
                } catch (CertificateException e13) {
                    throw new SecurityException(d.h.q(i14, "Failed to decode certificate #", new StringBuilder(String.valueOf(i14).length() + 30)), e13);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrP, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e14) {
            e = e14;
            throw new SecurityException(r5.c.m(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e15) {
            e = e15;
            throw new SecurityException(r5.c.m(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e16) {
            e = e16;
            throw new SecurityException(r5.c.m(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e17) {
            e = e17;
            throw new SecurityException(r5.c.m(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e18) {
            e = e18;
            throw new SecurityException(r5.c.m(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        }
    }

    public static long w(int i4, long j8) {
        if (i4 == 1) {
            return j8;
        }
        int i10 = i4 >> 1;
        long j9 = (j8 * j8) % 1073807359;
        return (i4 & 1) == 0 ? w(i10, j9) % 1073807359 : ((w(i10, j9) % 1073807359) * j8) % 1073807359;
    }

    public static String x(Context context, String str) {
        ua.j jVar = ua.j.C;
        String strB = jVar.f35281y.b(context);
        String strC = jVar.f35281y.c(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strB)) {
            str = q(str, "gmp_app_id", strB).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strC)) ? str : q(str, "fbs_aiid", strC).toString();
    }

    public static void y(hk0 hk0Var, l1 l1Var) throws ua {
        int iH = hk0Var.h(5);
        hk0Var.f(2);
        if (hk0Var.g()) {
            hk0Var.f(5);
        }
        if (iH >= 7 && iH <= 10) {
            hk0Var.e();
        }
        if (hk0Var.g()) {
            int iH2 = hk0Var.h(3);
            if (l1Var.f13318b == -1 && iH >= 0 && iH <= 15 && (iH2 == 0 || iH2 == 1)) {
                l1Var.f13318b = iH;
            }
            if (hk0Var.g()) {
                H(hk0Var);
            }
        }
    }

    public static boolean z(int i4, boolean z3) {
        if ((i4 >>> 8) == 3368816) {
            return true;
        }
        if (i4 == 1751476579) {
            if (z3) {
                return true;
            }
            i4 = 1751476579;
        }
        for (int i10 = 0; i10 < 29; i10++) {
            if (f9253c[i10] == i4) {
                return true;
            }
        }
        return false;
    }
}
