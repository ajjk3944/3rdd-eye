package com.bytedance.sdk.component.msw.emc;

import android.os.Handler;
import com.bytedance.sdk.component.utils.msw;
import com.bytedance.sdk.component.utils.sf;

/* loaded from: classes.dex */
public class emc {
    private final dg<ypw> emc;
    private Handler ypw;

    /* renamed from: com.bytedance.sdk.component.msw.emc.emc$emc, reason: collision with other inner class name */
    public static class C0120emc {
        private static final emc emc = new emc();
    }

    public Handler ypw() {
        if (this.ypw == null) {
            synchronized (emc.class) {
                try {
                    if (this.ypw == null) {
                        this.ypw = emc("csj_io_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.ypw;
    }

    private emc() {
        this.emc = dg.emc(2);
    }

    public static emc emc() {
        return C0120emc.emc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        } else {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.msw.emc.emc.1
                @Override // java.lang.Runnable
                public void run() {
                    emc.this.emc(handler, handler2);
                }
            }, 1000L);
        }
    }

    private ypw ypw(sf.emc emcVar, String str) {
        return new ypw(msw.emc(str), emcVar);
    }

    public sf emc(sf.emc emcVar, final String str) {
        ypw ypwVar = (ypw) this.emc.emc();
        if (ypwVar != null) {
            ypwVar.emc(emcVar);
            ypwVar.post(new Runnable() { // from class: com.bytedance.sdk.component.msw.emc.emc.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return ypwVar;
        }
        return ypw(emcVar, str);
    }

    public sf emc(String str) {
        return emc((sf.emc) null, str);
    }

    public boolean emc(sf sfVar) {
        if (!(sfVar instanceof ypw)) {
            return false;
        }
        ypw ypwVar = (ypw) sfVar;
        if (this.emc.emc((dg<ypw>) ypwVar)) {
            return true;
        }
        ypwVar.ypw();
        return true;
    }
}
