package com.bytedance.sdk.openadsdk.core.zz;

import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.iyl;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class ylm extends com.bytedance.sdk.component.adexpress.ypw.emc<emc> {
    private com.bytedance.sdk.component.adexpress.ypw.uym bw;
    private com.bytedance.sdk.component.adexpress.ypw.xq dg;
    AtomicBoolean emc = new AtomicBoolean(false);
    private final View xq;
    private final com.bytedance.sdk.component.adexpress.ypw.sz ycc;
    private emc ypw;

    public ylm(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.component.adexpress.ypw.sz szVar) {
        this.xq = view;
        this.ycc = szVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw() {
        if (this.emc.get()) {
            return;
        }
        com.bytedance.sdk.component.adexpress.ypw.xq xqVar = this.dg;
        if (xqVar == null || !xqVar.emc((ul) this.xq, 0)) {
            this.bw.emc(107, "backup false");
            return;
        }
        this.ycc.bw().uym();
        emc emcVar = (emc) this.xq.findViewWithTag("tt_express_backup_fl_tag_26");
        this.ypw = emcVar;
        if (emcVar == null) {
            this.bw.emc(107, "backupview is null");
            return;
        }
        com.bytedance.sdk.component.adexpress.ypw.qh qhVar = new com.bytedance.sdk.component.adexpress.ypw.qh();
        emc emcVar2 = this.ypw;
        float realWidth = emcVar2 == null ? 0.0f : emcVar2.getRealWidth();
        emc emcVar3 = this.ypw;
        float realHeight = emcVar3 != null ? emcVar3.getRealHeight() : 0.0f;
        qhVar.emc(true);
        qhVar.emc(realWidth);
        qhVar.ypw(realHeight);
        this.bw.emc(this.ypw, qhVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.dg
    public void emc(com.bytedance.sdk.component.adexpress.ypw.uym uymVar) {
        this.bw = uymVar;
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.ylm.1
            @Override // java.lang.Runnable
            public void run() {
                ylm.this.ypw();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.dg
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public emc bw() {
        return this.ypw;
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.emc
    public void emc(com.bytedance.sdk.component.adexpress.ypw.xq xqVar) {
        this.dg = xqVar;
    }
}
