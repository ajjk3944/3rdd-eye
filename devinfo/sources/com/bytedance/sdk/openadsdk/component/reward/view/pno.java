package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.component.reward.ouw.zih;
import com.bytedance.sdk.openadsdk.utils.osn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno {
    public boolean fkw;

    /* renamed from: lh, reason: collision with root package name */
    public boolean f8025lh;
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouw;
    public RFEndCardBackUpLayout vt;
    public zih yu;

    public pno(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.ouw = ouwVar;
    }

    public final void ouw() {
        ko.vt("TTAD.RFBackUpEndCard", "show: ");
        this.fkw = true;
        osn.ouw((View) this.vt, 0);
    }

    public final boolean ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar) {
        this.fkw = true;
        zih zihVar = this.yu;
        if (zihVar == null || !zihVar.ouw(koVar)) {
            return false;
        }
        osn.ouw((View) this.vt, 0);
        return true;
    }

    public final void ouw(int i4) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.vt;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        rFEndCardBackUpLayout.setShownAdCount(i4);
    }
}
