package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f5854a;

    /* renamed from: b, reason: collision with root package name */
    protected final JSONObject f5855b;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum a {
        NONE(0),
        IS_AL_GDPR(1000),
        IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT(1001),
        HAS_TERMS_OF_SERVICE_URI(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);


        /* renamed from: a, reason: collision with root package name */
        private final int f5861a;

        a(int i4) {
            this.f5861a = i4;
        }

        public int b() {
            return this.f5861a;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum b {
        ALERT,
        POST_ALERT,
        EVENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION
    }

    public v0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f5854a = kVar;
        this.f5855b = jSONObject;
    }

    public static v0 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        b bVarC = c(JsonUtils.getString(jSONObject, "type", null));
        return bVarC == b.ALERT ? new w0(jSONObject, kVar) : bVarC == b.EVENT ? new y0(jSONObject, kVar) : new v0(jSONObject, kVar);
    }

    public String b() {
        return JsonUtils.getString(this.f5855b, "decision_type", null);
    }

    public int c() {
        return JsonUtils.getInt(this.f5855b, FacebookMediationAdapter.KEY_ID, -1);
    }

    public b d() {
        return c(e());
    }

    public String e() {
        return JsonUtils.getString(this.f5855b, "type", null);
    }

    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + "}";
    }

    private static b c(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return b.ALERT;
        }
        if ("post_alert".equalsIgnoreCase(str)) {
            return b.POST_ALERT;
        }
        if ("event".equalsIgnoreCase(str)) {
            return b.EVENT;
        }
        if ("cmp_load".equalsIgnoreCase(str)) {
            return b.CMP_LOAD;
        }
        if ("cmp_show".equalsIgnoreCase(str)) {
            return b.CMP_SHOW;
        }
        if ("decision".equalsIgnoreCase(str)) {
            return b.DECISION;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return b.REINIT;
        }
        throw new IllegalArgumentException(je.u.t("Invalid type provided: ", str));
    }

    public String b(String str) {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f5855b, str, (JSONObject) null);
        JSONArray jSONArrayS = a0.g.s("replacements", jSONObject);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArrayS.length(); i4++) {
            String string = JsonUtils.getObjectAtIndex(jSONArrayS, i4, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(string)) {
                String str2 = (String) this.f5854a.A().M().get("app_name");
                if (StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(com.applovin.impl.sdk.k.a("THIS_APP"));
                }
            } else {
                arrayList.add(string);
            }
        }
        return com.applovin.impl.sdk.k.a(JsonUtils.getString(jSONObject, "key", null), arrayList);
    }

    public a a() {
        return a(b());
    }

    public int a(Boolean bool) {
        int i4 = JsonUtils.getInt(this.f5855b, "destination_state_id", -1);
        if (i4 > 0) {
            return i4;
        }
        if (bool != null) {
            return bool.booleanValue() ? JsonUtils.getInt(this.f5855b, "destination_state_id_true", -1) : JsonUtils.getInt(this.f5855b, "destination_state_id_false", -1);
        }
        throw new IllegalStateException(je.u.r(i4, "Decision needed for state: "));
    }

    private static a a(String str) {
        if ("is_al_gdpr".equalsIgnoreCase(str)) {
            return a.IS_AL_GDPR;
        }
        if ("is_eligible_for_terms_and_privacy_policy_alert".equalsIgnoreCase(str)) {
            return a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT;
        }
        if ("has_terms_of_service_uri".equalsIgnoreCase(str)) {
            return a.HAS_TERMS_OF_SERVICE_URI;
        }
        return a.NONE;
    }
}
