package com.monetization.ads.mediation.nativeads;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes2.dex */
public interface MediatedNativeAdViewProvider {
    TextView getAgeView();

    TextView getBodyView();

    TextView getCallToActionView();

    TextView getDomainView();

    ImageView getFeedbackView();

    ImageView getIconView();

    FrameLayout getMediaView();

    View getNativeAdView();

    TextView getPriceView();

    View getRatingView();

    TextView getReviewCountView();

    TextView getSponsoredView();

    TextView getTitleView();

    TextView getWarningView();
}
