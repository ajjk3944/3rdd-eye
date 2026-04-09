package com.instagram.common.viewpoint.core;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.lM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1705lM implements InterfaceC0638Kv {
    public static byte[] A0G;
    public static String[] A0H = {"cAtU07tvAHmpQwteCa8pEQH5gF5iUcfh", "Hjeg7grS71Jm6r5NKbmR8o7Al25NvLrB", "8TbkpeEOwiN436cBQhp4NSePMq1Z0ZNp", "wFA3Sleqv", "yws6lvEdJf3TdH9okNAymdfPd8aH69ii", "xvx7jE251jeLUpmQ5JTTtAODp7RTPAZj", "flKrm8KbmQNj7vJDUwRTOfFPMCPuTaKn", "2PQM5lIFNms8BVmrvHkuPmbcHqu7a2gR"};
    public static final double[] A0I;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public InterfaceC0543Hd A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C02434v A0B;
    public final C0639Kw A0C;
    public final L4 A0D;
    public final LJ A0E;
    public final boolean[] A0F;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<C1996qI, Long> A00(C0639Kw c0639Kw, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(c0639Kw.A02, c0639Kw.A00);
        int i4 = bArrCopyOf[4] & 255;
        int i10 = bArrCopyOf[5] & 255;
        int i11 = (i4 << 4) | (i10 >> 4);
        int i12 = ((i10 & 15) << 8) | (bArrCopyOf[6] & 255);
        float f10 = 1.0f;
        switch ((bArrCopyOf[7] & 240) >> 4) {
            case 2:
                float f11 = i12 * 4;
                float f12 = i11 * 3;
                if (A0H[2].charAt(3) == 'k') {
                    A0H[1] = "IKG5315UEoYuWi8w79ZvxkF28jax6fmF";
                    f10 = f11 / f12;
                    break;
                }
                throw new RuntimeException();
            case 3:
                f10 = (i12 * 16) / (i11 * 9);
                break;
            case 4:
                f10 = (i12 * 121) / (i11 * 100);
                break;
        }
        C1996qI c1996qIA14 = new C01872p().A0y(str).A11(A01(0, 11, 62)).A0r(i11).A0f(i12).A0Y(f10).A12(Collections.singletonList(bArrCopyOf)).A14();
        long j = 0;
        int i13 = (bArrCopyOf[7] & 15) - 1;
        if (i13 >= 0 && i13 < A0I.length) {
            double d10 = A0I[i13];
            int i14 = c0639Kw.A01;
            int i15 = (bArrCopyOf[i14 + 9] & 96) >> 5;
            if (i15 != (bArrCopyOf[i14 + 9] & 31)) {
                double d11 = i15;
                if (A0H[2].charAt(3) == 'k') {
                    String[] strArr = A0H;
                    strArr[5] = "rAMAKKtXIRKmVhmwxuLKv06bcSnWRDth";
                    strArr[7] = "TlBzrdA8FTcPVEmXq7DzDEHR3QnpW5Am";
                    d10 *= (d11 + 1.0d) / (r6 + 1);
                }
                throw new RuntimeException();
            }
            j = (long) (1000000.0d / d10);
        }
        return Pair.create(c1996qIA14, Long.valueOf(j));
    }

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {50, 45, 32, 33, 43, 107, 41, 52, 33, 35, 118};
        if (A0H[4].charAt(19) != 'y') {
            throw new RuntimeException();
        }
        A0H[2] = "5b4kHrs0qMccPUXJRINIqLrMs4aEtqXr";
        A0G = bArr;
    }

    static {
        A02();
        A0I = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public C1705lM() {
        this(null);
    }

    public C1705lM(LJ lj2) {
        this.A0E = lj2;
        this.A0F = new boolean[4];
        this.A0C = new C0639Kw(128);
        if (lj2 != null) {
            this.A0D = new L4(178, 128);
            this.A0B = new C02434v();
        } else {
            this.A0D = null;
            this.A0B = null;
        }
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0638Kv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A5A(com.instagram.common.viewpoint.core.C02434v r24) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1705lM.A5A(com.facebook.ads.redexgen.X.4v):void");
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0638Kv
    public final void A5c(HA ha2, LG lg2) {
        lg2.A05();
        this.A06 = lg2.A04();
        this.A05 = ha2.AKS(lg2.A03(), 2);
        if (this.A0E != null) {
            this.A0E.A03(ha2, lg2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0638Kv
    public final void AGp() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0638Kv
    public final void AGq(long j, int i4) {
        this.A01 = j;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0638Kv
    public final void AJ5() {
        HS.A0H(this.A0F);
        this.A0C.A00();
        if (this.A0D != null) {
            L4 l42 = this.A0D;
            if (A0H[1].length() != 32) {
                throw new RuntimeException();
            }
            A0H[0] = "joVCJevLOtmtIagsqVBvfxemqq2mA7LA";
            l42.A00();
        }
        this.A04 = 0L;
        this.A0A = false;
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }
}
