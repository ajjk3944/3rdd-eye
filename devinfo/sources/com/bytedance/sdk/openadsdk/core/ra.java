package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.jae;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra extends View implements jae.ouw {
    private final Handler bly;

    /* renamed from: cf, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f8381cf;
    private ouw fkw;

    /* renamed from: jg, reason: collision with root package name */
    private final Runnable f8382jg;

    /* renamed from: le, reason: collision with root package name */
    private View f8383le;

    /* renamed from: lh, reason: collision with root package name */
    private boolean f8384lh;
    private boolean mwh;
    List<View> ouw;
    private int pno;
    private boolean ra;
    private boolean ryl;
    private final AtomicBoolean tlj;
    List<View> vt;
    private boolean yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw();

        void ouw(View view);

        void ouw(boolean z3);

        void vt();
    }

    public ra(View view, boolean z3) {
        super(zih.ouw());
        this.bly = new com.bytedance.sdk.component.utils.jae(jg.vt().getLooper(), this);
        this.tlj = new AtomicBoolean(true);
        this.mwh = false;
        this.f8382jg = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ra.3
            @Override // java.lang.Runnable
            public final void run() {
                if (ra.this.fkw != null) {
                    ra.this.fkw.ouw(ra.this.f8383le);
                }
            }
        };
        this.ryl = z3;
        this.f8383le = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.f8381cf = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.ra.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (ra.this.mwh) {
                    return;
                }
                ra.this.yu();
                ra.this.lh();
            }
        };
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ra = false;
        ouw();
        if (this.f8381cf != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f8381cf);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu();
        this.ra = true;
        vt();
        ouw(false);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        ouw();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        vt();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        ouw ouwVar = this.fkw;
        if (ouwVar != null) {
            ouwVar.ouw(z3);
        }
    }

    public final void setAdType(int i4) {
        this.pno = i4;
    }

    public final void setCallback(ouw ouwVar) {
        this.fkw = ouwVar;
    }

    public final void setNeedCheckingShow(boolean z3) {
        this.yu = z3;
        if (!z3 && this.f8384lh) {
            yu();
        } else {
            if (!z3 || this.f8384lh) {
                return;
            }
            lh();
        }
    }

    public final void setRefClickViews(List<View> list) {
        this.ouw = list;
    }

    public final void setRefCreativeViews(List<View> list) {
        this.vt = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lh() {
        if (!this.yu || this.f8384lh) {
            return;
        }
        this.f8384lh = true;
        this.bly.sendEmptyMessage(1);
    }

    private void vt() {
        ouw ouwVar;
        if (this.tlj.getAndSet(true) || (ouwVar = this.fkw) == null) {
            return;
        }
        ouwVar.vt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yu() {
        if (this.f8384lh) {
            this.bly.removeCallbacksAndMessages(null);
            this.f8384lh = false;
        }
    }

    private void ouw() {
        ouw ouwVar;
        if (!this.tlj.getAndSet(false) || (ouwVar = this.fkw) == null) {
            return;
        }
        ouwVar.ouw();
    }

    public static void ouw(List<View> list, com.bytedance.sdk.openadsdk.core.lh.lh lhVar) {
        if (com.bytedance.sdk.component.utils.mwh.ouw(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(lhVar);
                    view.setOnTouchListener(lhVar);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        if (message.what == 1 && this.f8384lh) {
            View view = this.f8383le;
            if ((view instanceof com.bytedance.sdk.openadsdk.core.bly.qbp ? ((com.bytedance.sdk.openadsdk.core.bly.qbp) view).uq.get() : true) && fak.ouw(this.f8383le, 20, this.pno, this.ryl)) {
                yu();
                this.mwh = true;
                jg.lh().post(this.f8382jg);
                ouw(true);
                return;
            }
            this.bly.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private void ouw(final boolean z3) {
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ra.2
            @Override // java.lang.Runnable
            public final void run() {
                ViewTreeObserver viewTreeObserver2;
                if (ra.this.f8381cf != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(ra.this.f8381cf);
                    } catch (Exception unused) {
                    }
                }
                if (z3) {
                    ra.this.f8381cf = null;
                }
            }
        });
    }
}
