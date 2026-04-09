package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Zg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3048Zg {
    public static String[] A07 = {"MaUhfef1XHChQSOAsPU", "01oMUC4JT554rhL", "9TYVZPZrh7WqyaB", "ShOi1FYvFM9bF84GqYiu0GZZ4HOF35Af", "s", "YvdeaQsxQHJ3CZVDgFIjqRdATcpqYXuO", "b384kAccrLIUxrnk6NdGu", "f4PnsWwvvRSNWXAtteJ0H"};
    public final String A00 = C3048Zg.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<LH> A03;
    public final WeakReference<InterfaceC3049Zh> A04;
    public final WeakReference<C3345eX> A05;
    public final WeakReference<C2668Ki> A06;

    public C3048Zg(C2668Ki c2668Ki, InterfaceC3049Zh interfaceC3049Zh, C3345eX c3345eX, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C3272dL c3272dL) {
        this.A06 = new WeakReference<>(c2668Ki);
        this.A04 = new WeakReference<>(interfaceC3049Zh);
        this.A05 = new WeakReference<>(c3345eX);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c3272dL.A0F());
    }

    private LH A00() {
        LH funnel = this.A03.get();
        if (funnel == null) {
            return new C3608j3();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return AbstractC2981Wr.A01(T5.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i, String str) {
        A00().AK6(i, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AK7();
        if (this.A06.get() != null && this.A01.get() != null && this.A02.get() != null && this.A02.get().get()) {
            this.A01.get().set(true);
            A00().AK8();
            if (this.A06.get().isShown()) {
                A00().AK9();
                new Handler(Looper.getMainLooper()).post(new C2674Ko(this.A05));
            }
            InterfaceC3049Zh interfaceC3049Zh = this.A04.get();
            if (interfaceC3049Zh != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC3047Zf(this, interfaceC3049Zh));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C2668Ki webView = this.A06.get();
        if (webView == null || webView.A0J()) {
            A00().AKA(true);
            return;
        }
        InterfaceC3049Zh interfaceC3049Zh = this.A04.get();
        if (interfaceC3049Zh == null) {
            A00().AKA(true);
            return;
        }
        LH lhA00 = A00();
        String[] strArr = A07;
        if (strArr[3].charAt(2) == strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        A07[6] = "MExJxptNjWm815DyzsGP1";
        lhA00.AKA(false);
        interfaceC3049Zh.AET();
    }
}
