package com.bytedance.sdk.openadsdk.activity;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class TTBaseLandingPageActivity extends TTBaseActivity {
    private long ouw;
    private long vt;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        long j = this.ouw;
        if (j > 0) {
            com.bytedance.sdk.openadsdk.utils.fkw.ouw(j);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        if (this.vt > 0) {
            this.ouw = (SystemClock.elapsedRealtime() - this.vt) + this.ouw;
            this.vt = 0L;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        WeakReference<vpp> weakReference = com.bytedance.sdk.openadsdk.utils.fkw.ouw;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.fkw.f8696lh = true;
        this.vt = SystemClock.elapsedRealtime();
    }
}
