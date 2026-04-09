package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly implements jg, Runnable {
    private long fkw;

    /* renamed from: le, reason: collision with root package name */
    private boolean f8687le;
    private boolean pno;
    private final ouw ra;
    private final Activity vt;
    private long yu;
    private final AtomicBoolean bly = new AtomicBoolean(false);

    /* renamed from: lh, reason: collision with root package name */
    private final Handler f8688lh = new Handler(Looper.getMainLooper());
    private View ouw = yu();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        View ouw();

        void vt();
    }

    private bly(Activity activity, int i4, ouw ouwVar) {
        this.ra = ouwVar;
        this.vt = activity;
        this.yu = i4;
    }

    private void fkw() {
        this.pno = false;
        this.fkw = SystemClock.elapsedRealtime();
        Handler handler = this.f8688lh;
        if (handler != null) {
            handler.postDelayed(this, this.yu);
        }
    }

    private void le() {
        Activity activity;
        View childAt;
        if (this.f8687le || (activity = this.vt) == null || activity.isFinishing() || this.vt.isDestroyed()) {
            return;
        }
        if (this.ouw == null) {
            this.ouw = yu();
        }
        View view = this.ouw;
        if (view != null) {
            if (vt(view)) {
                ouw(this.ouw);
                View view2 = this.ouw;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.ouw).getChildAt(0)) != null && vt(childAt)) {
                    ouw(childAt);
                }
                ouw ouwVar = this.ra;
                if (ouwVar != null) {
                    ouwVar.vt();
                }
            }
            ra();
        }
        this.f8687le = true;
    }

    public static jg ouw(Activity activity, ouw ouwVar) {
        int iOuw = com.bytedance.sdk.openadsdk.core.settings.cf.vt().pno.ouw("perf_con_close_button_delay_check_time", -1);
        return iOuw < 0 ? new jg() { // from class: com.bytedance.sdk.openadsdk.utils.bly.1
            @Override // com.bytedance.sdk.openadsdk.utils.jg
            public final void ouw() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.jg
            public final void ouw(long j) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.jg
            public final void lh() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.jg
            public final void vt() {
            }
        } : new bly(activity, Math.min(iOuw, 50) * 1000, ouwVar);
    }

    private void ra() {
        ViewParent parent = this.ouw.getParent();
        if (parent instanceof ViewGroup) {
            if (((ViewGroup) parent).indexOfChild(this.ouw) != r0.getChildCount() - 1) {
                this.ouw.bringToFront();
            }
        }
    }

    private View yu() {
        ouw ouwVar = this.ra;
        if (ouwVar != null) {
            return ouwVar.ouw();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.utils.jg
    public final void lh() {
        if (this.f8687le) {
            return;
        }
        this.f8687le = true;
        Handler handler = this.f8688lh;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.yu(th2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        le();
    }

    @Override // com.bytedance.sdk.openadsdk.utils.jg
    public final void vt() {
        if (this.fkw <= 0 || this.f8687le) {
            return;
        }
        if (!this.pno) {
            this.yu -= SystemClock.elapsedRealtime() - this.fkw;
        }
        this.pno = true;
        if (this.yu <= 0) {
            le();
            return;
        }
        Handler handler = this.f8688lh;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.yu(th2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.jg
    public final void ouw(long j) {
        if (this.bly.compareAndSet(false, true)) {
            if (j < 0) {
                j = 0;
            }
            this.yu += j;
            fkw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.jg
    public final void ouw() {
        if (this.fkw == 0 || !this.pno) {
            return;
        }
        fkw();
    }

    private static void ouw(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private static boolean vt(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }
}
