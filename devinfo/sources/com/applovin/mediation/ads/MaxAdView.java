package com.applovin.mediation.ads;

import a0.g;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxAdView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private MaxAdViewImpl f6358a;

    /* renamed from: b, reason: collision with root package name */
    private View f6359b;

    /* renamed from: c, reason: collision with root package name */
    private int f6360c;

    public MaxAdView(String str) {
        this(str, (MaxAdViewConfiguration) null);
    }

    private void a(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, int i4, Context context) {
        View view = new View(context.getApplicationContext());
        this.f6359b = view;
        view.setBackgroundColor(0);
        addView(this.f6359b);
        this.f6359b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f6360c = getVisibility();
        this.f6358a = new MaxAdViewImpl(str.trim(), maxAdFormat, maxAdViewConfiguration, this, this.f6359b, context);
        setGravity(i4);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f6358a.logApiCall("destroy()");
        this.f6358a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f6358a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f6358a.getAdUnitId();
    }

    public String getPlacement() {
        this.f6358a.logApiCall("getPlacement()");
        return this.f6358a.getPlacement();
    }

    public void loadAd() {
        this.f6358a.logApiCall("loadAd()");
        this.f6358a.loadAd();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        if (isInEditMode()) {
            return;
        }
        this.f6358a.logApiCall("onWindowVisibilityChanged(visibility=" + i4 + ")");
        if (this.f6358a != null && e8.a(this.f6360c, i4)) {
            this.f6358a.onWindowVisibilityChanged(i4);
        }
        this.f6360c = i4;
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f6358a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f6358a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        this.f6358a.logApiCall("setAlpha(alpha=" + f10 + ")");
        View view = this.f6359b;
        if (view != null) {
            view.setAlpha(f10);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        this.f6358a.logApiCall("setBackgroundColor(color=" + i4 + ")");
        MaxAdViewImpl maxAdViewImpl = this.f6358a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i4);
        }
        View view = this.f6359b;
        if (view != null) {
            view.setBackgroundColor(i4);
        }
    }

    public void setCustomData(String str) {
        this.f6358a.logApiCall("setCustomData(value=" + str + ")");
        this.f6358a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f6358a.logApiCall(g.n("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f6358a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.f6358a.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f6358a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f6358a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f6358a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f6358a.logApiCall("setPlacement(placement=" + str + ")");
        this.f6358a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f6358a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f6358a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f6358a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f6358a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f6358a.logApiCall("startAutoRefresh()");
        this.f6358a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f6358a.logApiCall("stopAutoRefresh()");
        this.f6358a.stopAutoRefresh();
    }

    @Override // android.view.View
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f6358a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat) {
        this(str, maxAdFormat, (MaxAdViewConfiguration) null);
    }

    public MaxAdView(String str, MaxAdViewConfiguration maxAdViewConfiguration) {
        this(str, s.a(k.o()), maxAdViewConfiguration);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration) {
        super(k.o());
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", configuration=" + maxAdViewConfiguration + ")");
        a(str, maxAdFormat, maxAdViewConfiguration, 49, k.o());
    }

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i4) {
        MaxAdFormat maxAdFormatA;
        super(context, attributeSet, i4);
        String strA = s.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
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
        int i4 = displayMetrics.widthPixels;
        int i10 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i4, i10);
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
