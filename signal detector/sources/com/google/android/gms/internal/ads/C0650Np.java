package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.webkit.WebView;
import j$.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import s2.BinderC2894d;
import t2.C2911G;
import t2.HandlerC2908D;

/* renamed from: com.google.android.gms.internal.ads.Np, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650Np extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10069a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Timer f10070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10071c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10072d;

    public C0650Np(BinderC0718Rp binderC0718Rp, AlertDialog alertDialog, Timer timer, BinderC2894d binderC2894d) {
        this.f10071c = alertDialog;
        this.f10070b = timer;
        this.f10072d = binderC2894d;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i = this.f10069a;
        Timer timer = this.f10070b;
        Object obj = this.f10071c;
        Object obj2 = this.f10072d;
        switch (i) {
            case 0:
                ((AlertDialog) obj).dismiss();
                timer.cancel();
                BinderC2894d binderC2894d = (BinderC2894d) obj2;
                if (binderC2894d != null) {
                    binderC2894d.z();
                    return;
                }
                return;
            default:
                WebView webView = ((Vv) obj2).f12108b;
                int i3 = T0.f.f3557a;
                if (!U0.m.f3682d.b()) {
                    throw U0.m.a();
                }
                ((WebViewProviderBoundaryInterface) T0.f.c(webView).f73b).removeWebMessageListener("omidJsSessionService");
                ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = ((C1273hh) ((Rx) obj).f11090b).f14532a;
                HandlerC2908D handlerC2908D = C2911G.f23576l;
                Objects.requireNonNull(viewTreeObserverOnGlobalLayoutListenerC1433kh);
                handlerC2908D.post(new RunnableC1219gh(viewTreeObserverOnGlobalLayoutListenerC1433kh, 0));
                timer.cancel();
                return;
        }
    }

    public C0650Np(Vv vv, Rx rx, Timer timer) {
        this.f10071c = rx;
        this.f10070b = timer;
        Objects.requireNonNull(vv);
        this.f10072d = vv;
    }
}
