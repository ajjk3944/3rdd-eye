package com.applovin.sdk;

import a0.g;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.d2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u0;
import d.h;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AppLovinSdkSettings {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6443a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6444b;

    /* renamed from: e, reason: collision with root package name */
    private String f6447e;

    /* renamed from: f, reason: collision with root package name */
    private String f6448f;
    private String g;
    private final AppLovinTermsAndPrivacyPolicyFlowSettings j;

    /* renamed from: k, reason: collision with root package name */
    private k f6451k;

    /* renamed from: l, reason: collision with root package name */
    private String f6452l;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6446d = true;

    /* renamed from: h, reason: collision with root package name */
    private final Map f6449h = g.r();

    /* renamed from: i, reason: collision with root package name */
    private final Map f6450i = g.r();

    /* renamed from: c, reason: collision with root package name */
    private boolean f6445c = true;

    public AppLovinSdkSettings(Context context) {
        this.f6452l = "";
        if (context == null) {
            o.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context contextE = n7.e(context);
        this.f6443a = n7.m(contextE);
        this.j = u0.a(contextE);
        this.f6452l = contextE.getPackageName();
        a(contextE);
    }

    private void a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String strA = n7.a(identifier, context, (k) null);
        this.f6449h.putAll(JsonUtils.tryToStringMap(StringUtils.isValidString(strA) ? JsonUtils.jsonObjectFromJsonString(strA, new JSONObject()) : new JSONObject()));
    }

    public void attachAppLovinSdk(k kVar) {
        this.f6451k = kVar;
        if (StringUtils.isValidString(this.f6447e)) {
            kVar.s0().a(Arrays.asList(this.f6447e.split(",")));
            this.f6447e = null;
        }
        if (this.f6448f != null) {
            kVar.O();
            if (o.a()) {
                g.B(new StringBuilder("Setting user id: "), this.f6448f, kVar.O(), "AppLovinSdkSettings");
            }
            kVar.w0().a(this.f6448f);
            this.f6448f = null;
        }
        if (StringUtils.isValidString(this.g)) {
            l.a(this.g, kVar);
            this.g = null;
        }
        for (Map.Entry entry : this.f6450i.entrySet()) {
            kVar.v0().a(d2.f3889k, "preInitExtraParameter", CollectionUtils.hashMap("details", ((String) entry.getKey()) + ":" + ((String) entry.getValue())));
        }
        this.f6450i.clear();
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f6449h) {
            map = CollectionUtils.map(this.f6449h);
        }
        return map;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        return this.j;
    }

    public String getUserIdentifier() {
        k kVar = this.f6451k;
        return kVar == null ? this.f6448f : kVar.w0().e();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f6445c;
    }

    public boolean isMuted() {
        return this.f6444b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f6443a;
    }

    public void setCreativeDebuggerEnabled(boolean z3) {
        o.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z3 + ")");
        if (this.f6445c == z3) {
            return;
        }
        this.f6445c = z3;
        k kVar = this.f6451k;
        if (kVar == null) {
            return;
        }
        if (z3) {
            kVar.y().l();
        } else {
            kVar.y().k();
        }
    }

    public void setExtraParameter(String str, String str2) {
        o.e("AppLovinSdkSettings", g.n("setExtraParameter(key=", str, ", value=", str2, ")"));
        if (TextUtils.isEmpty(str)) {
            o.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String strTrim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f6451k == null) {
                this.f6447e = strTrim;
            } else if (StringUtils.isValidString(strTrim)) {
                this.f6451k.s0().a(Arrays.asList(strTrim.split(",")));
            } else {
                this.f6451k.s0().a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.f6452l.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            o.a(Boolean.parseBoolean(strTrim));
        } else if ("package_name_override".equals(str)) {
            k kVar = this.f6451k;
            if (kVar != null) {
                l.a(strTrim, kVar);
            } else {
                this.g = strTrim;
            }
        }
        if (this.f6451k != null) {
            this.f6451k.v0().a(d2.f3889k, "postInitExtraParameter", CollectionUtils.hashMap("details", str + ":" + str2));
        } else {
            this.f6450i.put(str, strTrim);
        }
        this.f6449h.put(str, strTrim);
    }

    public void setMuted(boolean z3) {
        o.e("AppLovinSdkSettings", "setMuted(muted=" + z3 + ")");
        this.f6444b = z3;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z3) {
        o.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z3 + ")");
        this.f6446d = z3;
    }

    public void setUserIdentifier(String str) {
        o.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > n7.d(8)) {
            o.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + n7.d(8) + " maximum)");
        }
        k kVar = this.f6451k;
        if (kVar == null) {
            this.f6448f = str;
            return;
        }
        kVar.O();
        if (o.a()) {
            g.x("Setting user id: ", str, this.f6451k.O(), "AppLovinSdkSettings");
        }
        this.f6451k.w0().a(str);
    }

    public void setVerboseLogging(boolean z3) {
        o.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z3 + ")");
        if (!n7.l()) {
            this.f6443a = z3;
            return;
        }
        o.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (n7.m(null) != z3) {
            o.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f6446d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppLovinSdkSettings{isVerboseLoggingEnabled=");
        sb2.append(this.f6443a);
        sb2.append(", muted=");
        sb2.append(this.f6444b);
        sb2.append(", creativeDebuggerEnabled=");
        return h.x(sb2, this.f6445c, '}');
    }
}
