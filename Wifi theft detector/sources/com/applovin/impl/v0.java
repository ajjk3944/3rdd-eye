package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f8257a;

    /* renamed from: b, reason: collision with root package name */
    protected final JSONObject f8258b;

    public enum a {
        NONE(0),
        IS_AL_GDPR(1000),
        IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT(1001),
        HAS_TERMS_OF_SERVICE_URI(1002);


        /* renamed from: a, reason: collision with root package name */
        private final int f8264a;

        a(int i10) {
            this.f8264a = i10;
        }

        public int b() {
            return this.f8264a;
        }
    }

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
        this.f8257a = kVar;
        this.f8258b = jSONObject;
    }

    public static v0 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        b bVarC = c(JsonUtils.getString(jSONObject, HandleInvocationsFromAdViewer.KEY_AD_TYPE, null));
        return bVarC == b.ALERT ? new w0(jSONObject, kVar) : bVarC == b.EVENT ? new y0(jSONObject, kVar) : new v0(jSONObject, kVar);
    }

    public String b() {
        return JsonUtils.getString(this.f8258b, "decision_type", null);
    }

    public int c() {
        return JsonUtils.getInt(this.f8258b, "id", -1);
    }

    public b d() {
        return c(e());
    }

    public String e() {
        return JsonUtils.getString(this.f8258b, HandleInvocationsFromAdViewer.KEY_AD_TYPE, null);
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
        if (NotificationCompat.CATEGORY_EVENT.equalsIgnoreCase(str)) {
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
        throw new IllegalArgumentException("Invalid type provided: " + str);
    }

    public String b(String str) {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f8258b, str, (JSONObject) null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "replacements", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = JsonUtils.getObjectAtIndex(jSONArray, i10, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(string)) {
                String str2 = (String) this.f8257a.A().M().get("app_name");
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
        int i10 = JsonUtils.getInt(this.f8258b, "destination_state_id", -1);
        if (i10 > 0) {
            return i10;
        }
        if (bool != null) {
            return bool.booleanValue() ? JsonUtils.getInt(this.f8258b, "destination_state_id_true", -1) : JsonUtils.getInt(this.f8258b, "destination_state_id_false", -1);
        }
        throw new IllegalStateException("Decision needed for state: " + i10);
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
