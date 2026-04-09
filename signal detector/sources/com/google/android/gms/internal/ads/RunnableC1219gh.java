package com.google.android.gms.internal.ads;

import u.C2936e;

/* renamed from: com.google.android.gms.internal.ads.gh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1219gh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0828Yg f14363b;

    public /* synthetic */ RunnableC1219gh(InterfaceC0828Yg interfaceC0828Yg, int i) {
        this.f14362a = i;
        this.f14363b = interfaceC0828Yg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14362a) {
            case 0:
                this.f14363b.destroy();
                break;
            case 1:
                this.f14363b.destroy();
                break;
            case 2:
                this.f14363b.onPause();
                break;
            case 3:
                this.f14363b.onResume();
                break;
            case 4:
                this.f14363b.destroy();
                break;
            case 5:
                this.f14363b.a("onSdkImpression", new C2936e(0));
                break;
            case 6:
                this.f14363b.destroy();
                break;
            default:
                this.f14363b.A0();
                break;
        }
    }
}
