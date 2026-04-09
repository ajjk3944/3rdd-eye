package com.facebook.ads.redexgen.core;

import android.media.MediaFormat;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.nO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3861nO implements FQ, InterfaceC2546Fp, AnonymousClass70 {
    public static byte[] A04;
    public static String[] A05 = {"s2pX1dUuV9yMGkOQMpNHWy9uhNawnk9Y", "g94kU4b", "NzGTwCFJguijRpsE4vnu2khyHl2vzHxI", "mcwg2", "3H7kdFWigyqN00XNlLPoaD6s2Om", "arwBjFb", "zwCIEju4cqvLZ8D4reT2LOc82uEYQHt6", "4voNbHG588W1rePZ0VIdJriIAfqG9T"};
    public FQ A00;
    public FQ A01;
    public InterfaceC2546Fp A02;
    public InterfaceC2546Fp A03;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{2, 0, 17, 51, 12, 1, 0, 10, 35, 23, 4, 8, 0, 40, 0, 17, 4, 1, 4, 17, 4, 41, 12, 22, 17, 0, 11, 0, 23};
    }

    static {
        A01();
    }

    public C3861nO() {
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass70
    public final void A9a(int i, Object obj) {
        switch (i) {
            case 7:
                this.A01 = (FQ) obj;
                return;
            case 8:
                this.A02 = (InterfaceC2546Fp) obj;
                return;
            case 10000:
                if (0 == 0) {
                    this.A00 = null;
                    this.A03 = null;
                    return;
                }
                throw new NullPointerException(A00(0, 29, 100));
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.core.FQ
    public final void AFi(long j4, long j10, C3949or c3949or, MediaFormat mediaFormat) {
        if (this.A00 != null) {
            FQ fq = this.A00;
            if (A05[0].charAt(20) != 'W') {
                throw new RuntimeException();
            }
            A05[4] = "rCzQpO90p93bI0FQ7tWj9IORt31";
            fq.AFi(j4, j10, c3949or, mediaFormat);
        }
        if (this.A01 != null) {
            this.A01.AFi(j4, j10, c3949or, mediaFormat);
        }
    }
}
