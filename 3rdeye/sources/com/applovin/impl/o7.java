package com.applovin.impl;

import N7.H7;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o7 implements d4 {

    /* renamed from: a, reason: collision with root package name */
    private List f20633a;

    /* renamed from: b, reason: collision with root package name */
    private List f20634b;

    /* renamed from: c, reason: collision with root package name */
    private int f20635c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f20636d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f20637e;

    /* renamed from: f, reason: collision with root package name */
    private h7 f20638f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f20639g;

    private o7() {
        List list = Collections.EMPTY_LIST;
        this.f20633a = list;
        this.f20634b = list;
        this.f20637e = new HashSet();
        this.f20639g = new HashMap();
    }

    public static o7 a(c8 c8Var, o7 o7Var, f7 f7Var, com.applovin.impl.sdk.k kVar) {
        c8 c8VarC;
        h7 h7VarA;
        List listA;
        c8 c8VarC2;
        List listA2;
        c8 c8VarC3;
        int iA;
        if (c8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (f7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (o7Var == null) {
            try {
                o7Var = new o7(f7Var);
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastVideoCreative", "Error occurred while initializing", th);
                }
                kVar.E().a("VastVideoCreative", th);
                return null;
            }
        }
        if (o7Var.f20635c == 0 && (c8VarC3 = c8Var.c("Duration")) != null && (iA = a(c8VarC3.d(), kVar)) > 0) {
            o7Var.f20635c = iA;
        }
        c8 c8VarC4 = c8Var.c("MediaFiles");
        if (c8VarC4 != null && (listA2 = a(c8VarC4, kVar)) != null && listA2.size() > 0) {
            List list = o7Var.f20633a;
            if (list != null) {
                listA2.addAll(list);
            }
            o7Var.f20633a = listA2;
        }
        c8 c8VarC5 = c8Var.c("VideoClicks");
        if (c8VarC5 != null) {
            if (o7Var.f20636d == null && (c8VarC2 = c8VarC5.c("ClickThrough")) != null) {
                String strD = c8VarC2.d();
                if (StringUtils.isValidString(strD)) {
                    o7Var.f20636d = Uri.parse(strD);
                }
            }
            n7.a(c8VarC5.a("ClickTracking"), o7Var.f20637e, f7Var, kVar);
        }
        c8 c8VarC6 = c8Var.c("Icons");
        if (c8VarC6 != null && (h7VarA = h7.a((c8VarC = c8VarC6.c("Icon")), kVar)) != null) {
            c8 c8VarC7 = c8VarC.c("IconClicks");
            if (c8VarC7 != null && (listA = c8VarC7.a("IconClickTracking")) != null) {
                n7.a(listA, h7VarA.f19506a, f7Var, kVar);
            }
            List listA3 = c8VarC.a("IconViewTracking");
            if (listA3 != null) {
                n7.a(listA3, h7VarA.f19507b, f7Var, kVar);
            }
            o7Var.f20638f = h7VarA;
        }
        n7.a(c8Var, o7Var.f20639g, f7Var, kVar);
        return o7Var;
    }

    public Uri c() {
        return this.f20636d;
    }

    public int d() {
        return this.f20635c;
    }

    public Map e() {
        return this.f20639g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7)) {
            return false;
        }
        o7 o7Var = (o7) obj;
        if (this.f20635c != o7Var.f20635c) {
            return false;
        }
        List list = this.f20633a;
        if (list == null ? o7Var.f20633a != null : !list.equals(o7Var.f20633a)) {
            return false;
        }
        Uri uri = this.f20636d;
        if (uri == null ? o7Var.f20636d != null : !uri.equals(o7Var.f20636d)) {
            return false;
        }
        Set set = this.f20637e;
        if (set == null ? o7Var.f20637e != null : !set.equals(o7Var.f20637e)) {
            return false;
        }
        Map map = this.f20639g;
        Map map2 = o7Var.f20639g;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public h7 f() {
        return this.f20638f;
    }

    public List g() {
        return this.f20633a;
    }

    public int hashCode() {
        List list = this.f20633a;
        int iHashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f20635c) * 31;
        Uri uri = this.f20636d;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set set = this.f20637e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f20639g;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f20633a + ", durationSeconds=" + this.f20635c + ", destinationUri=" + this.f20636d + ", clickTrackers=" + this.f20637e + ", eventTrackers=" + this.f20639g + ", industryIcon=" + this.f20638f + '}';
    }

    public Set b() {
        return this.f20637e;
    }

    private o7(f7 f7Var) {
        List list = Collections.EMPTY_LIST;
        this.f20633a = list;
        this.f20634b = list;
        this.f20637e = new HashSet();
        this.f20639g = new HashMap();
        this.f20634b = f7Var.f();
    }

    private static int a(String str, com.applovin.impl.sdk.k kVar) {
        try {
            if (CollectionUtils.explode(str, io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER).size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(r1.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(r1.get(1))) + StringUtils.parseInt(r1.get(2)));
            }
        } catch (Throwable unused) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    private static List a(c8 c8Var, com.applovin.impl.sdk.k kVar) {
        List listA = c8Var.a("MediaFile");
        ArrayList arrayList = new ArrayList(listA.size());
        List<String> listExplode = CollectionUtils.explode((String) kVar.a(l4.f20031t4));
        List<String> listExplode2 = CollectionUtils.explode((String) kVar.a(l4.f20023s4));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            p7 p7VarA = p7.a((c8) it.next(), kVar);
            if (p7VarA != null) {
                try {
                    String strC = p7VarA.c();
                    if (StringUtils.isValidString(strC) && !listExplode.contains(strC)) {
                        arrayList.add(p7VarA);
                    } else {
                        if (((Boolean) kVar.a(l4.f20039u4)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(p7VarA.e().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !listExplode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(p7VarA);
                            }
                        }
                        kVar.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            kVar.O().k("VastVideoCreative", "Video file not supported: " + p7VarA);
                        }
                    }
                } catch (Throwable th) {
                    kVar.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        kVar.O().a("VastVideoCreative", "Failed to validate video file: " + p7VarA, th);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    public p7 a(long j4) {
        List list = this.f20633a;
        p7 p7Var = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        for (String str : this.f20634b) {
            for (p7 p7Var2 : this.f20633a) {
                String strC = p7Var2.c();
                if (StringUtils.isValidString(strC) && str.equalsIgnoreCase(strC)) {
                    arrayList.add(p7Var2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList<p7> arrayList2 = arrayList;
        if (zIsEmpty) {
            arrayList2 = this.f20633a;
        }
        Collections.sort(arrayList2, new T4.a(1));
        for (p7 p7Var3 : arrayList2) {
            if (p7Var3.b() > j4) {
                break;
            }
            p7Var = p7Var3;
        }
        return p7Var != null ? p7Var : (p7) arrayList2.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(p7 p7Var, p7 p7Var2) {
        return Long.compare(p7Var.b(), p7Var2.b());
    }

    public static o7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        o7 o7Var = new o7();
        JSONArray jSONArrayQ = H7.q("video_files", jSONObject);
        o7Var.f20633a = new ArrayList();
        for (int i = 0; i < jSONArrayQ.length(); i++) {
            p7 p7VarA = p7.a(JsonUtils.getJSONObject(jSONArrayQ, i, (JSONObject) null), kVar);
            if (p7VarA != null) {
                o7Var.f20633a.add(p7VarA);
            }
        }
        o7Var.f20634b = JsonUtils.getStringList(jSONObject, "preferred_video_file_types", Collections.EMPTY_LIST);
        o7Var.f20635c = JsonUtils.getInt(jSONObject, "duration_seconds", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        o7Var.f20636d = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        JSONArray jSONArrayQ2 = H7.q("click_trackers", jSONObject);
        for (int i10 = 0; i10 < jSONArrayQ2.length(); i10++) {
            l7 l7VarA = l7.a(JsonUtils.getJSONObject(jSONArrayQ2, i10, (JSONObject) null), kVar);
            if (l7VarA != null) {
                o7Var.f20637e.add(l7VarA);
            }
        }
        o7Var.f20638f = h7.a(JsonUtils.getJSONObject(jSONObject, "industry_icon", (JSONObject) null), kVar);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "event_trackers", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            HashSet hashSet = new HashSet();
            String next = itKeys.next();
            JSONArray jSONArrayQ3 = H7.q(next, jSONObject2);
            for (int i11 = 0; i11 < jSONArrayQ3.length(); i11++) {
                l7 l7VarA2 = l7.a(JsonUtils.getJSONObject(jSONArrayQ3, i11, (JSONObject) null), kVar);
                if (l7VarA2 != null) {
                    hashSet.add(l7VarA2);
                }
            }
            o7Var.f20639g.put(next, hashSet);
        }
        return o7Var;
    }

    @Override // com.applovin.impl.d4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List list = this.f20633a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((p7) it.next()).a());
            }
        }
        JsonUtils.putJsonArray(jSONObject, "video_files", jSONArray);
        JsonUtils.putJsonArray(jSONObject, "preferred_video_file_types", new JSONArray((Collection) this.f20634b));
        JsonUtils.putInt(jSONObject, "duration_seconds", this.f20635c);
        Uri uri = this.f20636d;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f20637e.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((l7) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray2);
        h7 h7Var = this.f20638f;
        if (h7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "industry_icon", h7Var.a());
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f20639g.keySet()) {
            Set set = (Set) this.f20639g.get(str);
            if (set != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((l7) it3.next()).a());
                }
                JsonUtils.putJsonArray(jSONObject2, str, jSONArray3);
            }
        }
        JsonUtils.putJSONObject(jSONObject, "event_trackers", jSONObject2);
        return jSONObject;
    }
}
