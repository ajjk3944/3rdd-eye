package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.google.ads.mediation.applovin.d;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class j implements MediationAppOpenAd, MaxAdListener {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f9492a;

    /* renamed from: b, reason: collision with root package name */
    public final d f9493b;

    /* renamed from: c, reason: collision with root package name */
    public final a f9494c;

    /* renamed from: d, reason: collision with root package name */
    public MaxAppOpenAd f9495d;

    /* renamed from: e, reason: collision with root package name */
    public MediationAppOpenAdCallback f9496e;

    public j(MediationAdLoadCallback loadCallback, d appLovinInitializer, a appLovinAdFactory) {
        p.e(loadCallback, "loadCallback");
        p.e(appLovinInitializer, "appLovinInitializer");
        p.e(appLovinAdFactory, "appLovinAdFactory");
        this.f9492a = loadCallback;
        this.f9493b = appLovinInitializer;
        this.f9494c = appLovinAdFactory;
    }

    public static final void c(j jVar, String str) {
        MaxAppOpenAd maxAppOpenAdE = jVar.f9494c.e(str);
        jVar.f9495d = maxAppOpenAdE;
        if (maxAppOpenAdE != null) {
            maxAppOpenAdE.setListener(jVar);
        }
        MaxAppOpenAd maxAppOpenAd = jVar.f9495d;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.loadAd();
        }
    }

    public final void b(MediationAppOpenAdConfiguration appOpenAdConfiguration) {
        p.e(appOpenAdConfiguration, "appOpenAdConfiguration");
        Bundle serverParameters = appOpenAdConfiguration.getServerParameters();
        p.d(serverParameters, "getServerParameters(...)");
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (string == null || string.length() == 0) {
            this.f9492a.onFailure(new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.ERROR_DOMAIN));
            return;
        }
        final String string2 = serverParameters.getString(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
        if (string2 != null && string2.length() != 0) {
            this.f9493b.b(appOpenAdConfiguration.getContext(), string, new d.b() { // from class: com.google.ads.mediation.applovin.i
                @Override // com.google.ads.mediation.applovin.d.b
                public final void onInitializeSuccess() {
                    j.c(this.f9490a, string2);
                }
            });
        } else {
            this.f9492a.onFailure(new AdError(113, "Ad Unit ID is missing.", AppLovinMediationAdapter.ERROR_DOMAIN));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd ad) {
        p.e(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f9496e;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd ad, MaxError appLovinError) {
        p.e(ad, "ad");
        p.e(appLovinError, "appLovinError");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f9496e;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(new AdError(appLovinError.getCode(), appLovinError.getMessage(), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd ad) {
        p.e(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f9496e;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
        }
        MediationAppOpenAdCallback mediationAppOpenAdCallback2 = this.f9496e;
        if (mediationAppOpenAdCallback2 != null) {
            mediationAppOpenAdCallback2.reportAdImpression();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd ad) {
        p.e(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f9496e;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String p02, MaxError appLovinError) {
        p.e(p02, "p0");
        p.e(appLovinError, "appLovinError");
        this.f9492a.onFailure(new AdError(appLovinError.getCode(), appLovinError.getMessage(), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd ad) {
        p.e(ad, "ad");
        this.f9496e = (MediationAppOpenAdCallback) this.f9492a.onSuccess(this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        p.e(context, "context");
        MaxAppOpenAd maxAppOpenAd = this.f9495d;
        if (maxAppOpenAd != null) {
            if (maxAppOpenAd == null || !maxAppOpenAd.isReady()) {
                MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f9496e;
                if (mediationAppOpenAdCallback != null) {
                    mediationAppOpenAdCallback.onAdFailedToShow(new AdError(106, "Ad is not ready to be displayed", AppLovinMediationAdapter.ERROR_DOMAIN));
                    return;
                }
                return;
            }
            MaxAppOpenAd maxAppOpenAd2 = this.f9495d;
            if (maxAppOpenAd2 != null) {
                maxAppOpenAd2.showAd();
            }
        }
    }
}
