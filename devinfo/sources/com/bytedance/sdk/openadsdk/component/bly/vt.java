package com.bytedance.sdk.openadsdk.component.bly;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b9.b;
import com.bytedance.sdk.component.adexpress.vt.jg;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.bly.ex;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.cd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends qbp {
    private com.bytedance.sdk.openadsdk.component.le.ouw bly;

    /* renamed from: cf, reason: collision with root package name */
    private b f7867cf;
    private final com.bytedance.sdk.openadsdk.component.ouw fkw;

    /* renamed from: le, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.le.vt f7868le;

    /* renamed from: lh, reason: collision with root package name */
    int f7869lh;
    boolean ouw;
    private com.bytedance.sdk.openadsdk.component.pno.lh pno;
    private final com.bytedance.sdk.openadsdk.component.pno.ouw ra;
    private FrameLayout tlj;
    boolean vt;
    float yu;

    public vt(Context context, vpp vppVar, AdSlot adSlot, String str, com.bytedance.sdk.openadsdk.component.ouw ouwVar, com.bytedance.sdk.openadsdk.component.le.vt vtVar, com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar2) {
        cd cdVar;
        super(context, vppVar, adSlot, str, true, true);
        this.ouw = true;
        this.vt = false;
        this.f7869lh = 0;
        this.yu = 1.0f;
        this.fkw = ouwVar;
        this.f7868le = vtVar;
        this.ra = ouwVar2;
        if (vppVar == null || (cdVar = vppVar.f8311tj) == null) {
            return;
        }
        this.f7869lh = cdVar.vt;
        this.yu = cdVar.ouw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final long fkw() {
        return this.ra.vt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final int getDynamicShowType() {
        if (this.fvf == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final int getRenderTimeout() {
        vpp vppVar = this.ko;
        zih.yu();
        return cf.qbp(String.valueOf(this.ko.fqk())).vm - vppVar.f8313uj;
    }

    public final FrameLayout getVideoFrameLayout() {
        return this.tlj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final int le() {
        com.bytedance.sdk.openadsdk.component.pno.vt vtVar;
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar;
        com.bytedance.sdk.openadsdk.component.pno.vt vtVar2;
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar2 = this.pno;
        if (lhVar2 != null && (vtVar2 = lhVar2.vt) != null && vtVar2.tc) {
            return 1;
        }
        if (lhVar2 != null && lhVar2.vt()) {
            return 3;
        }
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar3 = this.pno;
        if (lhVar3 != null && lhVar3.ouw()) {
            return 2;
        }
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar4 = this.pno;
        if (lhVar4 == null || !lhVar4.f7900lh) {
            return (lhVar4 == null || (vtVar = lhVar4.vt) == null || (lhVar = vtVar.f8336le) == null || !lhVar.vt()) ? 3 : 5;
        }
        le(4);
        return 4;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void lh() {
        super.lh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i4, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void pno() {
        this.vm = true;
        this.tlj = new FrameLayout(this.ryl);
        if (!com.bytedance.sdk.openadsdk.core.cf.yu.ouw(this.ko) && !com.bytedance.sdk.openadsdk.core.cf.yu.vt(this.ko)) {
            addView(this.tlj, new FrameLayout.LayoutParams(-1, -1));
        }
        super.pno();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.mwh.ra() { // from class: com.bytedance.sdk.openadsdk.component.bly.vt.1
            @Override // com.bytedance.sdk.openadsdk.mwh.ra
            public final void ouw(jg jgVar) {
                vt.this.ouw(jgVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ra() {
        com.bytedance.sdk.openadsdk.component.le.ouw ouwVar = this.bly;
        if (ouwVar != null) {
            ouwVar.lh();
        }
    }

    public final void setExpressVideoListenerProxy(b bVar) {
        this.f7867cf = bVar;
    }

    public final void setTopListener(com.bytedance.sdk.openadsdk.component.le.ouw ouwVar) {
        this.bly = ouwVar;
    }

    public final void setVideoManager(com.bytedance.sdk.openadsdk.component.pno.lh lhVar) {
        this.pno = lhVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void vt(JSONObject jSONObject) throws JSONException {
        vpp vppVar = this.ko;
        boolean z3 = vppVar != null && vppVar.kfa == 0;
        int iFqk = vppVar != null ? vppVar.fqk() : 0;
        try {
            String strPno = bly.ouw().pno();
            int iBly = bly.ouw().bly();
            JSONObject jSONObject2 = jSONObject.getJSONObject("creative");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("app_name", strPno);
            if (!z3) {
                jSONObject3.put("app_icon_id", "@".concat(String.valueOf(iBly)));
            } else if (bly.ouw().bly() != 0) {
                jSONObject3.put("app_icon_id", "local://pag_open_icon_id");
            }
            jSONObject2.put("open_app_info", jSONObject3);
            if (jSONObject2.optJSONObject("video") == null) {
                JSONObject jSONObject4 = new JSONObject();
                zih.yu();
                jSONObject4.put("video_duration", cf.vm(String.valueOf(iFqk)));
                jSONObject2.put("video", jSONObject4);
            }
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAppOpenUtils", e2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final long yu() {
        return this.ra.vt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.component.adexpress.vt.ko
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar, jg jgVar) {
        bs bsVar;
        this.fvf = yuVar;
        if ((yuVar instanceof ex) && (bsVar = ((ex) yuVar).f8054jg) != null) {
            bsVar.f8104cf = this;
        }
        if (jgVar != null && jgVar.vt) {
            ouw(jgVar);
        }
        super.ouw(yuVar, jgVar);
    }

    public final void ouw(final jg jgVar) {
        if (jgVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.bly.vt.2
            @Override // java.lang.Runnable
            public final void run() {
                vt.ouw(vt.this, jgVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw() {
        com.bytedance.sdk.openadsdk.component.le.ouw ouwVar = this.bly;
        if (ouwVar != null) {
            ouwVar.vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final boolean ouw(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.component.pno.vt vtVar;
        com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar;
        vpp vppVar;
        cd cdVar;
        if (jSONObject == null) {
            this.vt = false;
            return false;
        }
        int i4 = this.f7869lh;
        if (i4 != 1 && i4 != 2) {
            this.vt = false;
            return false;
        }
        int iOptInt = jSONObject.optInt("switch", 0);
        float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
        this.yu = fOptDouble;
        if (fOptDouble <= 0.0f && (vppVar = this.ko) != null && (cdVar = vppVar.f8311tj) != null) {
            this.yu = cdVar.ouw;
        }
        boolean z3 = iOptInt == 1;
        this.vt = z3;
        com.bytedance.sdk.openadsdk.component.le.vt vtVar2 = this.f7868le;
        if (vtVar2 != null) {
            vtVar2.ouw(this.f7869lh, this.yu, z3);
            com.bytedance.sdk.openadsdk.component.pno.lh lhVar = this.pno;
            if (lhVar != null && (vtVar = lhVar.vt) != null && (ouwVar = this.ra) != null) {
                vtVar.ouw(ouwVar.yu);
                com.bytedance.sdk.component.utils.qbp.ouw("PAGAppOpenAdExpressView", "isAccelerate =" + this.vt + ",total duration = " + this.pno.vt.jae());
            }
        }
        if (this.f7869lh == 1) {
            return true;
        }
        if (!this.vt) {
            this.yu = 1.0f;
        }
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar2 = this.pno;
        if (lhVar2 != null) {
            return lhVar2.ouw(this.yu);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i4) {
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar = this.pno;
        if (lhVar == null) {
            return;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                lhVar.lh();
                this.f7868le.vt();
                return;
            }
            if (i4 == 3) {
                try {
                    if (lhVar.vt()) {
                        lhVar.yu();
                    }
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.qbp.lh("TTAppOpenVideoManager", "onContinue throw Exception :" + th2.getMessage());
                }
                this.f7868le.ouw();
                return;
            }
            if (i4 == 4) {
                com.bytedance.sdk.openadsdk.component.pno.vt vtVar = lhVar.vt;
                if (vtVar != null) {
                    vtVar.mwh();
                    lhVar.vt = null;
                    return;
                }
                return;
            }
            if (i4 != 5) {
                return;
            }
        }
        if (lhVar.ouw() || this.pno.vt()) {
            return;
        }
        this.pno.ouw(getVideoFrameLayout(), this.fkw, this.ko);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.component.adexpress.vt.pno
    public final void ouw(View view, int i4, com.bytedance.sdk.component.adexpress.lh lhVar) {
        if (i4 != -1 && lhVar != null && i4 == 3) {
            ra();
        } else {
            super.ouw(view, i4, lhVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void ouw(mwh.ouw ouwVar) {
        Context contextOuw = zih.ouw();
        boolean zLh = com.bytedance.sdk.openadsdk.multipro.vt.lh();
        com.bytedance.sdk.openadsdk.component.le.ouw(zih.ouw());
        ouwVar.zih = com.bytedance.sdk.component.utils.ra.ouw(contextOuw, zLh, com.bytedance.sdk.openadsdk.component.le.ouw()).getAbsolutePath();
    }

    public static /* synthetic */ void ouw(vt vtVar, jg jgVar) {
        if (jgVar != null) {
            View view = jgVar.rn;
            if (view != null) {
                if (vtVar.ouw) {
                    view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ouw.f7274le, 1);
                    ((FrameLayout) jgVar.rn).removeAllViews();
                    FrameLayout frameLayout = (FrameLayout) jgVar.rn;
                    vtVar.tlj = frameLayout;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                    vtVar.ouw = false;
                    return;
                }
                return;
            }
            double d10 = jgVar.fkw;
            double d11 = jgVar.f7392le;
            double d12 = jgVar.f7390cf;
            double d13 = jgVar.ryl;
            int iOuw = osn.ouw(vtVar.ryl, (float) d10);
            int iOuw2 = osn.ouw(vtVar.ryl, (float) d11);
            int iOuw3 = osn.ouw(vtVar.ryl, (float) d12);
            int iOuw4 = osn.ouw(vtVar.ryl, (float) d13);
            ko.vt("ExpressView", "vW x vH =" + d12 + "x" + d13);
            if ((d13 != 0.0d && d12 != 0.0d) || vtVar.fvf.vt() == 7 || vtVar.fvf.vt() == 10) {
                if ((vtVar.fvf.vt() == 7 || vtVar.fvf.vt() == 10) && (jgVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.vt)) {
                    FrameLayout frameLayout2 = ((com.bytedance.sdk.openadsdk.core.cf.le.vt) jgVar).zih;
                    if (frameLayout2 != null) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.gravity = 17;
                        frameLayout2.addView(vtVar.tlj, layoutParams);
                        return;
                    }
                    return;
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) vtVar.tlj.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new FrameLayout.LayoutParams(iOuw3, iOuw4);
                }
                layoutParams2.width = iOuw3;
                layoutParams2.height = iOuw4;
                layoutParams2.topMargin = iOuw2;
                layoutParams2.leftMargin = iOuw;
                layoutParams2.setMarginStart(iOuw);
                layoutParams2.setMarginEnd(layoutParams2.rightMargin);
                vtVar.tlj.setLayoutParams(layoutParams2);
            }
        }
    }
}
