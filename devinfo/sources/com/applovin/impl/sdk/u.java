package com.applovin.impl.sdk;

import android.util.Log;
import com.applovin.impl.t2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.Map;
import me.j2;
import p.r3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5737c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5739e;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, boolean z3, int i4) {
        this.f5735a = i4;
        this.f5738d = obj;
        this.f5737c = obj2;
        this.f5739e = obj3;
        this.f5736b = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5735a) {
            case 0:
                ((EventServiceImpl) this.f5738d).a((String) this.f5737c, (Map) this.f5739e, this.f5736b);
                break;
            case 1:
                t2.a(this.f5736b, (MaxAdListener) this.f5738d, (String) this.f5737c, (MaxError) this.f5739e);
                break;
            case 2:
                t2.a(this.f5736b, (MaxNativeAdListener) this.f5738d, (MaxNativeAdView) this.f5737c, (MaxAd) this.f5739e);
                break;
            case 3:
                t2.a(this.f5736b, (MaxAdListener) this.f5738d, (MaxAd) this.f5737c, (MaxError) this.f5739e);
                break;
            case 4:
                t2.a(this.f5736b, (MaxNativeAdListener) this.f5738d, (String) this.f5737c, (MaxError) this.f5739e);
                break;
            case 5:
                t2.a(this.f5736b, (MaxAdExpirationListener) this.f5738d, (MaxAd) this.f5737c, (MaxAd) this.f5739e);
                break;
            case 6:
                t2.a(this.f5736b, (MaxRewardedAdListener) this.f5738d, (MaxAd) this.f5737c, (MaxReward) this.f5739e);
                break;
            default:
                r3 r3Var = (r3) this.f5738d;
                j2 j2Var = (j2) this.f5737c;
                le.c cVar = (le.c) this.f5739e;
                r3Var.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                ((pe.a) r3Var.f30845b).d(j2Var, cVar.f28708a, this.f5736b);
                break;
        }
    }

    public /* synthetic */ u(boolean z3, Object obj, Object obj2, Object obj3, int i4) {
        this.f5735a = i4;
        this.f5736b = z3;
        this.f5738d = obj;
        this.f5737c = obj2;
        this.f5739e = obj3;
    }
}
