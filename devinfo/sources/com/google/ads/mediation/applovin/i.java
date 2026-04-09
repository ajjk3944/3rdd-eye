package com.google.ads.mediation.applovin;

import bb.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f8982a;

    public i(k kVar) {
        this.f8982a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = this.f8982a;
        kVar.rewardedAdCallback = (x) kVar.adLoadCallback.onSuccess(kVar);
    }
}
