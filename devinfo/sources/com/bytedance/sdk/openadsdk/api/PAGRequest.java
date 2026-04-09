package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class PAGRequest {

    /* renamed from: lh, reason: collision with root package name */
    private Bundle f7815lh = null;
    private String ouw;
    private Map<String, Object> vt;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.f7815lh == null) {
            this.f7815lh = new Bundle();
        }
        this.f7815lh.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.ouw;
    }

    public Map<String, Object> getExtraInfo() {
        return this.vt;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.f7815lh;
    }

    public void setAdString(String str) {
        this.ouw = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.vt = map;
    }
}
