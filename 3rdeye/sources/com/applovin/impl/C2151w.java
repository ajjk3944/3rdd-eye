package com.applovin.impl;

import com.amazon.device.ads.DTBAdSize;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2151w {

    /* renamed from: a, reason: collision with root package name */
    private final String f21671a;

    /* renamed from: b, reason: collision with root package name */
    private final DTBAdSize f21672b;

    /* renamed from: com.applovin.impl.w$a */
    public enum a {
        VIDEO,
        DISPLAY,
        INTERSTITIAL
    }

    public C2151w(String str, JSONObject jSONObject, MaxAdFormat maxAdFormat) {
        this.f21671a = str;
        this.f21672b = a(JsonUtils.getInt(jSONObject, "type", a(maxAdFormat).ordinal()), maxAdFormat, str);
    }

    public DTBAdSize a() {
        return this.f21672b;
    }

    private a a(MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? a.DISPLAY : a.INTERSTITIAL;
    }

    private DTBAdSize a(int i, MaxAdFormat maxAdFormat, String str) {
        try {
            if (a.VIDEO.ordinal() == i) {
                return new DTBAdSize.DTBVideo(Sdk$SDKError.b.WEBVIEW_ERROR_VALUE, 480, str);
            }
            if (a.DISPLAY.ordinal() == i) {
                return new DTBAdSize(maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight(), str);
            }
            if (a.INTERSTITIAL.ordinal() == i) {
                return new DTBAdSize.DTBInterstitialAdSize(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
