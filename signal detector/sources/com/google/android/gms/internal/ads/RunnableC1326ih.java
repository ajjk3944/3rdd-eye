package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ih, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1326ih implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1433kh f14750b;

    public /* synthetic */ RunnableC1326ih(ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh, int i) {
        this.f14749a = i;
        this.f14750b = viewTreeObserverOnGlobalLayoutListenerC1433kh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14749a) {
            case 0:
                super/*android.webkit.WebView*/.destroy();
                break;
            default:
                this.f14750b.H();
                break;
        }
    }
}
