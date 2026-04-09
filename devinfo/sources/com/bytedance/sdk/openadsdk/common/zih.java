package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.core.model.od;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class zih {
    protected String fkw;

    /* renamed from: le, reason: collision with root package name */
    protected String f7855le;

    /* renamed from: lh, reason: collision with root package name */
    protected String f7856lh;
    protected final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ra;
    protected String vt;
    protected String yu;

    public zih(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.ra = ouwVar;
        if (this.vt == null) {
            try {
                this.vt = vpp.ouw(ouwVar.hun, "tt_reward_msg");
                this.f7856lh = vpp.ouw(ouwVar.hun, "tt_msgPlayable");
                this.f7855le = vpp.ouw(ouwVar.hun, "tt_negtiveBtnBtnText");
                this.yu = vpp.ouw(ouwVar.hun, "tt_postiveBtnText");
                this.fkw = vpp.ouw(ouwVar.hun, "tt_postiveBtnTextPlayable");
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.lh("RewardTipDialogHelper", "init res text failed：" + th2.getMessage());
            }
        }
    }

    private boolean le() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ra;
        return !ouwVar.euf && ouwVar.tlj.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pno() {
        if (!od.pno(this.ra.vt)) {
            return false;
        }
        this.ra.ksc.ra();
        return true;
    }

    private boolean ra() {
        com.bytedance.sdk.openadsdk.core.zih.yu();
        return com.bytedance.sdk.openadsdk.core.settings.cf.le(String.valueOf(this.ra.f7961le));
    }

    public final void fkw() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ra;
        if (ouwVar == null) {
            com.bytedance.sdk.component.utils.qbp.yu("execSkipTaskBaseImpl adContext is null", new Object[0]);
            return;
        }
        com.bytedance.sdk.openadsdk.activity.pno pnoVar = ouwVar.f7959gh;
        if (pnoVar == null || !(pnoVar instanceof com.bytedance.sdk.openadsdk.activity.fkw)) {
            ouwVar.ex.zih();
            ouw.ouw(this.ra);
            ouw(this.ra);
        } else {
            if (((com.bytedance.sdk.openadsdk.activity.fkw) pnoVar).bly()) {
                return;
            }
            yu();
        }
    }

    public abstract boolean lh();

    public abstract void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar);

    public abstract boolean ouw();

    public abstract void vt();

    public abstract void yu();

    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ouw(final boolean r5, boolean r6, final java.lang.Runnable r7) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.common.zih.ouw(boolean, boolean, java.lang.Runnable):boolean");
    }

    public static /* synthetic */ void ouw(zih zihVar, boolean z3) {
        zihVar.ra.ex.cf();
        if (z3) {
            zihVar.ra.ksc.ouw(1000);
        }
        zihVar.ra.qbp.set(false);
    }
}
