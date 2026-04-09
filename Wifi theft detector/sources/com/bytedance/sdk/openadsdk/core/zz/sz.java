package com.bytedance.sdk.openadsdk.core.zz;

import com.bytedance.sdk.openadsdk.utils.iyl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sz implements com.bytedance.adsdk.ugeno.core.sba, com.bytedance.sdk.component.adexpress.ypw.zz {
    private long bw;
    private final String dg;
    private final com.bytedance.sdk.openadsdk.dg.dg.bw emc;
    private final com.bytedance.sdk.openadsdk.core.model.rie xq;
    private boolean ycc;
    private final String ypw;

    public sz(com.bytedance.sdk.openadsdk.dg.dg.bw bwVar, String str, com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str2, boolean z10) {
        this.emc = bwVar;
        this.ypw = str;
        this.dg = str2;
        this.xq = rieVar;
        this.ycc = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.zz
    public void bw() {
        this.emc.ypw();
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.zz
    public void dg() {
        this.emc.emc();
    }

    public void gbl() {
        this.emc.gbl();
        this.emc.sup();
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.zz
    public void msw() {
        this.emc.qh();
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.zz
    public void ru() {
        this.emc.ypw();
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.zz
    public void uym() {
        this.emc.emc(true);
        this.emc.sz();
        iyl.ypw(new com.bytedance.sdk.component.msw.msw("native_success") { // from class: com.bytedance.sdk.openadsdk.core.zz.sz.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.dg.xq.ypw(sz.this.xq, sz.this.ypw, "dynamic_backup_render", (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.zz
    public void xq(int i10) {
        if (i10 == 3) {
            this.emc.dg("dynamic_sub_analysis2_end");
        } else {
            this.emc.dg("dynamic_sub_analysis_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.zz
    public void ycc(int i10) {
        final String str;
        System.currentTimeMillis();
        if (i10 == 3) {
            this.emc.uym("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.emc.uym("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.emc.emc(true);
        iyl.ypw(new com.bytedance.sdk.component.msw.msw("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.zz.sz.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.dg.xq.ypw(sz.this.xq, sz.this.ypw, str, (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.zz
    public void zz() {
        this.emc.cf();
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.zz
    public void bw(int i10) {
        if (i10 == 3) {
            this.emc.dg("dynamic_sub_render2_end");
        } else {
            this.emc.dg("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.zz
    public void dg(int i10) {
        if (i10 == 3) {
            this.emc.dg("dynamic_sub_render2_start");
        } else {
            this.emc.dg("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.zz
    public void emc(boolean z10) {
        this.emc.emc(z10 ? 1 : 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.zz
    public void ypw(int i10) {
        if (i10 == 3) {
            this.emc.dg("dynamic_sub_analysis2_start");
        } else {
            this.emc.dg("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.zz
    public void emc(int i10, String str) throws JSONException {
        this.emc.emc(i10, str);
        gbl.emc("Web", i10, str, this.ypw, this.dg, this.xq);
    }

    @Override // com.bytedance.adsdk.ugeno.core.sba
    public void xq() {
        this.emc.bw("ugen_sub_render_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.sba
    public void ypw() {
        this.emc.bw("ugen_sub_analysis_end");
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.zz
    public void emc(int i10) {
        this.bw = System.currentTimeMillis();
        if (i10 == 3) {
            this.emc.xq("dynamic_render2_start");
        } else {
            this.emc.xq("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.zz
    public void ycc() {
        this.emc.xq();
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.zz
    public void emc(int i10, int i11, String str, boolean z10) throws JSONException {
        if (!z10) {
            this.emc.emc(true);
        }
        if (i10 == 3) {
            this.emc.ypw(i11, "dynamic_render2_error");
        } else {
            this.emc.ypw(i11, "dynamic_render_error");
        }
        gbl.emc("NDR", i11, str, this.ypw, this.dg, this.xq);
    }

    @Override // com.bytedance.adsdk.ugeno.core.sba
    public void emc() {
        this.emc.emc("ugen_render_start", this.ycc);
        this.emc.bw("ugen_sub_analysis_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.sba
    public void emc(com.bytedance.adsdk.ugeno.core.aa aaVar) throws JSONException {
        if (aaVar.emc() == 0) {
            this.emc.bw("ugen_sub_render_end");
            this.emc.ycc("ugen_render_success");
        } else {
            this.emc.xq(aaVar.emc(), "ugen_render_error");
            gbl.emc("UGen", aaVar.emc(), aaVar.ypw(), this.ypw, this.dg, this.xq);
        }
        this.emc.emc(true);
    }
}
