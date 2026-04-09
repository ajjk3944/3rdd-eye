package com.bytedance.sdk.openadsdk.yu.fkw.ouw;

import a9.a;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.f1;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.cd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.rn.lh;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.fkw;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.jg;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.le;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.mwh;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.pno;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.vt;
import com.bytedance.sdk.openadsdk.yu.ra;
import com.google.android.gms.internal.play_billing.m1;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import u6.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    private static final Map<a, ko> ouw = DesugarCollections.synchronizedMap(new WeakHashMap());

    public static void fkw(a aVar, ko.ouw ouwVar) throws JSONException {
        if (aVar == null || ouwVar == null) {
            return;
        }
        if (ouwVar.ryl <= 0) {
            com.bytedance.sdk.component.utils.ko.lh("TTAD.VideoEventManager", "Cancel log report when buffer count is 0");
            return;
        }
        ko koVar = ouw.get(aVar);
        if (koVar == null) {
            return;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar2 = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (aVar2 == null || vppVar == null) {
            return;
        }
        long j = ouwVar.f8764lh;
        mwh mwhVar = new mwh();
        mwhVar.ouw = ouwVar.vt;
        mwhVar.f8766lh = j;
        mwhVar.vt = ouwVar.ryl;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f8760lh, aVar2);
        ouwVarOuw.f8768lh = mwhVar;
        ouwVarOuw.yu = ouwVar.mwh;
        ouw(ouwVarOuw, "play_buffer", (JSONObject) null, (ra) null);
    }

    public static void lh(a aVar, ko.ouw ouwVar) throws JSONException {
        ko koVar;
        if (aVar == null || (koVar = ouw.get(aVar)) == null) {
            return;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar2 = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (aVar2 == null || vppVar == null) {
            return;
        }
        long j = ouwVar.ouw;
        long j8 = ouwVar.f8764lh;
        jg jgVar = new jg(ouwVar.f8762jg);
        jgVar.ouw = ouwVar.vt;
        jgVar.vt = j8;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f8760lh, aVar2);
        ouwVarOuw.f8768lh = jgVar;
        ouwVarOuw.yu = ouwVar.mwh;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            jSONObject.put("percent", ouwVar.ouw());
            ouw(ouwVarOuw, "play_error", jSONObject, (ra) null);
        } catch (JSONException e2) {
            qbp.ouw("TTAD.VideoEventManager", "", e2);
        }
    }

    public static com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouw(vpp vppVar, String str, com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar) {
        return ouw(vppVar, str, -1, aVar);
    }

    public static void vt(com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVar) {
        lh.ouw("load_video_cancel", ouwVar);
    }

    public static void yu(a aVar, ko.ouw ouwVar) throws JSONException {
        ko koVar;
        if (aVar == null || (koVar = ouw.get(aVar)) == null) {
            return;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar2 = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (aVar2 == null || vppVar == null) {
            return;
        }
        long j = ouwVar.ouw;
        long j8 = ouwVar.f8764lh;
        vt vtVar = new vt();
        vtVar.ouw = ouwVar.vt;
        vtVar.vt = j8;
        vtVar.f8773lh = ouwVar.pno;
        vtVar.yu = ouwVar.bly;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f8760lh, aVar2);
        ouwVarOuw.f8768lh = vtVar;
        ouwVarOuw.yu = ouwVar.mwh;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            jSONObject.put("percent", ouwVar.ouw());
            ouw(ouwVarOuw, "endcard_skip", jSONObject, (ra) null);
        } catch (JSONException e2) {
            qbp.ouw("TTAD.VideoEventManager", "", e2);
        }
        ouw.remove(aVar);
    }

    private static com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouw(vpp vppVar, String str, int i4, com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (i4 > 0) {
            try {
                jSONObject.put("play_type", String.valueOf(i4));
            } catch (JSONException e2) {
                qbp.ouw("TTAD.VideoEventManager", "", e2);
            }
        }
        if (vppVar != null) {
            c cVar = vppVar.f8309sd;
            if (cVar != null) {
                jSONObject.put("video_resolution", cVar.f6577e);
                jSONObject.put("video_size", Long.valueOf(cVar.f6575c));
                jSONObject.put("video_url", cVar.g);
                jSONObject.put("player_type", aVar.rn);
                jSONObject.put("video_encode_type", aVar.le() ? 1 : 0);
            }
            jSONObject.put("play_time", aVar.jqy);
            jSONObject = aVar.ouw() ? new JSONObject(aVar.ex.toString()) : null;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("session_id", str);
            }
            jSONObject.put("dp_creative_type", vppVar.cy);
        }
        return new com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw(vppVar, uoy.ouw(vppVar), jSONObject, jSONObject);
    }

    public static void vt(a aVar, ko.ouw ouwVar) throws JSONException {
        ko koVar;
        if (aVar == null || (koVar = ouw.get(aVar)) == null) {
            return;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar2 = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (aVar2 == null || vppVar == null) {
            return;
        }
        long j = ouwVar.ouw;
        long j8 = ouwVar.f8764lh;
        if (j8 <= 0 || j <= 0) {
            return;
        }
        fkw fkwVar = new fkw();
        fkwVar.ouw = ouwVar.vt;
        fkwVar.vt = j8;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f8760lh, aVar2);
        ouwVarOuw.f8768lh = fkwVar;
        ouwVarOuw.yu = ouwVar.mwh;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            jSONObject.put("percent", ouwVar.ouw());
            ouw(ouwVarOuw, "feed_continue", jSONObject, (ra) null);
        } catch (JSONException e2) {
            qbp.ouw("TTAD.VideoEventManager", "", e2);
        }
    }

    public static void vt(a aVar, ko.ouw ouwVar, ra raVar) throws JSONException {
        if (aVar == null) {
            return;
        }
        fkw(aVar, ouwVar);
        ko koVar = ouw.get(aVar);
        if (koVar == null) {
            return;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar2 = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (aVar2 == null || vppVar == null) {
            return;
        }
        long j = ouwVar.ouw;
        long j8 = ouwVar.f8764lh;
        le leVar = new le();
        leVar.vt = ouwVar.vt;
        leVar.ouw = j8;
        leVar.f8765lh = ouwVar.f8761cf;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f8760lh, aVar2);
        ouwVarOuw.f8768lh = leVar;
        JSONObject jSONObjectVt = ouwVarOuw.vt();
        ouw(ouwVar, vppVar, jSONObjectVt);
        ouwVarOuw.yu = ouwVar.mwh;
        try {
            jSONObjectVt.put("surface_texture_updated", ouwVar.fkw ? 1 : 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            jSONObject.put("percent", ouwVar.ouw());
            ouw(ouwVarOuw, "feed_over", jSONObject, raVar);
        } catch (JSONException e2) {
            qbp.ouw("TTAD.VideoEventManager", "", e2);
        }
        ouw.remove(aVar);
    }

    public static void ouw(com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVar) {
        lh.ouw("load_video_error", ouwVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:6|(1:8)(3:10|(1:16)(1:15)|(8:18|20|31|21|25|(1:28)|29|30)(1:19))|9|20|31|21|25|(0)|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.VideoEventManager", "", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp r9, a9.a r10, com.bykv.vk.openvk.ouw.ouw.ouw.lh.a r11) throws org.json.JSONException {
        /*
            if (r9 == 0) goto L82
            if (r10 == 0) goto L82
            if (r11 != 0) goto L8
            goto L82
        L8:
            java.lang.String r3 = com.bytedance.sdk.openadsdk.utils.ex.ouw()
            boolean r0 = r11.yu
            r7 = 1
            r8 = 0
            if (r0 == 0) goto L15
            r0 = 3
        L13:
            r4 = r0
            goto L4a
        L15:
            int r0 = r9.sm
            y8.b r0 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r0)
            androidx.lifecycle.f1 r0 = (androidx.lifecycle.f1) r0
            r0.getClass()
            java.lang.String r0 = r11.f6567lh
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = r11.bly()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L33
            goto L43
        L33:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r11.f6567lh
            java.lang.String r2 = r11.bly()
            r0.<init>(r1, r2)
            boolean r0 = r0.exists()
            goto L44
        L43:
            r0 = r8
        L44:
            if (r0 == 0) goto L48
            r4 = r7
            goto L4a
        L48:
            r0 = 2
            goto L13
        L4a:
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ko r0 = new com.bytedance.sdk.openadsdk.yu.fkw.vt.ko
            long r1 = android.os.SystemClock.elapsedRealtime()
            r6 = r9
            r5 = r11
            r0.<init>(r1, r3, r4, r5, r6)
            java.util.Map<a9.a, com.bytedance.sdk.openadsdk.yu.fkw.vt.ko> r9 = com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw
            r9.put(r10, r0)
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw r9 = ouw(r6, r3, r4, r5)
            org.json.JSONObject r10 = r9.ouw()
            java.lang.String r11 = "is_mute"
            boolean r0 = r5.f6564cf     // Catch: org.json.JSONException -> L6a
            r10.put(r11, r0)     // Catch: org.json.JSONException -> L6a
            goto L73
        L6a:
            r0 = move-exception
            r10 = r0
            java.lang.String r11 = "TTAD.VideoEventManager"
            java.lang.String r0 = ""
            com.bytedance.sdk.component.utils.qbp.ouw(r11, r0, r10)
        L73:
            int r10 = r5.rn
            r11 = -1
            if (r10 != r11) goto L79
            goto L7a
        L79:
            r7 = r8
        L7a:
            r9.yu = r7
            java.lang.String r10 = "play_start"
            r11 = 0
            ouw(r9, r10, r11, r11)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(com.bytedance.sdk.openadsdk.core.model.vpp, a9.a, com.bykv.vk.openvk.ouw.ouw.ouw.lh.a):void");
    }

    public static /* synthetic */ String vt(com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar) {
        return new File(aVar.f6567lh, aVar.bly()).getAbsolutePath();
    }

    public static void ouw(Context context, a aVar, final ko.ouw ouwVar, ra raVar) throws JSONException {
        ko koVar;
        if (context == null || aVar == null || (koVar = ouw.get(aVar)) == null) {
            return;
        }
        final com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar2 = koVar.yu;
        final vpp vppVar = koVar.fkw;
        if (aVar2 == null || vppVar == null) {
            return;
        }
        if (!ouwVar.mwh) {
            lh.ouw();
            lh.ouw("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.2
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("service_duration", ouw.ouw(aVar2));
                    jSONObject.put("player_duration", ouwVar.f8764lh);
                    jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                    jSONObject.put("url", aVar2.pno());
                    jSONObject.put("path", ouw.vt(aVar2));
                    jSONObject.put("player_type", aVar2.rn);
                    yu yuVar = new yu();
                    yuVar.ouw = "pangle_video_play_state";
                    vpp vppVar2 = vppVar;
                    yuVar.yu = vppVar2 != null ? vppVar2.uoy() : 0;
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
        }
        pno pnoVar = new pno(aVar2);
        pnoVar.f8769lh = ouwVar.ra ? 1 : 0;
        ((f1) CacheDirFactory.getICacheDir(vppVar.sm)).getClass();
        long length = 0;
        if (!TextUtils.isEmpty(aVar2.f6567lh) && !TextUtils.isEmpty(aVar2.bly())) {
            String str = aVar2.f6567lh;
            String strBly = aVar2.bly();
            File fileG = m1.G(str, strBly);
            if (fileG.exists()) {
                length = fileG.length();
            } else {
                File fileA = m1.A(str, strBly);
                if (fileA.exists()) {
                    length = fileA.length();
                }
            }
        }
        pnoVar.vt = length;
        pnoVar.ouw = SystemClock.elapsedRealtime() - koVar.ouw;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f8760lh, aVar2);
        ouwVarOuw.f8768lh = pnoVar;
        JSONObject jSONObjectVt = ouwVarOuw.vt();
        try {
            jSONObjectVt.put("is_received_video_not_playing_info", ouwVar.yu ? 1 : 0);
            jSONObjectVt.put("new_media_source", t.g);
        } catch (JSONException e2) {
            qbp.ouw("TTAD.VideoEventManager", "", e2);
        }
        ouwVarOuw.yu = ouwVar.mwh;
        ouw(ouwVarOuw, "feed_play", (JSONObject) null, raVar);
    }

    public static void ouw(a aVar, ko.ouw ouwVar) throws JSONException {
        ko koVar;
        if (aVar == null || (koVar = ouw.get(aVar)) == null) {
            return;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar2 = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (aVar2 == null || vppVar == null) {
            return;
        }
        long j = ouwVar.ouw;
        long j8 = ouwVar.f8764lh;
        if (j8 <= 0 || j <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ra raVar = new com.bytedance.sdk.openadsdk.yu.fkw.vt.ra();
        raVar.ouw = ouwVar.vt;
        raVar.vt = j8;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f8760lh, aVar2);
        ouwVarOuw.f8768lh = raVar;
        ouw(ouwVar, vppVar, ouwVarOuw.vt());
        ouwVarOuw.yu = ouwVar.mwh;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            jSONObject.put("percent", ouwVar.ouw());
            ouw(ouwVarOuw, "feed_pause", jSONObject, (ra) null);
        } catch (JSONException e2) {
            qbp.ouw("TTAD.VideoEventManager", "", e2);
        }
    }

    public static void ouw(a aVar, ko.ouw ouwVar, ra raVar) {
        if (aVar == null || ouwVar == null) {
            return;
        }
        fkw(aVar, ouwVar);
        ko koVar = ouw.get(aVar);
        if (koVar == null) {
            return;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar2 = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (aVar2 == null || vppVar == null) {
            return;
        }
        long j = ouwVar.ouw;
        long j8 = ouwVar.f8764lh;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.yu yuVar = new com.bytedance.sdk.openadsdk.yu.fkw.vt.yu();
        yuVar.vt = ouwVar.vt;
        yuVar.ouw = j8;
        yuVar.f8774lh = ouwVar.tlj;
        yuVar.yu = ouwVar.f8761cf;
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f8760lh, aVar2);
        ouwVarOuw.f8768lh = yuVar;
        ouw(ouwVar, vppVar, ouwVarOuw.vt());
        ouwVarOuw.yu = ouwVar.mwh;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            jSONObject.put("percent", ouwVar.ouw());
            ouw(ouwVarOuw, "feed_break", jSONObject, raVar);
        } catch (JSONException e2) {
            qbp.ouw("TTAD.VideoEventManager", "", e2);
        }
    }

    public static void ouw(a aVar, boolean z3, String str) throws JSONException {
        ko koVar;
        if (aVar == null || (koVar = ouw.get(aVar)) == null) {
            return;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar2 = koVar.yu;
        vpp vppVar = koVar.fkw;
        if (aVar2 == null || vppVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVarOuw = ouw(vppVar, koVar.vt, koVar.f8760lh, aVar2);
        try {
            ouwVarOuw.ouw().put("is_mute", z3 ? 1 : 0);
            ouwVarOuw.vt().put("from", str);
        } catch (JSONException e2) {
            qbp.ouw("TTAD.VideoEventManager", "", e2);
        }
        ouw(ouwVarOuw, "mute_state_change", (JSONObject) null, (ra) null);
    }

    private static void ouw(final com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVar, String str, final JSONObject jSONObject, final ra raVar) {
        if (ouwVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (ouwVar.yu && !TextUtils.isEmpty(ouwVar.vt)) {
            String str2 = ouwVar.vt;
            str2.getClass();
            if (str2.equals("stream") || str2.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str3 = str;
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), ouwVar.ouw, ouwVar.vt, str3, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.1
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                ra raVar2;
                try {
                    JSONObject jSONObjectOuw = ouwVar.ouw();
                    com.bytedance.sdk.openadsdk.yu.fkw.vt.lh lhVar = ouwVar.f8768lh;
                    if (lhVar != null) {
                        lhVar.ouw(jSONObjectOuw);
                    }
                    if (("feed_play".equals(str3) || "feed_over".equals(str3) || "feed_break".equals(str3)) && (raVar2 = raVar) != null) {
                        raVar2.ouw(jSONObjectOuw);
                    }
                    return jSONObjectOuw;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                com.bytedance.sdk.openadsdk.yu.fkw.vt.ouw ouwVar2 = ouwVar;
                com.bytedance.sdk.openadsdk.yu.fkw.vt.lh lhVar = ouwVar2.f8768lh;
                if (lhVar != null) {
                    lhVar.ouw(ouwVar2);
                }
                return ouwVar.vt();
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                return jSONObject;
            }
        });
    }

    private static void ouw(ko.ouw ouwVar, vpp vppVar, JSONObject jSONObject) {
        if (vppVar != null) {
            try {
                cd cdVar = vppVar.f8311tj;
                if (cdVar != null) {
                    jSONObject.put("speed_type", cdVar.vt);
                    jSONObject.put("speed", cdVar.ouw);
                    jSONObject.put("speed_duration", ouwVar.f8763le);
                }
            } catch (Throwable th2) {
                qbp.ouw("TTAD.VideoEventManager", "", th2);
            }
        }
    }

    public static /* synthetic */ long ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar) {
        c cVar;
        if (aVar == null) {
            return 0L;
        }
        if (aVar.le()) {
            cVar = aVar.vt;
        } else {
            cVar = aVar.ouw;
        }
        if (cVar != null) {
            return Double.valueOf(cVar.f6576d * 1000.0d).longValue();
        }
        return 0L;
    }
}
