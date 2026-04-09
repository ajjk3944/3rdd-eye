package com.bytedance.sdk.openadsdk.core.ryl.vt;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl.vt.ouw;
import com.bytedance.sdk.openadsdk.core.ryl.vt.vt;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.uoy;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class lh {
    private static final Map<String, vt> ouw = new ConcurrentHashMap();
    private static final AtomicBoolean yu = new AtomicBoolean(false);
    private final boolean fkw;

    /* renamed from: le, reason: collision with root package name */
    private EnumC0096lh f8422le;

    /* renamed from: lh, reason: collision with root package name */
    public boolean f8423lh;
    public final String vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ryl.vt.lh$lh, reason: collision with other inner class name */
    public enum EnumC0096lh {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {

        /* renamed from: lh, reason: collision with root package name */
        private EnumC0096lh f8428lh = EnumC0096lh.TRACKING_URL;
        public boolean ouw = false;
        private final String vt;

        public ouw(String str) {
            this.vt = str;
        }

        public final lh ouw() {
            return new lh(this.vt, this.f8428lh, Boolean.valueOf(this.ouw));
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt {

        /* renamed from: lh, reason: collision with root package name */
        float f8429lh;
        final vpp ouw;
        String vt;

        public vt(String str, vpp vppVar) {
            this(str, vppVar, -1.0f);
        }

        public final String toString() {
            return super.toString();
        }

        public vt(String str, vpp vppVar, float f10) {
            this.vt = str;
            this.ouw = vppVar;
            this.f8429lh = f10;
        }
    }

    static {
        ksc.ouw(new ksc.ouw() { // from class: com.bytedance.sdk.openadsdk.core.ryl.vt.lh.1
            @Override // com.bytedance.sdk.component.utils.ksc.ouw
            public final void ouw(boolean z3, int i4) {
                if (i4 == 0 || lh.ouw.size() <= 0) {
                    return;
                }
                lh.lh();
            }
        }, zih.ouw());
    }

    public lh(String str, EnumC0096lh enumC0096lh, Boolean bool) {
        this.vt = str;
        this.f8422le = enumC0096lh;
        this.fkw = bool.booleanValue();
    }

    public static List<com.bytedance.sdk.openadsdk.core.ryl.vt.ouw> lh(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new ouw.C0097ouw(jSONObjectOptJSONObject.optString(AppLovinEventTypes.USER_VIEWED_CONTENT), jSONObjectOptJSONObject.optLong("trackingMilliseconds", 0L)).ouw());
                }
            }
        }
        return arrayList;
    }

    public static List<String> ouw(vpp vppVar, List<lh> list, com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw ouwVar, long j, String str, String str2) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (lh lhVar : list) {
            if (lhVar != null && (!lhVar.f8423lh || lhVar.fkw)) {
                arrayList.add(lhVar.vt);
                lhVar.ouw();
            }
        }
        if (arrayList.isEmpty()) {
            return arrayList;
        }
        com.bytedance.sdk.openadsdk.core.ryl.lh.lh lhVar2 = new com.bytedance.sdk.openadsdk.core.ryl.lh.lh(arrayList, vppVar);
        if (ouwVar != null) {
            lhVar2.ouw.put(com.bytedance.sdk.openadsdk.core.ryl.lh.vt.ERRORCODE, String.valueOf(ouwVar.pno));
        }
        if (j >= 0) {
            String strOuw = com.bytedance.sdk.openadsdk.core.ryl.lh.lh.ouw(j);
            if (!TextUtils.isEmpty(strOuw)) {
                lhVar2.ouw.put(com.bytedance.sdk.openadsdk.core.ryl.lh.vt.CONTENTPLAYHEAD, strOuw);
            }
        }
        com.bytedance.sdk.openadsdk.core.ryl.lh.lh lhVarOuw = lhVar2.ouw(str);
        if (!TextUtils.isEmpty(str2)) {
            lhVarOuw.ouw.put(com.bytedance.sdk.openadsdk.core.ryl.lh.vt.__MRC_IMPRESSION_ID__, str2);
        }
        return lhVarOuw.ouw();
    }

    public static void vt(vpp vppVar, List<lh> list, com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw ouwVar, long j, String str, String str2) {
        ouw(vppVar, list, ouwVar, j, str, null, str2);
    }

    public static List<com.bytedance.sdk.openadsdk.core.ryl.vt.vt> vt(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new vt.ouw(jSONObjectOptJSONObject.optString(AppLovinEventTypes.USER_VIEWED_CONTENT), (float) jSONObjectOptJSONObject.optDouble("trackingFraction", 0.0d)).ouw());
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void lh() {
        if (yu.compareAndSet(false, true)) {
            Map<String, vt> map = ouw;
            HashSet hashSet = new HashSet(map.entrySet());
            map.clear();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry != null) {
                    ouw((String) entry.getKey(), (vt) entry.getValue(), true);
                }
            }
            yu.set(false);
        }
    }

    public static boolean ouw(vpp vppVar, List<lh> list, com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw ouwVar, long j, String str, vt vtVar, String str2) {
        List<String> listOuw = ouw(vppVar, list, ouwVar, j, str, str2);
        ouw(listOuw, vtVar);
        return !listOuw.isEmpty();
    }

    public static void ouw(List<String> list, vt vtVar) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            String str = list.get(i4);
            if (!TextUtils.isEmpty(str)) {
                ouw(str, vtVar, false);
            }
        }
    }

    private static void ouw(final String str, final vt vtVar, final boolean z3) {
        com.bytedance.sdk.component.ra.vt.vt vtVarVt = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.vt();
        vtVarVt.f7630lh = true;
        vtVarVt.ouw(str);
        vtVarVt.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.ryl.vt.lh.2
            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar2) {
                String str2;
                boolean z10;
                int i4;
                vt vtVar3 = vtVar;
                if (vtVar3 == null || vtVar3.ouw == null) {
                    return;
                }
                String str3 = null;
                if (vtVar2 == null || !vtVar2.pno) {
                    if (vtVar2 != null) {
                        str3 = vtVar2.ouw + ":" + vtVar2.vt;
                        if (!z3 && ((i4 = vtVar2.ouw) <= 300 || i4 >= 400)) {
                            lh.ouw.put(str, vtVar);
                        }
                    }
                    str2 = str3;
                    z10 = false;
                } else {
                    str2 = null;
                    z10 = true;
                }
                lh.ouw(z10, str2, uoy.lh(vtVar.ouw.uoy()), vtVar, str, z3);
                if (!z10 || lh.ouw.isEmpty()) {
                    return;
                }
                lh.lh();
            }

            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                vpp vppVar;
                vt vtVar2 = vtVar;
                if (vtVar2 != null && (vppVar = vtVar2.ouw) != null) {
                    lh.ouw(false, iOException != null ? iOException.getMessage() : null, uoy.lh(vppVar.uoy()), vtVar, str, z3);
                }
                if (z3 || vtVar == null) {
                    return;
                }
                lh.ouw.put(str, vtVar);
            }
        });
    }

    public static JSONArray ouw(List<lh> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i4 = 0; i4 < list.size(); i4++) {
            jSONArray.put(list.get(i4).vt);
        }
        return jSONArray;
    }

    public static List<lh> ouw(JSONArray jSONArray) {
        return ouw(jSONArray, false);
    }

    public static List<lh> ouw(JSONArray jSONArray, boolean z3) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                String strOptString = jSONArray.optString(i4);
                if (!TextUtils.isEmpty(strOptString)) {
                    ouw ouwVar = new ouw(strOptString);
                    ouwVar.ouw = z3;
                    arrayList.add(ouwVar.ouw());
                }
            }
        }
        return arrayList;
    }

    public void ouw() {
        this.f8423lh = true;
    }

    public static /* synthetic */ void ouw(final boolean z3, final String str, final String str2, final vt vtVar, final String str3, final boolean z10) {
        vpp vppVar;
        if (vtVar == null || (vppVar = vtVar.ouw) == null) {
            return;
        }
        final boolean zCd = vppVar.cd();
        final String str4 = zCd ? "dsp_track_link_result" : "track_link_result";
        com.bytedance.sdk.openadsdk.yu.lh.ouw(new pno(str4) { // from class: com.bytedance.sdk.openadsdk.core.ryl.vt.lh.3
            @Override // java.lang.Runnable
            public final void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", vtVar.vt);
                    jSONObject.put("success", z3);
                    jSONObject.put("url", str3);
                    if (zCd) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("description", str);
                        }
                        if (vtVar.f8429lh >= 0.0f) {
                            jSONObject.put("progress", Math.round(r1 * 100.0f) / 100.0d);
                        }
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vtVar.ouw, str2, str4, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.core.ryl.vt.lh.3.1
                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject lh() {
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject ouw() {
                        if (!z10) {
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
                });
            }
        });
    }
}
