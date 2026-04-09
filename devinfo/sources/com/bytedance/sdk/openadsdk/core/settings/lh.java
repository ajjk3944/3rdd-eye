package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.pd;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    private static final ConcurrentHashMap<String, vt> ouw = new ConcurrentHashMap<>();

    private static File lh() {
        return new File(zih.ouw().getFilesDir(), "tt_ads_conf_sr");
    }

    public static void ouw() {
        String strOuw;
        File fileLh = lh();
        try {
            if (fileLh.exists()) {
                HashMap<String, vt> mapVt = vt(new JSONArray(new String(com.bytedance.sdk.component.utils.ra.yu(fileLh))));
                if (mapVt.isEmpty()) {
                    return;
                }
                for (Map.Entry<String, vt> entry : mapVt.entrySet()) {
                    ouw.put(entry.getKey(), entry.getValue());
                }
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                strOuw = com.bytedance.sdk.openadsdk.multipro.yu.ouw.vt("tt_sdk_settings", "ad_slot_conf", null);
            } else {
                zih.ouw();
                strOuw = pd.ouw("tt_sdk_settings").ouw("ad_slot_conf", null);
            }
            if (TextUtils.isEmpty(strOuw)) {
                return;
            }
            HashMap<String, vt> mapVt2 = vt(new JSONArray(strOuw));
            if (mapVt2.isEmpty()) {
                return;
            }
            ConcurrentHashMap<String, vt> concurrentHashMap = ouw;
            concurrentHashMap.clear();
            concurrentHashMap.putAll(mapVt2);
        } catch (Exception unused) {
        }
    }

    private static HashMap<String, vt> vt(JSONArray jSONArray) throws JSONException {
        HashMap<String, vt> map = new HashMap<>();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i4);
                vt vtVar = jSONObject == null ? null : new vt(jSONObject);
                if (vtVar != null) {
                    map.put(vtVar.ouw, vtVar);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    public static void vt() {
        File fileLh = lh();
        if (fileLh.exists()) {
            fileLh.delete();
        }
    }

    public static vt ouw(String str) {
        vt vtVar = ouw.get(str);
        return vtVar == null ? new vt(str) : vtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ouw(org.json.JSONArray r5) {
        /*
            if (r5 != 0) goto L4
            goto Lb2
        L4:
            java.io.File r0 = lh()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r0.getParent()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r0.getName()
            r3.append(r4)
            java.lang.String r4 = ".tmp"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            r2 = 0
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            if (r3 == 0) goto L36
            r1.delete()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            goto L36
        L31:
            r5 = move-exception
            goto Lb3
        L34:
            r0 = move-exception
            goto L6f
        L36:
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            r3.write(r2)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            r1.renameTo(r0)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            java.lang.String r0 = "tt_sdk_settings"
            com.bytedance.sdk.openadsdk.core.zih.ouw()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            com.bytedance.sdk.openadsdk.utils.pd r0 = com.bytedance.sdk.openadsdk.utils.pd.ouw(r0)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            java.lang.String r2 = "ad_slot_conf"
            android.content.SharedPreferences r0 = r0.ouw     // Catch: java.lang.Throwable -> L5d
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L5d
            android.content.SharedPreferences$Editor r0 = r0.remove(r2)     // Catch: java.lang.Throwable -> L5d
            r0.apply()     // Catch: java.lang.Throwable -> L5d
        L5d:
            boolean r0 = r1.exists()
            if (r0 == 0) goto L66
            r1.delete()
        L66:
            com.bytedance.sdk.openadsdk.utils.mwh.ouw(r3)
            goto L82
        L6a:
            r5 = move-exception
            r2 = r3
            goto Lb3
        L6d:
            r0 = move-exception
            r2 = r3
        L6f:
            java.lang.String r3 = "SdkSettings.AdSlot"
            java.lang.String r4 = "saveAdSlotToLocal: "
            android.util.Log.e(r3, r4, r0)     // Catch: java.lang.Throwable -> L31
            boolean r0 = r1.exists()
            if (r0 == 0) goto L7f
            r1.delete()
        L7f:
            com.bytedance.sdk.openadsdk.utils.mwh.ouw(r2)
        L82:
            java.util.HashMap r5 = vt(r5)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto Lb2
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L94:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lb2
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            com.bytedance.sdk.openadsdk.core.settings.vt r0 = (com.bytedance.sdk.openadsdk.core.settings.vt) r0
            j$.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.vt> r2 = com.bytedance.sdk.openadsdk.core.settings.lh.ouw
            r2.put(r1, r0)
            goto L94
        Lb2:
            return
        Lb3:
            boolean r0 = r1.exists()
            if (r0 == 0) goto Lbc
            r1.delete()
        Lbc:
            com.bytedance.sdk.openadsdk.utils.mwh.ouw(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.lh.ouw(org.json.JSONArray):void");
    }
}
