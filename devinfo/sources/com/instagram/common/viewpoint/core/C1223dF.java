package com.instagram.common.viewpoint.core;

import com.applovin.shadow.okio.Segment;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1223dF extends InputStream {
    public static byte[] A04;
    public MessageDigest A00;
    public final C1432ge A01;
    public final InterfaceC1222dE A02;
    public final FileInputStream A03;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-52, -61, -76, -23, -8, -15};
    }

    public C1223dF(C1432ge c1432ge, FileInputStream fileInputStream, InterfaceC1222dE interfaceC1222dE) {
        this.A03 = fileInputStream;
        this.A02 = interfaceC1222dE;
        this.A01 = c1432ge;
        try {
            this.A00 = MessageDigest.getInstance(A00(0, 3, 84));
        } catch (NoSuchAlgorithmException unused) {
            this.A00 = null;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.A03.available();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b10 = new byte[1];
        return read(b10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i10) throws IOException {
        int i11 = this.A03.read(bArr, i4, i10);
        if (this.A00 != null) {
            try {
                if (i11 > 0) {
                    this.A00.update(bArr, i4, i11);
                } else if (i11 == -1) {
                    this.A02.A9s(C0944Xa.A05(this.A00.digest()));
                    this.A00 = null;
                }
            } catch (Exception e2) {
                this.A00 = null;
                this.A01.A08().ABz(A00(3, 3, 90), AbstractC0848Td.A13, new C0849Te(e2));
            }
        }
        return i11;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        int actuallyRead = (int) j;
        byte[] bArr = new byte[Segment.SHARE_MINIMUM];
        long j8 = 0;
        while (actuallyRead > 0) {
            int bytesToRead = read(bArr, 0, Math.min(actuallyRead, Segment.SHARE_MINIMUM));
            if (bytesToRead <= 0) {
                break;
            }
            actuallyRead -= bytesToRead;
            j8 += bytesToRead;
        }
        return j8;
    }
}
