package com.applovin.impl.mediation;

import com.applovin.impl.c3;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.h;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4837c;

    public /* synthetic */ r(int i4, Object obj, Object obj2) {
        this.f4835a = i4;
        this.f4836b = obj;
        this.f4837c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4835a) {
            case 0:
                ((h.b) this.f4836b).a((MaxError) this.f4837c);
                break;
            case 1:
                ((MediationServiceImpl.b) this.f4836b).a((MaxAd) this.f4837c);
                break;
            case 2:
                ((b) this.f4836b).c((c3) this.f4837c);
                break;
            case 3:
                ((c) this.f4836b).a((c3) this.f4837c);
                break;
            default:
                ((h) this.f4836b).a((Runnable) this.f4837c);
                break;
        }
    }
}
