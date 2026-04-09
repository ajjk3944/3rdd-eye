package com.instagram.common.viewpoint.core;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: assets/audience_network/classes2.dex */
public class UH extends WebViewClient {
    public final /* synthetic */ UI A00;

    public UH(UI ui2) {
        this.A00 = ui2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1082ay.A0D(AbstractC0848Td.A2j);
        return true;
    }
}
