package com.applovin.impl.adview;

import android.view.KeyEvent;
import android.webkit.WebView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f3717b;

    public /* synthetic */ t(KeyEvent.Callback callback, int i4) {
        this.f3716a = i4;
        this.f3717b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3716a) {
            case 0:
                ((f) this.f3717b).e();
                break;
            case 1:
                ((f) this.f3717b).f();
                break;
            default:
                ((WebView) this.f3717b).setVisibility(0);
                break;
        }
    }
}
