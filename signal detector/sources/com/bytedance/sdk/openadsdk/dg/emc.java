package com.bytedance.sdk.openadsdk.dg;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.db;
import com.bytedance.sdk.openadsdk.utils.iyl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc implements com.bytedance.sdk.component.ycc.emc.dg.emc.ypw {
    private String aa;
    private long bw;
    private String cf;
    private long dg;
    public final String emc;
    private String hxp;
    private int msw;
    private String qh;
    private int rie;
    private String sba;
    private String sra;
    private final AtomicBoolean sup;
    private JSONObject sz;
    private com.bytedance.sdk.openadsdk.dg.ypw.emc ul;
    private int uym;
    private String vk;
    private boolean xq;
    private final String ycc;
    private String ylm;
    protected final JSONObject ypw;
    private String yzg;
    private int zz;
    private static final Set<String> ru = new HashSet(Arrays.asList("insight_log"));
    private static final Map<String, String> gbl = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.dg.emc.1
        {
            put("id", "extra_id");
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

    /* renamed from: com.bytedance.sdk.openadsdk.dg.emc$emc, reason: collision with other inner class name */
    public static final class C0085emc {
        private int aa;
        private String bw;
        private com.bytedance.sdk.openadsdk.dg.ypw.emc cf;
        private String dg;
        public int emc;
        private String gbl;
        private String msw;
        private com.bytedance.sdk.openadsdk.dg.ypw.ypw qh;
        private JSONObject ru;
        private int sba;
        private final int sup;
        private String sz;
        private String ul;
        private String uym;
        private final long vk;
        private String xq;
        private String ycc;
        private String ypw;
        private boolean yzg;
        private String zz;

        public C0085emc(long j6, rie rieVar) {
            this.aa = -1;
            this.sba = -1;
            this.emc = -1;
            if (rieVar != null) {
                this.yzg = dr.ypw(rieVar);
                this.aa = rieVar.nw();
                this.sba = rieVar.fu();
                this.emc = rieVar.in();
            }
            this.vk = j6;
            this.sup = com.bytedance.sdk.component.utils.sba.xq(com.bytedance.sdk.openadsdk.core.aa.emc());
        }

        public C0085emc bw(String str) {
            this.msw = str;
            return this;
        }

        public C0085emc dg(String str) {
            this.bw = str;
            return this;
        }

        public C0085emc msw(String str) {
            this.ul = str;
            return this;
        }

        public C0085emc uym(String str) {
            this.uym = str;
            return this;
        }

        public C0085emc xq(String str) {
            this.dg = str;
            return this;
        }

        public C0085emc ycc(String str) {
            this.zz = str;
            return this;
        }

        public C0085emc ypw(String str) {
            this.xq = str;
            return this;
        }

        public C0085emc emc(String str) {
            this.sz = str;
            return this;
        }

        public C0085emc emc(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.ru = jSONObject;
            return this;
        }

        public void emc(com.bytedance.sdk.openadsdk.dg.ypw.emc emcVar) {
            com.bytedance.sdk.openadsdk.ycc.ypw.emc().emc(this.dg, this.ul, this.uym, this.xq);
            this.cf = emcVar;
            final emc emcVar2 = new emc(this);
            try {
                com.bytedance.sdk.openadsdk.dg.ypw.ypw ypwVar = this.qh;
                if (ypwVar != null) {
                    ypwVar.emc(emcVar2.ypw, this.vk);
                } else {
                    new com.bytedance.sdk.openadsdk.dg.ypw.xq().emc(emcVar2.ypw, this.vk);
                }
            } catch (Throwable unused) {
            }
            if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                iyl.xq(new com.bytedance.sdk.component.msw.msw("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.dg.emc.emc.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.dg.emc.ypw.emc(emcVar2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.dg.emc.ypw.emc(emcVar2);
            }
        }
    }

    public emc(String str, JSONObject jSONObject) {
        this.ycc = "adiff";
        this.sup = new AtomicBoolean(false);
        this.sz = new JSONObject();
        this.emc = str;
        this.ypw = jSONObject;
    }

    private boolean emc(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.getClass();
        switch (str2) {
        }
        return false;
    }

    private void uym() throws JSONException {
        this.ypw.putOpt("app_log_url", this.hxp);
        this.ypw.putOpt("tag", this.qh);
        this.ypw.putOpt("label", this.cf);
        this.ypw.putOpt("category", this.vk);
        if (!TextUtils.isEmpty(this.aa)) {
            try {
                this.ypw.putOpt("value", Long.valueOf(Long.parseLong(this.aa)));
            } catch (NumberFormatException unused) {
                this.ypw.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.yzg)) {
            try {
                this.ypw.putOpt("ext_value", Long.valueOf(Long.parseLong(this.yzg)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.sra)) {
            this.ypw.putOpt("log_extra", this.sra);
        }
        if (!TextUtils.isEmpty(this.ylm)) {
            try {
                this.ypw.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.ylm)));
            } catch (NumberFormatException unused3) {
            }
        }
        emc(this.ypw, this.cf);
        try {
            this.ypw.putOpt("nt", Integer.valueOf(this.rie));
        } catch (Exception unused4) {
        }
        Iterator<String> itKeys = this.sz.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.ypw.putOpt(next, this.sz.opt(next));
        }
    }

    private void ycc() {
        JSONObject jSONObject = this.sz;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("value");
            String strOptString2 = this.sz.optString("category");
            String strOptString3 = this.sz.optString("log_extra");
            if (emc(this.aa, this.vk, this.sra)) {
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(strOptString2) && !ypw(strOptString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(strOptString) || TextUtils.equals(strOptString, "0")) && (TextUtils.isEmpty(this.aa) || TextUtils.equals(this.aa, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.vk) || !ypw(this.vk)) && (TextUtils.isEmpty(strOptString2) || !ypw(strOptString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.sra) && TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        } else if (!emc(this.aa, this.vk, this.sra)) {
            return;
        }
        this.dg = com.bytedance.sdk.openadsdk.dg.emc.ypw.emc.incrementAndGet();
    }

    private boolean ypw(String str) {
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

    public boolean bw() {
        Set<String> setQh;
        if (this.ypw == null || (setQh = com.bytedance.sdk.openadsdk.core.aa.dg().qh()) == null) {
            return false;
        }
        String strOptString = this.ypw.optString("label");
        if (!TextUtils.isEmpty(strOptString)) {
            return setQh.contains(strOptString);
        }
        if (TextUtils.isEmpty(this.cf)) {
            return false;
        }
        return setQh.contains(this.cf);
    }

    public String dg() {
        return this.emc;
    }

    public JSONObject xq() {
        if (this.sup.get()) {
            return this.ypw;
        }
        try {
            uym();
            if (this.ypw.has("ad_extra_data")) {
                Object objOpt = this.ypw.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            this.ypw.put("ad_extra_data", emc((JSONObject) objOpt).toString());
                        } else if (objOpt instanceof String) {
                            this.ypw.put("ad_extra_data", emc(new JSONObject((String) objOpt)).toString());
                        }
                    } catch (JSONException e6) {
                        ul.xq("AdEvent", "json error", e6.getMessage());
                    }
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("adiff", this.emc);
                    if (this.xq) {
                        jSONObject.put("interaction_method", this.uym);
                        jSONObject.put("real_interaction_method", this.msw);
                        jSONObject.put("image_mode", this.zz);
                    }
                    this.ypw.put("ad_extra_data", jSONObject.toString());
                } catch (JSONException e7) {
                    ul.xq("AdEvent", "json error", e7.getMessage());
                }
            }
            this.sup.set(true);
        } catch (Throwable unused) {
        }
        return this.ypw;
    }

    private void ypw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : gbl.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object objOpt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(gbl.get(str), objOpt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private JSONObject emc(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.emc);
            }
            if (this.xq) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.uym);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.msw);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.zz);
                }
            }
            ypw(jSONObject);
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.emc + "-" + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th) {
            ul.xq("AdEvent", th.getMessage() == null ? "error " : th.getMessage());
            return jSONObject;
        }
    }

    public emc(C0085emc c0085emc) throws JSONException {
        this.ycc = "adiff";
        this.sup = new AtomicBoolean(false);
        this.sz = new JSONObject();
        if (!TextUtils.isEmpty(c0085emc.ypw)) {
            this.emc = c0085emc.ypw;
        } else {
            this.emc = db.emc();
        }
        this.ul = c0085emc.cf;
        this.sra = c0085emc.ycc;
        this.qh = c0085emc.xq;
        this.cf = c0085emc.dg;
        if (!TextUtils.isEmpty(c0085emc.bw)) {
            this.vk = c0085emc.bw;
        } else {
            this.vk = "app_union";
        }
        this.ylm = c0085emc.gbl;
        this.aa = c0085emc.msw;
        this.yzg = c0085emc.zz;
        this.sba = c0085emc.uym;
        this.rie = c0085emc.sup;
        this.hxp = c0085emc.sz;
        this.sz = c0085emc.ru = c0085emc.ru != null ? c0085emc.ru : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.ypw = jSONObject;
        if (!TextUtils.isEmpty(c0085emc.sz)) {
            try {
                jSONObject.put("app_log_url", c0085emc.sz);
            } catch (JSONException e6) {
                ul.xq("AdEvent", e6.getMessage());
            }
        }
        this.uym = c0085emc.aa;
        this.msw = c0085emc.sba;
        this.zz = c0085emc.emc;
        this.xq = c0085emc.yzg;
        this.bw = System.currentTimeMillis();
        ycc();
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc.ypw
    public long ypw() {
        return this.dg;
    }

    public JSONObject emc(boolean z6) {
        JSONObject jSONObjectXq = xq();
        try {
            if (z6) {
                JSONObject jSONObject = new JSONObject(jSONObjectXq.toString());
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                if (jSONObjectOptJSONObject == null) {
                    return jSONObject;
                }
                jSONObjectOptJSONObject.remove("app_log_url");
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(jSONObjectXq.toString());
            jSONObject2.remove("app_log_url");
            return jSONObject2;
        } catch (JSONException e6) {
            ul.xq("AdEvent", e6.getMessage());
            return jSONObjectXq;
        }
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc.ypw
    public JSONObject emc(String str) {
        return xq();
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc.ypw
    public long emc() {
        return this.bw;
    }

    private static void emc(JSONObject jSONObject, String str) {
        try {
            Set<String> set = ru;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th) {
            ul.xq("AdEvent", th);
        }
    }
}
