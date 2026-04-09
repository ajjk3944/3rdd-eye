package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class zz implements qh, Runnable {
    private long bw;
    private long dg;
    private boolean msw;
    private final emc uym;
    private boolean ycc;
    private final Activity ypw;
    private final AtomicBoolean zz = new AtomicBoolean(false);
    private final Handler xq = new Handler(Looper.getMainLooper());
    private View emc = dg();

    public interface emc {
        View emc();

        void ypw();
    }

    private zz(Activity activity, int i, emc emcVar) {
        this.uym = emcVar;
        this.ypw = activity;
        this.dg = i;
    }

    private void bw() {
        this.msw = false;
        this.bw = SystemClock.elapsedRealtime();
        Handler handler = this.xq;
        if (handler != null) {
            handler.postDelayed(this, this.dg);
        }
    }

    private View dg() {
        emc emcVar = this.uym;
        if (emcVar != null) {
            return emcVar.emc();
        }
        return null;
    }

    public static qh emc(Activity activity, emc emcVar) {
        int iVaf = com.bytedance.sdk.openadsdk.core.settings.gbl.xq().vaf();
        return iVaf < 0 ? new qh() { // from class: com.bytedance.sdk.openadsdk.utils.zz.1
            @Override // com.bytedance.sdk.openadsdk.utils.qh
            public void emc() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.qh
            public void xq() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.qh
            public void ypw() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.qh
            public void emc(long j6) {
            }
        } : new zz(activity, Math.min(iVaf, 50) * TTAdConstant.STYLE_SIZE_RADIO_1_1, emcVar);
    }

    private void uym() {
        ViewParent parent = this.emc.getParent();
        if (parent instanceof ViewGroup) {
            if (((ViewGroup) parent).indexOfChild(this.emc) != r0.getChildCount() - 1) {
                this.emc.bringToFront();
            }
        }
    }

    private void ycc() {
        Activity activity;
        View childAt;
        if (this.ycc || (activity = this.ypw) == null || activity.isFinishing() || this.ypw.isDestroyed()) {
            return;
        }
        if (this.emc == null) {
            this.emc = dg();
        }
        View view = this.emc;
        if (view != null) {
            if (ypw(view)) {
                emc(this.emc);
                View view2 = this.emc;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.emc).getChildAt(0)) != null && ypw(childAt)) {
                    emc(childAt);
                }
                emc emcVar = this.uym;
                if (emcVar != null) {
                    emcVar.ypw();
                }
            }
            uym();
        }
        this.ycc = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        ycc();
    }

    @Override // com.bytedance.sdk.openadsdk.utils.qh
    public void xq() {
        if (this.ycc) {
            return;
        }
        this.ycc = true;
        Handler handler = this.xq;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ul.xq(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.qh
    public void ypw() {
        if (this.bw <= 0 || this.ycc) {
            return;
        }
        if (!this.msw) {
            this.dg -= SystemClock.elapsedRealtime() - this.bw;
        }
        this.msw = true;
        if (this.dg <= 0) {
            ycc();
            return;
        }
        Handler handler = this.xq;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ul.xq(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.qh
    public void emc(long j6) {
        if (this.zz.compareAndSet(false, true)) {
            if (j6 < 0) {
                j6 = 0;
            }
            this.dg += j6;
            bw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.qh
    public void emc() {
        if (this.bw == 0 || !this.msw) {
            return;
        }
        bw();
    }

    private void emc(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private boolean ypw(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }
}
