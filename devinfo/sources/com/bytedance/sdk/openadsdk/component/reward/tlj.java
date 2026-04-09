package com.bytedance.sdk.openadsdk.component.reward;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.uoy;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj {
    private long fkw;

    /* renamed from: le, reason: collision with root package name */
    private boolean f8014le;

    /* renamed from: lh, reason: collision with root package name */
    private long f8015lh;
    public boolean ouw;
    private final ouw vt;
    private long yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw();
    }

    public tlj(ouw ouwVar) {
        this.ouw = true;
        this.vt = ouwVar;
        int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("reward_callback_fallback", 0);
        if (iOuw != 0) {
            this.ouw = false;
            if (iOuw == 2) {
                this.f8014le = true;
            }
        }
    }

    public static void ouw(vpp vppVar, boolean z3, final int i4) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, uoy.ouw(vppVar), z3 ? "reward_callback" : "reward_fail_callback", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.tlj.1
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("reason", i4);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public final void lh() {
        if (this.vt != null) {
            long jElapsedRealtime = (this.fkw + (this.yu > 0 ? SystemClock.elapsedRealtime() - this.yu : 0L)) / 1000;
            if (this.ouw) {
                return;
            }
            if (this.f8014le || jElapsedRealtime >= this.f8015lh) {
                this.vt.ouw();
            }
        }
    }

    public final void vt() {
        if (this.ouw) {
            return;
        }
        this.yu = SystemClock.elapsedRealtime();
    }

    public final void ouw(long j) {
        if (j <= this.f8015lh) {
            return;
        }
        this.f8015lh = j;
    }

    public final void ouw() {
        if (!this.ouw && this.yu > 0) {
            this.fkw = (SystemClock.elapsedRealtime() - this.yu) + this.fkw;
            this.yu = 0L;
        }
    }
}
