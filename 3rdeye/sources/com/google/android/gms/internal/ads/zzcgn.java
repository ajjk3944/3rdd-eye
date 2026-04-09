package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
@TargetApi(21)
/* loaded from: classes2.dex */
public final class zzcgn extends zzcgm {
    public zzcgn(zzcfe zzcfeVar, zzbca zzbcaVar, boolean z10, zzecd zzecdVar) {
        super(zzcfeVar, zzbcaVar, z10, zzecdVar);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzY(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
