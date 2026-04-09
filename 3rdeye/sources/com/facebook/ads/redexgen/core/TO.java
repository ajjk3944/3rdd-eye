package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public abstract class TO {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-74, -72, -85, -84, -59, -71, -86, -79, -59, -87, -89, -87, -82, -85, -35, -33, -46, -45, -20, -32, -47, -40, -20, -38, -50, -37, -50, -44, -46, -47, -20, -48, -50, -48, -43, -46, -54, -56, -54, -49, -52, -28, -31, -12, -27, -33, -13, -27, -12, 33, 52, 44, 37, 46, 33, 47, 27, 37, 42, -40, -61, -50, -41, -57};
    }

    public static String A01(C3246cu c3246cu) {
        return AbstractC2944Ve.A00(c3246cu).getString(A00(0, 14, 37), null);
    }

    public static Map<String, String> A02(C3246cu c3246cu) throws JSONException {
        String sdkCache = AbstractC2944Ve.A00(c3246cu).getString(A00(14, 22, 76), null);
        if (sdkCache == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(sdkCache);
            HashSet hashSet = new HashSet();
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2.getLong(A00(41, 8, 63)) + (jSONObject2.getInt(A00(49, 10, 123)) * 1000) < System.currentTimeMillis()) {
                    hashSet.add(next);
                } else {
                    map.put(next, jSONObject2.getString(A00(59, 5, 33)));
                }
            }
            if (!hashSet.isEmpty()) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    jSONObject.remove((String) it.next());
                }
                A06(c3246cu, jSONObject);
            }
            return map;
        } catch (JSONException e4) {
            c3246cu.A08().AAy(A00(36, 5, 38), AbstractC2885Sv.A2U, new C2886Sw(e4));
            return null;
        }
    }

    public static void A04(C3246cu c3246cu, String str) {
        AbstractC2944Ve.A00(c3246cu).edit().putString(A00(0, 14, 37), str).apply();
    }

    public static void A05(C3246cu c3246cu, String str) throws JSONException {
        if (str == null) {
            return;
        }
        String sdkCache = AbstractC2944Ve.A00(c3246cu).getString(A00(14, 22, 76), null);
        try {
            JSONObject jSONObject = sdkCache == null ? new JSONObject() : new JSONObject(sdkCache);
            JSONObject jSONObject2 = new JSONObject(str);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(key);
                jSONObject3.put(A00(41, 8, 63), System.currentTimeMillis());
                jSONObject.put(key, jSONObject3);
            }
            A06(c3246cu, jSONObject);
        } catch (JSONException e4) {
            c3246cu.A08().AAy(A00(36, 5, 38), AbstractC2885Sv.A2V, new C2886Sw(e4));
        }
    }

    public static void A06(C3246cu c3246cu, JSONObject jSONObject) {
        AbstractC2944Ve.A00(c3246cu).edit().putString(A00(14, 22, 76), jSONObject.toString()).apply();
    }
}
