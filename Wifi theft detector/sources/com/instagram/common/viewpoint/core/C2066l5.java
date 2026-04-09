package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.l5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2066l5 implements L8 {
    public final C06204u A00 = new C06204u(new byte[4]);
    public final /* synthetic */ C2064l3 A01;

    public C2066l5(C2064l3 c2064l3) {
        this.A01 = c2064l3;
    }

    @Override // com.instagram.common.viewpoint.core.L8
    public final void A5A(C06214v c06214v) {
        int tableId = c06214v.A0I();
        if (tableId != 0) {
            return;
        }
        int tableId2 = c06214v.A0I();
        if ((tableId2 & 128) == 0) {
            return;
        }
        c06214v.A0g(6);
        int iA07 = c06214v.A07() / 4;
        for (int i10 = 0; i10 < iA07; i10++) {
            c06214v.A0h(this.A00, 4);
            int programCount = this.A00.A04(16);
            this.A00.A09(3);
            if (programCount == 0) {
                this.A00.A09(13);
            } else {
                int iA04 = this.A00.A04(13);
                if (this.A01.A0B.get(iA04) == null) {
                    this.A01.A0B.put(iA04, new C2070l9(new C2065l4(this.A01, iA04)));
                    C2064l3.A02(this.A01);
                }
            }
        }
        int secondHeaderByte = this.A01.A09;
        if (secondHeaderByte != 2) {
            this.A01.A0B.remove(0);
        }
    }

    @Override // com.instagram.common.viewpoint.core.L8
    public final void AAA(AnonymousClass53 anonymousClass53, HA ha, LG lg) {
    }
}
