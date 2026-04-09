package com.iab.omid.library.applovin.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.iab.omid.library.applovin.adsession.OutputDeviceStatus;
import com.iab.omid.library.applovin.walking.a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static WindowManager f20980a;

    /* renamed from: b, reason: collision with root package name */
    private static String[] f20981b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    static float f20982c = Resources.getSystem().getDisplayMetrics().density;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20983a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f20983a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final float f20984a;

        /* renamed from: b, reason: collision with root package name */
        final float f20985b;

        public b(float f10, float f11) {
            this.f20984a = f10;
            this.f20985b = f11;
        }
    }

    public static float a(int i4) {
        return i4 / f20982c;
    }

    public static void b(JSONObject jSONObject) throws JSONException {
        b bVarA = a(jSONObject);
        try {
            jSONObject.put("width", bVarA.f20984a);
            jSONObject.put("height", bVarA.f20985b);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
            if (!jSONArrayOptJSONArray.optString(i4, "").equals(jSONArrayOptJSONArray2.optString(i4, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f20981b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && f(jSONObject, jSONObject2) && g(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && c(jSONObject, jSONObject2) && b(jSONObject, jSONObject2);
    }

    private static b a(JSONObject jSONObject) {
        float fA;
        float fA2;
        if (f20980a != null) {
            Point point = new Point(0, 0);
            f20980a.getDefaultDisplay().getRealSize(point);
            fA = a(point.x);
            fA2 = a(point.y);
        } else {
            fA = 0.0f;
            fA2 = 0.0f;
        }
        return new b(fA, fA2);
    }

    public static void b(JSONObject jSONObject, Boolean bool) throws JSONException {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e2) {
                d.a("Error with setting is picture-in-picture active", e2);
            }
        }
    }

    public static JSONObject a(int i4, int i10, int i11, int i12) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i4));
            jSONObject.put("y", a(i10));
            jSONObject.put("width", a(i11));
            jSONObject.put("height", a(i12));
            return jSONObject;
        } catch (JSONException e2) {
            d.a("Error with creating viewStateObject", e2);
            return jSONObject;
        }
    }

    public static void b(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e2) {
            d.a("Error with setting not visible reason", e2);
        }
    }

    public static void a(Context context) {
        if (context != null) {
            f20982c = context.getResources().getDisplayMetrics().density;
            f20980a = (WindowManager) context.getSystemService("window");
        }
    }

    private static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
            if (!h(jSONArrayOptJSONArray.optJSONObject(i4), jSONArrayOptJSONArray2.optJSONObject(i4))) {
                return false;
            }
        }
        return true;
    }

    public static void a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) throws JSONException {
        try {
            jSONObject.put("noOutputDevice", a(outputDeviceStatus));
        } catch (JSONException e2) {
            d.a("Error with setting output device status", e2);
        }
    }

    public static void a(JSONObject jSONObject, a.C0128a c0128a) throws JSONException {
        com.iab.omid.library.applovin.internal.e eVarA = c0128a.a();
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> arrayListB = c0128a.b();
        int size = arrayListB.size();
        int i4 = 0;
        while (i4 < size) {
            String str = arrayListB.get(i4);
            i4++;
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", eVarA.d());
            jSONObject.put("friendlyObstructionPurpose", eVarA.b());
            jSONObject.put("friendlyObstructionReason", eVarA.a());
        } catch (JSONException e2) {
            d.a("Error with setting friendly obstruction", e2);
        }
    }

    public static void a(JSONObject jSONObject, Boolean bool) throws JSONException {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e2) {
            d.a("Error with setting has window focus", e2);
        }
    }

    public static void a(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e2) {
            d.a("Error with setting ad session id", e2);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e2) {
            d.a("JSONException during JSONObject.put for name [" + str + "]", e2);
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
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private static boolean a(OutputDeviceStatus outputDeviceStatus) {
        return a.f20983a[outputDeviceStatus.ordinal()] == 1;
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
