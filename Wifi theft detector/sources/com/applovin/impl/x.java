package com.applovin.impl;

import com.amazon.device.ads.DTBAdSize;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private final String f8397a;

    /* renamed from: b, reason: collision with root package name */
    private final DTBAdSize f8398b;

    public enum a {
        VIDEO,
        DISPLAY,
        INTERSTITIAL
    }

    public x(String str, JSONObject jSONObject, MaxAdFormat maxAdFormat) {
        this.f8397a = str;
        this.f8398b = a(JsonUtils.getInt(jSONObject, HandleInvocationsFromAdViewer.KEY_AD_TYPE, a(maxAdFormat).ordinal()), maxAdFormat, str);
    }

    public DTBAdSize a() {
        return this.f8398b;
    }

    private a a(MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? a.DISPLAY : a.INTERSTITIAL;
    }

    private DTBAdSize a(int i10, MaxAdFormat maxAdFormat, String str) {
        try {
            if (a.VIDEO.ordinal() == i10) {
                return new DTBAdSize.DTBVideo(Sdk$SDKError.Reason.WEBVIEW_ERROR_VALUE, 480, str);
            }
            if (a.DISPLAY.ordinal() == i10) {
                return new DTBAdSize(maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight(), str);
            }
            if (a.INTERSTITIAL.ordinal() == i10) {
                return new DTBAdSize.DTBInterstitialAdSize(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
