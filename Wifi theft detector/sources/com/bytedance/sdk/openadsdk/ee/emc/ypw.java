package com.bytedance.sdk.openadsdk.ee.emc;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {
    private final rie ypw;
    private int emc = xq.ypw;
    private final AtomicBoolean xq = new AtomicBoolean(false);
    private final AtomicBoolean dg = new AtomicBoolean(true);
    private final AtomicInteger bw = new AtomicInteger(0);
    private long ycc = 0;
    private long uym = 0;
    private final Runnable msw = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ee.emc.ypw.3
        @Override // java.lang.Runnable
        public void run() {
            ypw.this.dg();
        }
    };

    public ypw(rie rieVar) {
        this.ypw = rieVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ycc() {
        if (this.bw.get() != 1 || this.ycc == 0) {
            return;
        }
        Handler handlerEmc = emc.emc();
        if (handlerEmc != null) {
            handlerEmc.removeCallbacks(this.msw);
        }
        this.uym += SystemClock.elapsedRealtime() - this.ycc;
        this.ycc = 0L;
        this.bw.set(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bw() {
        if (this.bw.get() == 2) {
            this.ycc = SystemClock.elapsedRealtime();
            Handler handlerEmc = emc.emc();
            if (handlerEmc != null) {
                handlerEmc.postDelayed(this.msw, this.emc - this.uym);
            }
            this.bw.set(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dg() {
        if (this.xq.compareAndSet(false, true)) {
            ypw();
            final long jElapsedRealtime = this.uym + (SystemClock.elapsedRealtime() - this.ycc);
            this.uym = jElapsedRealtime;
            iyl.xq(new msw("ev_tracker") { // from class: com.bytedance.sdk.openadsdk.ee.emc.ypw.1
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    String strEmc = tp.emc(ypw.this.ypw);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("ev_wait_time_server", ypw.this.ypw.nb() * 1000);
                        jSONObject.put("ev_wait_time_client", jElapsedRealtime);
                    } catch (JSONException e10) {
                        ul.xq("EvTracker", e10.getMessage());
                    }
                    com.bytedance.sdk.openadsdk.dg.xq.ypw(ypw.this.ypw, strEmc, ypw.this.ypw.bpi(), jSONObject);
                }
            });
        }
    }

    public void emc() {
        if (this.bw.get() != 0) {
            return;
        }
        this.emc = this.ypw.nb() * 1000;
        this.bw.set(1);
        this.ycc = SystemClock.elapsedRealtime();
        Handler handlerEmc = emc.emc();
        if (handlerEmc != null) {
            handlerEmc.postDelayed(this.msw, this.emc);
        }
    }

    public boolean xq() {
        return this.bw.get() == 3;
    }

    public void ypw() {
        this.bw.set(3);
        Handler handlerEmc = emc.emc();
        if (handlerEmc != null) {
            handlerEmc.removeCallbacks(this.msw);
        }
    }

    public void emc(final int i10) {
        Handler handlerEmc;
        if (this.bw.get() == 3 || (handlerEmc = emc.emc()) == null) {
            return;
        }
        handlerEmc.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ee.emc.ypw.2
            @Override // java.lang.Runnable
            public void run() {
                if (i10 == 4 && ypw.this.dg.get()) {
                    ypw.this.bw();
                    return;
                }
                int i11 = i10;
                if (i11 == 8) {
                    ypw.this.ycc();
                } else if (i11 == 5) {
                    ypw.this.dg();
                }
            }
        });
    }

    public void emc(boolean z10) {
        this.dg.set(z10);
    }
}
