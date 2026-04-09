package com.bytedance.sdk.openadsdk.core.model;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jae {
    private int bly;

    /* renamed from: cf, reason: collision with root package name */
    private int f8228cf;
    public int fkw;

    /* renamed from: le, reason: collision with root package name */
    public String f8229le;

    /* renamed from: lh, reason: collision with root package name */
    public String f8230lh;
    public int ouw;
    private String pno;
    private String ra;
    private String tlj;
    public String vt;
    public String yu;

    public final JSONObject fkw() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.ra)) {
                jSONObject.put("market_dpl", this.ra);
            }
            if (!TextUtils.isEmpty(this.pno)) {
                jSONObject.put("market_dpl_auto", this.pno);
            }
            if (!TextUtils.isEmpty(this.vt)) {
                jSONObject.put("market_pkg", this.vt);
            }
            if (!TextUtils.isEmpty(this.yu)) {
                jSONObject.put("app_pkg", this.yu);
            }
            if (!TextUtils.isEmpty(this.f8230lh)) {
                jSONObject.put("regex", this.f8230lh);
            }
            jSONObject.put("exec_type", this.bly);
            jSONObject.put("oem_vendor_type", this.ouw);
            jSONObject.put("overlay", this.fkw);
            jSONObject.put("gp_card", this.f8228cf);
            if (!TextUtils.isEmpty(this.f8229le)) {
                jSONObject.put("caller_id", this.f8229le);
            }
            if (!TextUtils.isEmpty(this.tlj)) {
                jSONObject.put("ext_map", this.tlj);
            }
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("OemModel", th2.getMessage());
            return null;
        }
    }

    public final boolean lh() {
        return this.f8228cf == 1;
    }

    public final boolean ouw() {
        return this.ouw == 1;
    }

    public final boolean vt() {
        return this.ouw == 2;
    }

    public final String yu() {
        return this.bly == 2 ? this.pno : this.ra;
    }

    public static jae ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        jae jaeVar = new jae();
        try {
            jaeVar.ra = jSONObject.optString("market_dpl", "");
            jaeVar.pno = jSONObject.optString("market_dpl_auto", "");
            jaeVar.bly = jSONObject.optInt("exec_type", 0);
            jaeVar.ouw = jSONObject.optInt("oem_vendor_type", 0);
            jaeVar.vt = jSONObject.optString("market_pkg", "");
            jaeVar.f8230lh = jSONObject.optString("regex", "");
            jaeVar.fkw = jSONObject.optInt("overlay", 1);
            jaeVar.f8229le = jSONObject.optString("caller_id", "");
            jaeVar.tlj = jSONObject.optString("ext_map", null);
            jaeVar.f8228cf = jSONObject.optInt("gp_card", 0);
            jaeVar.yu = jSONObject.optString("app_pkg", "");
            return jaeVar;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("OemModel", th2.getMessage());
            return jaeVar;
        }
    }

    public final void ouw(Intent intent) {
        if (TextUtils.isEmpty(this.tlj)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.tlj);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    intent.putExtra(next, (String) obj);
                } else if (obj instanceof Integer) {
                    intent.putExtra(next, (Integer) obj);
                } else if (obj instanceof Boolean) {
                    intent.putExtra(next, (Boolean) obj);
                } else if (obj instanceof Long) {
                    intent.putExtra(next, (Long) obj);
                } else if (obj instanceof Double) {
                    intent.putExtra(next, (Double) obj);
                } else if (!(obj instanceof Float)) {
                    com.bytedance.sdk.component.utils.ko.lh("OemModel", "Unsupported type ", next, obj);
                } else {
                    intent.putExtra(next, (Float) obj);
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.yu("OemModel", th2);
        }
    }
}
