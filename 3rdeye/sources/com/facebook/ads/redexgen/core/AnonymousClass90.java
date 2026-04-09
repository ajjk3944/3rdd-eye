package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.90, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass90 implements InterfaceC3738lN {
    public static String[] A07 = {"YlHQuKLayYbpqzx9FSV6CQrLdQj96AeM", "S4RZcb4lBSGk97kEvSl91HaEV0P4", "uVSfNf", "Coq", "aQ2CxhcvUBulJYKynnVyQo", "flTysjHMhLtcJrzUbSTnFz15x2mZl", "8oFgaOvQgeQ1BxQlutu1jILF1QVjJ1FW", "wjWZdP"};
    public int A00;
    public int A01;
    public long A02;
    public byte[] A03;
    public final long A04;
    public final InterfaceC3884nl A05;
    public final byte[] A06;

    public AnonymousClass90(InterfaceC3884nl interfaceC3884nl, long j4, long j10) {
        this(interfaceC3884nl, j4, j10, false);
    }

    public AnonymousClass90(InterfaceC3884nl interfaceC3884nl, long j4, long j10, boolean z10) {
        this.A05 = interfaceC3884nl;
        this.A02 = j4;
        this.A04 = j10;
        this.A03 = new byte[65536];
        this.A06 = new byte[4096];
    }

    private int A00(int i) {
        int bytesSkipped = Math.min(this.A00, i);
        A05(bytesSkipped);
        return bytesSkipped;
    }

    private int A01(byte[] bArr, int i, int i10) {
        if (this.A00 == 0) {
            return 0;
        }
        int iMin = Math.min(this.A00, i10);
        System.arraycopy(this.A03, 0, bArr, i, iMin);
        A05(iMin);
        return iMin;
    }

    private int A02(byte[] bArr, int i, int i10, int i11, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int i12 = this.A05.read(bArr, i + i11, i10 - i11);
            if (i12 == -1) {
                if (i11 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i11 + i12;
        }
        throw new InterruptedIOException();
    }

    private void A03(int i) {
        if (i != -1) {
            this.A02 += i;
        }
    }

    private void A04(int i) {
        int i10 = this.A01 + i;
        int requiredLength = this.A03.length;
        if (i10 > requiredLength) {
            int requiredLength2 = this.A03.length;
            int requiredLength3 = 524288 + i10;
            int newPeekCapacity = AbstractC22614a.A07(requiredLength2 * 2, 65536 + i10, requiredLength3);
            this.A03 = Arrays.copyOf(this.A03, newPeekCapacity);
        }
    }

    private void A05(int i) {
        this.A00 -= i;
        this.A01 = 0;
        byte[] bArr = this.A03;
        if (this.A00 < this.A03.length - 524288) {
            bArr = new byte[this.A00 + 65536];
        }
        byte[] bArr2 = this.A03;
        int i10 = this.A00;
        if (A07[3].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[7] = "U6HOVF";
        strArr[2] = "FLrwJS";
        System.arraycopy(bArr2, i, bArr, 0, i10);
        this.A03 = bArr;
    }

    public final boolean A06(int i, boolean z10) throws IOException {
        int iA00 = A00(i);
        while (true) {
            String[] strArr = A07;
            String str = strArr[1];
            String str2 = strArr[5];
            int length = str.length();
            int bytesSkipped = str2.length();
            if (length == bytesSkipped) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "VT2oIT";
            strArr2[2] = "AHKvNZ";
            if (iA00 >= i || iA00 == -1) {
                break;
            }
            int bytesSkipped2 = this.A06.length;
            iA00 = A02(this.A06, -iA00, Math.min(i, bytesSkipped2 + iA00), iA00, z10);
        }
        A03(iA00);
        return iA00 != -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3738lN
    public final void A3z(int i) throws IOException {
        A40(i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        throw new java.lang.RuntimeException();
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC3738lN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A40(int r7, boolean r8) throws java.io.IOException {
        /*
            r6 = this;
            r3 = r7
            r6.A04(r3)
            int r4 = r6.A00
            int r0 = r6.A01
            int r4 = r4 - r0
        L9:
            if (r4 >= r3) goto L39
            byte[] r1 = r6.A03
            int r2 = r6.A01
            r0 = r6
            r5 = r8
            int r4 = r0.A02(r1, r2, r3, r4, r5)
            r0 = -1
            if (r4 != r0) goto L33
            r3 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass90.A07
            r0 = 6
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 25
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L59
        L2d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L33:
            int r0 = r6.A01
            int r0 = r0 + r4
            r6.A00 = r0
            goto L9
        L39:
            int r0 = r6.A01
            int r0 = r0 + r3
            r6.A01 = r0
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass90.A07
            r0 = 1
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L2d
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass90.A07
            java.lang.String r1 = "05c"
            r0 = 3
            r2[r0] = r1
            r0 = 1
            return r0
        L59:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass90.A07
            java.lang.String r1 = "U9yRyStfgEDvt0OpJggQJXPRXL9S"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "yvkfr8ZSlHssIeYh6rwGG04GsxspU"
            r0 = 5
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AnonymousClass90.A40(int, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3738lN
    public final long A8G() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3738lN
    public final long A8a() {
        return this.A02 + this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3738lN
    public final long A8f() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3738lN
    public final Uri A9H() {
        return this.A05.A9H();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3738lN
    public final int AG8(byte[] bArr, int i, int i10) throws IOException {
        int iMin;
        A04(i10);
        int bytesPeeked = this.A00 - this.A01;
        if (bytesPeeked == 0) {
            iMin = A02(this.A03, this.A01, i10, 0, true);
            if (iMin == -1) {
                return -1;
            }
            int peekBufferRemainingBytes = this.A00;
            this.A00 = peekBufferRemainingBytes + iMin;
        } else {
            iMin = Math.min(i10, bytesPeeked);
        }
        byte[] bArr2 = this.A03;
        int peekBufferRemainingBytes2 = this.A01;
        System.arraycopy(bArr2, peekBufferRemainingBytes2, bArr, i, iMin);
        int peekBufferRemainingBytes3 = this.A01;
        this.A01 = peekBufferRemainingBytes3 + iMin;
        return iMin;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3738lN
    public final void AG9(byte[] bArr, int i, int i10) throws IOException {
        AGA(bArr, i, i10, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3738lN
    public final boolean AGA(byte[] bArr, int i, int i10, boolean z10) throws IOException {
        if (!A40(i10, z10)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i10, bArr, i, i10);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3738lN
    public final boolean AGh(byte[] bArr, int i, int i10, boolean z10) throws IOException {
        int iA01 = A01(bArr, i, i10);
        while (iA01 < i10 && iA01 != -1) {
            iA01 = A02(bArr, i, i10, iA01, z10);
        }
        A03(iA01);
        return iA01 != -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3738lN
    public final void AI1() {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3738lN
    public final int AJG(int i) throws IOException {
        int iA00 = A00(i);
        if (iA00 == 0) {
            byte[] bArr = this.A06;
            int bytesSkipped = this.A06.length;
            iA00 = A02(bArr, 0, Math.min(i, bytesSkipped), 0, true);
        }
        A03(iA00);
        String[] strArr = A07;
        String str = strArr[7];
        String str2 = strArr[2];
        int length = str.length();
        int bytesSkipped2 = str2.length();
        if (length != bytesSkipped2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "4muWdj2u5Q3eId9F7O7O9kyn7QS9F70y";
        strArr2[0] = "MQBZi4ACHP4vbg8D4iuKjBQaYQ9ASuUs";
        return iA00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3738lN
    public final void AJJ(int i) throws IOException {
        A06(i, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3738lN, com.facebook.ads.redexgen.core.AnonymousClass20
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int bytesRead = A01(bArr, i, i10);
        if (bytesRead == 0) {
            bytesRead = A02(bArr, i, i10, 0, true);
        }
        A03(bytesRead);
        return bytesRead;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3738lN
    public final void readFully(byte[] bArr, int i, int i10) throws IOException {
        AGh(bArr, i, i10, false);
    }
}
