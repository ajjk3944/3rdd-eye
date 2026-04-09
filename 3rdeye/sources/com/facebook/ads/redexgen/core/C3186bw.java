package com.facebook.ads.redexgen.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3186bw extends InputStream {
    public static byte[] A04;
    public MessageDigest A00;
    public final C3246cu A01;
    public final InterfaceC3185bv A02;
    public final FileInputStream A03;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-52, -61, -76, -23, -8, -15};
    }

    public C3186bw(C3246cu c3246cu, FileInputStream fileInputStream, InterfaceC3185bv interfaceC3185bv) {
        this.A03 = fileInputStream;
        this.A02 = interfaceC3185bv;
        this.A01 = c3246cu;
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
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int i11 = this.A03.read(bArr, i, i10);
        if (this.A00 != null) {
            try {
                if (i11 > 0) {
                    this.A00.update(bArr, i, i11);
                } else if (i11 == -1) {
                    this.A02.A9k(C2978Wo.A05(this.A00.digest()));
                    this.A00 = null;
                }
            } catch (Exception e4) {
                this.A00 = null;
                this.A01.A08().ABR(A00(3, 3, 90), AbstractC2885Sv.A13, new C2886Sw(e4));
            }
        }
        return i11;
    }

    @Override // java.io.InputStream
    public final long skip(long j4) throws IOException {
        int actuallyRead = (int) j4;
        byte[] bArr = new byte[1024];
        long j10 = 0;
        while (actuallyRead > 0) {
            int bytesToRead = read(bArr, 0, Math.min(actuallyRead, 1024));
            if (bytesToRead <= 0) {
                break;
            }
            actuallyRead -= bytesToRead;
            j10 += bytesToRead;
        }
        return j10;
    }
}
