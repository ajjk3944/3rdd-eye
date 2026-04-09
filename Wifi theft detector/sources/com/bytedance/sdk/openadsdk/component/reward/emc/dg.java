package com.bytedance.sdk.openadsdk.component.reward.emc;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg {
    private final com.bytedance.sdk.openadsdk.component.reward.emc.emc bw;
    private boolean dg;
    com.bytedance.sdk.openadsdk.ul.emc.emc.xq emc;
    private final String xq;
    private final rie ypw;

    public interface emc {
        void emc(View view, float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray, int i10, int i11, int i12);

        void emc(String str, JSONObject jSONObject);
    }

    public dg(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        this.bw = emcVar;
        this.ypw = emcVar.ypw;
        this.xq = emcVar.bw;
    }

    private void dg() {
        if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq() && this.ypw.sx() == 4) {
            this.emc = com.bytedance.sdk.openadsdk.ul.emc.emc.dg.emc(this.bw.vw, this.xq);
        }
        if (this.emc == null) {
            this.emc = com.bytedance.sdk.openadsdk.ul.emc.emc.dg.emc(this.bw.mxo, this.xq);
        }
    }

    public void emc() {
        if (this.dg) {
            return;
        }
        this.dg = true;
        dg();
    }

    public com.bytedance.sdk.openadsdk.ul.emc.emc.xq xq() {
        return this.emc;
    }

    public void ypw() {
        com.bytedance.sdk.openadsdk.ul.emc.emc.xq xqVar = this.emc;
        if (xqVar != null) {
            xqVar.emc(this.ypw);
        }
    }

    public void emc(View view, float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray, int i10, int i11, int i12, emc emcVar) {
        if (this.emc != null) {
            int id = view.getId();
            if (id == com.bytedance.sdk.openadsdk.utils.vk.uym) {
                emcVar.emc("click_play_star_level", null);
                return;
            }
            if (id == com.bytedance.sdk.openadsdk.utils.vk.ycc) {
                emcVar.emc("click_play_star_nums", null);
                return;
            } else if (id == com.bytedance.sdk.openadsdk.utils.vk.bw) {
                emcVar.emc("click_play_source", null);
                return;
            } else {
                if (id == com.bytedance.sdk.openadsdk.utils.vk.dg) {
                    emcVar.emc("click_play_logo", null);
                    return;
                }
                return;
            }
        }
        emcVar.emc(view, f10, f11, f12, f13, sparseArray, i10, i11, i12);
    }
}
