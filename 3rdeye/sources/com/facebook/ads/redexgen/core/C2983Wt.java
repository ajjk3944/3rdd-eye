package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2983Wt implements SS {
    public static C2983Wt A07;
    public static byte[] A08;
    public LL A00;
    public SJ A01;
    public SR A02;
    public InterfaceC2871Sh A03;
    public TP A04;
    public InterfaceC2919Ue A05;
    public InterfaceC2442Bn A06;

    static {
        A07();
    }

    public static String A06(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{15, 13, 13, 18, 13, 17, 14, 58, 13, 31, 45, 45, 35, 41, 40, -38, 30, 27, 46, 27, -38, 35, 40, 35, 46, 35, 27, 38, 35, 52, 31, 30, 28, 15, 26, 25, 28, 30, -3, 15, 29, 29, 19, 25, 24, -18, 11, 30, 11, -13, 24, 19, 30, 19, 11, 22, 19, 36, 15, 14};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C3246cu c3246cu) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c3246cu);
        this.A06 = A05(c3246cu, this.A03, A03(c3246cu));
        A09(c3246cu, A00(c3246cu, this.A06));
        A0A(c3246cu, this.A06);
        A0B(c3246cu, this.A06);
        if (this.A06 != null) {
            this.A06.A6V();
        }
    }

    public static InterfaceC2848Rj A00(C3246cu c3246cu, InterfaceC2442Bn interfaceC2442Bn) {
        if (!U7.A1m(c3246cu) || interfaceC2442Bn == null) {
            return null;
        }
        return AbstractC2849Rk.A00().A00(interfaceC2442Bn);
    }

    public static InterfaceC2871Sh A01(C3246cu c3246cu) {
        return AbstractC2872Si.A00().A00(c3246cu, new YJ());
    }

    public static synchronized C2983Wt A02() {
        if (A07 == null) {
            A07 = new C2983Wt();
        }
        return A07;
    }

    public static InterfaceC3351ed A03(C3246cu c3246cu) {
        if (!U7.A1i(c3246cu)) {
            return null;
        }
        return C3369ev.A01(c3246cu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.SS
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC2442Bn A97() {
        return this.A06;
    }

    public static InterfaceC2442Bn A05(C3246cu c3246cu, InterfaceC2871Sh interfaceC2871Sh, InterfaceC3351ed interfaceC3351ed) {
        if (!U7.A2e(c3246cu) || interfaceC3351ed == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC3391fI.A00().A00(c3246cu, interfaceC2871Sh, interfaceC3351ed, VZ.A04(c3246cu), new X8(new VR(c3246cu, A06(0, 0, 9), null, V6.A08, 0, new VB(), X7.A01(U7.A0N(c3246cu)), null, null, new C3504hB()), c3246cu), C3389fG.A00().A00());
    }

    public static void A08() {
        VF.A05(A06(32, 28, 52), A06(8, 24, 68), A06(0, 8, 99));
    }

    public static void A09(C3246cu c3246cu, InterfaceC2848Rj interfaceC2848Rj) {
        if (!U7.A1m(c3246cu) || interfaceC2848Rj == null) {
            return;
        }
        AbstractC2846Rh.A00().A00(interfaceC2848Rj, c3246cu);
    }

    public static void A0A(C3246cu c3246cu, InterfaceC2442Bn interfaceC2442Bn) {
        if (!U7.A0m(c3246cu) || interfaceC2442Bn == null) {
            return;
        }
        new S4(c3246cu, interfaceC2442Bn, new S5(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C3246cu c3246cu, InterfaceC2442Bn interfaceC2442Bn) {
        if (interfaceC2442Bn == null) {
            return;
        }
        UB.A00(c3246cu, interfaceC2442Bn);
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final US A6f(C3246cu c3246cu) {
        return VG.A01(c3246cu);
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized SR A6w(SQ sq) {
        if (this.A02 == null) {
            this.A02 = new XI(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized SJ A78() {
        if (this.A01 == null) {
            this.A01 = new C3295di();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized InterfaceC2871Sh A7d(SQ sq) {
        if (this.A03 == null) {
            this.A03 = A01(sq.A02());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized InterfaceC2884Su A7f(SQ sq) {
        return new C3045Zd(sq);
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized ST A7p(final SQ sq) {
        return new YI(sq) { // from class: com.facebook.ads.redexgen.X.6K
            @Override // com.facebook.ads.redexgen.core.ST
            public final boolean A9e() {
                return CM.A09();
            }

            @Override // com.facebook.ads.redexgen.core.ST
            public final void ABq() {
                TK.A06(RB.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.ST
            public final void ACE() {
                TK.A07(RB.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.ST
            public final void ACe(C3246cu c3246cu) {
                AbstractC2748Nl.A01(c3246cu);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized LL A84(SQ sq) {
        if (!U7.A13(sq)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = LM.A00().A00(new YH(sq));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized SV A8q(SQ sq) {
        return new XN(sq);
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final C3246cu A8r(Context context) {
        C3246cu sdkContext = SP.A00();
        if (sdkContext == null) {
            C3246cu sdkContext2 = new C3246cu(context, this);
            SP.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized InterfaceC2919Ue A8s(C3246cu c3246cu) {
        if (this.A05 == null) {
            this.A05 = new VO(c3246cu);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.SS
    public final synchronized TP A8y() {
        if (this.A04 == null) {
            this.A04 = new TP();
            A08();
        }
        return this.A04;
    }
}
