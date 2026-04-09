package com.bytedance.sdk.component.adexpress.emc.ypw;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.emc.xq.emc;
import com.bytedance.sdk.component.utils.ylm;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class bw extends xq {
    private static File emc;
    private static volatile bw ypw;
    private AtomicBoolean xq = new AtomicBoolean(true);
    private AtomicBoolean dg = new AtomicBoolean(false);
    private boolean bw = false;
    private AtomicBoolean ycc = new AtomicBoolean(false);
    private AtomicInteger uym = new AtomicInteger(0);
    private AtomicLong msw = new AtomicLong();

    private bw() {
        ru();
    }

    private void gbl() {
        if (this.uym.getAndSet(0) <= 0 || System.currentTimeMillis() - this.msw.get() <= TTAdConstant.AD_MAX_EVENT_TIME) {
            return;
        }
        uym();
    }

    public static File msw() {
        if (emc == null) {
            try {
                File file = new File(new File(dg.emc(), "tt_tmpl_pkg"), "template");
                file.mkdirs();
                emc = file;
            } catch (Throwable unused) {
            }
        }
        return emc;
    }

    private void ru() {
        com.bytedance.sdk.component.adexpress.dg.dg.ypw(new com.bytedance.sdk.component.msw.msw("init") { // from class: com.bytedance.sdk.component.adexpress.emc.ypw.bw.1
            @Override // java.lang.Runnable
            public void run() throws IOException {
                msw.emc();
                bw.this.xq.set(false);
                bw.this.dg();
                bw.this.uym();
                if (com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq() == null || !ylm.emc(com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq().ypw()) || com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq() == null) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq().dg();
            }
        }, 10);
    }

    public static bw ypw() {
        if (ypw == null) {
            synchronized (bw.class) {
                try {
                    if (ypw == null) {
                        ypw = new bw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ypw;
    }

    public boolean bw() {
        return this.bw;
    }

    public void dg() {
        com.bytedance.sdk.component.adexpress.emc.xq.emc emcVarYpw = msw.ypw();
        if (emcVarYpw == null || !emcVarYpw.msw()) {
            return;
        }
        boolean zEmc = emc(emcVarYpw);
        if (!zEmc) {
            msw.dg();
        }
        this.bw = zEmc;
    }

    public void uym() {
        emc(false);
    }

    public void xq() {
        ru();
    }

    public com.bytedance.sdk.component.adexpress.emc.xq.emc ycc() {
        return msw.ypw();
    }

    public void zz() {
        this.ycc.set(true);
        this.bw = false;
        this.dg.set(false);
    }

    public boolean emc(com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar) {
        if (emcVar == null) {
            return false;
        }
        return emc(emcVar.emc()) || emc(emcVar.bw()) || emc(emcVar.ycc());
    }

    @Override // com.bytedance.sdk.component.adexpress.emc.ypw.xq
    public File emc() {
        return msw();
    }

    public void emc(boolean z10) {
        List<emc.C0109emc> listEmc;
        boolean z11;
        if (this.xq.get()) {
            return;
        }
        try {
            if (this.dg.get()) {
                if (z10) {
                    this.uym.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z12 = true;
            this.dg.set(true);
            com.bytedance.sdk.component.adexpress.emc.xq.emc emcVarBw = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq().bw();
            com.bytedance.sdk.component.adexpress.emc.xq.emc emcVarYpw = msw.ypw();
            if (emcVarBw != null && emcVarBw.msw()) {
                if (!msw.ypw(emcVarBw)) {
                    this.dg.set(false);
                    this.msw.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq() != null) {
                    com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq().xq().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.emc.ypw.bw.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.bw.bw.emc().ypw();
                        }
                    });
                }
                msw.emc(emcVarBw);
                boolean zEmc = (emcVarBw.bw() == null || TextUtils.isEmpty(emcVarBw.bw().emc())) ? false : emc(emcVarBw.bw().emc());
                if (emcVarBw.emc().size() != 0) {
                    listEmc = emc(emcVarBw, emcVarYpw);
                    z11 = listEmc != null;
                } else {
                    listEmc = null;
                    z11 = zEmc;
                }
                if (!zEmc) {
                    List<emc.C0109emc> listYpw = ypw(emcVarBw, emcVarYpw);
                    if (listEmc == null || listYpw == null) {
                        listEmc = listYpw;
                    } else {
                        listEmc.addAll(listYpw);
                    }
                    if (listYpw == null) {
                        z12 = false;
                    }
                    if (listYpw == null) {
                        this.dg.set(false);
                    }
                    z11 = z12;
                }
                if (z11 && emc(emcVarBw)) {
                    msw.emc(emcVarBw);
                    msw.xq();
                    ypw(listEmc);
                }
                dg();
                this.dg.set(false);
                this.msw.set(System.currentTimeMillis());
                gbl();
                return;
            }
            this.dg.set(false);
            emc(109);
        } catch (Throwable unused) {
        }
    }

    public void ypw(boolean z10) {
        this.ycc.set(z10);
    }
}
