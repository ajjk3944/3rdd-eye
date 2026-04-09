package L5;

import G5.i;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.Log;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static WindowManager f4064a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f4065b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    public static float f4066c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: L5.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0070a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4067a;

        static {
            int[] iArr = new int[i.values().length];
            f4067a = iArr;
            try {
                iArr[i.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static JSONObject a(int i, int i10, int i11, int i12) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / f4066c);
            jSONObject.put("y", i10 / f4066c);
            jSONObject.put("width", i11 / f4066c);
            jSONObject.put("height", i12 / f4066c);
            return jSONObject;
        } catch (JSONException e4) {
            Log.e("OMIDLIB", "Error with creating viewStateObject", e4);
            return jSONObject;
        }
    }

    public static void b(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e4) {
            Log.e("OMIDLIB", "JSONException during JSONObject.put for name [" + str + "]", e4);
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
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    public static void d(JSONObject jSONObject) throws JSONException {
        float f10;
        float f11;
        if (f4064a != null) {
            Point point = new Point(0, 0);
            f4064a.getDefaultDisplay().getRealSize(point);
            float f12 = point.x;
            float f13 = f4066c;
            f10 = f12 / f13;
            f11 = point.y / f13;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        try {
            jSONObject.put("width", f10);
            jSONObject.put("height", f11);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e5 A[EDGE_INSN: B:63:0x00e5->B:65:0x00ea BREAK  A[LOOP:1: B:59:0x00d1->B:64:0x00e7]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(org.json.JSONObject r8, org.json.JSONObject r9) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L5.a.e(org.json.JSONObject, org.json.JSONObject):boolean");
    }
}
