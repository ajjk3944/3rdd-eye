package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import com.bytedance.sdk.openadsdk.component.reward.emc.aa;
import com.bytedance.sdk.openadsdk.component.reward.emc.cf;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class uym {
    private boolean bw;
    private aa dg;
    private final com.bytedance.sdk.openadsdk.component.reward.emc.emc emc;
    private boolean xq;
    private RFEndCardBackUpLayout ypw;

    public uym(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        this.emc = emcVar;
    }

    public boolean bw() {
        return this.bw;
    }

    public void dg() {
        aa aaVar = this.dg;
        if (aaVar != null) {
            aaVar.ypw();
        }
    }

    public void emc() {
        if (this.xq) {
            return;
        }
        this.xq = true;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = (RFEndCardBackUpLayout) this.emc.iyl.findViewById(vk.se);
        this.ypw = rFEndCardBackUpLayout;
        if (rFEndCardBackUpLayout != null) {
            rFEndCardBackUpLayout.init(this.emc);
        }
        if (this.emc.ypw.ak()) {
            this.dg = new aa(this.emc);
        }
    }

    public void xq() {
        aa aaVar = this.dg;
        if (aaVar != null) {
            aaVar.emc();
        }
    }

    public void ypw() {
        this.bw = true;
        vw.emc((View) this.ypw, 0);
    }

    public void emc(com.bytedance.sdk.openadsdk.core.xq.bw bwVar) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.ypw;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        vw.emc(rFEndCardBackUpLayout, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.uym.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        aa aaVar = this.dg;
        if (aaVar != null) {
            aaVar.emc(bwVar);
        }
    }

    public boolean emc(cf cfVar) {
        this.bw = true;
        aa aaVar = this.dg;
        if (aaVar == null || !aaVar.emc(cfVar)) {
            return false;
        }
        vw.emc((View) this.ypw, 0);
        return true;
    }

    public void emc(int i) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.ypw;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        rFEndCardBackUpLayout.setShownAdCount(i);
    }
}
