package com.bytedance.adsdk.ugeno.emc;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.adsdk.ugeno.emc.xq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg {
    public static int emc(int i) {
        if (i < 0) {
            return -1;
        }
        return i == 0 ? LinearLayoutManager.INVALID_OFFSET : i - 1;
    }

    public static float[] xq(String str) {
        float[] fArr = {0.0f, 0.0f};
        JSONArray jSONArrayEmc = com.bytedance.adsdk.ugeno.uym.ypw.emc(str, (JSONArray) null);
        if (jSONArrayEmc != null && jSONArrayEmc.length() == 2) {
            fArr[0] = (float) jSONArrayEmc.optDouble(0);
            fArr[1] = (float) jSONArrayEmc.optDouble(1);
        }
        return fArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.animation.Interpolator ypw(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 2
            r2 = 1
            switch(r0) {
                case -1965072618: goto L28;
                case -1102672091: goto L1e;
                case -787702915: goto L14;
                case 1065009829: goto La;
                default: goto L9;
            }
        L9:
            goto L32
        La:
            java.lang.String r0 = "ease_in_out"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            r3 = r2
            goto L33
        L14:
            java.lang.String r0 = "ease_out"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            r3 = r1
            goto L33
        L1e:
            java.lang.String r0 = "linear"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            r3 = 3
            goto L33
        L28:
            java.lang.String r0 = "ease_in"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            r3 = 0
            goto L33
        L32:
            r3 = -1
        L33:
            if (r3 == 0) goto L4b
            if (r3 == r2) goto L45
            if (r3 == r1) goto L3f
            android.view.animation.LinearInterpolator r3 = new android.view.animation.LinearInterpolator
            r3.<init>()
            return r3
        L3f:
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r3.<init>()
            return r3
        L45:
            android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
            r3.<init>()
            return r3
        L4b:
            android.view.animation.AccelerateInterpolator r3 = new android.view.animation.AccelerateInterpolator
            r3.<init>()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.emc.dg.ypw(java.lang.String):android.view.animation.Interpolator");
    }

    public static List<xq> emc(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(emc(jSONObjectOptJSONObject, jSONObject));
                }
            }
            return arrayList;
        } catch (JSONException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static xq.emc ypw(String str, JSONObject jSONObject) {
        JSONArray jSONArrayEmc;
        if (TextUtils.isEmpty(str) || (jSONArrayEmc = com.bytedance.adsdk.ugeno.uym.ypw.emc(str, (JSONArray) null)) == null || jSONArrayEmc.length() != 2) {
            return null;
        }
        xq.emc emcVar = new xq.emc();
        emcVar.emc = com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONArrayEmc.optString(0), jSONObject);
        emcVar.ypw = com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONArrayEmc.optString(1), jSONObject);
        return emcVar;
    }

    public static xq emc(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        xq xqVar = new xq();
        xqVar.ypw(com.bytedance.adsdk.ugeno.uym.xq.emc(com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObject.optString("delay"), jSONObject2), 0L));
        xqVar.xq(com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObject.optString("name"), jSONObject2));
        xqVar.ypw(com.bytedance.adsdk.ugeno.uym.xq.emc(com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObject.optString("playState"), jSONObject2), 1));
        xqVar.emc(Math.max(com.bytedance.adsdk.ugeno.uym.xq.emc(com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObject.optString("duration"), jSONObject2), 0L), 0L));
        xqVar.emc(com.bytedance.adsdk.ugeno.uym.xq.emc(com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObject.optString("playCount"), jSONObject2), 1));
        xqVar.emc(com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObject.optString("playDirection"), jSONObject2));
        xqVar.emc(ypw(jSONObject.optString("transformOrigin"), jSONObject2));
        xqVar.ypw(com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObject.optString("timingFunction", "linear"), jSONObject2));
        xqVar.emc(jSONObject.optJSONObject("effect"));
        xqVar.emc(emc(jSONObject.optJSONArray("keyframes"), jSONObject2));
        return xqVar;
    }

    public static Map<String, TreeMap<Float, String>> emc(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("offset");
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    TreeMap treeMap = (TreeMap) map.get(next);
                    if (!TextUtils.equals(next, "offset")) {
                        if (map.containsKey(next) && treeMap != null) {
                            treeMap.put(Float.valueOf(fOptDouble), com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObjectOptJSONObject.optString(next), jSONObject));
                        } else {
                            TreeMap treeMap2 = new TreeMap();
                            treeMap2.put(Float.valueOf(fOptDouble), com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObjectOptJSONObject.optString(next), jSONObject));
                            map.put(next, treeMap2);
                        }
                    }
                }
            }
        }
        return map;
    }

    public static int emc(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1408024454) {
            return str.equals("alternate") ? 2 : 1;
        }
        if (iHashCode != -1039745817) {
            return 1;
        }
        str.equals("normal");
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int emc(String str, int i) {
        int i3 = i / 2;
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "bottom":
                case "right":
                    return i;
                case "center":
                    break;
                case "top":
                case "left":
                    return 0;
                default:
                    if (str.endsWith("%")) {
                        try {
                            return (int) ((i * Float.parseFloat(str.substring(0, str.length() - 1))) / 100.0f);
                        } catch (NumberFormatException unused) {
                            break;
                        }
                    } else {
                        try {
                            return Integer.parseInt(str);
                        } catch (NumberFormatException unused2) {
                            return i3;
                        }
                    }
            }
        }
        return i3;
    }
}
