package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1718pw {

    /* renamed from: a, reason: collision with root package name */
    public static WindowManager f16256a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f16257b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    public static float f16258c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i, int i3, int i6, int i7) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / f16258c);
            jSONObject.put("y", i3 / f16258c);
            jSONObject.put("width", i6 / f16258c);
            jSONObject.put("height", i7 / f16258c);
            return jSONObject;
        } catch (JSONException e6) {
            AbstractC1984ut.l("Error with creating viewStateObject", e6);
            return jSONObject;
        }
    }

    public static void b(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e6) {
            StringBuilder sb = new StringBuilder(str.length() + 47);
            sb.append("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
            AbstractC1984ut.l(sb.toString(), e6);
        }
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    public static void d(JSONObject jSONObject) throws JSONException {
        float f2;
        float f5;
        if (f16256a != null) {
            Point point = new Point(0, 0);
            f16256a.getDefaultDisplay().getRealSize(point);
            float f6 = point.x;
            float f7 = f16258c;
            f2 = f6 / f7;
            f5 = point.y / f7;
        } else {
            f2 = 0.0f;
            f5 = 0.0f;
        }
        try {
            jSONObject.put("width", f2);
            jSONObject.put("height", f5);
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(org.json.JSONObject r7, org.json.JSONObject r8) {
        /*
            if (r7 != 0) goto L4
            if (r8 == 0) goto Ld9
        L4:
            r0 = 0
            if (r7 == 0) goto Ldb
            if (r8 != 0) goto Lb
            goto Ldb
        Lb:
            r1 = r0
        Lc:
            r2 = 4
            if (r1 >= r2) goto L24
            java.lang.String[] r2 = com.google.android.gms.internal.ads.AbstractC1718pw.f16257b
            r2 = r2[r1]
            double r3 = r7.optDouble(r2)
            double r5 = r8.optDouble(r2)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 == 0) goto L21
            goto Ldb
        L21:
            int r1 = r1 + 1
            goto Lc
        L24:
            java.lang.String r1 = "adSessionId"
            java.lang.String r2 = ""
            java.lang.String r3 = r7.optString(r1, r2)
            java.lang.String r1 = r8.optString(r1, r2)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Ldb
            java.lang.String r1 = "noOutputDevice"
            boolean r3 = r7.optBoolean(r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r1 = r8.optBoolean(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Ldb
            java.lang.String r1 = "hasWindowFocus"
            boolean r3 = r7.optBoolean(r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r1 = r8.optBoolean(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Ldb
            java.lang.String r1 = "isFriendlyObstructionFor"
            org.json.JSONArray r3 = r7.optJSONArray(r1)
            org.json.JSONArray r1 = r8.optJSONArray(r1)
            if (r3 != 0) goto L75
            if (r1 != 0) goto L75
            goto La0
        L75:
            if (r3 != 0) goto L79
            if (r1 == 0) goto L88
        L79:
            if (r3 == 0) goto Ldb
            if (r1 != 0) goto L7e
            goto Ldb
        L7e:
            int r4 = r3.length()
            int r5 = r1.length()
            if (r4 != r5) goto Ldb
        L88:
            r4 = r0
        L89:
            int r5 = r3.length()
            if (r4 >= r5) goto La0
            java.lang.String r5 = r3.optString(r4, r2)
            java.lang.String r6 = r1.optString(r4, r2)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Ldb
            int r4 = r4 + 1
            goto L89
        La0:
            java.lang.String r1 = "childViews"
            org.json.JSONArray r7 = r7.optJSONArray(r1)
            org.json.JSONArray r8 = r8.optJSONArray(r1)
            if (r7 != 0) goto Lae
            if (r8 == 0) goto Ld9
        Lae:
            if (r7 != 0) goto Lb2
            if (r8 == 0) goto Lc1
        Lb2:
            if (r7 == 0) goto Ldb
            if (r8 != 0) goto Lb7
            goto Ldb
        Lb7:
            int r1 = r7.length()
            int r2 = r8.length()
            if (r1 != r2) goto Ldb
        Lc1:
            r1 = r0
        Lc2:
            int r2 = r7.length()
            if (r1 >= r2) goto Ld9
            org.json.JSONObject r2 = r7.optJSONObject(r1)
            org.json.JSONObject r3 = r8.optJSONObject(r1)
            boolean r2 = e(r2, r3)
            if (r2 == 0) goto Ldb
            int r1 = r1 + 1
            goto Lc2
        Ld9:
            r7 = 1
            return r7
        Ldb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1718pw.e(org.json.JSONObject, org.json.JSONObject):boolean");
    }
}
