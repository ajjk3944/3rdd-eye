package com.bytedance.sdk.openadsdk.core.yu;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.openadsdk.core.fak;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.utils.bs;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le extends com.bytedance.adsdk.ugeno.le.ouw<View> implements jae.ouw {

    /* renamed from: cf, reason: collision with root package name */
    private final Handler f8526cf;

    /* renamed from: jg, reason: collision with root package name */
    private boolean f8527jg;
    private vt ko;
    private boolean mwh;
    private ouw rn;
    private long ryl;
    private final ViewTreeObserver.OnScrollChangedListener vm;
    private final Runnable zih;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw(boolean z3);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt {
        void ouw(boolean z3);
    }

    public le(Context context) {
        super(context);
        this.f8526cf = new jae(jg.vt().getLooper(), this);
        this.mwh = true;
        this.f8527jg = true;
        this.zih = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yu.le.1
            @Override // java.lang.Runnable
            public final void run() {
                if (le.this.rn != null) {
                    le.this.rn.ouw(le.this.f8527jg);
                }
            }
        };
        this.vm = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.le.2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - le.this.ryl > 500) {
                    le.this.ryl = jElapsedRealtime;
                    le.this.f8526cf.sendEmptyMessageDelayed(1, 500L);
                }
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.vm);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.vm);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        vt vtVar = this.ko;
        if (vtVar != null) {
            vtVar.ouw(z3);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.le.ouw
    public final View pno(int i4) {
        return (View) this.ouw.get(i4);
    }

    public final void setSwiperVisibleChangeListener(ouw ouwVar) {
        this.rn = ouwVar;
    }

    public final void setSwiperWindowFocusChangedListener(vt vtVar) {
        this.ko = vtVar;
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        if (message.what == 1) {
            boolean zOuw = fak.ouw(this, 50, -1, false);
            this.f8527jg = zOuw;
            if (zOuw != this.mwh) {
                this.mwh = zOuw;
                bs.ouw(this.zih);
            }
        }
    }
}
