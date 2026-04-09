package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import b4.C0352q;
import b4.C0354s;
import b4.C0356u;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
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
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.internal.ads.el, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1114el {

    /* renamed from: A, reason: collision with root package name */
    public static final P7 f13932A;

    /* renamed from: K, reason: collision with root package name */
    public static final C1122et f13942K;

    /* renamed from: L, reason: collision with root package name */
    public static final C1122et f13943L;

    /* renamed from: a, reason: collision with root package name */
    public static ExecutorService f13944a;

    /* renamed from: z, reason: collision with root package name */
    public static final P7 f13968z;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f13945b = {2002, 2000, 1920, 1601, 1600, BackupConstant.SCENE_RENDER_FAIL, TTAdConstant.STYLE_SIZE_RADIO_1_1, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f13946c = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: d, reason: collision with root package name */
    public static final J4 f13947d = new J4(4, "", "gads:afs:csa:experiment_id");

    /* renamed from: e, reason: collision with root package name */
    public static final J4 f13948e = new J4(4, "", "gads:app_index:experiment_id");

    /* renamed from: f, reason: collision with root package name */
    public static final J4 f13949f = new J4(4, "", "gads:block_autoclicks_experiment_id");

    /* renamed from: g, reason: collision with root package name */
    public static final J4 f13950g = new J4(4, "", "gads:sdk_core_experiment_id");

    /* renamed from: h, reason: collision with root package name */
    public static final J4 f13951h = new J4(4, "", "gads:spam_app_context:experiment_id");
    public static final J4 i = new J4(4, "", "gads:temporary_experiment_id:1");

    /* renamed from: j, reason: collision with root package name */
    public static final J4 f13952j = new J4(4, "", "gads:temporary_experiment_id:10");

    /* renamed from: k, reason: collision with root package name */
    public static final J4 f13953k = new J4(4, "", "gads:temporary_experiment_id:11");

    /* renamed from: l, reason: collision with root package name */
    public static final J4 f13954l = new J4(4, "", "gads:temporary_experiment_id:12");

    /* renamed from: m, reason: collision with root package name */
    public static final J4 f13955m = new J4(4, "", "gads:temporary_experiment_id:13");

    /* renamed from: n, reason: collision with root package name */
    public static final J4 f13956n = new J4(4, "", "gads:temporary_experiment_id:14");

    /* renamed from: o, reason: collision with root package name */
    public static final J4 f13957o = new J4(4, "", "gads:temporary_experiment_id:15");

    /* renamed from: p, reason: collision with root package name */
    public static final J4 f13958p = new J4(4, "", "gads:temporary_experiment_id:2");

    /* renamed from: q, reason: collision with root package name */
    public static final J4 f13959q = new J4(4, "", "gads:temporary_experiment_id:3");

    /* renamed from: r, reason: collision with root package name */
    public static final J4 f13960r = new J4(4, "", "gads:temporary_experiment_id:4");

    /* renamed from: s, reason: collision with root package name */
    public static final J4 f13961s = new J4(4, "", "gads:temporary_experiment_id:5");

    /* renamed from: t, reason: collision with root package name */
    public static final J4 f13962t = new J4(4, "", "gads:temporary_experiment_id:6");

    /* renamed from: u, reason: collision with root package name */
    public static final J4 f13963u = new J4(4, "", "gads:temporary_experiment_id:7");

    /* renamed from: v, reason: collision with root package name */
    public static final J4 f13964v = new J4(4, "", "gads:temporary_experiment_id:8");

    /* renamed from: w, reason: collision with root package name */
    public static final J4 f13965w = new J4(4, "", "gads:temporary_experiment_id:9");

    /* renamed from: x, reason: collision with root package name */
    public static final J4 f13966x = new J4(4, "", "gads:corewebview:experiment_id");

    /* renamed from: y, reason: collision with root package name */
    public static final P7 f13967y = new P7(1);

    /* renamed from: B, reason: collision with root package name */
    public static final P7 f13933B = new P7(29);

    /* renamed from: C, reason: collision with root package name */
    public static final C0748Tl f13934C = new C0748Tl(7);

    /* renamed from: D, reason: collision with root package name */
    public static final C0748Tl f13935D = new C0748Tl(12);

    /* renamed from: E, reason: collision with root package name */
    public static final C0748Tl f13936E = new C0748Tl(16);

    /* renamed from: F, reason: collision with root package name */
    public static final C0748Tl f13937F = new C0748Tl(20);

    /* renamed from: G, reason: collision with root package name */
    public static final C0748Tl f13938G = new C0748Tl(24);

    /* renamed from: H, reason: collision with root package name */
    public static final C1122et f13939H = new C1122et(2);

    /* renamed from: I, reason: collision with root package name */
    public static final C1122et f13940I = new C1122et(6);

    /* renamed from: J, reason: collision with root package name */
    public static final C1122et f13941J = new C1122et(10);
    public static final String[] M = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    static {
        int i3 = 13;
        f13968z = new P7(i3);
        int i6 = 17;
        f13932A = new P7(i6);
        f13942K = new C1122et(i3);
        f13943L = new C1122et(i6);
    }

    public static int A(int i3) {
        if (i3 == 513) {
            return 1;
        }
        if (i3 == 514) {
            return 2;
        }
        if (i3 == 769) {
            return 1;
        }
        switch (i3) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i3))));
        }
    }

    public static int B(C2036vr c2036vr) {
        int iB = c2036vr.b();
        if (c2036vr.b() == 1684108385) {
            c2036vr.G(8);
            int i3 = iB - 16;
            if (i3 == 1) {
                return c2036vr.K();
            }
            if (i3 == 2) {
                return c2036vr.L();
            }
            if (i3 == 3) {
                return c2036vr.O();
            }
            if (i3 == 4 && (c2036vr.I() & 128) == 0) {
                return c2036vr.h();
            }
        }
        AbstractC2022vd.v("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static void C(View view, int i3, int i6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i3;
        layoutParams2.width = i6;
        view.setLayoutParams(layoutParams2);
    }

    public static void D(C1443kr c1443kr) throws P4 {
        int iH = c1443kr.h(6);
        if (iH < 2 || iH > 42) {
            throw P4.b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iH)));
        }
        c1443kr.f(iH * 8);
    }

    public static K1 E(int i3, String str, C2036vr c2036vr) {
        int iB = c2036vr.b();
        if (c2036vr.b() == 1684108385 && iB >= 22) {
            c2036vr.G(10);
            int iL = c2036vr.L();
            if (iL > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(iL).length());
                sb.append(iL);
                String string = sb.toString();
                int iL2 = c2036vr.L();
                if (iL2 > 0) {
                    StringBuilder sb2 = new StringBuilder(string.length() + 1 + String.valueOf(iL2).length());
                    sb2.append(string);
                    sb2.append("/");
                    sb2.append(iL2);
                    string = sb2.toString();
                }
                return new K1(str, null, LB.i(string));
            }
        }
        AbstractC2022vd.v("MetadataUtil", "Failed to parse index/count attribute: ".concat(C0.q.m(i3)));
        return null;
    }

    public static String F(int i3) {
        if (i3 == 1) {
            return "SHA-256";
        }
        if (i3 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(A.f.i(i3, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i3).length() + 33)));
    }

    public static int G(int i3) {
        if (i3 == 1) {
            return 32;
        }
        if (i3 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(A.f.i(i3, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i3).length() + 33)));
    }

    public static ByteBuffer H(ByteBuffer byteBuffer, int i3) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i6 = i3 + iPosition;
        if (i6 < iPosition || i6 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i6);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i6);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static ByteBuffer I(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int iRemaining = byteBuffer.remaining();
            throw new IOException(A.f.i(iRemaining, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", new StringBuilder(String.valueOf(iRemaining).length() + 82)));
        }
        int i3 = byteBuffer.getInt();
        if (i3 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i3 <= byteBuffer.remaining()) {
            return H(byteBuffer, i3);
        }
        int iRemaining2 = byteBuffer.remaining();
        throw new IOException(A.f.o(new StringBuilder(String.valueOf(i3).length() + 79 + String.valueOf(iRemaining2).length()), "Length-prefixed field longer than remaining buffer. Field length: ", i3, ", remaining: ", iRemaining2));
    }

    public static byte[] J(ByteBuffer byteBuffer) throws IOException {
        int i3 = byteBuffer.getInt();
        if (i3 < 0) {
            throw new IOException("Negative length");
        }
        if (i3 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i3];
            byteBuffer.get(bArr);
            return bArr;
        }
        int iRemaining = byteBuffer.remaining();
        throw new IOException(A.f.o(new StringBuilder(String.valueOf(i3).length() + 68 + String.valueOf(iRemaining).length()), "Underflow while reading length-prefixed value. Length: ", i3, ", available: ", iRemaining));
    }

    public static void K(int i3, byte[] bArr) {
        bArr[1] = (byte) (i3 & 255);
        bArr[2] = (byte) ((i3 >>> 8) & 255);
        bArr[3] = (byte) ((i3 >>> 16) & 255);
        bArr[4] = (byte) (i3 >> 24);
    }

    public static int a(String str) {
        int i3;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i3 = length & (-4);
            if (i6 >= i3) {
                break;
            }
            int i8 = ((bytes[i6] & 255) | ((bytes[i6 + 1] & 255) << 8) | ((bytes[i6 + 2] & 255) << 16) | (bytes[i6 + 3] << 24)) * (-862048943);
            int i9 = i7 ^ (((i8 >>> 17) | (i8 << 15)) * 461845907);
            i7 = (((i9 >>> 19) | (i9 << 13)) * 5) - 430675100;
            i6 += 4;
        }
        int i10 = length & 3;
        if (i10 == 1) {
            int i11 = ((bytes[i3] & 255) | i) * (-862048943);
            i7 ^= ((i11 >>> 17) | (i11 << 15)) * 461845907;
        } else {
            if (i10 != 2) {
                i = i10 == 3 ? (bytes[i3 + 2] & 255) << 16 : 0;
            }
            i |= (bytes[i3 + 1] & 255) << 8;
            int i112 = ((bytes[i3] & 255) | i) * (-862048943);
            i7 ^= ((i112 >>> 17) | (i112 << 15)) * 461845907;
        }
        int i12 = i7 ^ length;
        int i13 = (i12 ^ (i12 >>> 16)) * (-2048144789);
        int i14 = (i13 ^ (i13 >>> 13)) * (-1028477387);
        return i14 ^ (i14 >>> 16);
    }

    public static long b(String str) {
        String str2 = Vt.f12096a;
        String[] strArrSplit = str.split("\\.", 2);
        long j6 = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j6 = (j6 * 60) + Long.parseLong(str3);
        }
        long j7 = j6 * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j7 += Long.parseLong(strTrim);
        }
        return j7 * 1000;
    }

    public static Object c(ZA za) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return za.a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static Provider d() {
        for (int i3 = 0; i3 < 3; i3++) {
            Provider provider = Security.getProvider(M[i3]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static synchronized Executor e() {
        try {
            if (f13944a == null) {
                String str = Vt.f12096a;
                f13944a = Executors.newSingleThreadExecutor(new ThreadFactoryC1539mf("ExoPlayer:BackgroundExecutor"));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13944a;
    }

    public static void f(int i3, U3 u32, C1855sP c1855sP, U3 u33, U3... u3Arr) {
        if (u33 == null) {
            u33 = new U3(new B3[0]);
        }
        if (u32 != null) {
            JB jb = LB.f9635b;
            C1476lN.v(4, "initialCapacity");
            Object[] objArrCopyOf = new Object[4];
            int i6 = 0;
            for (B3 b32 : u32.f11598a) {
                if (Mv.class.isAssignableFrom(b32.getClass())) {
                    B3 b33 = (B3) Mv.class.cast(b32);
                    b33.getClass();
                    int length = objArrCopyOf.length;
                    int i7 = i6 + 1;
                    int iD = GB.d(length, i7);
                    if (iD > length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                    }
                    objArrCopyOf[i6] = b33;
                    i6 = i7;
                }
            }
            C1197gC c1197gCO = LB.o(i6, objArrCopyOf);
            int i8 = c1197gCO.f14229d;
            for (int i9 = 0; i9 < i8; i9++) {
                Mv mv = (Mv) c1197gCO.get(i9);
                if (!mv.f9926a.equals("com.android.capture.fps") || i3 == 2) {
                    u33 = u33.c(mv);
                }
            }
        }
        for (U3 u34 : u3Arr) {
            u33 = u33.b(u34);
        }
        if (u33.f11598a.length > 0) {
            c1855sP.f16730j = u33;
        }
    }

    public static void g(SpannableStringBuilder spannableStringBuilder, Object obj, int i3, int i6) {
        for (Object obj2 : spannableStringBuilder.getSpans(i3, i6, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i3 && spannableStringBuilder.getSpanEnd(obj2) == i6 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i3, i6, 33);
    }

    public static void h(String str) {
        if (((Boolean) AbstractC1803ra.f16566a.v()).booleanValue()) {
            u2.k.c(str);
        }
    }

    public static boolean i(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr() && (hdrCapabilities = display.getHdrCapabilities()) != null) {
            for (int i3 : hdrCapabilities.getSupportedHdrTypes()) {
                if (i3 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] j() {
        int i3 = (((((~1070575321) & 53864535) | 741512112) + ((1070575321 & 1665624655) | 1758594712)) - 1358657052) ^ (1555319301 % 382697713);
        int i6 = (((((~1529195746) & 118097808) | 3345166) + ((1529195746 & 656934035) | 821390159)) - 940522761) ^ (1037127828 % 1034949299);
        int[] iArr = {350322227, 1077471394, 1759186290, 18931840, 769005128, 1847857001, 24413078, 1982275856, 1275373743};
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((iArr[7] % 1275373743) ^ A.f.d((i8 & (~i7)) | i9, (i7 & i10) | i11, i12, i13));
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) i6);
        byteBufferAllocate.putInt(i3);
        return byteBufferAllocate.array();
    }

    public static X509Certificate[][] k(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        Pair pairY;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile2.length() < 22) {
                pairY = null;
            } else {
                pairY = AbstractC0933bL.y(randomAccessFile2, 0);
                if (pairY == null) {
                    pairY = AbstractC0933bL.y(randomAccessFile2, 65535);
                }
            }
            try {
                if (pairY == null) {
                    long length = randomAccessFile2.length();
                    StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 82);
                    sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                    sb.append(length);
                    sb.append(" bytes");
                    throw new C1727q4(sb.toString());
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairY.first;
                long jLongValue = ((Long) pairY.second).longValue();
                long j6 = (-20) + jLongValue;
                if (j6 >= 0) {
                    randomAccessFile2.seek(j6);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new C1727q4("ZIP64 APK not supported");
                    }
                }
                AbstractC0933bL.E(byteBuffer);
                long j7 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
                if (j7 >= jLongValue) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(j7).length() + 82 + String.valueOf(jLongValue).length());
                    sb2.append("ZIP Central Directory offset out of range: ");
                    sb2.append(j7);
                    sb2.append(". ZIP End of Central Directory offset: ");
                    sb2.append(jLongValue);
                    throw new C1727q4(sb2.toString());
                }
                AbstractC0933bL.E(byteBuffer);
                if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j7 != jLongValue) {
                    throw new C1727q4("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (j7 < 32) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(j7).length() + 67);
                    sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb3.append(j7);
                    throw new C1727q4(sb3.toString());
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                randomAccessFile2.seek(j7 - byteBufferAllocate.capacity());
                randomAccessFile2.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                    throw new C1727q4("No APK Signing Block before ZIP Central Directory");
                }
                long j8 = byteBufferAllocate.getLong(0);
                if (j8 < byteBufferAllocate.capacity() || j8 > 2147483639) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j8).length() + 37);
                    sb4.append("APK Signing Block size out of range: ");
                    sb4.append(j8);
                    throw new C1727q4(sb4.toString());
                }
                int i3 = (int) (8 + j8);
                long j9 = j7 - i3;
                if (j9 < 0) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j9).length() + 39);
                    sb5.append("APK Signing Block offset out of range: ");
                    sb5.append(j9);
                    throw new C1727q4(sb5.toString());
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i3);
                byteBufferAllocate2.order(byteOrder);
                randomAccessFile2.seek(j9);
                long j10 = j7;
                randomAccessFile2.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                long j11 = byteBufferAllocate2.getLong(0);
                if (j11 != j8) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(j11).length() + 63 + String.valueOf(j8).length());
                    sb6.append("APK Signing Block sizes in header and footer do not match: ");
                    sb6.append(j11);
                    sb6.append(" vs ");
                    sb6.append(j8);
                    throw new C1727q4(sb6.toString());
                }
                Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j9));
                ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                long jLongValue2 = ((Long) pairCreate.second).longValue();
                if (byteBuffer2.order() != byteOrder) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int iCapacity = byteBuffer2.capacity() - 24;
                randomAccessFile = randomAccessFile2;
                if (iCapacity < 8) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(iCapacity).length() + 17);
                    sb7.append("end < start: ");
                    sb7.append(iCapacity);
                    sb7.append(" < 8");
                    throw new IllegalArgumentException(sb7.toString());
                }
                int iCapacity2 = byteBuffer2.capacity();
                if (iCapacity > byteBuffer2.capacity()) {
                    StringBuilder sb8 = new StringBuilder(String.valueOf(iCapacity).length() + 19 + String.valueOf(iCapacity2).length());
                    sb8.append("end > capacity: ");
                    sb8.append(iCapacity);
                    sb8.append(" > ");
                    sb8.append(iCapacity2);
                    throw new IllegalArgumentException(sb8.toString());
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
                    int i6 = 0;
                    while (byteBufferSlice.hasRemaining()) {
                        i6++;
                        if (byteBufferSlice.remaining() < 8) {
                            StringBuilder sb9 = new StringBuilder(String.valueOf(i6).length() + 59);
                            sb9.append("Insufficient data to read size of APK Signing Block entry #");
                            sb9.append(i6);
                            throw new C1727q4(sb9.toString());
                        }
                        long j12 = byteBufferSlice.getLong();
                        if (j12 < 4 || j12 > 2147483647L) {
                            StringBuilder sb10 = new StringBuilder(String.valueOf(i6).length() + 45 + String.valueOf(j12).length());
                            sb10.append("APK Signing Block entry #");
                            sb10.append(i6);
                            sb10.append(" size out of range: ");
                            sb10.append(j12);
                            throw new C1727q4(sb10.toString());
                        }
                        int i7 = (int) j12;
                        int iPosition2 = byteBufferSlice.position() + i7;
                        if (i7 > byteBufferSlice.remaining()) {
                            int iRemaining = byteBufferSlice.remaining();
                            StringBuilder sb11 = new StringBuilder(String.valueOf(i6).length() + 45 + String.valueOf(i7).length() + 13 + String.valueOf(iRemaining).length());
                            sb11.append("APK Signing Block entry #");
                            sb11.append(i6);
                            sb11.append(" size out of range: ");
                            sb11.append(i7);
                            sb11.append(", available: ");
                            sb11.append(iRemaining);
                            throw new C1727q4(sb11.toString());
                        }
                        if (byteBufferSlice.getInt() == 1896449818) {
                            X509Certificate[][] x509CertificateArrO = o(randomAccessFile.getChannel(), new C0354s(H(byteBufferSlice, i7 - 4), jLongValue2, j10, jLongValue, byteBuffer));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return x509CertificateArrO;
                        }
                        long j13 = j10;
                        byteBufferSlice.position(iPosition2);
                        j10 = j13;
                    }
                    throw new C1727q4("No APK Signature Scheme v2 block in APK Signing Block");
                } catch (Throwable th) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = randomAccessFile2;
        }
    }

    public static float l(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static T2.d m(com.google.android.gms.internal.ads.C1443kr r10) {
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
            int[] r9 = com.google.android.gms.internal.ads.AbstractC1114el.f13945b
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
            T2.d r1 = new T2.d
            r2 = 0
            r1.<init>(r5, r0, r10, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1114el.m(com.google.android.gms.internal.ads.kr):T2.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String[] n(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1114el.n(java.lang.String, boolean):java.lang.String[]");
    }

    public static X509Certificate[][] o(FileChannel fileChannel, C0354s c0354s) throws CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferI = I((ByteBuffer) c0354s.f5767a);
                int i3 = 0;
                while (byteBufferI.hasRemaining()) {
                    i3++;
                    try {
                        arrayList.add(s(I(byteBufferI), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e6) {
                        throw new SecurityException(A.f.n(new StringBuilder(String.valueOf(i3).length() + 37), "Failed to parse/verify signer #", i3, " block"), e6);
                    }
                }
                if (i3 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j6 = c0354s.f5768b;
                long j7 = c0354s.f5769c;
                long j8 = c0354s.f5770d;
                ByteBuffer byteBuffer = (ByteBuffer) c0354s.f5771e;
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                C0352q c0352q = new C0352q(fileChannel, 0L, j6, 1);
                C0352q c0352q2 = new C0352q(fileChannel, j7, j8 - j7, 1);
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                AbstractC0933bL.E(byteBufferDuplicate);
                int iPosition = byteBufferDuplicate.position() + 16;
                if (j6 < 0 || j6 > 4294967295L) {
                    StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 27);
                    sb.append("uint32 value of out range: ");
                    sb.append(j6);
                    throw new IllegalArgumentException(sb.toString());
                }
                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j6);
                Rx rx = new Rx(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    iArr[i6] = ((Integer) it.next()).intValue();
                    i6++;
                }
                try {
                    byte[][] bArrZ = z(iArr, new InterfaceC1673p4[]{c0352q, c0352q2, rx});
                    for (int i7 = 0; i7 < size; i7++) {
                        int i8 = iArr[i7];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i8)), bArrZ[i7])) {
                            throw new SecurityException(F(i8).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e7) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e7);
                }
            } catch (IOException e8) {
                throw new SecurityException("Failed to read list of signers", e8);
            }
        } catch (CertificateException e9) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e9);
        }
    }

    public static Q0 p(InterfaceC2046w0 interfaceC2046w0, boolean z6, boolean z7) {
        Q0 q02;
        long j6;
        C2036vr c2036vr;
        int i3;
        int i6;
        long j7;
        int i7;
        int i8;
        int[] iArr;
        long jP = interfaceC2046w0.p();
        long j8 = -1;
        long j9 = 4096;
        if (jP != -1 && jP <= 4096) {
            j9 = jP;
        }
        C2036vr c2036vr2 = new C2036vr(64);
        int i9 = (int) j9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i9) {
            c2036vr2.y(8);
            if (!interfaceC2046w0.y(c2036vr2.f17354a, i10, 8, true)) {
                break;
            }
            long jP2 = c2036vr2.P();
            int iB = c2036vr2.b();
            if (jP2 == 1) {
                j6 = j8;
                interfaceC2046w0.v(8, 8, c2036vr2.f17354a);
                i3 = 16;
                c2036vr2.C(16);
                jP2 = c2036vr2.d();
                c2036vr = c2036vr2;
            } else {
                j6 = j8;
                if (jP2 == 0) {
                    long jP3 = interfaceC2046w0.p();
                    if (jP3 != j6) {
                        jP2 = (jP3 - interfaceC2046w0.n()) + 8;
                    }
                }
                c2036vr = c2036vr2;
                i3 = 8;
            }
            long j10 = jP2;
            q02 = null;
            long j11 = i3;
            if (j10 < j11) {
                i6 = 1;
                if (iB == 1718773093) {
                    if (i3 == 8) {
                        j10 = 8;
                        iB = 1718773093;
                    } else {
                        iB = 1718773093;
                    }
                }
                return new C1077e2(iB, i3, j10);
            }
            i6 = 1;
            i11 += i3;
            if (iB == 1836019574) {
                i9 += (int) j10;
                if (jP != -1 && i9 > jP) {
                    i9 = (int) jP;
                }
                c2036vr2 = c2036vr;
                j8 = j6;
                i10 = 0;
            } else {
                if (iB == 1953653099 || iB == 1835297121 || iB == 1835626086) {
                    j7 = jP;
                    i7 = 0;
                } else {
                    if (iB == 1836019558 || iB == 1836475768) {
                        i10 = i6;
                        break;
                    }
                    i12 |= (iB == 1835295092 ? 0 : i6) ^ 1;
                    if (iB == 1937007212) {
                        if (j10 > 1000000) {
                            i10 = 0;
                            break;
                        }
                        iB = 1937007212;
                    }
                    j7 = jP;
                    if ((i11 + j10) - j11 >= i9) {
                        i10 = 0;
                        break;
                    }
                    int i13 = (int) (j10 - j11);
                    i11 += i13;
                    if (iB != 1718909296) {
                        i7 = 0;
                        if (i13 != 0) {
                            interfaceC2046w0.r(i13);
                        }
                    } else {
                        if (i13 < 8) {
                            return new C1077e2(1718909296, 8, i13);
                        }
                        c2036vr.y(i13);
                        i7 = 0;
                        interfaceC2046w0.v(0, i13, c2036vr.f17354a);
                        int iB2 = c2036vr.b();
                        int i14 = (v(iB2, z7) ? 1 : 0) | i12;
                        c2036vr.G(4);
                        int iB3 = c2036vr.B() / 4;
                        if (i14 == 0 && iB3 > 0) {
                            iArr = new int[iB3];
                            int i15 = 0;
                            while (true) {
                                if (i15 >= iB3) {
                                    i8 = i14;
                                    break;
                                }
                                int iB4 = c2036vr.b();
                                iArr[i15] = iB4;
                                if (v(iB4, z7)) {
                                    i8 = i6;
                                    break;
                                }
                                i15++;
                            }
                        } else {
                            i8 = i14;
                            iArr = null;
                        }
                        if (i8 == 0) {
                            return new L2.w(iArr, iB2, 3);
                        }
                        i12 = i8;
                    }
                }
                i10 = i7;
                c2036vr2 = c2036vr;
                jP = j7;
                j8 = j6;
            }
        }
        q02 = null;
        return i12 == 0 ? C1994v2.f17205b : z6 != i10 ? i10 != 0 ? C1778r2.f16452c : C1778r2.f16453d : q02;
    }

    public static C0697Ql q(C2036vr c2036vr) {
        c2036vr.G(1);
        int iO = c2036vr.O();
        long j6 = c2036vr.f17355b;
        long j7 = iO;
        int i3 = iO / 18;
        long[] jArrCopyOf = new long[i3];
        long[] jArrCopyOf2 = new long[i3];
        int i6 = 0;
        while (true) {
            if (i6 >= i3) {
                break;
            }
            long jD = c2036vr.d();
            if (jD == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i6);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i6);
                break;
            }
            jArrCopyOf[i6] = jD;
            jArrCopyOf2[i6] = c2036vr.d();
            c2036vr.G(2);
            i6++;
        }
        c2036vr.G((int) ((j6 + j7) - c2036vr.f17355b));
        return new C0697Ql(jArrCopyOf, 2, jArrCopyOf2);
    }

    public static void r(int i3, C2036vr c2036vr) {
        c2036vr.y(7);
        byte[] bArr = c2036vr.f17354a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i3 >> 16) & 255);
        bArr[5] = (byte) ((i3 >> 8) & 255);
        bArr[6] = (byte) (i3 & 255);
    }

    public static X509Certificate[] s(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferI = I(byteBuffer);
        ByteBuffer byteBufferI2 = I(byteBuffer);
        byte[] bArrJ = J(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrJ2 = null;
        byte[] bArrJ3 = null;
        int i3 = -1;
        int i6 = 0;
        while (byteBufferI2.hasRemaining()) {
            i6++;
            try {
                ByteBuffer byteBufferI3 = I(byteBufferI2);
                if (byteBufferI3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i7 = byteBufferI3.getInt();
                arrayList.add(Integer.valueOf(i7));
                if (i7 != 513 && i7 != 514 && i7 != 769) {
                    switch (i7) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i3 != -1) {
                    int iA = A(i7);
                    int iA2 = A(i3);
                    if (iA != 1 && iA2 == 1) {
                    }
                }
                bArrJ3 = J(byteBufferI3);
                i3 = i7;
            } catch (IOException e6) {
                e = e6;
                throw new SecurityException(A.f.i(i6, "Failed to parse signature record #", new StringBuilder(String.valueOf(i6).length() + 34)), e);
            } catch (BufferUnderflowException e7) {
                e = e7;
                throw new SecurityException(A.f.i(i6, "Failed to parse signature record #", new StringBuilder(String.valueOf(i6).length() + 34)), e);
            }
        }
        if (i3 == -1) {
            if (i6 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i3 == 513 || i3 == 514) {
            str = "EC";
        } else if (i3 != 769) {
            switch (i3) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i3))));
            }
        } else {
            str = "DSA";
        }
        if (i3 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i3 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i3 != 769) {
            switch (i3) {
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
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i3))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrJ));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferI);
            if (!signature.verify(bArrJ3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferI.clear();
            ByteBuffer byteBufferI4 = I(byteBufferI);
            ArrayList arrayList2 = new ArrayList();
            int i8 = 0;
            while (byteBufferI4.hasRemaining()) {
                i8++;
                try {
                    ByteBuffer byteBufferI5 = I(byteBufferI4);
                    if (byteBufferI5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i9 = byteBufferI5.getInt();
                    arrayList2.add(Integer.valueOf(i9));
                    if (i9 == i3) {
                        bArrJ2 = J(byteBufferI5);
                    }
                } catch (IOException e8) {
                    e = e8;
                    throw new IOException(A.f.i(i8, "Failed to parse digest record #", new StringBuilder(String.valueOf(i8).length() + 31)), e);
                } catch (BufferUnderflowException e9) {
                    e = e9;
                    throw new IOException(A.f.i(i8, "Failed to parse digest record #", new StringBuilder(String.valueOf(i8).length() + 31)), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iA3 = A(i3);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iA3), bArrJ2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrJ2)) {
                throw new SecurityException(F(iA3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferI6 = I(byteBufferI);
            ArrayList arrayList3 = new ArrayList();
            int i10 = 0;
            while (byteBufferI6.hasRemaining()) {
                i10++;
                byte[] bArrJ4 = J(byteBufferI6);
                try {
                    arrayList3.add(new C0356u((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrJ4)), bArrJ4, 1));
                } catch (CertificateException e10) {
                    throw new SecurityException(A.f.i(i10, "Failed to decode certificate #", new StringBuilder(String.valueOf(i10).length() + 30)), e10);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrJ, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e11) {
            e = e11;
            throw new SecurityException(AbstractC1135f5.n(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e12) {
            e = e12;
            throw new SecurityException(AbstractC1135f5.n(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            throw new SecurityException(AbstractC1135f5.n(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e14) {
            e = e14;
            throw new SecurityException(AbstractC1135f5.n(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e15) {
            e = e15;
            throw new SecurityException(AbstractC1135f5.n(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        }
    }

    public static K1 t(int i3, String str, C2036vr c2036vr) {
        int iB = c2036vr.b();
        if (c2036vr.b() == 1684108385) {
            c2036vr.G(8);
            return new K1(str, null, LB.i(c2036vr.l(iB - 16)));
        }
        AbstractC2022vd.v("MetadataUtil", "Failed to parse text attribute: ".concat(C0.q.m(i3)));
        return null;
    }

    public static void u(C1443kr c1443kr, C1293i0 c1293i0) throws P4 {
        int iH = c1443kr.h(5);
        c1443kr.f(2);
        if (c1443kr.g()) {
            c1443kr.f(5);
        }
        if (iH >= 7 && iH <= 10) {
            c1443kr.e();
        }
        if (c1443kr.g()) {
            int iH2 = c1443kr.h(3);
            if (c1293i0.f14636b == -1 && iH >= 0 && iH <= 15 && (iH2 == 0 || iH2 == 1)) {
                c1293i0.f14636b = iH;
            }
            if (c1443kr.g()) {
                D(c1443kr);
            }
        }
    }

    public static boolean v(int i3, boolean z6) {
        if ((i3 >>> 8) == 3368816) {
            return true;
        }
        if (i3 == 1751476579) {
            if (z6) {
                return true;
            }
            i3 = 1751476579;
        }
        for (int i6 = 0; i6 < 29; i6++) {
            if (f13946c[i6] == i3) {
                return true;
            }
        }
        return false;
    }

    public static TextView w(Context context, String str, int i3, int i6, float f2, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        C(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f2, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i3);
        textView.setTextColor(i6);
        textView.setText(str);
        return textView;
    }

    public static F1 x(int i3, String str, C2036vr c2036vr, boolean z6, boolean z7) {
        int iB = B(c2036vr);
        if (z7) {
            iB = Math.min(1, iB);
        }
        if (iB >= 0) {
            return z6 ? new K1(str, null, LB.i(Integer.toString(iB))) : new C1("und", str, Integer.toString(iB));
        }
        AbstractC2022vd.v("MetadataUtil", "Failed to parse uint8 attribute: ".concat(C0.q.m(i3)));
        return null;
    }

    public static void y(C1443kr c1443kr, C1293i0 c1293i0) throws P4 {
        c1443kr.f(2);
        boolean zG = c1443kr.g();
        int iH = c1443kr.h(8);
        for (int i3 = 0; i3 < iH; i3++) {
            c1443kr.f(2);
            if (c1443kr.g()) {
                c1443kr.f(5);
            }
            if (zG) {
                c1443kr.f(24);
            } else {
                if (c1443kr.g()) {
                    if (!c1443kr.g()) {
                        c1443kr.f(4);
                    }
                    c1293i0.f14637c = c1443kr.h(6) + 1;
                }
                c1443kr.f(4);
            }
        }
        if (c1443kr.g()) {
            c1443kr.f(3);
            if (c1443kr.g()) {
                D(c1443kr);
            }
        }
    }

    public static byte[][] z(int[] iArr, InterfaceC1673p4[] interfaceC1673p4Arr) throws DigestException {
        long j6;
        int i3;
        int length;
        char c6;
        int i6 = 0;
        long jA = 0;
        while (true) {
            j6 = 1048576;
            if (i6 >= 3) {
                break;
            }
            jA += (interfaceC1673p4Arr[i6].a() + 1048575) / 1048576;
            i6++;
        }
        if (jA >= 2097151) {
            StringBuilder sb = new StringBuilder(String.valueOf(jA).length() + 17);
            sb.append("Too many chunks: ");
            sb.append(jA);
            throw new DigestException(sb.toString());
        }
        byte[][] bArr = new byte[iArr.length][];
        int i7 = 0;
        while (true) {
            length = iArr.length;
            c6 = 5;
            if (i7 >= length) {
                break;
            }
            int i8 = (int) jA;
            byte[] bArr2 = new byte[(G(iArr[i7]) * i8) + 5];
            bArr2[0] = 90;
            K(i8, bArr2);
            bArr[i7] = bArr2;
            i7++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            String strF = F(iArr[i9]);
            try {
                messageDigestArr[i9] = MessageDigest.getInstance(strF);
            } catch (NoSuchAlgorithmException e6) {
                throw new RuntimeException(strF.concat(" digest not supported"), e6);
            }
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (i3 = 3; i10 < i3; i3 = 3) {
            InterfaceC1673p4 interfaceC1673p4 = interfaceC1673p4Arr[i10];
            int i13 = i10;
            long jA2 = interfaceC1673p4.a();
            long j7 = 0;
            while (jA2 > 0) {
                char c7 = c6;
                int i14 = i11;
                int iMin = (int) Math.min(jA2, j6);
                K(iMin, bArr3);
                for (int i15 = 0; i15 < length; i15++) {
                    messageDigestArr[i15].update(bArr3);
                }
                try {
                    interfaceC1673p4.g(messageDigestArr, j7, iMin);
                    int i16 = 0;
                    while (i16 < iArr.length) {
                        int i17 = iArr[i16];
                        byte[] bArr4 = bArr[i16];
                        int iG = G(i17);
                        InterfaceC1673p4 interfaceC1673p42 = interfaceC1673p4;
                        MessageDigest messageDigest = messageDigestArr[i16];
                        long j8 = jA2;
                        int iDigest = messageDigest.digest(bArr4, (i14 * iG) + 5, iG);
                        if (iDigest != iG) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(iDigest).length());
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(iDigest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i16++;
                        interfaceC1673p4 = interfaceC1673p42;
                        jA2 = j8;
                    }
                    InterfaceC1673p4 interfaceC1673p43 = interfaceC1673p4;
                    long j9 = iMin;
                    j7 += j9;
                    i11 = i14 + 1;
                    jA2 -= j9;
                    c6 = c7;
                    interfaceC1673p4 = interfaceC1673p43;
                    j6 = 1048576;
                } catch (IOException e7) {
                    throw new DigestException(A.f.o(new StringBuilder(String.valueOf(i14).length() + 37 + String.valueOf(i12).length()), "Failed to digest chunk #", i14, " of section #", i12), e7);
                }
            }
            i12++;
            i10 = i13 + 1;
            j6 = 1048576;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i18 = 0; i18 < iArr.length; i18++) {
            int i19 = iArr[i18];
            byte[] bArr6 = bArr[i18];
            String strF2 = F(i19);
            try {
                bArr5[i18] = MessageDigest.getInstance(strF2).digest(bArr6);
            } catch (NoSuchAlgorithmException e8) {
                throw new RuntimeException(strF2.concat(" digest not supported"), e8);
            }
        }
        return bArr5;
    }
}
