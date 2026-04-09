package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
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
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class gi2 {
    public static String a;
    public static final gs3 c;
    public static final gs3 d;
    public static final rv1 e;
    public static final zq2 f;
    public static Boolean i;
    public static final ha b = new ha(1);
    public static final sq0 g = new sq0(21, new tv2(12, 0));
    public static final p63 h = new p63(11);

    static {
        int i2 = 3;
        c = new gs3("NONE", i2);
        d = new gs3("PENDING", i2);
        int i3 = 0;
        e = new rv1(i3);
        f = new zq2(i3);
    }

    public static final Object A(qj qjVar, hk hkVar, hy hyVar) throws Throwable {
        hk context = qjVar.getContext();
        hk hkVarG = !((Boolean) hkVar.f(Boolean.FALSE, ik.i)).booleanValue() ? context.g(hkVar) : bd2.m(context, hkVar, false);
        wl2.g(hkVarG);
        if (hkVarG == context) {
            ht0 ht0Var = new ht0(hkVarG, qjVar);
            return yb.r(ht0Var, ht0Var, hyVar);
        }
        pz pzVar = pz.h;
        if (i30.c(hkVarG.h(pzVar), context.h(pzVar))) {
            x31 x31Var = new x31(hkVarG, qjVar);
            hk hkVar2 = x31Var.h;
            Object objY = wl2.y(hkVar2, null);
            try {
                return yb.r(x31Var, x31Var, hyVar);
            } finally {
                wl2.v(hkVar2, objY);
            }
        }
        dp dpVar = new dp(hkVarG, qjVar);
        yb.q(hyVar, dpVar, dpVar);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = dp.j;
        do {
            int i2 = atomicIntegerFieldUpdater.get(dpVar);
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object objX = wl2.x(dpVar.A());
                if (objX instanceof pg) {
                    throw ((pg) objX).a;
                }
                return objX;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(dpVar, 0, 1));
        return rk.f;
    }

    public static synchronized String B(Context context) {
        String str;
        try {
            if (a == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || zt0.E()) {
                    string = "emulator";
                }
                for (int i2 = 0; i2 < 3; i2++) {
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.update(string.getBytes());
                        str = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                        break;
                    } catch (ArithmeticException unused) {
                    } catch (NoSuchAlgorithmException unused2) {
                    }
                }
                str = "";
                a = str;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static ArrayList C(yq2 yq2Var) {
        ArrayList arrayList = new ArrayList();
        yq2Var.getClass();
        while (yq2Var.hasNext()) {
            arrayList.add(yq2Var.next());
        }
        return arrayList;
    }

    public static void E(u10 u10Var, Throwable th, String str) {
        r92.a((Context) oi0.l1(u10Var)).g(th, str, ((Double) f12.f.w()).floatValue());
    }

    public static void F(MediaFormat mediaFormat, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(ex0.j(new StringBuilder(String.valueOf(i2).length() + 4), "csd-", i2), ByteBuffer.wrap((byte[]) list.get(i2)));
        }
    }

    public static void G(String str) {
        if (!R() || str == null || str.length() <= 4000) {
            return;
        }
        sq0 sq0Var = g;
        Iterator itD = ((kl3) sq0Var.g).d(sq0Var, str);
        while (true) {
            jl3 jl3Var = (jl3) itD;
            if (!jl3Var.hasNext()) {
                return;
            }
        }
    }

    public static boolean H(av1 av1Var) {
        int iOrdinal = av1Var.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static X509Certificate[][] I(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        Pair pairX;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile2.length() < 22) {
                pairX = null;
            } else {
                pairX = uk2.X(randomAccessFile2, 0);
                if (pairX == null) {
                    pairX = uk2.X(randomAccessFile2, 65535);
                }
            }
            try {
                if (pairX == null) {
                    long length = randomAccessFile2.length();
                    StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 82);
                    sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                    sb.append(length);
                    sb.append(" bytes");
                    throw new tn1(sb.toString());
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairX.first;
                long jLongValue = ((Long) pairX.second).longValue();
                long j = (-20) + jLongValue;
                if (j >= 0) {
                    randomAccessFile2.seek(j);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new tn1("ZIP64 APK not supported");
                    }
                }
                uk2.d0(byteBuffer);
                long j2 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
                if (j2 >= jLongValue) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 82 + String.valueOf(jLongValue).length());
                    sb2.append("ZIP Central Directory offset out of range: ");
                    sb2.append(j2);
                    sb2.append(". ZIP End of Central Directory offset: ");
                    sb2.append(jLongValue);
                    throw new tn1(sb2.toString());
                }
                uk2.d0(byteBuffer);
                if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j2 != jLongValue) {
                    throw new tn1("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (j2 < 32) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(j2).length() + 67);
                    sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb3.append(j2);
                    throw new tn1(sb3.toString());
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                randomAccessFile2.seek(j2 - byteBufferAllocate.capacity());
                randomAccessFile2.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                    throw new tn1("No APK Signing Block before ZIP Central Directory");
                }
                long j3 = byteBufferAllocate.getLong(0);
                if (j3 < byteBufferAllocate.capacity() || j3 > 2147483639) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j3).length() + 37);
                    sb4.append("APK Signing Block size out of range: ");
                    sb4.append(j3);
                    throw new tn1(sb4.toString());
                }
                int i2 = (int) (8 + j3);
                long j4 = j2 - i2;
                if (j4 < 0) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j4).length() + 39);
                    sb5.append("APK Signing Block offset out of range: ");
                    sb5.append(j4);
                    throw new tn1(sb5.toString());
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2);
                byteBufferAllocate2.order(byteOrder);
                randomAccessFile2.seek(j4);
                long j5 = j2;
                randomAccessFile2.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                long j6 = byteBufferAllocate2.getLong(0);
                if (j6 != j3) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(j6).length() + 63 + String.valueOf(j3).length());
                    sb6.append("APK Signing Block sizes in header and footer do not match: ");
                    sb6.append(j6);
                    sb6.append(" vs ");
                    sb6.append(j3);
                    throw new tn1(sb6.toString());
                }
                Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j4));
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
                    int i3 = 0;
                    while (byteBufferSlice.hasRemaining()) {
                        i3++;
                        if (byteBufferSlice.remaining() < 8) {
                            StringBuilder sb9 = new StringBuilder(String.valueOf(i3).length() + 59);
                            sb9.append("Insufficient data to read size of APK Signing Block entry #");
                            sb9.append(i3);
                            throw new tn1(sb9.toString());
                        }
                        long j7 = byteBufferSlice.getLong();
                        if (j7 < 4 || j7 > 2147483647L) {
                            StringBuilder sb10 = new StringBuilder(String.valueOf(i3).length() + 45 + String.valueOf(j7).length());
                            sb10.append("APK Signing Block entry #");
                            sb10.append(i3);
                            sb10.append(" size out of range: ");
                            sb10.append(j7);
                            throw new tn1(sb10.toString());
                        }
                        int i4 = (int) j7;
                        int iPosition2 = byteBufferSlice.position() + i4;
                        if (i4 > byteBufferSlice.remaining()) {
                            int iRemaining = byteBufferSlice.remaining();
                            StringBuilder sb11 = new StringBuilder(String.valueOf(i3).length() + 45 + String.valueOf(i4).length() + 13 + String.valueOf(iRemaining).length());
                            sb11.append("APK Signing Block entry #");
                            sb11.append(i3);
                            sb11.append(" size out of range: ");
                            sb11.append(i4);
                            sb11.append(", available: ");
                            sb11.append(iRemaining);
                            throw new tn1(sb11.toString());
                        }
                        if (byteBufferSlice.getInt() == 1896449818) {
                            X509Certificate[][] x509CertificateArrN = N(randomAccessFile.getChannel(), new sn1(h0(i4 - 4, byteBufferSlice), jLongValue2, j5, jLongValue, byteBuffer));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return x509CertificateArrN;
                        }
                        long j8 = j5;
                        byteBufferSlice.position(iPosition2);
                        j5 = j8;
                    }
                    throw new tn1("No APK Signature Scheme v2 block in APK Signing Block");
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

    /* JADX WARN: Removed duplicated region for block: B:6:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.av1 J(android.content.Context r14, defpackage.gd3 r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.J(android.content.Context, gd3):av1");
    }

    public static void K(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static void L(Parcel parcel, int i2, int i3) {
        int iX = x(parcel, i2);
        if (iX == i3) {
            return;
        }
        String hexString = Integer.toHexString(iX);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(iX);
        sb.append(" (0x");
        throw new rg(ex0.k(sb, hexString, ")"), parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean M(defpackage.kz2 r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r1.b
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.M(kz2, int, int, boolean):boolean");
    }

    public static X509Certificate[][] N(FileChannel fileChannel, sn1 sn1Var) throws CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferK0 = k0((ByteBuffer) sn1Var.d);
                int i2 = 0;
                while (byteBufferK0.hasRemaining()) {
                    i2++;
                    try {
                        arrayList.add(S(k0(byteBufferK0), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e2) {
                        throw new SecurityException(ga1.k(new StringBuilder(String.valueOf(i2).length() + 37), "Failed to parse/verify signer #", i2, " block"), e2);
                    }
                }
                if (i2 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j = sn1Var.a;
                long j2 = sn1Var.b;
                long j3 = sn1Var.c;
                ByteBuffer byteBuffer = (ByteBuffer) sn1Var.e;
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                rn1 rn1Var = new rn1(fileChannel, 0L, j);
                rn1 rn1Var2 = new rn1(fileChannel, j2, j3 - j2);
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                uk2.d0(byteBufferDuplicate);
                int iPosition = byteBufferDuplicate.position() + 16;
                if (j < 0 || j > 4294967295L) {
                    StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 27);
                    sb.append("uint32 value of out range: ");
                    sb.append(j);
                    throw new IllegalArgumentException(sb.toString());
                }
                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j);
                sq0 sq0Var = new sq0(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    iArr[i3] = ((Integer) it.next()).intValue();
                    i3++;
                }
                try {
                    byte[][] bArrW = W(iArr, new qn1[]{rn1Var, rn1Var2, sq0Var});
                    for (int i4 = 0; i4 < size; i4++) {
                        int i5 = iArr[i4];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i5)), bArrW[i4])) {
                            throw new SecurityException(a0(i5).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e3) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e3);
                }
            } catch (IOException e4) {
                throw new SecurityException("Failed to read list of signers", e4);
            }
        } catch (CertificateException e5) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e5);
        }
    }

    public static AbstractList O(List list, zk3 zk3Var) {
        return list != null ? new mn3(list, zk3Var) : new nn3(list, zk3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x025e, code lost:
    
        if (r8 == 67) goto L149;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.wh1 P(int r33, defpackage.kz2 r34, boolean r35, defpackage.us0 r36) {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.P(int, kz2, boolean, us0):wh1");
    }

    public static final void Q(byte[] bArr, String str, gd3 gd3Var) {
        if (gd3Var == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(System.getProperty("os.arch"));
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        gd3Var.d(sb.toString(), 4007);
    }

    public static boolean R() {
        return q0(2) && ((Boolean) u02.a.w()).booleanValue();
    }

    public static X509Certificate[] S(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferK0 = k0(byteBuffer);
        ByteBuffer byteBufferK02 = k0(byteBuffer);
        byte[] bArrM0 = m0(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrM02 = null;
        byte[] bArrM03 = null;
        int i2 = -1;
        int i3 = 0;
        while (byteBufferK02.hasRemaining()) {
            i3++;
            try {
                ByteBuffer byteBufferK03 = k0(byteBufferK02);
                if (byteBufferK03.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i4 = byteBufferK03.getInt();
                arrayList.add(Integer.valueOf(i4));
                if (i4 != 513 && i4 != 514 && i4 != 769) {
                    switch (i4) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i2 != -1) {
                    int iX = X(i4);
                    int iX2 = X(i2);
                    if (iX != 1 && iX2 == 1) {
                    }
                }
                bArrM03 = m0(byteBufferK03);
                i2 = i4;
            } catch (IOException e2) {
                e = e2;
                throw new SecurityException(ex0.j(new StringBuilder(String.valueOf(i3).length() + 34), "Failed to parse signature record #", i3), e);
            } catch (BufferUnderflowException e3) {
                e = e3;
                throw new SecurityException(ex0.j(new StringBuilder(String.valueOf(i3).length() + 34), "Failed to parse signature record #", i3), e);
            }
        }
        if (i2 == -1) {
            if (i3 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i2 == 513 || i2 == 514) {
            str = "EC";
        } else if (i2 != 769) {
            switch (i2) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i2))));
            }
        } else {
            str = "DSA";
        }
        if (i2 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i2 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i2 != 769) {
            switch (i2) {
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
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i2))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrM0));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferK0);
            if (!signature.verify(bArrM03)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferK0.clear();
            ByteBuffer byteBufferK04 = k0(byteBufferK0);
            ArrayList arrayList2 = new ArrayList();
            int i5 = 0;
            while (byteBufferK04.hasRemaining()) {
                i5++;
                try {
                    ByteBuffer byteBufferK05 = k0(byteBufferK04);
                    if (byteBufferK05.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i6 = byteBufferK05.getInt();
                    arrayList2.add(Integer.valueOf(i6));
                    if (i6 == i2) {
                        bArrM02 = m0(byteBufferK05);
                    }
                } catch (IOException e4) {
                    e = e4;
                    throw new IOException(ex0.j(new StringBuilder(String.valueOf(i5).length() + 31), "Failed to parse digest record #", i5), e);
                } catch (BufferUnderflowException e5) {
                    e = e5;
                    throw new IOException(ex0.j(new StringBuilder(String.valueOf(i5).length() + 31), "Failed to parse digest record #", i5), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iX3 = X(i2);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iX3), bArrM02);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrM02)) {
                throw new SecurityException(a0(iX3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferK06 = k0(byteBufferK0);
            ArrayList arrayList3 = new ArrayList();
            int i7 = 0;
            while (byteBufferK06.hasRemaining()) {
                i7++;
                byte[] bArrM04 = m0(byteBufferK06);
                try {
                    arrayList3.add(new un1((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrM04)), bArrM04));
                } catch (CertificateException e6) {
                    throw new SecurityException(ex0.j(new StringBuilder(String.valueOf(i7).length() + 30), "Failed to decode certificate #", i7), e6);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrM0, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e7) {
            e = e7;
            throw new SecurityException(ex0.l(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e8) {
            e = e8;
            throw new SecurityException(ex0.l(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e9) {
            e = e9;
            throw new SecurityException(ex0.l(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e10) {
            e = e10;
            throw new SecurityException(ex0.l(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e11) {
            e = e11;
            throw new SecurityException(ex0.l(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        }
    }

    public static sn3 T(byte[] bArr, int i2, int i3) {
        if (i3 >= bArr.length) {
            return xm3.i("");
        }
        vm3 vm3Var = xm3.g;
        ob1.z("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int iE0 = e0(bArr, i3, i2);
        int i4 = 0;
        while (i3 < iE0) {
            String str = new String(bArr, i3, iE0 - i3, Y(i2));
            int length = objArrCopyOf.length;
            int i5 = i4 + 1;
            int iD = rm3.d(length, i5);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i4] = str;
            i3 = j0(i2) + iE0;
            iE0 = e0(bArr, i3, i2);
            i4 = i5;
        }
        sn3 sn3VarO = xm3.o(objArrCopyOf, i4);
        return sn3VarO.isEmpty() ? xm3.i("") : sn3VarO;
    }

    public static void U(String str) {
        if (!q0(3) || str.length() <= 4000) {
            return;
        }
        sq0 sq0Var = g;
        Iterator itD = ((kl3) sq0Var.g).d(sq0Var, str);
        while (true) {
            jl3 jl3Var = (jl3) itD;
            if (!jl3Var.hasNext()) {
                return;
            }
        }
    }

    public static int V(int i2, kz2 kz2Var) {
        byte[] bArr = kz2Var.a;
        int i3 = kz2Var.b;
        int i4 = i3;
        while (true) {
            int i5 = i4 + 1;
            if (i5 >= i3 + i2) {
                return i2;
            }
            if ((bArr[i4] & 255) == 255 && bArr[i5] == 0) {
                System.arraycopy(bArr, i4 + 2, bArr, i5, (i2 - (i4 - i3)) - 2);
                i2--;
            }
            i4 = i5;
        }
    }

    public static byte[][] W(int[] iArr, qn1[] qn1VarArr) throws DigestException {
        long j;
        int i2;
        int length;
        char c2;
        int i3 = 0;
        long jA = 0;
        while (true) {
            j = 1048576;
            if (i3 >= 3) {
                break;
            }
            jA += (qn1VarArr[i3].a() + 1048575) / 1048576;
            i3++;
        }
        if (jA >= 2097151) {
            StringBuilder sb = new StringBuilder(String.valueOf(jA).length() + 17);
            sb.append("Too many chunks: ");
            sb.append(jA);
            throw new DigestException(sb.toString());
        }
        byte[][] bArr = new byte[iArr.length][];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            c2 = 5;
            if (i4 >= length) {
                break;
            }
            int i5 = (int) jA;
            byte[] bArr2 = new byte[(d0(iArr[i4]) * i5) + 5];
            bArr2[0] = 90;
            o0(i5, bArr2);
            bArr[i4] = bArr2;
            i4++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            String strA0 = a0(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(strA0);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(strA0.concat(" digest not supported"), e2);
            }
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (i2 = 3; i7 < i2; i2 = 3) {
            qn1 qn1Var = qn1VarArr[i7];
            int i10 = i7;
            long jA2 = qn1Var.a();
            long j2 = 0;
            while (jA2 > 0) {
                char c3 = c2;
                int i11 = i8;
                int iMin = (int) Math.min(jA2, j);
                o0(iMin, bArr3);
                for (int i12 = 0; i12 < length; i12++) {
                    messageDigestArr[i12].update(bArr3);
                }
                try {
                    qn1Var.g(messageDigestArr, j2, iMin);
                    int i13 = 0;
                    while (i13 < iArr.length) {
                        int i14 = iArr[i13];
                        byte[] bArr4 = bArr[i13];
                        int iD0 = d0(i14);
                        qn1 qn1Var2 = qn1Var;
                        MessageDigest messageDigest = messageDigestArr[i13];
                        long j3 = jA2;
                        int iDigest = messageDigest.digest(bArr4, (i11 * iD0) + 5, iD0);
                        if (iDigest != iD0) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(iDigest).length());
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(iDigest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i13++;
                        qn1Var = qn1Var2;
                        jA2 = j3;
                    }
                    qn1 qn1Var3 = qn1Var;
                    long j4 = iMin;
                    j2 += j4;
                    jA2 -= j4;
                    i8 = i11 + 1;
                    c2 = c3;
                    qn1Var = qn1Var3;
                    j = 1048576;
                } catch (IOException e3) {
                    throw new DigestException(ga1.l(new StringBuilder(String.valueOf(i11).length() + 37 + String.valueOf(i9).length()), "Failed to digest chunk #", i11, " of section #", i9), e3);
                }
            }
            i9++;
            i7 = i10 + 1;
            j = 1048576;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            byte[] bArr6 = bArr[i15];
            String strA02 = a0(i16);
            try {
                bArr5[i15] = MessageDigest.getInstance(strA02).digest(bArr6);
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(strA02.concat(" digest not supported"), e4);
            }
        }
        return bArr5;
    }

    public static int X(int i2) {
        if (i2 == 513) {
            return 1;
        }
        if (i2 == 514) {
            return 2;
        }
        if (i2 == 769) {
            return 1;
        }
        switch (i2) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i2))));
        }
    }

    public static Charset Y(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static void Z(String str) {
        if (!q0(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e("Ads", str);
            return;
        }
        sq0 sq0Var = g;
        Iterator itD = ((kl3) sq0Var.g).d(sq0Var, str);
        boolean z = true;
        while (true) {
            jl3 jl3Var = (jl3) itD;
            if (!jl3Var.hasNext()) {
                return;
            }
            String str2 = (String) jl3Var.next();
            if (z) {
                Log.e("Ads", str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z = false;
        }
    }

    public static void a(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        i30.m(th, "<this>");
        i30.m(th2, "exception");
        if (th != th2) {
            Integer num = q30.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = cl0.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static String a0(int i2) {
        if (i2 == 1) {
            return "SHA-256";
        }
        if (i2 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(ex0.j(new StringBuilder(String.valueOf(i2).length() + 33), "Unknown content digest algorthm: ", i2));
    }

    public static yn b(mj mjVar, hy hyVar) {
        boolean z = true;
        hk hkVarM = bd2.m(mjVar.b(), ls.f, true);
        on onVar = fp.a;
        if (hkVarM != onVar && hkVarM.h(pz.h) == null) {
            hkVarM = hkVarM.g(onVar);
        }
        yn ynVar = new yn(hkVarM, z, 0);
        ynVar.Q(tk.f, ynVar, hyVar);
        return ynVar;
    }

    public static String b0(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static void c(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
        if (i2 <= i3) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
    }

    public static void c0(String str, Throwable th) {
        if (q0(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static Bundle d(Parcel parcel, int i2) {
        int iX = x(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iX);
        return bundle;
    }

    public static int d0(int i2) {
        if (i2 == 1) {
            return 32;
        }
        if (i2 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(ex0.j(new StringBuilder(String.valueOf(i2).length() + 33), "Unknown content digest algorthm: ", i2));
    }

    public static byte[] e(Parcel parcel, int i2) {
        int iX = x(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iX);
        return bArrCreateByteArray;
    }

    public static int e0(byte[] bArr, int i2, int i3) {
        int iG0 = g0(i2, bArr);
        if (i3 == 0 || i3 == 3) {
            return iG0;
        }
        while (true) {
            int length = bArr.length;
            if (iG0 >= length - 1) {
                return length;
            }
            int i4 = iG0 + 1;
            if ((iG0 - i2) % 2 == 0 && bArr[i4] == 0) {
                return iG0;
            }
            iG0 = g0(i4, bArr);
        }
    }

    public static Parcelable f(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iX = x(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iX);
        return parcelable;
    }

    public static void f0(String str) {
        if (!q0(4) || str == null || str.length() <= 4000) {
            return;
        }
        sq0 sq0Var = g;
        Iterator itD = ((kl3) sq0Var.g).d(sq0Var, str);
        while (true) {
            jl3 jl3Var = (jl3) itD;
            if (!jl3Var.hasNext()) {
                return;
            }
        }
    }

    public static String g(Parcel parcel, int i2) {
        int iX = x(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iX);
        return string;
    }

    public static int g0(int i2, byte[] bArr) {
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                return length;
            }
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static String[] h(Parcel parcel, int i2) {
        int iX = x(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iX);
        return strArrCreateStringArray;
    }

    public static ByteBuffer h0(int i2, ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (i3 < iPosition || i3 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i3);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i3);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static ArrayList i(Parcel parcel, int i2) {
        int iX = x(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iX);
        return arrayListCreateStringArrayList;
    }

    public static void i0(String str) {
        if (!q0(5) || str == null || str.length() <= 4000) {
            return;
        }
        sq0 sq0Var = g;
        Iterator itD = ((kl3) sq0Var.g).d(sq0Var, str);
        while (true) {
            jl3 jl3Var = (jl3) itD;
            if (!jl3Var.hasNext()) {
                return;
            }
        }
    }

    public static Object[] j(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iX = x(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iX);
        return objArrCreateTypedArray;
    }

    public static int j0(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    public static void k(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            throw new rg(ex0.f("Overread allowed size end=", i2), parcel);
        }
    }

    public static ByteBuffer k0(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int iRemaining = byteBuffer.remaining();
            throw new IOException(ex0.j(new StringBuilder(String.valueOf(iRemaining).length() + 82), "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", iRemaining));
        }
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i2 <= byteBuffer.remaining()) {
            return h0(i2, byteBuffer);
        }
        int iRemaining2 = byteBuffer.remaining();
        throw new IOException(ga1.l(new StringBuilder(String.valueOf(i2).length() + 79 + String.valueOf(iRemaining2).length()), "Length-prefixed field longer than remaining buffer. Field length: ", i2, ", remaining: ", iRemaining2));
    }

    public static int l(Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    public static String l0(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(lineNumber).length());
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    public static t3 m(Context context, g4 g4Var) throws PackageManager.NameNotFoundException {
        Cursor cursorQuery;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) g4Var.g;
        String str2 = (String) g4Var.j;
        int i2 = 0;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
        }
        android.content.pm.Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (android.content.pm.Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        ha haVar = b;
        Collections.sort(arrayList, haVar);
        List listU = (List) g4Var.i;
        if (listU == null) {
            listU = um.u(resources, 0);
        }
        int i3 = 0;
        loop1: while (true) {
            cursorQuery = null;
            if (i3 >= listU.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listU.get(i3));
            Collections.sort(arrayList2, haVar);
            if (arrayList.size() == arrayList2.size()) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i4), (byte[]) arrayList2.get(i4))) {
                        break;
                    }
                }
                break loop1;
            }
            i3++;
        }
        int i5 = 1;
        if (providerInfoResolveContentProvider == null) {
            return new t3(i5, cursorQuery, 3);
        }
        String str3 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str3).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str3).appendPath("file").build();
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            String[] strArr2 = {(String) g4Var.h};
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                } catch (RemoteException unused) {
                }
            }
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorQuery.getColumnIndex("_id");
                int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                while (cursorQuery.moveToNext()) {
                    arrayList3.add(new wv(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0));
                }
            }
            return new t3(i2, (wv[]) arrayList3.toArray(new wv[0]), 3);
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
        }
    }

    public static byte[] m0(ByteBuffer byteBuffer) throws IOException {
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new IOException("Negative length");
        }
        if (i2 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i2];
            byteBuffer.get(bArr);
            return bArr;
        }
        int iRemaining = byteBuffer.remaining();
        throw new IOException(ga1.l(new StringBuilder(String.valueOf(i2).length() + 68 + String.valueOf(iRemaining).length()), "Underflow while reading length-prefixed value. Length: ", i2, ", available: ", iRemaining));
    }

    public static so1 n(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        so1 so1VarI;
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        Object obj = null;
        int i3 = 0;
        if (attributeValue != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28 && i4 <= 31) {
                return new so1(obj, obj, typedValue.data);
            }
            try {
                so1VarI = so1.i(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                so1VarI = null;
            }
            if (so1VarI != null) {
                return so1VarI;
            }
        }
        return new so1(obj, obj, i3);
    }

    public static String n0(byte[] bArr, int i2, int i3, Charset charset) {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, charset);
    }

    public static final void o(hk hkVar, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable runtimeException;
        Iterator it = mk.a.iterator();
        while (it.hasNext()) {
            try {
                ((x3) it.next()).k(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            a(th, new to(hkVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static void o0(int i2, byte[] bArr) {
        bArr[1] = (byte) (i2 & 255);
        bArr[2] = (byte) ((i2 >>> 8) & 255);
        bArr[3] = (byte) ((i2 >>> 16) & 255);
        bArr[4] = (byte) (i2 >> 24);
    }

    public static boolean p(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static void p0(String str, Exception exc) {
        if (q0(5)) {
            if (exc == null) {
                i0(l0(str));
            } else {
                l0(str);
                q0(5);
            }
        }
    }

    public static yn q(qk qkVar, hk hkVar, hy hyVar, int i2) {
        boolean z = true;
        if ((i2 & 1) != 0) {
            hkVar = ls.f;
        }
        hk hkVarM = bd2.m(qkVar.b(), hkVar, true);
        on onVar = fp.a;
        if (hkVarM != onVar && hkVarM.h(pz.h) == null) {
            hkVarM = hkVarM.g(onVar);
        }
        yn ynVar = new yn(hkVarM, z, 1);
        ynVar.Q(tk.f, ynVar, hyVar);
        return ynVar;
    }

    public static boolean q0(int i2) {
        return i2 >= 5 || Log.isLoggable("Ads", i2);
    }

    public static TypedArray r(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final Object s(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static boolean t(Parcel parcel, int i2) {
        L(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder u(Parcel parcel, int i2) {
        int iX = x(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iX);
        return strongBinder;
    }

    public static int v(Parcel parcel, int i2) {
        L(parcel, i2, 4);
        return parcel.readInt();
    }

    public static long w(Parcel parcel, int i2) {
        L(parcel, i2, 8);
        return parcel.readLong();
    }

    public static int x(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static void y(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + x(parcel, i2));
    }

    public static int z(Parcel parcel) {
        int i2 = parcel.readInt();
        int iX = x(parcel, i2);
        char c2 = (char) i2;
        int iDataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new rg("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i2))), parcel);
        }
        int i3 = iX + iDataPosition;
        if (i3 >= iDataPosition && i3 <= parcel.dataSize()) {
            return i3;
        }
        throw new rg("Size read is invalid start=" + iDataPosition + " end=" + i3, parcel);
    }

    public abstract mr3 D();
}
