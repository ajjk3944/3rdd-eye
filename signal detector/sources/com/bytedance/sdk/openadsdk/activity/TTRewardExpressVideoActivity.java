package com.bytedance.sdk.openadsdk.activity;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import java.util.Map;

/* loaded from: classes.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean db() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean ee() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void emc(long j6, long j7) throws NumberFormatException {
        int iIw = this.ypw.ypw.iw();
        boolean z6 = this.ypw.hxp.zz() && iIw >= 0;
        int i = (int) (j6 / 1000);
        xq(j6, j7);
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar = this.ypw.hxp;
        if (zzVar != null && zzVar.emc() != null) {
            this.ypw.hxp.emc().setTime(String.valueOf(this.ycc), i, 0, false);
            this.ypw.hxp.emc().emc(j6, j7);
        }
        int i3 = this.ycc;
        if (i3 > 0) {
            if (!z6) {
                this.ypw.cuf.emc(String.valueOf(i3), null);
                return;
            }
            if (i < iIw) {
                this.ypw.cuf.emc(String.valueOf(i3), null);
                return;
            }
            if (this.ypw.ypw.fu() == 5 || this.ypw.ypw.fu() == 33) {
                this.ypw.cuf.emc(String.valueOf(this.ycc), null);
                return;
            }
            this.ypw.emc(true);
            this.ypw.cuf.emc(String.valueOf(this.ycc), TTAdDislikeToast.getSkipText());
            this.ypw.cuf.bw(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
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

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout xmt() {
        return this.ypw.hxp.ypw();
    }
}
