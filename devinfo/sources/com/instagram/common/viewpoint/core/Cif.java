package com.instagram.common.viewpoint.core;

import android.view.View;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.if, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class Cif extends N2 {
    public static byte[] A01;
    public static String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ C1550id A00;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 112, 105, 47, 35, 34, 56, 62, 35, 32, 32, 41, 62, 108, 37, Utf8.REPLACEMENT_BYTE, 108, 34, 57, 32, 32};
    }

    static {
        A01();
    }

    public Cif(C1550id c1550id) {
        this.A00 = c1550id;
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A02() {
        if (this.A00.A01 == null) {
            this.A00.A04 = false;
            this.A00.A07.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A04() {
        if (this.A00.A01 != null) {
            this.A00.A01.show();
            return;
        }
        this.A00.A04 = false;
        if (this.A00.A03 != null && C0886Up.A2D(this.A00.A06)) {
            this.A00.A03.A0S(new C1552ig(this));
            this.A00.A03.A0N();
            this.A00.A03.A0K();
            this.A00.A03 = null;
        }
        this.A00.A07.onInterstitialDismissed(this.A00.A08.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A05() {
        this.A00.A07.onInterstitialDisplayed(this.A00.A08.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A06() {
        this.A00.A07.onRewardedAdServerFailed();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A07() {
        this.A00.A07.onRewardedAdServerSucceeded();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A08() {
        this.A00.A07.onRewardedAdCompleted();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0C() {
        this.A00.A06.A0F().A3K();
        this.A00.A07.onAdClicked(this.A00.A08.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0D() {
        this.A00.A07.onLoggingImpression(this.A00.A08.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0E(View view) {
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0F(N1 n12) {
        if (this.A00.A03 != null) {
            this.A00.A05 = true;
            this.A00.A02 = this.A00.A03.A0I();
            if (!(this.A00.A02 instanceof AbstractC1601jd)) {
                InterstitialAdExtendedListener interstitialAdExtendedListener = this.A00.A07;
                String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    interstitialAdExtendedListener.onAdLoaded(this.A00.A08.A6k());
                    return;
                }
            } else {
                AbstractC1601jd abstractC1601jd = (AbstractC1601jd) this.A00.A02;
                if (abstractC1601jd.A26() > 0) {
                    XC xc2 = new XC();
                    if (xc2.A09(this.A00.A06, this.A00.A08.A08(), abstractC1601jd.A26())) {
                        xc2.A08(this.A00.A06, true);
                        this.A00.A01 = xc2.A06(this.A00.A06, this.A00.A08.A0A(), this.A00.A08.A08());
                    } else {
                        C1550id c1550id = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            xc2.A08(c1550id.A06, false);
                        } else {
                            String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            xc2.A08(c1550id.A06, false);
                        }
                    }
                }
                C1550id c1550id2 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    if (c1550id2.A01 != null) {
                        abstractC1601jd.A2J(true);
                        InterstitialAd.InterstitialLoadAdConfig loadAdConfig = this.A00.A01.buildLoadAdConfig().withAdListener(new OH(this, abstractC1601jd)).withCacheFlags(this.A00.A08.A0B()).withRewardData(this.A00.A08.A03()).build();
                        this.A00.A01.loadAd(loadAdConfig);
                        return;
                    }
                    C1550id c1550id3 = this.A00;
                    String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        c1550id3.A07.onAdLoaded(this.A00.A08.A6k());
                        return;
                    } else {
                        A02[2] = "joZPUUFug9Ts";
                        c1550id3.A07.onAdLoaded(this.A00.A08.A6k());
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        this.A00.A06.A08().ABC(A00(0, 3, 98), AbstractC0848Td.A0N, new C0849Te(A00(3, 18, 46)));
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0G(C0908Vm c0908Vm) {
        this.A00.A06.A0F().A3N(Y1.A01(this.A00.A00), c0908Vm.A03().getErrorCode(), c0908Vm.A04());
        this.A00.A07.onError(this.A00.A08.A6k(), XE.A00(c0908Vm));
    }
}
