package com.instagram.common.viewpoint.core;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1579jA implements InterfaceC0834Sp {
    public final C0708No A00;
    public final O3 A01;
    public final C0842Sx A02;
    public final C1436gi A03;
    public final boolean A04;

    public C1579jA(C1436gi c1436gi, O3 o32, C0842Sx c0842Sx, C0708No c0708No, boolean z3) {
        this.A03 = c1436gi;
        this.A01 = o32;
        this.A02 = c0842Sx;
        this.A00 = c0708No;
        this.A04 = z3;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        O4 playableWebViewClient = new O4(this.A00, this.A01, this.A04);
        webView.setWebViewClient(playableWebViewClient);
        webView.loadUrl(this.A00.A0L());
        playableWebViewClient.A03();
    }

    private void A01(boolean z3) {
        if (this.A00.A0G() == EnumC0709Np.A05) {
            A00();
            return;
        }
        String strA0L = this.A00.A0L();
        if (z3) {
            C0842Sx c0842Sx = this.A02;
            String markupUrlResult = this.A00.A0L();
            strA0L = c0842Sx.A0S(markupUrlResult);
        }
        this.A00.A0T(strA0L);
        this.A01.AFG();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0834Sp
    public final void ADL() {
        if (this.A04) {
            this.A01.AFF(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0834Sp
    public final void ADT() {
        A01(true);
    }
}
