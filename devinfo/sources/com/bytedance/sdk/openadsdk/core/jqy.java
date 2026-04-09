package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.fkw.ouw;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
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
import z8.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jqy implements vpp<com.bytedance.sdk.openadsdk.yu.ouw> {
    private final Context ouw;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        final String bly;
        final String fkw;

        /* renamed from: le, reason: collision with root package name */
        final int f8188le;

        /* renamed from: lh, reason: collision with root package name */
        final long f8189lh;
        final int ouw;
        public final com.bytedance.sdk.openadsdk.core.model.ouw pno;
        final String ra;
        final ArrayList<Integer> tlj;
        final long vt;
        final int yu;

        private ouw(String str, int i4, int i10, String str2, int i11, String str3, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, long j, long j8, ArrayList<Integer> arrayList) {
            this.ouw = i4;
            this.yu = i10;
            this.fkw = str2;
            this.ra = str3;
            this.pno = ouwVar;
            this.bly = str;
            this.f8188le = i11;
            this.vt = j;
            this.f8189lh = j8;
            this.tlj = arrayList;
        }

        public static ouw ouw(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ksc kscVar) {
            String strOptString = jSONObject.optString("did");
            int iOptInt = jSONObject.optInt("processing_time_ms");
            long jOptLong = jSONObject.optLong("s_receive_ts");
            long jOptLong2 = jSONObject.optLong("s_send_ts");
            int iOptInt2 = jSONObject.optInt("status_code");
            String strOptString2 = jSONObject.optString("desc");
            String strOptString3 = jSONObject.optString("request_id");
            int iOptInt3 = jSONObject.optInt("reason");
            Pair<com.bytedance.sdk.openadsdk.core.model.ouw, ArrayList<Integer>> pairOuw = com.bytedance.sdk.openadsdk.core.vt.ouw(jSONObject, adSlot, kscVar);
            return pairOuw == null ? new ouw(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, null, jOptLong, jOptLong2, null) : new ouw(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, (com.bytedance.sdk.openadsdk.core.model.ouw) pairOuw.first, jOptLong, jOptLong2, (ArrayList) pairOuw.second);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt {

        /* renamed from: lh, reason: collision with root package name */
        public final com.bytedance.sdk.openadsdk.core.model.fvf f8190lh;
        public final int ouw;
        public final boolean vt;

        private vt(int i4, boolean z3, com.bytedance.sdk.openadsdk.core.model.fvf fvfVar) {
            this.ouw = i4;
            this.vt = z3;
            this.f8190lh = fvfVar;
        }

        public static vt ouw(JSONObject jSONObject) {
            int iOptInt = jSONObject.optInt("code");
            boolean zOptBoolean = jSONObject.optBoolean("verify");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            com.bytedance.sdk.openadsdk.core.model.fvf fvfVar = new com.bytedance.sdk.openadsdk.core.model.fvf();
            if (jSONObjectOptJSONObject != null) {
                try {
                    fvfVar.ouw = jSONObjectOptJSONObject.optInt("reason");
                    fvfVar.vt = jSONObjectOptJSONObject.optInt("corp_type");
                    fvfVar.f8227lh = jSONObjectOptJSONObject.optInt("reward_amount");
                    fvfVar.yu = jSONObjectOptJSONObject.optString("reward_name");
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", th2.getMessage());
                }
            }
            return new vt(iOptInt, zOptBoolean, fvfVar);
        }
    }

    public jqy(Context context) {
        this.ouw = context;
    }

    private static boolean fkw(JSONObject jSONObject) {
        try {
            return jSONObject.optString(PglCryptUtils.KEY_MESSAGE).equalsIgnoreCase("success");
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean lh(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    @DungeonFlag
    private JSONObject ouw(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ksc kscVar, int i4) {
        int i10;
        int i11;
        JSONArray jSONArray;
        int i12;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String strLe = (kscVar == null || TextUtils.isEmpty(kscVar.ouw)) ? com.bytedance.sdk.openadsdk.utils.uoy.le() : kscVar.ouw;
            if (i4 == 7) {
                if (kscVar != null && (i12 = kscVar.vt) > 0) {
                    jSONObject2.put("req_type", i12);
                }
            } else if (i4 == 8) {
                if (kscVar != null && (i11 = kscVar.f8242lh) > 0) {
                    jSONObject2.put("req_type", i11);
                }
            } else if (i4 == 3 && kscVar != null && (i10 = kscVar.yu) > 0) {
                jSONObject2.put("req_type", i10);
            }
            try {
                String strLe2 = zih.yu().le();
                String strMwh = zih.yu().mwh();
                if (strLe2 != null && strMwh != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("version", strLe2);
                    jSONObject3.put("param", strMwh);
                    jSONObject2.put("abtest", jSONObject3);
                }
            } catch (Throwable unused) {
            }
            jSONObject2.put("request_id", strLe);
            com.bytedance.sdk.openadsdk.utils.uoy.ouw(jSONObject2);
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("js_render_ver", com.bytedance.sdk.openadsdk.core.bly.ryl.vt());
            jSONObject2.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.bly.ryl.lh());
            jSONObject2.put("source_type", "app");
            jSONObject2.put("app", vt());
            JSONObject jSONObjectOuw = DeviceUtils.ouw(this.ouw, true);
            com.bytedance.sdk.component.utils.ko.ouw("NetApiImpl", "device info:", jSONObjectOuw);
            jSONObject2.put("device", jSONObjectOuw);
            jSONObject2.put("user", ouw(adSlot));
            jSONObject2.put("ua", com.bytedance.sdk.openadsdk.utils.uoy.fkw());
            jSONObject2.put("channel", "main");
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(ouw(adSlot, i4, kscVar));
            jSONObject2.put("adslots", jSONArray2);
            if (kscVar != null && (jSONArray = kscVar.fkw) != null) {
                try {
                    jSONObject2.put("source_temai_product_ids", jSONArray);
                } catch (Exception unused2) {
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject2.put("ts", jCurrentTimeMillis);
            String strConcat = "";
            if (adSlot.getCodeId() != null && strLe != null) {
                strConcat = String.valueOf(jCurrentTimeMillis).concat(adSlot.getCodeId()).concat(strLe);
            }
            jSONObject2.put("req_sign", com.bytedance.sdk.component.utils.fkw.ouw(strConcat));
            if (com.bytedance.sdk.openadsdk.core.tlj.lh.fkw() != 0) {
                jSONObject2.put("pglx", String.valueOf(com.bytedance.sdk.openadsdk.core.tlj.lh.fkw()));
            }
            jSONObject2.put("adx_id", bly.ouw().vm());
            com.bytedance.sdk.openadsdk.le.vt.ouw().ouw(jSONObject2);
            jSONObject = ouw(PangleEncryptConstant.CryptDataScene.GET_ADS, jSONObject2);
            if (jSONObject != null) {
                jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
                jSONObject.put("oversea_version_type", 1);
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.yu("body data exception", th2);
        }
        return jSONObject;
    }

    private static Map<String, String> yu(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/json; charset=utf-8");
        if (lh(jSONObject)) {
            map.put("Content-Encoding", "union_sdk_encode");
        }
        return map;
    }

    public final void vt(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.ksc kscVar, final int i4, final vpp.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar2;
        if (!zih.yu().tc()) {
            ouwVar.ouw(40060, pno.ouw(40060));
            return;
        }
        boolean zVt = com.bytedance.sdk.openadsdk.vpp.ouw.vt();
        if (!zVt) {
            jg.le();
        }
        final com.bytedance.sdk.openadsdk.core.model.lh lhVar = new com.bytedance.sdk.openadsdk.core.model.lh();
        lhVar.fkw = adSlot;
        if (!com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            if (ouwVar != null) {
                ouwVar.ouw(1000, "Ad request is temporarily paused, Please contact your AM");
                lhVar.vt = 1000;
                com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
                return;
            }
            return;
        }
        if (!zih.yu().vpp()) {
            if (ouwVar != null) {
                ouwVar.ouw(-16, pno.ouw(-16));
                lhVar.vt = 1001;
                com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
                return;
            }
            return;
        }
        if (ouwVar == null) {
            return;
        }
        if (vt(adSlot.getCodeId())) {
            ouwVar.ouw(-8, pno.ouw(-8));
            return;
        }
        if (!TextUtils.isEmpty(adSlot.getBidAdm()) && !kscVar.f8241le) {
            lhVar.f8246lh = 2;
            lhVar.ouw = adSlot.getBidAdm();
            if (com.bytedance.sdk.component.utils.ko.yu()) {
                com.bytedance.sdk.component.utils.ko.vt("bidding", "getAd bidAdm is valid，it will directly parse the returned advertisement: BidAdm->MD5->" + a.a(adSlot.getBidAdm()));
            }
            if (zih.yu().ex() && pd.ouw().yu() == 1) {
                com.bytedance.sdk.openadsdk.utils.uoy.ouw("Pangle_Debug_Mode", adSlot.getBidAdm(), this.ouw);
            }
            try {
                JSONObject jSONObjectOuw = ouw(new JSONObject(adSlot.getBidAdm()));
                if (jSONObjectOuw == null) {
                    lhVar.ra = 12;
                    ouw(ouwVar, lhVar);
                    return;
                }
                ouw ouwVarOuw = ouw.ouw(jSONObjectOuw, adSlot, kscVar);
                lhVar.yu = ouwVarOuw.tlj;
                ryl.ouw(ouwVarOuw.bly);
                int i10 = ouwVarOuw.yu;
                if (i10 != 20000) {
                    ouwVar.ouw(i10, ouwVarOuw.fkw);
                    lhVar.vt = ouwVarOuw.yu;
                    lhVar.ra = 9;
                    com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.ouw ouwVar3 = ouwVarOuw.pno;
                if (ouwVar3 == null) {
                    lhVar.ra = 13;
                    ouw(ouwVar, lhVar);
                    return;
                }
                List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar3.yu;
                if (list != null && !list.isEmpty()) {
                    com.bytedance.sdk.openadsdk.rn.lh.ouw(ouwVarOuw.pno.yu.get(0));
                }
                ouw(ouwVarOuw.pno);
                if (ouw(ouwVarOuw.pno, ouwVar)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.ryl.lh.yu.ouw(ouwVarOuw.pno);
                ouwVar.ouw(ouwVarOuw.pno, lhVar);
                Map<String, com.bytedance.sdk.openadsdk.core.model.vpp> mapOuw = com.bytedance.sdk.openadsdk.core.model.ouw.ouw(ouwVarOuw.pno);
                if (mapOuw != null) {
                    com.bytedance.sdk.openadsdk.ra.vt.ouw().ouw(mapOuw);
                }
                vt(ouwVarOuw.pno);
                ouw.C0085ouw.ouw.ouw(ouwVarOuw.pno);
                return;
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.ouw("NetApiImpl", "get ad error: ", th2);
                lhVar.ra = 14;
                lhVar.f8245le = th2.getMessage();
                ouw(ouwVar, lhVar);
                return;
            }
        }
        if (kscVar != null && !TextUtils.isEmpty(kscVar.ryl)) {
            try {
                JSONObject jSONObjectOuw2 = ouw(new JSONObject(kscVar.ryl));
                if (jSONObjectOuw2 != null) {
                    ouw ouwVarOuw2 = ouw.ouw(jSONObjectOuw2, adSlot, kscVar);
                    qbp qbpVar = kscVar.mwh;
                    if (qbpVar != null && (ouwVar2 = ouwVarOuw2.pno) != null && qbpVar.ouw(ouwVar2)) {
                        com.bytedance.sdk.openadsdk.core.ryl.lh.yu.ouw(ouwVar2);
                        ouwVar.ouw(ouwVar2, lhVar);
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObjectOuw3 = ouw(adSlot, kscVar, i4);
        if (jSONObjectOuw3 == null) {
            ouwVar.ouw(-9, pno.ouw(-9));
            lhVar.vt = -9;
            com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
            return;
        }
        if (zih.yu().ex() && pd.ouw().yu() == 1) {
            com.bytedance.sdk.openadsdk.utils.uoy.ouw("Pangle_Debug_Mode", jSONObjectOuw3.toString(), this.ouw);
        }
        String strOuw = com.bytedance.sdk.openadsdk.utils.uoy.ouw("/api/ad/union/sdk/get_ads/", true, false);
        final com.bytedance.sdk.component.ra.vt.yu yuVarOuw = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.ouw();
        try {
            yuVarOuw.ouw(com.bytedance.sdk.openadsdk.bly.lh.ouw(strOuw));
        } catch (Exception unused2) {
        }
        yuVarOuw.ouw(jSONObjectOuw3.toString(), zih.yu().pno());
        Map<String, String> mapOuw2 = com.bytedance.sdk.openadsdk.core.tlj.lh.ouw(strOuw, jSONObjectOuw3.toString());
        if (mapOuw2 != null && mapOuw2.size() > 0) {
            for (String str : mapOuw2.keySet()) {
                try {
                    yuVarOuw.vt(str, mapOuw2.get(str));
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e2.getMessage());
                }
            }
        }
        try {
            yuVarOuw.vt("User-Agent", com.bytedance.sdk.openadsdk.utils.uoy.fkw());
            ouw(yuVarOuw, jSONObjectOuw3);
        } catch (Exception unused3) {
        }
        final com.bytedance.sdk.openadsdk.utils.fak fakVarOuw = com.bytedance.sdk.openadsdk.utils.fak.ouw();
        final Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
        boolean z3 = bly.ouw().jg() && requestExtraMap != null;
        if (z3) {
            requestExtraMap.put("pgad_start", fakVarOuw);
        }
        yuVarOuw.ra = 10;
        yuVarOuw.f7626le = "get_ad";
        com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.8
            @Override // com.bytedance.sdk.openadsdk.vm.yu
            public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar4 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                ouwVar4.f8751lh = "get_ad";
                ouwVar4.ra = adSlot.getCodeId();
                ouwVar4.pno = com.bytedance.sdk.openadsdk.utils.uoy.lh(adSlot.getDurationSlotType());
                return ouwVar4;
            }
        });
        if (com.bytedance.sdk.component.utils.ko.yu()) {
            com.bytedance.sdk.component.utils.ko.vt("NetApiImpl", "canSyncRequest:" + zVt + ",run in " + Thread.currentThread().getName() + " thread");
        }
        if (zVt) {
            Map<String, Object> map = requestExtraMap;
            try {
                com.bytedance.sdk.component.ra.vt vtVarOuw = yuVarOuw.ouw();
                com.bytedance.sdk.component.ra.vt vtVar = vtVarOuw == null ? new com.bytedance.sdk.component.ra.vt(false, 5001, "response is null, content type is not support!!", null, "REQUEST_BODY_NULL", 1L, 1L) : vtVarOuw;
                if (vtVar.pno) {
                    boolean z10 = z3;
                    try {
                        ouw(yuVarOuw, vtVar, z10, map, fakVarOuw, adSlot, lhVar, ouwVar, kscVar, i4);
                    } catch (Throwable th3) {
                        th = th3;
                        z3 = z10;
                        map = map;
                        lhVar = lhVar;
                        ouw(yuVarOuw, new IOException(th.getMessage()), new com.bytedance.sdk.component.ra.vt(false, 5002, "execute method throw exception", null, "REQUEST_BODY_EXCEPTION", 1L, 1L), adSlot, z3, map, ouwVar, lhVar);
                        com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(false);
                    }
                } else {
                    ouw(yuVarOuw, new IOException(vtVar.vt), vtVar, adSlot, z3, map, ouwVar, lhVar);
                    com.bytedance.sdk.openadsdk.utils.zin.ouw(yuVarOuw.fkw());
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            final boolean z11 = z3;
            yuVarOuw.ouw(new com.bytedance.sdk.component.ra.ouw.vt() { // from class: com.bytedance.sdk.openadsdk.core.jqy.9
                @Override // com.bytedance.sdk.component.ra.ouw.ouw
                public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar2, com.bytedance.sdk.component.ra.vt vtVar2) {
                    jqy.this.ouw(lhVar2, vtVar2, z11, requestExtraMap, fakVarOuw, adSlot, lhVar, ouwVar, kscVar, i4);
                }

                @Override // com.bytedance.sdk.component.ra.ouw.vt
                public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar2, IOException iOException, com.bytedance.sdk.component.ra.vt vtVar2) {
                    jqy.this.ouw(yuVarOuw, iOException, vtVar2, adSlot, z11, requestExtraMap, ouwVar, lhVar);
                    if (lhVar2 != null) {
                        com.bytedance.sdk.openadsdk.utils.zin.ouw(lhVar2.fkw());
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().ouw(false);
    }

    private static byte[] fkw(String str) throws Throwable {
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
                        } catch (IOException e2) {
                            com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e2.toString());
                        }
                    } catch (IOException e10) {
                        e = e10;
                        gZIPOutputStream = gZIPOutputStream2;
                        com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e.toString());
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException e11) {
                                com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e11.toString());
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        }
                        return byteArray;
                    } catch (Throwable th2) {
                        th = th2;
                        gZIPOutputStream = gZIPOutputStream2;
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException e12) {
                                com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e12.toString());
                            }
                        }
                        if (byteArrayOutputStream == null) {
                            throw th;
                        }
                        byteArrayOutputStream.toByteArray();
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException e13) {
                            com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e13.toString());
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e14) {
                e = e14;
            }
        } catch (IOException e15) {
            e = e15;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
        byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e16) {
            com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e16.toString());
        }
        return byteArray;
    }

    private static JSONArray lh(String str) throws JSONException {
        try {
            Set<String> setVt = com.bytedance.sdk.component.adexpress.ouw.vt.vt.vt(str);
            if (setVt != null && setVt.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = setVt.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVarOuw = com.bytedance.sdk.component.adexpress.ouw.vt.vt.ouw(it.next());
                    if (vtVarOuw != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(FacebookMediationAdapter.KEY_ID, vtVarOuw.vt);
                        jSONObject.put("md5", vtVarOuw.f7379lh);
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.qbp.ouw("NetApiImpl", "getParentTplIds: ", e2);
            return null;
        }
    }

    private static JSONArray yu(String str) throws JSONException {
        try {
            com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw();
            Set<com.bytedance.sdk.openadsdk.core.cf.ouw.ouw> setOuw = com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw(str);
            if (setOuw != null && setOuw.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.cf.ouw.ouw ouwVar : setOuw) {
                    if (ouwVar != null && !TextUtils.isEmpty(ouwVar.fkw)) {
                        JSONObject jSONObject = new JSONObject();
                        String[] strArrSplit = ouwVar.ouw.split("_");
                        if (strArrSplit.length == 2) {
                            jSONObject.put(FacebookMediationAdapter.KEY_ID, strArrSplit[1]);
                            jSONObject.put("md5", ouwVar.vt);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.qbp.ouw("NetApiImpl", "getUgenParentTplIds: ", e2);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final void ouw(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ksc kscVar, int i4, qbp qbpVar) {
        if (!kscVar.f8241le && TextUtils.isEmpty(adSlot.getBidAdm())) {
            if (kscVar.vt != 2 && kscVar.f8242lh != 2 && kscVar.yu != 2) {
                String strOuw = qbpVar.ouw();
                if (!TextUtils.isEmpty(strOuw)) {
                    kscVar.ryl = strOuw;
                    kscVar.mwh = qbpVar;
                }
            }
            ouw(adSlot, kscVar, i4, (vpp.ouw) qbpVar);
            return;
        }
        ouw(adSlot, kscVar, i4, (vpp.ouw) qbpVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final void ouw(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.ksc kscVar, final int i4, vpp.ouw ouwVar) {
        if (kscVar != null && (kscVar.vt == 2 || kscVar.f8242lh == 2 || kscVar.yu == 2)) {
            adSlot.setPreload(true);
        }
        final com.bytedance.sdk.openadsdk.core.vt.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.core.vt.ouw(ouwVar, adSlot, (adSlot.isPreload() || kscVar == null || kscVar.f8241le) ? false : true);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jg.vt().post(new com.bytedance.sdk.component.pno.pno("getAd") { // from class: com.bytedance.sdk.openadsdk.core.jqy.1
                @Override // java.lang.Runnable
                public final void run() {
                    jqy.this.vt(adSlot, kscVar, i4, ouwVar2);
                }
            });
        } else {
            vt(adSlot, kscVar, i4, ouwVar2);
        }
        if (com.bytedance.sdk.openadsdk.vpp.ouw.vt()) {
            jg.ra();
        }
    }

    private static void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVarLh;
        if (ouwVar == null || (vppVarLh = ouwVar.lh()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.settings.cf.vpp(vppVarLh.mwh);
    }

    public final void ouw(com.bytedance.sdk.component.ra.vt.yu yuVar, IOException iOException, com.bytedance.sdk.component.ra.vt vtVar, final AdSlot adSlot, boolean z3, Map<String, Object> map, vpp.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
        String message;
        int i4;
        com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.10
            @Override // com.bytedance.sdk.openadsdk.vm.yu
            public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                ouwVar2.f8751lh = "get_ad";
                ouwVar2.ra = adSlot.getCodeId();
                ouwVar2.pno = com.bytedance.sdk.openadsdk.utils.uoy.lh(adSlot.getDurationSlotType());
                ouwVar2.vt = BuildConfig.VERSION_NAME;
                return ouwVar2;
            }
        });
        if (vtVar != null) {
            message = vtVar.vt;
        } else if (iOException != null) {
            message = iOException.getMessage();
        } else {
            message = "";
        }
        com.bytedance.sdk.openadsdk.utils.fak fakVarOuw = com.bytedance.sdk.openadsdk.utils.fak.ouw();
        if (z3) {
            map.put("pgad_end", Long.valueOf(fakVarOuw.ouw));
        }
        if (zih.yu().ex() && pd.ouw().yu() == 1) {
            com.bytedance.sdk.openadsdk.utils.uoy.ouw("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, this.ouw);
        }
        if (vtVar != null) {
            i4 = vtVar.ouw;
        } else {
            i4 = (iOException == null || !(iOException instanceof SocketTimeoutException)) ? 601 : 602;
        }
        if (ouwVar != null) {
            ouwVar.ouw(i4, message);
        }
        com.bytedance.sdk.component.utils.ko.vt("NetApiImpl", "onFailure: ", Integer.valueOf(i4));
        lhVar.vt = i4;
        lhVar.ra = 10;
        lhVar.f8245le = message;
        com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
        com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("get_ad", yuVar.fkw(), i4, message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0191 A[Catch: all -> 0x0199, TryCatch #4 {all -> 0x0199, blocks: (B:78:0x017d, B:80:0x0191, B:83:0x019b, B:85:0x01a1, B:88:0x01a9), top: B:102:0x017d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ouw(com.bytedance.sdk.component.ra.vt.lh r20, com.bytedance.sdk.component.ra.vt r21, boolean r22, java.util.Map<java.lang.String, java.lang.Object> r23, com.bytedance.sdk.openadsdk.utils.fak r24, final com.bytedance.sdk.openadsdk.AdSlot r25, com.bytedance.sdk.openadsdk.core.model.lh r26, com.bytedance.sdk.openadsdk.core.vpp.ouw r27, com.bytedance.sdk.openadsdk.core.model.ksc r28, int r29) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.jqy.ouw(com.bytedance.sdk.component.ra.vt.lh, com.bytedance.sdk.component.ra.vt, boolean, java.util.Map, com.bytedance.sdk.openadsdk.utils.fak, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.model.lh, com.bytedance.sdk.openadsdk.core.vpp$ouw, com.bytedance.sdk.openadsdk.core.model.ksc, int):void");
    }

    @DungeonFlag
    private static JSONObject vt(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("timestamp", System.currentTimeMillis());
            jSONObject3.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            JSONObject jSONObject4 = new JSONObject(str);
            jSONObject4.put("gaid", com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt());
            jSONObject3.put("extra", jSONObject4.toString());
            jSONObject3.put("filter_words", ouw(list));
            jSONObject3.put("dislike_source", str3);
            if (jSONObject != null && !TextUtils.isEmpty(str2)) {
                jSONObject3.put("creative_info", com.bytedance.sdk.component.utils.ouw.ouw(jSONObject).toString());
                jSONObject3.put("feedback_type", 1);
                jSONObject3.put("user_description", str2);
            }
            com.bytedance.sdk.component.utils.ko.ouw("NetApiImpl", "dislike_source is：", str3);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put("actions", jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6 A[PHI: r2
  0x00b6: PHI (r2v15 int) = (r2v14 int), (r2v18 int) binds: [B:14:0x00a9, B:18:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static org.json.JSONObject vt() throws org.json.JSONException {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "appid"
            com.bytedance.sdk.openadsdk.core.bly r2 = com.bytedance.sdk.openadsdk.core.bly.ouw()     // Catch: org.json.JSONException -> Lc7
            java.lang.String r2 = r2.yu()     // Catch: org.json.JSONException -> Lc7
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc7
            java.lang.String r1 = "name"
            com.bytedance.sdk.openadsdk.core.bly r2 = com.bytedance.sdk.openadsdk.core.bly.ouw()     // Catch: org.json.JSONException -> Lc7
            java.lang.String r2 = r2.pno()     // Catch: org.json.JSONException -> Lc7
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc7
            java.lang.String r1 = "package_name"
            java.lang.String r2 = com.bytedance.sdk.openadsdk.utils.uoy.ra()     // Catch: java.lang.Exception -> L3a
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L3a
            java.lang.String r1 = "version_code"
            java.lang.String r2 = com.bytedance.sdk.openadsdk.utils.uoy.pno()     // Catch: java.lang.Exception -> L3a
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L3a
            java.lang.String r1 = "version"
            java.lang.String r2 = com.bytedance.sdk.openadsdk.utils.uoy.bly()     // Catch: java.lang.Exception -> L3a
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L3a
        L3a:
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.zih.ouw()     // Catch: org.json.JSONException -> Lc7
            java.lang.String r2 = ""
            if (r1 == 0) goto L5f
            java.lang.String r2 = r1.getPackageResourcePath()     // Catch: java.lang.Throwable -> L47
            goto L5f
        L47:
            r3 = move-exception
            java.lang.String r4 = "NetApiImpl"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Lc7
            java.lang.String r6 = "failed to get the application installation package path. error: "
            r5.<init>(r6)     // Catch: org.json.JSONException -> Lc7
            java.lang.String r3 = r3.getMessage()     // Catch: org.json.JSONException -> Lc7
            r5.append(r3)     // Catch: org.json.JSONException -> Lc7
            java.lang.String r3 = r5.toString()     // Catch: org.json.JSONException -> Lc7
            com.bytedance.sdk.component.utils.qbp.lh(r4, r3)     // Catch: org.json.JSONException -> Lc7
        L5f:
            java.lang.String r3 = "package_install_path"
            r0.put(r3, r2)     // Catch: org.json.JSONException -> Lc7
            java.lang.String r2 = "is_paid_app"
            r3 = 0
            r0.put(r2, r3)     // Catch: org.json.JSONException -> Lc7
            java.lang.String r2 = "apk_sign"
            java.lang.String r4 = com.bytedance.sdk.openadsdk.common.lh.vt()     // Catch: org.json.JSONException -> Lc7
            r0.put(r2, r4)     // Catch: org.json.JSONException -> Lc7
            java.lang.String r2 = "app_running_time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> Lc7
            long r6 = com.bytedance.sdk.openadsdk.core.jg.ouw()     // Catch: org.json.JSONException -> Lc7
            long r4 = r4 - r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            r0.put(r2, r4)     // Catch: org.json.JSONException -> Lc7
            java.lang.String r2 = "fmwname"
            java.lang.String r4 = com.bytedance.sdk.openadsdk.utils.DeviceUtils.bly()     // Catch: org.json.JSONException -> Lc7
            r0.put(r2, r4)     // Catch: org.json.JSONException -> Lc7
            java.lang.String r2 = "is_init"
            boolean r4 = com.bytedance.sdk.openadsdk.core.jg.fkw()     // Catch: org.json.JSONException -> Lc7
            r0.put(r2, r4)     // Catch: org.json.JSONException -> Lc7
            if (r1 == 0) goto Lc7
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: org.json.JSONException -> Lc7
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch: org.json.JSONException -> Lc7
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch: org.json.JSONException -> Lc7
            int r1 = r1.getRotation()     // Catch: org.json.JSONException -> Lc7
            r2 = 1
            if (r1 == 0) goto Lb6
            r4 = 3
            if (r1 == r2) goto Lb8
            r2 = 2
            if (r1 == r2) goto Lb6
            if (r1 == r4) goto Lb4
            goto Lb9
        Lb4:
            r3 = 4
            goto Lb9
        Lb6:
            r3 = r2
            goto Lb9
        Lb8:
            r3 = r4
        Lb9:
            java.lang.String r1 = "orientation_support"
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> Lc7
            r2.<init>()     // Catch: org.json.JSONException -> Lc7
            org.json.JSONArray r2 = r2.put(r3)     // Catch: org.json.JSONException -> Lc7
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc7
        Lc7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.jqy.vt():org.json.JSONObject");
    }

    private static String vt(AdSlot adSlot) {
        String strRyl = bly.ouw().ryl();
        if (adSlot == null) {
            if (TextUtils.isEmpty(strRyl)) {
                return "";
            }
        } else {
            String userData = adSlot.getUserData();
            if (TextUtils.isEmpty(strRyl)) {
                return userData;
            }
            if (!TextUtils.isEmpty(userData)) {
                HashSet hashSet = new HashSet();
                try {
                    JSONArray jSONArray = new JSONArray(userData);
                    int length = jSONArray.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i4);
                        if (jSONObject != null) {
                            hashSet.add(jSONObject.optString("name", null));
                        }
                    }
                    try {
                        JSONArray jSONArray2 = new JSONArray(strRyl);
                        int length2 = jSONArray2.length();
                        for (int i10 = 0; i10 < length2; i10++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i10);
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
        return strRyl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final com.bytedance.sdk.openadsdk.yu.fkw vt(JSONObject jSONObject) {
        int i4;
        boolean z3;
        boolean z10;
        String strOptString = "error unknown";
        System.currentTimeMillis();
        if (!com.bytedance.sdk.openadsdk.core.settings.ra.ouw() || !zih.yu().tc() || jSONObject.length() <= 0) {
            return null;
        }
        com.bytedance.sdk.component.ra.vt.yu yuVarOuw = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.ouw();
        int i10 = 0;
        try {
            JSONObject jSONObjectOuw = ouw(PangleEncryptConstant.CryptDataScene.STATS_LOG, jSONObject);
            yuVarOuw.ouw(jSONObjectOuw.toString(), zih.yu().pno());
            yuVarOuw.ouw(com.bytedance.sdk.openadsdk.utils.uoy.vt("/api/ad/union/sdk/stats/batch/"));
            ouw(yuVarOuw, jSONObjectOuw);
            yuVarOuw.vt("User-Agent", com.bytedance.sdk.openadsdk.utils.uoy.fkw());
            boolean z11 = true;
            if (com.bytedance.sdk.openadsdk.core.settings.cf.vt().pno.ouw("perf_con_adlog_turn_off_retry_stats", 0) == 1) {
                yuVarOuw.vt("_disable_retry", "1");
            }
            com.bytedance.sdk.component.ra.vt vtVarOuw = yuVarOuw.ouw();
            try {
            } catch (Throwable unused) {
                i4 = 0;
                z11 = false;
            }
            if (vtVarOuw == null) {
                return new com.bytedance.sdk.openadsdk.yu.fkw(false, 0, "error unknown", false);
            }
            if (!vtVarOuw.pno || TextUtils.isEmpty(vtVarOuw.yu)) {
                z11 = false;
                z10 = false;
            } else {
                JSONObject jSONObject2 = new JSONObject(vtVarOuw.yu);
                int iOptInt = jSONObject2.optInt("code", -1);
                strOptString = jSONObject2.optString("data", "");
                boolean z12 = iOptInt == 20000;
                z10 = z12;
                if (iOptInt != 60005) {
                    z11 = false;
                    z10 = z12;
                }
            }
            try {
                i10 = vtVarOuw.ouw;
                z3 = z10;
                if (!vtVarOuw.pno) {
                    strOptString = vtVarOuw.vt;
                    com.bytedance.sdk.openadsdk.utils.zin.ouw(yuVarOuw.fkw());
                    z3 = z10;
                }
            } catch (Throwable unused2) {
                i4 = i10;
                i10 = z10 ? 1 : 0;
                z3 = i10;
                i10 = i4;
                return new com.bytedance.sdk.openadsdk.yu.fkw(z3, i10, strOptString, z11);
            }
            return new com.bytedance.sdk.openadsdk.yu.fkw(z3, i10, strOptString, z11);
        } catch (Throwable unused3) {
            return new com.bytedance.sdk.openadsdk.yu.fkw(false, 0, "error unknown", false);
        }
    }

    private boolean ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, vpp.ouw ouwVar2) {
        if (ouwVar == null) {
            ouwVar2.ouw(40053, pno.ouw(40053));
            return true;
        }
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
        if (list.isEmpty()) {
            return false;
        }
        for (final com.bytedance.sdk.openadsdk.core.model.vpp vppVar : list) {
            if (TextUtils.isEmpty(vppVar.f8295hk.vt) || TextUtils.isEmpty(vppVar.f8295hk.f8321lh)) {
                ouwVar2.ouw(40053, pno.ouw(40053));
                com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, com.bytedance.sdk.openadsdk.utils.uoy.ouw(vppVar), "material_error", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.core.jqy.13
                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject ouw() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("ad_label", vppVar.f8295hk.ouw());
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

    private static void ouw(String str, int i4, int i10, com.bytedance.sdk.openadsdk.core.model.zih zihVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (!TextUtils.isEmpty(str)) {
            yu.ouw.ouw(yu.ouw.vt.ouw(str).fkw(com.bytedance.sdk.openadsdk.utils.osn.le(zih.ouw())).yu(com.bytedance.sdk.openadsdk.utils.osn.yu(zih.ouw()))).ouw(i4).vt(i10).fkw(com.bytedance.sdk.openadsdk.utils.osn.le(zih.ouw())).yu(com.bytedance.sdk.openadsdk.utils.osn.yu(zih.ouw())).lh(1).ouw(new com.bytedance.sdk.openadsdk.tlj.vt(vppVar, str, null));
        } else {
            if (zihVar == null) {
                return;
            }
            yu.ouw.ouw(yu.ouw.vt.ouw(zihVar.ouw).ouw(zihVar.vt).vt(zihVar.f8323lh).fkw(com.bytedance.sdk.openadsdk.utils.osn.le(zih.ouw())).yu(com.bytedance.sdk.openadsdk.utils.osn.yu(zih.ouw())).ouw(zihVar.f8322le)).lh(1).ouw(new com.bytedance.sdk.openadsdk.tlj.vt(vppVar, zihVar.ouw, null));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final void vt(JSONObject jSONObject, String str) {
        com.bytedance.sdk.component.ra.vt.yu yuVarOuw = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.ouw();
        yuVarOuw.ouw(str);
        Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
        yuVarOuw.vt("cypher", (String) pairGenerateRequestHeader.first);
        yuVarOuw.vt("transfer-param", (String) pairGenerateRequestHeader.second);
        yuVarOuw.vt("x-pangle-target-idc", zih.yu().lso());
        yuVarOuw.ouw(jSONObject);
        yuVarOuw.ra = 5;
        yuVarOuw.f7626le = "apm_pv";
        yuVarOuw.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.jqy.7
            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar) {
                com.bytedance.sdk.component.utils.ko.vt("execPVToApm success", vtVar.yu);
            }

            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                com.bytedance.sdk.component.utils.ko.vt("execPVToApm fail", iOException.toString());
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ouw(com.bytedance.sdk.component.vt.ouw.tlj r12, com.bytedance.sdk.openadsdk.core.model.ksc r13, com.bytedance.sdk.openadsdk.utils.fak r14, com.bytedance.sdk.openadsdk.utils.fak r15, int r16, com.bytedance.sdk.openadsdk.utils.fak r17, com.bytedance.sdk.openadsdk.core.model.vpp r18, java.lang.String r19) {
        /*
            com.bytedance.sdk.openadsdk.core.settings.cf r0 = com.bytedance.sdk.openadsdk.core.zih.yu()
            boolean r0 = r0.jae()
            if (r0 != 0) goto Lb
            goto L42
        Lb:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            r2 = 0
            if (r13 == 0) goto L24
            com.bytedance.sdk.openadsdk.utils.fak r0 = r13.tlj     // Catch: java.lang.Exception -> L42
            long r4 = r0.ouw     // Catch: java.lang.Exception -> L42
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L24
            r5 = r17
            long r2 = r5.ouw(r0)     // Catch: java.lang.Exception -> L42
        L22:
            r10 = r2
            goto L27
        L24:
            r5 = r17
            goto L22
        L27:
            r9 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            ouw(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L42
            java.lang.String r0 = "load_ad_time"
            r12 = r18
            r13 = r19
            r14 = r0
            r17 = r8
            r15 = r10
            com.bytedance.sdk.openadsdk.yu.lh.ouw(r12, r13, r14, r15, r17)     // Catch: java.lang.Exception -> L42
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.jqy.ouw(com.bytedance.sdk.component.vt.ouw.tlj, com.bytedance.sdk.openadsdk.core.model.ksc, com.bytedance.sdk.openadsdk.utils.fak, com.bytedance.sdk.openadsdk.utils.fak, int, com.bytedance.sdk.openadsdk.utils.fak, com.bytedance.sdk.openadsdk.core.model.vpp, java.lang.String):void");
    }

    private static void ouw(com.bytedance.sdk.component.vt.ouw.tlj tljVar, com.bytedance.sdk.openadsdk.core.model.ksc kscVar, com.bytedance.sdk.openadsdk.utils.fak fakVar, com.bytedance.sdk.openadsdk.utils.fak fakVar2, int i4, com.bytedance.sdk.openadsdk.utils.fak fakVar3, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str, JSONObject jSONObject, boolean z3) throws JSONException {
        if (kscVar != null) {
            com.bytedance.sdk.openadsdk.utils.fak fakVar4 = kscVar.tlj;
            if (fakVar4.ouw > 0) {
                jSONObject.put("client_start_time", fakVar.ouw(fakVar4));
            }
        }
        jSONObject.put("network_time", fakVar2.ouw(fakVar));
        jSONObject.put("sever_time", i4);
        jSONObject.put("client_end_time", fakVar3.ouw(fakVar2));
        if (str.equals("open_ad")) {
            jSONObject.put("is_icon_only", vppVar.ra() ? 1 : 0);
        }
        if (vppVar != null) {
            jSONObject.put("render_control_type", vppVar.rn());
        }
        jSONObject.put("webview_cache_size", com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().lh());
        jSONObject.put("sync_barrier_open", z3 ? 1 : 0);
        long j = tljVar.vt;
        if (j > 0) {
            jSONObject.put("enqueue_2_run_ts", tljVar.f7668lh - j);
            jSONObject.put("run_2_connect_end_ts", tljVar.fkw - tljVar.vt);
            jSONObject.put("connect_end_2_response_end_ts", tljVar.f7667le - tljVar.fkw);
            jSONObject.put("response_end_2_callback_end_ts", SystemClock.elapsedRealtime() - tljVar.f7667le);
        }
    }

    private static boolean vt(String str) {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh() ? com.bytedance.sdk.openadsdk.multipro.lh.ouw.vt() : com.bytedance.sdk.openadsdk.core.pno.ouw.ouw().vt()) {
            return true;
        }
        if (!(com.bytedance.sdk.openadsdk.multipro.vt.lh() ? com.bytedance.sdk.openadsdk.multipro.lh.ouw.ouw(str) : com.bytedance.sdk.openadsdk.core.pno.ouw.ouw().ouw(str))) {
            return false;
        }
        String strLh = com.bytedance.sdk.openadsdk.multipro.vt.lh() ? com.bytedance.sdk.openadsdk.multipro.lh.ouw.lh() : com.bytedance.sdk.openadsdk.core.pno.ouw.ouw().lh();
        if (!TextUtils.isEmpty(strLh)) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(strLh, System.currentTimeMillis());
        }
        return true;
    }

    private void vt(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = list.get(i4);
            if (vppVar != null && vppVar.qjg == null) {
                ouw("", 0, 0, vppVar.fak, vppVar);
                ouw("", 0, 0, vppVar.uoy, vppVar);
                List<com.bytedance.sdk.openadsdk.core.model.zih> list2 = vppVar.tc;
                if (list2 != null && list2.size() > 0) {
                    for (int i10 = 0; i10 < list2.size(); i10++) {
                        com.bytedance.sdk.openadsdk.core.model.zih zihVar = list2.get(i10);
                        com.bytedance.sdk.component.utils.ko.lh("imgCache", "loadImgAndReport: ");
                        if (zihVar != null) {
                            yu.ouw.ouw(yu.ouw.vt.ouw(zihVar.ouw).ouw(zihVar.vt).vt(zihVar.f8323lh).fkw(com.bytedance.sdk.openadsdk.utils.osn.le(zih.ouw())).yu(com.bytedance.sdk.openadsdk.utils.osn.yu(zih.ouw())).ouw(zihVar.f8322le)).lh(1).ouw(new com.bytedance.sdk.openadsdk.tlj.vt(vppVar, zihVar.ouw, new com.bytedance.sdk.component.fkw.rn() { // from class: com.bytedance.sdk.openadsdk.core.jqy.14
                                @Override // com.bytedance.sdk.component.fkw.rn
                                public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
                                    com.bytedance.sdk.component.utils.ko.lh("imgCache", "loadImgAndReport: success");
                                }

                                @Override // com.bytedance.sdk.component.fkw.rn
                                public final void ouw(int i11, String str, Throwable th2) {
                                    com.bytedance.sdk.component.utils.ko.lh("imgCache", "loadImgAndReport: fail");
                                }
                            }));
                        }
                    }
                }
                c cVar = vppVar.f8309sd;
                if (cVar != null) {
                    ouw(cVar.f6578f, cVar.f6574b, cVar.f6573a, (com.bytedance.sdk.openadsdk.core.model.zih) null, vppVar);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018f A[Catch: all -> 0x016b, TryCatch #3 {all -> 0x016b, blocks: (B:78:0x015e, B:80:0x0164, B:91:0x018f, B:93:0x019a, B:96:0x01a5, B:97:0x01bb, B:87:0x0179, B:89:0x0184), top: B:112:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019a A[Catch: all -> 0x016b, TryCatch #3 {all -> 0x016b, blocks: (B:78:0x015e, B:80:0x0164, B:91:0x018f, B:93:0x019a, B:96:0x01a5, B:97:0x01bb, B:87:0x0179, B:89:0x0184), top: B:112:0x015e }] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.bytedance.sdk.openadsdk.core.vpp
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bytedance.sdk.openadsdk.yu.fkw ouw(org.json.JSONObject r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.jqy.ouw(org.json.JSONObject, java.lang.String):com.bytedance.sdk.openadsdk.yu.fkw");
    }

    private static void ouw(Map<String, String> map, com.bytedance.sdk.component.ra.vt.yu yuVar) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    yuVar.vt(entry.getKey(), entry.getValue());
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.qbp.yu("NetApiImpl", "ADD header exceptopn", e2.getMessage());
                }
            }
        }
        try {
            yuVar.vt("User-Agent", com.bytedance.sdk.openadsdk.utils.uoy.fkw());
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.yu("NetApiImpl", "ADD header exceptopn", e10.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final void ouw(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) throws JSONException {
        if (com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            JSONObject jSONObjectVt = vt(str, list, jSONObject, str2, str3);
            com.bytedance.sdk.component.ra.vt.yu yuVarOuw = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.ouw();
            final String strVt = com.bytedance.sdk.openadsdk.utils.uoy.vt("/api/ad/union/dislike_event/");
            JSONObject jSONObjectOuw = ouw(PangleEncryptConstant.CryptDataScene.DISLIKE, jSONObjectVt);
            String string = jSONObjectOuw != null ? jSONObjectOuw.toString() : null;
            ouw(yuVarOuw, jSONObjectOuw);
            yuVarOuw.ouw(strVt);
            yuVarOuw.lh(string);
            yuVarOuw.ra = 7;
            yuVarOuw.f7626le = "dislike";
            com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.2
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar.f8751lh = "dislike";
                    return ouwVar;
                }
            });
            yuVarOuw.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.jqy.3
                @Override // com.bytedance.sdk.component.ra.ouw.ouw
                public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar) {
                    if (vtVar == null) {
                        com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("dislike", strVt, -1, "response is null");
                        com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.3.3
                            @Override // com.bytedance.sdk.openadsdk.vm.yu
                            public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                ouwVar.f8751lh = "dislike";
                                return ouwVar;
                            }
                        });
                    } else if (vtVar.pno) {
                        com.bytedance.sdk.openadsdk.vm.lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.3.1
                            @Override // com.bytedance.sdk.openadsdk.vm.yu
                            public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                ouwVar.f8751lh = "dislike";
                                return ouwVar;
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.3.2
                            @Override // com.bytedance.sdk.openadsdk.vm.yu
                            public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                ouwVar.f8751lh = "dislike";
                                return ouwVar;
                            }
                        });
                        com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("dislike", strVt, vtVar.ouw, vtVar.vt);
                    }
                }

                @Override // com.bytedance.sdk.component.ra.ouw.ouw
                public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                    com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("dislike", strVt, -1, iOException != null ? iOException.getMessage() : "null");
                    if (lhVar != null) {
                        com.bytedance.sdk.openadsdk.utils.zin.ouw(lhVar.fkw());
                    }
                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.3.4
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar.f8751lh = "dislike";
                            return ouwVar;
                        }
                    });
                }
            });
            try {
                String strOptString = new JSONObject(str).optString("cid", "");
                if (TextUtils.isEmpty(strOptString)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("dislike", strOptString, (String) null, (String) null);
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.qbp.yu(e2.getMessage(), new Object[0]);
            }
        }
    }

    private static JSONObject ouw(PangleEncryptConstant.CryptDataScene cryptDataScene, JSONObject jSONObject) {
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new ex(cryptDataScene));
        tc.ouw(jSONObjectEncryptType4);
        return jSONObjectEncryptType4;
    }

    private static JSONArray ouw(List<FilterWord> list) {
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

    private static void ouw(vpp.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
        ouwVar.ouw(-1, pno.ouw(-1));
        lhVar.vt = -1;
        com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
    }

    public static JSONObject ouw(AdSlot adSlot) throws JSONException {
        jae jaeVar;
        JSONObject jSONObject = new JSONObject();
        try {
            int iOuw = zih.yu().pno.ouw("privacy_personalized_ad", Integer.MAX_VALUE);
            if (iOuw == Integer.MAX_VALUE) {
                int iTc = com.bytedance.sdk.openadsdk.utils.uoy.tc();
                iOuw = (iTc == 1 || iTc == 2) ? 2 : iTc != 3 ? 0 : 1;
            }
            jSONObject.put("personalized_ad", iOuw);
            jSONObject.put("lmt", DeviceUtils.lh());
            jSONObject.put("gdpr", bly.ouw().tlj());
            jSONObject.put("pa_consent", bly.ouw().ra);
            jSONObject.put("is_gdpr_user", zih.yu().pno.ouw("isGdprUser", -1));
            if (adSlot != null && jae.ouw.containsKey(Integer.valueOf(adSlot.getCodeId())) && (jaeVar = jae.ouw.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", jaeVar.vt);
                jSONObject.put("lastbundle", jaeVar.f8182lh);
                jSONObject.put("lastclick", jaeVar.yu);
                jSONObject.put("lastskip", jaeVar.fkw);
            }
            String strVt = vt(adSlot);
            if (!TextUtils.isEmpty(strVt)) {
                jSONObject.put("data", strVt);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static JSONObject ouw(AdSlot adSlot, int i4, com.bytedance.sdk.openadsdk.core.model.ksc kscVar) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put(FacebookMediationAdapter.KEY_ID, adSlot.getCodeId());
            jSONObject3.put("adtype", i4);
            if (!TextUtils.isEmpty(adSlot.getAdId()) || !TextUtils.isEmpty(adSlot.getCreativeId()) || !TextUtils.isEmpty(adSlot.getExt())) {
                JSONObject jSONObject4 = new JSONObject();
                if (!TextUtils.isEmpty(adSlot.getAdId())) {
                    jSONObject4.put("ad_id", adSlot.getAdId());
                }
                if (!TextUtils.isEmpty(adSlot.getCreativeId())) {
                    jSONObject4.put("creative_id", adSlot.getCreativeId());
                }
                if (adSlot.getExt() != null) {
                    jSONObject4.put("ext", adSlot.getExt());
                }
                jSONObject3.put("preview_ads", jSONObject4);
            }
            if (kscVar != null) {
                jSONObject3.put("render_method", kscVar.bly);
                int i10 = kscVar.bly;
                if (i10 == 1) {
                    ouw(jSONObject3, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (i10 == 2) {
                    float expressViewAcceptedWidth = adSlot.getExpressViewAcceptedWidth();
                    float expressViewAcceptedHeight = adSlot.getExpressViewAcceptedHeight();
                    if (expressViewAcceptedWidth >= 0.0f && expressViewAcceptedHeight >= 0.0f) {
                        JSONObject jSONObject5 = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        try {
                            jSONObject5.put("width", (int) expressViewAcceptedWidth);
                            jSONObject5.put("height", (int) expressViewAcceptedHeight);
                            jSONArray.put(jSONObject5);
                            jSONObject3.put("accepted_size", jSONArray);
                        } catch (Exception unused) {
                        }
                    }
                }
            } else {
                jSONObject3.put("render_method", 1);
                ouw(jSONObject3, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject3.put("ptpl_ids", lh(adSlot.getCodeId()));
            jSONObject3.put("ugen_ptpl_ids", yu(adSlot.getCodeId()));
            jSONObject3.put("ptpl_ids_v3", yu(adSlot.getCodeId() + "_v3"));
            jSONObject3.put("pos", AdSlot.getPosition(i4));
            jSONObject3.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (i4 == 1 || i4 == 5) {
                jSONObject3.put("is_origin_ad", true);
            }
            if (kscVar != null && (jSONObject2 = kscVar.ra) != null) {
                jSONObject3.put("session_params", jSONObject2);
            }
            if (kscVar != null && (jSONObject = kscVar.pno) != null) {
                jSONObject3.put("common_params", jSONObject);
            }
            int adCount = adSlot.getAdCount();
            if (adCount <= 0) {
                adCount = 1;
            }
            if (adCount > 3) {
                adCount = 3;
            }
            if (i4 == 7 || i4 == 8) {
                adCount = 1;
            }
            if (kscVar != null && kscVar.fkw != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject3.put("ad_count", adCount);
            if (i4 == 1) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("is_rotate_banner", adSlot.getIsRotateBanner());
                jSONObject6.put("rotate_time", adSlot.getRotateTime());
                jSONObject6.put("rotate_order", adSlot.getRotateOrder());
                jSONObject6.put("type", adSlot.getBannerType());
                jSONObject3.put("banner", jSONObject6);
            }
        } catch (Exception unused2) {
        }
        return jSONObject3;
    }

    private static void ouw(JSONObject jSONObject, String str, int i4, int i10) throws JSONException {
        if (i4 <= 0 || i10 <= 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", i4);
            jSONObject2.put("height", i10);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final void ouw(JSONObject jSONObject, final vpp.vt vtVar) {
        if (!com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            vtVar.ouw(1000, "Ad request is temporarily paused, Please contact your AM");
            return;
        }
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOuw = ouw(PangleEncryptConstant.CryptDataScene.REWARD_VERIFY, jSONObject);
        com.bytedance.sdk.component.ra.vt.yu yuVarOuw = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.ouw();
        try {
            yuVarOuw.ouw(com.bytedance.sdk.openadsdk.bly.lh.ouw(com.bytedance.sdk.openadsdk.utils.uoy.vt("/api/ad/union/sdk/reward_video/reward/")));
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e2.getMessage());
        }
        ouw(yuVarOuw, jSONObjectOuw);
        yuVarOuw.lh(jSONObjectOuw != null ? jSONObjectOuw.toString() : "");
        yuVarOuw.ra = 10;
        yuVarOuw.f7626le = "reward";
        com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.4
            @Override // com.bytedance.sdk.openadsdk.vm.yu
            public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                ouwVar.f8751lh = "reward";
                return ouwVar;
            }
        });
        yuVarOuw.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.jqy.5
            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar2) {
                vt vtVarOuw;
                int i4;
                if (vtVar2 == null) {
                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.5.3
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar.f8751lh = "reward";
                            return ouwVar;
                        }
                    });
                    com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("reward", lhVar.fkw(), -1, "response is null");
                    jqy.ouw(vtVar);
                    return;
                }
                if (!vtVar2.pno || TextUtils.isEmpty(vtVar2.yu)) {
                    String strOuw = pno.ouw(-2);
                    int i10 = vtVar2.ouw;
                    if (!vtVar2.pno && !TextUtils.isEmpty(vtVar2.vt)) {
                        strOuw = vtVar2.vt;
                    }
                    vtVar.ouw(i10, strOuw);
                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.5.2
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar.f8751lh = "reward";
                            return ouwVar;
                        }
                    });
                    if (vtVar2.pno) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("reward", lhVar.fkw(), i10, strOuw);
                    return;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(vtVar2.yu);
                    String strOuw2 = jqy.ouw(jSONObject2.optInt("cypher", -1), jSONObject2.optString(PglCryptUtils.KEY_MESSAGE));
                    if (!TextUtils.isEmpty(strOuw2)) {
                        try {
                            jSONObject2 = new JSONObject(strOuw2);
                        } catch (Throwable unused) {
                        }
                    }
                    vtVarOuw = vt.ouw(jSONObject2);
                    i4 = vtVarOuw.ouw;
                } catch (JSONException e10) {
                    com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", e10.getMessage());
                    jqy.ouw(vtVar);
                }
                if (i4 != 20000) {
                    vtVar.ouw(i4, pno.ouw(i4));
                } else if (vtVarOuw.f8190lh == null) {
                    jqy.ouw(vtVar);
                } else {
                    vtVar.ouw(vtVarOuw);
                    com.bytedance.sdk.openadsdk.vm.lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.5.1
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            ouwVar.f8751lh = "reward";
                            return ouwVar;
                        }
                    });
                }
            }

            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                String message;
                if (iOException != null) {
                    message = iOException.getMessage();
                } else {
                    message = "";
                }
                vtVar.ouw(-2, message);
                if (lhVar != null) {
                    String strFkw = lhVar.fkw();
                    com.bytedance.sdk.openadsdk.utils.zin.ouw(strFkw);
                    com.bytedance.sdk.openadsdk.rn.ouw.fkw.ouw("reward", strFkw, -1, message);
                }
                com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.jqy.5.4
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        ouwVar.f8751lh = "reward";
                        return ouwVar;
                    }
                });
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final JSONObject ouw(JSONObject jSONObject) {
        try {
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            String strOptString2 = jSONObject.optString("auction_price", "");
            String strOuw = ouw(iOptInt, strOptString);
            if (TextUtils.isEmpty(strOuw)) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(strOuw);
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

    public static String ouw(int i4, String str) {
        Object obj;
        if (i4 == 3) {
            return com.bytedance.sdk.component.utils.ouw.vt(str);
        }
        if (i4 == 4) {
            Pair<Integer, String> pairDecryptType4 = PangleEncryptManager.decryptType4(str);
            if (pairDecryptType4 != null && (obj = pairDecryptType4.second) != null) {
                String str2 = (String) obj;
                tc.ouw(true);
                return str2;
            }
            tc.ouw(false);
            tc.ouw(2, PangleEncryptConstant.CryptDataScene.GET_ADS, pairDecryptType4 != null ? ((Integer) pairDecryptType4.first).intValue() : 0);
        }
        return null;
    }

    private static void ouw(com.bytedance.sdk.component.ra.vt.yu yuVar, JSONObject jSONObject) {
        try {
            if (lh(jSONObject) && jSONObject.optInt("cypher") == 4) {
                yuVar.vt("x-pgli18n", "4");
                yuVar.vt("Content-Type", "application/json; charset=utf-8");
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouw() {
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarOuw = null;
        if (!com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            return null;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tpl_fetch_model", "date", 0L);
        String strOuw = zih.yu().pno.ouw("dyn_draw_engine_url", com.bytedance.sdk.openadsdk.core.settings.cf.yu);
        String strVt = com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("tpl_fetch_model", "last_url", "");
        if (jCurrentTimeMillis <= (zih.yu().pno.ouw("fetch_tpl_second", 0) > 0 ? r13 : 0) && jCurrentTimeMillis >= 0 && TextUtils.equals(strOuw, strVt)) {
            String strVt2 = com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("tpl_fetch_model", "model", "");
            try {
                if (!TextUtils.isEmpty(strVt2)) {
                    return com.bytedance.sdk.component.adexpress.ouw.lh.ouw.ouw(strVt2);
                }
            } catch (Exception unused) {
            }
        }
        try {
            com.bytedance.sdk.component.ra.vt.vt vtVarVt = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.vt();
            String strOuw2 = com.bytedance.sdk.openadsdk.bly.lh.ouw(strOuw);
            vtVarVt.ouw(strOuw2);
            com.bytedance.sdk.component.ra.vt vtVarOuw = vtVarVt.ouw();
            if (vtVarOuw == null || !vtVarOuw.pno) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(vtVarOuw.yu);
            jSONObject.put("template_fetch_url", strOuw2);
            ouwVarOuw = com.bytedance.sdk.component.adexpress.ouw.lh.ouw.ouw(jSONObject);
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tpl_fetch_model", "date", Long.valueOf(System.currentTimeMillis() / 1000));
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tpl_fetch_model", "model", jSONObject.toString());
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("tpl_fetch_model", "last_url", strOuw);
            return ouwVarOuw;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("NetApiImpl", th2.getMessage());
            return ouwVarOuw;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vpp
    public final void ouw(String str) {
        com.bytedance.sdk.component.ra.vt.vt vtVarVt = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.vt();
        vtVarVt.ouw(str);
        vtVarVt.f7626le = "upload_bidding";
        vtVarVt.ra = 7;
        vtVarVt.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.jqy.6
            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar) {
                com.bytedance.sdk.component.utils.ko.vt("client bidding success", vtVar.yu);
            }

            @Override // com.bytedance.sdk.component.ra.ouw.ouw
            public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                com.bytedance.sdk.component.utils.ko.vt("client bidding fail", iOException.toString());
            }
        });
    }

    public static /* synthetic */ void ouw(vpp.vt vtVar) {
        vtVar.ouw(-1, pno.ouw(-1));
    }
}
