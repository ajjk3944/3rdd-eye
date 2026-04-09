package com.bytedance.sdk.openadsdk.core.bly;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vpp implements com.bytedance.sdk.openadsdk.core.cf.ra.lh {

    /* renamed from: le, reason: collision with root package name */
    private String f8097le;
    private long ouw = 0;
    private long vt = 0;

    /* renamed from: lh, reason: collision with root package name */
    private int f8098lh = 0;
    private String yu = null;
    private String fkw = null;
    private final AtomicBoolean ra = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
    public final void ouw(String str) {
        this.f8097le = str;
        this.ouw = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
    public final void vt(String str) {
        this.fkw = str;
        this.vt = SystemClock.elapsedRealtime();
        this.ra.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.ra.lh
    public final void ouw(int i4, String str, String str2) {
        this.f8098lh = i4;
        this.yu = str;
        this.fkw = str2;
        this.vt = SystemClock.elapsedRealtime();
        this.ra.set(false);
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str) {
        if (this.ra.get()) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, false, str, "success", this.vt - this.ouw, this.fkw, this.f8097le, 0, null);
        } else {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, false, str, "fail", this.vt - this.ouw, this.fkw, this.f8097le, this.f8098lh, this.yu);
        }
    }
}
