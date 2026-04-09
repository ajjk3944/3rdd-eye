package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.applovin.shadow.okio.internal.Buffer;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03519f implements InterfaceC1787ms {
    public static String[] A07 = {"YlHQuKLayYbpqzx9FSV6CQrLdQj96AeM", "S4RZcb4lBSGk97kEvSl91HaEV0P4", "uVSfNf", "Coq", "aQ2CxhcvUBulJYKynnVyQo", "flTysjHMhLtcJrzUbSTnFz15x2mZl", "8oFgaOvQgeQ1BxQlutu1jILF1QVjJ1FW", "wjWZdP"};
    public int A00;
    public int A01;
    public long A02;
    public byte[] A03;
    public final long A04;
    public final InterfaceC1932pF A05;
    public final byte[] A06;

    public C03519f(InterfaceC1932pF interfaceC1932pF, long j, long j8) {
        this(interfaceC1932pF, j, j8, false);
    }

    public C03519f(InterfaceC1932pF interfaceC1932pF, long j, long j8, boolean z3) {
        this.A05 = interfaceC1932pF;
        this.A02 = j;
        this.A04 = j8;
        this.A03 = new byte[65536];
        this.A06 = new byte[Buffer.SEGMENTING_THRESHOLD];
    }

    private int A00(int i4) {
        int bytesSkipped = Math.min(this.A00, i4);
        A05(bytesSkipped);
        return bytesSkipped;
    }

    private int A01(byte[] bArr, int i4, int i10) {
        if (this.A00 == 0) {
            return 0;
        }
        int iMin = Math.min(this.A00, i10);
        System.arraycopy(this.A03, 0, bArr, i4, iMin);
        A05(iMin);
        return iMin;
    }

    private int A02(byte[] bArr, int i4, int i10, int i11, boolean z3) throws IOException {
        if (!Thread.interrupted()) {
            int i12 = this.A05.read(bArr, i4 + i11, i10 - i11);
            if (i12 == -1) {
                if (i11 == 0 && z3) {
                    return -1;
                }
                throw new EOFException();
            }
            return i11 + i12;
        }
        throw new InterruptedIOException();
    }

    private void A03(int i4) {
        if (i4 != -1) {
            this.A02 += i4;
        }
    }

    private void A04(int i4) {
        int i10 = this.A01 + i4;
        int requiredLength = this.A03.length;
        if (i10 > requiredLength) {
            int requiredLength2 = this.A03.length;
            int requiredLength3 = 524288 + i10;
            int newPeekCapacity = C5C.A07(requiredLength2 * 2, 65536 + i10, requiredLength3);
            this.A03 = Arrays.copyOf(this.A03, newPeekCapacity);
        }
    }

    private void A05(int i4) {
        this.A00 -= i4;
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
        System.arraycopy(bArr2, i4, bArr, 0, i10);
        this.A03 = bArr;
    }

    public final boolean A06(int i4, boolean z3) throws IOException {
        int iA00 = A00(i4);
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
            if (iA00 >= i4 || iA00 == -1) {
                break;
            }
            int bytesSkipped2 = this.A06.length;
            iA00 = A02(this.A06, -iA00, Math.min(i4, bytesSkipped2 + iA00), iA00, z3);
        }
        A03(iA00);
        return iA00 != -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1787ms
    public final void A47(int i4) throws IOException {
        A48(i4, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        throw new java.lang.RuntimeException();
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1787ms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A48(int r7, boolean r8) throws java.io.IOException {
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
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03519f.A07
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
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03519f.A07
            r0 = 1
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L2d
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03519f.A07
            java.lang.String r1 = "05c"
            r0 = 3
            r2[r0] = r1
            r0 = 1
            return r0
        L59:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C03519f.A07
            java.lang.String r1 = "U9yRyStfgEDvt0OpJggQJXPRXL9S"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "yvkfr8ZSlHssIeYh6rwGG04GsxspU"
            r0 = 5
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C03519f.A48(int, boolean):boolean");
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1787ms
    public final long A8O() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1787ms
    public final long A8i() {
        return this.A02 + this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1787ms
    public final long A8n() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1787ms
    public final Uri A9P() {
        return this.A05.A9P();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1787ms
    public final int AGs(byte[] bArr, int i4, int i10) throws IOException {
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
        System.arraycopy(bArr2, peekBufferRemainingBytes2, bArr, i4, iMin);
        int peekBufferRemainingBytes3 = this.A01;
        this.A01 = peekBufferRemainingBytes3 + iMin;
        return iMin;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1787ms
    public final void AGt(byte[] bArr, int i4, int i10) throws IOException {
        AGu(bArr, i4, i10, false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1787ms
    public final boolean AGu(byte[] bArr, int i4, int i10, boolean z3) throws IOException {
        if (!A48(i10, z3)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i10, bArr, i4, i10);
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1787ms
    public final boolean AHR(byte[] bArr, int i4, int i10, boolean z3) throws IOException {
        int iA01 = A01(bArr, i4, i10);
        while (iA01 < i10 && iA01 != -1) {
            iA01 = A02(bArr, i4, i10, iA01, z3);
        }
        A03(iA01);
        return iA01 != -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1787ms
    public final void AIl() {
        this.A01 = 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1787ms
    public final int AK0(int i4) throws IOException {
        int iA00 = A00(i4);
        if (iA00 == 0) {
            byte[] bArr = this.A06;
            int bytesSkipped = this.A06.length;
            iA00 = A02(bArr, 0, Math.min(i4, bytesSkipped), 0, true);
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

    @Override // com.instagram.common.viewpoint.core.InterfaceC1787ms
    public final void AK3(int i4) throws IOException {
        A06(i4, false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1787ms, com.instagram.common.viewpoint.core.InterfaceC01762c
    public final int read(byte[] bArr, int i4, int i10) throws IOException {
        int bytesRead = A01(bArr, i4, i10);
        if (bytesRead == 0) {
            bytesRead = A02(bArr, i4, i10, 0, true);
        }
        A03(bytesRead);
        return bytesRead;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1787ms
    public final void readFully(byte[] bArr, int i4, int i10) throws IOException {
        AHR(bArr, i4, i10, false);
    }
}
