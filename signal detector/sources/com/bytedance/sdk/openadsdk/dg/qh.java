package com.bytedance.sdk.openadsdk.dg;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.rie;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class qh {
    private static volatile qh emc;
    private final Handler xq;
    private Map<String, Object> ycc;
    private HandlerThread ypw;
    private final Executor dg = Executors.newCachedThreadPool();
    private ypw bw = ypw.emc();

    public static class emc implements Serializable, Runnable {
        public Map<String, Object> bw;
        public String dg;
        public rie xq;
        public final AtomicInteger emc = new AtomicInteger(0);
        public final AtomicBoolean ypw = new AtomicBoolean(false);
        private final long ycc = SystemClock.elapsedRealtime();

        public emc(rie rieVar, String str, Map<String, Object> map) {
            this.xq = rieVar;
            this.dg = str;
            this.bw = map;
        }

        public static emc emc(rie rieVar, String str, Map<String, Object> map) {
            return new emc(rieVar, str, map);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.xq == null || TextUtils.isEmpty(this.dg)) {
                return;
            }
            String str = this.ypw.get() ? "dpl_success" : "dpl_failed";
            if (this.bw == null) {
                this.bw = new HashMap();
            }
            rie rieVar = this.xq;
            if (rieVar != null && rieVar.aod() == 0) {
                Map<String, Object> map = this.bw;
                rie rieVar2 = this.xq;
                map.put("auto_click", Boolean.valueOf((rieVar2 == null || rieVar2.yzg()) ? false : true));
            }
            this.bw.put("lifeCycleInit", Boolean.valueOf(com.bytedance.sdk.openadsdk.core.cf.emc().xq()));
            this.bw.put("duration", Long.valueOf(SystemClock.elapsedRealtime() - this.ycc));
            xq.emc(this.xq, this.dg, str, this.bw);
        }

        public void ypw() {
            this.emc.incrementAndGet();
        }

        public emc emc(boolean z6) {
            this.ypw.set(z6);
            return this;
        }

        public int emc() {
            return this.emc.get();
        }
    }

    public static class ypw {
        public int emc = 300;
        public int ypw = 6000;

        private ypw() {
        }

        public static ypw emc() {
            return new ypw();
        }
    }

    private qh() {
        if (this.ypw == null) {
            this.ypw = com.bytedance.sdk.component.utils.msw.emc("OpenAppSuccEvent_HandlerThread", 10);
        }
        this.xq = new Handler(this.ypw.getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.dg.qh.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != 100) {
                    return true;
                }
                Object obj = message.obj;
                emc emcVar = (obj == null || !(obj instanceof emc)) ? null : (emc) obj;
                if (emcVar == null) {
                    return true;
                }
                qh.this.ypw(emcVar);
                return true;
            }
        });
    }

    private void xq(emc emcVar) {
        if (emcVar == null) {
            return;
        }
        this.dg.execute(emcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(emc emcVar) {
        if (emcVar == null) {
            return;
        }
        boolean zDg = com.bytedance.sdk.openadsdk.core.cf.emc().dg();
        boolean zEmc = com.bytedance.sdk.openadsdk.core.cf.emc().emc(true);
        if (!zDg && zEmc) {
            emc(emcVar);
            return;
        }
        if (emcVar.bw == null) {
            emcVar.bw = new HashMap();
        }
        emcVar.bw.put("is_background", Boolean.valueOf(zDg));
        emcVar.bw.put("has_focus", Boolean.valueOf(zEmc));
        xq(emcVar.emc(true));
    }

    public static qh emc() {
        if (emc == null) {
            synchronized (qh.class) {
                try {
                    if (emc == null) {
                        emc = new qh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    public qh emc(Map<String, Object> map) {
        this.ycc = map;
        return emc();
    }

    public void emc(rie rieVar, String str) {
        Message messageObtainMessage = this.xq.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = emc.emc(rieVar, str, this.ycc);
        messageObtainMessage.sendToTarget();
    }

    private void emc(emc emcVar) {
        if (emcVar == null) {
            return;
        }
        emcVar.ypw();
        int iEmc = emcVar.emc();
        ypw ypwVar = this.bw;
        if (iEmc * ypwVar.emc > ypwVar.ypw) {
            xq(emcVar.emc(false));
            return;
        }
        Message messageObtainMessage = this.xq.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = emcVar;
        this.xq.sendMessageDelayed(messageObtainMessage, this.bw.emc);
    }
}
