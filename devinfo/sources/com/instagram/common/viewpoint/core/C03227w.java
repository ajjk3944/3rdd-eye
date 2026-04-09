package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03227w extends AbstractC1605jh {
    public static C0842Sx A0D;
    public static byte[] A0E;
    public static String[] A0F = {"g9SdUg6XNSnvVCS02jX19aczyGq48qDV", "lGSQ9LsgX83H3UqklEPZgAjaPEKabNT0", "y0oXMo4BXc2on8MNFvJxgBv", "Ulfd9L14l0ScyK0QB689zsPu0EZ5wfqr", "W3xKKEfUMxBXJmvfztSkCM8j4ls7Vw3H", "lNYBpqeQZYlfeCveDiVEAZh", "rx8", "elj"};
    public long A00;
    public NJ A01;
    public NK A02;
    public NQ A03;
    public C1436gi A04;
    public WK A05;
    public C1220dC A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public final String A0B = UUID.randomUUID().toString();
    public final AtomicBoolean A0C = new AtomicBoolean();

    public static String A05(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0E = new byte[]{-98, -16, -14, -14, -12, -5, -12, 1, -2, -4, -12, 3, -12, 1, -18, 1, -2, 3, -16, 3, -8, -2, -3, -58, -45, -60, -58, -56, -39, -50, -37, -50, -39, -34, 1, 6, -1, 7, 12, 3, 2, -33, 2, -30, -1, 18, -1, -32, 19, 12, 2, 10, 3, 29, 21, 20, 25, 17, 36, 25, 31, 30, -12, 17, 36, 17, 16, 12, 1, 3, 5, 13, 5, 14, 20, -23, 4, -68, -66, -79, -80, -79, -78, -75, -70, -79, -80, -101, -66, -75, -79, -70, -64, -83, -64, -75, -69, -70, -105, -79, -59, -17, -30, -18, -14, -30, -16, -15, -47, -26, -22, -30, -2, -15, 3, -19, -2, -16, -33, -15, -2, 2, -15, -2, -31, -34, -40, -13, -26, -8, -30, -13, -27, -26, -27, -41, -22, -27, -26, -16, -62, -27, -59, -30, -11, -30, -61, -10, -17, -27, -19, -26, 28, 15, 33, 11, 28, 14, 15, 14, 9, 32, 19, 14, 15, 25, -61, -68, -73, -65, -61, -77, -105, -78, -4, -17, -21, -3, -38, -1, -10, -21};
    }

    static {
        A09();
    }

    private void A07() {
        P2.A00(this.A04).A06(this.A02, this.A02.A00());
    }

    private void A08() {
        if (this.A02 != null) {
            try {
                P2.A00(this.A04).A05(this.A02);
            } catch (Exception unused) {
            }
        }
    }

    private void A0A(Intent intent) {
        int i4 = super.A00;
        String strA05 = A05(77, 24, 25);
        if (i4 != -1 && Settings.System.getInt(this.A04.getContentResolver(), A05(1, 22, 92), 0) != 1) {
            int i10 = super.A00;
            String[] strArr = A0F;
            if (strArr[4].charAt(19) == strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "RWC7frN5DjKRH0uo4BJmLzj";
            strArr2[2] = "FPcb0UYEDF6wwONX6Ty9E2F";
            intent.putExtra(strA05, i10);
            return;
        }
        C1436gi c1436gi = this.A04;
        String[] strArr3 = A0F;
        if (strArr3[7].length() == strArr3[6].length()) {
            String[] strArr4 = A0F;
            strArr4[5] = "O4w3do1khQsKhsE3USwlJ7C";
            strArr4[2] = "rALKIAVwphrvKmHx0hqaLzY";
            if (C0886Up.A0h(c1436gi)) {
                return;
            }
        } else if (C0886Up.A0h(c1436gi)) {
            return;
        }
        intent.putExtra(strA05, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(final C1436gi c1436gi, final C1595jT c1595jT, final int i4) {
        if (i4 >= c1595jT.A23()) {
            return;
        }
        final C03117l c03117l = (C03117l) c1595jT.A27(i4);
        A0D = new C0842Sx(c1436gi);
        A0D.A0e(new VI(c03117l.A2E(), c1436gi.A0A()));
        O6.A02(c1436gi, A0D, c03117l);
        final boolean z3 = i4 == 0;
        A0D.A0X(new AbstractC1575j4(z3) { // from class: com.facebook.ads.redexgen.X.7x
            @Override // com.instagram.common.viewpoint.core.AbstractC1575j4
            public final void A00() {
                this.A01.A01.AFp(this.A01, AdError.CACHE_ERROR);
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC1575j4
            public final void A01(boolean z10) {
                C03227w.A0D = null;
                if (z10) {
                    c1436gi.A01().AJE(c03117l.A2E(), c1595jT.A28());
                }
                if (i4 == c1595jT.A25()) {
                    this.A01.A0C.set(true);
                    this.A01.A01.AFm(this.A01);
                }
                this.A01.A0C(c1436gi, c1595jT, i4 + 1);
            }
        }, new C0835Sq(c03117l.A1D(), A05(152, 14, 119), i4));
    }

    private void A0D(boolean z3) {
        if (this.A05 == WK.A0G) {
            A0F(z3);
            return;
        }
        if (this.A05 == WK.A0I) {
            A0G(z3);
        } else if (this.A05 == WK.A0H) {
            A0E(z3);
        } else {
            A0G(z3);
        }
    }

    private void A0E(boolean z3) {
        C0842Sx c0842Sx = new C0842Sx(this.A04);
        boolean z10 = C0886Up.A2H(this.A04) && SN.A0A(this.A03.A1H());
        if (z10) {
            SN unifiedAssetsLoader = new SN(c0842Sx, this.A03.A1H(), this.A03.A10(), this.A03.A1D(), z10, new C1613jp(this));
            c0842Sx.A0e(new VI(((AbstractC1601jd) this.A03).A2E(), this.A04.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        O5.A02(this.A04, (AbstractC1601jd) this.A03, z3, new C1612jo(this));
    }

    private void A0F(boolean z3) {
        C0842Sx c0842Sx = new C0842Sx(this.A04);
        c0842Sx.A0e(new VI(((AbstractC1601jd) this.A03).A2E(), this.A04.A0A()));
        O6.A03(this.A04, c0842Sx, (C03117l) this.A03);
        c0842Sx.A0X(new C1617jt(this), new C0835Sq(this.A03.A1D(), A05(152, 14, 119)));
    }

    private void A0G(boolean z3) {
        boolean z10 = false;
        if (this.A03.A1b()) {
            C1595jT c1595jT = (C1595jT) this.A03;
            for (int i4 = 0; i4 < c1595jT.A23(); i4++) {
                if (TextUtils.isEmpty(c1595jT.A27(i4).A29().A0H().A09())) {
                    this.A01.AFp(this, AdError.INTERNAL_ERROR);
                    return;
                }
            }
            A0C(this.A04, c1595jT, 0);
            return;
        }
        C0842Sx c0842Sx = new C0842Sx(this.A04);
        c0842Sx.A0e(new VI(((AbstractC1601jd) this.A03).A2E(), this.A04.A0A()));
        if (C0886Up.A2H(this.A04) && SN.A0A(this.A03.A1H())) {
            z10 = true;
        }
        boolean zA1g = this.A03.A1g();
        if (z10) {
            SN unifiedAssetsLoader = new SN(c0842Sx, this.A03.A1H(), this.A03.A10(), this.A03.A1D(), z10, new C1615jr(this, zA1g));
            unifiedAssetsLoader.A0B();
            return;
        }
        C03117l c03117l = (C03117l) this.A03;
        if (TextUtils.isEmpty(c03117l.A29().A0H().A09())) {
            if (this.A05 == WK.A0J) {
                this.A04.A0F().AEQ();
            }
            this.A01.AFp(this, AdError.INTERNAL_ERROR);
        } else {
            O6.A02(this.A04, c0842Sx, c03117l);
            c0842Sx.A0X(new C03247y(this, z3, zA1g, c03117l, this), new C0835Sq(c03117l.A1D(), A05(152, 14, 119)));
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1605jh
    public final int A0H() {
        if (this.A03 == null) {
            return -1;
        }
        return this.A03.A0p();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1605jh
    public final NQ A0I() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1605jh
    public final boolean A0J() throws SecurityException {
        if (!this.A0C.get()) {
            return false;
        }
        this.A03.A1J(super.A01);
        String strA04 = C1304ea.A04(super.A02, this.A0B, this.A07);
        this.A03.A1K(super.A02);
        this.A03.A1O(strA04);
        AdActivityIntent adActivityIntentA05 = C0940Wu.A05(this.A04);
        adActivityIntentA05.putExtra(A05(174, 8, 83), this.A05);
        adActivityIntentA05.putExtra(A05(127, 25, 78), this.A03);
        adActivityIntentA05.putExtra(A05(34, 19, FacebookMediationAdapter.ERROR_NULL_CONTEXT), this.A03);
        adActivityIntentA05.putExtra(A05(166, 8, 27), this.A0B);
        if (strA04 != null) {
            adActivityIntentA05.putExtra(A05(AppLovinMediationAdapter.ERROR_CHILD_USER, 15, 89), strA04);
        }
        adActivityIntentA05.putExtra(A05(66, 11, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD), this.A0A);
        adActivityIntentA05.putExtra(A05(101, 11, 74), this.A00);
        if (this.A09 != null) {
            adActivityIntentA05.putExtra(A05(53, 13, 125), this.A09);
        }
        A0A(adActivityIntentA05);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            adActivityIntentA05.setFlags(adActivityIntentA05.getFlags() | 268435456);
        }
        ActivityUtils.A03(this.A04);
        try {
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!C0940Wu.A0I(this.A04, adActivityIntentA05)) {
                    this.A04.A0F().AIC();
                    if (this.A01 != null) {
                        this.A01.AFp(this, AdError.AD_PRESENTATION_ERROR);
                    }
                    return false;
                }
                return true;
            }
            C0940Wu.A0B(this.A04, adActivityIntentA05);
            return true;
        } catch (C0938Ws e2) {
            String[] strArr = A0F;
            if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[7] = "zr3";
            strArr2[6] = "zCM";
            Throwable cause = e2.getCause();
            Throwable cause2 = e2;
            if (cause != null) {
                cause2 = e2.getCause();
            }
            this.A04.A08().ABC(A05(23, 11, 50), AbstractC0848Td.A01, new C0849Te(cause2));
            return true;
        }
    }

    public final void A0K(C1436gi c1436gi, NJ nj2, O8 o82, boolean z3, String str, String str2) {
        String strA05;
        this.A0C.set(false);
        this.A04 = c1436gi;
        this.A01 = nj2;
        this.A0A = o82.A02();
        this.A00 = o82.A00();
        this.A09 = str2;
        if (this.A0A != null) {
            String str3 = this.A0A;
            String strA052 = A05(0, 1, 12);
            String[] strArr = A0F;
            if (strArr[7].length() == strArr[6].length()) {
                String[] strArr2 = A0F;
                strArr2[7] = "x5W";
                strArr2[6] = "dMK";
                strA05 = str3.split(strA052)[0];
            }
            throw new RuntimeException();
        }
        strA05 = A05(0, 0, 100);
        this.A07 = strA05;
        this.A03 = NQ.A03(o82.A03(), this.A04);
        this.A03.A1M(str);
        this.A03.A1I(o82.A01().A06());
        if (this.A03.A1b()) {
            this.A08 = ((C1595jT) this.A03).A2A();
        } else {
            this.A08 = ((AbstractC1601jd) this.A03).A2E();
        }
        if (this.A03.A1g()) {
            this.A05 = WK.A08;
            if (this.A03.A1U()) {
                this.A04.A0F().AJt(M5.A08);
            } else {
                this.A04.A0F().AJt(M5.A0A);
            }
        } else {
            switch (this.A03.A0o()) {
                case 0:
                    this.A05 = WK.A0I;
                    this.A04.A0F().AJt(M5.A0D);
                    break;
                case 1:
                    this.A05 = WK.A0H;
                    this.A04.A0F().AJt(M5.A0C);
                    break;
                case 2:
                    this.A05 = WK.A05;
                    this.A04.A0F().AJt(M5.A05);
                    break;
                case 3:
                    this.A05 = WK.A0G;
                    this.A04.A0F().AJt(M5.A04);
                    break;
                case 4:
                    this.A05 = WK.A0J;
                    this.A04.A0F().AJt(M5.A0E);
                    break;
            }
        }
        if (C0886Up.A0v(c1436gi)) {
            NQ nq = this.A03;
            String[] strArr3 = A0F;
            if (strArr3[4].charAt(19) != strArr3[0].charAt(19)) {
                String[] strArr4 = A0F;
                strArr4[4] = "c2SjyVfNFMTSQhwflPzyjFy3Fjr2snH4";
                strArr4[0] = "k4vT1WhZbJ1Mlr1eks5fTJscMmdnfo8D";
                if (nq.A1b()) {
                    C1595jT c1595jT = (C1595jT) this.A03;
                    for (int iA23 = c1595jT.A23() - 1; iA23 >= 0; iA23--) {
                        AbstractC1601jd abstractC1601jdA27 = c1595jT.A27(iA23);
                        if (AbstractC0692Mx.A06(this.A04, AbstractC0692Mx.A01(c1436gi, abstractC1601jdA27.A1H(), abstractC1601jdA27.A2E()), c1436gi.A0A())) {
                            this.A04.A0F().A52();
                            c1595jT.A2C(iA23);
                            return;
                        }
                    }
                    if (c1595jT.A23() == 0) {
                        this.A01.AFp(this, AdError.NO_FILL);
                        return;
                    }
                } else if (AbstractC0692Mx.A06(this.A04, AbstractC0692Mx.A01(c1436gi, o82.A03(), ((AbstractC1601jd) this.A03).A2E()), c1436gi.A0A())) {
                    this.A04.A0F().A52();
                    this.A01.AFp(this, AdError.NO_FILL);
                    return;
                }
            }
            throw new RuntimeException();
        }
        this.A02 = new NK(this.A0B, this, nj2);
        A07();
        A0D(z3);
    }

    @Override // com.instagram.common.viewpoint.core.N1
    public final String A7O() {
        return this.A08;
    }

    @Override // com.instagram.common.viewpoint.core.N1
    public final boolean AKL() {
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.N1
    public final void onDestroy() {
        A08();
    }
}
