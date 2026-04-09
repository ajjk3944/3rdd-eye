package com.bytedance.sdk.openadsdk.dg.bw.emc;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.emc.emc.emc.xq.b;
import com.bykv.vk.openvk.emc.emc.emc.xq.xq;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.xmt;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.bw;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.cf;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.dg;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.msw;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.qh;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.sz;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.ycc;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.ypw;
import com.bytedance.sdk.openadsdk.dg.uym;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import w2.a;

/* loaded from: classes.dex */
public class emc {
    private static final Map<a, cf> emc = Collections.synchronizedMap(new WeakHashMap());

    public static void bw(a aVar, cf.emc emcVar) {
        cf cfVar;
        if (aVar == null || emcVar == null || emcVar.ru() <= 0 || (cfVar = emc.get(aVar)) == null) {
            return;
        }
        xq xqVarDg = cfVar.dg();
        rie rieVarBw = cfVar.bw();
        if (xqVarDg == null || rieVarBw == null) {
            return;
        }
        long jDg = emcVar.dg();
        sz szVar = new sz();
        szVar.emc(emcVar.xq());
        szVar.ypw(jDg);
        szVar.emc(emcVar.ru());
        com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVarEmc = emc(rieVarBw, cfVar.ypw(), cfVar.xq(), xqVarDg, emcVar);
        emcVarEmc.emc(szVar);
        emcVarEmc.emc(emcVar.gbl());
        emc(emcVarEmc, "play_buffer");
    }

    public static void dg(a aVar, cf.emc emcVar) {
        cf cfVar;
        if (aVar == null || emcVar == null || (cfVar = emc.get(aVar)) == null) {
            return;
        }
        xq xqVarDg = cfVar.dg();
        rie rieVarBw = cfVar.bw();
        if (xqVarDg == null || rieVarBw == null) {
            return;
        }
        long jYpw = emcVar.ypw();
        long jDg = emcVar.dg();
        ypw ypwVar = new ypw();
        ypwVar.emc(emcVar.xq());
        ypwVar.ypw(jDg);
        ypwVar.emc(emcVar.bw());
        ypwVar.ypw(emcVar.ycc());
        com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVarEmc = emc(rieVarBw, cfVar.ypw(), cfVar.xq(), xqVarDg, emcVar);
        emcVarEmc.emc(ypwVar);
        emcVarEmc.emc(emcVar.gbl());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jYpw);
            jSONObject.put("percent", emcVar.uym());
            emc(emcVarEmc, "endcard_skip", jSONObject);
        } catch (JSONException e10) {
            ul.emc("TTAD.VideoEventManager", "", e10);
        }
        emc.remove(aVar);
    }

    public static void xq(a aVar, cf.emc emcVar) throws JSONException {
        cf cfVar;
        if (aVar == null || emcVar == null || (cfVar = emc.get(aVar)) == null) {
            return;
        }
        xq xqVarDg = cfVar.dg();
        rie rieVarBw = cfVar.bw();
        if (xqVarDg == null || rieVarBw == null) {
            return;
        }
        long jYpw = emcVar.ypw();
        long jDg = emcVar.dg();
        qh qhVar = new qh(emcVar.sz());
        qhVar.emc(emcVar.xq());
        qhVar.ypw(jDg);
        com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVarEmc = emc(rieVarBw, cfVar.ypw(), cfVar.xq(), xqVarDg, emcVar);
        emcVarEmc.emc(qhVar);
        emcVarEmc.emc(emcVar.gbl());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jYpw);
            jSONObject.put("percent", emcVar.uym());
            emc(emcVarEmc, "play_error", jSONObject);
        } catch (JSONException e10) {
            ul.emc("TTAD.VideoEventManager", "", e10);
        }
    }

    public static com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emc(rie rieVar, String str, int i10, xq xqVar) {
        return emc(rieVar, str, i10, xqVar, null);
    }

    public static void ypw(com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVar) {
        com.bytedance.sdk.openadsdk.vk.xq.emc("load_video_cancel", emcVar);
    }

    public static com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emc(rie rieVar, String str, int i10, xq xqVar, cf.emc emcVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (i10 > 0) {
            try {
                jSONObject.put("play_type", String.valueOf(i10));
            } catch (JSONException e10) {
                ul.emc("TTAD.VideoEventManager", "", e10);
            }
        }
        if (rieVar != null) {
            b bVarIat = rieVar.iat();
            if (bVarIat != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, bVarIat.M());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(bVarIat.b()));
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_URL, bVarIat.n());
                jSONObject.put("player_type", xqVar.sba());
                jSONObject.put("video_encode_type", xqVar.qh() ? 1 : 0);
            }
            jSONObject.put("play_time", xqVar.bw);
            jSONObject = xqVar.emc() ? new JSONObject(xqVar.xq().toString()) : null;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("session_id", str);
            }
            jSONObject.put("dp_creative_type", rieVar.aod());
        }
        return new com.bytedance.sdk.openadsdk.dg.bw.ypw.emc(rieVar, tp.emc(rieVar), jSONObject, jSONObject);
    }

    public static void ypw(a aVar, cf.emc emcVar) throws JSONException {
        cf cfVar;
        if (aVar == null || emcVar == null || (cfVar = emc.get(aVar)) == null) {
            return;
        }
        xq xqVarDg = cfVar.dg();
        rie rieVarBw = cfVar.bw();
        if (xqVarDg == null || rieVarBw == null) {
            return;
        }
        long jYpw = emcVar.ypw();
        long jDg = emcVar.dg();
        if (jDg <= 0 || jYpw <= 0) {
            return;
        }
        bw bwVar = new bw();
        bwVar.emc(emcVar.xq());
        bwVar.ypw(jDg);
        com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVarEmc = emc(rieVarBw, cfVar.ypw(), cfVar.xq(), xqVarDg, emcVar);
        emcVarEmc.emc(bwVar);
        emcVarEmc.emc(emcVar.gbl());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jYpw);
            jSONObject.put("percent", emcVar.uym());
            emc(emcVarEmc, "feed_continue", jSONObject);
        } catch (JSONException e10) {
            ul.emc("TTAD.VideoEventManager", "", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long xq(xq xqVar) {
        if (xqVar == null) {
            return 0L;
        }
        b bVarHxp = xqVar.qh() ? xqVar.hxp() : xqVar.rie();
        if (bVarHxp != null) {
            return Double.valueOf(bVarHxp.E() * 1000.0d).longValue();
        }
        return 0L;
    }

    public static void emc(com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVar) {
        com.bytedance.sdk.openadsdk.vk.xq.emc("load_video_error", emcVar);
    }

    public static void ypw(a aVar, cf.emc emcVar, uym uymVar) throws JSONException {
        if (aVar == null || emcVar == null) {
            return;
        }
        bw(aVar, emcVar);
        cf cfVar = emc.get(aVar);
        if (cfVar == null) {
            return;
        }
        xq xqVarDg = cfVar.dg();
        rie rieVarBw = cfVar.bw();
        if (xqVarDg == null || rieVarBw == null) {
            return;
        }
        long jYpw = emcVar.ypw();
        long jDg = emcVar.dg();
        ycc yccVar = new ycc(xqVarDg);
        yccVar.ypw(emcVar.xq());
        yccVar.emc(jDg);
        yccVar.emc(emcVar.zz());
        com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVarEmc = emc(rieVarBw, cfVar.ypw(), cfVar.xq(), xqVarDg, emcVar);
        emcVarEmc.emc(yccVar);
        JSONObject jSONObjectDg = emcVarEmc.dg();
        emc(emcVar, rieVarBw, jSONObjectDg);
        emcVarEmc.emc(emcVar.gbl());
        try {
            jSONObjectDg.put("surface_texture_updated", emcVar.cf() ? 1 : 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jYpw);
            jSONObject.put("percent", emcVar.uym());
            emc(emcVarEmc, "feed_over", jSONObject, uymVar);
        } catch (JSONException e10) {
            ul.emc("TTAD.VideoEventManager", "", e10);
        }
        emc.remove(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String dg(xq xqVar) {
        return new File(xqVar.bw(), xqVar.aa()).getAbsolutePath();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:6|(1:8)(2:10|(8:12|14|25|15|19|(1:22)|23|24)(1:13))|9|14|25|15|19|(0)|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        com.bytedance.sdk.component.utils.ul.emc("TTAD.VideoEventManager", "", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void emc(com.bytedance.sdk.openadsdk.core.model.rie r8, w2.a r9, com.bykv.vk.openvk.emc.emc.emc.xq.xq r10) throws org.json.JSONException {
        /*
            if (r8 == 0) goto L64
            if (r9 == 0) goto L64
            if (r10 != 0) goto L7
            goto L64
        L7:
            java.lang.String r3 = com.bytedance.sdk.openadsdk.utils.db.emc()
            boolean r0 = r10.ee()
            r7 = 1
            if (r0 == 0) goto L15
            r0 = 3
        L13:
            r4 = r0
            goto L27
        L15:
            int r0 = r8.zxw()
            t2.b r0 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r0)
            boolean r0 = r0.emc(r10)
            if (r0 == 0) goto L25
            r4 = r7
            goto L27
        L25:
            r0 = 2
            goto L13
        L27:
            com.bytedance.sdk.openadsdk.dg.bw.ypw.cf r0 = new com.bytedance.sdk.openadsdk.dg.bw.ypw.cf
            long r1 = android.os.SystemClock.elapsedRealtime()
            r6 = r8
            r5 = r10
            r0.<init>(r1, r3, r4, r5, r6)
            java.util.Map<w2.a, com.bytedance.sdk.openadsdk.dg.bw.ypw.cf> r8 = com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc
            r8.put(r9, r0)
            r8 = 0
            com.bytedance.sdk.openadsdk.dg.bw.ypw.emc r8 = emc(r6, r3, r4, r5, r8)
            org.json.JSONObject r9 = r8.xq()
            java.lang.String r10 = "is_mute"
            boolean r0 = r5.gbl()     // Catch: org.json.JSONException -> L4a
            r9.put(r10, r0)     // Catch: org.json.JSONException -> L4a
            goto L53
        L4a:
            r0 = move-exception
            r9 = r0
            java.lang.String r10 = "TTAD.VideoEventManager"
            java.lang.String r0 = ""
            com.bytedance.sdk.component.utils.ul.emc(r10, r0, r9)
        L53:
            int r9 = r5.sba()
            r10 = -1
            if (r9 != r10) goto L5b
            goto L5c
        L5b:
            r7 = 0
        L5c:
            r8.emc(r7)
            java.lang.String r9 = "play_start"
            emc(r8, r9)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(com.bytedance.sdk.openadsdk.core.model.rie, w2.a, com.bykv.vk.openvk.emc.emc.emc.xq.xq):void");
    }

    public static void emc(Context context, a aVar, cf.emc emcVar, uym uymVar) throws JSONException {
        cf cfVar;
        if (context == null || aVar == null || emcVar == null || (cfVar = emc.get(aVar)) == null) {
            return;
        }
        xq xqVarDg = cfVar.dg();
        rie rieVarBw = cfVar.bw();
        if (xqVarDg == null || rieVarBw == null) {
            return;
        }
        if (!emcVar.gbl()) {
            emc(rieVarBw, xqVarDg, emcVar);
        }
        msw mswVar = new msw(xqVarDg);
        mswVar.emc(emcVar.sup() ? 1 : 0);
        mswVar.ypw(CacheDirFactory.getICacheDir(rieVarBw.zxw()).a(xqVarDg));
        mswVar.emc(SystemClock.elapsedRealtime() - cfVar.emc());
        com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVarEmc = emc(rieVarBw, cfVar.ypw(), cfVar.xq(), xqVarDg, emcVar);
        emcVarEmc.emc(mswVar);
        JSONObject jSONObjectDg = emcVarEmc.dg();
        try {
            jSONObjectDg.put("is_received_video_not_playing_info", emcVar.qh() ? 1 : 0);
            jSONObjectDg.put("new_media_source", x2.a.i());
        } catch (JSONException e10) {
            ul.emc("TTAD.VideoEventManager", "", e10);
        }
        emcVarEmc.emc(emcVar.gbl());
        emc(emcVarEmc, "feed_play", uymVar);
    }

    public static void emc(a aVar, cf.emc emcVar) throws JSONException {
        cf cfVar;
        if (aVar == null || emcVar == null || (cfVar = emc.get(aVar)) == null) {
            return;
        }
        xq xqVarDg = cfVar.dg();
        rie rieVarBw = cfVar.bw();
        if (xqVarDg == null || rieVarBw == null) {
            return;
        }
        long jYpw = emcVar.ypw();
        long jDg = emcVar.dg();
        if (jDg <= 0 || jYpw <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.bw.ypw.uym uymVar = new com.bytedance.sdk.openadsdk.dg.bw.ypw.uym();
        uymVar.emc(emcVar.xq());
        uymVar.ypw(jDg);
        com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVarEmc = emc(rieVarBw, cfVar.ypw(), cfVar.xq(), xqVarDg, emcVar);
        emcVarEmc.emc(uymVar);
        emc(emcVar, rieVarBw, emcVarEmc.dg());
        emcVarEmc.emc(emcVar.gbl());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jYpw);
            jSONObject.put("percent", emcVar.uym());
            emc(emcVarEmc, "feed_pause", jSONObject);
        } catch (JSONException e10) {
            ul.emc("TTAD.VideoEventManager", "", e10);
        }
    }

    private static void emc(cf.emc emcVar, rie rieVar, JSONObject jSONObject) {
        if (rieVar != null) {
            try {
                xmt xmtVarPdk = rieVar.pdk();
                if (xmtVarPdk != null) {
                    jSONObject.put("speed_type", xmtVarPdk.ypw());
                    jSONObject.put("speed", xmtVarPdk.emc());
                    jSONObject.put("speed_duration", emcVar.emc());
                }
            } catch (Throwable th) {
                ul.emc("TTAD.VideoEventManager", "", th);
            }
        }
    }

    public static void emc(a aVar, cf.emc emcVar, uym uymVar) {
        if (aVar == null || emcVar == null) {
            return;
        }
        bw(aVar, emcVar);
        cf cfVar = emc.get(aVar);
        if (cfVar == null) {
            return;
        }
        xq xqVarDg = cfVar.dg();
        rie rieVarBw = cfVar.bw();
        if (xqVarDg == null || rieVarBw == null) {
            return;
        }
        long jYpw = emcVar.ypw();
        long jDg = emcVar.dg();
        dg dgVar = new dg();
        dgVar.ypw(emcVar.xq());
        dgVar.emc(jDg);
        dgVar.emc(emcVar.msw());
        dgVar.ypw(emcVar.zz());
        com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVarEmc = emc(rieVarBw, cfVar.ypw(), cfVar.xq(), xqVarDg, emcVar);
        emcVarEmc.emc(dgVar);
        emc(emcVar, rieVarBw, emcVarEmc.dg());
        emcVarEmc.emc(emcVar.gbl());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jYpw);
            jSONObject.put("percent", emcVar.uym());
            emc(emcVarEmc, "feed_break", jSONObject, uymVar);
        } catch (JSONException e10) {
            ul.emc("TTAD.VideoEventManager", "", e10);
        }
    }

    public static void emc(a aVar, boolean z10, String str) throws JSONException {
        cf cfVar;
        if (aVar == null || (cfVar = emc.get(aVar)) == null) {
            return;
        }
        xq xqVarDg = cfVar.dg();
        rie rieVarBw = cfVar.bw();
        if (xqVarDg == null || rieVarBw == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVarEmc = emc(rieVarBw, cfVar.ypw(), cfVar.xq(), xqVarDg, null);
        try {
            emcVarEmc.xq().put("is_mute", z10 ? 1 : 0);
            emcVarEmc.dg().put("from", str);
        } catch (JSONException e10) {
            ul.emc("TTAD.VideoEventManager", "", e10);
        }
        emc(emcVarEmc, "mute_state_change");
    }

    private static void emc(com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVar, String str) {
        emc(emcVar, str, (JSONObject) null, (uym) null);
    }

    private static void emc(com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVar, String str, JSONObject jSONObject) {
        emc(emcVar, str, jSONObject, (uym) null);
    }

    private static void emc(com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVar, String str, uym uymVar) {
        emc(emcVar, str, (JSONObject) null, uymVar);
    }

    private static void emc(final com.bytedance.sdk.openadsdk.dg.bw.ypw.emc emcVar, String str, final JSONObject jSONObject, final uym uymVar) {
        if (emcVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (emcVar.ycc() && !TextUtils.isEmpty(emcVar.ypw())) {
            String strYpw = emcVar.ypw();
            strYpw.getClass();
            if (strYpw.equals("stream") || strYpw.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str2 = str;
        com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), emcVar.emc(), emcVar.ypw(), str2, new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.dg.bw.emc.emc.1
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() {
                emcVar.uym();
                return emcVar.dg();
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                uym uymVar2;
                try {
                    JSONObject jSONObjectXq = emcVar.xq();
                    if (emcVar.bw() != null) {
                        emcVar.bw().emc(jSONObjectXq);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (uymVar2 = uymVar) != null) {
                        uymVar2.emc(jSONObjectXq);
                    }
                    return jSONObjectXq;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() {
                return jSONObject;
            }
        });
    }

    private static void emc(final rie rieVar, final xq xqVar, final cf.emc emcVar) {
        com.bytedance.sdk.openadsdk.vk.xq.emc();
        com.bytedance.sdk.openadsdk.vk.xq.emc("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.dg.bw.emc.emc.2
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", emc.xq(xqVar));
                jSONObject.put("player_duration", emcVar.dg());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", xqVar.vk());
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, emc.dg(xqVar));
                jSONObject.put("player_type", xqVar.sba());
                com.bytedance.sdk.openadsdk.vk.emc.dg dgVarEmc = com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("pangle_video_play_state");
                rie rieVar2 = rieVar;
                return dgVarEmc.emc(rieVar2 != null ? rieVar2.mfx() : 0).ypw(jSONObject.toString());
            }
        });
    }
}
