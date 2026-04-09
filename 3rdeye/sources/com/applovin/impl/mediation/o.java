package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.mediation.MaxAd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20503c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20504d;

    public /* synthetic */ o(int i, Object obj, Object obj2) {
        this.f20502b = i;
        this.f20503c = obj;
        this.f20504d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20502b) {
            case 0:
                ((MediationServiceImpl.b) this.f20503c).a((MaxAd) this.f20504d);
                break;
            default:
                ((h) this.f20503c).a((Activity) this.f20504d);
                break;
        }
    }
}
