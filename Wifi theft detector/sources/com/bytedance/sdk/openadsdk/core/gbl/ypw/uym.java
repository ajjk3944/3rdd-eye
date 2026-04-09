package com.bytedance.sdk.openadsdk.core.gbl.ypw;

import android.content.Context;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.aa;
import com.bytedance.sdk.component.adexpress.ypw.msw;
import com.bytedance.sdk.component.adexpress.ypw.qh;
import com.bytedance.sdk.component.adexpress.ypw.ru;
import com.bytedance.sdk.component.adexpress.ypw.sz;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.zz.cf;
import com.bytedance.sdk.openadsdk.utils.iyl;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class uym implements ru {
    private AtomicBoolean bw = new AtomicBoolean(false);
    private ScheduledFuture<?> dg;
    private Context emc;
    private sz xq;
    private cf ycc;
    private com.bytedance.sdk.openadsdk.core.gbl.ycc.dg ypw;

    public class emc implements Runnable {
        ru.emc emc;
        private int xq;

        public emc(int i10, ru.emc emcVar) {
            this.xq = i10;
            this.emc = emcVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.xq == 1) {
                uym.this.ypw.emc(true);
                uym.this.emc(this.emc, 137, "real time out" + uym.this.xq.ycc());
            }
        }
    }

    public uym(Context context, com.bytedance.sdk.openadsdk.core.gbl.ycc.dg dgVar, msw mswVar, sz szVar) {
        this.emc = context;
        this.ypw = dgVar;
        this.xq = szVar;
        this.ypw.emc(mswVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.ru
    public void emc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw() {
        try {
            ScheduledFuture<?> scheduledFuture = this.dg;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.dg.cancel(false);
            this.dg = null;
        } catch (Throwable th) {
            ul.xq("RenderInterceptor", "remove ugen time out task fail", th.getMessage());
        }
    }

    public void emc(cf cfVar) {
        this.ycc = cfVar;
        this.ypw.emc(cfVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.ru
    public boolean emc(final ru.emc emcVar) {
        int iYcc = this.xq.ycc();
        if (iYcc < 0) {
            emc(emcVar, 137, "time is ".concat(String.valueOf(iYcc)));
        } else {
            if (!(this.ypw instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.emc.dg)) {
                this.dg = iyl.emc().schedule(new emc(1, emcVar), iYcc, TimeUnit.MILLISECONDS);
            }
            this.ypw.emc(new com.bytedance.sdk.component.adexpress.ypw.uym() { // from class: com.bytedance.sdk.openadsdk.core.gbl.ypw.uym.1
                @Override // com.bytedance.sdk.component.adexpress.ypw.uym
                public void emc(View view, qh qhVar) {
                    uym.this.ypw();
                    if (emcVar.xq()) {
                        return;
                    }
                    aa aaVar = new aa();
                    aaVar.emc(0);
                    if (uym.this.ypw instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.emc.dg) {
                        uym.this.xq.bw().uym();
                    } else {
                        ((com.bytedance.sdk.openadsdk.core.gbl.ycc.emc) uym.this.xq).cuf().emc(aaVar);
                    }
                    uym.this.xq.bw().ru();
                    com.bytedance.sdk.component.adexpress.ypw.cf cfVarYpw = emcVar.ypw();
                    if (cfVarYpw == null) {
                        return;
                    }
                    cfVarYpw.emc(uym.this.ypw, qhVar);
                    emcVar.emc(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.ypw.uym
                public void emc(int i10, String str) {
                    uym.this.emc(emcVar, i10, str);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(ru.emc emcVar, int i10, String str) {
        com.bytedance.sdk.component.adexpress.ypw.cf cfVarYpw;
        if (emcVar.xq() || this.bw.get()) {
            return;
        }
        ypw();
        aa aaVar = new aa();
        aaVar.emc(i10);
        aaVar.emc(str);
        ((com.bytedance.sdk.openadsdk.core.gbl.ycc.emc) this.xq).cuf().emc(aaVar);
        if (emcVar.ypw(this)) {
            emcVar.emc(this);
        } else {
            if (emcVar.xq() || (cfVarYpw = emcVar.ypw()) == null) {
                return;
            }
            emcVar.emc(true);
            cfVarYpw.a_(i10);
        }
        this.bw.getAndSet(true);
    }
}
