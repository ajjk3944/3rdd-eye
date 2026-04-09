package com.bytedance.sdk.openadsdk.component.reward.ouw;

import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno {

    /* renamed from: lh, reason: collision with root package name */
    public static int f7971lh = 1;
    public static int vt = 0;
    public static int yu = 2;
    private final boolean fkw = true;
    public bly ouw;

    public pno(ouw ouwVar, vpp vppVar) {
        this.ouw = od.le(vppVar) ? new ra(ouwVar) : new bly(ouwVar);
    }

    public static com.bytedance.sdk.openadsdk.zin.pno ouw() {
        return null;
    }

    public static com.bytedance.sdk.openadsdk.mwh.fkw vt() {
        return null;
    }

    public final void fkw() {
        bly blyVar = this.ouw;
        if (blyVar != null) {
            blyVar.ouw(Integer.MAX_VALUE);
        }
    }

    public final void le() {
        bly blyVar = this.ouw;
        if (blyVar != null) {
            blyVar.fkw();
        }
    }

    public final void lh() {
        bly blyVar = this.ouw;
        if (blyVar != null) {
            blyVar.yu();
        }
    }

    public final void pno() {
        bly blyVar = this.ouw;
        if (blyVar != null) {
            blyVar.lh();
        }
    }

    public final void ra() {
        bly blyVar = this.ouw;
        if (blyVar != null) {
            blyVar.mwh();
        }
    }

    public final void yu() {
        bly blyVar = this.ouw;
        if (blyVar != null) {
            blyVar.pno();
        }
    }

    public final void ouw(int i4) {
        bly blyVar = this.ouw;
        if (blyVar != null) {
            blyVar.ouw(i4);
        }
    }

    public final void vt(int i4) {
        bly blyVar;
        if (i4 == yu || (blyVar = this.ouw) == null) {
            return;
        }
        blyVar.le();
    }

    public final boolean lh(int i4) {
        bly blyVar;
        if (i4 != f7971lh || (blyVar = this.ouw) == null) {
            return false;
        }
        return blyVar.ryl();
    }

    public final void ouw(boolean z3) {
        bly blyVar = this.ouw;
        if (blyVar != null) {
            blyVar.lh(z3);
        }
    }
}
