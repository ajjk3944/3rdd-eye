package com.instagram.common.viewpoint.core;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.kU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2031kU implements C5W {
    public static byte[] A0A;
    public static String[] A0B = {"ZvdLZTVfwuIBTQP4GzYBT5X", "wbAZGHQ6rgrE49QWGCHGfuBznSfuy1uN", "V6XwnsY6foGeZeUf6zKrOXNqPWCT5H6x", "YVOcTVGnehAK6q3v9MTNJvITraIKZiNA", "KHrBPZHANML419JBBjaM9uFMM5JItkLu", "1WIXy5Awt7B4E86DpiV0tl9iGx9sIFx0", "LtMYCkXqs5nSRMey4EGdy6S", "9S3XCAL9m1K226khzcMpmZ28hR6Taq7A"};
    public long A00;
    public long A01;
    public long A02;
    public C06345i A03;
    public C1061Mo A04;
    public File A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final MP A09;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{86, 116, 118, 125, 112, 81, 116, 97, 116, 70, 124, 123, 126, 32, 52, 39, 33, 43, 35, 40, 50, 21, 47, 60, 35, 102, 47, 53, 102, 36, 35, 42, 41, 49, 102, 50, 46, 35, 102, 43, 47, 40, 47, 43, 51, 43, 102, 52, 35, 37, 41, 43, 43, 35, 40, 34, 35, 34, 102, 48, 39, 42, 51, 35, 102, 41, 32, 102, 116, 118, 127, 113, 119, 115, 116, 104, 102, 18, 46, 47, 53, 102, 43, 39, 63, 102, 37, 39, 51, 53, 35, 102, 54, 41, 41, 52, 102, 37, 39, 37, 46, 35, 102, 54, 35, 52, 32, 41, 52, 43, 39, 40, 37, 35, 104, 35, 55, 36, 34, 40, 32, 43, 49, 22, 44, 63, 32, 101, 40, 48, 54, 49, 101, 39, 32, 101, 53, 42, 54, 44, 49, 44, 51, 32, 101, 42, 55, 101, 6, 107, 9, 0, Flags.CD, 2, 17, 13, 26, 16, Flags.CD, 22, 0, 17, 107};
    }

    static {
        A02();
    }

    public C2031kU(MP mp, long j10, int i10) {
        AbstractC05983y.A0A(j10 > 0 || j10 == -1, A00(115, 48, 72));
        if (j10 != -1 && j10 < CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) {
            AbstractC06064g.A07(A00(0, 13, 24), A00(13, 102, 75));
        }
        this.A09 = (MP) AbstractC05983y.A01(mp);
        this.A08 = j10 == -1 ? Long.MAX_VALUE : j10;
        this.A07 = i10;
    }

    /* JADX WARN: Finally extract failed */
    private void A01() throws IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.flush();
            C5C.A10(this.A06);
            this.A06 = null;
            File file = (File) C5C.A0f(this.A05);
            this.A05 = null;
            String[] strArr = A0B;
            if (strArr[7].charAt(29) == strArr[2].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[0] = "UqCq1nJSNUsM2UdGgnorxCQ";
            strArr2[6] = "6grM2eqzP4bpAc7X7xQexiC";
            if (1 != 0) {
                this.A09.A55(file, this.A02);
            } else {
                file.delete();
            }
        } catch (Throwable th) {
            C5C.A10(this.A06);
            this.A06 = null;
            File fileToCommit = (File) C5C.A0f(this.A05);
            this.A05 = null;
            if (0 != 0) {
                this.A09.A55(fileToCommit, this.A02);
            } else {
                fileToCommit.delete();
            }
            throw th;
        }
    }

    private void A03(C06345i c06345i) throws IOException {
        this.A05 = this.A09.AK8((String) C5C.A0f(c06345i.A08), c06345i.A04 + this.A00, c06345i.A03 != -1 ? Math.min(c06345i.A03 - this.A00, this.A01) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.A05);
        if (this.A07 > 0) {
            if (this.A04 == null) {
                this.A04 = new C1061Mo(fileOutputStream, this.A07);
            } else {
                this.A04.A00(fileOutputStream);
            }
            this.A06 = this.A04;
        } else {
            this.A06 = fileOutputStream;
        }
        this.A02 = 0L;
    }

    @Override // com.instagram.common.viewpoint.core.C5W
    public final void AGk(C06345i c06345i) throws IOException {
        AbstractC05983y.A01(c06345i.A08);
        if (c06345i.A03 == -1 && c06345i.A06(2)) {
            this.A03 = null;
            return;
        }
        this.A03 = c06345i;
        this.A01 = c06345i.A06(4) ? this.A08 : Long.MAX_VALUE;
        this.A00 = 0L;
        try {
            A03(c06345i);
        } catch (IOException e10) {
            throw new C2033kW(e10);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C5W
    public final void close() throws IOException {
        if (this.A03 == null) {
            return;
        }
        try {
            A01();
        } catch (IOException e10) {
            throw new C2033kW(e10);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C5W
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        C06345i c06345i = this.A03;
        if (c06345i == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.A02 == this.A01) {
                    A01();
                    A03(c06345i);
                }
                int iMin = (int) Math.min(i11 - i12, this.A01 - this.A02);
                ((OutputStream) C5C.A0f(this.A06)).write(bArr, i10 + i12, iMin);
                i12 += iMin;
                this.A02 += iMin;
                this.A00 += iMin;
            } catch (IOException e10) {
                throw new C2033kW(e10);
            }
        }
    }
}
