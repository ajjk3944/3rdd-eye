package com.applovin.impl;

import N7.G8;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.singular.sdk.internal.Constants;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2145t {

    /* renamed from: e, reason: collision with root package name */
    private static final Map f21437e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f21438f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f21439a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21440b;

    /* renamed from: c, reason: collision with root package name */
    private AppLovinAdSize f21441c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAdType f21442d;

    private C2145t(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z10, boolean z11) {
        String lowerCase;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f21441c = appLovinAdSize;
        this.f21442d = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
        }
        lowerCase = z10 ? G8.s(lowerCase, "_bidding") : lowerCase;
        this.f21440b = z11 ? G8.s(lowerCase, "_direct_sold") : lowerCase;
    }

    public static C2145t a(String str) {
        return a(null, null, str);
    }

    public static C2145t b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static C2145t c() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static C2145t h() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static C2145t j() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static C2145t k() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static C2145t l() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public static C2145t m() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public MaxAdFormat d() {
        AppLovinAdSize appLovinAdSizeF = f();
        if (appLovinAdSizeF == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (appLovinAdSizeF == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (appLovinAdSizeF == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (appLovinAdSizeF != AppLovinAdSize.INTERSTITIAL) {
            if (appLovinAdSizeF == AppLovinAdSize.NATIVE) {
                return MaxAdFormat.NATIVE;
            }
            return null;
        }
        if (g() == AppLovinAdType.REGULAR) {
            return MaxAdFormat.INTERSTITIAL;
        }
        if (g() == AppLovinAdType.APP_OPEN) {
            return MaxAdFormat.APP_OPEN;
        }
        if (g() == AppLovinAdType.INCENTIVIZED) {
            return MaxAdFormat.REWARDED;
        }
        return null;
    }

    public String e() {
        return this.f21440b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2145t.class != obj.getClass()) {
            return false;
        }
        return this.f21440b.equalsIgnoreCase(((C2145t) obj).f21440b);
    }

    public AppLovinAdSize f() {
        if (this.f21441c == null && JsonUtils.valueExists(this.f21439a, "ad_size")) {
            this.f21441c = AppLovinAdSize.fromString(JsonUtils.getString(this.f21439a, "ad_size", null));
        }
        return this.f21441c;
    }

    public AppLovinAdType g() {
        if (this.f21442d == null && JsonUtils.valueExists(this.f21439a, Constants.ADMON_AD_TYPE)) {
            this.f21442d = AppLovinAdType.fromString(JsonUtils.getString(this.f21439a, Constants.ADMON_AD_TYPE, null));
        }
        return this.f21442d;
    }

    public int hashCode() {
        return this.f21440b.hashCode();
    }

    public boolean i() {
        return a().contains(this);
    }

    public String toString() {
        return "AdZone{id=" + this.f21440b + ", zoneObject=" + this.f21439a + '}';
    }

    public static C2145t a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static C2145t b() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    public static C2145t a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    public static C2145t a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z10, boolean z11) {
        C2145t c2145t = new C2145t(appLovinAdSize, appLovinAdType, str, z10, z11);
        synchronized (f21438f) {
            try {
                String str2 = c2145t.f21440b;
                Map map = f21437e;
                if (map.containsKey(str2)) {
                    c2145t = (C2145t) map.get(str2);
                } else {
                    map.put(str2, c2145t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2145t;
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has(Constants.ADMON_AD_TYPE)) {
            synchronized (f21438f) {
                try {
                    C2145t c2145t = (C2145t) f21437e.get(JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, ""));
                    if (c2145t != null) {
                        c2145t.f21441c = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                        c2145t.f21442d = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, Constants.ADMON_AD_TYPE, ""));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Collection a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, c(), k(), j(), m(), b(), h(), l());
        return Collections.unmodifiableSet(linkedHashSet);
    }
}
