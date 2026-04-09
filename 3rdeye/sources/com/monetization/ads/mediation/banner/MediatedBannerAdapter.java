package com.monetization.ads.mediation.banner;

import android.content.Context;
import android.view.View;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class MediatedBannerAdapter extends com.monetization.ads.mediation.base.a {

    public interface MediatedBannerAdapterListener {
        void onAdClicked();

        void onAdFailedToLoad(MediatedAdRequestError mediatedAdRequestError);

        void onAdImpression();

        void onAdLeftApplication();

        void onAdLoaded(View view);
    }

    public abstract void loadBanner(Context context, MediatedBannerAdapterListener mediatedBannerAdapterListener, Map<String, ? extends Object> map, Map<String, String> map2);

    public abstract void onInvalidate();
}
