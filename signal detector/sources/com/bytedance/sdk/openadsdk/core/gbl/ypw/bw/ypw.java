package com.bytedance.sdk.openadsdk.core.gbl.ypw.bw;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.sup;
import com.bytedance.adsdk.ugeno.dg;
import com.bytedance.adsdk.ugeno.ypw.xq;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw extends com.bytedance.adsdk.ugeno.ypw.emc<emc> {
    private int dpk;
    private int ge;
    private JSONArray hh;

    public ypw(Context context) {
        super(context);
        this.dpk = 0;
        this.ge = 0;
    }

    private void dg() throws JSONException {
        for (int i = 0; i < ((com.bytedance.adsdk.ugeno.ypw.emc) this).emc.size(); i++) {
            xq<View> xqVar = ((com.bytedance.adsdk.ugeno.ypw.emc) this).emc.get(i);
            if (xqVar != null) {
                sup supVar = new sup(this.ypw);
                supVar.emc(this.vhn);
                ((emc) this.bw).emc(supVar.emc(xqVar.xmt(), this.dg, (JSONObject) null));
            }
        }
    }

    private void xq() {
        List<xq<View>> list = ((com.bytedance.adsdk.ugeno.ypw.emc) this).emc;
        if (list == null || list.isEmpty()) {
            return;
        }
        xq<View> xqVar = ((com.bytedance.adsdk.ugeno.ypw.emc) this).emc.get(0);
        if (this.hh == null) {
            return;
        }
        for (int i = 0; i < this.hh.length(); i++) {
            sup supVar = new sup(this.ypw);
            supVar.emc(this.vhn);
            try {
                JSONObject jSONObjectOptJSONObject = this.hh.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    if (jSONObjectOptJSONObject.has("$chunk")) {
                        this.dg.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.dg.put("$item", jSONObjectOptJSONObject);
                    }
                    ((emc) this.bw).emc(supVar.emc(xqVar.xmt(), this.dg, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T extends android.view.View, android.view.View] */
    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public View emc() {
        try {
            emc emcVar = new emc(this.ypw);
            this.bw = emcVar;
            emcVar.emc((dg) this);
        } catch (Throwable unused) {
            this.bw = new View(this.ypw);
        }
        return this.bw;
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.emc, com.bytedance.adsdk.ugeno.ypw.xq
    public void ypw() throws JSONException {
        super.ypw();
        T t6 = this.bw;
        if (t6 instanceof emc) {
            ((emc) t6).setOrientation(this.dpk);
            ((emc) this.bw).emc(this);
            if (this.ge == 1) {
                dg();
            } else {
                xq();
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void emc(String str, String str2) {
        super.emc(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "driveMode":
                this.ge = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0);
                break;
            case "direction":
                if (TextUtils.equals(str2, "vertical")) {
                    this.dpk = 1;
                    break;
                } else {
                    this.dpk = 0;
                    break;
                }
            case "dataList":
                this.hh = com.bytedance.adsdk.ugeno.uym.ypw.emc(str2, (JSONArray) null);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.emc
    public void emc(xq xqVar) {
        if (xqVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ypw.emc) this).emc.add(xqVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.emc
    public void emc(xq xqVar, ViewGroup.LayoutParams layoutParams) {
        if (xqVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ypw.emc) this).emc.add(xqVar);
    }
}
