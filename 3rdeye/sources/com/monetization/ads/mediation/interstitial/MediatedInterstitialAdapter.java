package com.monetization.ads.mediation.interstitial;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class MediatedInterstitialAdapter extends com.monetization.ads.mediation.base.a {

    public interface MediatedInterstitialAdapterListener {
        void onAdImpression();

        void onInterstitialClicked();

        void onInterstitialDismissed();

        void onInterstitialFailedToLoad(MediatedAdRequestError mediatedAdRequestError);

        void onInterstitialLeftApplication();

        void onInterstitialLoaded();

        void onInterstitialShown();
    }

    public abstract boolean isLoaded();

    public abstract void loadInterstitial(Context context, MediatedInterstitialAdapterListener mediatedInterstitialAdapterListener, Map<String, ? extends Object> map, Map<String, String> map2);

    public abstract void onInvalidate();

    public abstract void showInterstitial(Activity activity);
}
