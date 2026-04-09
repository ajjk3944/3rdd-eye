package com.bytedance.sdk.component.adexpress.dynamic.ouw;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fak;
import com.bytedance.sdk.component.adexpress.dynamic.fkw.pno;
import com.bytedance.sdk.component.adexpress.dynamic.yu.le;
import com.bytedance.sdk.component.adexpress.lh;
import com.bytedance.sdk.component.adexpress.ouw.vt.vt;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.vt.cf;
import com.bytedance.sdk.component.adexpress.vt.jg;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.bytedance.sdk.component.adexpress.vt.ra;
import com.bytedance.sdk.component.adexpress.vt.yu;
import com.bytedance.sdk.component.utils.bly;
import com.bytedance.sdk.component.utils.ko;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw implements cf, yu<DynamicRootView> {
    private ra fkw;

    /* renamed from: le, reason: collision with root package name */
    private mwh f7277le;

    /* renamed from: lh, reason: collision with root package name */
    private pno f7278lh;
    public DynamicRootView ouw;
    private AtomicBoolean pno = new AtomicBoolean(false);
    private ScheduledFuture<?> ra;
    public com.bytedance.sdk.component.adexpress.vt.pno vt;
    private Context yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw$ouw, reason: collision with other inner class name */
    public class RunnableC0042ouw implements Runnable {
        private int vt = 2;

        public RunnableC0042ouw() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.vt == 2) {
                ko.vt("DynamicRender", "Dynamic parse time out");
                ouw.this.ouw.callBackRenderFail(ouw.this.f7278lh instanceof com.bytedance.sdk.component.adexpress.dynamic.fkw.ra ? 127 : 117, null);
            }
        }
    }

    public ouw(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z3, pno pnoVar, mwh mwhVar, com.bytedance.sdk.component.adexpress.dynamic.le.ouw ouwVar) {
        this.yu = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z3, mwhVar, ouwVar);
        this.ouw = dynamicRootView;
        this.f7278lh = pnoVar;
        this.f7277le = mwhVar;
        dynamicRootView.setRenderListener(this);
        this.f7277le = mwhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yu() {
        this.f7277le.vt.vt(vt());
        JSONObject jSONObjectOuw = this.f7277le.ouw();
        if (vt.ouw(jSONObjectOuw)) {
            this.f7278lh.ouw(new com.bytedance.sdk.component.adexpress.dynamic.le.vt() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw.2
                @Override // com.bytedance.sdk.component.adexpress.dynamic.le.vt
                public final void ouw(final com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
                    ouw.vt(ouw.this);
                    ouw.this.f7277le.vt.lh(ouw.this.vt());
                    ouw.this.ouw(pnoVar);
                    ouw.this.vt(pnoVar);
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        ouw.lh(ouw.this, pnoVar);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ouw.lh(ouw.this, pnoVar);
                            }
                        });
                    }
                    if (ouw.this.ouw == null || pnoVar == null) {
                        return;
                    }
                    ouw.this.ouw.setBgColor(pnoVar.mwh);
                    ouw.this.ouw.setBgMaterialCenterCalcColor(pnoVar.rn);
                }
            });
            this.f7278lh.ouw(this.f7277le);
            return;
        }
        int i4 = this.f7278lh instanceof com.bytedance.sdk.component.adexpress.dynamic.fkw.ra ? 123 : AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID;
        DynamicRootView dynamicRootView = this.ouw;
        StringBuilder sb2 = new StringBuilder("data null is ");
        sb2.append(jSONObjectOuw == null);
        dynamicRootView.callBackRenderFail(i4, sb2.toString());
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public final /* bridge */ /* synthetic */ View lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public final int vt() {
        return this.f7278lh instanceof com.bytedance.sdk.component.adexpress.dynamic.fkw.ra ? 3 : 2;
    }

    public static /* synthetic */ void lh(ouw ouwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        if (pnoVar == null) {
            ouwVar.ouw.callBackRenderFail(ouwVar.f7278lh instanceof com.bytedance.sdk.component.adexpress.dynamic.fkw.ra ? 123 : AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID, "layoutUnit is null");
            return;
        }
        ouwVar.f7277le.vt.yu(ouwVar.vt());
        try {
            ouwVar.ouw.render(pnoVar, ouwVar.vt());
        } catch (Exception e2) {
            int i4 = ouwVar.f7278lh instanceof com.bytedance.sdk.component.adexpress.dynamic.fkw.ra ? 128 : 118;
            ouwVar.ouw.callBackRenderFail(i4, "exception is " + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vt(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        float f10;
        float f11;
        List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list;
        int i4;
        int i10;
        if (pnoVar == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list2 = pnoVar.tlj;
        if (list2 == null || list2.size() <= 0) {
            f10 = 0.0f;
        } else {
            f10 = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2 : list2) {
                if (pnoVar2.f7306lh > pnoVar.f7306lh - pnoVar2.ra || (list = pnoVar2.tlj) == null || list.size() <= 0) {
                    f11 = 0.0f;
                } else {
                    f11 = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar3 : list) {
                        if (pnoVar3.bly.ouw.equals("logo-union")) {
                            f11 = pnoVar3.bly.f7280lh.zvq;
                            float f12 = ((-f11) + pnoVar.f7306lh) - pnoVar2.f7306lh;
                            List<com.bytedance.sdk.component.adexpress.dynamic.yu.ouw> list3 = pnoVar2.bly.f7280lh.njr;
                            if (list3 != null) {
                                for (com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar : list3) {
                                    if ("translate".equals(ouwVar.ouw) && (i10 = ouwVar.f7299jg) < 0) {
                                        i4 = -i10;
                                        break;
                                    }
                                }
                                i4 = 0;
                                f10 = f12 + i4;
                            } else {
                                i4 = 0;
                                f10 = f12 + i4;
                            }
                        }
                    }
                }
                vt(pnoVar2);
                if (f11 <= -15.0f) {
                    pnoVar2.ra -= f11;
                    pnoVar2.f7306lh += f11;
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it = pnoVar2.tlj.iterator();
                    while (it.hasNext()) {
                        it.next().f7306lh -= f11;
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar4 = pnoVar.f7303cf;
        if (pnoVar4 == null) {
            return;
        }
        float f13 = pnoVar.vt - pnoVar4.vt;
        float f14 = pnoVar.f7306lh - pnoVar4.f7306lh;
        pnoVar.vt = f13;
        pnoVar.f7306lh = f14;
        if (f10 > 0.0f) {
            pnoVar.f7306lh = f14 - f10;
            pnoVar.ra += f10;
            Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it2 = pnoVar.tlj.iterator();
            while (it2.hasNext()) {
                it2.next().f7306lh += f10;
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public void ouw(ra raVar) {
        this.fkw = raVar;
        int i4 = this.f7277le.f7399lh;
        if (i4 < 0) {
            this.ouw.callBackRenderFail(this.f7278lh instanceof com.bytedance.sdk.component.adexpress.dynamic.fkw.ra ? 127 : 117, "time is ".concat(String.valueOf(i4)));
            return;
        }
        this.ra = com.bytedance.sdk.component.adexpress.yu.yu.ouw(new RunnableC0042ouw(), i4, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() == Looper.myLooper() && this.f7277le.fkw <= 0) {
            yu();
        } else {
            bly.vt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    ouw.this.yu();
                }
            }, this.f7277le.fkw);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ouw(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i4 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i4 >= viewGroup.getChildCount()) {
                    break;
                }
                ouw(viewGroup.getChildAt(i4));
                i4++;
            }
        }
        if (view instanceof fak) {
            ((fak) view).a_();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.cf
    public final void ouw(jg jgVar) {
        DynamicRootView dynamicRootView;
        if (this.pno.get()) {
            return;
        }
        this.pno.set(true);
        if (jgVar.vt && (dynamicRootView = this.ouw) != null && dynamicRootView.getChildCount() != 0) {
            this.ouw.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.fkw.ouw(this.ouw, jgVar);
        } else {
            this.fkw.ouw(jgVar.f7391jg, jgVar.mwh);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.cf
    public final void ouw(View view, int i4, lh lhVar) {
        com.bytedance.sdk.component.adexpress.vt.pno pnoVar = this.vt;
        if (pnoVar != null) {
            pnoVar.ouw(view, i4, lhVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list;
        if (pnoVar == null || (list = pnoVar.tlj) == null || list.size() <= 0) {
            return;
        }
        Collections.sort(list, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw.3
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar3) {
                le leVar = pnoVar2.bly.f7280lh;
                le leVar2 = pnoVar3.bly.f7280lh;
                if (leVar == null || leVar2 == null) {
                    return 0;
                }
                return leVar.lvd >= leVar2.lvd ? 1 : -1;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2 : list) {
            if (pnoVar2 != null) {
                ouw(pnoVar2);
            }
        }
    }

    public void ouw() {
        ouw(this.ouw);
    }

    public static /* synthetic */ void vt(ouw ouwVar) {
        try {
            ScheduledFuture<?> scheduledFuture = ouwVar.ra;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                ouwVar.ra.cancel(false);
                ouwVar.ra = null;
            }
            ko.vt("DynamicRender", "WebView Render cancel timeout timer");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
