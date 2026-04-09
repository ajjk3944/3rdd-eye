package com.bytedance.sdk.openadsdk.core.gbl.ypw.emc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ypw.xq;
import com.bytedance.sdk.openadsdk.utils.vw;
import org.json.JSONException;

/* loaded from: classes.dex */
public class ypw extends xq<emc> {
    private int dpk;
    private int emc;
    private int ge;
    private int hh;
    private float nx;
    private int oa;
    private com.bytedance.sdk.openadsdk.core.gbl.ypw zhk;

    public ypw(Context context) {
        super(context);
        this.dpk = -1;
        this.hh = -1;
        emc(context);
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
        com.bytedance.adsdk.ugeno.zz.ycc.emc emcVarEmc = ((emc) this.bw).emc();
        if (emcVarEmc != null) {
            this.zhk.emc(emcVarEmc);
            ((emc) this.bw).emc(emcVarEmc);
        }
        ((emc) this.bw).emc(this.emc, this.dpk, this.hh, this.ge, this.oa, this.nx);
    }

    private void emc(Context context) {
        this.zhk = new com.bytedance.sdk.openadsdk.core.gbl.ypw(context, true);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void emc(String str, String str2) {
        super.emc(str, str2);
        str.getClass();
        switch (str) {
            case "barWidth":
                this.ge = vw.ypw(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                break;
            case "bottomBackgroundColor":
                if (!TextUtils.isEmpty(str2)) {
                    this.hh = Color.parseColor(str2);
                    break;
                }
                break;
            case "shadowColor":
            case "shadowOffsetX":
            case "shadowOffsetY":
            case "textAlign":
            case "textColor":
            case "textStyle":
            case "shadowBlur":
            case "textSize":
            case "textDecoration":
            case "fontWeight":
            case "lineHeight":
            case "text":
            case "lines":
            case "ellipsis":
            case "maxLines":
            case "letterSpacing":
                this.zhk.emc(str, str2);
                break;
            case "topBackgroundColor":
                if (!TextUtils.isEmpty(str2)) {
                    this.dpk = Color.parseColor(str2);
                    break;
                }
                break;
            case "barHeight":
                this.oa = vw.ypw(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                break;
            case "barRadius":
                this.nx = vw.ypw(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                break;
            case "downtime":
                this.emc = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq, com.bytedance.adsdk.ugeno.dg
    public void emc(Canvas canvas) {
        super.emc(canvas);
    }
}
