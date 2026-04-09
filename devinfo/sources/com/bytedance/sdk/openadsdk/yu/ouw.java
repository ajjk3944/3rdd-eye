package com.bytedance.sdk.openadsdk.yu;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw implements com.bytedance.sdk.component.le.ouw.yu.ouw.vt {
    private int bly;
    private String ex;
    private long fkw;

    /* renamed from: jg, reason: collision with root package name */
    private String f8825jg;
    private int jqy;
    private String ko;

    /* renamed from: le, reason: collision with root package name */
    private final String f8826le;

    /* renamed from: lh, reason: collision with root package name */
    private boolean f8827lh;
    private JSONObject mwh;
    public final String ouw;
    private int pno;
    private com.bytedance.sdk.openadsdk.yu.vt.ouw qbp;
    private int ra;
    private String rn;
    private final AtomicBoolean ryl;

    /* renamed from: th, reason: collision with root package name */
    private String f8828th;
    private String vm;
    private String vpp;
    protected final JSONObject vt;
    private long yu;
    private String zih;
    private String zin;
    private static final Set<String> tlj = new HashSet(Arrays.asList("insight_log"));

    /* renamed from: cf, reason: collision with root package name */
    private static final Map<String, String> f8824cf = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.yu.ouw.1
        {
            put(FacebookMediationAdapter.KEY_ID, "extra_id");
            put("source", "extra_source");
            put("url", "extra_url");
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put("errorCode", "error_code");
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.yu.ouw$ouw, reason: collision with other inner class name */
    public static final class C0120ouw {
        JSONObject bly;

        /* renamed from: cf, reason: collision with root package name */
        final int f8833cf;
        String fkw;

        /* renamed from: jg, reason: collision with root package name */
        int f8834jg;
        int ko;

        /* renamed from: le, reason: collision with root package name */
        String f8835le;

        /* renamed from: lh, reason: collision with root package name */
        public String f8836lh;
        com.bytedance.sdk.openadsdk.yu.vt.ouw mwh;
        String ouw;
        public String pno;
        private final long qbp;
        public String ra;
        public int rn;
        String ryl;

        /* renamed from: th, reason: collision with root package name */
        private com.bytedance.sdk.openadsdk.yu.vt.vt f8837th;
        String tlj;
        String vm;
        public String vt;
        public String yu;
        boolean zih;

        public C0120ouw(long j, vpp vppVar) {
            this.f8834jg = -1;
            this.ko = -1;
            this.rn = -1;
            if (vppVar != null) {
                this.zih = od.vt(vppVar);
                this.f8834jg = vppVar.bs;
                this.ko = vppVar.fvf;
                this.rn = vppVar.ucs;
            }
            this.qbp = j;
            this.f8833cf = ksc.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 60000L);
        }

        public final C0120ouw ouw(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.bly = jSONObject;
            return this;
        }

        public final void ouw(com.bytedance.sdk.openadsdk.yu.vt.ouw ouwVar) {
            com.bytedance.sdk.openadsdk.le.vt.ouw().ouw(this.f8836lh, this.vm, this.f8835le, this.vt);
            this.mwh = ouwVar;
            final ouw ouwVar2 = new ouw(this);
            try {
                com.bytedance.sdk.openadsdk.yu.vt.vt vtVar = this.f8837th;
                if (vtVar != null) {
                    vtVar.ouw(ouwVar2.vt, this.qbp);
                } else {
                    new com.bytedance.sdk.openadsdk.yu.vt.lh().ouw(ouwVar2.vt, this.qbp);
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ko.lh("AdEvent", th2);
            }
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                bs.lh(new com.bytedance.sdk.component.pno.pno("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.yu.ouw.ouw.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw(ouwVar2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw(ouwVar2);
            }
        }
    }

    public ouw(String str, JSONObject jSONObject) {
        this.f8826le = "adiff";
        this.ryl = new AtomicBoolean(false);
        this.mwh = new JSONObject();
        this.ouw = str;
        this.vt = jSONObject;
    }

    private static boolean ouw(String str) {
        str.getClass();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    public final JSONObject fkw() {
        JSONObject jSONObjectYu = yu();
        try {
            JSONObject jSONObject = new JSONObject(jSONObjectYu.toString());
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            if (jSONObjectOptJSONObject == null) {
                return jSONObject;
            }
            jSONObjectOptJSONObject.remove("app_log_url");
            return jSONObject;
        } catch (JSONException e2) {
            qbp.lh("AdEvent", e2.getMessage());
            return jSONObjectYu;
        }
    }

    public final boolean le() {
        Set<String> setEy;
        if (this.vt == null || (setEy = com.bytedance.sdk.openadsdk.core.zih.yu().ey()) == null) {
            return false;
        }
        String strOptString = this.vt.optString("label");
        if (!TextUtils.isEmpty(strOptString)) {
            return setEy.contains(strOptString);
        }
        if (TextUtils.isEmpty(this.ko)) {
            return false;
        }
        return setEy.contains(this.ko);
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw.vt
    public final long lh() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw.vt
    public final long vt() {
        return this.fkw;
    }

    public JSONObject yu() {
        if (this.ryl.get()) {
            return this.vt;
        }
        try {
            this.vt.putOpt("app_log_url", this.ex);
            this.vt.putOpt("tag", this.f8825jg);
            this.vt.putOpt("label", this.ko);
            this.vt.putOpt("category", this.rn);
            if (!TextUtils.isEmpty(this.zih)) {
                try {
                    this.vt.putOpt("value", Long.valueOf(Long.parseLong(this.zih)));
                } catch (NumberFormatException unused) {
                    this.vt.putOpt("value", 0L);
                }
            }
            if (!TextUtils.isEmpty(this.f8828th)) {
                try {
                    this.vt.putOpt("ext_value", Long.valueOf(Long.parseLong(this.f8828th)));
                } catch (Exception unused2) {
                }
            }
            if (!TextUtils.isEmpty(this.vpp)) {
                this.vt.putOpt("log_extra", this.vpp);
            }
            if (!TextUtils.isEmpty(this.zin)) {
                try {
                    this.vt.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.zin)));
                } catch (NumberFormatException unused3) {
                }
            }
            JSONObject jSONObject = this.vt;
            String str = this.ko;
            try {
                Set<String> set = tlj;
                if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                    jSONObject.putOpt("is_ad_event", "1");
                }
            } catch (Throwable th2) {
                qbp.yu("AdEvent", th2);
            }
            try {
                this.vt.putOpt("nt", Integer.valueOf(this.jqy));
            } catch (Exception unused4) {
            }
            Iterator<String> itKeys = this.mwh.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                this.vt.putOpt(next, this.mwh.opt(next));
            }
            if (this.vt.has("ad_extra_data")) {
                Object objOpt = this.vt.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            com.bytedance.sdk.component.utils.ko.fkw("AdEvent", "ad_extra_data is JSONObject");
                            this.vt.put("ad_extra_data", ouw((JSONObject) objOpt).toString());
                        } else if (objOpt instanceof String) {
                            this.vt.put("ad_extra_data", ouw(new JSONObject((String) objOpt)).toString());
                        }
                    } catch (JSONException e2) {
                        qbp.yu("AdEvent", "json error", e2.getMessage());
                    }
                }
            } else {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("adiff", this.ouw);
                    if (this.f8827lh) {
                        jSONObject2.put("interaction_method", this.ra);
                        jSONObject2.put("real_interaction_method", this.pno);
                        jSONObject2.put("image_mode", this.bly);
                    }
                    this.vt.put("ad_extra_data", jSONObject2.toString());
                } catch (JSONException e10) {
                    qbp.yu("AdEvent", "json error", e10.getMessage());
                }
            }
            this.ryl.set(true);
        } catch (Throwable th3) {
            com.bytedance.sdk.component.utils.ko.lh("AdEvent", th3);
        }
        return this.vt;
    }

    private static boolean ouw(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.getClass();
        switch (str2) {
        }
        return false;
    }

    private JSONObject ouw(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.ouw);
            }
            if (this.f8827lh) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.ra);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.pno);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.bly);
                }
            }
            for (String str : f8824cf.keySet()) {
                try {
                    if (jSONObject.has(str)) {
                        Object objOpt = jSONObject.opt(str);
                        jSONObject.remove(str);
                        jSONObject.put(f8824cf.get(str), objOpt);
                    }
                } catch (Throwable unused) {
                }
            }
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.ouw + "-" + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th2) {
            qbp.lh("AdEvent", th2.getMessage() == null ? "error " : th2.getMessage());
            return jSONObject;
        }
    }

    public ouw(C0120ouw c0120ouw) throws JSONException {
        this.f8826le = "adiff";
        this.ryl = new AtomicBoolean(false);
        this.mwh = new JSONObject();
        if (TextUtils.isEmpty(c0120ouw.ouw)) {
            this.ouw = ex.ouw();
        } else {
            this.ouw = c0120ouw.ouw;
        }
        this.qbp = c0120ouw.mwh;
        this.vpp = c0120ouw.fkw;
        this.f8825jg = c0120ouw.vt;
        this.ko = c0120ouw.f8836lh;
        if (TextUtils.isEmpty(c0120ouw.yu)) {
            this.rn = "app_union";
        } else {
            this.rn = c0120ouw.yu;
        }
        this.zin = c0120ouw.tlj;
        this.zih = c0120ouw.ra;
        this.f8828th = c0120ouw.pno;
        this.vm = c0120ouw.f8835le;
        this.jqy = c0120ouw.f8833cf;
        this.ex = c0120ouw.ryl;
        JSONObject jSONObject = c0120ouw.bly;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        c0120ouw.bly = jSONObject;
        this.mwh = jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        this.vt = jSONObject2;
        if (!TextUtils.isEmpty(c0120ouw.ryl)) {
            try {
                jSONObject2.put("app_log_url", c0120ouw.ryl);
            } catch (JSONException e2) {
                qbp.lh("AdEvent", e2.getMessage());
            }
        }
        this.ra = c0120ouw.f8834jg;
        this.pno = c0120ouw.ko;
        this.bly = c0120ouw.rn;
        this.f8827lh = c0120ouw.zih;
        this.fkw = System.currentTimeMillis();
        JSONObject jSONObject3 = this.mwh;
        if (jSONObject3 == null) {
            if (!ouw(this.zih, this.rn, this.vpp)) {
                return;
            }
        } else {
            String strOptString = jSONObject3.optString("value");
            String strOptString2 = this.mwh.optString("category");
            String strOptString3 = this.mwh.optString("log_extra");
            if (ouw(this.zih, this.rn, this.vpp)) {
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(strOptString2) && !ouw(strOptString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(strOptString) || TextUtils.equals(strOptString, "0")) && (TextUtils.isEmpty(this.zih) || TextUtils.equals(this.zih, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.rn) || !ouw(this.rn)) && (TextUtils.isEmpty(strOptString2) || !ouw(strOptString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.vpp) && TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        }
        this.yu = com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw.incrementAndGet();
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw.vt
    public final JSONObject ouw() {
        return yu();
    }
}
