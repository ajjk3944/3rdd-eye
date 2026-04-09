package com.bytedance.sdk.openadsdk.zin.vt;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {

    /* renamed from: lh, reason: collision with root package name */
    public List<C0125ouw> f8902lh;
    public String ouw;
    public List<C0125ouw> vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.zin.vt.ouw$ouw, reason: collision with other inner class name */
    public static class C0125ouw {

        /* renamed from: lh, reason: collision with root package name */
        int f8903lh;
        public String ouw;
        String vt;

        public final boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0125ouw)) {
                return super.equals(obj);
            }
            String str2 = this.ouw;
            if (str2 != null) {
                C0125ouw c0125ouw = (C0125ouw) obj;
                if (str2.equals(c0125ouw.ouw) && (str = this.vt) != null && str.equals(c0125ouw.vt)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static ouw ouw(String str) {
        C0125ouw c0125ouw;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ouw ouwVar = new ouw();
            ouwVar.ouw = jSONObject.optString("version");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i4);
                    if (jSONObjectOptJSONObject == null) {
                        c0125ouw = null;
                    } else {
                        c0125ouw = new C0125ouw();
                        c0125ouw.ouw = jSONObjectOptJSONObject.optString("url");
                        c0125ouw.vt = jSONObjectOptJSONObject.optString("md5");
                        c0125ouw.f8903lh = jSONObjectOptJSONObject.optInt("type");
                    }
                    if (c0125ouw != null) {
                        int i10 = c0125ouw.f8903lh;
                        if (i10 == 1) {
                            arrayList.add(c0125ouw);
                        } else if (i10 == 2 && arrayList2.size() < 10) {
                            arrayList2.add(c0125ouw);
                        }
                    }
                }
            }
            ouwVar.vt = arrayList;
            ouwVar.f8902lh = arrayList2;
            return ouwVar;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
