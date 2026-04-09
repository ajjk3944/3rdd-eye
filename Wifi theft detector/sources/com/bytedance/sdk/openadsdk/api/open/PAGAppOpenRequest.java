package com.bytedance.sdk.openadsdk.api.open;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes.dex */
public class PAGAppOpenRequest extends PAGRequest {
    private int emc;

    public int getTimeout() {
        return this.emc;
    }

    public void setTimeout(int i10) {
        this.emc = i10;
    }
}
