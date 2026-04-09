package com.applovin.sdk;

import N7.C1154e9;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.C2139p0;
import com.applovin.impl.a7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y1;
import io.appmetrica.analytics.impl.Oo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinSdkSettings {

    /* renamed from: a, reason: collision with root package name */
    private boolean f22015a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f22016b;

    /* renamed from: e, reason: collision with root package name */
    private String f22019e;

    /* renamed from: f, reason: collision with root package name */
    private String f22020f;

    /* renamed from: g, reason: collision with root package name */
    private String f22021g;

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinTermsAndPrivacyPolicyFlowSettings f22023j;

    /* renamed from: k, reason: collision with root package name */
    private k f22024k;

    /* renamed from: l, reason: collision with root package name */
    private String f22025l;

    /* renamed from: d, reason: collision with root package name */
    private boolean f22018d = true;
    private final Map<String, Object> localSettings = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Map f22022h = Collections.synchronizedMap(new HashMap());
    private final Map i = Collections.synchronizedMap(new HashMap());

    /* renamed from: c, reason: collision with root package name */
    private boolean f22017c = true;

    public AppLovinSdkSettings(Context context) {
        this.f22025l = "";
        if (context == null) {
            o.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context contextD = a7.d(context);
        this.f22015a = a7.k(contextD);
        this.f22023j = C2139p0.a(contextD);
        this.f22025l = contextD.getPackageName();
        a(contextD);
    }

    private void a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String strA = a7.a(identifier, context, (k) null);
        this.f22022h.putAll(JsonUtils.tryToStringMap(StringUtils.isValidString(strA) ? JsonUtils.jsonObjectFromJsonString(strA, new JSONObject()) : new JSONObject()));
    }

    public void attachAppLovinSdk(k kVar) {
        this.f22024k = kVar;
        if (StringUtils.isValidString(this.f22019e)) {
            kVar.s0().a(Arrays.asList(this.f22019e.split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA)));
            this.f22019e = null;
        }
        if (this.f22020f != null) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("AppLovinSdkSettings", "Setting user id: " + this.f22020f);
            }
            kVar.w0().a(this.f22020f);
            this.f22020f = null;
        }
        if (StringUtils.isValidString(this.f22021g)) {
            l.a(this.f22021g, kVar);
            this.f22021g = null;
        }
        for (Map.Entry entry : this.i.entrySet()) {
            kVar.v0().a(y1.f21799j, "preInitExtraParameter", CollectionUtils.hashMap("details", ((String) entry.getKey()) + io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER + ((String) entry.getValue())));
        }
        this.i.clear();
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f22022h) {
            map = CollectionUtils.map(this.f22022h);
        }
        return map;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        return this.f22023j;
    }

    public String getUserIdentifier() {
        k kVar = this.f22024k;
        return kVar == null ? this.f22020f : kVar.w0().e();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f22017c;
    }

    public boolean isMuted() {
        return this.f22016b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f22015a;
    }

    public void setCreativeDebuggerEnabled(boolean z10) {
        o.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z10 + ")");
        if (this.f22017c == z10) {
            return;
        }
        this.f22017c = z10;
        k kVar = this.f22024k;
        if (kVar == null) {
            return;
        }
        if (z10) {
            kVar.z().l();
        } else {
            kVar.z().k();
        }
    }

    public void setExtraParameter(String str, String str2) {
        o.e("AppLovinSdkSettings", Oo.h("setExtraParameter(key=", str, ", value=", str2, ")"));
        if (TextUtils.isEmpty(str)) {
            o.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String strTrim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f22024k == null) {
                this.f22019e = strTrim;
            } else if (StringUtils.isValidString(strTrim)) {
                this.f22024k.s0().a(Arrays.asList(strTrim.split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA)));
            } else {
                this.f22024k.s0().a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.f22025l.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            o.a(Boolean.parseBoolean(strTrim));
        } else if ("package_name_override".equals(str)) {
            k kVar = this.f22024k;
            if (kVar != null) {
                l.a(strTrim, kVar);
            } else {
                this.f22021g = strTrim;
            }
        }
        if (this.f22024k != null) {
            this.f22024k.v0().a(y1.f21799j, "postInitExtraParameter", CollectionUtils.hashMap("details", str + io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER + str2));
        } else {
            this.i.put(str, strTrim);
        }
        this.f22022h.put(str, strTrim);
    }

    public void setMuted(boolean z10) {
        o.e("AppLovinSdkSettings", "setMuted(muted=" + z10 + ")");
        this.f22016b = z10;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z10) {
        o.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z10 + ")");
        this.f22018d = z10;
    }

    public void setUserIdentifier(String str) {
        o.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > a7.b(8)) {
            o.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + a7.b(8) + " maximum)");
        }
        k kVar = this.f22024k;
        if (kVar == null) {
            this.f22020f = str;
            return;
        }
        kVar.O();
        if (o.a()) {
            C1154e9.m("Setting user id: ", str, this.f22024k.O(), "AppLovinSdkSettings");
        }
        this.f22024k.w0().a(str);
    }

    public void setVerboseLogging(boolean z10) {
        o.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z10 + ")");
        if (!a7.k()) {
            this.f22015a = z10;
            return;
        }
        o.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (a7.k(null) != z10) {
            o.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f22018d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppLovinSdkSettings{isVerboseLoggingEnabled=");
        sb.append(this.f22015a);
        sb.append(", muted=");
        sb.append(this.f22016b);
        sb.append(", creativeDebuggerEnabled=");
        return C1154e9.k(sb, this.f22017c, '}');
    }
}
