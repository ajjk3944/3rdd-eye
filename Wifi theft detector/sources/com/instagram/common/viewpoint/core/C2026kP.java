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
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.kP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2026kP implements InterfaceC1054Mh {
    public static byte[] A07;
    public static String[] A08 = {"F3MsLf6P", "OcoAPMR8U6yTwuATNsSjihct3nuq8KFx", "bdE6GcC1kS6ix1fgAcoyQkC9rv", "V0wqj6Me", "EdnIrf", "cKhO3MBZMfPQ2uYBFx142UbqGZ0vcEvq", "x8zWNoAeDf", "YEiR7yHxtXFy2pC0Q9KvxgBtY"};
    public C1061Mo A00;
    public boolean A01;
    public final AnonymousClass40 A02;
    public final SecureRandom A03;
    public final Cipher A04;
    public final SecretKeySpec A05;
    public final boolean A06;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A08;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "SFj9nJw9GR";
            strArr2[4] = "liv3w1";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 117);
            i13++;
        }
    }

    public static void A03() {
        A07 = new byte[]{Flags.CD, 15, 29};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A05(HashMap<String, C1053Mg> map) throws IOException {
        try {
            C05993z c05993zA03 = this.A02.A03();
            if (this.A00 == null) {
                this.A00 = new C1061Mo(c05993zA03);
            } else {
                this.A00.A00(c05993zA03);
            }
            C1061Mo c1061Mo = this.A00;
            DataOutputStream dataOutputStream = new DataOutputStream(c1061Mo);
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(this.A06 ? 1 : 0);
            if (this.A06) {
                byte[] bArr = new byte[16];
                ((SecureRandom) C5C.A0f(this.A03)).nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    ((Cipher) C5C.A0f(this.A04)).init(1, (Key) C5C.A0f(this.A05), new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(c1061Mo, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                    throw new IllegalStateException(e10);
                }
            }
            dataOutputStream.writeInt(map.size());
            int iA00 = 0;
            for (C1053Mg c1053Mg : map.values()) {
                A04(c1053Mg, dataOutputStream);
                iA00 += A00(c1053Mg, 2);
            }
            dataOutputStream.writeInt(iA00);
            this.A02.A06(dataOutputStream);
            C5C.A10(null);
        } catch (Throwable th) {
            C5C.A10(null);
            throw th;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A06(HashMap<String, C1053Mg> map, SparseArray<String> sparseArray) throws IOException {
        if (!this.A02.A07()) {
            return true;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.A02.A04());
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            int i10 = dataInputStream.readInt();
            if (i10 < 0 || i10 > 2) {
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
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                    throw new IllegalStateException(e10);
                }
            } else if (this.A06) {
                this.A01 = true;
            }
            int i11 = dataInputStream.readInt();
            int iA00 = 0;
            for (int i12 = 0; i12 < i11; i12++) {
                C1053Mg c1053MgA01 = A01(i10, dataInputStream);
                map.put(c1053MgA01.A02, c1053MgA01);
                sparseArray.put(c1053MgA01.A01, c1053MgA01.A02);
                iA00 += A00(c1053MgA01, i10);
            }
            int i13 = dataInputStream.readInt();
            boolean z10 = dataInputStream.read() == -1;
            if (i13 == iA00 && z10) {
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
        } catch (Throwable th) {
            if (0 != 0) {
                C5C.A10(null);
            }
            throw th;
        }
    }

    static {
        A03();
    }

    public C2026kP(File file, byte[] bArr, boolean z10) {
        AbstractC05983y.A08((bArr == null && z10) ? false : true);
        Cipher cipherA05 = null;
        SecretKeySpec secretKeySpec = null;
        if (bArr != null) {
            AbstractC05983y.A07(bArr.length == 16);
            try {
                cipherA05 = C1055Mi.A05();
                secretKeySpec = new SecretKeySpec(bArr, A02(0, 3, 85));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                throw new IllegalStateException(e10);
            }
        } else {
            AbstractC05983y.A07(!z10);
        }
        this.A06 = z10;
        this.A04 = cipherA05;
        this.A05 = secretKeySpec;
        this.A03 = z10 ? new SecureRandom() : null;
        this.A02 = new AnonymousClass40(file);
    }

    private int A00(C1053Mg c1053Mg, int i10) {
        int result = c1053Mg.A01;
        int i11 = result * 31;
        int result2 = c1053Mg.A02.hashCode();
        int result3 = i11 + result2;
        if (i10 < 2) {
            long jA00 = AbstractC1056Mj.A00(c1053Mg.A03());
            return (result3 * 31) + ((int) ((jA00 >>> 32) ^ jA00));
        }
        return (result3 * 31) + c1053Mg.A03().hashCode();
    }

    private C1053Mg A01(int i10, DataInputStream dataInputStream) throws IOException {
        C2024kN c2024kNA02;
        int i11 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i10 >= 2) {
            c2024kNA02 = C1055Mi.A02(dataInputStream);
        } else {
            long length = dataInputStream.readLong();
            C1058Ml c1058Ml = new C1058Ml();
            C1058Ml.A00(c1058Ml, length);
            c2024kNA02 = C2024kN.A03.A05(c1058Ml);
        }
        return new C1053Mg(i11, utf, c2024kNA02);
    }

    private void A04(C1053Mg c1053Mg, DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(c1053Mg.A01);
        dataOutputStream.writeUTF(c1053Mg.A02);
        C1055Mi.A08(c1053Mg.A03(), dataOutputStream);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1054Mh
    public final void A5p() {
        this.A02.A05();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1054Mh
    public final boolean A6S() {
        return this.A02.A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1054Mh
    public final void AAF(long j10) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1054Mh
    public final void AAs(HashMap<String, C1053Mg> map, SparseArray<String> sparseArray) {
        AbstractC05983y.A08(!this.A01);
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

    @Override // com.instagram.common.viewpoint.core.InterfaceC1054Mh
    public final void AFd(C1053Mg c1053Mg, boolean z10) {
        this.A01 = true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1054Mh
    public final void AGK(C1053Mg c1053Mg) {
        this.A01 = true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1054Mh
    public final void AKI(HashMap<String, C1053Mg> map) throws IOException {
        A05(map);
        this.A01 = false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1054Mh
    public final void AKJ(HashMap<String, C1053Mg> map) throws IOException {
        if (!this.A01) {
            return;
        }
        AKI(map);
    }
}
