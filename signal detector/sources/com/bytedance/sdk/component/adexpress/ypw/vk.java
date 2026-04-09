package com.bytedance.sdk.component.adexpress.ypw;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.ypw.ru;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class vk implements ru {
    private ScheduledFuture<?> bw;
    private sz dg;
    private Context emc;
    private msw xq;
    private AtomicBoolean ycc = new AtomicBoolean(false);
    private com.bytedance.sdk.component.adexpress.bw.emc ypw;

    public class emc implements Runnable {
        ru.emc emc;
        private int xq;

        public emc(int i, ru.emc emcVar) {
            this.xq = i;
            this.emc = emcVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.xq == 1) {
                vk.this.ypw.emc(true);
                vk.this.emc(this.emc, 107, null);
            }
        }
    }

    public vk(Context context, sz szVar, com.bytedance.sdk.component.adexpress.bw.emc emcVar, msw mswVar) {
        this.emc = context;
        this.dg = szVar;
        this.xq = mswVar;
        this.ypw = emcVar;
        emcVar.emc(this.xq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq() {
        try {
            ScheduledFuture<?> scheduledFuture = this.bw;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.bw.cancel(false);
            this.bw = null;
        } catch (Throwable unused) {
        }
    }

    public com.bytedance.sdk.component.adexpress.bw.emc ypw() {
        return this.ypw;
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.ru
    public boolean emc(final ru.emc emcVar) {
        int iYcc = this.dg.ycc();
        if (iYcc < 0) {
            emc(emcVar, 107, "time is ".concat(String.valueOf(iYcc)));
        } else {
            this.bw = com.bytedance.sdk.component.adexpress.dg.dg.emc(new emc(1, emcVar), iYcc, TimeUnit.MILLISECONDS);
            this.ypw.emc(new uym() { // from class: com.bytedance.sdk.component.adexpress.ypw.vk.1
                @Override // com.bytedance.sdk.component.adexpress.ypw.uym
                public void emc(View view, qh qhVar) {
                    cf cfVarYpw;
                    vk.this.xq();
                    if (emcVar.xq() || (cfVarYpw = emcVar.ypw()) == null) {
                        return;
                    }
                    cfVarYpw.emc(vk.this.ypw, qhVar);
                    emcVar.emc(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.ypw.uym
                public void emc(int i, String str) {
                    vk.this.emc(emcVar, i, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.ru
    public void emc() {
        this.ypw.dg();
        xq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(ru.emc emcVar, int i, String str) {
        cf cfVarYpw;
        if (emcVar.xq() || this.ycc.get()) {
            return;
        }
        xq();
        this.dg.bw().emc(i, str);
        if (emcVar.ypw(this)) {
            emcVar.emc(this);
        } else {
            if (emcVar.xq() || (cfVarYpw = emcVar.ypw()) == null) {
                return;
            }
            emcVar.emc(true);
            cfVarYpw.a_(i);
        }
        this.ycc.getAndSet(true);
    }
}
