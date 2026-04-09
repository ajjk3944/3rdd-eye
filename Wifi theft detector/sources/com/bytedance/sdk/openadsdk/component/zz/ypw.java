package com.bytedance.sdk.openadsdk.component.zz;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.ypw.qh;
import com.bytedance.sdk.component.adexpress.ypw.sz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.zz.cf;
import com.bytedance.sdk.openadsdk.core.zz.hxp;
import com.bytedance.sdk.openadsdk.core.zz.ul;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.vw;
import org.json.JSONException;
import org.json.JSONObject;
import s2.b;

/* loaded from: classes.dex */
public class ypw extends ul {
    private final com.bytedance.sdk.openadsdk.component.emc bw;
    float dg;
    private com.bytedance.sdk.openadsdk.component.ycc.emc dr;
    boolean emc;
    private b.InterfaceC0477b lt;
    private com.bytedance.sdk.openadsdk.component.msw.xq msw;
    private final com.bytedance.sdk.openadsdk.component.msw.emc uym;
    private FrameLayout xmt;
    int xq;
    private final com.bytedance.sdk.openadsdk.component.ycc.ypw ycc;
    boolean ypw;

    public ypw(@NonNull Context context, rie rieVar, AdSlot adSlot, String str, com.bytedance.sdk.openadsdk.component.emc emcVar, com.bytedance.sdk.openadsdk.component.ycc.ypw ypwVar, com.bytedance.sdk.openadsdk.component.msw.emc emcVar2) {
        super(context, rieVar, adSlot, str, true, true);
        this.emc = true;
        this.ypw = false;
        this.xq = 0;
        this.dg = 1.0f;
        this.bw = emcVar;
        this.ycc = ypwVar;
        this.uym = emcVar2;
        if (rieVar == null || rieVar.pdk() == null) {
            return;
        }
        this.xq = rieVar.pdk().ypw();
        this.dg = rieVar.pdk().emc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq(qh qhVar) {
        if (qhVar == null) {
            return;
        }
        if (qhVar.emc() != null) {
            if (this.emc) {
                qhVar.emc().setTag(com.bytedance.sdk.component.adexpress.dynamic.emc.ycc, 1);
                ((FrameLayout) qhVar.emc()).removeAllViews();
                FrameLayout frameLayout = (FrameLayout) qhVar.emc();
                this.xmt = frameLayout;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                this.emc = false;
                return;
            }
            return;
        }
        double dBw = qhVar.bw();
        double dYcc = qhVar.ycc();
        double dUym = qhVar.uym();
        double dMsw = qhVar.msw();
        int iYpw = vw.ypw(this.zz, (float) dBw);
        int iYpw2 = vw.ypw(this.zz, (float) dYcc);
        int iYpw3 = vw.ypw(this.zz, (float) dUym);
        int iYpw4 = vw.ypw(this.zz, (float) dMsw);
        if ((dMsw != 0.0d && dUym != 0.0d) || this.sf.xq() == 7 || this.sf.xq() == 10) {
            if ((this.sf.xq() == 7 || this.sf.xq() == 10) && (qhVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.ypw)) {
                FrameLayout frameLayoutCf = ((com.bytedance.sdk.openadsdk.core.gbl.ycc.ypw) qhVar).cf();
                if (frameLayoutCf != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayoutCf.addView(this.xmt, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.xmt.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(iYpw3, iYpw4);
            }
            layoutParams2.width = iYpw3;
            layoutParams2.height = iYpw4;
            layoutParams2.topMargin = iYpw2;
            layoutParams2.leftMargin = iYpw;
            layoutParams2.setMarginStart(iYpw);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.xmt.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public int bw() {
        com.bytedance.sdk.openadsdk.component.msw.xq xqVar = this.msw;
        if (xqVar != null && xqVar.uym()) {
            return 1;
        }
        com.bytedance.sdk.openadsdk.component.msw.xq xqVar2 = this.msw;
        if (xqVar2 != null && xqVar2.ycc()) {
            return 3;
        }
        com.bytedance.sdk.openadsdk.component.msw.xq xqVar3 = this.msw;
        if (xqVar3 != null && xqVar3.bw()) {
            return 2;
        }
        com.bytedance.sdk.openadsdk.component.msw.xq xqVar4 = this.msw;
        if (xqVar4 == null || !xqVar4.xq()) {
            com.bytedance.sdk.openadsdk.component.msw.xq xqVar5 = this.msw;
            return (xqVar5 == null || !xqVar5.dg()) ? 3 : 5;
        }
        uym(4);
        return 4;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public long dg() {
        return this.uym.xq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc(int i10, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul
    public int getDynamicShowType() {
        if (this.sf == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul
    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.component.uym.emc.emc(this.sup, aa.dg().uym(String.valueOf(this.sup.tx())));
    }

    public FrameLayout getVideoFrameLayout() {
        return this.xmt;
    }

    public void setExpressVideoListenerProxy(b.InterfaceC0477b interfaceC0477b) {
        this.lt = interfaceC0477b;
    }

    public void setTopListener(com.bytedance.sdk.openadsdk.component.ycc.emc emcVar) {
        this.dr = emcVar;
    }

    public void setVideoManager(com.bytedance.sdk.openadsdk.component.msw.xq xqVar) {
        this.msw = xqVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul
    public void uym() {
        this.cf = true;
        this.xmt = new FrameLayout(this.zz);
        if (!com.bytedance.sdk.openadsdk.core.gbl.bw.emc(this.sup) && !com.bytedance.sdk.openadsdk.core.gbl.bw.ypw(this.sup)) {
            addView(this.xmt, new FrameLayout.LayoutParams(-1, -1));
        }
        super.uym();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.sz.uym() { // from class: com.bytedance.sdk.openadsdk.component.zz.ypw.1
            @Override // com.bytedance.sdk.openadsdk.sz.uym
            public void emc(qh qhVar) {
                ypw.this.emc(qhVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void ycc() {
        com.bytedance.sdk.openadsdk.component.ycc.emc emcVar = this.dr;
        if (emcVar != null) {
            emcVar.ypw(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void ypw() {
        super.ypw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.component.adexpress.ypw.cf
    public void emc(com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar, qh qhVar) {
        this.sf = dgVar;
        if (dgVar instanceof hxp) {
            hxp hxpVar = (hxp) dgVar;
            if (hxpVar.vk() != null) {
                hxpVar.vk().emc((cf) this);
            }
        }
        if (qhVar != null && qhVar.ypw()) {
            emc(qhVar);
        }
        super.emc(dgVar, qhVar);
    }

    public void emc(final qh qhVar) {
        if (qhVar == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.zz.ypw.2
            @Override // java.lang.Runnable
            public void run() {
                ypw.this.xq(qhVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc() {
        com.bytedance.sdk.openadsdk.component.ycc.emc emcVar = this.dr;
        if (emcVar != null) {
            emcVar.emc(this);
        }
    }

    public void emc(long j10, long j11) {
        com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar = this.sf;
        if (dgVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.dg) {
            ((com.bytedance.sdk.openadsdk.core.gbl.ycc.dg) dgVar).emc(j10, j11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public boolean emc(JSONObject jSONObject) {
        rie rieVar;
        if (jSONObject == null) {
            this.ypw = false;
            return false;
        }
        int i10 = this.xq;
        if (i10 != 1 && i10 != 2) {
            this.ypw = false;
            return false;
        }
        int iOptInt = jSONObject.optInt("switch", 0);
        float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
        this.dg = fOptDouble;
        if (fOptDouble <= 0.0f && (rieVar = this.sup) != null && rieVar.pdk() != null) {
            this.dg = this.sup.pdk().emc();
        }
        boolean z10 = iOptInt == 1;
        this.ypw = z10;
        com.bytedance.sdk.openadsdk.component.ycc.ypw ypwVar = this.ycc;
        if (ypwVar != null) {
            ypwVar.emc(this.xq, this.dg, z10);
            com.bytedance.sdk.openadsdk.component.msw.xq xqVar = this.msw;
            if (xqVar != null && xqVar.ypw() != null && this.uym != null) {
                this.msw.ypw().emc(this.uym.emc());
                com.bytedance.sdk.component.utils.ul.emc("PAGAppOpenAdExpressView", "isAccelerate =" + this.ypw + ",total duration = " + this.msw.ypw().aa());
            }
        }
        if (this.xq == 1) {
            return true;
        }
        if (!this.ypw) {
            this.dg = 1.0f;
        }
        com.bytedance.sdk.openadsdk.component.msw.xq xqVar2 = this.msw;
        if (xqVar2 != null) {
            return xqVar2.emc(this.dg);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public long xq() {
        return this.uym.xq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc(int i10) {
        com.bytedance.sdk.openadsdk.component.msw.xq xqVar = this.msw;
        if (xqVar == null) {
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                xqVar.msw();
                this.ycc.dg();
                return;
            } else if (i10 == 3) {
                xqVar.zz();
                this.ycc.xq();
                return;
            } else if (i10 == 4) {
                xqVar.ru();
                return;
            } else if (i10 != 5) {
                return;
            }
        }
        if (xqVar.bw() || this.msw.ycc()) {
            return;
        }
        this.msw.emc(getVideoFrameLayout(), this.bw, this.sup);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul
    public void xq(JSONObject jSONObject) throws JSONException {
        rie rieVar = this.sup;
        boolean z10 = rieVar != null && rieVar.ej() == 0;
        rie rieVar2 = this.sup;
        com.bytedance.sdk.openadsdk.component.uym.emc.emc(jSONObject, rieVar2 != null ? rieVar2.tx() : 0, z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.component.adexpress.ypw.msw
    public void emc(View view, int i10, com.bytedance.sdk.component.adexpress.xq xqVar) {
        if (i10 != -1 && xqVar != null && i10 == 3) {
            ycc();
        } else {
            super.emc(view, i10, xqVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul
    public void emc(sz.emc emcVar) {
        emcVar.bw(com.bytedance.sdk.openadsdk.component.uym.emc.emc());
    }
}
