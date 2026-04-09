package com.instagram.common.viewpoint.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZR implements TA {
    public static ZR A07;
    public static byte[] A08;
    public InterfaceC0666Lx A00;
    public T1 A01;
    public T9 A02;
    public TP A03;
    public U7 A04;
    public VM A05;
    public CY A06;

    static {
        A07();
    }

    public static String A06(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{44, 62, 76, 76, 66, 72, 71, -7, 61, 58, 77, 58, -7, 66, 71, 66, 77, 66, 58, 69, 66, 83, 62, 61, 28, -13, -19, 32, 27, -15, 28, 15, 26, 25, 28, 30, -3, 15, 29, 29, 19, 25, 24, -18, 11, 30, 11, -13, 24, 19, 30, 19, 11, 22, 19, 36, 15, 14};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C1432ge c1432ge) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1432ge);
        this.A06 = A05(c1432ge, this.A03, A03(c1432ge));
        A09(c1432ge, A00(c1432ge, this.A06));
        A0A(c1432ge, this.A06);
        A0B(c1432ge, this.A06);
        if (this.A06 != null) {
            this.A06.A6d();
        }
    }

    public static SR A00(C1432ge c1432ge, CY cy) {
        if (!C0886Up.A1r(c1432ge) || cy == null) {
            return null;
        }
        return SS.A00().A00(cy);
    }

    public static TP A01(C1432ge c1432ge) {
        return TQ.A00().A00(c1432ge, new C1135bp());
    }

    public static synchronized ZR A02() {
        if (A07 == null) {
            A07 = new ZR();
        }
        return A07;
    }

    public static InterfaceC1387fv A03(C1432ge c1432ge) {
        if (!C0886Up.A1n(c1432ge)) {
            return null;
        }
        return C1405gD.A01(c1432ge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.TA
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized CY A9F() {
        return this.A06;
    }

    public static CY A05(C1432ge c1432ge, TP tp, InterfaceC1387fv interfaceC1387fv) {
        if (!C0886Up.A2m(c1432ge) || interfaceC1387fv == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC1428ga.A00().A00(c1432ge, tp, interfaceC1387fv, WI.A04(c1432ge), new ZW(new WA(c1432ge, A06(0, 0, 9), null, EnumC0911Vq.A08, 0, new C0915Vu(), AbstractC0963Xt.A01(C0886Up.A0N(c1432ge)), null, null, new C1555ij()), c1432ge), C1426gY.A00().A00());
    }

    public static void A08() {
        AbstractC0919Vy.A05(A06(30, 28, 52), A06(0, 24, 99), A06(24, 6, 68));
    }

    public static void A09(C1432ge c1432ge, SR sr) {
        if (!C0886Up.A1r(c1432ge) || sr == null) {
            return;
        }
        SP.A00().A00(sr, c1432ge);
    }

    public static void A0A(C1432ge c1432ge, CY cy) {
        if (!C0886Up.A0m(c1432ge) || cy == null) {
            return;
        }
        new C0831Sm(c1432ge, cy, new C0832Sn(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1432ge c1432ge, CY cy) {
        if (cy == null) {
            return;
        }
        AbstractC0890Ut.A00(c1432ge, cy);
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final VA A6n(C1432ge c1432ge) {
        return WW.A01(c1432ge);
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized T9 A74(T8 t82) {
        if (this.A02 == null) {
            this.A02 = new C1002Zg(this);
        }
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized T1 A7G() {
        if (this.A01 == null) {
            this.A01 = new C1437gj();
        }
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized TP A7l(T8 t82) {
        if (this.A03 == null) {
            this.A03 = A01(t82.A02());
        }
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized InterfaceC0847Tc A7n(T8 t82) {
        return new C1330f0(t82);
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized TB A7x(final T8 t82) {
        return new AbstractC1134bo(t82) { // from class: com.facebook.ads.redexgen.X.72
            @Override // com.instagram.common.viewpoint.core.TB
            public final boolean A9m() {
                return TextureViewSurfaceTextureListenerC0436Cz.A09();
            }

            @Override // com.instagram.common.viewpoint.core.TB
            public final void ACP() {
                U2.A06(C0809Rp.A09(super.A00));
            }

            @Override // com.instagram.common.viewpoint.core.TB
            public final void ACn() {
                U2.A07(C0809Rp.A09(super.A00));
            }

            @Override // com.instagram.common.viewpoint.core.TB
            public final void ADI(C1432ge c1432ge) {
                OP.A01(c1432ge);
            }
        };
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized InterfaceC0666Lx A8C(T8 t82) {
        if (!C0886Up.A13(t82)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = AbstractC0667Ly.A00().A00(new C1098bE(t82));
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized TD A8y(T8 t82) {
        return new C1072ao(t82);
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final C1432ge A8z(Context context) {
        C1432ge sdkContext = T7.A00();
        if (sdkContext == null) {
            C1432ge sdkContext2 = new C1432ge(context, this);
            T7.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized VM A90(C1432ge c1432ge) {
        if (this.A05 == null) {
            this.A05 = new XP(c1432ge);
        }
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized U7 A96() {
        if (this.A04 == null) {
            this.A04 = new U7();
            A08();
        }
        return this.A04;
    }
}
