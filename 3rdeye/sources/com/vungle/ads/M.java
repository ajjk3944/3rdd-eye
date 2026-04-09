package com.vungle.ads;

import com.vungle.ads.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class M implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23798b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L f23799c;

    public /* synthetic */ M(L l5, int i) {
        this.f23798b = i;
        this.f23799c = l5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23798b) {
            case 0:
                L.b.m20onAdImpression$lambda1(this.f23799c);
                break;
            default:
                L.b.m18onAdClick$lambda3(this.f23799c);
                break;
        }
    }
}
