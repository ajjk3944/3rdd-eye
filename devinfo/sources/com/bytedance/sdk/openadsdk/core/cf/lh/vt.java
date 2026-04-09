package com.bytedance.sdk.openadsdk.core.cf.lh;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.bly.ko;
import com.bytedance.sdk.openadsdk.core.model.rn;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    private final boolean fkw;

    /* renamed from: lh, reason: collision with root package name */
    private vpp f8141lh;
    public lh ouw;
    private Context vt;
    private com.bytedance.sdk.openadsdk.core.cf.lh.ouw yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        public static lh ouw(Context context, vpp vppVar, boolean z3) {
            if (rn.ouw(vppVar, z3)) {
                return new yu(context, vppVar, z3);
            }
            return null;
        }
    }

    public vt(Context context, vpp vppVar) {
        this(context, vppVar, false);
    }

    public final void lh() {
        lh lhVar = this.ouw;
        if (lhVar != null) {
            lhVar.lh();
        }
    }

    public final void ouw(ko koVar) {
        lh lhVarOuw = ouw.ouw(this.vt, this.f8141lh, this.fkw);
        this.ouw = lhVarOuw;
        if (lhVarOuw != null) {
            lhVarOuw.ouw();
            this.ouw.ouw(koVar);
        }
    }

    public final View vt() {
        lh lhVar = this.ouw;
        if (lhVar != null) {
            return lhVar.yu();
        }
        return null;
    }

    public vt(Context context, vpp vppVar, boolean z3) {
        this.vt = context;
        this.f8141lh = vppVar;
        this.fkw = z3;
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.cf.lh.ouw ouwVar) {
        this.yu = ouwVar;
        lh lhVar = this.ouw;
        if (lhVar != null) {
            lhVar.ouw(ouwVar);
        }
    }

    public final void ouw() {
        lh lhVar = this.ouw;
        if (lhVar != null) {
            lhVar.vt();
        }
    }
}
