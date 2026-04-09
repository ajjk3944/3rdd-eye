package com.bytedance.sdk.openadsdk.activity;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.tlj;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final boolean jqy() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final FrameLayout od() {
        return this.vt.jae.ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ex();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void ouw(long j, long j8) throws NumberFormatException {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        int iNg = this.vt.vt.ng();
        boolean z3 = this.vt.jae.yu() && iNg >= 0;
        int i4 = (int) (j / 1000);
        vt(j, j8);
        tlj tljVar = this.vt.jae;
        if (tljVar != null && (yuVar = tljVar.ouw) != null) {
            yuVar.setTime(String.valueOf(this.f7701le), i4, 0, false);
            this.vt.jae.ouw.ouw(j, j8);
        }
        int i10 = this.f7701le;
        if (i10 > 0) {
            if (!z3) {
                this.vt.uoy.ouw(String.valueOf(i10), null);
                return;
            }
            if (i4 < iNg) {
                this.vt.uoy.ouw(String.valueOf(i10), null);
                return;
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
            int i11 = ouwVar.vt.fvf;
            if (i11 == 5 || i11 == 33) {
                ouwVar.uoy.ouw(String.valueOf(i10), null);
                return;
            }
            ouwVar.ouw(true);
            this.vt.uoy.ouw(String.valueOf(this.f7701le), TTAdDislikeToast.getSkipText());
            this.vt.uoy.fkw(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final Map<String, Object> uq() {
        return this.vt.lh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final boolean vpp() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void bly() {
    }
}
