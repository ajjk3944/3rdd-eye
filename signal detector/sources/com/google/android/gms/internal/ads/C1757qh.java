package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.qh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1757qh extends C1649oh {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        final boolean zDidCrash = renderProcessGoneDetail.didCrash();
        final int iRendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        C1273hh c1273hh = this.f16008a;
        if (c1273hh.f14534c.compareAndSet(false, true)) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8764j1)).booleanValue()) {
                return false;
            }
            ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = c1273hh.f14532a;
            if (viewTreeObserverOnGlobalLayoutListenerC1433kh.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewTreeObserverOnGlobalLayoutListenerC1433kh.getParent()).removeView(viewTreeObserverOnGlobalLayoutListenerC1433kh);
            }
            viewTreeObserverOnGlobalLayoutListenerC1433kh.destroy();
            InterfaceC2216z8 interfaceC2216z8 = new InterfaceC2216z8() { // from class: com.google.android.gms.internal.ads.jh
                @Override // com.google.android.gms.internal.ads.InterfaceC2216z8
                public final void g(C2055w9 c2055w9) {
                    int i = ViewTreeObserverOnGlobalLayoutListenerC1433kh.f15183q0;
                    C1462l9 c1462l9B = C1516m9.B();
                    boolean zA = ((C1516m9) c1462l9B.f13551b).A();
                    boolean z6 = zDidCrash;
                    if (zA != z6) {
                        c1462l9B.b();
                        ((C1516m9) c1462l9B.f13551b).C(z6);
                    }
                    c1462l9B.b();
                    ((C1516m9) c1462l9B.f13551b).D(iRendererPriorityAtExit);
                    C1516m9 c1516m9 = (C1516m9) c1462l9B.d();
                    c2055w9.b();
                    ((C2109x9) c2055w9.f13551b).J(c1516m9);
                }
            };
            A8 a8 = viewTreeObserverOnGlobalLayoutListenerC1433kh.f15230o0;
            a8.a(interfaceC2216z8);
            a8.b(10003);
        }
        return true;
    }
}
