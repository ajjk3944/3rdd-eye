package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdListener f8931a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f8932b;

    public h(AdListener adListener, Ad ad2) {
        this.f8931a = adListener;
        this.f8932b = ad2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8931a.onError(this.f8932b, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network folder is inside of assets folder."));
    }
}
