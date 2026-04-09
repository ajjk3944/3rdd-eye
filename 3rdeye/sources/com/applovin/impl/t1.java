package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;

/* loaded from: classes.dex */
public class t1 extends q1 {
    public t1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(bVar, activity, kVar);
    }

    @Override // com.applovin.impl.q1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f20751d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.f20750c.o(), (this.f20750c.G0() ? 3 : 5) | 48, gVar);
        }
        if (kVar != null) {
            this.f20751d.addView(kVar, this.f20752e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f20751d);
        } else {
            this.f20749b.setContentView(this.f20751d);
        }
    }
}
