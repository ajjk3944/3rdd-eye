package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class y1 extends v1 {
    public y1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(bVar, activity, kVar);
    }

    @Override // com.applovin.impl.v1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f5872d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.f5871c.n(), (this.f5871c.u0() ? 3 : 5) | 48, gVar);
        }
        if (kVar != null) {
            this.f5872d.addView(kVar, this.f5873e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f5872d);
        } else {
            this.f5870b.setContentView(this.f5872d);
        }
    }
}
