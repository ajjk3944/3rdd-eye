package com.bytedance.sdk.openadsdk.tc.vt;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl.vt.lh;
import com.bytedance.sdk.openadsdk.tc.vt.fkw;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class vt {
    private volatile boolean bly = false;
    final Integer fkw;

    /* renamed from: le, reason: collision with root package name */
    private final AtomicLong f8667le;

    /* renamed from: lh, reason: collision with root package name */
    protected vpp f8668lh;
    final AtomicBoolean ouw;
    private final int pno;
    private final fkw.ouw ra;
    protected WeakReference<View> vt;
    protected final AtomicBoolean yu;

    public vt(Integer num, View view, vpp vppVar, int i4, fkw.ouw ouwVar) {
        this.fkw = num;
        this.pno = i4;
        this.f8668lh = vppVar;
        this.ra = ouwVar;
        ouw(view);
        this.yu = new AtomicBoolean(false);
        this.f8667le = new AtomicLong(-1L);
        this.ouw = new AtomicBoolean(false);
    }

    public boolean bly() {
        return this.yu.get();
    }

    public abstract int fkw();

    public final void le() {
        if (this.ouw.get()) {
            return;
        }
        if (!this.yu.get()) {
            ra();
        } else if (!this.f8667le.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.f8667le.get() >= this.pno) {
            yu();
        }
    }

    public abstract boolean lh();

    public void ouw() {
        if (this.yu.compareAndSet(false, true)) {
            ra.ouw(this);
        }
    }

    public final void pno() {
        this.bly = true;
        ra.vt(this);
    }

    public final void ra() {
        this.f8667le.set(-1L);
    }

    public final int vt() {
        if (this.ouw.get()) {
            return 1;
        }
        WeakReference<View> weakReference = this.vt;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.bly) {
            return 3;
        }
        if (this.fkw.equals(view.getTag(33554433))) {
            return (this.fkw.equals(view.getTag(33554433)) && lh()) ? 1 : 2;
        }
        pno();
        fkw.vt(this.fkw);
        return 3;
    }

    public abstract void vt(int i4);

    public void yu() {
        final ouw ouwVar;
        if (this.ouw.compareAndSet(false, true)) {
            final vpp vppVar = this.f8668lh;
            WeakReference<View> weakReference = this.vt;
            if (weakReference == null) {
                ouwVar = new ouw(-1, -1, -1.0f);
            } else {
                View view = weakReference.get();
                ouwVar = view == null ? new ouw(0, 0, 0.0f) : new ouw(view.getWidth(), view.getHeight(), view.getAlpha());
            }
            final fkw.ouw ouwVar2 = this.ra;
            vppVar.vrp = true;
            final String str = "mrc_report";
            bs.lh(new com.bytedance.sdk.component.pno.pno(str) { // from class: com.bytedance.sdk.openadsdk.tc.vt.yu.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (vppVar.fvf()) {
                        if (vppVar.lso()) {
                            vpp vppVar2 = vppVar;
                            com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(vppVar2.rrs, new lh.vt("show_urls", vppVar2));
                        } else {
                            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar);
                        }
                    }
                    String strOuw = uoy.ouw(vppVar);
                    final JSONObject jSONObject = new JSONObject();
                    ouw ouwVar3 = ouwVar;
                    JSONObject jSONObjectOuw = null;
                    if (ouwVar3 != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("width", ouwVar3.ouw);
                            jSONObject2.put("height", ouwVar3.vt);
                            jSONObject2.put("alpha", ouwVar3.f8665lh);
                            jSONObject.put("root_view", jSONObject2);
                            fkw.ouw ouwVar4 = ouwVar2;
                            if (ouwVar4 != null) {
                                int i4 = ouwVar4.ouw;
                                if (i4 != -1) {
                                    jSONObject.put("dynamic_show_type", i4);
                                }
                                int i10 = ouwVar2.vt;
                                if (i10 != -1) {
                                    jSONObjectOuw = com.bytedance.sdk.openadsdk.yu.lh.ouw(i10 + 1);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    final JSONObject jSONObject3 = jSONObjectOuw;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, strOuw, "mrc_show", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.tc.vt.yu.1.1
                        @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                        public final JSONObject lh() {
                            return jSONObject;
                        }

                        @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                        public final JSONObject ouw() {
                            return jSONObject3;
                        }
                    });
                }
            });
        }
    }

    public final void ouw(int i4) {
        if (i4 == 4) {
            ouw();
            return;
        }
        if (i4 == 8) {
            this.yu.set(false);
            ra();
        } else if (i4 == 9) {
            yu();
        } else {
            vt(i4);
        }
    }

    public final void ouw(View view) {
        if (view != null) {
            view.setTag(33554433, this.fkw);
        }
        this.vt = new WeakReference<>(view);
    }
}
