package com.bytedance.sdk.openadsdk.core.dg;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.core.mkp;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.utils.iyl;

/* loaded from: classes.dex */
public class ycc extends com.bytedance.adsdk.ugeno.ycc.emc<View> implements sf.emc {
    private long bw;
    private final Handler dg;
    private final ViewTreeObserver.OnScrollChangedListener gbl;
    private ypw msw;
    private final Runnable ru;
    private boolean uym;
    private boolean ycc;
    private emc zz;

    public interface emc {
        void emc(boolean z6);
    }

    public interface ypw {
        void emc(boolean z6);
    }

    public ycc(Context context) {
        super(context);
        this.dg = new sf(qh.ypw().getLooper(), this);
        this.ycc = true;
        this.uym = true;
        this.ru = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dg.ycc.1
            @Override // java.lang.Runnable
            public void run() {
                if (ycc.this.zz != null) {
                    ycc.this.zz.emc(ycc.this.uym);
                }
            }
        };
        this.gbl = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.dg.ycc.2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - ycc.this.bw > 500) {
                    ycc.this.bw = jElapsedRealtime;
                    ycc.this.dg.sendEmptyMessageDelayed(1, 500L);
                }
            }
        };
    }

    private void uym() {
        boolean zEmc = mkp.emc(this, 50, -1, false);
        this.uym = zEmc;
        if (zEmc == this.ycc) {
            return;
        }
        this.ycc = zEmc;
        iyl.emc(this.ru);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.gbl);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.gbl);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        ypw ypwVar = this.msw;
        if (ypwVar != null) {
            ypwVar.emc(z6);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ycc.emc
    public View ru(int i) {
        return (View) this.emc.get(i);
    }

    public void setSwiperVisibleChangeListener(emc emcVar) {
        this.zz = emcVar;
    }

    public void setSwiperWindowFocusChangedListener(ypw ypwVar) {
        this.msw = ypwVar;
    }

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) {
        if (message.what == 1) {
            uym();
        }
    }
}
