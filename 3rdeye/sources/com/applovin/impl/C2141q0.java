package com.applovin.impl;

import N7.H7;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g0.C4356c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2141q0 {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f20732a;

    /* renamed from: b, reason: collision with root package name */
    protected final JSONObject f20733b;

    /* renamed from: com.applovin.impl.q0$a */
    public enum a {
        NONE(0),
        IS_AL_GDPR(1000),
        IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT(1001),
        HAS_TERMS_OF_SERVICE_URI(1002);


        /* renamed from: a, reason: collision with root package name */
        private final int f20739a;

        a(int i) {
            this.f20739a = i;
        }

        public int b() {
            return this.f20739a;
        }
    }

    /* renamed from: com.applovin.impl.q0$b */
    public enum b {
        ALERT,
        POST_ALERT,
        EVENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION
    }

    public C2141q0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f20732a = kVar;
        this.f20733b = jSONObject;
    }

    public static C2141q0 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        b bVarC = c(JsonUtils.getString(jSONObject, "type", null));
        return bVarC == b.ALERT ? new C2142r0(jSONObject, kVar) : bVarC == b.EVENT ? new C2146t0(jSONObject, kVar) : new C2141q0(jSONObject, kVar);
    }

    public int b() {
        return JsonUtils.getInt(this.f20733b, FacebookMediationAdapter.KEY_ID, -1);
    }

    public b c() {
        return c(JsonUtils.getString(this.f20733b, "type", null));
    }

    public String toString() {
        return "ConsentFlowState{id=" + b() + ", type=" + c() + "}";
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
        throw new IllegalArgumentException(androidx.work.s.d("Invalid type provided: ", str));
    }

    public String b(String str) {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f20733b, str, (JSONObject) null);
        JSONArray jSONArrayQ = H7.q("replacements", jSONObject);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayQ.length(); i++) {
            String string = JsonUtils.getObjectAtIndex(jSONArrayQ, i, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(string)) {
                String str2 = (String) this.f20732a.B().K().get("app_name");
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
        return a(JsonUtils.getString(this.f20733b, "decision_type", null));
    }

    public int a(Boolean bool) {
        int i = JsonUtils.getInt(this.f20733b, "destination_state_id", -1);
        if (i > 0) {
            return i;
        }
        if (bool != null) {
            return bool.booleanValue() ? JsonUtils.getInt(this.f20733b, "destination_state_id_true", -1) : JsonUtils.getInt(this.f20733b, "destination_state_id_false", -1);
        }
        throw new IllegalStateException(C4356c.h(i, "Decision needed for state: "));
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
