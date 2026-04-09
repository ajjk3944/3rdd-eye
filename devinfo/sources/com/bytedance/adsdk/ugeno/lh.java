package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.ryl;
import com.bytedance.adsdk.ugeno.ra.ra;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Deprecated
/* loaded from: classes.dex */
public final class lh extends com.bytedance.adsdk.ugeno.vt.ouw<com.bytedance.adsdk.ugeno.le.vt> {
    private float baa;
    private float byv;
    private String ehk;
    private float eot;
    private int fg;
    private float fn;

    /* renamed from: ki, reason: collision with root package name */
    private boolean f6905ki;
    private String ln;
    private float mu;
    private JSONArray nn;
    private boolean qni;
    private boolean smu;
    private float xne;
    private int xwt;
    private com.bytedance.adsdk.ugeno.vt.lh zjq;

    public lh(Context context) {
        super(context);
        this.qni = true;
        this.smu = true;
        this.fn = 0.0f;
        this.byv = 2000.0f;
        this.ehk = "normal";
        this.f6905ki = true;
        this.xwt = Color.parseColor("#666666");
        this.fg = Color.parseColor("#ffffff");
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(JSONObject jSONObject) {
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw, com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() throws JSONException, Resources.NotFoundException {
        super.vt();
        JSONArray jSONArray = this.nn;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        com.bytedance.adsdk.ugeno.le.ouw ouwVarRa = ((com.bytedance.adsdk.ugeno.le.vt) this.fkw).fkw((int) this.eot).le((int) this.mu).ra((int) this.xne);
        ouwVarRa.yu = this.f6905ki;
        com.bytedance.adsdk.ugeno.le.ouw ouwVarVt = ouwVarRa.lh(this.fg).yu(this.xwt).vt(this.ehk).vt(this.qni);
        ouwVarVt.f6898lh = this.baa;
        ouwVarVt.ouw(this.smu).vt((int) this.byv).yu = this.f6905ki;
        for (int i4 = 0; i4 < this.nn.length(); i4++) {
            ryl rylVar = new ryl(this.vt);
            rylVar.ouw(this.kfa);
            com.bytedance.adsdk.ugeno.vt.lh<View> lhVarOuw = rylVar.ouw(this.zjq.jqy(), (com.bytedance.adsdk.ugeno.vt.lh<View>) null);
            rylVar.vt(this.nn.optJSONObject(i4));
            ((com.bytedance.adsdk.ugeno.le.vt) this.fkw).ouw((com.bytedance.adsdk.ugeno.le.vt) lhVarOuw);
        }
        if (this.smu) {
            ((com.bytedance.adsdk.ugeno.le.vt) this.fkw).ouw();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final View ouw() {
        com.bytedance.adsdk.ugeno.le.vt vtVar = new com.bytedance.adsdk.ugeno.le.vt(this.vt);
        this.fkw = vtVar;
        vtVar.f6904cf = this;
        return vtVar;
    }

    public final void ouw(int i4) {
        T t10 = this.fkw;
        if (t10 != 0) {
            ((com.bytedance.adsdk.ugeno.le.vt) t10).cf(i4);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw
    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        this.zjq = lhVar;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        super.ouw(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "delayStart":
                this.fn = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case "indicatorColor":
                this.xwt = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, -16777216);
                break;
            case "nextMargin":
                this.xne = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f));
                break;
            case "effect":
                this.ehk = str2;
                break;
            case "direction":
                this.ln = str2;
                break;
            case "indicator":
                this.f6905ki = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, true);
                break;
            case "previousMargin":
                this.mu = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f));
                break;
            case "loop":
                this.qni = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, true);
                break;
            case "speed":
                this.byv = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 500.0f);
                break;
            case "pageCount":
                this.baa = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 1.0f);
                break;
            case "pageMargin":
                this.eot = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f));
                break;
            case "indicatorSelectedColor":
                this.fg = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, -16777216);
                break;
            case "autoplay":
                this.smu = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, true);
                break;
            case "dataList":
                this.nn = com.bytedance.adsdk.ugeno.ra.vt.ouw(str2, (JSONArray) null);
                break;
        }
    }
}
