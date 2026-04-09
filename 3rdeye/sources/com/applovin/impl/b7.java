package com.applovin.impl;

import N7.H7;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.github.appintro.AppIntroBaseFragmentKt;
import java.util.ArrayList;
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
import r.InterfaceC5503a;

/* loaded from: classes.dex */
public class b7 extends com.applovin.impl.sdk.ad.b implements d4 {

    /* renamed from: m, reason: collision with root package name */
    private final String f19108m;

    /* renamed from: n, reason: collision with root package name */
    private final String f19109n;

    /* renamed from: o, reason: collision with root package name */
    private final k7 f19110o;

    /* renamed from: p, reason: collision with root package name */
    private final long f19111p;

    /* renamed from: q, reason: collision with root package name */
    private final o7 f19112q;

    /* renamed from: r, reason: collision with root package name */
    private final e7 f19113r;

    /* renamed from: s, reason: collision with root package name */
    private final String f19114s;

    /* renamed from: t, reason: collision with root package name */
    private final d7 f19115t;

    /* renamed from: u, reason: collision with root package name */
    private final y3 f19116u;

    /* renamed from: v, reason: collision with root package name */
    private final Set f19117v;

    /* renamed from: w, reason: collision with root package name */
    private final Set f19118w;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f19119a;

        /* renamed from: b, reason: collision with root package name */
        private JSONObject f19120b;

        /* renamed from: c, reason: collision with root package name */
        private com.applovin.impl.sdk.k f19121c;

        /* renamed from: d, reason: collision with root package name */
        private long f19122d;

        /* renamed from: e, reason: collision with root package name */
        private String f19123e;

        /* renamed from: f, reason: collision with root package name */
        private String f19124f;

        /* renamed from: g, reason: collision with root package name */
        private k7 f19125g;

        /* renamed from: h, reason: collision with root package name */
        private o7 f19126h;
        private e7 i;

        /* renamed from: j, reason: collision with root package name */
        private d7 f19127j;

        /* renamed from: k, reason: collision with root package name */
        private Set f19128k;

        /* renamed from: l, reason: collision with root package name */
        private Set f19129l;

        public b b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f19120b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }

        public b b(String str) {
            this.f19123e = str;
            return this;
        }

        public b b(Set set) {
            this.f19128k = set;
            return this;
        }

        public b a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f19119a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public b a(com.applovin.impl.sdk.k kVar) {
            if (kVar != null) {
                this.f19121c = kVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public b a(String str) {
            this.f19124f = str;
            return this;
        }

        public b a(k7 k7Var) {
            this.f19125g = k7Var;
            return this;
        }

        public b a(o7 o7Var) {
            this.f19126h = o7Var;
            return this;
        }

        public b a(e7 e7Var) {
            this.i = e7Var;
            return this;
        }

        public b a(d7 d7Var) {
            this.f19127j = d7Var;
            return this;
        }

        public b a(Set set) {
            this.f19129l = set;
            return this;
        }

        public b a(long j4) {
            this.f19122d = j4;
            return this;
        }

        public b7 a() {
            return new b7(this);
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

    private Set p1() {
        e7 e7Var = this.f19113r;
        return e7Var != null ? e7Var.b() : Collections.EMPTY_SET;
    }

    private String s1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List t(v4 v4Var) {
        return a7.a(v4Var.a("vimp_urls", new JSONObject()), getClCode(), null, s1(), T(), Z0(), this.sdk);
    }

    private Set w1() {
        o7 o7Var = this.f19112q;
        return o7Var != null ? o7Var.b() : Collections.EMPTY_SET;
    }

    public boolean A1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    public void B1() {
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            v4Var.c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    public boolean C1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean D1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public boolean E1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public boolean F1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    public boolean G1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public List J() {
        List listA;
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            return (List) v4Var.a(new InterfaceC5503a() { // from class: com.applovin.impl.E
                @Override // r.InterfaceC5503a
                public final Object apply(Object obj) {
                    return this.f18796a.t((v4) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = a7.a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), null, s1(), T(), Z0(), this.sdk);
        }
        return listA;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean M0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean P0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && m() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean Q0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String S() {
        return this.f19114s;
    }

    public Set a(d dVar, String str) {
        return a(dVar, new String[]{str});
    }

    public void d(String str) {
        v4 v4Var = this.synchronizedAdObject;
        if (v4Var != null) {
            v4Var.b("html_template", str);
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
        if (!(obj instanceof b7) || !super.equals(obj)) {
            return false;
        }
        b7 b7Var = (b7) obj;
        String str = this.f19108m;
        if (str == null ? b7Var.f19108m != null : !str.equals(b7Var.f19108m)) {
            return false;
        }
        String str2 = this.f19109n;
        if (str2 == null ? b7Var.f19109n != null : !str2.equals(b7Var.f19109n)) {
            return false;
        }
        k7 k7Var = this.f19110o;
        if (k7Var == null ? b7Var.f19110o != null : !k7Var.equals(b7Var.f19110o)) {
            return false;
        }
        o7 o7Var = this.f19112q;
        if (o7Var == null ? b7Var.f19112q != null : !o7Var.equals(b7Var.f19112q)) {
            return false;
        }
        e7 e7Var = this.f19113r;
        if (e7Var == null ? b7Var.f19113r != null : !e7Var.equals(b7Var.f19113r)) {
            return false;
        }
        d7 d7Var = this.f19115t;
        if (d7Var == null ? b7Var.f19115t != null : !d7Var.equals(b7Var.f19115t)) {
            return false;
        }
        Set set = this.f19117v;
        if (set == null ? b7Var.f19117v != null : !set.equals(b7Var.f19117v)) {
            return false;
        }
        Set set2 = this.f19118w;
        Set set3 = b7Var.f19118w;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f19111p;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List listG;
        o7 o7Var = this.f19112q;
        return (o7Var == null || (listG = o7Var.g()) == null || listG.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f19108m;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19109n;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        k7 k7Var = this.f19110o;
        int iHashCode4 = (iHashCode3 + (k7Var != null ? k7Var.hashCode() : 0)) * 31;
        o7 o7Var = this.f19112q;
        int iHashCode5 = (iHashCode4 + (o7Var != null ? o7Var.hashCode() : 0)) * 31;
        e7 e7Var = this.f19113r;
        int iHashCode6 = (iHashCode5 + (e7Var != null ? e7Var.hashCode() : 0)) * 31;
        d7 d7Var = this.f19115t;
        int iHashCode7 = (iHashCode6 + (d7Var != null ? d7Var.hashCode() : 0)) * 31;
        Set set = this.f19117v;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set set2 = this.f19118w;
        return iHashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.r3
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f19115t != null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri m() {
        o7 o7Var = this.f19112q;
        if (o7Var != null) {
            return o7Var.c();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri n0() {
        return m();
    }

    public e7 o1() {
        return this.f19113r;
    }

    public String q1() {
        return getStringFromAdObject("html_template", "");
    }

    public c r1() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? c.COMPANION_AD : c.VIDEO;
    }

    public h7 t1() {
        o7 o7Var = this.f19112q;
        if (o7Var != null) {
            return o7Var.f();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.f19108m + "', adDescription='" + this.f19109n + "', systemInfo=" + this.f19110o + ", videoCreative=" + this.f19112q + ", companionAd=" + this.f19113r + ", adVerifications=" + this.f19115t + ", impressionTrackers=" + this.f19117v + ", errorTrackers=" + this.f19118w + '}';
    }

    public long u1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    public k7 v1() {
        return this.f19110o;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri w0() {
        p7 p7VarY1 = y1();
        if (p7VarY1 != null) {
            return p7VarY1.e();
        }
        return null;
    }

    public o7 x1() {
        return this.f19112q;
    }

    public p7 y1() {
        Long lF = AbstractC2135n0.f(this.sdk);
        return this.f19112q.a(lF != null ? lF.longValue() : 0L);
    }

    public boolean z1() {
        return t1() != null;
    }

    private b7(b bVar) {
        super(bVar.f19119a, bVar.f19120b, bVar.f19121c);
        this.f19108m = bVar.f19123e;
        this.f19110o = bVar.f19125g;
        this.f19109n = bVar.f19124f;
        this.f19112q = bVar.f19126h;
        this.f19113r = bVar.i;
        this.f19115t = bVar.f19127j;
        this.f19117v = bVar.f19128k;
        this.f19118w = bVar.f19129l;
        this.f19116u = new y3(this);
        Uri uriW0 = w0();
        if (uriW0 != null) {
            this.f19114s = uriW0.toString();
        } else {
            this.f19114s = "";
        }
        this.f19111p = bVar.f19122d;
    }

    public Set a(d dVar, String[] strArr) {
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.f19117v;
        }
        if (dVar == d.VIDEO_CLICK) {
            return w1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return p1();
        }
        if (dVar == d.VIDEO) {
            return a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return t1().b();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return t1().f();
        }
        if (dVar == d.ERROR) {
            return this.f19118w;
        }
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.EMPTY_SET;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.r3
    public y3 getAdEventTracker() {
        return this.f19116u;
    }

    public d7 n1() {
        return this.f19115t;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void S0() {
    }

    private Set a(c cVar, String[] strArr) {
        Map mapD;
        e7 e7Var;
        o7 o7Var;
        if (strArr != null && strArr.length > 0) {
            if (cVar == c.VIDEO && (o7Var = this.f19112q) != null) {
                mapD = o7Var.e();
            } else {
                mapD = (cVar != c.COMPANION_AD || (e7Var = this.f19113r) == null) ? null : e7Var.d();
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

    public static b7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null);
        if (jSONObject2 == null) {
            return null;
        }
        bVar.f19120b = jSONObject2;
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, "ads", new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        bVar.f19119a = jSONObject3;
        bVar.f19121c = kVar;
        bVar.f19122d = JsonUtils.getLong(jSONObject, "created_at_millis", 0L);
        bVar.f19123e = JsonUtils.getString(jSONObject, AppIntroBaseFragmentKt.ARG_TITLE, "");
        bVar.f19124f = JsonUtils.getString(jSONObject, "ad_description", "");
        bVar.f19125g = k7.a(JsonUtils.getJSONObject(jSONObject, "system_info", (JSONObject) null), kVar);
        bVar.f19126h = o7.a(JsonUtils.getJSONObject(jSONObject, "video_creative", (JSONObject) null), kVar);
        bVar.i = e7.a(JsonUtils.getJSONObject(jSONObject, "companion_ad", (JSONObject) null), kVar);
        bVar.f19127j = d7.a(JsonUtils.getJSONObject(jSONObject, "ad_verifications", (JSONObject) null), kVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "impression_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            l7 l7VarA = l7.a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), kVar);
            if (l7VarA != null) {
                hashSet.add(l7VarA);
            }
        }
        bVar.f19128k = hashSet;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_trackers", new JSONArray());
        HashSet hashSet2 = new HashSet();
        for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
            l7 l7VarA2 = l7.a(JsonUtils.getJSONObject(jSONArray2, i10, (JSONObject) null), kVar);
            if (l7VarA2 != null) {
                hashSet2.add(l7VarA2);
            }
        }
        bVar.f19129l = hashSet2;
        b7 b7Var = new b7(bVar);
        JSONArray jSONArrayQ = H7.q("cached_ad_html_resources_urls", jSONObject);
        for (int i11 = 0; i11 < jSONArrayQ.length(); i11++) {
            Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArrayQ, i11, null);
            if (objectAtIndex instanceof String) {
                String str = (String) objectAtIndex;
                if (!TextUtils.isEmpty(str)) {
                    b7Var.a(Uri.parse(str));
                }
            }
        }
        return b7Var;
    }

    @Override // com.applovin.impl.d4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "created_at_millis", this.f19111p);
        JsonUtils.putString(jSONObject, AppIntroBaseFragmentKt.ARG_TITLE, this.f19108m);
        JsonUtils.putString(jSONObject, "ad_description", this.f19109n);
        k7 k7Var = this.f19110o;
        if (k7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "system_info", k7Var.a());
        }
        o7 o7Var = this.f19112q;
        if (o7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "video_creative", o7Var.a());
        }
        e7 e7Var = this.f19113r;
        if (e7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "companion_ad", e7Var.a());
        }
        d7 d7Var = this.f19115t;
        if (d7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "ad_verifications", d7Var.a());
        }
        if (this.f19117v != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f19117v.iterator();
            while (it.hasNext()) {
                jSONArray.put(((l7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "impression_trackers", jSONArray);
        }
        if (this.f19118w != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f19118w.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((l7) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_trackers", jSONArray2);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = l().iterator();
        while (it3.hasNext()) {
            arrayList.add(((Uri) it3.next()).toString());
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
