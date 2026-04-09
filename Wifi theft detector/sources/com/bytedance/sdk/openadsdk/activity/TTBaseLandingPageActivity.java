package com.bytedance.sdk.openadsdk.activity;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class TTBaseLandingPageActivity extends TTBaseActivity {
    private long emc;
    private long ypw;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        long j10 = this.emc;
        if (j10 > 0) {
            com.bytedance.sdk.openadsdk.utils.bw.emc(j10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        if (this.ypw > 0) {
            this.emc += SystemClock.elapsedRealtime() - this.ypw;
            this.ypw = 0L;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        if (com.bytedance.sdk.openadsdk.utils.bw.xq()) {
            this.ypw = SystemClock.elapsedRealtime();
        }
    }
}
