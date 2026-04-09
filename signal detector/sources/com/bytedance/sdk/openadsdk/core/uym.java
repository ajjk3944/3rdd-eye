package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.sf;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class uym extends View implements sf.emc {
    private List<View> bw;
    private View dg;
    private boolean emc;
    private ViewTreeObserver.OnGlobalLayoutListener gbl;
    private int msw;
    private final Runnable qh;
    private final AtomicBoolean ru;
    private boolean sup;
    private boolean sz;
    private boolean uym;
    private emc xq;
    private List<View> ycc;
    private boolean ypw;
    private final Handler zz;

    public interface emc {
        void emc();

        void emc(View view);

        void emc(boolean z6);

        void ypw();
    }

    public uym(Context context, View view, boolean z6) {
        super(aa.emc());
        this.zz = new com.bytedance.sdk.component.utils.sf(qh.ypw().getLooper(), this);
        this.ru = new AtomicBoolean(true);
        this.sz = false;
        this.qh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.uym.3
            @Override // java.lang.Runnable
            public void run() {
                if (uym.this.xq != null) {
                    uym.this.xq.emc(uym.this.dg);
                }
            }
        };
        this.sup = z6;
        this.dg = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.gbl = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.uym.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (uym.this.sz) {
                    return;
                }
                uym.this.bw();
                uym.this.dg();
            }
        };
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.uym = false;
        ypw();
        if (this.gbl != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.gbl);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw();
        this.uym = true;
        xq();
        emc(false);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        ypw();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        xq();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        emc emcVar = this.xq;
        if (emcVar != null) {
            emcVar.emc(z6);
        }
    }

    public void setAdType(int i) {
        this.msw = i;
    }

    public void setCallback(emc emcVar) {
        this.xq = emcVar;
    }

    public void setNeedCheckingShow(boolean z6) {
        this.ypw = z6;
        if (!z6 && this.emc) {
            bw();
        } else {
            if (!z6 || this.emc) {
                return;
            }
            dg();
        }
    }

    public void setRefClickViews(List<View> list) {
        this.bw = list;
    }

    public void setRefCreativeViews(List<View> list) {
        this.ycc = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bw() {
        if (this.emc) {
            this.zz.removeCallbacksAndMessages(null);
            this.emc = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dg() {
        if (!this.ypw || this.emc) {
            return;
        }
        this.emc = true;
        this.zz.sendEmptyMessage(1);
    }

    private void xq() {
        emc emcVar;
        if (this.ru.getAndSet(true) || (emcVar = this.xq) == null) {
            return;
        }
        emcVar.ypw();
    }

    private boolean ycc() {
        View view = this.dg;
        if (view instanceof com.bytedance.sdk.openadsdk.core.zz.ul) {
            return ((com.bytedance.sdk.openadsdk.core.zz.ul) view).rie();
        }
        return true;
    }

    private void ypw() {
        emc emcVar;
        if (!this.ru.getAndSet(false) || (emcVar = this.xq) == null) {
            return;
        }
        emcVar.emc();
    }

    public void emc() {
        emc(this.bw, (com.bytedance.sdk.openadsdk.core.xq.xq) null);
        emc(this.ycc, (com.bytedance.sdk.openadsdk.core.xq.xq) null);
    }

    public void emc(List<View> list, com.bytedance.sdk.openadsdk.core.xq.xq xqVar) {
        if (com.bytedance.sdk.component.utils.sz.ypw(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(xqVar);
                    view.setOnTouchListener(xqVar);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) {
        if (message.what == 1 && this.emc) {
            if (ycc() && mkp.emc(this.dg, 20, this.msw, this.sup)) {
                bw();
                this.sz = true;
                qh.xq().post(this.qh);
                emc(true);
                return;
            }
            this.zz.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private void emc(final boolean z6) {
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.zz.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.uym.2
            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserver viewTreeObserver2;
                if (uym.this.gbl != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(uym.this.gbl);
                    } catch (Exception unused) {
                    }
                }
                if (z6) {
                    uym.this.gbl = null;
                }
            }
        });
    }
}
