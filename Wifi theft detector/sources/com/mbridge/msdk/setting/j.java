package com.mbridge.msdk.setting;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.internal.signals.SignalManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17026a = "j";

    public class a extends com.mbridge.msdk.foundation.same.net.wrapper.d {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            if (jSONObject == null || !jSONObject.has(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I)) {
                return;
            }
            try {
                g0.a().a(jSONObject.getString(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I));
            } catch (Exception e10) {
                q0.b(j.f17026a, e10.getMessage());
            }
        }
    }

    public class c extends com.mbridge.msdk.foundation.same.net.handler.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f17032b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f17033c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f17034d;

        public c(Context context, String str, String str2) {
            this.f17032b = context;
            this.f17033c = str;
            this.f17034d = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void a(String str) {
            com.mbridge.msdk.foundation.same.net.utils.d.h().f15182r = false;
            q0.a(j.f17026a, "fetch CNDSettingHost failed, errorCode = " + str);
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void b(String str) {
            q0.a(j.f17026a, "fetch CNDSettingHost success, content = " + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host_ts", System.currentTimeMillis());
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host", str);
            for (String str2 : str.split("\n")) {
                if (!TextUtils.isEmpty(str2.trim()) && !com.mbridge.msdk.foundation.same.net.utils.d.h().f15185u.contains(str2.trim())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f15185u.add(str2.trim());
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f15188x.add(str2.trim());
                }
            }
            j.this.a(this.f17032b, this.f17033c, this.f17034d);
        }
    }

    private String b() {
        String str = com.mbridge.msdk.foundation.same.net.utils.d.h().f15183s ? com.mbridge.msdk.foundation.same.net.utils.d.h().R : com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f15183s && com.mbridge.msdk.foundation.same.net.utils.d.h().f15182r && com.mbridge.msdk.foundation.same.net.utils.d.h().f15187w < com.mbridge.msdk.foundation.same.net.utils.d.h().f15188x.size()) {
                String str2 = com.mbridge.msdk.foundation.same.net.utils.d.h().f15188x.get(com.mbridge.msdk.foundation.same.net.utils.d.h().f15187w);
                if (!TextUtils.isEmpty(str2)) {
                    if (!str2.startsWith("http")) {
                        if (str2.startsWith(HttpRequest.DEFAULT_SCHEME)) {
                        }
                    }
                    return str2 + "/setting";
                }
            }
        } catch (Throwable th) {
            q0.b(f17026a, th.getMessage());
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a();
        } catch (Throwable th) {
            q0.b(f17026a, th.getMessage());
        }
    }

    public void d(Context context, String str, String str2) {
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f15182r) {
                return;
            }
            com.mbridge.msdk.foundation.same.net.utils.d.h().f15182r = true;
            if (System.currentTimeMillis() >= com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("mkey_spare_host_ts").longValue() + SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host");
                if (!TextUtils.isEmpty(strA)) {
                    for (String str3 : strA.split("\n")) {
                        if (!TextUtils.isEmpty(str3.trim()) && !com.mbridge.msdk.foundation.same.net.utils.d.h().f15185u.contains(str3.trim())) {
                            com.mbridge.msdk.foundation.same.net.utils.d.h().f15185u.add(str3.trim());
                            com.mbridge.msdk.foundation.same.net.utils.d.h().f15188x.add(str3.trim());
                        }
                    }
                    a(context, str, str2);
                    return;
                }
            }
            new com.mbridge.msdk.foundation.same.net.wrapper.c(context.getApplicationContext()).get(0, com.mbridge.msdk.foundation.same.net.utils.d.h().f15163c, new com.mbridge.msdk.foundation.same.net.wrapper.e(), new c(context, str, str2), "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        } catch (Throwable th) {
            com.mbridge.msdk.foundation.same.net.utils.d.h().f15182r = false;
            q0.b(f17026a, th.getMessage());
        }
    }

    public void c(Context context, String str, String str2) {
        a(context, str, str2, "1", new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2) {
        if (!com.mbridge.msdk.foundation.same.net.utils.d.h().g()) {
            d(context, str, str2);
        } else {
            b(context, str, str2);
        }
    }

    public void a(Context context, String str, String str2, String str3, com.mbridge.msdk.foundation.same.net.wrapper.d dVar) {
        if (context == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        eVar.a(MBridgeConstans.APP_ID, str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        try {
            g gVarB = h.b().b(str);
            String strZ0 = gVarB.z0();
            if (TextUtils.isEmpty(strZ0)) {
                strZ0 = "";
            }
            eVar.a("vtag", strZ0);
            eVar.a("current_pipeline_id", String.valueOf(gVarB.a0()));
            eVar.a("p_p_c_id", String.valueOf(gVarB.e0()));
            eVar.a("c_m_l_id", String.valueOf(gVarB.o()));
        } catch (Throwable th) {
            q0.b(f17026a, th.getMessage());
        }
        if (com.mbridge.msdk.foundation.same.net.utils.d.h().f15182r) {
            eVar.a("st_net", com.mbridge.msdk.foundation.same.net.utils.d.h().f15184t + "");
        }
        eVar.a("only_p_info", str3);
        com.mbridge.msdk.setting.net.c cVar = new com.mbridge.msdk.setting.net.c(context);
        String str4 = com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f15183s && com.mbridge.msdk.foundation.same.net.utils.d.h().f15182r && com.mbridge.msdk.foundation.same.net.utils.d.h().f15187w < com.mbridge.msdk.foundation.same.net.utils.d.h().f15188x.size()) {
                String str5 = com.mbridge.msdk.foundation.same.net.utils.d.h().f15188x.get(com.mbridge.msdk.foundation.same.net.utils.d.h().f15187w);
                if (!TextUtils.isEmpty(str5) && (str5.startsWith("http") || str5.startsWith(HttpRequest.DEFAULT_SCHEME))) {
                    str4 = str5 + "/setting";
                }
            }
        } catch (Throwable th2) {
            q0.b(f17026a, th2.getMessage());
        }
        cVar.get(1, str4, eVar, dVar, "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    public void b(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        a(context, str, str2, MBridgeConstans.ENDCARD_URL_TYPE_PL, new b(SameMD5.getMD5(v0.d()), h.b().f(str), str, context, str2));
        a(3, 0, "");
    }

    public class d extends com.mbridge.msdk.foundation.same.net.wrapper.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f17036b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f17037c;

        public d(String str, String str2) {
            this.f17036b = str;
            this.f17037c = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) throws JSONException {
            try {
                if (v0.a(jSONObject)) {
                    String strOptString = jSONObject.optString("vtag", "");
                    String strOptString2 = jSONObject.optString("rid", "");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("unitSetting");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
                        if (jSONObject.optInt("vtag_status", 0) == 1) {
                            String strF = h.b().f(this.f17036b, this.f17037c);
                            if (!TextUtils.isEmpty(strF)) {
                                try {
                                    jSONObjectOptJSONObject = h.b().a(new JSONObject(strF), jSONObjectOptJSONObject);
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                            }
                        }
                        jSONObjectOptJSONObject.put("current_time", System.currentTimeMillis());
                        jSONObjectOptJSONObject.put("vtag", strOptString);
                        jSONObjectOptJSONObject.put("rid", strOptString2);
                        h.b().a(this.f17036b, this.f17037c, jSONObjectOptJSONObject.toString());
                    }
                } else {
                    h.b().j(this.f17036b, this.f17037c);
                }
                j.this.a(1, 1, "");
            } catch (Exception e11) {
                q0.b(j.f17026a, e11.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            j.this.a(2, 1, "");
        }
    }

    public class b extends com.mbridge.msdk.foundation.same.net.wrapper.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f17028b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f17029c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f17030d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, Context context, String str4) {
            super(str, str2);
            this.f17028b = str3;
            this.f17029c = context;
            this.f17030d = str4;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) throws JSONException {
            try {
                j.this.a(1, 0, "");
            } catch (Throwable th) {
                q0.b(j.f17026a, th.getMessage());
            }
            try {
                if (v0.a(jSONObject)) {
                    if (jSONObject.optInt("vtag_status", 0) == 1) {
                        String strE = h.b().e(this.f17028b);
                        if (!TextUtils.isEmpty(strE)) {
                            try {
                                jSONObject = h.b().a(new JSONObject(strE), jSONObject);
                            } catch (Exception e10) {
                                q0.b(j.f17026a, e10.getMessage());
                            }
                        }
                    }
                    k.a(jSONObject);
                    jSONObject.put("current_time", System.currentTimeMillis());
                    if (com.mbridge.msdk.foundation.same.net.utils.d.h().f15183s) {
                        if (TextUtils.isEmpty(jSONObject.optString("hst_st_t"))) {
                            jSONObject.put("hst_st_t", com.mbridge.msdk.foundation.same.net.utils.d.h().f15177m);
                        }
                    } else if (TextUtils.isEmpty(jSONObject.optString("hst_st"))) {
                        jSONObject.put("hst_st", com.mbridge.msdk.foundation.same.net.utils.d.h().f15173i);
                    }
                    h.b().h(this.f17028b, jSONObject.toString());
                    com.mbridge.msdk.foundation.same.net.utils.d.h().j();
                    k.a();
                    try {
                        if (!TextUtils.isEmpty(jSONObject.optString("mraid_js"))) {
                            com.mbridge.msdk.setting.util.a.a().a(this.f17029c, jSONObject.optString("mraid_js"));
                        }
                    } catch (Exception e11) {
                        q0.b(j.f17026a, e11.getMessage());
                    }
                    if (!TextUtils.isEmpty(jSONObject.optString("web_env_url"))) {
                        com.mbridge.msdk.setting.util.b.c().a(this.f17029c, jSONObject.optString("web_env_url"));
                    }
                    j.this.a(this.f17029c, this.f17028b);
                } else {
                    h.b().i(this.f17028b);
                }
                j.this.c();
            } catch (Exception e12) {
                q0.b(j.f17026a, e12.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            try {
                j.this.a(2, 0, str);
            } catch (Throwable th) {
                q0.b(j.f17026a, th.getMessage());
            }
            if (!com.mbridge.msdk.foundation.same.net.utils.d.h().f15183s) {
                com.mbridge.msdk.foundation.same.net.utils.d.h().f15186v++;
            } else {
                com.mbridge.msdk.foundation.same.net.utils.d.h().f15187w++;
            }
            j.this.a(this.f17029c, this.f17028b, this.f17030d);
            j.this.c();
            q0.b(j.f17026a, "get app setting error" + str);
        }
    }

    public void a(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = com.mbridge.msdk.foundation.controller.c.n().b();
            str2 = com.mbridge.msdk.foundation.controller.c.n().c();
        }
        if (h.b().g(str3, str) && h.b().a(str, 2, str3)) {
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            String str4 = "[" + str3 + "]";
            eVar.a("unit_ids", str4);
            eVar.a(MBridgeConstans.APP_ID, str);
            eVar.a("sign", SameMD5.getMD5(str + str2));
            try {
                String strJ = h.b().d(str, str4).J();
                if (TextUtils.isEmpty(strJ)) {
                    strJ = "";
                }
                eVar.a("vtag", strJ);
            } catch (Throwable th) {
                q0.b(f17026a, th.getMessage());
            }
            d dVar = new d(str, str3);
            dVar.setUnitId(str3);
            new com.mbridge.msdk.setting.net.c(context).get(1, com.mbridge.msdk.foundation.same.net.utils.d.h().Q, eVar, dVar, "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            a(3, 1, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str) {
        g gVarD;
        h hVarB = h.b();
        if (hVarB != null && (gVarD = hVarB.d(str)) != null) {
            MBridgeConstans.OMID_JS_SERVICE_URL = gVarD.V();
            MBridgeConstans.OMID_JS_H5_URL = gVarD.U();
        }
        com.mbridge.msdk.omsdk.b.b(context);
        com.mbridge.msdk.omsdk.b.c(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, String str) {
        String strB;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("key", "2000112");
            eVar.a("st_net", Integer.valueOf(com.mbridge.msdk.foundation.same.net.utils.d.h().f15184t));
            eVar.a("result", Integer.valueOf(i10));
            eVar.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE, Integer.valueOf(i11));
            if (i11 == 0) {
                strB = b();
            } else {
                strB = com.mbridge.msdk.foundation.same.net.utils.d.h().f15183s ? com.mbridge.msdk.foundation.same.net.utils.d.h().R : com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
            }
            eVar.a("url", strB);
            eVar.a("reason", str);
            cVar.a("2000112", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000112", cVar);
        } catch (Throwable th) {
            q0.b(f17026a, th.getMessage());
        }
    }
}
