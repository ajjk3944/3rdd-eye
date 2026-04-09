package com.instagram.common.viewpoint.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2084lN implements InterfaceC1016Kv {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02 = C.TIME_UNSET;
    public boolean A03;
    public final List<LC> A04;
    public final InterfaceC0921Hd[] A05;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{1, 16, 16, 12, 9, 3, 1, 20, 9, 15, 14, -49, 4, 22, 2, 19, 21, 2, 19};
    }

    public C2084lN(List<LC> list) {
        this.A04 = list;
        this.A05 = new InterfaceC0921Hd[list.size()];
    }

    private boolean A02(C06214v c06214v, int i10) {
        if (c06214v.A07() == 0) {
            return false;
        }
        if (c06214v.A0I() != i10) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1016Kv
    public final void A5A(C06214v c06214v) {
        if (this.A03) {
            if (this.A00 == 2 && !A02(c06214v, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c06214v, 0)) {
                return;
            }
            int iA09 = c06214v.A09();
            int iA07 = c06214v.A07();
            for (InterfaceC0921Hd interfaceC0921Hd : this.A05) {
                c06214v.A0f(iA09);
                interfaceC0921Hd.AIr(c06214v, iA07);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + iA07;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1016Kv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A5c(com.instagram.common.viewpoint.core.HA r8, com.instagram.common.viewpoint.core.LG r9) {
        /*
            r7 = this;
            r4 = 0
        L1:
            com.facebook.ads.redexgen.X.Hd[] r0 = r7.A05
            int r0 = r0.length
            if (r4 >= r0) goto L52
            java.util.List<com.facebook.ads.redexgen.X.LC> r0 = r7.A04
            java.lang.Object r6 = r0.get(r4)
            com.facebook.ads.redexgen.X.LC r6 = (com.instagram.common.viewpoint.core.LC) r6
            r9.A05()
            int r1 = r9.A03()
            r0 = 3
            com.facebook.ads.redexgen.X.Hd r3 = r8.AKS(r1, r0)
            com.facebook.ads.redexgen.X.2p r1 = new com.facebook.ads.redexgen.X.2p
            r1.<init>()
            java.lang.String r0 = r9.A04()
            com.facebook.ads.redexgen.X.2p r5 = r1.A0y(r0)
            r2 = 0
            r1 = 19
            r0 = 111(0x6f, float:1.56E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            com.facebook.ads.redexgen.X.2p r1 = r5.A11(r0)
            byte[] r0 = r6.A02
            java.util.List r0 = java.util.Collections.singletonList(r0)
            com.facebook.ads.redexgen.X.2p r1 = r1.A12(r0)
            java.lang.String r0 = r6.A01
            com.facebook.ads.redexgen.X.2p r0 = r1.A10(r0)
            com.facebook.ads.redexgen.X.qI r0 = r0.A14()
            r3.A6e(r0)
            com.facebook.ads.redexgen.X.Hd[] r0 = r7.A05
            r0[r4] = r3
            int r4 = r4 + 1
            goto L1
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C2084lN.A5c(com.facebook.ads.redexgen.X.HA, com.facebook.ads.redexgen.X.LG):void");
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1016Kv
    public final void AGp() {
        if (this.A03) {
            if (this.A02 != C.TIME_UNSET) {
                for (InterfaceC0921Hd interfaceC0921Hd : this.A05) {
                    interfaceC0921Hd.AIu(this.A02, 1, this.A01, 0, null);
                }
            }
            this.A03 = false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1016Kv
    public final void AGq(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.A03 = true;
        if (j10 != C.TIME_UNSET) {
            this.A02 = j10;
        }
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1016Kv
    public final void AJ5() {
        this.A03 = false;
        this.A02 = C.TIME_UNSET;
    }
}
