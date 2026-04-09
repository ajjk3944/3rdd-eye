package com.applovin.impl.sdk.ad;

import E.x;
import N7.H7;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.adview.e;
import com.applovin.impl.d4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.v4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends b implements d4 {

    /* renamed from: m, reason: collision with root package name */
    private final String f21039m;

    /* renamed from: n, reason: collision with root package name */
    private final String f21040n;

    /* renamed from: o, reason: collision with root package name */
    private final String f21041o;

    /* renamed from: p, reason: collision with root package name */
    private final t3 f21042p;

    public a(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, kVar);
        this.f21039m = o1();
        this.f21040n = s1();
        this.f21041o = r1();
        this.f21042p = new t3(this);
    }

    public static a a(JSONObject jSONObject, k kVar) throws JSONException {
        JSONObject jSONObject2;
        if (jSONObject == null || (jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null)) == null) {
            return null;
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, "ads", new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject3, "html", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String string2 = JsonUtils.getString(jSONObject3, "video", "");
        JsonUtils.putString(jSONObject3, "html", JsonUtils.getString(jSONObject, "original_html_source", ""));
        JsonUtils.putString(jSONObject3, "video", JsonUtils.getString(jSONObject, "original_video_uri_string", ""));
        a aVar = new a(jSONObject3, jSONObject2, kVar);
        JSONArray jSONArrayQ = H7.q("cached_ad_html_resources_urls", jSONObject);
        for (int i = 0; i < jSONArrayQ.length(); i++) {
            Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArrayQ, i, null);
            if (objectAtIndex instanceof String) {
                String str = (String) objectAtIndex;
                if (!TextUtils.isEmpty(str)) {
                    aVar.a(Uri.parse(str));
                }
            }
        }
        aVar.d(string);
        if (StringUtils.isValidString(string2)) {
            aVar.d(Uri.parse(string2));
        }
        return aVar;
    }

    private String r1() {
        return getStringFromAdObject("stream_url", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(v4 v4Var) {
        v4Var.b("html", this.f21039m);
        v4Var.b("stream_url", this.f21041o);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean M0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean Q0() {
        return containsKeyForAdObject("stream_url");
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String S() {
        return this.f21040n;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void S0() {
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            v4Var.a(new x(this, 3));
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.f21039m);
            JsonUtils.putString(this.adObject, "stream_url", this.f21041o);
        }
    }

    public void d(String str) {
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            v4Var.b("html", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", str);
        }
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() throws JSONException {
        JSONObject jSONObjectDeepCopy;
        JSONObject jSONObjectA;
        v4 v4Var = this.synchronizedFullResponse;
        if (v4Var != null) {
            jSONObjectA = v4Var.a();
        } else {
            synchronized (this.fullResponseLock) {
                jSONObjectDeepCopy = JsonUtils.deepCopy(this.fullResponse);
            }
            jSONObjectA = jSONObjectDeepCopy;
        }
        JSONArray jSONArrayQ = H7.q("ads", jSONObjectA);
        if (jSONArrayQ.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArrayQ, 0, new JSONObject());
            JsonUtils.putString(jSONObject, "html", this.f21039m);
            JsonUtils.putString(jSONObject, "video", this.f21040n);
            JsonUtils.putString(jSONObject, "stream_url", this.f21041o);
        }
        return jSONObjectA;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        return w0() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.r3
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.d0().e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri m() {
        String stringFromAdObject = getStringFromAdObject("click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri n0() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : m();
    }

    public String o1() {
        return getStringFromAdObject("html", "");
    }

    public float p1() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    public String q1() {
        return this.f21041o;
    }

    public String s1() {
        return getStringFromAdObject("video", "");
    }

    public boolean t1() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    public void u1() {
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            v4Var.c("stream_url");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri w0() {
        String strR1 = r1();
        if (StringUtils.isValidString(strR1)) {
            return Uri.parse(strR1);
        }
        String strS1 = s1();
        if (StringUtils.isValidString(strS1)) {
            return Uri.parse(strS1);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.r3
    public t3 getAdEventTracker() {
        return this.f21042p;
    }

    public e.a n1() {
        return a(getIntFromAdObject("expandable_style", e.a.INVISIBLE.b()));
    }

    public void d(Uri uri) {
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            v4Var.b("video", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    @Override // com.applovin.impl.d4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "original_html_source", this.f21039m);
        JsonUtils.putString(jSONObject, "original_video_uri_string", this.f21040n);
        JsonUtils.putString(jSONObject, "original_video_stream_uri_string", this.f21041o);
        ArrayList arrayList = new ArrayList();
        Iterator it = l().iterator();
        while (it.hasNext()) {
            arrayList.add(((Uri) it.next()).toString());
        }
        JsonUtils.putJsonArray(jSONObject, "cached_ad_html_resources_urls", new JSONArray((Collection) arrayList));
        v4 v4Var = this.synchronizedFullResponse;
        if (v4Var != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", v4Var.a());
            return jSONObject;
        }
        synchronized (this.fullResponseLock) {
            JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
        }
        return jSONObject;
    }
}
