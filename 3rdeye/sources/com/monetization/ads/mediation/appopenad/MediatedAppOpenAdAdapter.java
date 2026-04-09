package com.monetization.ads.mediation.appopenad;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class MediatedAppOpenAdAdapter extends com.monetization.ads.mediation.base.a {

    public interface MediatedAppOpenAdAdapterListener {
        void onAdImpression();

        void onAppOpenAdClicked();

        void onAppOpenAdDismissed();

        void onAppOpenAdFailedToLoad(MediatedAdRequestError mediatedAdRequestError);

        void onAppOpenAdLeftApplication();

        void onAppOpenAdLoaded();

        void onAppOpenAdShown();
    }

    public abstract boolean isLoaded();

    public abstract void loadAppOpenAd(Context context, MediatedAppOpenAdAdapterListener mediatedAppOpenAdAdapterListener, Map<String, ? extends Object> map, Map<String, String> map2);

    public abstract void onInvalidate();

    public abstract void showAppOpenAd(Activity activity);
}
