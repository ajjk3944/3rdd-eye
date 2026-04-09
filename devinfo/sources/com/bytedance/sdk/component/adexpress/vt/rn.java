package com.bytedance.sdk.component.adexpress.vt;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.vt.tlj;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class rn implements tlj {
    private ScheduledFuture<?> fkw;

    /* renamed from: le, reason: collision with root package name */
    private AtomicBoolean f7411le = new AtomicBoolean(false);

    /* renamed from: lh, reason: collision with root package name */
    private pno f7412lh;
    public com.bytedance.sdk.component.adexpress.fkw.ouw ouw;
    private Context vt;
    private mwh yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class ouw implements Runnable {

        /* renamed from: lh, reason: collision with root package name */
        private int f7413lh = 1;
        tlj.ouw ouw;

        public ouw(tlj.ouw ouwVar) {
            this.ouw = ouwVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f7413lh == 1) {
                com.bytedance.sdk.component.utils.ko.vt("RenderInterceptor", "WebView Render timeout");
                rn rnVar = rn.this;
                rnVar.ouw.ra = true;
                rnVar.ouw(this.ouw, FacebookMediationAdapter.ERROR_NULL_CONTEXT, null);
            }
        }
    }

    public rn(Context context, mwh mwhVar, com.bytedance.sdk.component.adexpress.fkw.ouw ouwVar, pno pnoVar) {
        this.vt = context;
        this.yu = mwhVar;
        this.f7412lh = pnoVar;
        this.ouw = ouwVar;
        ouwVar.yu = this.f7412lh;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj
    public final boolean ouw(final tlj.ouw ouwVar) {
        int i4 = this.yu.f7399lh;
        if (i4 < 0) {
            ouw(ouwVar, FacebookMediationAdapter.ERROR_NULL_CONTEXT, "time is ".concat(String.valueOf(i4)));
            return true;
        }
        this.fkw = com.bytedance.sdk.component.adexpress.yu.yu.ouw(new ouw(ouwVar), i4, TimeUnit.MILLISECONDS);
        this.ouw.ouw(new ra() { // from class: com.bytedance.sdk.component.adexpress.vt.rn.1
            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(View view, jg jgVar) {
                ko koVarVt;
                rn.this.vt();
                if (ouwVar.yu() || (koVarVt = ouwVar.vt()) == null) {
                    return;
                }
                koVarVt.ouw(rn.this.ouw, jgVar);
                ouwVar.lh();
            }

            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(int i10, String str) {
                rn.this.ouw(ouwVar, i10, str);
            }
        });
        return true;
    }

    public final void vt() {
        try {
            ScheduledFuture<?> scheduledFuture = this.fkw;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.fkw.cancel(false);
                this.fkw = null;
            }
            com.bytedance.sdk.component.utils.ko.vt("RenderInterceptor", "WebView Render cancel timeout timer");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj
    public final void ouw() {
        this.ouw.yu();
        vt();
    }

    public final void ouw(tlj.ouw ouwVar, int i4, String str) {
        ko koVarVt;
        if (ouwVar.yu() || this.f7411le.get()) {
            return;
        }
        vt();
        this.yu.vt.ouw(i4, str);
        if (ouwVar.vt(this)) {
            ouwVar.ouw(this);
        } else {
            if (ouwVar.yu() || (koVarVt = ouwVar.vt()) == null) {
                return;
            }
            ouwVar.lh();
            koVarVt.a_(i4);
        }
        this.f7411le.getAndSet(true);
    }
}
