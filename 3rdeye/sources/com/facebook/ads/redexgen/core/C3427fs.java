package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3427fs extends AbstractRunnableC2946Vg {
    public static String[] A01 = {"12g74Y80MldwuLH5Sc5BNMhqIci3y3n7", "gYGMtvDgCappq8Eqx1aX2vuQToh52UHd", "GlXHohOtVJhIOcbHhrFcSUyeAoJlZUN4", "CknPoCaYYZqOx1VHoQWkocTpfCeiqOL0", "IgiYYUSARpIlAyCBMTexeC9bH0PhGiJU", "Cia0Frm0699G8jcollxZnIfMYARIEex0", "Mzdi9MK983UUFZlepuPfFCQdgw1DK7MX", "jSW62lJNNGtUKopGO2HTdr7H5wR53AmM"};
    public final /* synthetic */ C3425fq A00;

    public C3427fs(C3425fq c3425fq) {
        this.A00 = c3425fq;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2946Vg
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            C2838Qz c2838Qz = this.A00.A01;
            String[] strArr = A01;
            if (strArr[3].charAt(29) == strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "nnCrEA10h1A2hd08C5n1xIwFCKPiTwdC";
            strArr2[0] = "49SRRBhRmQihygS20ldMlh5Gkuzwxt90";
            c2838Qz.A06().onAdClicked(this.A00.A01.A07());
        }
    }
}
