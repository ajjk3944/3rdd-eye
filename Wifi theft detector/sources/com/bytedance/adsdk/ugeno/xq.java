package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.sup;
import com.bytedance.adsdk.ugeno.uym.msw;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class xq extends com.bytedance.adsdk.ugeno.ypw.emc<com.bytedance.adsdk.ugeno.ycc.ypw> {
    private boolean dor;
    private String dpk;
    private int etw;
    private boolean ge;
    private JSONArray gyw;
    private boolean hh;
    private float hs;
    private float iat;
    private float igv;
    private float kv;
    private float nx;
    private float oa;
    private com.bytedance.adsdk.ugeno.ypw.xq qp;
    private int sg;
    private String zhk;

    public xq(Context context) {
        super(context);
        this.hh = true;
        this.ge = true;
        this.oa = 0.0f;
        this.nx = 2000.0f;
        this.zhk = "normal";
        this.dor = true;
        this.sg = Color.parseColor("#666666");
        this.etw = Color.parseColor("#ffffff");
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void emc(JSONObject jSONObject) {
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.emc, com.bytedance.adsdk.ugeno.ypw.xq
    public void ypw() throws JSONException, Resources.NotFoundException {
        super.ypw();
        JSONArray jSONArray = this.gyw;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ycc.ypw) this.bw).uym((int) this.iat).msw((int) this.hs).zz((int) this.igv).xq(this.dor).bw(this.etw).ycc(this.sg).xq(this.zhk).dg(this.hh).bw(this.kv).emc(this.ge).dg((int) this.nx).xq(this.dor);
        for (int i10 = 0; i10 < this.gyw.length(); i10++) {
            sup supVar = new sup(this.ypw);
            supVar.emc(this.vhn);
            com.bytedance.adsdk.ugeno.ypw.xq<View> xqVarYpw = supVar.ypw(this.qp.xmt(), (com.bytedance.adsdk.ugeno.ypw.xq<View>) null);
            supVar.ypw(this.gyw.optJSONObject(i10));
            ((com.bytedance.adsdk.ugeno.ycc.ypw) this.bw).emc((com.bytedance.adsdk.ugeno.ycc.ypw) xqVarYpw);
        }
        if (this.ge) {
            ((com.bytedance.adsdk.ugeno.ycc.ypw) this.bw).xq();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public View emc() {
        com.bytedance.adsdk.ugeno.ycc.ypw ypwVar = new com.bytedance.adsdk.ugeno.ycc.ypw(this.ypw);
        this.bw = ypwVar;
        ypwVar.emc((dg) this);
        return this.bw;
    }

    public void emc(com.bytedance.adsdk.ugeno.ycc.xq xqVar) {
        T t10 = this.bw;
        if (t10 != 0) {
            ((com.bytedance.adsdk.ugeno.ycc.ypw) t10).setOnPageChangeListener(xqVar);
        }
    }

    public void emc(int i10) throws Resources.NotFoundException {
        T t10 = this.bw;
        if (t10 != 0) {
            ((com.bytedance.adsdk.ugeno.ycc.ypw) t10).sz(i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.emc
    public void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar) {
        this.qp = xqVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void emc(String str, String str2) {
        super.emc(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "delayStart":
                this.oa = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "indicatorColor":
                this.sg = com.bytedance.adsdk.ugeno.uym.emc.emc(str2);
                break;
            case "nextMargin":
                this.igv = msw.emc(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                break;
            case "effect":
                this.zhk = str2;
                break;
            case "direction":
                this.dpk = str2;
                break;
            case "indicator":
                this.dor = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, true);
                break;
            case "previousMargin":
                this.hs = msw.emc(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                break;
            case "loop":
                this.hh = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, true);
                break;
            case "speed":
                this.nx = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 500.0f);
                break;
            case "pageCount":
                this.kv = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 1.0f);
                break;
            case "pageMargin":
                this.iat = msw.emc(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                break;
            case "indicatorSelectedColor":
                this.etw = com.bytedance.adsdk.ugeno.uym.emc.emc(str2);
                break;
            case "autoplay":
                this.ge = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, true);
                break;
            case "dataList":
                this.gyw = com.bytedance.adsdk.ugeno.uym.ypw.emc(str2, (JSONArray) null);
                break;
        }
    }
}
