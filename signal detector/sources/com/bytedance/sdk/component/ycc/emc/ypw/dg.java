package com.bytedance.sdk.component.ycc.emc.ypw;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.ycc.emc.bw;
import com.bytedance.sdk.component.ycc.emc.msw;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class dg {
    private final Comparator<com.bytedance.sdk.component.ycc.emc.dg.emc> gbl;
    private volatile Handler ru;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.ycc.emc.dg.emc> sup;
    private volatile com.bytedance.sdk.component.ycc.emc.ypw.xq.xq zz;
    public static final dg emc = new dg();
    public static final com.bytedance.sdk.component.ycc.emc.ypw.emc.emc dg = new com.bytedance.sdk.component.ycc.emc.ypw.emc.emc();
    public static final AtomicLong bw = new AtomicLong(0);
    public static final AtomicLong ycc = new AtomicLong(0);
    public static final long uym = System.currentTimeMillis();
    public static long msw = 0;
    public volatile boolean ypw = false;
    public volatile boolean xq = false;

    private dg() {
        Comparator<com.bytedance.sdk.component.ycc.emc.dg.emc> comparator = new Comparator<com.bytedance.sdk.component.ycc.emc.dg.emc>() { // from class: com.bytedance.sdk.component.ycc.emc.ypw.dg.1
            @Override // java.util.Comparator
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.ycc.emc.dg.emc emcVar, com.bytedance.sdk.component.ycc.emc.dg.emc emcVar2) {
                return dg.this.emc(emcVar, emcVar2);
            }
        };
        this.gbl = comparator;
        this.sup = new PriorityBlockingQueue<>(8, comparator);
    }

    public void bw() {
        com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(dg.mkp(), 1);
        final com.bytedance.sdk.component.ycc.emc.ypw.xq.xq xqVar = this.zz;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (xqVar != null) {
                xqVar.xq(2);
                return;
            }
            return;
        }
        bw bwVarVk = msw.uym().vk();
        if (bwVarVk != null) {
            Executor executorDg = bwVarVk.dg();
            if (executorDg == null) {
                executorDg = bwVarVk.bw();
            }
            if (executorDg != null) {
                executorDg.execute(new com.bytedance.sdk.component.ycc.emc.bw.bw("flush") { // from class: com.bytedance.sdk.component.ycc.emc.ypw.dg.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.ycc.emc.ypw.xq.xq xqVar2 = xqVar;
                        if (xqVar2 != null) {
                            xqVar2.xq(2);
                        }
                    }
                });
            }
        }
    }

    public boolean dg() {
        try {
            if (this.zz != null || com.bytedance.sdk.component.ycc.emc.ypw.ypw()) {
                return false;
            }
            synchronized (this) {
                if (this.zz != null) {
                    return false;
                }
                this.zz = new com.bytedance.sdk.component.ycc.emc.ypw.xq.xq(this.sup);
                this.zz.start();
                return true;
            }
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void xq() {
        if (this.zz == null || !this.zz.isAlive()) {
            return;
        }
        synchronized (this) {
            try {
                if (this.zz != null && this.zz.isAlive()) {
                    if (this.ru != null) {
                        this.ru.removeCallbacksAndMessages(null);
                    }
                    this.zz.emc(false);
                    this.zz.quitSafely();
                    this.zz = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void ypw() {
        dg();
        bw();
    }

    public PriorityBlockingQueue<com.bytedance.sdk.component.ycc.emc.dg.emc> emc() {
        return this.sup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int emc(com.bytedance.sdk.component.ycc.emc.dg.emc emcVar, com.bytedance.sdk.component.ycc.emc.dg.emc emcVar2) {
        long jEmc;
        long jYpw;
        long jYpw2;
        long jEmc2;
        if (emcVar == null) {
            return emcVar2 == null ? 0 : -1;
        }
        if (emcVar2 == null) {
            return 1;
        }
        if (emcVar.bw() == emcVar2.bw()) {
            if (emcVar.emc() != null) {
                jEmc = emcVar.emc().emc();
                jYpw = emcVar.emc().ypw();
            } else {
                jEmc = 0;
                jYpw = 0;
            }
            if (emcVar2.emc() != null) {
                jEmc2 = emcVar2.emc().emc();
                jYpw2 = emcVar2.emc().ypw();
            } else {
                jYpw2 = 0;
                jEmc2 = 0;
            }
            if (jEmc == 0 || jEmc2 == 0) {
                return 0;
            }
            long j6 = jEmc - jEmc2;
            if (Math.abs(j6) > 2147483647L) {
                return 0;
            }
            if (j6 != 0) {
                return (int) j6;
            }
            if (jYpw == 0 || jYpw2 == 0) {
                return 0;
            }
            return (int) (jYpw - jYpw2);
        }
        return emcVar.bw() - emcVar2.bw();
    }

    public void emc(Handler handler) {
        this.ru = handler;
    }

    public void emc(com.bytedance.sdk.component.ycc.emc.dg.emc emcVar, int i) {
        dg();
        bw bwVarVk = msw.uym().vk();
        com.bytedance.sdk.component.ycc.emc.ypw.xq.xq xqVar = this.zz;
        if (xqVar != null) {
            emc(bwVarVk, emcVar);
            xqVar.emc(emcVar, emcVar.bw() == 4);
        }
    }

    private void emc(final bw bwVar, com.bytedance.sdk.component.ycc.emc.dg.emc emcVar) {
        if (bwVar != null) {
            try {
                if (bwVar.uym()) {
                    final long jYpw = (emcVar == null || emcVar.emc() == null) ? 0L : emcVar.emc().ypw();
                    if (jYpw == 1) {
                        msw = System.currentTimeMillis();
                    }
                    AtomicLong atomicLongXhi = dg.xhi();
                    com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(atomicLongXhi, 1);
                    if (atomicLongXhi.get() == 200) {
                        try {
                            if (Looper.getMainLooper() == Looper.myLooper()) {
                                Executor executorDg = bwVar.dg();
                                if (executorDg == null) {
                                    executorDg = bwVar.bw();
                                }
                                if (executorDg != null) {
                                    executorDg.execute(new com.bytedance.sdk.component.ycc.emc.bw.bw("report") { // from class: com.bytedance.sdk.component.ycc.emc.ypw.dg.2
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            dg.this.emc(bwVar, jYpw);
                                        }
                                    });
                                }
                            } else {
                                emc(bwVar, jYpw);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(bw bwVar, long j6) {
        com.bytedance.sdk.component.ycc.emc.ypw.xq.xq xqVar = this.zz;
        if (bwVar == null || xqVar == null) {
            return;
        }
        com.bytedance.sdk.component.ycc.emc.ypw.emc.emc emcVar = dg;
        xqVar.emc(bwVar.emc(emcVar.ypw(j6)), true);
        emcVar.yz();
    }
}
