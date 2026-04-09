package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.3i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C22433i extends C2481Dc {
    public static String[] A0F = {"r3hDWnB1R9y4pEiKAURNp99h2b", "kj3t6dP2tWSOfb61zMSBvgjhGLqlygll", "", "sX8uIgx32JWe8q5WuLHBMtkPG7d", "ZlH8xHdCAMZsgB23qoj", "6lejLSjHGD", "XsRzuVWfX96s5Dei3zwO9zjz9s6FXTfu", "pCK0u"};
    public int A00;
    public C3275dO A01;
    public boolean A02;
    public final AbstractC2895Tf<C22383d> A03;
    public final AbstractC2895Tf<C3Y> A04;
    public final AbstractC2895Tf<DQ> A05;
    public final AbstractC2895Tf<C3Q> A06;
    public final AbstractC2895Tf<DL> A07;
    public final AbstractC2895Tf<DJ> A08;
    public final AbstractC2895Tf<DI> A09;
    public final AbstractC2895Tf<DD> A0A;
    public final AbstractC2895Tf<DC> A0B;
    public final E1 A0C;
    public final DN A0D;
    public final DE A0E;

    public C22433i(C3272dL c3272dL, US us, E1 e12, String str) {
        this(c3272dL, us, e12, str, 0, 0, false, null, null);
    }

    public C22433i(C3272dL c3272dL, US us, E1 e12, String str, int i, int i10, boolean z10, Bundle bundle, Map<String, String> map) {
        super(c3272dL, us, e12, str, !e12.A0p(), i, i10, z10, bundle, map, new C2480Db(c3272dL, e12));
        this.A0E = new DE() { // from class: com.facebook.ads.redexgen.X.3j
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2895Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DF df) {
                this.A00.A0f();
            }
        };
        this.A08 = new C2491Dm(this);
        this.A04 = new C2490Dl(this);
        this.A05 = new C2489Dk(this);
        this.A06 = new C2488Dj(this);
        this.A03 = new C2487Di(this);
        this.A07 = new C2486Dh(this);
        this.A0A = new C2485Dg(this);
        this.A0B = new C2484Df(this);
        this.A09 = new C2496Dr(this);
        this.A0D = new DN() { // from class: com.facebook.ads.redexgen.X.3k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2895Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DO r32) {
                this.A00.A00 = this.A00.A0C.getDuration();
            }
        };
        this.A02 = false;
        this.A0C = e12;
        this.A0C.getEventBus().A03(this.A0E, this.A06, this.A08, this.A05, this.A04, this.A03, this.A07, this.A0A, this.A0B, this.A0D, this.A09);
        if (U7.A2m(c3272dL)) {
            this.A01 = new C3275dO(e12, str, z10, null);
        }
    }

    public C22433i(C3272dL c3272dL, US us, E1 e12, String str, Bundle bundle, Map<String, String> extraParams) {
        this(c3272dL, us, e12, str, 0, 0, false, bundle, extraParams);
    }

    @Override // com.facebook.ads.redexgen.core.C2481Dc
    public final void A0n(EnumC3279dS enumC3279dS, Map<String, String> map) {
        super.A0n(enumC3279dS, map);
        if (this.A01 != null && enumC3279dS == EnumC3279dS.A09) {
            Map<String, String> params = this.A01.A06();
            String[] strArr = A0F;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0F[2] = "tc9";
            map.putAll(params);
        }
    }

    public final void A0p() {
        C2493Do c2493Do = new C2493Do(this);
        if (this.A0C.A0t()) {
            XJ.A00(c2493Do);
            return;
        }
        E1 e12 = this.A0C;
        String[] strArr = A0F;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A0F[1] = "nFCp2DExxe9bklz52WjNRol8ULAuMoj6";
        e12.getStateHandler().post(c2493Do);
    }
}
