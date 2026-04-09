package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class TTAppOpenAdTransActivity extends TTAppOpenAdActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.msw || !vw.xq((Activity) this)) {
            return;
        }
        getWindow().getDecorView().setPadding(0, (int) vw.emc(), 0, 0);
    }
}
