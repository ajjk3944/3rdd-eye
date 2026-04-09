package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.e8;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.s;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.sdk.AppLovinSdk;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: classes.dex */
public class MaxAdView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private MaxAdViewImpl f8835a;

    /* renamed from: b, reason: collision with root package name */
    private View f8836b;

    /* renamed from: c, reason: collision with root package name */
    private int f8837c;

    public MaxAdView(String str) {
        this(str, (MaxAdViewConfiguration) null);
    }

    private void a(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, int i10, Context context) {
        View view = new View(context.getApplicationContext());
        this.f8836b = view;
        view.setBackgroundColor(0);
        addView(this.f8836b);
        this.f8836b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f8837c = getVisibility();
        this.f8835a = new MaxAdViewImpl(str.trim(), maxAdFormat, maxAdViewConfiguration, this, this.f8836b, context);
        setGravity(i10);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f8835a.logApiCall("destroy()");
        this.f8835a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f8835a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f8835a.getAdUnitId();
    }

    public String getPlacement() {
        this.f8835a.logApiCall("getPlacement()");
        return this.f8835a.getPlacement();
    }

    public void loadAd() {
        this.f8835a.logApiCall("loadAd()");
        this.f8835a.loadAd();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (isInEditMode()) {
            return;
        }
        this.f8835a.logApiCall("onWindowVisibilityChanged(visibility=" + i10 + ")");
        if (this.f8835a != null && e8.a(this.f8837c, i10)) {
            this.f8835a.onWindowVisibilityChanged(i10);
        }
        this.f8837c = i10;
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f8835a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f8835a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        this.f8835a.logApiCall("setAlpha(alpha=" + f10 + ")");
        View view = this.f8836b;
        if (view != null) {
            view.setAlpha(f10);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f8835a.logApiCall("setBackgroundColor(color=" + i10 + ")");
        MaxAdViewImpl maxAdViewImpl = this.f8835a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i10);
        }
        View view = this.f8836b;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setCustomData(String str) {
        this.f8835a.logApiCall("setCustomData(value=" + str + ")");
        this.f8835a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f8835a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f8835a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.f8835a.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f8835a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f8835a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f8835a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f8835a.logApiCall("setPlacement(placement=" + str + ")");
        this.f8835a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f8835a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f8835a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f8835a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f8835a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f8835a.logApiCall("startAutoRefresh()");
        this.f8835a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f8835a.logApiCall("stopAutoRefresh()");
        this.f8835a.stopAutoRefresh();
    }

    @Override // android.view.View
    @NonNull
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f8835a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat) {
        this(str, maxAdFormat, (MaxAdViewConfiguration) null);
    }

    public MaxAdView(String str, @Nullable MaxAdViewConfiguration maxAdViewConfiguration) {
        this(str, s.a(k.o()), maxAdViewConfiguration);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, @Nullable MaxAdViewConfiguration maxAdViewConfiguration) {
        super(k.o());
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", configuration=" + maxAdViewConfiguration + ")");
        a(str, maxAdFormat, maxAdViewConfiguration, 49, k.o());
    }

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i10) {
        MaxAdFormat maxAdFormatA;
        super(context, attributeSet, i10);
        String strA = s.a(context, attributeSet, AppLovinAdView.NAMESPACE, HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID);
        String strA2 = s.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        if (StringUtils.isValidString(strA2)) {
            maxAdFormatA = MaxAdFormat.formatFromString(strA2);
        } else {
            maxAdFormatA = s.a(context);
        }
        MaxAdFormat maxAdFormat = maxAdFormatA;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (strA != null) {
            if (!TextUtils.isEmpty(strA)) {
                if (isInEditMode()) {
                    a(context);
                    return;
                } else {
                    a(strA, maxAdFormat, null, attributeIntValue, context);
                    return;
                }
            }
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(Sdk$SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk$SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk$SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i10, i11);
    }

    @Deprecated
    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, s.a(context), context);
    }

    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context);
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ")");
        a(str, maxAdFormat, null, 49, context);
    }
}
