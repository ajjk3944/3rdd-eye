package com.yandex.mobile.ads.impl;

import R9.AbstractC1564a;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    private final iz0 f24716a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1564a f24717b;

    public /* synthetic */ al() {
        iz0 iz0Var = new iz0();
        iq0.f28836a.getClass();
        this(iz0Var, iq0.a());
    }

    public final n9 a(JSONObject adUnitIdBiddingSettingsJson) {
        String strA;
        kotlin.jvm.internal.l.f(adUnitIdBiddingSettingsJson, "adUnitIdBiddingSettingsJson");
        try {
            try {
                iq0.f28836a.getClass();
                strA = iq0.a(Constants.ADMON_AD_UNIT_ID, adUnitIdBiddingSettingsJson);
            } catch (JSONException unused) {
                iq0.f28836a.getClass();
                strA = iq0.a("block_id", adUnitIdBiddingSettingsJson);
            }
            JSONArray jSONArrayOptJSONArray = adUnitIdBiddingSettingsJson.optJSONArray("networks");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    iz0 iz0Var = this.f24716a;
                    kotlin.jvm.internal.l.c(jSONObject);
                    zy0 zy0VarA = iz0Var.a(jSONObject);
                    if (zy0VarA != null) {
                        arrayList.add(zy0VarA);
                    }
                }
                if (!arrayList.isEmpty()) {
                    String string = adUnitIdBiddingSettingsJson.toString();
                    kotlin.jvm.internal.l.e(string, "toString(...)");
                    return new n9(strA, string, arrayList);
                }
            }
        } catch (JSONException unused2) {
            fp0.b(new Object[0]);
        }
        return null;
    }

    public final zk b(JSONObject jsonBiddingSettings) throws JSONException {
        JSONObject jSONObject;
        vz0 vz0Var;
        String string;
        kotlin.jvm.internal.l.f(jsonBiddingSettings, "jsonBiddingSettings");
        try {
            jSONObject = jsonBiddingSettings.getJSONObject("mediation_prefetch_settings");
        } catch (Exception unused) {
            jSONObject = null;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jsonBiddingSettings.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = jsonBiddingSettings.optJSONArray("block_id_settings");
            }
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    kotlin.jvm.internal.l.c(jSONObject2);
                    n9 n9VarA = a(jSONObject2);
                    if (n9VarA != null) {
                        arrayList.add(n9VarA);
                    }
                }
            }
            if (jSONObject == null || (string = jSONObject.toString()) == null) {
                vz0Var = null;
            } else {
                AbstractC1564a abstractC1564a = this.f24717b;
                abstractC1564a.getClass();
                vz0Var = (vz0) abstractC1564a.a(N9.a.b(vz0.Companion.serializer()), string);
            }
            if (arrayList.isEmpty() && vz0Var == null) {
                return null;
            }
            return new zk(arrayList, vz0Var);
        } catch (JSONException unused2) {
            fp0.b(new Object[0]);
            return null;
        }
    }

    public al(iz0 mediationNetworkParser, AbstractC1564a jsonParser) {
        kotlin.jvm.internal.l.f(mediationNetworkParser, "mediationNetworkParser");
        kotlin.jvm.internal.l.f(jsonParser, "jsonParser");
        this.f24716a = mediationNetworkParser;
        this.f24717b = jsonParser;
    }
}
