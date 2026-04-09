package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o7 extends com.applovin.impl.sdk.ad.b implements q4 {

    /* renamed from: n, reason: collision with root package name */
    private final String f7154n;

    /* renamed from: o, reason: collision with root package name */
    private final String f7155o;

    /* renamed from: p, reason: collision with root package name */
    private final x7 f7156p;

    /* renamed from: q, reason: collision with root package name */
    private final long f7157q;

    /* renamed from: r, reason: collision with root package name */
    private final b8 f7158r;

    /* renamed from: s, reason: collision with root package name */
    private final r7 f7159s;

    /* renamed from: t, reason: collision with root package name */
    private final String f7160t;

    /* renamed from: u, reason: collision with root package name */
    private final q7 f7161u;

    /* renamed from: v, reason: collision with root package name */
    private final l4 f7162v;

    /* renamed from: w, reason: collision with root package name */
    private final Set f7163w;

    /* renamed from: x, reason: collision with root package name */
    private final Set f7164x;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f7165a;

        /* renamed from: b, reason: collision with root package name */
        private JSONObject f7166b;

        /* renamed from: c, reason: collision with root package name */
        private com.applovin.impl.sdk.k f7167c;

        /* renamed from: d, reason: collision with root package name */
        private long f7168d;

        /* renamed from: e, reason: collision with root package name */
        private String f7169e;

        /* renamed from: f, reason: collision with root package name */
        private String f7170f;

        /* renamed from: g, reason: collision with root package name */
        private x7 f7171g;

        /* renamed from: h, reason: collision with root package name */
        private b8 f7172h;

        /* renamed from: i, reason: collision with root package name */
        private r7 f7173i;

        /* renamed from: j, reason: collision with root package name */
        private q7 f7174j;

        /* renamed from: k, reason: collision with root package name */
        private Set f7175k;

        /* renamed from: l, reason: collision with root package name */
        private Set f7176l;

        public b b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f7166b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }

        public b b(String str) {
            this.f7169e = str;
            return this;
        }

        public b b(Set set) {
            this.f7175k = set;
            return this;
        }

        public b a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f7165a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public b a(com.applovin.impl.sdk.k kVar) {
            if (kVar != null) {
                this.f7167c = kVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public b a(String str) {
            this.f7170f = str;
            return this;
        }

        public b a(x7 x7Var) {
            this.f7171g = x7Var;
            return this;
        }

        public b a(b8 b8Var) {
            this.f7172h = b8Var;
            return this;
        }

        public b a(r7 r7Var) {
            this.f7173i = r7Var;
            return this;
        }

        public b a(q7 q7Var) {
            this.f7174j = q7Var;
            return this;
        }

        public b a(Set set) {
            this.f7176l = set;
            return this;
        }

        public b a(long j10) {
            this.f7168d = j10;
            return this;
        }

        public o7 a() {
            return new o7(this);
        }
    }

    public enum c {
        COMPANION_AD,
        VIDEO
    }

    public enum d {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    private Set h1() {
        r7 r7Var = this.f7159s;
        return r7Var != null ? r7Var.b() : Collections.EMPTY_SET;
    }

    private String k1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    private Set o1() {
        b8 b8Var = this.f7158r;
        return b8Var != null ? b8Var.b() : Collections.EMPTY_SET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List s(h5 h5Var) {
        return n7.a(h5Var.a("vimp_urls", new JSONObject()), getClCode(), null, k1(), J(), N0(), this.sdk);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public List A() {
        List listA;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new l.a() { // from class: com.applovin.impl.hd
                @Override // l.a
                public final Object apply(Object obj) {
                    return this.f6156a.s((h5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = n7.a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), null, k1(), J(), N0(), this.sdk);
        }
        return listA;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean B0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && f1() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean C0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void E0() {
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String I() {
        return this.f7160t;
    }

    public Set a(d dVar, String str) {
        return a(dVar, new String[]{str});
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri c0() {
        return f1();
    }

    public void d(String str) {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.b("html_template", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7) || !super.equals(obj)) {
            return false;
        }
        o7 o7Var = (o7) obj;
        String str = this.f7154n;
        if (str == null ? o7Var.f7154n != null : !str.equals(o7Var.f7154n)) {
            return false;
        }
        String str2 = this.f7155o;
        if (str2 == null ? o7Var.f7155o != null : !str2.equals(o7Var.f7155o)) {
            return false;
        }
        x7 x7Var = this.f7156p;
        if (x7Var == null ? o7Var.f7156p != null : !x7Var.equals(o7Var.f7156p)) {
            return false;
        }
        b8 b8Var = this.f7158r;
        if (b8Var == null ? o7Var.f7158r != null : !b8Var.equals(o7Var.f7158r)) {
            return false;
        }
        r7 r7Var = this.f7159s;
        if (r7Var == null ? o7Var.f7159s != null : !r7Var.equals(o7Var.f7159s)) {
            return false;
        }
        q7 q7Var = this.f7161u;
        if (q7Var == null ? o7Var.f7161u != null : !q7Var.equals(o7Var.f7161u)) {
            return false;
        }
        Set set = this.f7163w;
        if (set == null ? o7Var.f7163w != null : !set.equals(o7Var.f7163w)) {
            return false;
        }
        Set set2 = this.f7164x;
        Set set3 = o7Var.f7164x;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    public Uri f1() {
        b8 b8Var = this.f7158r;
        if (b8Var != null) {
            return b8Var.c();
        }
        return null;
    }

    public r7 g1() {
        return this.f7159s;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f7157q;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List listG;
        b8 b8Var = this.f7158r;
        return (b8Var == null || (listG = b8Var.g()) == null || listG.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f7154n;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7155o;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        x7 x7Var = this.f7156p;
        int iHashCode4 = (iHashCode3 + (x7Var != null ? x7Var.hashCode() : 0)) * 31;
        b8 b8Var = this.f7158r;
        int iHashCode5 = (iHashCode4 + (b8Var != null ? b8Var.hashCode() : 0)) * 31;
        r7 r7Var = this.f7159s;
        int iHashCode6 = (iHashCode5 + (r7Var != null ? r7Var.hashCode() : 0)) * 31;
        q7 q7Var = this.f7161u;
        int iHashCode7 = (iHashCode6 + (q7Var != null ? q7Var.hashCode() : 0)) * 31;
        Set set = this.f7163w;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set set2 = this.f7164x;
        return iHashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    public String i1() {
        return getStringFromAdObject("html_template", "");
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f7161u != null;
    }

    public c j1() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? c.COMPANION_AD : c.VIDEO;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri l0() {
        c8 c8VarQ1 = q1();
        if (c8VarQ1 != null) {
            return c8VarQ1.e();
        }
        return null;
    }

    public u7 l1() {
        b8 b8Var = this.f7158r;
        if (b8Var != null) {
            return b8Var.f();
        }
        return null;
    }

    public long m1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    public x7 n1() {
        return this.f7156p;
    }

    public b8 p1() {
        return this.f7158r;
    }

    public c8 q1() {
        Long lF = r0.f(this.sdk);
        return this.f7158r.a(lF != null ? lF.longValue() : 0L);
    }

    public boolean r1() {
        return l1() != null;
    }

    public boolean s1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    public void t1() {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.f7154n + "', adDescription='" + this.f7155o + "', systemInfo=" + this.f7156p + ", videoCreative=" + this.f7158r + ", companionAd=" + this.f7159s + ", adVerifications=" + this.f7161u + ", impressionTrackers=" + this.f7163w + ", errorTrackers=" + this.f7164x + '}';
    }

    public boolean u1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean v1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public boolean w1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public boolean x1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean y0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    public boolean y1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    private o7(b bVar) {
        super(bVar.f7165a, bVar.f7166b, bVar.f7167c);
        this.f7154n = bVar.f7169e;
        this.f7156p = bVar.f7171g;
        this.f7155o = bVar.f7170f;
        this.f7158r = bVar.f7172h;
        this.f7159s = bVar.f7173i;
        this.f7161u = bVar.f7174j;
        this.f7163w = bVar.f7175k;
        this.f7164x = bVar.f7176l;
        this.f7162v = new l4(this);
        Uri uriL0 = l0();
        if (uriL0 != null) {
            this.f7160t = uriL0.toString();
        } else {
            this.f7160t = "";
        }
        this.f7157q = bVar.f7168d;
    }

    public Set a(d dVar, String[] strArr) {
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.f7163w;
        }
        if (dVar == d.VIDEO_CLICK) {
            return o1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return h1();
        }
        if (dVar == d.VIDEO) {
            return a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return l1().b();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return l1().f();
        }
        if (dVar == d.ERROR) {
            return this.f7164x;
        }
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.EMPTY_SET;
    }

    public q7 e1() {
        return this.f7161u;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public l4 getAdEventTracker() {
        return this.f7162v;
    }

    private Set a(c cVar, String[] strArr) {
        Map mapD;
        r7 r7Var;
        b8 b8Var;
        if (strArr != null && strArr.length > 0) {
            if (cVar == c.VIDEO && (b8Var = this.f7158r) != null) {
                mapD = b8Var.e();
            } else {
                mapD = (cVar != c.COMPANION_AD || (r7Var = this.f7159s) == null) ? null : r7Var.d();
            }
            HashSet hashSet = new HashSet();
            if (mapD != null && !mapD.isEmpty()) {
                for (String str : strArr) {
                    if (mapD.containsKey(str)) {
                        hashSet.addAll((Collection) mapD.get(str));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.EMPTY_SET;
    }

    public static o7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null);
        if (jSONObject2 == null) {
            return null;
        }
        bVar.f7166b = jSONObject2;
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        bVar.f7165a = jSONObject3;
        bVar.f7167c = kVar;
        bVar.f7168d = JsonUtils.getLong(jSONObject, "created_at_millis", 0L);
        bVar.f7169e = JsonUtils.getString(jSONObject, CampaignEx.JSON_KEY_TITLE, "");
        bVar.f7170f = JsonUtils.getString(jSONObject, "ad_description", "");
        bVar.f7171g = x7.a(JsonUtils.getJSONObject(jSONObject, "system_info", (JSONObject) null), kVar);
        bVar.f7172h = b8.a(JsonUtils.getJSONObject(jSONObject, "video_creative", (JSONObject) null), kVar);
        bVar.f7173i = r7.a(JsonUtils.getJSONObject(jSONObject, "companion_ad", (JSONObject) null), kVar);
        bVar.f7174j = q7.a(JsonUtils.getJSONObject(jSONObject, "ad_verifications", (JSONObject) null), kVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "impression_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), kVar);
            if (y7VarA != null) {
                hashSet.add(y7VarA);
            }
        }
        bVar.f7175k = hashSet;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_trackers", new JSONArray());
        HashSet hashSet2 = new HashSet();
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            y7 y7VarA2 = y7.a(JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null), kVar);
            if (y7VarA2 != null) {
                hashSet2.add(y7VarA2);
            }
        }
        bVar.f7176l = hashSet2;
        o7 o7Var = new o7(bVar);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject, "cached_ad_html_resources_urls", new JSONObject());
        Iterator<String> itKeys = jSONObject4.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = JsonUtils.getString(jSONObject4, next, null);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                o7Var.a(next, string);
            }
        }
        return o7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "created_at_millis", this.f7157q);
        JsonUtils.putString(jSONObject, CampaignEx.JSON_KEY_TITLE, this.f7154n);
        JsonUtils.putString(jSONObject, "ad_description", this.f7155o);
        x7 x7Var = this.f7156p;
        if (x7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "system_info", x7Var.a());
        }
        b8 b8Var = this.f7158r;
        if (b8Var != null) {
            JsonUtils.putJSONObject(jSONObject, "video_creative", b8Var.a());
        }
        r7 r7Var = this.f7159s;
        if (r7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "companion_ad", r7Var.a());
        }
        q7 q7Var = this.f7161u;
        if (q7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "ad_verifications", q7Var.a());
        }
        if (this.f7163w != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f7163w.iterator();
            while (it.hasNext()) {
                jSONArray.put(((y7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "impression_trackers", jSONArray);
        }
        if (this.f7164x != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f7164x.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((y7) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_trackers", jSONArray2);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : l().entrySet()) {
            JsonUtils.putString(jSONObject2, (String) entry.getKey(), (String) entry.getValue());
        }
        JsonUtils.putJSONObject(jSONObject, "cached_ad_html_resources_urls", jSONObject2);
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", h5Var.a());
            return jSONObject;
        }
        synchronized (this.fullResponseLock) {
            JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
        }
        return jSONObject;
    }
}
