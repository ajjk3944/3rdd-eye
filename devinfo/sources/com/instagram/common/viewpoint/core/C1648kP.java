package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.facebook.ads.redexgen.X.kP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1648kP implements InterfaceC0676Mh {
    public static byte[] A07;
    public static String[] A08 = {"F3MsLf6P", "OcoAPMR8U6yTwuATNsSjihct3nuq8KFx", "bdE6GcC1kS6ix1fgAcoyQkC9rv", "V0wqj6Me", "EdnIrf", "cKhO3MBZMfPQ2uYBFx142UbqGZ0vcEvq", "x8zWNoAeDf", "YEiR7yHxtXFy2pC0Q9KvxgBtY"};
    public C0683Mo A00;
    public boolean A01;
    public final AnonymousClass40 A02;
    public final SecureRandom A03;
    public final Cipher A04;
    public final SecretKeySpec A05;
    public final boolean A06;

    public static String A02(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i4, i4 + i10);
        int i12 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A08;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "SFj9nJw9GR";
            strArr2[4] = "liv3w1";
            if (i12 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 117);
            i12++;
        }
    }

    public static void A03() {
        A07 = new byte[]{11, 15, 29};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A05(HashMap<String, C0675Mg> map) throws IOException {
        try {
            C02213z c02213zA03 = this.A02.A03();
            if (this.A00 == null) {
                this.A00 = new C0683Mo(c02213zA03);
            } else {
                this.A00.A00(c02213zA03);
            }
            C0683Mo c0683Mo = this.A00;
            DataOutputStream dataOutputStream = new DataOutputStream(c0683Mo);
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(this.A06 ? 1 : 0);
            if (this.A06) {
                byte[] bArr = new byte[16];
                ((SecureRandom) C5C.A0f(this.A03)).nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    ((Cipher) C5C.A0f(this.A04)).init(1, (Key) C5C.A0f(this.A05), new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(c0683Mo, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                    throw new IllegalStateException(e2);
                }
            }
            dataOutputStream.writeInt(map.size());
            int iA00 = 0;
            for (C0675Mg c0675Mg : map.values()) {
                A04(c0675Mg, dataOutputStream);
                iA00 += A00(c0675Mg, 2);
            }
            dataOutputStream.writeInt(iA00);
            this.A02.A06(dataOutputStream);
            C5C.A10(null);
        } catch (Throwable th2) {
            C5C.A10(null);
            throw th2;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A06(HashMap<String, C0675Mg> map, SparseArray<String> sparseArray) throws IOException {
        if (!this.A02.A07()) {
            return true;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.A02.A04());
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            int i4 = dataInputStream.readInt();
            if (i4 < 0 || i4 > 2) {
                C5C.A10(dataInputStream);
                return false;
            }
            if ((dataInputStream.readInt() & 1) != 0) {
                if (this.A04 == null) {
                    C5C.A10(dataInputStream);
                    return false;
                }
                byte[] bArr = new byte[16];
                dataInputStream.readFully(bArr);
                try {
                    this.A04.init(2, (Key) C5C.A0f(this.A05), new IvParameterSpec(bArr));
                    dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                    throw new IllegalStateException(e2);
                }
            } else if (this.A06) {
                this.A01 = true;
            }
            int i10 = dataInputStream.readInt();
            int iA00 = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                C0675Mg c0675MgA01 = A01(i4, dataInputStream);
                map.put(c0675MgA01.A02, c0675MgA01);
                sparseArray.put(c0675MgA01.A01, c0675MgA01.A02);
                iA00 += A00(c0675MgA01, i4);
            }
            int i12 = dataInputStream.readInt();
            boolean z3 = dataInputStream.read() == -1;
            if (i12 == iA00 && z3) {
                C5C.A10(dataInputStream);
                return true;
            }
            C5C.A10(dataInputStream);
            return false;
        } catch (IOException unused) {
            if (0 != 0) {
                C5C.A10(null);
            }
            return false;
        } catch (Throwable th2) {
            if (0 != 0) {
                C5C.A10(null);
            }
            throw th2;
        }
    }

    static {
        A03();
    }

    public C1648kP(File file, byte[] bArr, boolean z3) {
        AbstractC02203y.A08((bArr == null && z3) ? false : true);
        Cipher cipherA05 = null;
        SecretKeySpec secretKeySpec = null;
        if (bArr != null) {
            AbstractC02203y.A07(bArr.length == 16);
            try {
                cipherA05 = C0677Mi.A05();
                secretKeySpec = new SecretKeySpec(bArr, A02(0, 3, 85));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
                throw new IllegalStateException(e2);
            }
        } else {
            AbstractC02203y.A07(!z3);
        }
        this.A06 = z3;
        this.A04 = cipherA05;
        this.A05 = secretKeySpec;
        this.A03 = z3 ? new SecureRandom() : null;
        this.A02 = new AnonymousClass40(file);
    }

    private int A00(C0675Mg c0675Mg, int i4) {
        int result = c0675Mg.A01;
        int i10 = result * 31;
        int result2 = c0675Mg.A02.hashCode();
        int result3 = i10 + result2;
        if (i4 < 2) {
            long jA00 = AbstractC0678Mj.A00(c0675Mg.A03());
            return (result3 * 31) + ((int) ((jA00 >>> 32) ^ jA00));
        }
        return (result3 * 31) + c0675Mg.A03().hashCode();
    }

    private C0675Mg A01(int i4, DataInputStream dataInputStream) throws IOException {
        C1646kN c1646kNA02;
        int i10 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i4 >= 2) {
            c1646kNA02 = C0677Mi.A02(dataInputStream);
        } else {
            long length = dataInputStream.readLong();
            C0680Ml c0680Ml = new C0680Ml();
            C0680Ml.A00(c0680Ml, length);
            c1646kNA02 = C1646kN.A03.A05(c0680Ml);
        }
        return new C0675Mg(i10, utf, c1646kNA02);
    }

    private void A04(C0675Mg c0675Mg, DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(c0675Mg.A01);
        dataOutputStream.writeUTF(c0675Mg.A02);
        C0677Mi.A08(c0675Mg.A03(), dataOutputStream);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Mh
    public final void A5p() {
        this.A02.A05();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Mh
    public final boolean A6S() {
        return this.A02.A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Mh
    public final void AAF(long j) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Mh
    public final void AAs(HashMap<String, C0675Mg> map, SparseArray<String> sparseArray) {
        AbstractC02203y.A08(!this.A01);
        if (!A06(map, sparseArray)) {
            map.clear();
            String[] strArr = A08;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A08[7] = "LXlnn5Px";
            sparseArray.clear();
            this.A02.A05();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Mh
    public final void AFd(C0675Mg c0675Mg, boolean z3) {
        this.A01 = true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Mh
    public final void AGK(C0675Mg c0675Mg) {
        this.A01 = true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Mh
    public final void AKI(HashMap<String, C0675Mg> map) throws IOException {
        A05(map);
        this.A01 = false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Mh
    public final void AKJ(HashMap<String, C0675Mg> map) throws IOException {
        if (!this.A01) {
            return;
        }
        AKI(map);
    }
}
