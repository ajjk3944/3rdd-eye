package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.Log;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vn2 {

    /* renamed from: a, reason: collision with root package name */
    private static WindowManager f34636a;

    /* renamed from: b, reason: collision with root package name */
    private static String[] f34637b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    static float f34638c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i, int i10, int i11, int i12) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / f34638c);
            jSONObject.put("y", i10 / f34638c);
            jSONObject.put("width", i11 / f34638c);
            jSONObject.put("height", i12 / f34638c);
            return jSONObject;
        } catch (JSONException e4) {
            Log.e("OMIDLIB", "Error with creating viewStateObject", e4);
            return jSONObject;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(org.json.JSONObject r9, org.json.JSONObject r10) {
        /*
            r0 = 1
            if (r9 != 0) goto L6
            if (r10 != 0) goto L6
            return r0
        L6:
            r1 = 0
            if (r9 == 0) goto Lc6
            if (r10 != 0) goto Ld
            goto Lc6
        Ld:
            java.lang.String[] r2 = com.yandex.mobile.ads.impl.vn2.f34637b
            r3 = r1
        L10:
            r4 = 4
            if (r3 >= r4) goto L26
            r4 = r2[r3]
            double r5 = r9.optDouble(r4)
            double r7 = r10.optDouble(r4)
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 == 0) goto L23
            goto Lc6
        L23:
            int r3 = r3 + 1
            goto L10
        L26:
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r9.optString(r2, r3)
            java.lang.String r2 = r10.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lc6
            java.lang.String r2 = "hasWindowFocus"
            boolean r4 = r9.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r10.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            if (r4 != r2) goto Lc6
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r9.optJSONArray(r2)
            org.json.JSONArray r2 = r10.optJSONArray(r2)
            if (r4 != 0) goto L5b
            if (r2 != 0) goto L5b
            goto L89
        L5b:
            if (r4 != 0) goto L60
            if (r2 != 0) goto L60
            goto L70
        L60:
            if (r4 == 0) goto Lc6
            if (r2 != 0) goto L66
            goto Lc6
        L66:
            int r5 = r4.length()
            int r6 = r2.length()
            if (r5 != r6) goto Lc6
        L70:
            r5 = r1
        L71:
            int r6 = r4.length()
            if (r5 >= r6) goto L89
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L86
            goto Lc6
        L86:
            int r5 = r5 + 1
            goto L71
        L89:
            java.lang.String r2 = "childViews"
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            if (r9 != 0) goto L98
            if (r10 != 0) goto L98
            goto Lc5
        L98:
            if (r9 != 0) goto L9d
            if (r10 != 0) goto L9d
            goto Lac
        L9d:
            if (r9 == 0) goto Lc6
            if (r10 != 0) goto La2
            goto Lc6
        La2:
            int r2 = r9.length()
            int r3 = r10.length()
            if (r2 != r3) goto Lc6
        Lac:
            r2 = r1
        Lad:
            int r3 = r9.length()
            if (r2 >= r3) goto Lc5
            org.json.JSONObject r3 = r9.optJSONObject(r2)
            org.json.JSONObject r4 = r10.optJSONObject(r2)
            boolean r3 = b(r3, r4)
            if (r3 != 0) goto Lc2
            goto Lc6
        Lc2:
            int r2 = r2 + 1
            goto Lad
        Lc5:
            return r0
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.vn2.b(org.json.JSONObject, org.json.JSONObject):boolean");
    }

    public static void a(Context context) {
        if (context != null) {
            f34638c = context.getResources().getDisplayMetrics().density;
            f34636a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject) throws JSONException {
        float f10;
        float f11;
        if (f34636a != null) {
            Point point = new Point(0, 0);
            f34636a.getDefaultDisplay().getRealSize(point);
            float f12 = point.x;
            float f13 = f34638c;
            f10 = f12 / f13;
            f11 = point.y / f13;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        try {
            jSONObject.put("width", f10);
            jSONObject.put("height", f11);
        } catch (JSONException unused) {
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e4) {
            Log.e("OMIDLIB", "JSONException during JSONObject.put for name [" + str + "]", e4);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
