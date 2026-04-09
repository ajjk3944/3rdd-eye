package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.C4923re;
import io.appmetrica.analytics.impl.C5025ve;
import io.appmetrica.analytics.impl.C5072xb;
import io.appmetrica.analytics.impl.EnumC4532ca;
import io.appmetrica.analytics.impl.Tc;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ExternalAttributions {
    public static ExternalAttribution adjust(Object obj) {
        return obj == null ? new C4923re(EnumC4532ca.ADJUST) : new C5025ve(EnumC4532ca.ADJUST, obj);
    }

    public static ExternalAttribution airbridge(Map<String, String> map) {
        return map == null ? new C4923re(EnumC4532ca.AIRBRIDGE) : new Tc(EnumC4532ca.AIRBRIDGE, map);
    }

    public static ExternalAttribution appsflyer(Map<String, Object> map) {
        return map == null ? new C4923re(EnumC4532ca.APPSFLYER) : new Tc(EnumC4532ca.APPSFLYER, map);
    }

    public static ExternalAttribution kochava(JSONObject jSONObject) {
        return jSONObject == null ? new C4923re(EnumC4532ca.KOCHAVA) : new C5072xb(EnumC4532ca.KOCHAVA, jSONObject);
    }

    public static ExternalAttribution singular(Map<String, Object> map) {
        return map == null ? new C4923re(EnumC4532ca.SINGULAR) : new Tc(EnumC4532ca.SINGULAR, map);
    }

    public static ExternalAttribution tenjin(Map<String, String> map) {
        return map == null ? new C4923re(EnumC4532ca.TENJIN) : new Tc(EnumC4532ca.TENJIN, map);
    }
}
