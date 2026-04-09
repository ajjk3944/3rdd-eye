package com.bytedance.sdk.openadsdk.ee.ypw;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.ee.ypw.bw;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class ypw {
    private final AtomicBoolean bw;
    private final AtomicLong dg;
    protected WeakReference<View> emc;
    private final Integer msw;
    private final int uym;
    protected final AtomicBoolean xq;
    private final bw.emc ycc;
    protected rie ypw;
    private volatile boolean zz = false;

    public ypw(Integer num, View view, rie rieVar, int i10, bw.emc emcVar) {
        this.msw = num;
        this.uym = i10;
        this.ypw = rieVar;
        this.ycc = emcVar;
        emc(view);
        this.xq = new AtomicBoolean(false);
        this.dg = new AtomicLong(-1L);
        this.bw = new AtomicBoolean(false);
    }

    public static ypw emc(boolean z10, Integer num, View view, rie rieVar, bw.emc emcVar) {
        return z10 ? new msw(num, view, rieVar, emcVar) : new xq(num, view, rieVar, emcVar);
    }

    public emc bw() {
        WeakReference<View> weakReference = this.emc;
        if (weakReference == null) {
            return new emc(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        return view == null ? new emc(0, 0, 0.0f) : new emc(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public void dg() {
        if (this.bw.compareAndSet(false, true)) {
            dg.emc(this.ypw, bw(), this.ycc);
        }
    }

    public Integer gbl() {
        return this.msw;
    }

    public void msw() {
        this.dg.set(-1L);
    }

    public void ru() {
        this.zz = true;
        uym.ypw(this);
    }

    public boolean sup() {
        return this.xq.get();
    }

    public void sz() {
        this.xq.set(false);
        msw();
    }

    public void uym() {
        if (zz()) {
            return;
        }
        if (!this.xq.get()) {
            msw();
        } else if (!this.dg.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.dg.get() >= this.uym) {
            dg();
        }
    }

    public abstract boolean xq();

    public abstract int ycc();

    public int ypw() {
        if (zz()) {
            return 1;
        }
        WeakReference<View> weakReference = this.emc;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.zz) {
            return 3;
        }
        if (gbl().equals(view.getTag(33554433))) {
            return (gbl().equals(view.getTag(33554433)) && xq()) ? 1 : 2;
        }
        ru();
        bw.ypw(gbl());
        return 3;
    }

    public abstract void ypw(int i10);

    public boolean zz() {
        return this.bw.get();
    }

    public void emc() {
        if (this.xq.compareAndSet(false, true)) {
            uym.emc(this);
        }
    }

    public void emc(int i10) {
        if (i10 == 4) {
            emc();
            return;
        }
        if (i10 == 8) {
            sz();
        } else if (i10 == 9) {
            dg();
        } else {
            ypw(i10);
        }
    }

    public void emc(View view) {
        if (view != null) {
            view.setTag(33554433, gbl());
        }
        this.emc = new WeakReference<>(view);
    }
}
