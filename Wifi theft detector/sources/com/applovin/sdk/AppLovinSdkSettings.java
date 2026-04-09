package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.d2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinSdkSettings {

    /* renamed from: a, reason: collision with root package name */
    private boolean f8929a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8930b;

    /* renamed from: e, reason: collision with root package name */
    private String f8933e;

    /* renamed from: f, reason: collision with root package name */
    private String f8934f;

    /* renamed from: g, reason: collision with root package name */
    private String f8935g;

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinTermsAndPrivacyPolicyFlowSettings f8938j;

    /* renamed from: k, reason: collision with root package name */
    private k f8939k;

    /* renamed from: l, reason: collision with root package name */
    private String f8940l;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8932d = true;

    /* renamed from: h, reason: collision with root package name */
    private final Map f8936h = Collections.synchronizedMap(new HashMap());

    /* renamed from: i, reason: collision with root package name */
    private final Map f8937i = Collections.synchronizedMap(new HashMap());

    /* renamed from: c, reason: collision with root package name */
    private boolean f8931c = true;

    public AppLovinSdkSettings(Context context) {
        this.f8940l = "";
        if (context == null) {
            o.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context contextE = n7.e(context);
        this.f8929a = n7.m(contextE);
        this.f8938j = u0.a(contextE);
        this.f8940l = contextE.getPackageName();
        a(contextE);
    }

    private void a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String strA = n7.a(identifier, context, (k) null);
        this.f8936h.putAll(JsonUtils.tryToStringMap(StringUtils.isValidString(strA) ? JsonUtils.jsonObjectFromJsonString(strA, new JSONObject()) : new JSONObject()));
    }

    public void attachAppLovinSdk(k kVar) {
        this.f8939k = kVar;
        if (StringUtils.isValidString(this.f8933e)) {
            kVar.s0().a(Arrays.asList(this.f8933e.split(",")));
            this.f8933e = null;
        }
        if (this.f8934f != null) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("AppLovinSdkSettings", "Setting user id: " + this.f8934f);
            }
            kVar.w0().a(this.f8934f);
            this.f8934f = null;
        }
        if (StringUtils.isValidString(this.f8935g)) {
            l.a(this.f8935g, kVar);
            this.f8935g = null;
        }
        for (Map.Entry entry : this.f8937i.entrySet()) {
            kVar.v0().a(d2.f5735k, "preInitExtraParameter", CollectionUtils.hashMap("details", ((String) entry.getKey()) + ":" + ((String) entry.getValue())));
        }
        this.f8937i.clear();
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f8936h) {
            map = CollectionUtils.map(this.f8936h);
        }
        return map;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        return this.f8938j;
    }

    @Nullable
    public String getUserIdentifier() {
        k kVar = this.f8939k;
        return kVar == null ? this.f8934f : kVar.w0().e();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f8931c;
    }

    public boolean isMuted() {
        return this.f8930b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f8929a;
    }

    public void setCreativeDebuggerEnabled(boolean z10) {
        o.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z10 + ")");
        if (this.f8931c == z10) {
            return;
        }
        this.f8931c = z10;
        k kVar = this.f8939k;
        if (kVar == null) {
            return;
        }
        if (z10) {
            kVar.y().l();
        } else {
            kVar.y().k();
        }
    }

    public void setExtraParameter(String str, @Nullable String str2) {
        o.e("AppLovinSdkSettings", "setExtraParameter(key=" + str + ", value=" + str2 + ")");
        if (TextUtils.isEmpty(str)) {
            o.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String strTrim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f8939k == null) {
                this.f8933e = strTrim;
            } else if (StringUtils.isValidString(strTrim)) {
                this.f8939k.s0().a(Arrays.asList(strTrim.split(",")));
            } else {
                this.f8939k.s0().a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.f8940l.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            o.a(Boolean.parseBoolean(strTrim));
        } else if ("package_name_override".equals(str)) {
            k kVar = this.f8939k;
            if (kVar != null) {
                l.a(strTrim, kVar);
            } else {
                this.f8935g = strTrim;
            }
        }
        if (this.f8939k != null) {
            this.f8939k.v0().a(d2.f5735k, "postInitExtraParameter", CollectionUtils.hashMap("details", str + ":" + str2));
        } else {
            this.f8937i.put(str, strTrim);
        }
        this.f8936h.put(str, strTrim);
    }

    public void setMuted(boolean z10) {
        o.e("AppLovinSdkSettings", "setMuted(muted=" + z10 + ")");
        this.f8930b = z10;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z10) {
        o.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z10 + ")");
        this.f8932d = z10;
    }

    public void setUserIdentifier(String str) {
        o.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > n7.d(8)) {
            o.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + n7.d(8) + " maximum)");
        }
        k kVar = this.f8939k;
        if (kVar == null) {
            this.f8934f = str;
            return;
        }
        kVar.O();
        if (o.a()) {
            this.f8939k.O().a("AppLovinSdkSettings", "Setting user id: " + str);
        }
        this.f8939k.w0().a(str);
    }

    public void setVerboseLogging(boolean z10) {
        o.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z10 + ")");
        if (!n7.l()) {
            this.f8929a = z10;
            return;
        }
        o.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (n7.m(null) != z10) {
            o.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f8932d;
    }

    @NonNull
    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f8929a + ", muted=" + this.f8930b + ", creativeDebuggerEnabled=" + this.f8931c + '}';
    }
}
