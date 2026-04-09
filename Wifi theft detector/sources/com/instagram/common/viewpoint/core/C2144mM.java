package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.mM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2144mM implements InterfaceC0955Il {
    public static byte[] A07;
    public static String[] A08 = {"eVwUBMvHO9uBMhknAGNfZP2yr814WJyE", "k5ILRUABeDXqCwWpN", "hJjZHs3Q8zIp76bYyURn3XwI", "BeESTKEHKjvJbhVudlSNXwxkHuAjvLDZ", "rbeMFWTNNauR3FTC2xnHN2ozIe2oUtV0", "bbPaxRhv7ZvGWrZH", "Yl9CHZRrzKaSrdtxcFsBA9EFbwcoGK5g", "dqSnihCeyqEvBM16"};
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0954Ik A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<C0952Ii> A05 = new ArrayDeque<>();
    public final C0960Iq A04 = new C0960Iq();

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{98, -121, -113, 122, -123, -126, 125, 57, 126, -123, 126, -122, 126, -121, -115, 57, -115, -110, -119, 126, 57, 91, -128, -120, 115, 126, 123, 118, 50, 120, 126, -127, 115, -122, 50, -123, 123, -116, 119, 76, 50, -78, -41, -33, -54, -43, -46, -51, -119, -46, -41, -35, -50, -48, -50, -37, -119, -36, -46, -29, -50, -93, -119, -61, -28, -30, -39, -34, -41, -112, -43, -36, -43, -35, -43, -34, -28, -112, -29, -39, -22, -43, -86, -112};
        if (A08[6].charAt(2) != '9') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[0] = "OJtOaz7eyeuGy8JHYC7MsYj9KI0teM8x";
        strArr[4] = "Pthq8qREsbuOKTWUYG3bxj4Nb5ptFAt8";
    }

    static {
        A05();
    }

    private double A00(InterfaceC2165ms interfaceC2165ms, int i10) throws IOException {
        long jA02 = A02(interfaceC2165ms, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) jA02);
        }
        return Double.longBitsToDouble(jA02);
    }

    @RequiresNonNull({"processor"})
    private long A01(InterfaceC2165ms interfaceC2165ms) throws IOException {
        interfaceC2165ms.AIl();
        while (true) {
            interfaceC2165ms.AGt(this.A06, 0, 4);
            int iA00 = C0960Iq.A00(this.A06[0]);
            if (iA00 != -1 && iA00 <= 4) {
                int iA01 = (int) C0960Iq.A01(this.A06, iA00, false);
                if (this.A03.AAW(iA01)) {
                    interfaceC2165ms.AK3(iA00);
                    return iA01;
                }
            }
            interfaceC2165ms.AK3(1);
        }
    }

    private long A02(InterfaceC2165ms interfaceC2165ms, int i10) throws IOException {
        interfaceC2165ms.readFully(this.A06, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long value = this.A06[i11] & 255;
            j10 = (j10 << 8) | value;
        }
        return j10;
    }

    public static String A04(InterfaceC2165ms interfaceC2165ms, int i10) throws IOException {
        if (i10 == 0) {
            return A03(0, 0, 32);
        }
        byte[] bArr = new byte[i10];
        interfaceC2165ms.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0955Il
    public final void AAD(InterfaceC0954Ik interfaceC0954Ik) {
        this.A03 = interfaceC0954Ik;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011d, code lost:
    
        if (r0 <= org.xbill.DNS.TTL.MAX_VALUE) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011f, code lost:
    
        r12.A03.AKK(r12.A00, A04(r13, (int) r12.A02));
        r12.A01 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0137, code lost:
    
        if (r0 <= org.xbill.DNS.TTL.MAX_VALUE) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015b, code lost:
    
        throw com.instagram.common.viewpoint.core.C3K.A01(A03(63, 21, 97) + r12.A02, null);
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0955Il
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AHO(com.instagram.common.viewpoint.core.InterfaceC2165ms r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C2144mM.AHO(com.facebook.ads.redexgen.X.ms):boolean");
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0955Il
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
