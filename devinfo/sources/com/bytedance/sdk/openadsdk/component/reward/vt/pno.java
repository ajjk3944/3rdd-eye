package com.bytedance.sdk.openadsdk.component.reward.vt;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.vt.vt;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno extends vt {
    com.bytedance.sdk.openadsdk.component.reward.view.lh ko;

    public pno(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        super(ouwVar);
    }

    public final FrameLayout ex() {
        com.bytedance.sdk.openadsdk.component.reward.view.lh lhVar = this.ko;
        if (lhVar != null) {
            return lhVar.getVideoContainer();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final boolean fkw() {
        return vpp.fkw(this.vt);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final boolean le() {
        return vpp.fkw(this.vt);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final void ouw(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.reward.view.lh lhVar = new com.bytedance.sdk.openadsdk.component.reward.view.lh(this.ouw.jvy, this.f8040cf);
        this.ko = lhVar;
        lhVar.setDownloadListener(this.ryl);
        com.bytedance.sdk.openadsdk.component.reward.view.lh lhVar2 = this.ko;
        vpp vppVar = this.vt;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        lhVar2.ouw(vppVar, ouwVar.f7969vh, ouwVar.ucs, this.f8039lh, this.yu);
        frameLayout.addView(this.ko.getInteractionStyleRootView());
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final void ra() {
        this.f8038le.yu(8);
        this.f8038le.vt(8);
        if (this.vt.rn() == 2) {
            this.pno.ouw(false);
            this.pno.lh(false);
            this.pno.yu(false);
            this.f8038le.le(8);
            return;
        }
        this.pno.ouw(this.vt.ksc());
        this.pno.lh(vpp.fkw(this.vt));
        this.pno.yu(vpp.fkw(this.vt));
        if (vpp.fkw(this.vt)) {
            this.f8038le.le(8);
        } else {
            this.pno.yu();
            this.f8038le.le(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final vt.ouw yu() {
        return new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.vt.pno.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt.ouw
            public final void ouw(boolean z3) {
                com.bytedance.sdk.openadsdk.component.reward.view.lh lhVar = pno.this.ko;
                if (lhVar != null) {
                    lhVar.setIsMute(z3);
                }
            }
        };
    }

    public static boolean ouw(vpp vppVar) {
        return (vppVar.ey() || vppVar.ex() == 100.0f) ? false : true;
    }
}
