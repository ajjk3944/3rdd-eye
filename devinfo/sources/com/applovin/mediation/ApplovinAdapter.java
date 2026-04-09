package com.applovin.mediation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import bb.f;
import bb.n;
import com.applovin.adview.AppLovinAdView;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.ads.mediation.applovin.e;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.internal.ads.pq0;
import pa.a;
import pa.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ApplovinAdapter extends AppLovinMediationAdapter implements MediationBannerAdapter {
    private static final boolean LOGGING_ENABLED = true;
    private AppLovinAdView adView;
    private FrameLayout adViewWrapper;
    private AppLovinSdk sdk;
    private String zoneId;

    public static void log(int i4, String str) {
        Log.println(i4, "AppLovinAdapter", str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.adViewWrapper;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(final Context context, final n nVar, final Bundle bundle, h hVar, f fVar, Bundle bundle2) {
        if (AppLovinUtils.isChildUser()) {
            ((pq0) nVar).j(AppLovinUtils.getChildUserError());
            return;
        }
        String string = bundle.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            a aVar = new a(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.ERROR_DOMAIN, null);
            log(6, "Missing or invalid SDK Key.");
            ((pq0) nVar).j(aVar);
            return;
        }
        final AppLovinAdSize appLovinAdSizeAppLovinAdSizeFromAdMobAdSize = AppLovinUtils.appLovinAdSizeFromAdMobAdSize(context, hVar);
        if (appLovinAdSizeAppLovinAdSizeFromAdMobAdSize == null) {
            a aVar2 = new a(101, "Failed to request banner with unsupported size.", AppLovinMediationAdapter.ERROR_DOMAIN, null);
            log(6, "Failed to request banner with unsupported size.");
            ((pq0) nVar).j(aVar2);
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(hVar.d(context), hVar.b(context));
        FrameLayout frameLayout = new FrameLayout(context);
        this.adViewWrapper = frameLayout;
        frameLayout.setLayoutParams(layoutParams);
        if (com.google.ads.mediation.applovin.f.f8979b == null) {
            com.google.ads.mediation.applovin.f.f8979b = new com.google.ads.mediation.applovin.f();
        }
        com.google.ads.mediation.applovin.f.f8979b.a(context, string, new e() { // from class: com.applovin.mediation.ApplovinAdapter.1
            @Override // com.google.ads.mediation.applovin.e
            public void onInitializeSuccess() {
                ApplovinAdapter applovinAdapter = ApplovinAdapter.this;
                if (com.google.ads.mediation.applovin.f.f8979b == null) {
                    com.google.ads.mediation.applovin.f.f8979b = new com.google.ads.mediation.applovin.f();
                }
                applovinAdapter.sdk = com.google.ads.mediation.applovin.f.f8979b.b(context);
                ApplovinAdapter.this.zoneId = AppLovinUtils.retrieveZoneId(bundle);
                ApplovinAdapter.log(3, "Requesting banner of size " + appLovinAdSizeAppLovinAdSizeFromAdMobAdSize + " for zone: " + ApplovinAdapter.this.zoneId);
                ApplovinAdapter.this.adView = new AppLovinAdView(ApplovinAdapter.this.sdk, appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, context);
                AppLovinBannerAdListener appLovinBannerAdListener = new AppLovinBannerAdListener(ApplovinAdapter.this.zoneId, ApplovinAdapter.this.adView, ApplovinAdapter.this, nVar);
                ApplovinAdapter.this.adView.setAdDisplayListener(appLovinBannerAdListener);
                ApplovinAdapter.this.adView.setAdClickListener(appLovinBannerAdListener);
                ApplovinAdapter.this.adView.setAdViewEventListener(appLovinBannerAdListener);
                ApplovinAdapter.this.adViewWrapper.addView(ApplovinAdapter.this.adView);
                if (TextUtils.isEmpty(ApplovinAdapter.this.zoneId)) {
                    ApplovinAdapter.this.sdk.getAdService().loadNextAd(appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, appLovinBannerAdListener);
                } else {
                    ApplovinAdapter.this.sdk.getAdService().loadNextAdForZoneId(ApplovinAdapter.this.zoneId, appLovinBannerAdListener);
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, bb.g
    public void onDestroy() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, bb.g
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, bb.g
    public void onResume() {
    }
}
