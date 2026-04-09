package com.bytedance.sdk.openadsdk.component.reward.vt;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.openadsdk.component.reward.ouw.ko;
import com.bytedance.sdk.openadsdk.component.reward.ouw.rn;
import com.bytedance.sdk.openadsdk.component.reward.view.ryl;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw {
    protected com.bytedance.sdk.openadsdk.core.mwh.yu.vt bly;
    protected final ko fkw;

    /* renamed from: le, reason: collision with root package name */
    protected final ryl f8038le;

    /* renamed from: lh, reason: collision with root package name */
    protected int f8039lh;
    protected com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouw;
    protected final com.bytedance.sdk.openadsdk.component.reward.ouw.ryl pno;
    protected final rn ra;
    protected jae tlj;
    protected vpp vt;
    protected int yu;

    public ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.ouw = ouwVar;
        this.vt = ouwVar.vt;
        this.f8039lh = ouwVar.yib;
        this.yu = ouwVar.yhj;
        this.fkw = ouwVar.ex;
        this.f8038le = ouwVar.ey;
        this.ra = ouwVar.bs;
        this.pno = ouwVar.uoy;
    }

    public final void lh() {
        if (od.vt(this.ouw.vt) && DeviceUtils.ra() == 0) {
            this.ouw.f7958cj = true;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        ouwVar.uoy.vt(ouwVar.f7958cj);
    }

    public void ouw(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar, jae jaeVar) {
        this.bly = vtVar;
        this.tlj = jaeVar;
    }

    public final boolean vt() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        if (ouwVar.f7959gh == null && ouwVar.ex.vt() && (th.lh(this.ouw.vt) || !vpp.fkw(this.ouw.vt))) {
            return false;
        }
        if (!th.vt(this.ouw.vt) || !this.ouw.f7967th.get()) {
            return (this.ouw.tlj.get() || this.ouw.f7957cf.get()) ? false : true;
        }
        FrameLayout frameLayoutLe = this.ouw.ey.le();
        frameLayoutLe.setVisibility(4);
        frameLayoutLe.setVisibility(0);
        return false;
    }

    public final boolean ouw() {
        int i4;
        return this.ouw.vt.cd() || (i4 = this.ouw.vt.ucs) == 15 || i4 == 5 || i4 == 50;
    }

    public final void ouw(boolean z3) {
        if (this.ouw.tlj.get()) {
            return;
        }
        vpp vppVar = this.vt;
        if (vppVar != null && vppVar.lso()) {
            this.pno.lh(false);
            this.pno.ouw(true);
            this.ouw.ey.vt(8);
            this.ouw.ey.yu(8);
            return;
        }
        if (!z3) {
            this.pno.lh(false);
            this.pno.ouw(false);
            this.pno.yu(false);
            this.ouw.ey.le(8);
        } else {
            this.pno.ouw(this.ouw.vt.ksc());
            if (ouw()) {
                this.pno.lh(true);
            }
            if (!ouw() && (!(this instanceof ra) || !this.ouw.vt.lh())) {
                this.pno.yu();
                this.ouw.ey.le(0);
            } else {
                this.pno.yu(true);
            }
        }
        if (z3) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
            if (ouwVar.f7969vh != com.bytedance.sdk.openadsdk.component.reward.view.yu.ouw) {
                ouwVar.ey.vt(8);
                this.ouw.ey.yu(8);
                return;
            } else {
                ouwVar.ey.vt(0);
                this.ouw.ey.lh(0);
                this.ouw.ey.yu(0);
                return;
            }
        }
        this.ouw.ey.vt(4);
        this.ouw.ey.lh(8);
        this.ouw.ey.yu(8);
    }
}
