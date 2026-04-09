package com.applovin.impl;

import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class T implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18862b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18863c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18866f;

    public /* synthetic */ T(EventServiceImpl eventServiceImpl, String str, Map map, boolean z10) {
        this.f18864d = eventServiceImpl;
        this.f18865e = str;
        this.f18866f = map;
        this.f18863c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18862b) {
            case 0:
                l2.a(this.f18863c, (MaxRewardedAdListener) this.f18864d, (MaxAd) this.f18865e, (MaxReward) this.f18866f);
                break;
            case 1:
                ((EventServiceImpl) this.f18864d).a((String) this.f18865e, (Map) this.f18866f, this.f18863c);
                break;
            default:
                com.vungle.ads.internal.presenter.g.m89processCommand$lambda10((com.vungle.ads.internal.presenter.g) this.f18864d, this.f18863c, (String) this.f18865e, (String) this.f18866f);
                break;
        }
    }

    public /* synthetic */ T(com.vungle.ads.internal.presenter.g gVar, boolean z10, String str, String str2) {
        this.f18864d = gVar;
        this.f18863c = z10;
        this.f18865e = str;
        this.f18866f = str2;
    }

    public /* synthetic */ T(boolean z10, MaxRewardedAdListener maxRewardedAdListener, MaxAd maxAd, MaxReward maxReward) {
        this.f18863c = z10;
        this.f18864d = maxRewardedAdListener;
        this.f18865e = maxAd;
        this.f18866f = maxReward;
    }
}
