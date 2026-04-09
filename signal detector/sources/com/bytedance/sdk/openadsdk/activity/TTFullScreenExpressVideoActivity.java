package com.bytedance.sdk.openadsdk.activity;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.rie;
import java.util.Map;

/* loaded from: classes.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void cuf() throws NumberFormatException {
        if (rie.bw(this.ypw.ypw)) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar = this.ypw.hxp;
        if (zzVar == null || zzVar.emc() == null) {
            return;
        }
        this.ypw.hxp.emc().setTime("0", 0, 0, false);
        if (this.ypw.hxp.zz()) {
            this.ypw.cuf.emc("0", "X");
            this.ypw.cuf.bw(true);
            this.ypw.cuf.xq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean db() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean ee() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void emc(long j6, long j7) throws NumberFormatException {
        int i = (int) (j6 / 1000);
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar = this.ypw.hxp;
        if (zzVar != null && zzVar.emc() != null) {
            this.ypw.hxp.emc().setTime(String.valueOf(this.ycc), i, 0, false);
            this.ypw.hxp.emc().emc(j6, j7);
        }
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar2 = this.ypw.hxp;
        if ((zzVar2 == null || !zzVar2.zz()) && !this.ypw.ypw.tze()) {
            return;
        }
        xq(i);
        if (this.ycc >= 0) {
            this.ypw.cuf.dg(true);
            this.ypw.cuf.emc(String.valueOf(this.ycc), null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        sb();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void qh() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public Map<String, Object> rtt() {
        return this.ypw.zz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout xmt() {
        return this.ypw.hxp.ypw();
    }
}
