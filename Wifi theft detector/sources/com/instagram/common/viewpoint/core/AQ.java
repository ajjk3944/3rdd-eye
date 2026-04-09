package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class AQ implements InterfaceC2310pF {
    public static String[] A04 = {"fHQEiP1zlTMmcDhuRJvCUYhlqM3A1WdS", "0xjR5o24wRXCnK6P48nvJnLVp1A7yIdC", "SqWyKblZmsOi3mnFjBlOyIvINI4fuoz1", "GUT90kd8g0iIA", "yfLAFjbfQv", "f1jCtkpjn8LmH02gI7EE0X95Og8KENXi", "pIy67q2NMZ", "VUF0F4IbO37j7MJUWX75PYUeN7L9nYYd"};
    public int A00;
    public C06345i A01;
    public final ArrayList<InterfaceC06455t> A02 = new ArrayList<>(1);
    public final boolean A03;

    @Override // com.instagram.common.viewpoint.core.InterfaceC2310pF
    public /* synthetic */ Map A8t() {
        return C5X.A00(this);
    }

    public AQ(boolean z10) {
        this.A03 = z10;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A0D(com.instagram.common.viewpoint.core.C06345i r4, boolean r5) {
        /*
            r3 = this;
            r3.A01 = r4
            r2 = 0
        L3:
            int r0 = r3.A00
            if (r2 >= r0) goto L17
            java.util.ArrayList<com.facebook.ads.redexgen.X.5t> r0 = r3.A02
            java.lang.Object r1 = r0.get(r2)
            com.facebook.ads.redexgen.X.5t r1 = (com.instagram.common.viewpoint.core.InterfaceC06455t) r1
            boolean r0 = r3.A03
            r1.AGH(r3, r4, r0, r5)
            int r2 = r2 + 1
            goto L3
        L17:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AQ.A0D(com.facebook.ads.redexgen.X.5i, boolean):void");
    }

    public final void A0E() {
        C06345i c06345i = (C06345i) C5C.A0f(this.A01);
        for (int i10 = 0; i10 < this.A00; i10++) {
            this.A02.get(i10).AGG(this, c06345i, this.A03);
        }
        this.A01 = null;
    }

    public final void A0F(int i10) {
        C06345i c06345i = (C06345i) C5C.A0f(this.A01);
        for (int i11 = 0; i11 < this.A00; i11++) {
            this.A02.get(i11).ADK(this, c06345i, this.A03, i10);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0G(com.instagram.common.viewpoint.core.C06345i r5) {
        /*
            r4 = this;
            r3 = 0
        L1:
            int r0 = r4.A00
            if (r3 >= r0) goto L29
            java.util.ArrayList<com.facebook.ads.redexgen.X.5t> r0 = r4.A02
            r0.get(r3)
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.AQ.A04
            r0 = 7
            r1 = r1[r0]
            r0 = 14
            char r1 = r1.charAt(r0)
            r0 = 80
            if (r1 == r0) goto L23
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.AQ.A04
            java.lang.String r1 = "KcnUkvSyZAFqCmq9nk7LLPyjKQRUe1pa"
            r0 = 2
            r2[r0] = r1
            int r3 = r3 + 1
            goto L1
        L23:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AQ.A0G(com.facebook.ads.redexgen.X.5i):void");
    }

    public final void A0H(C06345i c06345i) {
        A0D(c06345i, false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2310pF
    public final void A43(InterfaceC06455t interfaceC06455t) {
        AbstractC05983y.A01(interfaceC06455t);
        if (!this.A02.contains(interfaceC06455t)) {
            this.A02.add(interfaceC06455t);
            this.A00++;
        }
    }
}
