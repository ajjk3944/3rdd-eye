package com.applovin.impl;

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
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class b8 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private List f3782a;

    /* renamed from: b, reason: collision with root package name */
    private List f3783b;

    /* renamed from: c, reason: collision with root package name */
    private int f3784c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f3785d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f3786e;

    /* renamed from: f, reason: collision with root package name */
    private u7 f3787f;
    private final Map g;

    private b8() {
        List list = Collections.EMPTY_LIST;
        this.f3782a = list;
        this.f3783b = list;
        this.f3786e = new HashSet();
        this.g = new HashMap();
    }

    public static b8 a(p8 p8Var, b8 b8Var, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        p8 p8VarC;
        u7 u7VarA;
        List listA;
        p8 p8VarC2;
        List listA2;
        p8 p8VarC3;
        int iA;
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (s7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (b8Var == null) {
            try {
                b8Var = new b8(s7Var);
            } catch (Throwable th2) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastVideoCreative", "Error occurred while initializing", th2);
                }
                kVar.D().a("VastVideoCreative", th2);
                return null;
            }
        }
        if (b8Var.f3784c == 0 && (p8VarC3 = p8Var.c("Duration")) != null && (iA = a(p8VarC3.d(), kVar)) > 0) {
            b8Var.f3784c = iA;
        }
        p8 p8VarC4 = p8Var.c("MediaFiles");
        if (p8VarC4 != null && (listA2 = a(p8VarC4, kVar)) != null && listA2.size() > 0) {
            List list = b8Var.f3782a;
            if (list != null) {
                listA2.addAll(list);
            }
            b8Var.f3782a = listA2;
        }
        p8 p8VarC5 = p8Var.c("VideoClicks");
        if (p8VarC5 != null) {
            if (b8Var.f3785d == null && (p8VarC2 = p8VarC5.c("ClickThrough")) != null) {
                String strD = p8VarC2.d();
                if (StringUtils.isValidString(strD)) {
                    b8Var.f3785d = Uri.parse(strD);
                }
            }
            a8.a(p8VarC5.a("ClickTracking"), b8Var.f3786e, s7Var, kVar);
        }
        p8 p8VarC6 = p8Var.c("Icons");
        if (p8VarC6 != null && (u7VarA = u7.a((p8VarC = p8VarC6.c("Icon")), kVar)) != null) {
            p8 p8VarC7 = p8VarC.c("IconClicks");
            if (p8VarC7 != null && (listA = p8VarC7.a("IconClickTracking")) != null) {
                a8.a(listA, u7VarA.f5829a, s7Var, kVar);
            }
            List listA3 = p8VarC.a("IconViewTracking");
            if (listA3 != null) {
                a8.a(listA3, u7VarA.f5830b, s7Var, kVar);
            }
            b8Var.f3787f = u7VarA;
        }
        a8.a(p8Var, b8Var.g, s7Var, kVar);
        return b8Var;
    }

    public Uri c() {
        return this.f3785d;
    }

    public int d() {
        return this.f3784c;
    }

    public Map e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        if (this.f3784c != b8Var.f3784c) {
            return false;
        }
        List list = this.f3782a;
        if (list == null ? b8Var.f3782a != null : !list.equals(b8Var.f3782a)) {
            return false;
        }
        Uri uri = this.f3785d;
        if (uri == null ? b8Var.f3785d != null : !uri.equals(b8Var.f3785d)) {
            return false;
        }
        Set set = this.f3786e;
        if (set == null ? b8Var.f3786e != null : !set.equals(b8Var.f3786e)) {
            return false;
        }
        Map map = this.g;
        Map map2 = b8Var.g;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public u7 f() {
        return this.f3787f;
    }

    public List g() {
        return this.f3782a;
    }

    public int hashCode() {
        List list = this.f3782a;
        int iHashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f3784c) * 31;
        Uri uri = this.f3785d;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set set = this.f3786e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.g;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f3782a + ", durationSeconds=" + this.f3784c + ", destinationUri=" + this.f3785d + ", clickTrackers=" + this.f3786e + ", eventTrackers=" + this.g + ", industryIcon=" + this.f3787f + '}';
    }

    public Set b() {
        return this.f3786e;
    }

    private b8(s7 s7Var) {
        List list = Collections.EMPTY_LIST;
        this.f3782a = list;
        this.f3783b = list;
        this.f3786e = new HashSet();
        this.g = new HashMap();
        this.f3783b = s7Var.f();
    }

    private static int a(String str, com.applovin.impl.sdk.k kVar) {
        try {
            if (CollectionUtils.explode(str, ":").size() == 3) {
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

    private static List a(p8 p8Var, com.applovin.impl.sdk.k kVar) {
        List listA = p8Var.a("MediaFile");
        ArrayList arrayList = new ArrayList(listA.size());
        List<String> listExplode = CollectionUtils.explode((String) kVar.a(x4.S4));
        List<String> listExplode2 = CollectionUtils.explode((String) kVar.a(x4.R4));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            c8 c8VarA = c8.a((p8) it.next(), kVar);
            if (c8VarA != null) {
                try {
                    String strC = c8VarA.c();
                    if (StringUtils.isValidString(strC) && !listExplode.contains(strC)) {
                        arrayList.add(c8VarA);
                    } else {
                        if (((Boolean) kVar.a(x4.T4)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(c8VarA.e().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !listExplode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(c8VarA);
                            }
                        }
                        kVar.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            kVar.O().k("VastVideoCreative", "Video file not supported: " + c8VarA);
                        }
                    }
                } catch (Throwable th2) {
                    kVar.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        kVar.O().a("VastVideoCreative", "Failed to validate video file: " + c8VarA, th2);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    public c8 a(long j) {
        List list = this.f3782a;
        c8 c8Var = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        for (String str : this.f3783b) {
            for (c8 c8Var2 : this.f3782a) {
                String strC = c8Var2.c();
                if (StringUtils.isValidString(strC) && str.equalsIgnoreCase(strC)) {
                    arrayList.add(c8Var2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList<c8> arrayList2 = arrayList;
        if (zIsEmpty) {
            arrayList2 = this.f3782a;
        }
        Collections.sort(arrayList2, new b4.b(1));
        for (c8 c8Var3 : arrayList2) {
            if (c8Var3.b() > j) {
                break;
            }
            c8Var = c8Var3;
        }
        return c8Var != null ? c8Var : (c8) arrayList2.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(c8 c8Var, c8 c8Var2) {
        return Long.compare(c8Var.b(), c8Var2.b());
    }

    public static b8 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        b8 b8Var = new b8();
        JSONArray jSONArrayS = a0.g.s("video_files", jSONObject);
        b8Var.f3782a = new ArrayList();
        for (int i4 = 0; i4 < jSONArrayS.length(); i4++) {
            c8 c8VarA = c8.a(JsonUtils.getJSONObject(jSONArrayS, i4, (JSONObject) null), kVar);
            if (c8VarA != null) {
                b8Var.f3782a.add(c8VarA);
            }
        }
        b8Var.f3783b = JsonUtils.getStringList(jSONObject, "preferred_video_file_types", Collections.EMPTY_LIST);
        b8Var.f3784c = JsonUtils.getInt(jSONObject, "duration_seconds", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        b8Var.f3785d = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        JSONArray jSONArrayS2 = a0.g.s("click_trackers", jSONObject);
        for (int i10 = 0; i10 < jSONArrayS2.length(); i10++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArrayS2, i10, (JSONObject) null), kVar);
            if (y7VarA != null) {
                b8Var.f3786e.add(y7VarA);
            }
        }
        b8Var.f3787f = u7.a(JsonUtils.getJSONObject(jSONObject, "industry_icon", (JSONObject) null), kVar);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "event_trackers", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            HashSet hashSet = new HashSet();
            String next = itKeys.next();
            JSONArray jSONArrayS3 = a0.g.s(next, jSONObject2);
            for (int i11 = 0; i11 < jSONArrayS3.length(); i11++) {
                y7 y7VarA2 = y7.a(JsonUtils.getJSONObject(jSONArrayS3, i11, (JSONObject) null), kVar);
                if (y7VarA2 != null) {
                    hashSet.add(y7VarA2);
                }
            }
            b8Var.g.put(next, hashSet);
        }
        return b8Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List list = this.f3782a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((c8) it.next()).a());
            }
        }
        JsonUtils.putJsonArray(jSONObject, "video_files", jSONArray);
        JsonUtils.putJsonArray(jSONObject, "preferred_video_file_types", new JSONArray((Collection) this.f3783b));
        JsonUtils.putInt(jSONObject, "duration_seconds", this.f3784c);
        Uri uri = this.f3785d;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f3786e.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((y7) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray2);
        u7 u7Var = this.f3787f;
        if (u7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "industry_icon", u7Var.a());
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.g.keySet()) {
            Set set = (Set) this.g.get(str);
            if (set != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((y7) it3.next()).a());
                }
                JsonUtils.putJsonArray(jSONObject2, str, jSONArray3);
            }
        }
        JsonUtils.putJSONObject(jSONObject, "event_trackers", jSONObject2);
        return jSONObject;
    }
}
