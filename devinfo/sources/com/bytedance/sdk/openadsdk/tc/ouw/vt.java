package com.bytedance.sdk.openadsdk.tc.ouw;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    final vpp vt;
    int ouw = lh.vt;
    private final AtomicBoolean pno = new AtomicBoolean(false);

    /* renamed from: lh, reason: collision with root package name */
    final AtomicBoolean f8663lh = new AtomicBoolean(true);
    final AtomicInteger yu = new AtomicInteger(0);
    long fkw = 0;

    /* renamed from: le, reason: collision with root package name */
    long f8662le = 0;
    final Runnable ra = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tc.ouw.vt.3
        @Override // java.lang.Runnable
        public final void run() {
            vt.ouw(vt.this);
        }
    };

    public vt(vpp vppVar) {
        this.vt = vppVar;
    }

    public final void ouw() {
        this.yu.set(3);
        Handler handlerOuw = ouw.ouw();
        if (handlerOuw != null) {
            handlerOuw.removeCallbacks(this.ra);
        }
    }

    public final boolean vt() {
        return this.yu.get() == 3;
    }

    public final void ouw(final int i4) {
        Handler handlerOuw;
        if (this.yu.get() == 3 || (handlerOuw = ouw.ouw()) == null) {
            return;
        }
        handlerOuw.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tc.ouw.vt.2
            @Override // java.lang.Runnable
            public final void run() {
                if (i4 == 4 && vt.this.f8663lh.get()) {
                    vt vtVar = vt.this;
                    if (vtVar.yu.get() == 2) {
                        vtVar.fkw = SystemClock.elapsedRealtime();
                        Handler handlerOuw2 = ouw.ouw();
                        if (handlerOuw2 != null) {
                            handlerOuw2.postDelayed(vtVar.ra, vtVar.ouw - vtVar.f8662le);
                        }
                        vtVar.yu.set(1);
                        return;
                    }
                    return;
                }
                int i10 = i4;
                if (i10 != 8) {
                    if (i10 == 5) {
                        vt.ouw(vt.this);
                        return;
                    }
                    return;
                }
                vt vtVar2 = vt.this;
                if (vtVar2.yu.get() != 1 || vtVar2.fkw == 0) {
                    return;
                }
                Handler handlerOuw3 = ouw.ouw();
                if (handlerOuw3 != null) {
                    handlerOuw3.removeCallbacks(vtVar2.ra);
                }
                vtVar2.f8662le = (SystemClock.elapsedRealtime() - vtVar2.fkw) + vtVar2.f8662le;
                vtVar2.fkw = 0L;
                vtVar2.yu.set(2);
            }
        });
    }

    public static /* synthetic */ void ouw(vt vtVar) {
        if (vtVar.pno.compareAndSet(false, true)) {
            vtVar.ouw();
            final long jElapsedRealtime = (SystemClock.elapsedRealtime() - vtVar.fkw) + vtVar.f8662le;
            vtVar.f8662le = jElapsedRealtime;
            bs.lh(new pno("ev_tracker") { // from class: com.bytedance.sdk.openadsdk.tc.ouw.vt.1
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    String strOuw = uoy.ouw(vt.this.vt);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("ev_wait_time_server", vt.this.vt.xdk() * 1000);
                        jSONObject.put("ev_wait_time_client", jElapsedRealtime);
                    } catch (JSONException e2) {
                        qbp.lh("EvTracker", e2.getMessage());
                    }
                    vpp vppVar = vt.this.vt;
                    com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, strOuw, vppVar.zvq(), jSONObject);
                }
            });
        }
    }
}
