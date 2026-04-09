package com.applovin.impl;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
public class b8 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private List f5611a;

    /* renamed from: b, reason: collision with root package name */
    private List f5612b;

    /* renamed from: c, reason: collision with root package name */
    private int f5613c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f5614d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f5615e;

    /* renamed from: f, reason: collision with root package name */
    private u7 f5616f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f5617g;

    private b8() {
        List list = Collections.EMPTY_LIST;
        this.f5611a = list;
        this.f5612b = list;
        this.f5615e = new HashSet();
        this.f5617g = new HashMap();
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
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastVideoCreative", "Error occurred while initializing", th);
                }
                kVar.D().a("VastVideoCreative", th);
                return null;
            }
        }
        if (b8Var.f5613c == 0 && (p8VarC3 = p8Var.c("Duration")) != null && (iA = a(p8VarC3.d(), kVar)) > 0) {
            b8Var.f5613c = iA;
        }
        p8 p8VarC4 = p8Var.c("MediaFiles");
        if (p8VarC4 != null && (listA2 = a(p8VarC4, kVar)) != null && listA2.size() > 0) {
            List list = b8Var.f5611a;
            if (list != null) {
                listA2.addAll(list);
            }
            b8Var.f5611a = listA2;
        }
        p8 p8VarC5 = p8Var.c("VideoClicks");
        if (p8VarC5 != null) {
            if (b8Var.f5614d == null && (p8VarC2 = p8VarC5.c("ClickThrough")) != null) {
                String strD = p8VarC2.d();
                if (StringUtils.isValidString(strD)) {
                    b8Var.f5614d = Uri.parse(strD);
                }
            }
            a8.a(p8VarC5.a("ClickTracking"), b8Var.f5615e, s7Var, kVar);
        }
        p8 p8VarC6 = p8Var.c("Icons");
        if (p8VarC6 != null && (u7VarA = u7.a((p8VarC = p8VarC6.c("Icon")), kVar)) != null) {
            p8 p8VarC7 = p8VarC.c("IconClicks");
            if (p8VarC7 != null && (listA = p8VarC7.a("IconClickTracking")) != null) {
                a8.a(listA, u7VarA.f8222a, s7Var, kVar);
            }
            List listA3 = p8VarC.a("IconViewTracking");
            if (listA3 != null) {
                a8.a(listA3, u7VarA.f8223b, s7Var, kVar);
            }
            b8Var.f5616f = u7VarA;
        }
        a8.a(p8Var, b8Var.f5617g, s7Var, kVar);
        return b8Var;
    }

    public Uri c() {
        return this.f5614d;
    }

    public int d() {
        return this.f5613c;
    }

    public Map e() {
        return this.f5617g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        if (this.f5613c != b8Var.f5613c) {
            return false;
        }
        List list = this.f5611a;
        if (list == null ? b8Var.f5611a != null : !list.equals(b8Var.f5611a)) {
            return false;
        }
        Uri uri = this.f5614d;
        if (uri == null ? b8Var.f5614d != null : !uri.equals(b8Var.f5614d)) {
            return false;
        }
        Set set = this.f5615e;
        if (set == null ? b8Var.f5615e != null : !set.equals(b8Var.f5615e)) {
            return false;
        }
        Map map = this.f5617g;
        Map map2 = b8Var.f5617g;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public u7 f() {
        return this.f5616f;
    }

    public List g() {
        return this.f5611a;
    }

    public int hashCode() {
        List list = this.f5611a;
        int iHashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f5613c) * 31;
        Uri uri = this.f5614d;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set set = this.f5615e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f5617g;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f5611a + ", durationSeconds=" + this.f5613c + ", destinationUri=" + this.f5614d + ", clickTrackers=" + this.f5615e + ", eventTrackers=" + this.f5617g + ", industryIcon=" + this.f5616f + '}';
    }

    public Set b() {
        return this.f5615e;
    }

    private b8(s7 s7Var) {
        List list = Collections.EMPTY_LIST;
        this.f5611a = list;
        this.f5612b = list;
        this.f5615e = new HashSet();
        this.f5617g = new HashMap();
        this.f5612b = s7Var.f();
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
                } catch (Throwable th) {
                    kVar.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        kVar.O().a("VastVideoCreative", "Failed to validate video file: " + c8VarA, th);
                    }
                }
            }
        }
        return arrayList;
    }

    public c8 a(long j10) {
        List list = this.f5611a;
        c8 c8Var = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        List<c8> arrayList = new ArrayList(3);
        for (String str : this.f5612b) {
            for (c8 c8Var2 : this.f5611a) {
                String strC = c8Var2.c();
                if (StringUtils.isValidString(strC) && str.equalsIgnoreCase(strC)) {
                    arrayList.add(c8Var2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.f5611a;
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.applovin.impl.i9
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b8.a((c8) obj, (c8) obj2);
            }
        });
        for (c8 c8Var3 : arrayList) {
            if (c8Var3.b() > j10) {
                break;
            }
            c8Var = c8Var3;
        }
        return c8Var != null ? c8Var : (c8) arrayList.get(0);
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
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "video_files", new JSONArray());
        b8Var.f5611a = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            c8 c8VarA = c8.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), kVar);
            if (c8VarA != null) {
                b8Var.f5611a.add(c8VarA);
            }
        }
        b8Var.f5612b = JsonUtils.getStringList(jSONObject, "preferred_video_file_types", Collections.EMPTY_LIST);
        b8Var.f5613c = JsonUtils.getInt(jSONObject, "duration_seconds", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        b8Var.f5614d = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null), kVar);
            if (y7VarA != null) {
                b8Var.f5615e.add(y7VarA);
            }
        }
        b8Var.f5616f = u7.a(JsonUtils.getJSONObject(jSONObject, "industry_icon", (JSONObject) null), kVar);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "event_trackers", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            HashSet hashSet = new HashSet();
            String next = itKeys.next();
            JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject2, next, new JSONArray());
            for (int i12 = 0; i12 < jSONArray3.length(); i12++) {
                y7 y7VarA2 = y7.a(JsonUtils.getJSONObject(jSONArray3, i12, (JSONObject) null), kVar);
                if (y7VarA2 != null) {
                    hashSet.add(y7VarA2);
                }
            }
            b8Var.f5617g.put(next, hashSet);
        }
        return b8Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List list = this.f5611a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((c8) it.next()).a());
            }
        }
        JsonUtils.putJsonArray(jSONObject, "video_files", jSONArray);
        JsonUtils.putJsonArray(jSONObject, "preferred_video_file_types", new JSONArray((Collection) this.f5612b));
        JsonUtils.putInt(jSONObject, "duration_seconds", this.f5613c);
        Uri uri = this.f5614d;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f5615e.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((y7) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray2);
        u7 u7Var = this.f5616f;
        if (u7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "industry_icon", u7Var.a());
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f5617g.keySet()) {
            Set set = (Set) this.f5617g.get(str);
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
