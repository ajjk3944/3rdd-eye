package com.mbridge.msdk.foundation.db.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.g;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.y0;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f14805a = "FrequencyDaoMiddle";

    /* renamed from: b, reason: collision with root package name */
    private static a f14806b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f14807c = "FrequencyDaoMiddle";

    /* renamed from: d, reason: collision with root package name */
    private static JSONArray f14808d = new JSONArray();

    private a() {
        c();
    }

    public static a b() {
        if (f14806b == null) {
            synchronized (a.class) {
                try {
                    if (f14806b == null) {
                        f14806b = new a();
                    }
                } finally {
                }
            }
        }
        return f14806b;
    }

    private void c() {
        try {
            String str = (String) y0.a(c.n().d(), f14807c, f14808d.toString());
            if (TextUtils.isEmpty(str)) {
                return;
            }
            f14808d = new JSONArray(str);
        } catch (Exception e10) {
            q0.b(f14805a, e10.getMessage());
        }
    }

    private void d() {
        try {
            if (f14808d != null) {
                y0.b(c.n().d(), f14807c, f14808d.toString());
            }
        } catch (Exception e10) {
            q0.b(f14805a, e10.getMessage());
        }
    }

    public void a(g gVar) {
        JSONObject jSONObjectA;
        if (gVar == null || (jSONObjectA = a(gVar.a(), gVar.c(), gVar.d(), gVar.f(), gVar.e(), gVar.b())) == null) {
            return;
        }
        if (f14808d == null) {
            f14808d = new JSONArray();
        }
        f14808d.put(jSONObjectA);
        d();
    }

    public void a(String str) throws JSONException {
        if (f14808d != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < f14808d.length(); i10++) {
                try {
                    JSONObject jSONObject = f14808d.getJSONObject(i10);
                    if (jSONObject != null) {
                        if (jSONObject.optString("id", "").equals(str)) {
                            jSONObject.put("impression_count", jSONObject.optInt("impression_count", 0) + 1);
                            jSONArray.put(jSONObject);
                        } else {
                            jSONArray.put(jSONObject);
                        }
                    }
                } catch (JSONException e10) {
                    q0.b(f14805a, e10.getMessage());
                }
            }
            if (jSONArray.length() > 0) {
                f14808d = jSONArray;
            }
            d();
        }
    }

    public String[] a() {
        ArrayList arrayList = new ArrayList();
        if (f14808d != null) {
            for (int i10 = 0; i10 < f14808d.length(); i10++) {
                try {
                    JSONObject jSONObject = f14808d.getJSONObject(i10);
                    if (jSONObject != null && jSONObject.optInt("fc_a") < jSONObject.optInt("impression_count")) {
                        arrayList.add(jSONObject.optString("id"));
                    }
                } catch (JSONException e10) {
                    q0.b(f14805a, e10.getMessage());
                }
            }
        }
        String[] strArr = new String[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            strArr[i11] = (String) arrayList.get(i11);
        }
        return strArr;
    }

    public void a(long j10) throws JSONException {
        if (f14808d != null) {
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < f14808d.length(); i10++) {
                try {
                    JSONObject jSONObject = f14808d.getJSONObject(i10);
                    if (jSONObject != null && jSONObject.optInt(CampaignEx.JSON_KEY_ST_TS) >= j10) {
                        jSONArray.put(jSONObject);
                    }
                } catch (JSONException e10) {
                    q0.b(f14805a, e10.getMessage());
                }
            }
            if (jSONArray.length() > 0) {
                f14808d = jSONArray;
            }
        }
        d();
    }

    private JSONObject a(String str, int i10, int i11, long j10, int i12, int i13) throws JSONException {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("id", str);
                jSONObject.put("fc_a", i10);
                jSONObject.put("fc_b", i11);
                jSONObject.put(CampaignEx.JSON_KEY_ST_TS, j10);
                jSONObject.put("impression_count", i12);
                jSONObject.put("click_count", i13);
                return jSONObject;
            } catch (Exception e10) {
                e = e10;
                q0.b(f14805a, e.getMessage());
                return jSONObject;
            }
        } catch (Exception e11) {
            e = e11;
            jSONObject = null;
        }
    }
}
