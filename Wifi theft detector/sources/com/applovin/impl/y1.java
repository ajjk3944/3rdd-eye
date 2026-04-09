package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;

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
        this.f8276d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.f8275c.n(), (this.f8275c.u0() ? 3 : 5) | 48, gVar);
        }
        if (kVar != null) {
            this.f8276d.addView(kVar, this.f8277e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f8276d);
        } else {
            this.f8274b.setContentView(this.f8276d);
        }
    }
}
