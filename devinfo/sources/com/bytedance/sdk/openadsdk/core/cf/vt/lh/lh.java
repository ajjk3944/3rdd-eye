package com.bytedance.sdk.openadsdk.core.cf.vt.lh;

import android.content.Context;
import android.view.View;
import com.bytedance.adsdk.ugeno.ra.ra;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh extends com.bytedance.adsdk.ugeno.vt.lh<ouw> {
    private float fn;
    private int ln;
    private String ouw;
    private int qni;
    private float smu;

    public lh(Context context) {
        super(context);
        this.ouw = "line";
        this.ln = com.bytedance.adsdk.ugeno.ra.ouw.ouw("#FFD813", -16777216);
        this.qni = com.bytedance.adsdk.ugeno.ra.ouw.ouw("rgba(0, 0, 0, 0.5)", -16777216);
        this.smu = ra.ouw(this.vt, 1.0f);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        super.ouw(str, str2);
        str.getClass();
        switch (str) {
            case "progressBackgroundColor":
                this.qni = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, -16777216);
                break;
            case "progressSize":
                this.smu = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 1.0f));
                break;
            case "progressType":
                this.ouw = str2;
                break;
            case "progressColor":
                this.ln = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, -16777216);
                break;
            case "barRadius":
                if (com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f) > 0.0f) {
                    this.fn = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f));
                    break;
                } else {
                    this.fn = 0.0f;
                    break;
                }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() throws JSONException {
        super.vt();
        ouw ouwVar = (ouw) this.fkw;
        ouwVar.vt = this.ouw;
        ouw ouwVarVt = ouwVar.ouw(this.ln).vt(this.qni);
        ouwVarVt.ouw = this.fn;
        ouwVarVt.ouw(this.smu);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        ouw ouwVar = new ouw(this.vt);
        ouwVar.f8163lh = this;
        return ouwVar;
    }
}
