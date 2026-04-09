package com.instagram.common.viewpoint.core;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1957jA implements InterfaceC1212Sp {
    public final C1086No A00;
    public final O3 A01;
    public final C1220Sx A02;
    public final C1814gi A03;
    public final boolean A04;

    public C1957jA(C1814gi c1814gi, O3 o32, C1220Sx c1220Sx, C1086No c1086No, boolean z10) {
        this.A03 = c1814gi;
        this.A01 = o32;
        this.A02 = c1220Sx;
        this.A00 = c1086No;
        this.A04 = z10;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        O4 playableWebViewClient = new O4(this.A00, this.A01, this.A04);
        webView.setWebViewClient(playableWebViewClient);
        webView.loadUrl(this.A00.A0L());
        playableWebViewClient.A03();
    }

    private void A01(boolean z10) {
        if (this.A00.A0G() == EnumC1087Np.A05) {
            A00();
            return;
        }
        String strA0L = this.A00.A0L();
        if (z10) {
            C1220Sx c1220Sx = this.A02;
            String markupUrlResult = this.A00.A0L();
            strA0L = c1220Sx.A0S(markupUrlResult);
        }
        this.A00.A0T(strA0L);
        this.A01.AFG();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1212Sp
    public final void ADL() {
        if (this.A04) {
            this.A01.AFF(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1212Sp
    public final void ADT() {
        A01(true);
    }
}
