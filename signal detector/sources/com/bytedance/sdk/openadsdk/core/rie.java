package com.bytedance.sdk.openadsdk.core;

import A.f;
import N1.a;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.core.sra;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class rie implements sra<com.bytedance.sdk.openadsdk.dg.emc> {
    private final Context emc;

    public static class emc {
        final String bw;
        final int dg;
        final int emc;
        public final com.bytedance.sdk.openadsdk.core.model.emc msw;
        final ArrayList<Integer> ru;
        final String uym;
        final long xq;
        final int ycc;
        final long ypw;
        final String zz;

        private emc(String str, int i, int i3, String str2, int i6, String str3, com.bytedance.sdk.openadsdk.core.model.emc emcVar, long j6, long j7, ArrayList<Integer> arrayList) {
            this.emc = i;
            this.dg = i3;
            this.bw = str2;
            this.uym = str3;
            this.msw = emcVar;
            this.zz = str;
            this.ycc = i6;
            this.ypw = j6;
            this.xq = j7;
            this.ru = arrayList;
        }

        public static emc emc(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.sb sbVar) {
            String strOptString = jSONObject.optString("did");
            int iOptInt = jSONObject.optInt("processing_time_ms");
            long jOptLong = jSONObject.optLong("s_receive_ts");
            long jOptLong2 = jSONObject.optLong("s_send_ts");
            int iOptInt2 = jSONObject.optInt("status_code");
            String strOptString2 = jSONObject.optString("desc");
            String strOptString3 = jSONObject.optString("request_id");
            int iOptInt3 = jSONObject.optInt("reason");
            Pair<com.bytedance.sdk.openadsdk.core.model.emc, ArrayList<Integer>> pairEmc = com.bytedance.sdk.openadsdk.core.ypw.emc(jSONObject, adSlot, sbVar);
            return pairEmc == null ? new emc(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, null, jOptLong, jOptLong2, null) : new emc(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, (com.bytedance.sdk.openadsdk.core.model.emc) pairEmc.first, jOptLong, jOptLong2, (ArrayList) pairEmc.second);
        }
    }

    public static class ypw {
        public final int emc;
        public final com.bytedance.sdk.openadsdk.core.model.rtt xq;
        public final boolean ypw;

        private ypw(int i, boolean z6, com.bytedance.sdk.openadsdk.core.model.rtt rttVar) {
            this.emc = i;
            this.ypw = z6;
            this.xq = rttVar;
        }

        public static ypw emc(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int iOptInt = jSONObject.optInt("code");
            boolean zOptBoolean = jSONObject.optBoolean("verify");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            com.bytedance.sdk.openadsdk.core.model.rtt rttVar = new com.bytedance.sdk.openadsdk.core.model.rtt();
            if (jSONObjectOptJSONObject != null) {
                try {
                    rttVar.emc(jSONObjectOptJSONObject.optInt("reason"));
                    rttVar.ypw(jSONObjectOptJSONObject.optInt("corp_type"));
                    rttVar.xq(jSONObjectOptJSONObject.optInt("reward_amount"));
                    rttVar.emc(jSONObjectOptJSONObject.optString("reward_name"));
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ul.xq("NetApiImpl", th.getMessage());
                }
            }
            return new ypw(iOptInt, zOptBoolean, rttVar);
        }
    }

    public rie(Context context) {
        this.emc = context;
    }

    private boolean bw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.optString(PglCryptUtils.KEY_MESSAGE).equalsIgnoreCase("success");
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean dg(String str) {
        if (com.bytedance.sdk.openadsdk.core.msw.ypw.emc()) {
            return true;
        }
        if (!com.bytedance.sdk.openadsdk.core.msw.ypw.emc(str)) {
            return false;
        }
        String strYpw = com.bytedance.sdk.openadsdk.core.msw.ypw.ypw();
        if (!TextUtils.isEmpty(strYpw)) {
            com.bytedance.sdk.openadsdk.dg.xq.emc(strYpw, System.currentTimeMillis());
        }
        return true;
    }

    private boolean xq(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    @DungeonFlag
    private void ycc(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("package_name", com.bytedance.sdk.openadsdk.utils.tp.ycc());
            jSONObject.put("version_code", com.bytedance.sdk.openadsdk.utils.tp.uym());
            jSONObject.put("version", com.bytedance.sdk.openadsdk.utils.tp.msw());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.sb sbVar, final int i, final sra.emc emcVar) {
        com.bytedance.sdk.openadsdk.core.model.emc emcVar2;
        if (!aa.dg().hj()) {
            emcVar.emc(40060, msw.emc(40060));
            return;
        }
        boolean zXq = com.bytedance.sdk.openadsdk.sra.emc.xq();
        if (!zXq) {
            qh.ycc();
        }
        final com.bytedance.sdk.openadsdk.core.model.xq xqVar = new com.bytedance.sdk.openadsdk.core.model.xq();
        xqVar.emc(adSlot);
        if (!com.bytedance.sdk.openadsdk.core.settings.uym.emc()) {
            if (emcVar != null) {
                emcVar.emc(TTAdConstant.STYLE_SIZE_RADIO_1_1, "Ad request is temporarily paused, Please contact your AM");
                xqVar.emc(TTAdConstant.STYLE_SIZE_RADIO_1_1);
                com.bytedance.sdk.openadsdk.core.model.xq.emc(xqVar);
                return;
            }
            return;
        }
        if (!aa.dg().wad()) {
            if (emcVar != null) {
                emcVar.emc(-16, msw.emc(-16));
                xqVar.emc(BackupConstant.SCENE_RENDER_FAIL);
                com.bytedance.sdk.openadsdk.core.model.xq.emc(xqVar);
                return;
            }
            return;
        }
        if (emcVar == null) {
            return;
        }
        if (dg(adSlot.getCodeId())) {
            emcVar.emc(-8, msw.emc(-8));
            return;
        }
        if (!TextUtils.isEmpty(adSlot.getBidAdm()) && !sbVar.ycc) {
            xqVar.ypw(2);
            xqVar.emc(adSlot.getBidAdm());
            if (com.bytedance.sdk.component.utils.cf.dg()) {
                a.a(adSlot.getBidAdm());
            }
            if (aa.dg().ndl() && lt.emc().dg() == 1) {
                com.bytedance.sdk.openadsdk.utils.tp.emc("Pangle_Debug_Mode", adSlot.getBidAdm(), this.emc);
            }
            try {
                JSONObject jSONObjectEmc = emc(new JSONObject(adSlot.getBidAdm()));
                if (jSONObjectEmc == null) {
                    xqVar.xq(12);
                    emc(emcVar, xqVar);
                    return;
                }
                emc emcVarEmc = emc.emc(jSONObjectEmc, adSlot, sbVar);
                xqVar.emc(emcVarEmc.ru);
                sup.emc(emcVarEmc.zz);
                int i3 = emcVarEmc.dg;
                if (i3 != 20000) {
                    emcVar.emc(i3, emcVarEmc.bw);
                    xqVar.emc(emcVarEmc.dg);
                    xqVar.xq(9);
                    com.bytedance.sdk.openadsdk.core.model.xq.emc(xqVar);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.emc emcVar3 = emcVarEmc.msw;
                if (emcVar3 == null) {
                    xqVar.xq(13);
                    emc(emcVar, xqVar);
                    return;
                }
                if (emcVar3.dg() != null && !emcVarEmc.msw.dg().isEmpty()) {
                    com.bytedance.sdk.openadsdk.vk.xq.emc(emcVarEmc.msw.dg().get(0));
                }
                emc(emcVarEmc.msw);
                if (emc(emcVarEmc.msw, emcVar)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.sup.xq.dg.emc(emcVarEmc.msw);
                emcVar.emc(emcVarEmc.msw, xqVar);
                Map<String, com.bytedance.sdk.openadsdk.core.model.rie> mapEmc = com.bytedance.sdk.openadsdk.core.model.emc.emc(emcVarEmc.msw);
                if (mapEmc != null) {
                    com.bytedance.sdk.openadsdk.uym.ypw.emc().emc(mapEmc);
                }
                ypw(emcVarEmc.msw);
                com.bytedance.sdk.openadsdk.core.bw.emc.emc().emc(emcVarEmc.msw);
                return;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ul.emc("NetApiImpl", "get ad error: ", th);
                xqVar.xq(14);
                xqVar.ypw(th.getMessage());
                emc(emcVar, xqVar);
                return;
            }
        }
        if (sbVar != null && !TextUtils.isEmpty(sbVar.sup)) {
            try {
                JSONObject jSONObjectEmc2 = emc(new JSONObject(sbVar.sup));
                if (jSONObjectEmc2 != null) {
                    emc emcVarEmc2 = emc.emc(jSONObjectEmc2, adSlot, sbVar);
                    ul ulVar = sbVar.sz;
                    if (ulVar != null && (emcVar2 = emcVarEmc2.msw) != null && ulVar.emc(emcVar2)) {
                        com.bytedance.sdk.openadsdk.core.sup.xq.dg.emc(emcVar2);
                        emcVar.emc(emcVar2, xqVar);
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObjectEmc3 = emc(adSlot, sbVar, i);
        if (jSONObjectEmc3 == null) {
            emcVar.emc(-9, msw.emc(-9));
            xqVar.emc(-9);
            com.bytedance.sdk.openadsdk.core.model.xq.emc(xqVar);
            return;
        }
        if (aa.dg().ndl() && lt.emc().dg() == 1) {
            com.bytedance.sdk.openadsdk.utils.tp.emc("Pangle_Debug_Mode", jSONObjectEmc3.toString(), this.emc);
        }
        String strEmc = com.bytedance.sdk.openadsdk.utils.tp.emc("/api/ad/union/sdk/get_ads/", true, false);
        final com.bytedance.sdk.component.uym.ypw.dg dgVarYpw = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().ypw();
        try {
            dgVarYpw.ypw(com.bytedance.sdk.openadsdk.zz.dg.emc(dgVarYpw, strEmc));
        } catch (Exception unused2) {
        }
        dgVarYpw.emc(jSONObjectEmc3.toString(), aa.dg().sba());
        Map<String, String> mapEmc2 = com.bytedance.sdk.openadsdk.core.ru.xq.emc(strEmc, jSONObjectEmc3.toString());
        if (mapEmc2 != null && mapEmc2.size() > 0) {
            for (String str : mapEmc2.keySet()) {
                try {
                    dgVarYpw.ypw(str, mapEmc2.get(str));
                } catch (Exception e6) {
                    com.bytedance.sdk.component.utils.ul.xq("NetApiImpl", e6.getMessage());
                }
            }
        }
        try {
            dgVarYpw.ypw("User-Agent", com.bytedance.sdk.openadsdk.utils.tp.dg());
            emc(dgVarYpw, jSONObjectEmc3);
        } catch (Exception unused3) {
        }
        final com.bytedance.sdk.openadsdk.utils.mxo mxoVarYpw = com.bytedance.sdk.openadsdk.utils.mxo.ypw();
        final Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
        boolean z6 = zz.ypw().aa() && requestExtraMap != null;
        if (z6) {
            requestExtraMap.put("pgad_start", mxoVarYpw);
        }
        dgVarYpw.emc(10);
        dgVarYpw.emc("get_ad");
        com.bytedance.sdk.openadsdk.sba.xq.emc(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.rie.8
            @Override // com.bytedance.sdk.openadsdk.sba.dg
            public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                com.bytedance.sdk.openadsdk.sba.ypw.emc emcVarE = f.e("get_ad");
                emcVarE.xq(adSlot.getCodeId());
                emcVarE.dg(com.bytedance.sdk.openadsdk.utils.tp.xq(adSlot.getDurationSlotType()));
                return emcVarE;
            }
        });
        if (com.bytedance.sdk.component.utils.cf.dg()) {
            Thread.currentThread().getName();
        }
        if (zXq) {
            Map<String, Object> map = requestExtraMap;
            try {
                com.bytedance.sdk.component.uym.ypw ypwVarEmc = dgVarYpw.emc();
                com.bytedance.sdk.component.uym.ypw ypwVar = ypwVarEmc == null ? new com.bytedance.sdk.component.uym.ypw(false, 5001, "response is null, content type is not support!!", null, "REQUEST_BODY_NULL", 1L, 1L) : ypwVarEmc;
                if (ypwVar.ycc()) {
                    boolean z7 = z6;
                    try {
                        emc(dgVarYpw, ypwVar, z7, map, mxoVarYpw, adSlot, xqVar, emcVar, sbVar, i);
                    } catch (Throwable th2) {
                        th = th2;
                        z6 = z7;
                        map = map;
                        xqVar = xqVar;
                        emc(dgVarYpw, new IOException(th.getMessage()), new com.bytedance.sdk.component.uym.ypw(false, 5002, "execute method throw exception", null, "REQUEST_BODY_EXCEPTION", 1L, 1L), adSlot, z6, map, emcVar, xqVar);
                        com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().emc(false);
                    }
                } else {
                    emc(dgVarYpw, new IOException(ypwVar.ypw()), ypwVar, adSlot, z6, map, emcVar, xqVar);
                    com.bytedance.sdk.openadsdk.utils.sra.emc(dgVarYpw.dg());
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            final boolean z8 = z6;
            dgVarYpw.emc(new com.bytedance.sdk.component.uym.emc.ypw() { // from class: com.bytedance.sdk.openadsdk.core.rie.9
                @Override // com.bytedance.sdk.component.uym.emc.emc
                public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar2, com.bytedance.sdk.component.uym.ypw ypwVar2) {
                    rie.this.emc(xqVar2, ypwVar2, z8, (Map<String, Object>) requestExtraMap, mxoVarYpw, adSlot, xqVar, emcVar, sbVar, i);
                }

                @Override // com.bytedance.sdk.component.uym.emc.ypw
                public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar2, IOException iOException, com.bytedance.sdk.component.uym.ypw ypwVar2) {
                    rie.this.emc(dgVarYpw, iOException, ypwVar2, adSlot, z8, (Map<String, Object>) requestExtraMap, emcVar, xqVar);
                    if (xqVar2 != null) {
                        com.bytedance.sdk.openadsdk.utils.sra.emc(xqVar2.dg());
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().emc(false);
    }

    private byte[] bw(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream2.write(str.getBytes("utf-8"));
                        try {
                            gZIPOutputStream2.close();
                        } catch (IOException e6) {
                            com.bytedance.sdk.component.utils.ul.xq("NetApiImpl", e6.toString());
                        }
                        byteArray = byteArrayOutputStream.toByteArray();
                    } catch (IOException e7) {
                        e = e7;
                        gZIPOutputStream = gZIPOutputStream2;
                        com.bytedance.sdk.component.utils.ul.xq("NetApiImpl", e.toString());
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException e8) {
                                com.bytedance.sdk.component.utils.ul.xq("NetApiImpl", e8.toString());
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        }
                        return byteArray;
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException e9) {
                                com.bytedance.sdk.component.utils.ul.xq("NetApiImpl", e9.toString());
                            }
                        }
                        if (byteArrayOutputStream == null) {
                            throw th;
                        }
                        byteArrayOutputStream.toByteArray();
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException e10) {
                            com.bytedance.sdk.component.utils.ul.xq("NetApiImpl", e10.toString());
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (IOException e12) {
            e = e12;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException e13) {
            com.bytedance.sdk.component.utils.ul.xq("NetApiImpl", e13.toString());
        }
        return byteArray;
    }

    public static JSONArray xq(String str) throws JSONException {
        try {
            Set<com.bytedance.sdk.openadsdk.core.gbl.emc.emc> setEmc = com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.emc().emc(str);
            if (setEmc != null && setEmc.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.gbl.emc.emc emcVar : setEmc) {
                    if (emcVar != null && !TextUtils.isEmpty(emcVar.bw())) {
                        JSONObject jSONObject = new JSONObject();
                        String[] strArrSplit = emcVar.emc().split("_");
                        if (strArrSplit.length == 2) {
                            jSONObject.put("id", strArrSplit[1]);
                            jSONObject.put("md5", emcVar.ypw());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e6) {
            com.bytedance.sdk.component.utils.ul.emc("NetApiImpl", "getUgenParentTplIds: ", e6);
            return null;
        }
    }

    @DungeonFlag
    private JSONObject emc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.sb sbVar, int i) {
        int i3;
        int i6;
        int i7;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String strBw = (sbVar == null || TextUtils.isEmpty(sbVar.emc)) ? com.bytedance.sdk.openadsdk.utils.tp.bw() : sbVar.emc;
            if (i == 7) {
                if (sbVar != null && (i7 = sbVar.ypw) > 0) {
                    jSONObject2.put("req_type", i7);
                }
            } else if (i == 8) {
                if (sbVar != null && (i6 = sbVar.xq) > 0) {
                    jSONObject2.put("req_type", i6);
                }
            } else if (i == 3 && sbVar != null && (i3 = sbVar.dg) > 0) {
                jSONObject2.put("req_type", i3);
            }
            try {
                String strGbl = aa.dg().gbl();
                String strDr = aa.dg().dr();
                if (strGbl != null && strDr != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("version", strGbl);
                    jSONObject3.put("param", strDr);
                    jSONObject2.put("abtest", jSONObject3);
                }
            } catch (Throwable unused) {
            }
            jSONObject2.put("request_id", strBw);
            com.bytedance.sdk.openadsdk.utils.tp.emc(jSONObject2);
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("js_render_ver", com.bytedance.sdk.openadsdk.core.zz.sup.ypw());
            jSONObject2.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.zz.sup.xq());
            jSONObject2.put("source_type", "app");
            jSONObject2.put("app", ypw());
            jSONObject2.put("device", DeviceUtils.emc(this.emc, true));
            jSONObject2.put("user", emc(adSlot));
            jSONObject2.put("ua", com.bytedance.sdk.openadsdk.utils.tp.dg());
            jSONObject2.put("channel", "main");
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(emc(adSlot, i, sbVar));
            jSONObject2.put("adslots", jSONArray);
            emc(jSONObject2, sbVar);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject2.put("ts", jCurrentTimeMillis);
            String strConcat = "";
            if (adSlot.getCodeId() != null && strBw != null) {
                strConcat = String.valueOf(jCurrentTimeMillis).concat(adSlot.getCodeId()).concat(strBw);
            }
            jSONObject2.put("req_sign", com.bytedance.sdk.component.utils.bw.emc(strConcat));
            if (com.bytedance.sdk.openadsdk.core.ru.xq.bw() != 0) {
                jSONObject2.put("pglx", String.valueOf(com.bytedance.sdk.openadsdk.core.ru.xq.bw()));
            }
            jSONObject2.put("adx_id", zz.ypw().hxp());
            com.bytedance.sdk.openadsdk.ycc.ypw.emc().emc(jSONObject2);
            jSONObject = emc(PangleEncryptConstant.CryptDataScene.GET_ADS, jSONObject2);
            if (jSONObject != null) {
                jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
                jSONObject.put("oversea_version_type", 1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("body data exception", th);
        }
        return jSONObject;
    }

    private Map<String, String> dg(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/json; charset=utf-8");
        if (xq(jSONObject)) {
            map.put("Content-Encoding", "union_sdk_encode");
        }
        return map;
    }

    private void emc(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.sb sbVar) throws JSONException {
        JSONArray jSONArray;
        if (sbVar == null || (jSONArray = sbVar.bw) == null) {
            return;
        }
        try {
            jSONObject.put("source_temai_product_ids", jSONArray);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sra
    public void emc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.sb sbVar, int i, ul ulVar) {
        if (!sbVar.ycc && TextUtils.isEmpty(adSlot.getBidAdm())) {
            if (!emc(sbVar) && ulVar != null) {
                String strEmc = ulVar.emc();
                if (!TextUtils.isEmpty(strEmc)) {
                    sbVar.sup = strEmc;
                    sbVar.sz = ulVar;
                }
            }
            emc(adSlot, sbVar, i, (sra.emc) ulVar);
            return;
        }
        emc(adSlot, sbVar, i, (sra.emc) ulVar);
    }

    private boolean emc(com.bytedance.sdk.openadsdk.core.model.sb sbVar) {
        if (sbVar != null) {
            return sbVar.ypw == 2 || sbVar.xq == 2 || sbVar.dg == 2;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sra
    public void emc(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.sb sbVar, final int i, sra.emc emcVar) {
        if (sbVar != null && (sbVar.ypw == 2 || sbVar.xq == 2 || sbVar.dg == 2)) {
            adSlot.setPreload(true);
        }
        final com.bytedance.sdk.openadsdk.core.ypw.emc emcVar2 = new com.bytedance.sdk.openadsdk.core.ypw.emc(emcVar, adSlot, (adSlot.isPreload() || sbVar == null || sbVar.ycc) ? false : true);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            qh.ypw().post(new com.bytedance.sdk.component.msw.msw("getAd") { // from class: com.bytedance.sdk.openadsdk.core.rie.1
                @Override // java.lang.Runnable
                public void run() {
                    rie.this.ypw(adSlot, sbVar, i, emcVar2);
                }
            });
        } else {
            ypw(adSlot, sbVar, i, emcVar2);
        }
        if (com.bytedance.sdk.openadsdk.sra.emc.xq()) {
            qh.uym();
        }
    }

    private void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        com.bytedance.sdk.openadsdk.core.model.rie rieVarYcc;
        if (emcVar == null || (rieVarYcc = emcVar.ycc()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.settings.gbl.dr(rieVarYcc.gc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(com.bytedance.sdk.component.uym.ypw.dg dgVar, IOException iOException, com.bytedance.sdk.component.uym.ypw ypwVar, final AdSlot adSlot, boolean z6, Map<String, Object> map, sra.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
        String message;
        int iEmc;
        com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.rie.10
            @Override // com.bytedance.sdk.openadsdk.sba.dg
            public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                com.bytedance.sdk.openadsdk.sba.ypw.emc emcVarE = f.e("get_ad");
                emcVarE.xq(adSlot.getCodeId());
                emcVarE.dg(com.bytedance.sdk.openadsdk.utils.tp.xq(adSlot.getDurationSlotType()));
                emcVarE.emc(BuildConfig.VERSION_NAME);
                return emcVarE;
            }
        });
        if (ypwVar != null) {
            message = ypwVar.ypw();
        } else if (iOException != null) {
            message = iOException.getMessage();
        } else {
            message = "";
        }
        com.bytedance.sdk.openadsdk.utils.mxo mxoVarYpw = com.bytedance.sdk.openadsdk.utils.mxo.ypw();
        if (z6) {
            map.put("pgad_end", Long.valueOf(mxoVarYpw.emc));
        }
        if (aa.dg().ndl() && lt.emc().dg() == 1) {
            com.bytedance.sdk.openadsdk.utils.tp.emc("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, this.emc);
        }
        if (ypwVar != null) {
            iEmc = ypwVar.emc();
        } else {
            iEmc = (iOException == null || !(iOException instanceof SocketTimeoutException)) ? 601 : 602;
        }
        if (emcVar != null) {
            emcVar.emc(iEmc, message);
        }
        xqVar.emc(iEmc);
        xqVar.xq(10);
        xqVar.ypw(message);
        com.bytedance.sdk.openadsdk.core.model.xq.emc(xqVar);
        com.bytedance.sdk.openadsdk.vk.emc.bw.emc("get_ad", dgVar.dg(), iEmc, message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a3 A[Catch: all -> 0x0058, TryCatch #1 {all -> 0x0058, blocks: (B:9:0x0027, B:11:0x0042, B:13:0x004c, B:16:0x005b, B:18:0x0061, B:20:0x006a, B:22:0x007e, B:24:0x008b, B:26:0x0092, B:28:0x00a3, B:27:0x009c, B:30:0x00ac, B:32:0x00b0, B:34:0x00b9, B:37:0x00c1, B:39:0x00cc, B:41:0x00d0, B:42:0x00d5, B:58:0x011c, B:60:0x0124, B:62:0x012a, B:64:0x0137, B:66:0x0148, B:65:0x0140, B:73:0x018a, B:75:0x01a3, B:76:0x01aa, B:78:0x01b2, B:81:0x01c0), top: B:90:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(com.bytedance.sdk.component.uym.ypw.xq r20, com.bytedance.sdk.component.uym.ypw r21, boolean r22, java.util.Map<java.lang.String, java.lang.Object> r23, com.bytedance.sdk.openadsdk.utils.mxo r24, final com.bytedance.sdk.openadsdk.AdSlot r25, com.bytedance.sdk.openadsdk.core.model.xq r26, com.bytedance.sdk.openadsdk.core.sra.emc r27, com.bytedance.sdk.openadsdk.core.model.sb r28, int r29) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.rie.emc(com.bytedance.sdk.component.uym.ypw.xq, com.bytedance.sdk.component.uym.ypw, boolean, java.util.Map, com.bytedance.sdk.openadsdk.utils.mxo, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.model.xq, com.bytedance.sdk.openadsdk.core.sra$emc, com.bytedance.sdk.openadsdk.core.model.sb, int):void");
    }

    private void ypw(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        List<com.bytedance.sdk.openadsdk.core.model.rie> listDg = emcVar.dg();
        if (listDg == null || listDg.size() == 0) {
            return;
        }
        for (int i = 0; i < listDg.size(); i++) {
            com.bytedance.sdk.openadsdk.core.model.rie rieVar = listDg.get(i);
            if (rieVar != null && rieVar.ffd() == null) {
                emc("", 0, 0, rieVar.ya(), rieVar);
                emc("", 0, 0, rieVar.tc(), rieVar);
                List<com.bytedance.sdk.openadsdk.core.model.sba> listRr = rieVar.rr();
                if (listRr != null && listRr.size() > 0) {
                    for (int i3 = 0; i3 < listRr.size(); i3++) {
                        emc(rieVar, listRr.get(i3));
                    }
                }
                if (rieVar.iat() != null) {
                    emc(rieVar.iat().f6585f, rieVar.iat().f6581b, rieVar.iat().f6580a, (com.bytedance.sdk.openadsdk.core.model.sba) null, rieVar);
                }
            }
        }
    }

    @DungeonFlag
    private JSONObject ypw(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("timestamp", System.currentTimeMillis());
            jSONObject3.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            JSONObject jSONObject4 = new JSONObject(str);
            jSONObject4.put("gaid", com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().ypw());
            jSONObject3.put("extra", jSONObject4.toString());
            jSONObject3.put("filter_words", emc(list));
            jSONObject3.put("dislike_source", str3);
            if (jSONObject != null && !TextUtils.isEmpty(str2)) {
                jSONObject3.put("creative_info", com.bytedance.sdk.component.utils.emc.emc(jSONObject).toString());
                jSONObject3.put("feedback_type", 1);
                jSONObject3.put("user_description", str2);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put("actions", jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009e A[PHI: r2
  0x009e: PHI (r2v15 int) = (r2v14 int), (r2v18 int) binds: [B:12:0x0091, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject ypw() throws org.json.JSONException {
        /*
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "appid"
            com.bytedance.sdk.openadsdk.core.zz r2 = com.bytedance.sdk.openadsdk.core.zz.ypw()     // Catch: org.json.JSONException -> Laf
            java.lang.String r2 = r2.dg()     // Catch: org.json.JSONException -> Laf
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Laf
            java.lang.String r1 = "name"
            com.bytedance.sdk.openadsdk.core.zz r2 = com.bytedance.sdk.openadsdk.core.zz.ypw()     // Catch: org.json.JSONException -> Laf
            java.lang.String r2 = r2.msw()     // Catch: org.json.JSONException -> Laf
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Laf
            r8.ycc(r0)     // Catch: org.json.JSONException -> Laf
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.aa.emc()     // Catch: org.json.JSONException -> Laf
            java.lang.String r2 = ""
            if (r1 == 0) goto L47
            java.lang.String r2 = r1.getPackageResourcePath()     // Catch: java.lang.Throwable -> L2f
            goto L47
        L2f:
            r3 = move-exception
            java.lang.String r4 = "NetApiImpl"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Laf
            java.lang.String r6 = "failed to get the application installation package path. error: "
            r5.<init>(r6)     // Catch: org.json.JSONException -> Laf
            java.lang.String r3 = r3.getMessage()     // Catch: org.json.JSONException -> Laf
            r5.append(r3)     // Catch: org.json.JSONException -> Laf
            java.lang.String r3 = r5.toString()     // Catch: org.json.JSONException -> Laf
            com.bytedance.sdk.component.utils.ul.xq(r4, r3)     // Catch: org.json.JSONException -> Laf
        L47:
            java.lang.String r3 = "package_install_path"
            r0.put(r3, r2)     // Catch: org.json.JSONException -> Laf
            java.lang.String r2 = "is_paid_app"
            r3 = 0
            r0.put(r2, r3)     // Catch: org.json.JSONException -> Laf
            java.lang.String r2 = "apk_sign"
            java.lang.String r4 = com.bytedance.sdk.openadsdk.common.xq.uym()     // Catch: org.json.JSONException -> Laf
            r0.put(r2, r4)     // Catch: org.json.JSONException -> Laf
            java.lang.String r2 = "app_running_time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> Laf
            long r6 = com.bytedance.sdk.openadsdk.core.qh.emc()     // Catch: org.json.JSONException -> Laf
            long r4 = r4 - r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            r0.put(r2, r4)     // Catch: org.json.JSONException -> Laf
            java.lang.String r2 = "fmwname"
            java.lang.String r4 = com.bytedance.sdk.openadsdk.utils.DeviceUtils.ru()     // Catch: org.json.JSONException -> Laf
            r0.put(r2, r4)     // Catch: org.json.JSONException -> Laf
            java.lang.String r2 = "is_init"
            boolean r4 = com.bytedance.sdk.openadsdk.core.qh.bw()     // Catch: org.json.JSONException -> Laf
            r0.put(r2, r4)     // Catch: org.json.JSONException -> Laf
            if (r1 == 0) goto Laf
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: org.json.JSONException -> Laf
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch: org.json.JSONException -> Laf
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch: org.json.JSONException -> Laf
            int r1 = r1.getRotation()     // Catch: org.json.JSONException -> Laf
            r2 = 1
            if (r1 == 0) goto L9e
            r4 = 3
            if (r1 == r2) goto La0
            r2 = 2
            if (r1 == r2) goto L9e
            if (r1 == r4) goto L9c
            goto La1
        L9c:
            r3 = 4
            goto La1
        L9e:
            r3 = r2
            goto La1
        La0:
            r3 = r4
        La1:
            java.lang.String r1 = "orientation_support"
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> Laf
            r2.<init>()     // Catch: org.json.JSONException -> Laf
            org.json.JSONArray r2 = r2.put(r3)     // Catch: org.json.JSONException -> Laf
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Laf
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.rie.ypw():org.json.JSONObject");
    }

    private static String ypw(AdSlot adSlot) {
        String strSz = zz.ypw().sz();
        if (adSlot == null) {
            if (TextUtils.isEmpty(strSz)) {
                return "";
            }
        } else {
            String userData = adSlot.getUserData();
            if (TextUtils.isEmpty(strSz)) {
                return userData;
            }
            if (!TextUtils.isEmpty(userData)) {
                HashSet hashSet = new HashSet();
                try {
                    JSONArray jSONArray = new JSONArray(userData);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject != null) {
                            hashSet.add(jSONObject.optString("name", null));
                        }
                    }
                    try {
                        JSONArray jSONArray2 = new JSONArray(strSz);
                        int length2 = jSONArray2.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i3);
                            if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString("name", null))) {
                                jSONArray.put(jSONObject2);
                            }
                        }
                        return jSONArray.toString();
                    } catch (Throwable unused) {
                        return userData;
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        return strSz;
    }

    private boolean emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, sra.emc emcVar2) {
        if (emcVar == null) {
            emcVar2.emc(40053, msw.emc(40053));
            return true;
        }
        List<com.bytedance.sdk.openadsdk.core.model.rie> listDg = emcVar.dg();
        if (listDg.isEmpty()) {
            return false;
        }
        for (final com.bytedance.sdk.openadsdk.core.model.rie rieVar : listDg) {
            if (TextUtils.isEmpty(rieVar.pvi().ypw()) || TextUtils.isEmpty(rieVar.pvi().xq())) {
                emcVar2.emc(40053, msw.emc(40053));
                com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), rieVar, com.bytedance.sdk.openadsdk.utils.tp.emc(rieVar), "material_error", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.core.rie.13
                    @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                    public JSONObject emc() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("ad_label", rieVar.pvi().ycc());
                            return jSONObject;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                });
                return true;
            }
        }
        return false;
    }

    private void emc(String str, int i, int i3, com.bytedance.sdk.openadsdk.core.model.sba sbaVar, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.ru.dg.emc(str).emc(i).ypw(i3).bw(vw.bw(aa.emc())).dg(vw.xq(aa.emc())).xq(1).emc(new com.bytedance.sdk.openadsdk.ru.ypw(rieVar, str, null), 4);
        } else {
            if (sbaVar == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.ru.dg.emc(sbaVar).xq(1).emc(new com.bytedance.sdk.openadsdk.ru.ypw(rieVar, sbaVar.emc(), null), 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.openadsdk.core.sra
    public com.bytedance.sdk.openadsdk.dg.bw ypw(JSONObject jSONObject) {
        int i;
        boolean z6;
        boolean z7;
        boolean z8;
        String strYpw = "error unknown";
        System.currentTimeMillis();
        if (!com.bytedance.sdk.openadsdk.core.settings.uym.emc() || !aa.dg().hj() || jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        com.bytedance.sdk.component.uym.ypw.dg dgVarYpw = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().ypw();
        int iEmc = 0;
        try {
            JSONObject jSONObjectEmc = emc(PangleEncryptConstant.CryptDataScene.STATS_LOG, jSONObject);
            dgVarYpw.emc(jSONObjectEmc.toString(), aa.dg().sba());
            dgVarYpw.ypw(com.bytedance.sdk.openadsdk.utils.tp.dg("/api/ad/union/sdk/stats/batch/"));
            emc(dgVarYpw, jSONObjectEmc);
            dgVarYpw.ypw("User-Agent", com.bytedance.sdk.openadsdk.utils.tp.dg());
            if (com.bytedance.sdk.openadsdk.core.settings.gbl.xq().se()) {
                dgVarYpw.ypw("_disable_retry", "1");
            }
            com.bytedance.sdk.component.uym.ypw ypwVarEmc = dgVarYpw.emc();
            try {
            } catch (Throwable unused) {
                i = 0;
                z6 = false;
            }
            if (ypwVarEmc == null) {
                return new com.bytedance.sdk.openadsdk.dg.bw(false, 0, "error unknown", false);
            }
            if (!ypwVarEmc.ycc() || TextUtils.isEmpty(ypwVarEmc.dg())) {
                z8 = false;
                z6 = false;
            } else {
                JSONObject jSONObject2 = new JSONObject(ypwVarEmc.dg());
                int iOptInt = jSONObject2.optInt("code", -1);
                strYpw = jSONObject2.optString("data", "");
                z6 = true;
                boolean z9 = iOptInt == 20000;
                z8 = z9;
                if (iOptInt != 60005) {
                    z6 = false;
                    z8 = z9;
                }
            }
            try {
                iEmc = ypwVarEmc.emc();
                z7 = z8;
                if (!ypwVarEmc.ycc()) {
                    strYpw = ypwVarEmc.ypw();
                    com.bytedance.sdk.openadsdk.utils.sra.emc(dgVarYpw.dg());
                    z7 = z8;
                }
            } catch (Throwable unused2) {
                i = iEmc;
                iEmc = z8 ? 1 : 0;
                z7 = iEmc;
                iEmc = i;
                return new com.bytedance.sdk.openadsdk.dg.bw(z7, iEmc, strYpw, z6);
            }
            return new com.bytedance.sdk.openadsdk.dg.bw(z7, iEmc, strYpw, z6);
        } catch (Throwable unused3) {
            return new com.bytedance.sdk.openadsdk.dg.bw(false, 0, "error unknown", false);
        }
    }

    private void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, com.bytedance.sdk.openadsdk.core.model.sba sbaVar) {
        if (sbaVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ru.dg.emc(sbaVar).xq(1).emc(new com.bytedance.sdk.openadsdk.ru.ypw(rieVar, sbaVar.emc(), new com.bytedance.sdk.component.bw.vk() { // from class: com.bytedance.sdk.openadsdk.core.rie.14
            @Override // com.bytedance.sdk.component.bw.vk
            public void emc(int i, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.bw.vk
            public void emc(com.bytedance.sdk.component.bw.gbl gblVar) {
            }
        }), 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void emc(com.bytedance.sdk.component.ypw.emc.ru r13, com.bytedance.sdk.openadsdk.core.model.sb r14, com.bytedance.sdk.openadsdk.utils.mxo r15, com.bytedance.sdk.openadsdk.utils.mxo r16, int r17, com.bytedance.sdk.openadsdk.utils.mxo r18, com.bytedance.sdk.openadsdk.core.model.rie r19, java.lang.String r20) {
        /*
            r12 = this;
            com.bytedance.sdk.openadsdk.core.settings.gbl r0 = com.bytedance.sdk.openadsdk.core.aa.dg()
            boolean r0 = r0.cn()
            if (r0 != 0) goto Lb
            goto L44
        Lb:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            r2 = 0
            if (r14 == 0) goto L24
            com.bytedance.sdk.openadsdk.utils.mxo r0 = r14.ru     // Catch: java.lang.Exception -> L44
            long r4 = r0.emc     // Catch: java.lang.Exception -> L44
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L24
            r5 = r18
            long r2 = r5.emc(r0)     // Catch: java.lang.Exception -> L44
        L22:
            r10 = r2
            goto L27
        L24:
            r5 = r18
            goto L22
        L27:
            r9 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r6 = r19
            r7 = r20
            emc(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L44
            java.lang.String r0 = "load_ad_time"
            r13 = r19
            r14 = r20
            r15 = r0
            r18 = r8
            r16 = r10
            com.bytedance.sdk.openadsdk.dg.xq.emc(r13, r14, r15, r16, r18)     // Catch: java.lang.Exception -> L44
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.rie.emc(com.bytedance.sdk.component.ypw.emc.ru, com.bytedance.sdk.openadsdk.core.model.sb, com.bytedance.sdk.openadsdk.utils.mxo, com.bytedance.sdk.openadsdk.utils.mxo, int, com.bytedance.sdk.openadsdk.utils.mxo, com.bytedance.sdk.openadsdk.core.model.rie, java.lang.String):void");
    }

    private static void emc(com.bytedance.sdk.component.ypw.emc.ru ruVar, com.bytedance.sdk.openadsdk.core.model.sb sbVar, com.bytedance.sdk.openadsdk.utils.mxo mxoVar, com.bytedance.sdk.openadsdk.utils.mxo mxoVar2, int i, com.bytedance.sdk.openadsdk.utils.mxo mxoVar3, com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str, JSONObject jSONObject, boolean z6) throws JSONException {
        if (sbVar != null) {
            com.bytedance.sdk.openadsdk.utils.mxo mxoVar4 = sbVar.ru;
            if (mxoVar4.emc > 0) {
                jSONObject.put("client_start_time", mxoVar.emc(mxoVar4));
            }
        }
        jSONObject.put("network_time", mxoVar2.emc(mxoVar));
        jSONObject.put("sever_time", i);
        jSONObject.put("client_end_time", mxoVar3.emc(mxoVar2));
        if (str.equals("open_ad")) {
            jSONObject.put("is_icon_only", rieVar.xmt() ? 1 : 0);
        }
        if (rieVar != null) {
            jSONObject.put("render_control_type", rieVar.yid());
        }
        jSONObject.put("webview_cache_size", com.bytedance.sdk.component.adexpress.bw.bw.emc().xq());
        jSONObject.put("sync_barrier_open", z6 ? 1 : 0);
        long j6 = ruVar.ypw;
        if (j6 > 0) {
            jSONObject.put("enqueue_2_run_ts", ruVar.xq - j6);
            jSONObject.put("run_2_connect_end_ts", ruVar.bw - ruVar.ypw);
            jSONObject.put("connect_end_2_response_end_ts", ruVar.ycc - ruVar.bw);
            jSONObject.put("response_end_2_callback_end_ts", SystemClock.elapsedRealtime() - ruVar.ycc);
        }
    }

    public static JSONArray ypw(String str) throws JSONException {
        try {
            Set<String> setYpw = com.bytedance.sdk.component.adexpress.emc.ypw.ypw.ypw(str);
            if (setYpw != null && setYpw.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = setYpw.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.emc.xq.ypw ypwVarEmc = com.bytedance.sdk.component.adexpress.emc.ypw.ypw.emc(it.next());
                    if (ypwVarEmc != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", ypwVarEmc.ypw());
                        jSONObject.put("md5", ypwVarEmc.xq());
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e6) {
            com.bytedance.sdk.component.utils.ul.emc("NetApiImpl", "getParentTplIds: ", e6);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sra
    @DungeonFlag
    public com.bytedance.sdk.openadsdk.dg.bw emc(JSONObject jSONObject, String str, boolean z6) {
        Object obj;
        try {
            System.currentTimeMillis();
            byte[] bArr = null;
            if (!com.bytedance.sdk.openadsdk.core.settings.uym.emc()) {
                return null;
            }
            com.bytedance.sdk.component.uym.ypw.dg dgVarYpw = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().ypw();
            dgVarYpw.ypw(str);
            if (com.bytedance.sdk.openadsdk.core.settings.gbl.xq().vum()) {
                dgVarYpw.ypw("_disable_retry", "1");
            }
            boolean z7 = true;
            if (z6) {
                Pair<Integer, byte[]> pairEncryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(bw(jSONObject.toString()));
                if (pairEncryptType4WithoutBase64 != null && (obj = pairEncryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                    bArr = (byte[]) obj;
                    ee.ypw(true);
                } else {
                    int iIntValue = pairEncryptType4WithoutBase64 != null ? ((Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                    ee.ypw(false);
                    ee.emc(1, PangleEncryptConstant.CryptDataScene.APP_LOG, iIntValue);
                }
                if (bArr != null) {
                    dgVarYpw.ypw("Content-Encoding", "union_sdk_encode");
                    dgVarYpw.ypw("x-pgli18n", "4");
                    dgVarYpw.emc("application/octet-stream;tt-data=a", bArr);
                }
            }
            if (bArr == null) {
                try {
                    JSONObject jSONObjectEmc = com.bytedance.sdk.component.utils.emc.emc(jSONObject);
                    if (!xq(jSONObjectEmc)) {
                        jSONObjectEmc = jSONObject;
                    }
                    emc(dg(jSONObjectEmc), dgVarYpw);
                    dgVarYpw.emc(jSONObjectEmc.toString(), aa.dg().sba());
                } catch (OutOfMemoryError e6) {
                    com.bytedance.sdk.component.utils.ul.xq("NetApiImpl", e6.toString());
                    return new com.bytedance.sdk.openadsdk.dg.bw(false, -2, "encrypt_error", false);
                }
            }
            com.bytedance.sdk.component.uym.ypw ypwVarEmc = dgVarYpw.emc();
            boolean zBw = (ypwVarEmc == null || !ypwVarEmc.ycc() || TextUtils.isEmpty(ypwVarEmc.dg())) ? false : bw(new JSONObject(ypwVarEmc.dg()));
            String strYpw = "error unknown";
            int iEmc = ypwVarEmc != null ? ypwVarEmc.emc() : 0;
            if (!zBw && iEmc == 200) {
                strYpw = "server say not success";
            } else {
                if (ypwVarEmc != null && ypwVarEmc.ypw() != null) {
                    strYpw = ypwVarEmc.ypw();
                }
                z7 = false;
            }
            if (ypwVarEmc == null) {
                com.bytedance.sdk.openadsdk.vk.emc.bw.emc("applog", str, -1, "response is null");
            } else if (!ypwVarEmc.ycc()) {
                com.bytedance.sdk.openadsdk.vk.emc.bw.emc("applog", str, iEmc, ypwVarEmc.ypw());
            }
            emc(jSONObject, z6);
            return new com.bytedance.sdk.openadsdk.dg.bw(zBw, iEmc, strYpw, z7);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.emc("NetApiImpl", "uploadEvent error", th);
            return new com.bytedance.sdk.openadsdk.dg.bw(false, 509, "service_busy", false);
        }
    }

    private void emc(Map<String, String> map, com.bytedance.sdk.component.uym.ypw.dg dgVar) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    dgVar.ypw(entry.getKey(), entry.getValue());
                } catch (Exception e6) {
                    com.bytedance.sdk.component.utils.ul.xq("NetApiImpl", "ADD header exceptopn", e6.getMessage());
                }
            }
        }
        try {
            dgVar.ypw("User-Agent", com.bytedance.sdk.openadsdk.utils.tp.dg());
        } catch (Exception e7) {
            com.bytedance.sdk.component.utils.ul.xq("NetApiImpl", "ADD header exceptopn", e7.getMessage());
        }
    }

    private void emc(JSONObject jSONObject, boolean z6) throws JSONException {
        Object obj;
        if (zz.ypw().sba()) {
            try {
                jSONObject.getJSONObject("header").put("aid", "4562");
            } catch (Exception e6) {
                com.bytedance.sdk.component.utils.ul.xq("NetApiImpl", "reportETEvent error", e6.getMessage());
            }
            com.bytedance.sdk.component.uym.ypw.dg dgVarYpw = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().ypw();
            dgVarYpw.ypw(com.bytedance.sdk.openadsdk.utils.tp.ylm());
            byte[] bArr = null;
            if (z6) {
                Pair<Integer, byte[]> pairEncryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(bw(jSONObject.toString()));
                if (pairEncryptType4WithoutBase64 != null && (obj = pairEncryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                    bArr = (byte[]) obj;
                    ee.ypw(true);
                } else {
                    int iIntValue = pairEncryptType4WithoutBase64 != null ? ((Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                    ee.ypw(false);
                    ee.emc(1, PangleEncryptConstant.CryptDataScene.APP_LOG, iIntValue);
                }
                if (bArr != null) {
                    dgVarYpw.ypw("Content-Encoding", "union_sdk_encode");
                    dgVarYpw.ypw("x-pgli18n", "4");
                    dgVarYpw.emc("application/octet-stream;tt-data=a", bArr);
                }
            }
            if (bArr == null) {
                JSONObject jSONObjectEmc = com.bytedance.sdk.component.utils.emc.emc(jSONObject);
                if (xq(jSONObjectEmc)) {
                    jSONObject = jSONObjectEmc;
                }
                emc(dg(jSONObject), dgVarYpw);
                dgVarYpw.emc(jSONObject.toString(), aa.dg().sba());
            }
            dgVarYpw.emc(7);
            dgVarYpw.emc("et_applog");
            dgVarYpw.emc(new com.bytedance.sdk.component.uym.emc.emc() { // from class: com.bytedance.sdk.openadsdk.core.rie.15
                @Override // com.bytedance.sdk.component.uym.emc.emc
                public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, com.bytedance.sdk.component.uym.ypw ypwVar) {
                    if (ypwVar == null || !ypwVar.ycc()) {
                        return;
                    }
                    ypwVar.dg();
                }

                @Override // com.bytedance.sdk.component.uym.emc.emc
                public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, IOException iOException) {
                    iOException.getMessage();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sra
    public void emc(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        JSONObject jSONObjectYpw;
        if (com.bytedance.sdk.openadsdk.core.settings.uym.emc() && (jSONObjectYpw = ypw(str, list, jSONObject, str2, str3)) != null) {
            com.bytedance.sdk.component.uym.ypw.dg dgVarYpw = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().ypw();
            final String strDg = com.bytedance.sdk.openadsdk.utils.tp.dg("/api/ad/union/dislike_event/");
            JSONObject jSONObjectEmc = emc(PangleEncryptConstant.CryptDataScene.DISLIKE, jSONObjectYpw);
            String string = jSONObjectEmc != null ? jSONObjectEmc.toString() : null;
            emc(dgVarYpw, jSONObjectEmc);
            dgVarYpw.ypw(strDg);
            dgVarYpw.dg(string);
            dgVarYpw.emc(7);
            dgVarYpw.emc("dislike");
            com.bytedance.sdk.openadsdk.sba.xq.emc(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.rie.2
                @Override // com.bytedance.sdk.openadsdk.sba.dg
                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                    return f.e("dislike");
                }
            });
            dgVarYpw.emc(new com.bytedance.sdk.component.uym.emc.emc() { // from class: com.bytedance.sdk.openadsdk.core.rie.3
                @Override // com.bytedance.sdk.component.uym.emc.emc
                public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, com.bytedance.sdk.component.uym.ypw ypwVar) {
                    if (ypwVar == null) {
                        com.bytedance.sdk.openadsdk.vk.emc.bw.emc("dislike", strDg, -1, "response is null");
                        com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.rie.3.3
                            @Override // com.bytedance.sdk.openadsdk.sba.dg
                            public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                return f.e("dislike");
                            }
                        });
                    } else if (ypwVar.ycc()) {
                        com.bytedance.sdk.openadsdk.sba.xq.ypw(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.rie.3.1
                            @Override // com.bytedance.sdk.openadsdk.sba.dg
                            public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                return f.e("dislike");
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.rie.3.2
                            @Override // com.bytedance.sdk.openadsdk.sba.dg
                            public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                return f.e("dislike");
                            }
                        });
                        com.bytedance.sdk.openadsdk.vk.emc.bw.emc("dislike", strDg, ypwVar.emc(), ypwVar.ypw());
                    }
                }

                @Override // com.bytedance.sdk.component.uym.emc.emc
                public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, IOException iOException) {
                    com.bytedance.sdk.openadsdk.vk.emc.bw.emc("dislike", strDg, -1, iOException != null ? iOException.getMessage() : "null");
                    if (xqVar != null) {
                        com.bytedance.sdk.openadsdk.utils.sra.emc(xqVar.dg());
                    }
                    com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.rie.3.4
                        @Override // com.bytedance.sdk.openadsdk.sba.dg
                        public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                            return f.e("dislike");
                        }
                    });
                }
            });
            try {
                String strOptString = new JSONObject(str).optString("cid", "");
                if (TextUtils.isEmpty(strOptString)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.ycc.ypw.emc().emc("dislike", strOptString, (String) null, (String) null);
            } catch (JSONException e6) {
                com.bytedance.sdk.component.utils.ul.xq(e6.getMessage(), new Object[0]);
            }
        }
    }

    public static JSONObject emc(PangleEncryptConstant.CryptDataScene cryptDataScene, JSONObject jSONObject) {
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new hxp(cryptDataScene));
        ee.emc(jSONObjectEncryptType4);
        return jSONObjectEncryptType4;
    }

    private JSONArray emc(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getId());
        }
        return jSONArray;
    }

    private void emc(sra.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
        emcVar.emc(-1, msw.emc(-1));
        xqVar.emc(-1);
        com.bytedance.sdk.openadsdk.core.model.xq.emc(xqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(sra.ypw ypwVar) {
        ypwVar.emc(-1, msw.emc(-1));
    }

    public static JSONObject emc(AdSlot adSlot) throws JSONException {
        sb sbVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("personalized_ad", aa.dg().but());
            jSONObject.put("lmt", DeviceUtils.xq());
            jSONObject.put("gdpr", zz.ypw().ru());
            jSONObject.put("pa_consent", zz.ypw().gbl());
            jSONObject.put("is_gdpr_user", aa.dg().wa());
            if (adSlot != null && sb.emc.containsKey(Integer.valueOf(adSlot.getCodeId())) && (sbVar = sb.emc.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", sbVar.ypw());
                jSONObject.put("lastbundle", sbVar.xq());
                jSONObject.put("lastclick", sbVar.dg());
                jSONObject.put("lastskip", sbVar.bw());
            }
            emc(jSONObject, "data", ypw(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static void emc(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    private JSONObject emc(AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.core.model.sb sbVar) throws JSONException {
        Object obj;
        Object obj2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", adSlot.getCodeId());
            jSONObject.put("adtype", i);
            if (!TextUtils.isEmpty(adSlot.getAdId()) || !TextUtils.isEmpty(adSlot.getCreativeId()) || !TextUtils.isEmpty(adSlot.getExt())) {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(adSlot.getAdId())) {
                    jSONObject2.put("ad_id", adSlot.getAdId());
                }
                if (!TextUtils.isEmpty(adSlot.getCreativeId())) {
                    jSONObject2.put("creative_id", adSlot.getCreativeId());
                }
                if (adSlot.getExt() != null) {
                    jSONObject2.put("ext", adSlot.getExt());
                }
                jSONObject.put("preview_ads", jSONObject2);
            }
            if (sbVar != null) {
                jSONObject.put("render_method", sbVar.zz);
                int i3 = sbVar.zz;
                if (i3 == 1) {
                    emc(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (i3 == 2) {
                    emc(jSONObject, "accepted_size", adSlot.getExpressViewAcceptedWidth(), adSlot.getExpressViewAcceptedHeight());
                }
            } else {
                jSONObject.put("render_method", 1);
                emc(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject.put("ptpl_ids", ypw(adSlot.getCodeId()));
            jSONObject.put("ugen_ptpl_ids", xq(adSlot.getCodeId()));
            jSONObject.put("ptpl_ids_v3", xq(adSlot.getCodeId() + "_v3"));
            jSONObject.put("pos", AdSlot.getPosition(i));
            jSONObject.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (i == 1 || i == 5) {
                jSONObject.put("is_origin_ad", true);
            }
            if (sbVar != null && (obj2 = sbVar.uym) != null) {
                jSONObject.put("session_params", obj2);
            }
            if (sbVar != null && (obj = sbVar.msw) != null) {
                jSONObject.put("common_params", obj);
            }
            int adCount = adSlot.getAdCount();
            if (adCount <= 0) {
                adCount = 1;
            }
            if (adCount > 3) {
                adCount = 3;
            }
            if (i == 7 || i == 8) {
                adCount = 1;
            }
            if (sbVar != null && sbVar.bw != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject.put("ad_count", adCount);
            if (i == 1) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("is_rotate_banner", adSlot.getIsRotateBanner());
                jSONObject3.put("rotate_time", adSlot.getRotateTime());
                jSONObject3.put("rotate_order", adSlot.getRotateOrder());
                jSONObject3.put("type", adSlot.getBannerType());
                jSONObject.put("banner", jSONObject3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void emc(JSONObject jSONObject, String str, int i, int i3) throws JSONException {
        if (i <= 0 || i3 <= 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", i);
            jSONObject2.put("height", i3);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    private void emc(JSONObject jSONObject, String str, float f2, float f5) throws JSONException {
        if (f2 < 0.0f || f5 < 0.0f) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", (int) f2);
            jSONObject2.put("height", (int) f5);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sra
    public void emc(JSONObject jSONObject, final sra.ypw ypwVar) {
        if (!com.bytedance.sdk.openadsdk.core.settings.uym.emc()) {
            if (ypwVar != null) {
                ypwVar.emc(TTAdConstant.STYLE_SIZE_RADIO_1_1, "Ad request is temporarily paused, Please contact your AM");
            }
        } else {
            if (jSONObject == null || ypwVar == null) {
                return;
            }
            JSONObject jSONObjectEmc = emc(PangleEncryptConstant.CryptDataScene.REWARD_VERIFY, jSONObject);
            com.bytedance.sdk.component.uym.ypw.dg dgVarYpw = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().ypw();
            try {
                dgVarYpw.ypw(com.bytedance.sdk.openadsdk.zz.dg.emc(dgVarYpw, com.bytedance.sdk.openadsdk.utils.tp.dg("/api/ad/union/sdk/reward_video/reward/")));
            } catch (Exception e6) {
                com.bytedance.sdk.component.utils.ul.xq("NetApiImpl", e6.getMessage());
            }
            emc(dgVarYpw, jSONObjectEmc);
            dgVarYpw.dg(jSONObjectEmc != null ? jSONObjectEmc.toString() : "");
            dgVarYpw.emc(10);
            dgVarYpw.emc("reward");
            com.bytedance.sdk.openadsdk.sba.xq.emc(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.rie.4
                @Override // com.bytedance.sdk.openadsdk.sba.dg
                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                    return f.e("reward");
                }
            });
            dgVarYpw.emc(new com.bytedance.sdk.component.uym.emc.emc() { // from class: com.bytedance.sdk.openadsdk.core.rie.5
                @Override // com.bytedance.sdk.component.uym.emc.emc
                public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, com.bytedance.sdk.component.uym.ypw ypwVar2) {
                    ypw ypwVarEmc;
                    int i;
                    if (ypwVar2 == null) {
                        com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.rie.5.3
                            @Override // com.bytedance.sdk.openadsdk.sba.dg
                            public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                return f.e("reward");
                            }
                        });
                        com.bytedance.sdk.openadsdk.vk.emc.bw.emc("reward", xqVar.dg(), -1, "response is null");
                        rie.this.emc(ypwVar);
                        return;
                    }
                    if (!ypwVar2.ycc() || TextUtils.isEmpty(ypwVar2.dg())) {
                        String strEmc = msw.emc(-2);
                        int iEmc = ypwVar2.emc();
                        if (!ypwVar2.ycc() && !TextUtils.isEmpty(ypwVar2.ypw())) {
                            strEmc = ypwVar2.ypw();
                        }
                        ypwVar.emc(iEmc, strEmc);
                        com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.rie.5.2
                            @Override // com.bytedance.sdk.openadsdk.sba.dg
                            public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                return f.e("reward");
                            }
                        });
                        if (ypwVar2.ycc()) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.vk.emc.bw.emc("reward", xqVar.dg(), iEmc, strEmc);
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject(ypwVar2.dg());
                        String strEmc2 = rie.emc(jSONObject2.optInt("cypher", -1), jSONObject2.optString(PglCryptUtils.KEY_MESSAGE));
                        if (!TextUtils.isEmpty(strEmc2)) {
                            try {
                                jSONObject2 = new JSONObject(strEmc2);
                            } catch (Throwable unused) {
                            }
                        }
                        ypwVarEmc = ypw.emc(jSONObject2);
                        i = ypwVarEmc.emc;
                    } catch (JSONException e7) {
                        com.bytedance.sdk.component.utils.ul.xq("NetApiImpl", e7.getMessage());
                        rie.this.emc(ypwVar);
                    }
                    if (i != 20000) {
                        ypwVar.emc(i, msw.emc(i));
                    } else if (ypwVarEmc.xq == null) {
                        rie.this.emc(ypwVar);
                    } else {
                        ypwVar.emc(ypwVarEmc);
                        com.bytedance.sdk.openadsdk.sba.xq.ypw(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.rie.5.1
                            @Override // com.bytedance.sdk.openadsdk.sba.dg
                            public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                                return f.e("reward");
                            }
                        });
                    }
                }

                @Override // com.bytedance.sdk.component.uym.emc.emc
                public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, IOException iOException) {
                    String message;
                    if (iOException != null) {
                        message = iOException.getMessage();
                    } else {
                        message = "";
                    }
                    ypwVar.emc(-2, message);
                    if (xqVar != null) {
                        String strDg = xqVar.dg();
                        com.bytedance.sdk.openadsdk.utils.sra.emc(strDg);
                        com.bytedance.sdk.openadsdk.vk.emc.bw.emc("reward", strDg, -1, message);
                    }
                    com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.rie.5.4
                        @Override // com.bytedance.sdk.openadsdk.sba.dg
                        public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                            return f.e("reward");
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sra
    public JSONObject emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            String strOptString2 = jSONObject.optString("auction_price", "");
            String strEmc = emc(iOptInt, strOptString);
            if (TextUtils.isEmpty(strEmc)) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(strEmc);
            try {
                jSONObject2.put("auction_price", strOptString2);
                return jSONObject2;
            } catch (Throwable unused) {
                return jSONObject2;
            }
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    public static String emc(int i, String str) {
        Object obj;
        if (i == 3) {
            return com.bytedance.sdk.component.utils.emc.xq(str);
        }
        if (i == 4) {
            Pair<Integer, String> pairDecryptType4 = PangleEncryptManager.decryptType4(str);
            if (pairDecryptType4 != null && (obj = pairDecryptType4.second) != null) {
                String str2 = (String) obj;
                ee.emc(true);
                return str2;
            }
            ee.emc(false);
            ee.emc(2, PangleEncryptConstant.CryptDataScene.GET_ADS, pairDecryptType4 != null ? ((Integer) pairDecryptType4.first).intValue() : 0);
        }
        return null;
    }

    private void emc(com.bytedance.sdk.component.uym.ypw.dg dgVar, JSONObject jSONObject) {
        try {
            if (xq(jSONObject) && jSONObject.optInt("cypher") == 4) {
                dgVar.ypw("x-pgli18n", "4");
                dgVar.ypw("Content-Type", "application/json; charset=utf-8");
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sra
    public com.bytedance.sdk.component.adexpress.emc.xq.emc emc() {
        com.bytedance.sdk.component.adexpress.emc.xq.emc emcVarEmc = null;
        if (!com.bytedance.sdk.openadsdk.core.settings.uym.emc()) {
            return null;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tpl_fetch_model", "date", 0L);
        String strWpn = aa.dg().wpn();
        String strYpw = com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw("tpl_fetch_model", "last_url", "");
        if (jCurrentTimeMillis <= aa.dg().iyl() && jCurrentTimeMillis >= 0 && TextUtils.equals(strWpn, strYpw)) {
            String strYpw2 = com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw("tpl_fetch_model", "model", "");
            try {
                if (!TextUtils.isEmpty(strYpw2)) {
                    return com.bytedance.sdk.component.adexpress.emc.xq.emc.bw(strYpw2);
                }
            } catch (Exception unused) {
            }
        }
        try {
            com.bytedance.sdk.component.uym.ypw.ypw ypwVarXq = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().xq();
            String strEmc = com.bytedance.sdk.openadsdk.zz.dg.emc(ypwVarXq, strWpn);
            ypwVarXq.ypw(strEmc);
            com.bytedance.sdk.component.uym.ypw ypwVarEmc = ypwVarXq.emc();
            if (ypwVarEmc == null || !ypwVarEmc.ycc()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(ypwVarEmc.dg());
            jSONObject.put("template_fetch_url", strEmc);
            emcVarEmc = com.bytedance.sdk.component.adexpress.emc.xq.emc.emc(jSONObject);
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tpl_fetch_model", "date", Long.valueOf(System.currentTimeMillis() / 1000));
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tpl_fetch_model", "model", jSONObject.toString());
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("tpl_fetch_model", "last_url", strWpn);
            return emcVarEmc;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("NetApiImpl", th.getMessage());
            return emcVarEmc;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sra
    public void emc(String str) {
        com.bytedance.sdk.component.uym.ypw.ypw ypwVarXq = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().xq();
        ypwVarXq.ypw(str);
        ypwVarXq.emc("upload_bidding");
        ypwVarXq.emc(7);
        ypwVarXq.emc(new com.bytedance.sdk.component.uym.emc.emc() { // from class: com.bytedance.sdk.openadsdk.core.rie.6
            @Override // com.bytedance.sdk.component.uym.emc.emc
            public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.uym.emc.emc
            public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, com.bytedance.sdk.component.uym.ypw ypwVar) {
                ypwVar.dg();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.sra
    public void emc(JSONObject jSONObject, String str) {
        com.bytedance.sdk.component.uym.ypw.dg dgVarYpw = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().ypw();
        dgVarYpw.ypw(str);
        Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
        dgVarYpw.ypw("cypher", (String) pairGenerateRequestHeader.first);
        dgVarYpw.ypw("transfer-param", (String) pairGenerateRequestHeader.second);
        dgVarYpw.ypw("x-pangle-target-idc", aa.dg().nx());
        dgVarYpw.emc(jSONObject);
        dgVarYpw.emc(5);
        dgVarYpw.emc("apm_pv");
        dgVarYpw.emc(new com.bytedance.sdk.component.uym.emc.emc() { // from class: com.bytedance.sdk.openadsdk.core.rie.7
            @Override // com.bytedance.sdk.component.uym.emc.emc
            public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.uym.emc.emc
            public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, com.bytedance.sdk.component.uym.ypw ypwVar) {
                ypwVar.dg();
            }
        });
    }
}
