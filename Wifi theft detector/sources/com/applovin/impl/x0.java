package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f8403a;

    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    private x0(JSONObject jSONObject) {
        this.f8403a = jSONObject;
    }

    public static x0 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, CampaignEx.JSON_KEY_TITLE, (JSONObject) null), "key", null);
        if ("TOS".equalsIgnoreCase(string) && kVar.x().h() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && kVar.x().f() == null) {
            return null;
        }
        return new x0(jSONObject);
    }

    public String b() {
        return JsonUtils.getString(this.f8403a, NotificationCompat.CATEGORY_EVENT, null);
    }

    public a c() {
        String string = JsonUtils.getString(this.f8403a, TtmlNode.TAG_STYLE, null);
        return BuildConfig.FLAVOR.equalsIgnoreCase(string) ? a.POSITIVE : ("destructive".equalsIgnoreCase(string) || "cancel".equalsIgnoreCase(string)) ? a.NEGATIVE : a.NEUTRAL;
    }

    public String d() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f8403a, CampaignEx.JSON_KEY_TITLE, (JSONObject) null);
        return com.applovin.impl.sdk.k.a(JsonUtils.getString(jSONObject, "key", ""), JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + d() + ", destinationStateId=" + a() + ", event=" + b() + "}";
    }

    public int a() {
        return JsonUtils.getInt(this.f8403a, "destination_state_id", -1);
    }
}
