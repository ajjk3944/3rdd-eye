package com.bytedance.sdk.openadsdk.tc.vt;

import android.view.View;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.tc.vt.fkw;
import com.facebook.ads.AdError;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno extends vt {

    /* renamed from: le, reason: collision with root package name */
    private int f8666le;

    public pno(Integer num, View view, vpp vppVar, fkw.ouw ouwVar) {
        super(num, view, vppVar, AdError.SERVER_ERROR_CODE, ouwVar);
        this.f8666le = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final boolean bly() {
        int i4 = this.f8666le;
        boolean z3 = i4 == 2 || i4 == 0;
        if (z3) {
            this.yu.set(false);
        }
        return !z3 || super.bly();
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final int fkw() {
        return TTAdConstant.MATE_VALID;
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final boolean lh() {
        return le.ouw(this.vt.get(), false, this.f8668lh.lna) && this.f8666le == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final void ouw() {
        if (this.f8666le != 1) {
            return;
        }
        super.ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final void vt(int i4) {
        if (this.ouw.get()) {
            return;
        }
        if (i4 == 6 || i4 == 5) {
            this.f8666le = 0;
            ra();
        }
        if (i4 == 3 || i4 == 2) {
            this.f8666le = 2;
            ra();
        }
        if (this.f8666le == 1 || i4 != 0) {
            return;
        }
        this.f8666le = 1;
        ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final void yu() {
        super.yu();
    }
}
