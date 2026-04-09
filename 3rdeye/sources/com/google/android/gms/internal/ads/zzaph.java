package com.google.android.gms.internal.ads;

import N7.C1154e9;
import N7.H7;
import android.util.Pair;
import com.singular.sdk.internal.Constants;
import g0.C4356c;
import io.appmetrica.analytics.impl.Oo;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaph {
    public static X509Certificate[][] zza(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, Constants.REVENUE_AMOUNT_KEY);
        try {
            Pair pairZzc = zzapi.zzc(randomAccessFile2);
            try {
                if (pairZzc == null) {
                    throw new zzapd("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile2.length() + " bytes");
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairZzc.first;
                long jLongValue = ((Long) pairZzc.second).longValue();
                long j4 = jLongValue - 20;
                if (j4 >= 0) {
                    randomAccessFile2.seek(j4);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new zzapd("ZIP64 APK not supported");
                    }
                }
                long jZza = zzapi.zza(byteBuffer);
                if (jZza >= jLongValue) {
                    throw new zzapd("ZIP Central Directory offset out of range: " + jZza + ". ZIP End of Central Directory offset: " + jLongValue);
                }
                if (zzapi.zzb(byteBuffer) + jZza != jLongValue) {
                    throw new zzapd("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (jZza < 32) {
                    throw new zzapd("APK too small for APK Signing Block. ZIP Central Directory offset: " + jZza);
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                randomAccessFile2.seek(jZza - byteBufferAllocate.capacity());
                randomAccessFile2.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                    throw new zzapd("No APK Signing Block before ZIP Central Directory");
                }
                long j10 = byteBufferAllocate.getLong(0);
                if (j10 < byteBufferAllocate.capacity() || j10 > 2147483639) {
                    throw new zzapd("APK Signing Block size out of range: " + j10);
                }
                int i = (int) (8 + j10);
                long j11 = jZza - i;
                if (j11 < 0) {
                    throw new zzapd("APK Signing Block offset out of range: " + j11);
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
                byteBufferAllocate2.order(byteOrder);
                randomAccessFile2.seek(j11);
                randomAccessFile2.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                randomAccessFile = randomAccessFile2;
                long j12 = byteBufferAllocate2.getLong(0);
                if (j12 != j10) {
                    throw new zzapd("APK Signing Block sizes in header and footer do not match: " + j12 + " vs " + j10);
                }
                Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j11));
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
                    int i10 = 0;
                    while (byteBufferSlice.hasRemaining()) {
                        i10++;
                        if (byteBufferSlice.remaining() < 8) {
                            throw new zzapd("Insufficient data to read size of APK Signing Block entry #" + i10);
                        }
                        long j13 = byteBufferSlice.getLong();
                        if (j13 < 4 || j13 > 2147483647L) {
                            throw new zzapd("APK Signing Block entry #" + i10 + " size out of range: " + j13);
                        }
                        int i11 = (int) j13;
                        int iPosition2 = byteBufferSlice.position() + i11;
                        if (i11 > byteBufferSlice.remaining()) {
                            throw new zzapd("APK Signing Block entry #" + i10 + " size out of range: " + i11 + ", available: " + byteBufferSlice.remaining());
                        }
                        if (byteBufferSlice.getInt() == 1896449818) {
                            X509Certificate[][] x509CertificateArrZzl = zzl(randomAccessFile.getChannel(), new zzapc(zze(byteBufferSlice, i11 - 4), jLongValue2, jZza, jLongValue, byteBuffer, null));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return x509CertificateArrZzl;
                        }
                        long j14 = jLongValue2;
                        long j15 = jZza;
                        long j16 = jLongValue;
                        byteBufferSlice.position(iPosition2);
                        jLongValue = j16;
                        jZza = j15;
                        jLongValue2 = j14;
                    }
                    throw new zzapd("No APK Signature Scheme v2 block in APK Signing Block");
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

    private static int zzb(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException(C4356c.h(i, "Unknown content digest algorthm: "));
    }

    private static int zzc(int i) {
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

    private static String zzd(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(C4356c.h(i, "Unknown content digest algorthm: "));
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i10 = i + iPosition;
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

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(C4356c.h(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: "));
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return zze(byteBuffer, i);
        }
        throw new IOException(H7.n(i, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
    }

    private static void zzg(int i, byte[] bArr, int i10) {
        bArr[1] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[2] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[3] = (byte) ((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[4] = (byte) (i >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j4, long j10, long j11, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzapb zzapbVar = new zzapb(fileChannel, 0L, j4);
        zzapb zzapbVar2 = new zzapb(fileChannel, j10, j11 - j10);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzapi.zzd(byteBufferDuplicate, j4);
        zzaoz zzaozVar = new zzaoz(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        try {
            byte[][] bArrZzk = zzk(iArr, new zzapa[]{zzapbVar, zzapbVar2, zzaozVar});
            for (int i10 = 0; i10 < size; i10++) {
                int i11 = iArr[i10];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i11)), bArrZzk[i10])) {
                    throw new SecurityException(zzd(i11).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e4) {
            throw new SecurityException("Failed to compute digest(s) of contents", e4);
        }
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            throw new IOException(H7.n(i, byteBuffer.remaining(), "Underflow while reading length-prefixed value. Length: ", ", available: "));
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    private static X509Certificate[] zzj(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, SecurityException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferZzf = zzf(byteBuffer);
        ByteBuffer byteBufferZzf2 = zzf(byteBuffer);
        byte[] bArrZzi = zzi(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrZzi2 = null;
        byte[] bArrZzi3 = null;
        int i = -1;
        int i10 = 0;
        while (byteBufferZzf2.hasRemaining()) {
            i10++;
            try {
                ByteBuffer byteBufferZzf3 = zzf(byteBufferZzf2);
                if (byteBufferZzf3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i11 = byteBufferZzf3.getInt();
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
                if (i != -1) {
                    int iZzc = zzc(i11);
                    int iZzc2 = zzc(i);
                    if (iZzc != 1 && iZzc2 == 1) {
                    }
                }
                bArrZzi3 = zzi(byteBufferZzf3);
                i = i11;
            } catch (IOException e4) {
                e = e4;
                throw new SecurityException(C4356c.h(i10, "Failed to parse signature record #"), e);
            } catch (BufferUnderflowException e10) {
                e = e10;
                throw new SecurityException(C4356c.h(i10, "Failed to parse signature record #"), e);
            }
        }
        if (i == -1) {
            if (i10 == 0) {
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
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrZzi));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferZzf);
            if (!signature.verify(bArrZzi3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferZzf.clear();
            ByteBuffer byteBufferZzf4 = zzf(byteBufferZzf);
            ArrayList arrayList2 = new ArrayList();
            int i12 = 0;
            while (byteBufferZzf4.hasRemaining()) {
                i12++;
                try {
                    ByteBuffer byteBufferZzf5 = zzf(byteBufferZzf4);
                    if (byteBufferZzf5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i13 = byteBufferZzf5.getInt();
                    arrayList2.add(Integer.valueOf(i13));
                    if (i13 == i) {
                        bArrZzi2 = zzi(byteBufferZzf5);
                    }
                } catch (IOException e11) {
                    e = e11;
                    throw new IOException(C4356c.h(i12, "Failed to parse digest record #"), e);
                } catch (BufferUnderflowException e12) {
                    e = e12;
                    throw new IOException(C4356c.h(i12, "Failed to parse digest record #"), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iZzc3 = zzc(i);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iZzc3), bArrZzi2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrZzi2)) {
                throw new SecurityException(zzd(iZzc3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferZzf6 = zzf(byteBufferZzf);
            ArrayList arrayList3 = new ArrayList();
            int i14 = 0;
            while (byteBufferZzf6.hasRemaining()) {
                i14++;
                byte[] bArrZzi4 = zzi(byteBufferZzf6);
                try {
                    arrayList3.add(new zzape((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzi4)), bArrZzi4));
                } catch (CertificateException e13) {
                    throw new SecurityException(C4356c.h(i14, "Failed to decode certificate #"), e13);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrZzi, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e14) {
            e = e14;
            throw new SecurityException(C1154e9.i("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e15) {
            e = e15;
            throw new SecurityException(C1154e9.i("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e16) {
            e = e16;
            throw new SecurityException(C1154e9.i("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e17) {
            e = e17;
            throw new SecurityException(C1154e9.i("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e18) {
            e = e18;
            throw new SecurityException(C1154e9.i("Failed to verify ", str2, " signature"), e);
        }
    }

    private static byte[][] zzk(int[] iArr, zzapa[] zzapaVarArr) throws DigestException {
        long j4;
        int i;
        int length;
        char c10;
        int i10;
        String str;
        int i11 = 0;
        int i12 = 0;
        long jZza = 0;
        while (true) {
            j4 = 1048576;
            i = 3;
            if (i12 >= 3) {
                break;
            }
            jZza += (zzapaVarArr[i12].zza() + 1048575) / 1048576;
            i12++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(Oo.d(jZza, "Too many chunks: "));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i13 = 0;
        while (true) {
            length = iArr.length;
            c10 = 5;
            i10 = 1;
            if (i13 >= length) {
                break;
            }
            int i14 = (int) jZza;
            byte[] bArr2 = new byte[(zzb(iArr[i13]) * i14) + 5];
            bArr2[0] = 90;
            zzg(i14, bArr2, 1);
            bArr[i13] = bArr2;
            i13++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i15 = 0;
        while (true) {
            str = " digest not supported";
            if (i15 >= iArr.length) {
                break;
            }
            String strZzd = zzd(iArr[i15]);
            try {
                messageDigestArr[i15] = MessageDigest.getInstance(strZzd);
                i15++;
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(strZzd.concat(" digest not supported"), e4);
            }
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < i) {
            zzapa zzapaVar = zzapaVarArr[i16];
            int i18 = i16;
            long jZza2 = zzapaVar.zza();
            byte[][] bArr4 = bArr;
            long j10 = 0;
            while (jZza2 > 0) {
                int i19 = i17;
                String str2 = str;
                int iMin = (int) Math.min(jZza2, j4);
                zzg(iMin, bArr3, i10);
                for (int i20 = 0; i20 < length; i20++) {
                    messageDigestArr[i20].update(bArr3);
                }
                try {
                    zzapaVar.zzb(messageDigestArr, j10, iMin);
                    int i21 = 0;
                    while (i21 < iArr.length) {
                        int i22 = iArr[i21];
                        byte[] bArr5 = bArr4[i21];
                        int iZzb = zzb(i22);
                        char c11 = c10;
                        MessageDigest messageDigest = messageDigestArr[i21];
                        int iDigest = messageDigest.digest(bArr5, (i19 * iZzb) + 5, iZzb);
                        if (iDigest != iZzb) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i21++;
                        c10 = c11;
                    }
                    long j11 = iMin;
                    j10 += j11;
                    jZza2 -= j11;
                    i17 = i19 + 1;
                    str = str2;
                    j4 = 1048576;
                    i10 = 1;
                } catch (IOException e10) {
                    throw new DigestException(H7.n(i19, i11, "Failed to digest chunk #", " of section #"), e10);
                }
            }
            i11++;
            i16 = i18 + 1;
            bArr = bArr4;
            j4 = 1048576;
            i = 3;
            i10 = 1;
        }
        byte[][] bArr6 = bArr;
        String str3 = str;
        byte[][] bArr7 = new byte[iArr.length][];
        for (int i23 = 0; i23 < iArr.length; i23++) {
            int i24 = iArr[i23];
            byte[] bArr8 = bArr6[i23];
            String strZzd2 = zzd(i24);
            try {
                bArr7[i23] = MessageDigest.getInstance(strZzd2).digest(bArr8);
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(strZzd2.concat(str3), e11);
            }
        }
        return bArr7;
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzapc zzapcVar) throws SecurityException, CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferZzf = zzf(zzapcVar.zza);
                int i = 0;
                while (byteBufferZzf.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzj(zzf(byteBufferZzf), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e4) {
                        throw new SecurityException(C4356c.i(i, "Failed to parse/verify signer #", " block"), e4);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                zzh(map, fileChannel, zzapcVar.zzb, zzapcVar.zzc, zzapcVar.zzd, zzapcVar.zze);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e10) {
                throw new SecurityException("Failed to read list of signers", e10);
            }
        } catch (CertificateException e11) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e11);
        }
    }
}
