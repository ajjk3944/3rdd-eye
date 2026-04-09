package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f5747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinSdk.SdkInitializationListener f5748c;

    public /* synthetic */ w(k kVar, AppLovinSdk.SdkInitializationListener sdkInitializationListener, int i4) {
        this.f5746a = i4;
        this.f5747b = kVar;
        this.f5748c = sdkInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5746a) {
            case 0:
                this.f5747b.a(this.f5748c);
                break;
            default:
                this.f5747b.b(this.f5748c);
                break;
        }
    }
}
