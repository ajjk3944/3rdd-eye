package a;

import A.f;
import A0.e;
import B4.g;
import G3.y;
import U0.b;
import U0.c;
import U0.d;
import U0.m;
import a4.p;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import b4.C0336a;
import b4.C0352q;
import b4.C0354s;
import b4.C0355t;
import b4.C0356u;
import b4.InterfaceC0343h;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.C1448kw;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.MA;
import com.google.android.gms.internal.ads.Px;
import com.google.android.gms.internal.ads.Qx;
import com.google.android.gms.internal.ads.Rx;
import com.lefan.signal.MyApplication;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.j;
import q0.C2789b;
import q0.v;
import q0.x;
import q2.C2841s;
import q5.i;
import u2.k;
import x5.h;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0241a {

    /* renamed from: a, reason: collision with root package name */
    public static long f4541a = 30000;

    /* renamed from: b, reason: collision with root package name */
    public static e f4542b;

    public static void A(Context context) throws IOException {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.W6)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            Px pxF = Px.f(context);
            Qx qxF = Qx.f(context);
            Rx rxH = Rx.h(context);
            pxF.h();
            synchronized (Px.class) {
                pxF.c(true);
            }
            qxF.h();
            rxH.c();
        } catch (IOException e6) {
            j.f22785C.f22795h.f("clearStorageOnIdlessMode", e6);
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e7) {
            j.f22785C.f22795h.f("clearStorageOnIdlessMode_scar", e7);
        }
    }

    public static void B(Parcel parcel, int i, int i3) {
        parcel.writeInt(i | (i3 << 16));
    }

    public static X509Certificate[][] C(String str) throws IOException {
        Pair pairB;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                pairB = null;
            } else {
                pairB = p.B(randomAccessFile, 0);
                if (pairB == null) {
                    pairB = p.B(randomAccessFile, 65535);
                }
            }
            if (pairB == null) {
                throw new C0355t("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairB.first;
            long jLongValue = ((Long) pairB.second).longValue();
            long j6 = jLongValue - 20;
            if (j6 >= 0) {
                randomAccessFile.seek(j6);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new C0355t("ZIP64 APK not supported");
                }
            }
            p.E(byteBuffer);
            long j7 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
            if (j7 >= jLongValue) {
                throw new C0355t("ZIP Central Directory offset out of range: " + j7 + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            p.E(byteBuffer);
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j7 != jLongValue) {
                throw new C0355t("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j7 < 32) {
                throw new C0355t("APK too small for APK Signing Block. ZIP Central Directory offset: " + j7);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(j7 - byteBufferAllocate.capacity());
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new C0355t("No APK Signing Block before ZIP Central Directory");
            }
            long j8 = byteBufferAllocate.getLong(0);
            if (j8 < byteBufferAllocate.capacity() || j8 > 2147483639) {
                throw new C0355t("APK Signing Block size out of range: " + j8);
            }
            int i = (int) (j8 + 8);
            long j9 = j7 - i;
            if (j9 < 0) {
                throw new C0355t("APK Signing Block offset out of range: " + j9);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j9);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j10 = byteBufferAllocate2.getLong(0);
            if (j10 != j8) {
                throw new C0355t("APK Signing Block sizes in header and footer do not match: " + j10 + " vs " + j8);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j9));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
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
                        throw new C0355t("Insufficient data to read size of APK Signing Block entry #" + i3);
                    }
                    long j11 = byteBufferSlice.getLong();
                    if (j11 < 4 || j11 > 2147483647L) {
                        throw new C0355t("APK Signing Block entry #" + i3 + " size out of range: " + j11);
                    }
                    int i6 = (int) j11;
                    int iPosition2 = byteBufferSlice.position() + i6;
                    if (i6 > byteBufferSlice.remaining()) {
                        throw new C0355t("APK Signing Block entry #" + i3 + " size out of range: " + i6 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrP = P(randomAccessFile.getChannel(), new C0354s(J(byteBufferSlice, i6 - 4), jLongValue2, j7, jLongValue, byteBuffer));
                        randomAccessFile.close();
                        return x509CertificateArrP;
                    }
                    long j12 = j7;
                    long j13 = jLongValue2;
                    ByteBuffer byteBuffer3 = byteBuffer;
                    long j14 = jLongValue;
                    byteBufferSlice.position(iPosition2);
                    j7 = j12;
                    jLongValue2 = j13;
                    jLongValue = j14;
                    byteBuffer = byteBuffer3;
                }
                throw new C0355t("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th;
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int D(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException(AbstractC1135f5.l(i, "Unknown content digest algorthm: "));
    }

    public static int E(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static Bundle F(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e6) {
                k.d("JSON parsing error", e6);
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            int i3 = iOptInt != 0 ? iOptInt != 1 ? iOptInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i3 != 0) {
                List listJ = C1448kw.f(new MA('/')).j(strOptString2);
                if (listJ.size() > 2 || listJ.isEmpty()) {
                    obj = null;
                } else {
                    if (listJ.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listJ.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listJ.get(0), 0);
                        str2 = (String) listJ.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i6 = i3 - 1;
                    if (i6 != 0) {
                        if (i6 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static int G(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
        }
    }

    public static void H(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static String I(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(AbstractC1135f5.l(i, "Unknown content digest algorthm: "));
    }

    public static ByteBuffer J(ByteBuffer byteBuffer, int i) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i3 = i + iPosition;
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

    public static ByteBuffer K(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(AbstractC1135f5.l(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: "));
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return J(byteBuffer, i);
        }
        throw new IOException(f.g(i, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
    }

    public static void L(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static byte[] M(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            throw new IOException(f.g(i, byteBuffer.remaining(), "Underflow while reading length-prefixed value. Length: ", ", available: "));
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static X509Certificate[] N(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferK = K(byteBuffer);
        ByteBuffer byteBufferK2 = K(byteBuffer);
        byte[] bArrM = M(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrM2 = null;
        byte[] bArrM3 = null;
        int i = -1;
        int i3 = 0;
        while (byteBufferK2.hasRemaining()) {
            i3++;
            try {
                ByteBuffer byteBufferK3 = K(byteBufferK2);
                if (byteBufferK3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i6 = byteBufferK3.getInt();
                arrayList.add(Integer.valueOf(i6));
                if (i6 != 513 && i6 != 514 && i6 != 769) {
                    switch (i6) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i != -1) {
                    int iG = G(i6);
                    int iG2 = G(i);
                    if (iG != 1 && iG2 == 1) {
                    }
                }
                bArrM3 = M(byteBufferK3);
                i = i6;
            } catch (IOException e6) {
                e = e6;
                throw new SecurityException(AbstractC1135f5.l(i3, "Failed to parse signature record #"), e);
            } catch (BufferUnderflowException e7) {
                e = e7;
                throw new SecurityException(AbstractC1135f5.l(i3, "Failed to parse signature record #"), e);
            }
        }
        if (i == -1) {
            if (i3 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
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
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrM));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferK);
            if (!signature.verify(bArrM3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferK.clear();
            ByteBuffer byteBufferK4 = K(byteBufferK);
            ArrayList arrayList2 = new ArrayList();
            int i7 = 0;
            while (byteBufferK4.hasRemaining()) {
                i7++;
                try {
                    ByteBuffer byteBufferK5 = K(byteBufferK4);
                    if (byteBufferK5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i8 = byteBufferK5.getInt();
                    arrayList2.add(Integer.valueOf(i8));
                    if (i8 == i) {
                        bArrM2 = M(byteBufferK5);
                    }
                } catch (IOException e8) {
                    e = e8;
                    throw new IOException(AbstractC1135f5.l(i7, "Failed to parse digest record #"), e);
                } catch (BufferUnderflowException e9) {
                    e = e9;
                    throw new IOException(AbstractC1135f5.l(i7, "Failed to parse digest record #"), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iG3 = G(i);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iG3), bArrM2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrM2)) {
                throw new SecurityException(I(iG3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferK6 = K(byteBufferK);
            ArrayList arrayList3 = new ArrayList();
            int i9 = 0;
            while (byteBufferK6.hasRemaining()) {
                i9++;
                byte[] bArrM4 = M(byteBufferK6);
                try {
                    arrayList3.add(new C0356u((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrM4)), bArrM4, 0));
                } catch (CertificateException e10) {
                    throw new SecurityException(AbstractC1135f5.l(i9, "Failed to decode certificate #"), e10);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrM, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e11) {
            e = e11;
            throw new SecurityException(f.m("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e12) {
            e = e12;
            throw new SecurityException(f.m("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            throw new SecurityException(f.m("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e14) {
            e = e14;
            throw new SecurityException(f.m("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e15) {
            e = e15;
            throw new SecurityException(f.m("Failed to verify ", str2, " signature"), e);
        }
    }

    public static byte[][] O(int[] iArr, InterfaceC0343h[] interfaceC0343hArr) throws DigestException {
        long j6;
        int i;
        int length;
        char c6;
        int i3 = 0;
        long jA = 0;
        while (true) {
            j6 = 1048576;
            if (i3 >= 3) {
                break;
            }
            jA += (interfaceC0343hArr[i3].a() + 1048575) / 1048576;
            i3++;
        }
        if (jA >= 2097151) {
            throw new DigestException("Too many chunks: " + jA);
        }
        byte[][] bArr = new byte[iArr.length][];
        int i6 = 0;
        while (true) {
            length = iArr.length;
            c6 = 5;
            if (i6 >= length) {
                break;
            }
            int i7 = (int) jA;
            byte[] bArr2 = new byte[(D(iArr[i6]) * i7) + 5];
            bArr2[0] = 90;
            L(i7, bArr2);
            bArr[i6] = bArr2;
            i6++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            String strI = I(iArr[i8]);
            try {
                messageDigestArr[i8] = MessageDigest.getInstance(strI);
            } catch (NoSuchAlgorithmException e6) {
                throw new RuntimeException(strI.concat(" digest not supported"), e6);
            }
        }
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (i = 3; i9 < i; i = 3) {
            InterfaceC0343h interfaceC0343h = interfaceC0343hArr[i9];
            int i12 = i9;
            long jA2 = interfaceC0343h.a();
            long j7 = 0;
            while (jA2 > 0) {
                char c7 = c6;
                int i13 = i10;
                int iMin = (int) Math.min(jA2, j6);
                L(iMin, bArr3);
                for (int i14 = 0; i14 < length; i14++) {
                    messageDigestArr[i14].update(bArr3);
                }
                try {
                    interfaceC0343h.g(messageDigestArr, j7, iMin);
                    int i15 = 0;
                    while (i15 < iArr.length) {
                        int i16 = iArr[i15];
                        byte[] bArr4 = bArr[i15];
                        int iD = D(i16);
                        InterfaceC0343h interfaceC0343h2 = interfaceC0343h;
                        MessageDigest messageDigest = messageDigestArr[i15];
                        long j8 = jA2;
                        int iDigest = messageDigest.digest(bArr4, (i13 * iD) + 5, iD);
                        if (iDigest != iD) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i15++;
                        interfaceC0343h = interfaceC0343h2;
                        jA2 = j8;
                    }
                    InterfaceC0343h interfaceC0343h3 = interfaceC0343h;
                    long j9 = iMin;
                    j7 += j9;
                    i10 = i13 + 1;
                    jA2 -= j9;
                    c6 = c7;
                    interfaceC0343h = interfaceC0343h3;
                    j6 = 1048576;
                } catch (IOException e7) {
                    throw new DigestException(f.g(i13, i11, "Failed to digest chunk #", " of section #"), e7);
                }
            }
            i11++;
            i9 = i12 + 1;
            j6 = 1048576;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i17 = 0; i17 < iArr.length; i17++) {
            int i18 = iArr[i17];
            byte[] bArr6 = bArr[i17];
            String strI2 = I(i18);
            try {
                bArr5[i17] = MessageDigest.getInstance(strI2).digest(bArr6);
            } catch (NoSuchAlgorithmException e8) {
                throw new RuntimeException(strI2.concat(" digest not supported"), e8);
            }
        }
        return bArr5;
    }

    public static X509Certificate[][] P(FileChannel fileChannel, C0354s c0354s) throws CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferK = K((ByteBuffer) c0354s.f5767a);
                int i = 0;
                while (byteBufferK.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(N(K(byteBufferK), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e6) {
                        throw new SecurityException(f.h(i, "Failed to parse/verify signer #", " block"), e6);
                    }
                }
                if (i <= 0) {
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
                C0352q c0352q = new C0352q(fileChannel, 0L, j6, 0);
                C0352q c0352q2 = new C0352q(fileChannel, j7, j8 - j7, 0);
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                p.E(byteBufferDuplicate);
                int iPosition = byteBufferDuplicate.position() + 16;
                if (j6 < 0 || j6 > 4294967295L) {
                    throw new IllegalArgumentException("uint32 value of out range: " + j6);
                }
                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j6);
                C0336a c0336a = new C0336a(byteBufferDuplicate, 0);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    iArr[i3] = ((Integer) it.next()).intValue();
                    i3++;
                }
                try {
                    byte[][] bArrO = O(iArr, new InterfaceC0343h[]{c0352q, c0352q2, c0336a});
                    for (int i6 = 0; i6 < size; i6++) {
                        int i7 = iArr[i6];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i7)), bArrO[i6])) {
                            throw new SecurityException(I(i7).concat(" digest of contents did not verify"));
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

    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                com.bumptech.glide.e.b(th, th2);
            }
        }
    }

    public static v b(x xVar) {
        i.e(xVar, "<this>");
        Iterator it = h.L(xVar.h(xVar.f23049l, true), C2789b.f22952h).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (v) next;
    }

    public static Set d() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static float[] e(String str) {
        switch (str.hashCode()) {
            case -1451586504:
                if (str.equals("tdscdma")) {
                    return new float[]{-120.0f, -110.0f, -97.0f, -73.0f, -49.0f, -24.0f};
                }
                break;
            case 3524:
                if (str.equals("nr")) {
                    return new float[]{-140.0f, -110.0f, -90.0f, -80.0f, -65.0f, -44.0f};
                }
                break;
            case 102657:
                if (str.equals("gsm")) {
                    return new float[]{-113.0f, -107.0f, -103.0f, -97.0f, -89.0f, -51.0f};
                }
                break;
            case 107485:
                if (str.equals("lte")) {
                    return new float[]{-140.0f, -115.0f, -105.0f, -95.0f, -85.0f, -43.0f};
                }
                break;
            case 3048885:
                if (str.equals("cdma")) {
                    return new float[]{-120.0f, -100.0f, -95.0f, -85.0f, -75.0f, 0.0f};
                }
                break;
            case 112947884:
                if (str.equals("wcdma")) {
                    return new float[]{-120.0f, -115.0f, -105.0f, -95.0f, -85.0f, -24.0f};
                }
                break;
        }
        return new float[]{-113.0f, -107.0f, -103.0f, -97.0f, -89.0f, -51.0f};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0241a.f(int, java.lang.String):int");
    }

    public static boolean j(Context context, String str) {
        Window window;
        View decorView;
        if (context != null) {
            if (System.currentTimeMillis() - context.getSharedPreferences("sp", 0).getLong(str, 0L) < 0) {
                System.out.println((Object) "日志：时间差超出，不能展示广告".concat(str));
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - context.getSharedPreferences("sp", 0).getLong("my_reword_points_time", 0L) < 3600000) {
                f4541a = 100000L;
                return false;
            }
            int i = context.getSharedPreferences("sp", 0).getInt("my_reword_points", 10);
            if (i < 10) {
                return true;
            }
            f4541a = 100000L;
            com.bumptech.glide.e.y(context, "my_reword_points_time", jCurrentTimeMillis);
            SharedPreferences sharedPreferences = context.getSharedPreferences("sp", 0);
            i.b(sharedPreferences);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt("my_reword_points", i - 10);
            editorEdit.apply();
            long j6 = jCurrentTimeMillis + 3600000;
            com.bumptech.glide.e.y(context, "Banner_ad_pair", j6);
            com.bumptech.glide.e.y(context, "Native_ad_pair", j6);
            com.bumptech.glide.e.y(context, "Insert_ad_pair", j6);
            e eVar = f4542b;
            if (eVar != null) {
                Activity activityF = p.f(context);
                boolean zK = com.bumptech.glide.e.k(context, "isAlwaysShowAdFreeDialog", true);
                MyApplication myApplication = (MyApplication) eVar.f73b;
                if (activityF != null && (window = activityF.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    J3.k kVarF = J3.k.f(decorView, myApplication.getString(R.string.ad_free_auto_exchange_success), zK ? -2 : -1);
                    kVarF.g(myApplication.getString(R.string.action_look), new g(5, activityF));
                    kVarF.h();
                }
            }
        }
        return false;
    }

    public static boolean k(String str) {
        b bVar = m.f3679a;
        Set<d> setUnmodifiableSet = Collections.unmodifiableSet(c.f3667c);
        HashSet hashSet = new HashSet();
        for (d dVar : setUnmodifiableSet) {
            if (((c) dVar).f3668a.equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c cVar = (c) ((d) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public static void l(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e6) {
                p(cls, e6);
                throw null;
            } catch (InstantiationException e7) {
                p(cls, e7);
                throw null;
            } catch (NoSuchMethodException e8) {
                p(cls, e8);
                throw null;
            } catch (InvocationTargetException e9) {
                p(cls, e9);
                throw null;
            }
        } catch (ClassNotFoundException e10) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m(android.content.Context r5, java.lang.String r6) {
        /*
            if (r5 != 0) goto L3
            return
        L3:
            long r0 = java.lang.System.currentTimeMillis()
            int r2 = r6.hashCode()
            r3 = -1832897661(0xffffffff92c03383, float:-1.2129602E-27)
            if (r2 == r3) goto L35
            r3 = 540993902(0x203ee96e, float:1.6170861E-19)
            if (r2 == r3) goto L28
            r3 = 1462344208(0x57299a10, float:1.8647916E14)
            if (r2 == r3) goto L1b
            goto L3d
        L1b:
            java.lang.String r2 = "Insert_ad_pair"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L24
            goto L3d
        L24:
            r2 = 900000(0xdbba0, double:4.44659E-318)
            goto L43
        L28:
            java.lang.String r2 = "Native_ad_pair"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L31
            goto L3d
        L31:
            r2 = 180000(0x2bf20, double:8.8932E-319)
            goto L43
        L35:
            java.lang.String r2 = "Banner_ad_pair"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L40
        L3d:
            r2 = 0
            goto L43
        L40:
            r2 = 360000(0x57e40, double:1.778636E-318)
        L43:
            long r0 = r0 + r2
            java.lang.String r2 = "sp"
            r3 = 0
            android.content.SharedPreferences r4 = r5.getSharedPreferences(r2, r3)
            q5.i.b(r4)
            android.content.SharedPreferences$Editor r4 = r4.edit()
            r4.putLong(r6, r0)
            r4.apply()
            java.lang.String r0 = "_show"
            java.lang.String r6 = r6.concat(r0)
            java.lang.String r0 = "key"
            q5.i.e(r6, r0)
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r2, r3)
            q5.i.b(r5)
            android.content.SharedPreferences$Editor r5 = r5.edit()
            r5.putInt(r6, r3)
            r5.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0241a.m(android.content.Context, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void n(android.content.Context r7, java.lang.String r8) {
        /*
            if (r7 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "_show"
            java.lang.String r1 = r8.concat(r0)
            java.lang.String r2 = "key"
            q5.i.e(r1, r2)
            java.lang.String r3 = "sp"
            r4 = 0
            android.content.SharedPreferences r5 = r7.getSharedPreferences(r3, r4)
            int r1 = r5.getInt(r1, r4)
            int r1 = r1 + 1
            int r5 = r8.hashCode()
            r6 = -1832897661(0xffffffff92c03383, float:-1.2129602E-27)
            if (r5 == r6) goto L46
            r6 = 540993902(0x203ee96e, float:1.6170861E-19)
            if (r5 == r6) goto L3a
            r6 = 1462344208(0x57299a10, float:1.8647916E14)
            if (r5 == r6) goto L2f
            goto L4b
        L2f:
            java.lang.String r5 = "Insert_ad_pair"
            boolean r5 = r8.equals(r5)
            if (r5 != 0) goto L38
            goto L4b
        L38:
            r5 = 3
            goto L4c
        L3a:
            java.lang.String r5 = "Native_ad_pair"
            boolean r5 = r8.equals(r5)
            if (r5 != 0) goto L43
            goto L4b
        L43:
            r5 = 10
            goto L4c
        L46:
            java.lang.String r5 = "Banner_ad_pair"
            r8.equals(r5)
        L4b:
            r5 = 5
        L4c:
            if (r1 <= r5) goto L52
            m(r7, r8)
            return
        L52:
            java.lang.String r8 = r8.concat(r0)
            q5.i.e(r8, r2)
            android.content.SharedPreferences r7 = r7.getSharedPreferences(r3, r4)
            q5.i.b(r7)
            android.content.SharedPreferences$Editor r7 = r7.edit()
            r7.putInt(r8, r1)
            r7.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0241a.n(android.content.Context, java.lang.String):void");
    }

    public static final void o(View view, F0.g gVar) {
        i.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, gVar);
    }

    public static void p(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public static void q(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iE = E(parcel, i);
        parcel.writeBundle(bundle);
        H(parcel, iE);
    }

    public static void r(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iE = E(parcel, i);
        parcel.writeByteArray(bArr);
        H(parcel, iE);
    }

    public static void s(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iE = E(parcel, i);
        parcel.writeStrongBinder(iBinder);
        H(parcel, iE);
    }

    public static void t(Parcel parcel, int i, Parcelable parcelable, int i3) {
        if (parcelable == null) {
            return;
        }
        int iE = E(parcel, i);
        parcelable.writeToParcel(parcel, i3);
        H(parcel, iE);
    }

    public static void u(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iE = E(parcel, i);
        parcel.writeString(str);
        H(parcel, iE);
    }

    public static void v(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iE = E(parcel, i);
        parcel.writeStringArray(strArr);
        H(parcel, iE);
    }

    public static void w(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iE = E(parcel, i);
        parcel.writeStringList(list);
        H(parcel, iE);
    }

    public static void x(Parcel parcel, int i, Parcelable[] parcelableArr, int i3) {
        if (parcelableArr == null) {
            return;
        }
        int iE = E(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i3);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        H(parcel, iE);
    }

    public static void y(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iE = E(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) list.get(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        H(parcel, iE);
    }

    public static void z(int i, Object[] objArr) {
        for (int i3 = 0; i3 < i; i3++) {
            if (objArr[i3] == null) {
                throw new NullPointerException(f.i(i3, "at index ", new StringBuilder(String.valueOf(i3).length() + 9)));
            }
        }
    }

    public abstract void c(y yVar, float f2, float f5);

    public abstract int g(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int h();

    public abstract ViewPropertyAnimator i(int i, View view);
}
