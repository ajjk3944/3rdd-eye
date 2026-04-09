package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.vt;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.tc;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.ko.cf;
import com.bytedance.sdk.openadsdk.utils.bly;
import com.bytedance.sdk.openadsdk.utils.jg;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly extends lh {
    private cf bly;

    /* renamed from: cf, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.le.lh f7749cf;

    /* renamed from: jg, reason: collision with root package name */
    private int f7750jg;
    private fkw ko;

    /* renamed from: le, reason: collision with root package name */
    public jg f7751le;
    private vt.AbstractC0066vt mwh;
    private final List<pno> pno;
    com.bytedance.sdk.openadsdk.component.reward.top.lh ra;
    private pno rn;
    private com.bytedance.sdk.openadsdk.core.le.pno ryl;
    private com.bytedance.sdk.openadsdk.core.le.lh tlj;
    private boolean vm;
    private int zih;

    public bly(Activity activity, vpp vppVar, vt vtVar) {
        super(activity, vppVar, vtVar);
        this.pno = new ArrayList();
        this.vm = false;
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(activity);
        this.tlj = lhVar;
        if (Build.VERSION.SDK_INT >= 35) {
            lhVar.setFitsSystemWindows(true);
        }
        activity.setContentView(this.tlj);
    }

    private int qbp() {
        pno pnoVar = this.rn;
        if (pnoVar != null) {
            return pnoVar.tlj;
        }
        return -1;
    }

    private void vt(pno pnoVar) {
        try {
            this.ryl.setText(this.ouw.getString(com.bytedance.sdk.component.utils.vpp.vt(zih.ouw(), "tt_multiple_ad_indicator"), Integer.valueOf(pnoVar.f7763cf + 1), Integer.valueOf(this.f7750jg)));
            this.ryl.setVisibility(0);
        } catch (Throwable th2) {
            qbp.ouw("SeqSwitchLayoutManager", "updateCurrentAdIndex: ", th2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void bly() {
        super.bly();
        pno pnoVar = this.rn;
        if (pnoVar != null) {
            pnoVar.zin();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final pno cf() {
        return this.rn;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final fkw jg() {
        fkw fkwVar = this.ko;
        if (fkwVar != null) {
            return fkwVar;
        }
        pno pnoVar = this.rn;
        int i4 = pnoVar != null ? pnoVar.tlj : -1;
        int size = this.pno.size() - 1;
        while (true) {
            if (size <= i4) {
                break;
            }
            pno pnoVar2 = this.pno.get(size);
            if (pnoVar2 instanceof fkw) {
                fkw fkwVar2 = (fkw) pnoVar2;
                if (fkwVar2.ouw) {
                    this.ko = fkwVar2;
                    break;
                }
            }
            size--;
        }
        return this.ko;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final List<vpp> ko() {
        return this.vt.vm.yu;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void le() {
        super.le();
        pno pnoVar = this.rn;
        if (pnoVar != null) {
            pnoVar.mwh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void lh() {
        super.lh();
        pno pnoVar = this.rn;
        if (pnoVar != null) {
            pnoVar.jg();
        }
        vt.AbstractC0066vt abstractC0066vt = this.mwh;
        if (abstractC0066vt != null) {
            abstractC0066vt.ouw(-1);
        }
        jg jgVar = this.f7751le;
        if (jgVar != null) {
            jgVar.vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final pno mwh() {
        pno pnoVar = this.rn;
        if (pnoVar == null) {
            return null;
        }
        int i4 = pnoVar.tlj;
        while (true) {
            i4++;
            if (i4 >= this.pno.size()) {
                return null;
            }
            pno pnoVar2 = this.pno.get(i4);
            if (pnoVar2 instanceof ouw) {
                return pnoVar2;
            }
            if ((pnoVar2 instanceof fkw) && od.lh(pnoVar2.f7765le) && pnoVar2.rn) {
                return pnoVar2;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw() {
        int i4;
        tc tcVar;
        super.ouw();
        com.bytedance.sdk.openadsdk.core.settings.cf.vt();
        boolean zTlj = com.bytedance.sdk.openadsdk.core.settings.cf.tlj(String.valueOf(this.vt.fqk()));
        int i10 = 0;
        if (this.yu.bly) {
            List<vpp> list = this.vt.vm.yu;
            if (!list.isEmpty()) {
                int size = list.size();
                this.f7750jg = size;
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    boolean z3 = i12 == size + (-1);
                    vpp vppVar = list.get(i12);
                    if (vppVar != null) {
                        vppVar.rn = this.fkw;
                    }
                    if (!od.vt(vppVar)) {
                        int i13 = i11;
                        if (!th.fkw(vppVar) && th.le(vppVar)) {
                            this.pno.add(ouw(this.yu, vppVar, i13, i12, z3));
                            i4 = i13 + 2;
                            this.pno.add(new fkw(this.yu, vppVar, i13 + 1, i12, false, z3, false));
                        } else {
                            i4 = i13 + 1;
                            this.pno.add(ouw(this.yu, vppVar, i13, i12, z3));
                        }
                    } else if (od.lh(vppVar)) {
                        i4 = i11 + 1;
                        this.pno.add(new fkw(this.yu, vppVar, i11, i12, true, z3, false));
                    } else {
                        int i14 = i11;
                        this.pno.add(ouw(this.yu, vppVar, i14, i12, z3));
                        i4 = i14 + 2;
                        this.pno.add(new fkw(this.yu, vppVar, i14 + 1, i12, true, z3, false));
                    }
                    i11 = i4;
                    if (zTlj) {
                        boolean z10 = (vppVar == null || th.ryl(vppVar) || vppVar.euf() || (tcVar = vppVar.ccd) == null || tcVar.ouw <= 0) ? false : true;
                        if (z3) {
                            if (this.yu.f7772cf && z10 && !od.vt(vppVar)) {
                                this.pno.add(new fkw(this.yu, vppVar, i11, i12, false, z3, false));
                                i11++;
                            }
                            if (!TextUtils.isEmpty(this.vt.yu())) {
                                fkw fkwVar = new fkw(this.yu, vppVar, i11, i12, false, z3, true);
                                this.ko = fkwVar;
                                this.pno.add(fkwVar);
                                i11++;
                            }
                        } else if (this.yu.ouw() && z10) {
                            this.pno.add(new fkw(this.yu, vppVar, i11, i12, false, z3, false));
                            i11++;
                        }
                    }
                    i12++;
                }
                i10 = i11;
            }
        }
        if (this.pno.isEmpty() && !od.lh(this.vt)) {
            this.pno.add(ouw(this.yu, this.vt, i10, i10 + 1, true));
        }
        if (jg() == null && this.yu.bly) {
            this.f7751le = com.bytedance.sdk.openadsdk.utils.bly.ouw(this.ouw, new bly.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.bly.1
                @Override // com.bytedance.sdk.openadsdk.utils.bly.ouw
                public final View ouw() {
                    com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = bly.this.ra;
                    if (lhVar != null) {
                        return lhVar.getCloseButton();
                    }
                    return null;
                }

                @Override // com.bytedance.sdk.openadsdk.utils.bly.ouw
                public final void vt() {
                    com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = bly.this.ra;
                    if (lhVar != null) {
                        lhVar.setSkipInvisiable();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final int pno() {
        vt.AbstractC0066vt abstractC0066vt = this.mwh;
        if (abstractC0066vt != null) {
            return abstractC0066vt.ouw();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ra() {
        super.ra();
        pno pnoVar = this.rn;
        if (pnoVar != null) {
            pnoVar.yu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final com.bytedance.sdk.openadsdk.component.reward.top.lh ryl() {
        return this.ra;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void th() {
        vt.AbstractC0066vt abstractC0066vt = this.mwh;
        if (abstractC0066vt != null) {
            ko.vt("TTAD.AdSceneManager", "onDialogShow: ");
            if (abstractC0066vt.f7789th) {
                abstractC0066vt.qbp = true;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final int tlj() {
        return this.zih;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vm() {
        vt.AbstractC0066vt abstractC0066vt = this.mwh;
        if (abstractC0066vt != null) {
            abstractC0066vt.le();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final boolean yu() {
        if (this.pno.isEmpty()) {
            return false;
        }
        List<pno> list = this.pno;
        pno pnoVar = list.get(list.size() - 1);
        return (pnoVar instanceof fkw) && ((fkw) pnoVar).ouw;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vt() {
        super.vt();
        pno pnoVar = this.rn;
        if (pnoVar != null) {
            pnoVar.lh();
        }
        vt.AbstractC0066vt abstractC0066vt = this.mwh;
        if (abstractC0066vt != null) {
            abstractC0066vt.vt(-1);
        }
        jg jgVar = this.f7751le;
        if (jgVar != null) {
            jgVar.ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vt(pno pnoVar, int i4) {
        vt.AbstractC0066vt abstractC0066vt = this.mwh;
        if (abstractC0066vt == null) {
            return;
        }
        if (i4 == 2) {
            abstractC0066vt.ouw(i4);
            jg jgVar = this.f7751le;
            if (jgVar != null) {
                jgVar.vt();
                return;
            }
            return;
        }
        if (i4 == 1) {
            abstractC0066vt.vt(i4);
            jg jgVar2 = this.f7751le;
            if (jgVar2 != null) {
                jgVar2.ouw();
                return;
            }
            return;
        }
        if (i4 == 3 || i4 == 4) {
            try {
                this.rn.ksc().ex.zih();
            } catch (Throwable th2) {
                qbp.yu("SeqSwitchLayoutManager", th2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vt(Activity activity) {
        super.vt(activity);
        pno pnoVar = this.rn;
        if (pnoVar != null) {
            pnoVar.ouw(activity);
        }
    }

    private static pno ouw(vt vtVar, vpp vppVar, int i4, int i10, boolean z3) {
        boolean zEy = vppVar.ey();
        AdSlot adSlot = vppVar.yiz;
        if (adSlot != null) {
            zEy = adSlot.getDurationSlotType() == 7;
        }
        if (zEy) {
            return new ra(vtVar, vppVar, i4, i10, z3);
        }
        return new le(vtVar, vppVar, i4, i10, z3);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(Bundle bundle) {
        super.ouw(bundle);
        this.f7749cf = new com.bytedance.sdk.openadsdk.core.le.lh(this.ouw);
        this.tlj.addView(this.f7749cf, new FrameLayout.LayoutParams(-1, -1));
        this.bly = new cf(this.ouw);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, osn.ouw(this.ouw, 2.0f));
        layoutParams.gravity = 80;
        this.tlj.addView(this.bly, layoutParams);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(this.ouw);
        this.ryl = pnoVar;
        pnoVar.setTextColor(-1);
        this.ryl.setTextSize(15.0f);
        this.ryl.setShadowLayer(1.0f, 0.0f, 1.0f, -16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = osn.ouw(this.ouw, 60.0f);
        layoutParams2.rightMargin = osn.ouw(this.ouw, 16.0f);
        layoutParams2.gravity = 8388661;
        this.tlj.addView(this.ryl, layoutParams2);
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = new com.bytedance.sdk.openadsdk.component.reward.top.lh(this.ouw);
        this.ra = lhVar;
        this.tlj.addView(lhVar, new FrameLayout.LayoutParams(-1, -2));
        this.ra.ouw(this.vt);
        this.ra.setShowDislike(true);
        ouw(null, null, new vt.fkw(1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0120  */
    @Override // com.bytedance.sdk.openadsdk.activity.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ouw(com.bytedance.sdk.openadsdk.activity.pno r13, com.bytedance.sdk.openadsdk.activity.pno r14, com.bytedance.sdk.openadsdk.activity.vt.fkw r15) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.bly.ouw(com.bytedance.sdk.openadsdk.activity.pno, com.bytedance.sdk.openadsdk.activity.pno, com.bytedance.sdk.openadsdk.activity.vt$fkw):void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(int i4, int i10) {
        super.ouw(i4, i10);
        if (i4 >= 0) {
            if (TextUtils.isEmpty(this.f7758lh)) {
                this.ryl.setText(this.ouw.getString(com.bytedance.sdk.component.utils.vpp.vt(zih.ouw(), "tt_multiple_playable_wait_tips"), Integer.valueOf(i4)));
            } else {
                this.ryl.setText(String.format(this.f7758lh, Integer.valueOf(i4)));
            }
            this.ryl.setVisibility(0);
            return;
        }
        this.ryl.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(Activity activity) {
        super.ouw(activity);
        pno pnoVar = this.rn;
        if (pnoVar != null) {
            pnoVar.vt(activity);
        }
        int iQbp = qbp();
        for (pno pnoVar2 : this.pno) {
            if (pnoVar2.tlj >= iQbp) {
                pnoVar2.qbp();
            }
        }
        vt.AbstractC0066vt abstractC0066vt = this.mwh;
        if (abstractC0066vt != null) {
            abstractC0066vt.lh();
        }
        jg jgVar = this.f7751le;
        if (jgVar != null) {
            jgVar.lh();
        }
        pno pnoVar3 = this.rn;
        if (pnoVar3 != null && !pnoVar3.jqy() && !this.vt.zn) {
            com.bytedance.sdk.openadsdk.core.jg.vt().post(new vt.lh(this.vt));
        }
        this.rn = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(float f10) {
        cf cfVar = this.bly;
        if (cfVar == null) {
            return;
        }
        cfVar.setProgress(f10);
        if (f10 == 0.0f && this.bly.getVisibility() == 0) {
            this.bly.setVisibility(4);
        } else {
            if (f10 <= 0.0f || this.bly.getVisibility() == 0) {
                return;
            }
            this.bly.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(int i4) {
        ko.vt("SeqSwitchLayoutManager", "changeCountDownStatus: status=".concat(String.valueOf(i4)));
        vt.AbstractC0066vt abstractC0066vt = this.mwh;
        if (abstractC0066vt != null) {
            if (i4 == 2) {
                abstractC0066vt.ouw(2);
            } else if (i4 == 1) {
                abstractC0066vt.vt(1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(pno pnoVar, vt.fkw fkwVar) {
        pno pnoVar2 = this.rn;
        if (pnoVar2 == null || pnoVar2 == pnoVar) {
            if (pnoVar2 != null && (pnoVar2 instanceof ouw)) {
                final long j = (pnoVar2.ksc() == null || this.rn.ksc().ex == null) ? 0L : this.rn.ksc().ex.pno;
                final int i4 = this.rn.f7763cf + 1;
                long jCurrentTimeMillis = System.currentTimeMillis();
                pno pnoVar3 = this.rn;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(jCurrentTimeMillis, pnoVar3.f7765le, pnoVar3.e_(), "dislike_skip", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.bly.2
                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject ouw() {
                        return com.bytedance.sdk.openadsdk.yu.lh.ouw(i4);
                    }

                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject vt() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("duration", j);
                        } catch (Throwable unused) {
                        }
                        return jSONObject;
                    }
                });
            }
            pno pnoVarMwh = mwh();
            if (pnoVarMwh == null) {
                pnoVarMwh = jg();
            }
            ouw(this.rn, pnoVarMwh, fkwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(pno pnoVar, boolean z3, boolean z10, boolean z11, int i4) {
        fkw fkwVarJg;
        pno pnoVar2 = this.rn;
        if ((pnoVar2 == null || pnoVar2 == pnoVar) && (fkwVarJg = jg()) != null) {
            vt.fkw fkwVar = new vt.fkw(i4, pnoVar != null ? pnoVar.ksc() : null);
            fkwVar.ouw.putBoolean("isSkip", z3);
            fkwVar.ouw.putBoolean("force", z10);
            fkwVar.ouw.putBoolean("isFromLandingPage", z11);
            ouw(this.rn, fkwVarJg, fkwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(ouw ouwVar, boolean z3) {
        vt.AbstractC0066vt abstractC0066vt;
        super.ouw(ouwVar, z3);
        if (ouwVar == null || ouwVar != this.rn || (abstractC0066vt = this.mwh) == null) {
            return;
        }
        if (z3) {
            abstractC0066vt.bly = (int) (1000.0f / abstractC0066vt.pno);
        } else {
            abstractC0066vt.bly = 1000;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(pno pnoVar) {
        vt.AbstractC0066vt abstractC0066vt;
        super.ouw(pnoVar);
        if (pnoVar == null) {
            return;
        }
        qbp.ouw("SeqSwitchLayoutManager", "onPlayableLoadingDismiss [scene=]" + pnoVar + ",isActive=" + pnoVar.ryl);
        if (pnoVar.ryl && (abstractC0066vt = this.mwh) != null) {
            abstractC0066vt.fkw();
        }
        pno pnoVarMwh = mwh();
        if (pnoVarMwh instanceof ouw) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVarKsc = pnoVarMwh.ksc();
            if (ouwVarKsc == null || !th.fkw(ouwVarKsc.vt)) {
                ((ouw) pnoVarMwh).vpp();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(pno pnoVar, boolean z3) {
        vt.AbstractC0066vt abstractC0066vt;
        super.ouw(pnoVar, z3);
        if (pnoVar == null) {
            return;
        }
        qbp.ouw("SeqSwitchLayoutManager", "setIsHappenInteraction [scene=]" + pnoVar + ",isActive=" + pnoVar.ryl + ",isHappenInteraction=" + z3);
        if (!pnoVar.ryl || (abstractC0066vt = this.mwh) == null) {
            return;
        }
        abstractC0066vt.ko = z3;
        abstractC0066vt.vm = 0;
        if (z3) {
            int i4 = abstractC0066vt.ryl;
            int i10 = abstractC0066vt.f7783cf;
            abstractC0066vt.tlj = i4 - i10;
            abstractC0066vt.f7784jg = i10;
            abstractC0066vt.mwh = i4;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(View view) {
        super.ouw(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.f7749cf.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(View view, boolean z3) {
        super.ouw(view, z3);
        if (view.getParent() == null && this.f7749cf != null) {
            view.setVisibility(4);
            int childCount = this.f7749cf.getChildCount();
            if (z3) {
                this.f7749cf.addView(view, 0);
            } else {
                this.f7749cf.addView(view, childCount - 1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final boolean ouw(pno pnoVar, int i4) {
        return i4 == this.pno.size() - 1 && this.pno.get(i4) != null && (this.pno.get(i4) instanceof fkw);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(boolean z3) {
        super.ouw(z3);
        pno pnoVar = this.rn;
        if (pnoVar != null) {
            pnoVar.vt(z3);
        }
    }
}
