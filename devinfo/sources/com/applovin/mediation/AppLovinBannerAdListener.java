package com.applovin.mediation;

import android.os.RemoteException;
import bb.n;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.pq0;
import pa.a;
import pb.y;
import za.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
class AppLovinBannerAdListener implements AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {
    private final AppLovinAdView adView;
    private final ApplovinAdapter adapter;
    private final n mediationBannerListener;
    private final String zoneId;

    public AppLovinBannerAdListener(String str, AppLovinAdView appLovinAdView, ApplovinAdapter applovinAdapter, n nVar) {
        this.adapter = applovinAdapter;
        this.mediationBannerListener = nVar;
        this.adView = appLovinAdView;
        this.zoneId = str;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Banner clicked.");
        pq0 pq0Var = (pq0) this.mediationBannerListener;
        pq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdClicked.");
        try {
            ((fr) pq0Var.f15073b).c();
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        ApplovinAdapter.log(3, "Banner closed fullscreen.");
        pq0 pq0Var = (pq0) this.mediationBannerListener;
        pq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdClosed.");
        try {
            ((fr) pq0Var.f15073b).d();
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Banner displayed.");
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        ApplovinAdapter.log(5, "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Banner dismissed.");
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        ApplovinAdapter.log(3, "Banner left application.");
        pq0 pq0Var = (pq0) this.mediationBannerListener;
        pq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdLeftApplication.");
        try {
            ((fr) pq0Var.f15073b).z1();
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        ApplovinAdapter.log(3, "Banner opened fullscreen.");
        pq0 pq0Var = (pq0) this.mediationBannerListener;
        pq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdOpened.");
        try {
            ((fr) pq0Var.f15073b).C1();
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Banner did load ad for zone: " + this.zoneId);
        this.adView.renderAd(appLovinAd);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.AppLovinBannerAdListener.1
            @Override // java.lang.Runnable
            public void run() {
                n nVar = AppLovinBannerAdListener.this.mediationBannerListener;
                ApplovinAdapter unused = AppLovinBannerAdListener.this.adapter;
                pq0 pq0Var = (pq0) nVar;
                pq0Var.getClass();
                y.d("#008 Must be called on the main UI thread.");
                i.c("Adapter called onAdLoaded.");
                try {
                    ((fr) pq0Var.f15073b).A1();
                } catch (RemoteException e2) {
                    i.k("#007 Could not call remote method.", e2);
                }
            }
        });
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i4) {
        final a adError = AppLovinUtils.getAdError(i4);
        ApplovinAdapter.log(5, "Failed to load banner ad with error: " + i4);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.AppLovinBannerAdListener.2
            @Override // java.lang.Runnable
            public void run() {
                n nVar = AppLovinBannerAdListener.this.mediationBannerListener;
                ApplovinAdapter unused = AppLovinBannerAdListener.this.adapter;
                ((pq0) nVar).j(adError);
            }
        });
    }
}
