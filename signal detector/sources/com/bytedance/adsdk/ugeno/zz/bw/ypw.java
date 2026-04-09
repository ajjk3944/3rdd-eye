package com.bytedance.adsdk.ugeno.zz.bw;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.adsdk.ugeno.ypw.xq;
import org.json.JSONException;

/* loaded from: classes.dex */
public class ypw extends xq<emc> {
    private static final int nx = Color.parseColor("#FFC642");
    private static final int zhk = Color.parseColor("#e3e3e4");
    private int dpk;
    private int emc;
    private float ge;
    private float hh;
    private float oa;

    public ypw(Context context) {
        super(context);
        this.emc = nx;
        this.dpk = zhk;
        this.hh = 4.0f;
        this.ge = 20.0f;
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
        if (lt()) {
            ((emc) this.bw).emc(this.hh, this.emc, this.dpk, this.ge, (int) this.oa);
        } else {
            ((emc) this.bw).emc(this.hh, this.emc, this.dpk, this.ge, 5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void emc(String str, String str2) {
        super.emc(str, str2);
        str.getClass();
        switch (str) {
            case "highLightColor":
            case "highlightColor":
                this.emc = com.bytedance.adsdk.ugeno.uym.emc.emc(str2);
                break;
            case "lowLightColor":
            case "lowlightColor":
                this.dpk = com.bytedance.adsdk.ugeno.uym.emc.emc(str2, zhk);
                break;
            case "gap":
                this.oa = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "size":
                this.ge = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 20.0f);
                break;
            case "score":
                this.hh = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 4.0f);
                break;
        }
    }
}
