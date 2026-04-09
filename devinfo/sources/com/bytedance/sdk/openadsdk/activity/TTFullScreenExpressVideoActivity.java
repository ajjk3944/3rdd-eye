package com.bytedance.sdk.openadsdk.activity;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.tlj;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void cd() throws NumberFormatException {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        if (vpp.fkw(this.vt.vt)) {
            finish();
            return;
        }
        tlj tljVar = this.vt.jae;
        if (tljVar == null || (yuVar = tljVar.ouw) == null) {
            return;
        }
        yuVar.setTime("0", 0, 0, false);
        if (this.vt.jae.yu()) {
            this.vt.uoy.ouw("0", "X");
            this.vt.uoy.fkw(true);
            this.vt.uoy.vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final boolean jqy() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final FrameLayout od() {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f7702lh;
        return (vtVar == null || !(vtVar instanceof com.bytedance.sdk.openadsdk.component.reward.vt.pno) || this.vt.kn) ? this.vt.jae.ouw() : ((com.bytedance.sdk.openadsdk.component.reward.vt.pno) vtVar).ex();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ex();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void ouw(long j, long j8) throws NumberFormatException {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        int i4 = (int) (j / 1000);
        tlj tljVar = this.vt.jae;
        if (tljVar != null && (yuVar = tljVar.ouw) != null) {
            yuVar.setTime(String.valueOf(this.f7701le), i4, 0, false);
            this.vt.jae.ouw.ouw(j, j8);
        }
        tlj tljVar2 = this.vt.jae;
        if ((tljVar2 == null || !tljVar2.yu()) && !this.vt.vt.lso()) {
            return;
        }
        vt(i4);
        if (this.f7701le >= 0) {
            this.vt.uoy.yu(true);
            this.vt.uoy.ouw(String.valueOf(this.f7701le), null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final Map<String, Object> uq() {
        return this.vt.lh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final boolean vpp() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void bly() {
    }
}
