package com.bytedance.sdk.openadsdk.core.sup.ypw;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.utils.sb;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sup.ypw.emc;
import com.bytedance.sdk.openadsdk.core.sup.ypw.ypw;
import com.bytedance.sdk.openadsdk.utils.tp;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq {
    private static final Map<String, ypw> emc = new ConcurrentHashMap();
    private static final AtomicBoolean ypw = new AtomicBoolean(false);
    private EnumC0074xq bw;
    private final boolean dg;
    private final String xq;
    private boolean ycc;

    public static class emc {
        private final String emc;
        private EnumC0074xq ypw = EnumC0074xq.TRACKING_URL;
        private boolean xq = false;

        public emc(String str) {
            this.emc = str;
        }

        public emc emc(boolean z6) {
            this.xq = z6;
            return this;
        }

        public xq emc() {
            return new xq(this.emc, this.ypw, Boolean.valueOf(this.xq));
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.sup.ypw.xq$xq, reason: collision with other inner class name */
    public enum EnumC0074xq {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    public static class ypw {
        final rie emc;
        float xq;
        String ypw;

        public ypw(String str, rie rieVar) {
            this(str, rieVar, -1.0f);
        }

        public String toString() {
            return super.toString();
        }

        public ypw(String str, rie rieVar, float f2) {
            this.ypw = str;
            this.emc = rieVar;
            this.xq = f2;
        }
    }

    static {
        sb.emc(new sb.emc() { // from class: com.bytedance.sdk.openadsdk.core.sup.ypw.xq.1
            @Override // com.bytedance.sdk.component.utils.sb.emc
            public void emc(Context context, Intent intent, boolean z6, int i) {
                if (i == 0 || xq.emc.size() <= 0) {
                    return;
                }
                xq.ypw();
            }
        }, aa.emc());
    }

    public xq(String str, EnumC0074xq enumC0074xq, Boolean bool) {
        this.xq = str;
        this.bw = enumC0074xq;
        this.dg = bool.booleanValue();
    }

    public static List<com.bytedance.sdk.openadsdk.core.sup.ypw.emc> xq(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new emc.C0073emc(jSONObjectOptJSONObject.optString("content"), jSONObjectOptJSONObject.optLong("trackingMilliseconds", 0L)).emc());
                }
            }
        }
        return arrayList;
    }

    public static void ypw(rie rieVar, List<xq> list, com.bytedance.sdk.openadsdk.core.sup.emc.emc emcVar, long j6, String str, String str2) {
        emc(rieVar, list, emcVar, j6, str, null, str2);
    }

    public boolean bw() {
        return this.ycc;
    }

    public boolean dg() {
        return this.dg;
    }

    public void l_() {
        this.ycc = true;
    }

    public static List<String> emc(rie rieVar, List<xq> list, com.bytedance.sdk.openadsdk.core.sup.emc.emc emcVar, long j6, String str, String str2) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (xq xqVar : list) {
            if (xqVar != null && (!xqVar.bw() || xqVar.dg())) {
                arrayList.add(xqVar.xq());
                xqVar.l_();
            }
        }
        return arrayList.isEmpty() ? arrayList : new com.bytedance.sdk.openadsdk.core.sup.xq.xq(arrayList, rieVar).emc(emcVar).emc(j6).ypw(str).emc(str2).emc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ypw() {
        if (ypw.compareAndSet(false, true)) {
            Map<String, ypw> map = emc;
            HashSet hashSet = new HashSet(map.entrySet());
            map.clear();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry != null) {
                    emc((String) entry.getKey(), (ypw) entry.getValue(), true);
                }
            }
            ypw.set(false);
        }
    }

    public String xq() {
        return this.xq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ypw(final boolean z6, final String str, final String str2, final ypw ypwVar, final String str3, final boolean z7) {
        rie rieVar;
        if (ypwVar == null || (rieVar = ypwVar.emc) == null) {
            return;
        }
        final boolean zAk = rieVar.ak();
        final String str4 = zAk ? "dsp_track_link_result" : "track_link_result";
        com.bytedance.sdk.openadsdk.dg.xq.emc(new msw(str4) { // from class: com.bytedance.sdk.openadsdk.core.sup.ypw.xq.3
            @Override // java.lang.Runnable
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", ypwVar.ypw);
                    jSONObject.put("success", z6);
                    jSONObject.put("url", str3);
                    if (zAk) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("description", str);
                        }
                        if (ypwVar.xq >= 0.0f) {
                            jSONObject.put("progress", Math.round(r1 * 100.0f) / 100.0d);
                        }
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), ypwVar.emc, str2, str4, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.core.sup.ypw.xq.3.1
                    @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                    public JSONObject emc() {
                        if (!z7) {
                            return null;
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("retry", true);
                            return jSONObject2;
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                    public JSONObject xq() {
                        return jSONObject;
                    }
                });
            }
        });
    }

    public static List<com.bytedance.sdk.openadsdk.core.sup.ypw.ypw> ypw(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new ypw.emc(jSONObjectOptJSONObject.optString("content"), (float) jSONObjectOptJSONObject.optDouble("trackingFraction", 0.0d)).emc());
                }
            }
        }
        return arrayList;
    }

    public static boolean emc(rie rieVar, List<xq> list, com.bytedance.sdk.openadsdk.core.sup.emc.emc emcVar, long j6, String str, ypw ypwVar, String str2) {
        List<String> listEmc = emc(rieVar, list, emcVar, j6, str, str2);
        emc(listEmc, ypwVar);
        return !listEmc.isEmpty();
    }

    public static void emc(List<String> list, ypw ypwVar) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                emc(str, ypwVar, false);
            }
        }
    }

    private static void emc(final String str, final ypw ypwVar, final boolean z6) {
        com.bytedance.sdk.component.uym.ypw.ypw ypwVarXq = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().xq();
        if (ypwVarXq == null) {
            return;
        }
        ypwVarXq.emc(true);
        ypwVarXq.ypw(str);
        ypwVarXq.emc(new com.bytedance.sdk.component.uym.emc.emc() { // from class: com.bytedance.sdk.openadsdk.core.sup.ypw.xq.2
            @Override // com.bytedance.sdk.component.uym.emc.emc
            public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, com.bytedance.sdk.component.uym.ypw ypwVar2) {
                String str2;
                boolean z7;
                ypw ypwVar3 = ypwVar;
                if (ypwVar3 == null || ypwVar3.emc == null) {
                    return;
                }
                String str3 = null;
                if (ypwVar2 == null || !ypwVar2.ycc()) {
                    if (ypwVar2 != null) {
                        str3 = ypwVar2.emc() + ":" + ypwVar2.ypw();
                        if (!z6 && (ypwVar2.emc() <= 300 || ypwVar2.emc() >= 400)) {
                            xq.emc.put(str, ypwVar);
                        }
                    }
                    str2 = str3;
                    z7 = false;
                } else {
                    str2 = null;
                    z7 = true;
                }
                xq.ypw(z7, str2, tp.xq(ypwVar.emc.mfx()), ypwVar, str, z6);
                if (!z7 || xq.emc.isEmpty()) {
                    return;
                }
                xq.ypw();
            }

            @Override // com.bytedance.sdk.component.uym.emc.emc
            public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, IOException iOException) {
                rie rieVar;
                ypw ypwVar2 = ypwVar;
                if (ypwVar2 != null && (rieVar = ypwVar2.emc) != null) {
                    xq.ypw(false, iOException != null ? iOException.getMessage() : null, tp.xq(rieVar.mfx()), ypwVar, str, z6);
                }
                if (z6 || ypwVar == null) {
                    return;
                }
                xq.emc.put(str, ypwVar);
            }
        });
    }

    public static JSONArray emc(List<xq> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jSONArray.put(list.get(i).xq());
        }
        return jSONArray;
    }

    public static List<xq> emc(JSONArray jSONArray) {
        return emc(jSONArray, false);
    }

    public static List<xq> emc(JSONArray jSONArray, boolean z6) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(new emc(strOptString).emc(z6).emc());
                }
            }
        }
        return arrayList;
    }
}
