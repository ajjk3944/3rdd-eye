package com.bytedance.sdk.component.adexpress.dynamic.emc;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dg.ycc;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mkp;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.xq;
import com.bytedance.sdk.component.adexpress.ypw.dg;
import com.bytedance.sdk.component.adexpress.ypw.gbl;
import com.bytedance.sdk.component.adexpress.ypw.msw;
import com.bytedance.sdk.component.adexpress.ypw.qh;
import com.bytedance.sdk.component.adexpress.ypw.sz;
import com.bytedance.sdk.component.adexpress.ypw.uym;
import com.bytedance.sdk.component.utils.zz;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc implements dg<DynamicRootView>, gbl {
    private msw bw;
    private uym dg;
    private DynamicRootView emc;
    private AtomicBoolean msw = new AtomicBoolean(false);
    private ScheduledFuture<?> uym;
    private Context xq;
    private sz ycc;
    private com.bytedance.sdk.component.adexpress.dynamic.bw.msw ypw;

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.emc.emc$emc, reason: collision with other inner class name */
    public class RunnableC0023emc implements Runnable {
        private int ypw;

        public RunnableC0023emc(int i) {
            this.ypw = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.ypw == 2) {
                emc.this.emc.callBackRenderFail(emc.this.ypw instanceof com.bytedance.sdk.component.adexpress.dynamic.bw.uym ? 127 : 117, null);
            }
        }
    }

    public emc(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z6, com.bytedance.sdk.component.adexpress.dynamic.bw.msw mswVar, sz szVar, com.bytedance.sdk.component.adexpress.dynamic.ycc.emc emcVar) {
        this.xq = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z6, szVar, emcVar);
        this.emc = dynamicRootView;
        this.ypw = mswVar;
        this.ycc = szVar;
        dynamicRootView.setRenderListener(this);
        this.ycc = szVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void msw() {
        try {
            ScheduledFuture<?> scheduledFuture = this.uym;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.uym.cancel(false);
            this.uym = null;
        } catch (Throwable unused) {
        }
    }

    private boolean uym() {
        DynamicRootView dynamicRootView = this.emc;
        return (dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ycc() {
        this.ycc.bw().ypw(xq());
        JSONObject jSONObjectXq = this.ycc.xq();
        if (com.bytedance.sdk.component.adexpress.emc.ypw.ypw.emc(jSONObjectXq)) {
            this.ypw.emc(new com.bytedance.sdk.component.adexpress.dynamic.ycc.ypw() { // from class: com.bytedance.sdk.component.adexpress.dynamic.emc.emc.2
                @Override // com.bytedance.sdk.component.adexpress.dynamic.ycc.ypw
                public void emc(final com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
                    emc.this.msw();
                    emc.this.ycc.bw().xq(emc.this.xq());
                    emc.this.emc(mswVar);
                    emc.this.ypw(mswVar);
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        emc.this.xq(mswVar);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.emc.emc.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                emc.this.xq(mswVar);
                            }
                        });
                    }
                    if (emc.this.emc == null || mswVar == null) {
                        return;
                    }
                    emc.this.emc.setBgColor(mswVar.emc());
                    emc.this.emc.setBgMaterialCenterCalcColor(mswVar.ypw());
                }
            });
            this.ypw.emc(this.ycc);
            return;
        }
        int i = this.ypw instanceof com.bytedance.sdk.component.adexpress.dynamic.bw.uym ? 123 : 113;
        DynamicRootView dynamicRootView = this.emc;
        StringBuilder sb = new StringBuilder("data null is ");
        sb.append(jSONObjectXq == null);
        dynamicRootView.callBackRenderFail(i, sb.toString());
    }

    public DynamicRootView dg() {
        return this.emc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        float fUym;
        float fYcc;
        List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> listGbl;
        if (mswVar == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> listGbl2 = mswVar.gbl();
        if (listGbl2 == null || listGbl2.size() <= 0) {
            fUym = 0.0f;
        } else {
            fUym = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar2 : listGbl2) {
                if (mswVar2.uym() > mswVar.uym() - mswVar2.zz() || (listGbl = mswVar2.gbl()) == null || listGbl.size() <= 0) {
                    fYcc = 0.0f;
                } else {
                    fYcc = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar3 : listGbl) {
                        if (mswVar3.ru().ypw().equals("logo-union")) {
                            fYcc = mswVar3.ru().ycc();
                            fUym = ((mswVar.uym() + (-fYcc)) - mswVar2.uym()) + mswVar2.ru().bw().nx();
                        }
                    }
                }
                ypw(mswVar2);
                if (fYcc <= -15.0f) {
                    mswVar2.ycc(mswVar2.zz() - fYcc);
                    mswVar2.dg(mswVar2.uym() + fYcc);
                    for (com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar4 : mswVar2.gbl()) {
                        mswVar4.dg(mswVar4.uym() - fYcc);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVarSup = mswVar.sup();
        if (mswVarSup == null) {
            return;
        }
        float fYcc2 = mswVar.ycc() - mswVarSup.ycc();
        float fUym2 = mswVar.uym() - mswVarSup.uym();
        mswVar.xq(fYcc2);
        mswVar.dg(fUym2);
        if (fUym > 0.0f) {
            mswVar.dg(mswVar.uym() - fUym);
            mswVar.ycc(mswVar.zz() + fUym);
            for (com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar5 : mswVar.gbl()) {
                mswVar5.dg(mswVar5.uym() + fUym);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.dg
    public void emc(uym uymVar) {
        this.dg = uymVar;
        int iYcc = this.ycc.ycc();
        if (iYcc < 0) {
            this.emc.callBackRenderFail(this.ypw instanceof com.bytedance.sdk.component.adexpress.dynamic.bw.uym ? 127 : 117, "time is ".concat(String.valueOf(iYcc)));
            return;
        }
        this.uym = com.bytedance.sdk.component.adexpress.dg.dg.emc(new RunnableC0023emc(2), iYcc, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() == Looper.myLooper() && this.ycc.zz() <= 0) {
            ycc();
        } else {
            zz.ypw().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.emc.emc.1
                @Override // java.lang.Runnable
                public void run() {
                    emc.this.ycc();
                }
            }, this.ycc.zz());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.dg
    public int xq() {
        return this.ypw instanceof com.bytedance.sdk.component.adexpress.dynamic.bw.uym ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        if (mswVar == null) {
            this.emc.callBackRenderFail(this.ypw instanceof com.bytedance.sdk.component.adexpress.dynamic.bw.uym ? 123 : 113, "layoutUnit is null");
            return;
        }
        this.ycc.bw().dg(xq());
        try {
            this.emc.render(mswVar, xq());
        } catch (Exception e6) {
            int i = this.ypw instanceof com.bytedance.sdk.component.adexpress.dynamic.bw.uym ? 128 : 118;
            this.emc.callBackRenderFail(i, "exception is " + e6.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> listGbl;
        if (mswVar == null || (listGbl = mswVar.gbl()) == null || listGbl.size() <= 0) {
            return;
        }
        Collections.sort(listGbl, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.dg.msw>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.emc.emc.3
            @Override // java.util.Comparator
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar2, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar3) {
                ycc yccVarBw = mswVar2.ru().bw();
                ycc yccVarBw2 = mswVar3.ru().bw();
                if (yccVarBw == null || yccVarBw2 == null) {
                    return 0;
                }
                return yccVarBw.vum() >= yccVarBw2.vum() ? 1 : -1;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar2 : listGbl) {
            if (mswVar2 != null) {
                emc(mswVar2);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.dg
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public DynamicRootView bw() {
        return dg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void emc(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                emc(viewGroup.getChildAt(i));
                i++;
            }
        }
        if (view instanceof mkp) {
            ((mkp) view).ypw();
        }
    }

    public void emc(msw mswVar) {
        this.bw = mswVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.gbl
    public void emc(qh qhVar) {
        if (this.msw.get()) {
            return;
        }
        this.msw.set(true);
        if (qhVar.ypw() && uym()) {
            this.emc.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.dg.emc(bw(), qhVar);
            return;
        }
        this.dg.emc(qhVar.ru(), qhVar.zz());
    }

    public void ypw() {
        emc(bw());
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.gbl
    public void emc(View view, int i, xq xqVar) {
        msw mswVar = this.bw;
        if (mswVar != null) {
            mswVar.emc(view, i, xqVar);
        }
    }
}
