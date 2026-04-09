package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.utils.rtt;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq {
    private static final ConcurrentHashMap<String, ypw> emc = new ConcurrentHashMap<>();

    @WorkerThread
    public static void emc(boolean z10) {
        File fileYpw = ypw();
        try {
            if (fileYpw.exists()) {
                HashMap<String, ypw> mapYpw = ypw(new JSONArray(new String(com.bytedance.sdk.component.utils.uym.dg(fileYpw))));
                if (mapYpw.isEmpty()) {
                    return;
                }
                for (Map.Entry<String, ypw> entry : mapYpw.entrySet()) {
                    emc.put(entry.getKey(), entry.getValue());
                }
                return;
            }
            String strYpw = com.bytedance.sdk.openadsdk.multipro.ypw.xq() ? com.bytedance.sdk.openadsdk.multipro.dg.emc.ypw("tt_sdk_settings", "ad_slot_conf", null) : rtt.emc("tt_sdk_settings", aa.emc()).emc("ad_slot_conf", (String) null);
            if (TextUtils.isEmpty(strYpw)) {
                return;
            }
            HashMap<String, ypw> mapYpw2 = ypw(new JSONArray(strYpw));
            if (mapYpw2.isEmpty()) {
                return;
            }
            ConcurrentHashMap<String, ypw> concurrentHashMap = emc;
            concurrentHashMap.clear();
            concurrentHashMap.putAll(mapYpw2);
        } catch (Exception unused) {
        }
    }

    @NonNull
    private static HashMap<String, ypw> ypw(JSONArray jSONArray) {
        HashMap<String, ypw> map = new HashMap<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                ypw ypwVarEmc = emc(jSONArray.getJSONObject(i10));
                if (ypwVarEmc != null) {
                    map.put(ypwVarEmc.emc, ypwVarEmc);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    @NonNull
    private static File ypw() {
        return new File(aa.emc().getFilesDir(), "tt_ads_conf_sr");
    }

    private static ypw ypw(String str) {
        return new ypw(str, 1);
    }

    private static ypw emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new ypw(jSONObject);
    }

    @NonNull
    public static ypw emc(String str) {
        ypw ypwVar = emc.get(str);
        return ypwVar == null ? ypw(str) : ypwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[ORIG_RETURN, RETURN] */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void emc(org.json.JSONArray r5) throws java.lang.Throwable {
        /*
            if (r5 != 0) goto L4
            goto La9
        L4:
            java.io.File r0 = ypw()
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
            goto Laa
        L34:
            r0 = move-exception
            goto L66
        L36:
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r3.write(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            r1.renameTo(r0)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r0 = "tt_sdk_settings"
            android.content.Context r2 = com.bytedance.sdk.openadsdk.core.aa.emc()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            com.bytedance.sdk.openadsdk.utils.rtt r0 = com.bytedance.sdk.openadsdk.utils.rtt.emc(r0, r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            java.lang.String r2 = "ad_slot_conf"
            r0.emc(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
            boolean r0 = r1.exists()
            if (r0 == 0) goto L5d
            r1.delete()
        L5d:
            com.bytedance.sdk.openadsdk.utils.sz.emc(r3)
            goto L79
        L61:
            r5 = move-exception
            r2 = r3
            goto Laa
        L64:
            r0 = move-exception
            r2 = r3
        L66:
            java.lang.String r3 = "SdkSettings.AdSlot"
            java.lang.String r4 = "saveAdSlotToLocal: "
            android.util.Log.e(r3, r4, r0)     // Catch: java.lang.Throwable -> L31
            boolean r0 = r1.exists()
            if (r0 == 0) goto L76
            r1.delete()
        L76:
            com.bytedance.sdk.openadsdk.utils.sz.emc(r2)
        L79:
            java.util.HashMap r5 = ypw(r5)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto La9
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L8b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto La9
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            com.bytedance.sdk.openadsdk.core.settings.ypw r0 = (com.bytedance.sdk.openadsdk.core.settings.ypw) r0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.ypw> r2 = com.bytedance.sdk.openadsdk.core.settings.xq.emc
            r2.put(r1, r0)
            goto L8b
        La9:
            return
        Laa:
            boolean r0 = r1.exists()
            if (r0 == 0) goto Lb3
            r1.delete()
        Lb3:
            com.bytedance.sdk.openadsdk.utils.sz.emc(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.xq.emc(org.json.JSONArray):void");
    }

    public static void emc() {
        File fileYpw = ypw();
        if (fileYpw.exists()) {
            fileYpw.delete();
        }
    }
}
