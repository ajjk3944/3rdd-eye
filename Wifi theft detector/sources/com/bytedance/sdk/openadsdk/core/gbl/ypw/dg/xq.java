package com.bytedance.sdk.openadsdk.core.gbl.ypw.dg;

import android.content.Context;
import com.bytedance.adsdk.ugeno.uym.msw;
import org.json.JSONException;

/* loaded from: classes.dex */
public class xq extends com.bytedance.adsdk.ugeno.ypw.xq<emc> {
    private int dpk;
    private String emc;
    private float ge;
    private int hh;
    private float oa;

    public xq(Context context) {
        super(context);
        this.emc = "line";
        this.dpk = com.bytedance.adsdk.ugeno.uym.emc.emc("#FFD813");
        this.hh = com.bytedance.adsdk.ugeno.uym.emc.emc("rgba(0, 0, 0, 0.5)");
        this.ge = msw.emc(this.ypw, 1.0f);
    }

    public void uym(int i10) {
        ((emc) this.bw).setAnimationDuration(i10);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    /* renamed from: xq, reason: merged with bridge method [inline-methods] */
    public emc emc() {
        emc emcVar = new emc(this.ypw);
        emcVar.emc(this);
        return emcVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void ypw() throws JSONException {
        super.ypw();
        ((emc) this.bw).emc(this.emc).emc(this.dpk).ypw(this.hh).ypw(this.oa).emc(this.ge);
    }

    public void emc(int i10) {
        ((emc) this.bw).setProgress(i10);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void emc(String str, String str2) {
        super.emc(str, str2);
        str.getClass();
        switch (str) {
            case "progressBackgroundColor":
                this.hh = com.bytedance.adsdk.ugeno.uym.emc.emc(str2);
                break;
            case "progressSize":
                this.ge = msw.emc(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 1.0f));
                break;
            case "progressType":
                this.emc = str2;
                break;
            case "progressColor":
                this.dpk = com.bytedance.adsdk.ugeno.uym.emc.emc(str2);
                break;
            case "barRadius":
                if (com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f) <= 0.0f) {
                    this.oa = 0.0f;
                    break;
                } else {
                    this.oa = msw.emc(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                    break;
                }
        }
    }
}
