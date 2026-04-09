package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k00 extends i00 {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean zDidCrash = renderProcessGoneDetail.didCrash();
        int iRendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        b00 b00Var = this.f12081a;
        if (b00Var.f9523c.compareAndSet(false, true)) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16176j1)).booleanValue()) {
                return false;
            }
            e00 e00Var = b00Var.f9521a;
            if (e00Var.getParent() instanceof ViewGroup) {
                ((ViewGroup) e00Var.getParent()).removeView(e00Var);
            }
            e00Var.destroy();
            d00 d00Var = new d00(iRendererPriorityAtExit, zDidCrash);
            li liVar = e00Var.f10633a0;
            liVar.a(d00Var);
            liVar.b(10003);
        }
        return true;
    }
}
