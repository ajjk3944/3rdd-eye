package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public class PAGRequest {
    private String emc;
    private Bundle xq = null;
    private Map<String, Object> ypw;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.xq == null) {
            this.xq = new Bundle();
        }
        this.xq.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.emc;
    }

    public Map<String, Object> getExtraInfo() {
        return this.ypw;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.xq;
    }

    public void setAdString(String str) {
        this.emc = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.ypw = map;
    }
}
