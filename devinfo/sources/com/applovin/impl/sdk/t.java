package com.applovin.impl.sdk;

import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5734c;

    public /* synthetic */ t(int i4, Object obj, Object obj2) {
        this.f5732a = i4;
        this.f5734c = obj;
        this.f5733b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5732a) {
            case 0:
                ((AppLovinAdServiceImpl.b) this.f5734c).adReceived((com.applovin.impl.sdk.ad.b) this.f5733b);
                break;
            case 1:
                ((AppLovinAdLoadListener) this.f5734c).adReceived((com.applovin.impl.sdk.ad.b) this.f5733b);
                break;
            case 2:
                ((k) this.f5734c).a((AppLovinSdkInitializationConfiguration) this.f5733b);
                break;
            case 3:
                ((k) this.f5734c).b((String) this.f5733b);
                break;
            case 4:
                ((l) this.f5734c).b((AppLovinBidTokenCollectionListener) this.f5733b);
                break;
            default:
                ((n) this.f5734c).a((Long) this.f5733b);
                break;
        }
    }
}
