package com.bytedance.sdk.openadsdk.tc.vt;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.tc.vt.fkw;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh extends vt {

    /* renamed from: le, reason: collision with root package name */
    private int f8664le;

    public lh(Integer num, View view, vpp vppVar, fkw.ouw ouwVar) {
        super(num, view, vppVar, 1000, ouwVar);
        this.f8664le = -1;
        vt(view);
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final int fkw() {
        vpp vppVar = this.f8668lh;
        return (vppVar != null && vppVar.tpk && vppVar.uoy() == 1) ? 1000 : 100;
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final boolean lh() {
        WeakReference<View> weakReference = this.vt;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        View view = this.vt.get();
        if (this.f8664le == -1) {
            vt(view);
        }
        return le.ouw(view, this.f8664le == 1, this.f8668lh.lna);
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final void vt(int i4) {
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final void yu() {
        super.yu();
    }

    private void vt(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.f8664le = width * height >= 242500 ? 1 : 0;
        }
    }
}
