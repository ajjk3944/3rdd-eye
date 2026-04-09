package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.ypw;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.settings.gbl;
import com.bytedance.sdk.openadsdk.utils.qh;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.bytedance.sdk.openadsdk.utils.zz;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zz extends xq {
    private int aa;
    private bw cf;
    private com.bytedance.sdk.openadsdk.core.ycc.xq gbl;
    private com.bytedance.sdk.openadsdk.component.reward.top.xq msw;
    private int qh;
    private com.bytedance.sdk.openadsdk.core.ycc.xq ru;
    private boolean sba;
    private com.bytedance.sdk.openadsdk.core.ycc.msw sup;
    private ypw.AbstractC0048ypw sz;
    private final List<msw> uym;
    private msw vk;
    public qh ycc;
    private com.bytedance.sdk.openadsdk.cf.emc zz;

    public zz(Activity activity, rie rieVar, ypw ypwVar) {
        super(activity, rieVar, ypwVar);
        this.uym = new ArrayList();
        this.sba = false;
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = new com.bytedance.sdk.openadsdk.core.ycc.xq(activity);
        this.ru = xqVar;
        if (Build.VERSION.SDK_INT >= 35) {
            xqVar.setFitsSystemWindows(true);
        }
        activity.setContentView(this.ru);
    }

    private void dg(msw mswVar) {
        com.bytedance.sdk.openadsdk.cf.emc emcVar = this.zz;
        if (emcVar != null) {
            vw.uym(emcVar);
            this.zz = null;
        }
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar = this.msw;
        if (xqVar != null) {
            vw.uym(xqVar);
            vw.uym(this.msw.getITopLayout());
            this.msw = null;
        }
        ypw.AbstractC0048ypw abstractC0048ypw = this.sz;
        if (abstractC0048ypw != null) {
            abstractC0048ypw.xq();
        }
        if (mswVar instanceof uym) {
            ((uym) mswVar).rqm();
        }
        qh qhVar = this.ycc;
        if (qhVar != null) {
            qhVar.xq();
        }
    }

    private void sra() {
        this.ycc = com.bytedance.sdk.openadsdk.utils.zz.emc(this.emc, new zz.emc() { // from class: com.bytedance.sdk.openadsdk.activity.zz.1
            @Override // com.bytedance.sdk.openadsdk.utils.zz.emc
            public View emc() {
                if (zz.this.msw != null) {
                    return zz.this.msw.getCloseButton();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.utils.zz.emc
            public void ypw() {
                if (zz.this.msw != null) {
                    zz.this.msw.setSkipInvisiable();
                }
            }
        });
    }

    private void xq(msw mswVar) {
        try {
            this.sup.setText(this.emc.getString(com.bytedance.sdk.component.utils.rie.ypw(aa.emc(), "tt_multiple_ad_indicator"), Integer.valueOf(mswVar.gbl + 1), Integer.valueOf(this.qh)));
            this.sup.setVisibility(0);
        } catch (Throwable th) {
            ul.emc("SeqSwitchLayoutManager", "updateCurrentAdIndex: ", th);
        }
    }

    private void ylm() {
        boolean zQh = gbl.xq().qh(String.valueOf(this.ypw.tx()));
        int iYpw = this.dg.ycc() ? ypw(0, zQh) : 0;
        if (this.uym.isEmpty() && !dr.xq(this.ypw)) {
            int i = iYpw + 1;
            this.uym.add(emc(this.dg, this.ypw, iYpw, i, true));
            iYpw = i;
        }
        emc(iYpw, zQh);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x011e A[PHI: r11
  0x011e: PHI (r11v3 int) = (r11v2 int), (r11v4 int), (r11v2 int), (r11v2 int) binds: [B:28:0x00b7, B:42:0x0108, B:32:0x00c7, B:33:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int ypw(int r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.zz.ypw(int, boolean):int");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public List<rie> cf() {
        return this.ypw.ji();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public msw gbl() {
        return this.vk;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public int msw() {
        ypw.AbstractC0048ypw abstractC0048ypw = this.sz;
        if (abstractC0048ypw != null) {
            return abstractC0048ypw.emc();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public bw qh() {
        bw bwVar = this.cf;
        if (bwVar != null) {
            return bwVar;
        }
        msw mswVar = this.vk;
        int i = mswVar != null ? mswVar.ru : -1;
        int size = this.uym.size() - 1;
        while (true) {
            if (size <= i) {
                break;
            }
            msw mswVar2 = this.uym.get(size);
            if (mswVar2 instanceof bw) {
                bw bwVar2 = (bw) mswVar2;
                if (bwVar2.emc) {
                    this.cf = bwVar2;
                    break;
                }
            }
            size--;
        }
        return this.cf;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public int ru() {
        return this.aa;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void sba() {
        ypw.AbstractC0048ypw abstractC0048ypw = this.sz;
        if (abstractC0048ypw != null) {
            abstractC0048ypw.msw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public com.bytedance.sdk.openadsdk.component.reward.top.xq sup() {
        return this.msw;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public msw sz() {
        msw mswVar = this.vk;
        if (mswVar == null) {
            return null;
        }
        int i = mswVar.ru;
        while (true) {
            i++;
            if (i >= this.uym.size()) {
                return null;
            }
            msw mswVar2 = this.uym.get(i);
            if (mswVar2 instanceof emc) {
                return mswVar2;
            }
            if ((mswVar2 instanceof bw) && dr.xq(mswVar2.ycc) && mswVar2.vk) {
                return mswVar2;
            }
        }
    }

    public int ul() {
        msw mswVar = this.vk;
        if (mswVar != null) {
            return mswVar.ru;
        }
        return -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void uym() {
        super.uym();
        msw mswVar = this.vk;
        if (mswVar != null) {
            mswVar.dg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void ycc() {
        super.ycc();
        msw mswVar = this.vk;
        if (mswVar != null) {
            mswVar.sz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void yzg() {
        ypw.AbstractC0048ypw abstractC0048ypw = this.sz;
        if (abstractC0048ypw != null) {
            abstractC0048ypw.zz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void zz() {
        super.zz();
        msw mswVar = this.vk;
        if (mswVar != null) {
            mswVar.ul();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc() {
        super.emc();
        ylm();
    }

    private static msw emc(ypw ypwVar, rie rieVar, int i, int i3, boolean z6) {
        boolean zZc = rieVar.zc();
        AdSlot adSlotVaf = rieVar.vaf();
        if (adSlotVaf != null) {
            zZc = adSlotVaf.getDurationSlotType() == 7;
        }
        if (zZc) {
            return new uym(ypwVar, rieVar, i, i3, z6);
        }
        return new ycc(ypwVar, rieVar, i, i3, z6);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void xq() {
        super.xq();
        msw mswVar = this.vk;
        if (mswVar != null) {
            mswVar.qh();
        }
        ypw.AbstractC0048ypw abstractC0048ypw = this.sz;
        if (abstractC0048ypw != null) {
            abstractC0048ypw.emc(-1);
        }
        qh qhVar = this.ycc;
        if (qhVar != null) {
            qhVar.ypw();
        }
    }

    private void emc(int i, boolean z6) {
        if (qh() == null && this.dg.ycc()) {
            sra();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(Bundle bundle) {
        super.emc(bundle);
        this.gbl = new com.bytedance.sdk.openadsdk.core.ycc.xq(this.emc);
        this.ru.addView(this.gbl, new FrameLayout.LayoutParams(-1, -1));
        this.zz = new com.bytedance.sdk.openadsdk.cf.emc(this.emc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, vw.ypw(this.emc, 2.0f));
        layoutParams.gravity = 80;
        this.ru.addView(this.zz, layoutParams);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(this.emc);
        this.sup = mswVar;
        mswVar.setTextColor(-1);
        this.sup.setTextSize(15.0f);
        this.sup.setShadowLayer(1.0f, 0.0f, 1.0f, -16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = vw.ypw(this.emc, 60.0f);
        layoutParams2.rightMargin = vw.ypw(this.emc, 16.0f);
        layoutParams2.gravity = 8388661;
        this.ru.addView(this.sup, layoutParams2);
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar = new com.bytedance.sdk.openadsdk.component.reward.top.xq(this.emc);
        this.msw = xqVar;
        this.ru.addView(xqVar, new FrameLayout.LayoutParams(-1, -2));
        this.msw.emc(this.ypw);
        this.msw.setShowDislike(true);
        emc(null, null, new ypw.bw(1, null));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public boolean dg() {
        if (this.uym.isEmpty()) {
            return false;
        }
        List<msw> list = this.uym;
        msw mswVar = list.get(list.size() - 1);
        return (mswVar instanceof bw) && ((bw) mswVar).emc;
    }

    private void ypw(msw mswVar, msw mswVar2, ypw.bw bwVar) {
        rie rieVar;
        if (this.sz == null) {
            if (mswVar2 != null && mswVar2.c_()) {
                this.sz = new ypw.dg(this.dg, this.ypw, this.msw);
            } else {
                this.sz = new ypw.emc(this.dg, this.ypw, this.msw);
            }
        }
        this.sz.ypw();
        int iYpw = ypw(mswVar2);
        boolean z6 = mswVar2 instanceof bw;
        if (z6 && !((bw) mswVar2).emc && !mswVar2.vk && (rieVar = mswVar2.ycc) != null && rieVar.tmx()) {
            this.sz.dg();
        } else {
            this.sz.emc(iYpw, mswVar2.ycc);
            boolean z7 = mswVar2 instanceof bw;
            if (z7 && ((bw) mswVar2).emc) {
                dg(mswVar);
            } else if (mswVar2.ycc.vcl()) {
                boolean z8 = false;
                boolean z9 = (mswVar2 instanceof emc) && com.bytedance.sdk.openadsdk.core.model.ul.bw(mswVar2.ycc);
                if (z7 && (mswVar2.vk || com.bytedance.sdk.openadsdk.core.model.ul.ycc(mswVar2.ycc))) {
                    z8 = true;
                }
                if (z9 || z8) {
                    this.sz.emc(mswVar2);
                }
            } else if (mswVar2.vk) {
                this.sz.emc(mswVar2.ycc, mswVar2.aa);
            } else if (z7) {
                this.sz.xq(mswVar2.ycc.ivb().dg());
            }
        }
        qh qhVar = this.ycc;
        if (qhVar != null && mswVar == null) {
            qhVar.emc(iYpw * TTAdConstant.STYLE_SIZE_RADIO_1_1);
        }
        if (mswVar2 instanceof emc) {
            this.aa++;
            emc(0.0f);
            if (com.bytedance.sdk.openadsdk.core.model.ul.bw(mswVar2.ycc)) {
                this.sup.setVisibility(8);
                return;
            } else {
                xq(mswVar2);
                return;
            }
        }
        if (z6) {
            if (((bw) mswVar2).emc) {
                this.sup.setVisibility(8);
                return;
            }
            if (mswVar2.vk && dr.xq(mswVar2.ycc)) {
                this.aa++;
            }
            if (!mswVar2.vk && !com.bytedance.sdk.openadsdk.core.model.ul.ycc(mswVar2.ycc)) {
                xq(mswVar2);
            } else {
                this.sup.setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(msw mswVar, msw mswVar2, ypw.bw bwVar) {
        msw mswVar3 = this.vk;
        if ((mswVar3 == null || mswVar3 == mswVar) && !com.bytedance.sdk.component.utils.ypw.emc(this.emc)) {
            ul();
            if (mswVar2 == null) {
                msw mswVar4 = this.vk;
                int i = mswVar4 != null ? mswVar4.ru + 1 : 0;
                if (i < this.uym.size()) {
                    mswVar2 = this.uym.get(i);
                }
                if (mswVar2 == null) {
                    this.dg.uym();
                    return;
                }
            }
            msw mswVar5 = this.vk;
            if (mswVar5 != null) {
                if (mswVar5 == mswVar2) {
                    return;
                }
                mswVar5.qh();
                this.vk.dg();
                com.bytedance.sdk.openadsdk.component.reward.view.msw mswVarEmc = this.vk.emc();
                if (mswVarEmc != null) {
                    this.gbl.removeView(mswVarEmc);
                }
                this.vk.yzg();
                this.vk.sup = false;
                if (this.dg.bw()) {
                    msw mswVar6 = this.vk;
                    if (mswVar6 instanceof emc) {
                        int i3 = mswVar6.ru + 1;
                        msw mswVar7 = i3 < this.uym.size() ? this.uym.get(i3) : null;
                        if ((mswVar7 instanceof bw) && mswVar7 != mswVar2) {
                            com.bytedance.sdk.openadsdk.component.reward.view.msw mswVarEmc2 = mswVar7.emc();
                            if (mswVarEmc2 != null && mswVarEmc2.getParent() != null && (mswVarEmc2.getParent() instanceof ViewGroup)) {
                                ((ViewGroup) mswVarEmc2.getParent()).removeView(mswVarEmc2);
                            }
                            mswVar7.yzg();
                        }
                    }
                }
            }
            if (com.bytedance.sdk.component.utils.ypw.emc(this.emc)) {
                return;
            }
            mswVar2.sup = true;
            msw mswVar8 = this.vk;
            this.vk = mswVar2;
            ypw(mswVar8, mswVar2, bwVar);
            mswVar2.ypw(this.emc, bwVar);
            com.bytedance.sdk.openadsdk.component.reward.view.msw mswVarEmc3 = mswVar2.emc();
            if (mswVarEmc3 != null) {
                ViewParent parent = mswVarEmc3.getParent();
                if (parent != null) {
                    if (parent == this.gbl) {
                        mswVarEmc3.setVisibility(0);
                    } else if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(mswVarEmc3);
                    }
                }
                if (mswVarEmc3.getParent() == null) {
                    this.gbl.addView(mswVarEmc3, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            for (int i6 = mswVar8 != null ? mswVar8.ru : 0; i6 < this.uym.size(); i6++) {
                this.uym.get(i6).emc(mswVar8, this.vk, bwVar);
            }
            this.dg.ypw(this.vk);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int ypw(com.bytedance.sdk.openadsdk.activity.msw r8) {
        /*
            r7 = this;
            int r8 = r8.ru
            r0 = 0
        L3:
            java.util.List<com.bytedance.sdk.openadsdk.activity.msw> r1 = r7.uym
            int r1 = r1.size()
            if (r8 >= r1) goto L9a
            java.util.List<com.bytedance.sdk.openadsdk.activity.msw> r1 = r7.uym
            java.lang.Object r1 = r1.get(r8)
            com.bytedance.sdk.openadsdk.activity.msw r1 = (com.bytedance.sdk.openadsdk.activity.msw) r1
            boolean r2 = r1 instanceof com.bytedance.sdk.openadsdk.activity.bw
            if (r2 == 0) goto L1e
            r2 = r1
            com.bytedance.sdk.openadsdk.activity.bw r2 = (com.bytedance.sdk.openadsdk.activity.bw) r2
            boolean r2 = r2.emc
            if (r2 != 0) goto L9a
        L1e:
            boolean r2 = r1.vk
            com.bytedance.sdk.openadsdk.core.model.rie r3 = r1.ycc
            boolean r3 = com.bytedance.sdk.openadsdk.core.model.ul.ycc(r3)
            com.bytedance.sdk.openadsdk.core.model.rie r4 = r1.ycc
            boolean r4 = com.bytedance.sdk.openadsdk.core.model.ul.bw(r4)
            com.bytedance.sdk.openadsdk.core.model.rie r5 = r1.ycc
            com.bytedance.sdk.openadsdk.core.model.hxp r5 = r5.emc()
            if (r5 == 0) goto L39
            int r5 = r5.xq()
            goto L3b
        L39:
            r5 = 10
        L3b:
            boolean r6 = r1 instanceof com.bytedance.sdk.openadsdk.activity.emc
            if (r6 == 0) goto L57
            if (r4 == 0) goto L43
        L41:
            int r0 = r0 + r5
            goto L96
        L43:
            com.bytedance.sdk.openadsdk.core.model.rie r1 = r1.ycc
            com.bykv.vk.openvk.emc.emc.emc.xq.c r1 = r1.iat()
            if (r1 == 0) goto L51
            double r2 = (double) r0
            double r0 = r1.f6583d
            double r2 = r2 + r0
            int r0 = (int) r2
            goto L96
        L51:
            long r0 = (long) r0
            r2 = 10
            long r0 = r0 + r2
            int r0 = (int) r0
            goto L96
        L57:
            boolean r4 = r1 instanceof com.bytedance.sdk.openadsdk.activity.bw
            if (r4 == 0) goto L96
            if (r3 == 0) goto L5e
            goto L41
        L5e:
            if (r2 == 0) goto L79
            com.bytedance.sdk.openadsdk.core.model.rie r2 = r1.ycc
            boolean r2 = r2.vcl()
            if (r2 == 0) goto L69
            goto L41
        L69:
            com.bytedance.sdk.openadsdk.core.model.rie r2 = r1.ycc
            int r2 = com.bytedance.sdk.openadsdk.core.model.dr.ylm(r2)
            com.bytedance.sdk.openadsdk.core.model.rie r1 = r1.ycc
            int r1 = com.bytedance.sdk.openadsdk.core.model.dr.ee(r1)
            int r1 = r1 + r2
        L76:
            int r1 = r1 + r0
            r0 = r1
            goto L96
        L79:
            com.bytedance.sdk.openadsdk.activity.ypw r2 = r7.dg
            boolean r2 = r2.bw()
            if (r2 == 0) goto L96
            com.bytedance.sdk.openadsdk.core.model.rie r2 = r1.ycc
            if (r2 == 0) goto L96
            boolean r2 = r2.tmx()
            if (r2 != 0) goto L96
            com.bytedance.sdk.openadsdk.core.model.rie r1 = r1.ycc
            com.bytedance.sdk.openadsdk.core.model.db r1 = r1.ivb()
            int r1 = r1.dg()
            goto L76
        L96:
            int r8 = r8 + 1
            goto L3
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.zz.ypw(com.bytedance.sdk.openadsdk.activity.msw):int");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(int i, int i3) {
        super.emc(i, i3);
        if (i >= 0) {
            if (TextUtils.isEmpty(this.xq)) {
                this.sup.setText(this.emc.getString(com.bytedance.sdk.component.utils.rie.ypw(aa.emc(), "tt_multiple_playable_wait_tips"), Integer.valueOf(i)));
            } else {
                this.sup.setText(String.format(this.xq, Integer.valueOf(i)));
            }
            this.sup.setVisibility(0);
            return;
        }
        this.sup.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void ypw() {
        super.ypw();
        msw mswVar = this.vk;
        if (mswVar != null) {
            mswVar.xq();
        }
        ypw.AbstractC0048ypw abstractC0048ypw = this.sz;
        if (abstractC0048ypw != null) {
            abstractC0048ypw.ypw(-1);
        }
        qh qhVar = this.ycc;
        if (qhVar != null) {
            qhVar.emc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(Activity activity) {
        super.emc(activity);
        msw mswVar = this.vk;
        if (mswVar != null) {
            mswVar.ypw(activity);
        }
        int iUl = ul();
        for (msw mswVar2 : this.uym) {
            if (mswVar2.ru >= iUl) {
                mswVar2.yzg();
            }
        }
        ypw.AbstractC0048ypw abstractC0048ypw = this.sz;
        if (abstractC0048ypw != null) {
            abstractC0048ypw.xq();
        }
        qh qhVar = this.ycc;
        if (qhVar != null) {
            qhVar.xq();
        }
        msw mswVar3 = this.vk;
        if (mswVar3 != null && !mswVar3.sra() && !this.ypw.wh()) {
            com.bytedance.sdk.openadsdk.core.qh.ypw().post(new ypw.xq(this.ypw));
        }
        this.vk = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void ypw(msw mswVar, int i) {
        ypw.AbstractC0048ypw abstractC0048ypw = this.sz;
        if (abstractC0048ypw == null) {
            return;
        }
        if (i == 2) {
            abstractC0048ypw.emc(i);
            qh qhVar = this.ycc;
            if (qhVar != null) {
                qhVar.ypw();
                return;
            }
            return;
        }
        if (i == 1) {
            abstractC0048ypw.ypw(i);
            qh qhVar2 = this.ycc;
            if (qhVar2 != null) {
                qhVar2.emc();
                return;
            }
            return;
        }
        if (i == 3 || i == 4) {
            try {
                this.vk.ee().ylm.xmt();
            } catch (Throwable th) {
                ul.xq("SeqSwitchLayoutManager", th);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void ypw(Activity activity) {
        super.ypw(activity);
        msw mswVar = this.vk;
        if (mswVar != null) {
            mswVar.emc(activity);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(float f2) {
        com.bytedance.sdk.openadsdk.cf.emc emcVar = this.zz;
        if (emcVar == null) {
            return;
        }
        emcVar.setProgress(f2);
        if (f2 == 0.0f && this.zz.getVisibility() == 0) {
            this.zz.setVisibility(4);
        } else {
            if (f2 <= 0.0f || this.zz.getVisibility() == 0) {
                return;
            }
            this.zz.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(int i) {
        ypw.AbstractC0048ypw abstractC0048ypw = this.sz;
        if (abstractC0048ypw != null) {
            if (i == 2) {
                abstractC0048ypw.emc(2);
            } else if (i == 1) {
                abstractC0048ypw.ypw(1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(msw mswVar, ypw.bw bwVar) {
        msw mswVar2 = this.vk;
        if (mswVar2 == null || mswVar2 == mswVar) {
            if (mswVar2 != null && (mswVar2 instanceof emc)) {
                final long jSz = (mswVar2.ee() == null || this.vk.ee().ylm == null) ? 0L : this.vk.ee().ylm.sz();
                final int i = this.vk.gbl + 1;
                long jCurrentTimeMillis = System.currentTimeMillis();
                msw mswVar3 = this.vk;
                com.bytedance.sdk.openadsdk.dg.xq.emc(jCurrentTimeMillis, mswVar3.ycc, mswVar3.d_(), "dislike_skip", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.activity.zz.2
                    @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                    public JSONObject emc() {
                        return com.bytedance.sdk.openadsdk.dg.xq.emc(i);
                    }

                    @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                    public JSONObject ypw() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("duration", jSz);
                        } catch (Throwable unused) {
                        }
                        return jSONObject;
                    }
                });
            }
            msw mswVarSz = sz();
            if (mswVarSz == null) {
                mswVarSz = qh();
            }
            emc(this.vk, mswVarSz, bwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(msw mswVar, boolean z6, boolean z7, boolean z8, int i) {
        bw bwVarQh;
        msw mswVar2 = this.vk;
        if ((mswVar2 == null || mswVar2 == mswVar) && (bwVarQh = qh()) != null) {
            ypw.bw bwVar = new ypw.bw(i, mswVar != null ? mswVar.ee() : null);
            bwVar.emc.putBoolean("isSkip", z6);
            bwVar.emc.putBoolean("force", z7);
            bwVar.emc.putBoolean("isFromLandingPage", z8);
            emc(this.vk, bwVarQh, bwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(emc emcVar, boolean z6) {
        ypw.AbstractC0048ypw abstractC0048ypw;
        super.emc(emcVar, z6);
        if (emcVar == null || emcVar != this.vk || (abstractC0048ypw = this.sz) == null) {
            return;
        }
        abstractC0048ypw.ypw(z6);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(msw mswVar) {
        ypw.AbstractC0048ypw abstractC0048ypw;
        super.emc(mswVar);
        if (mswVar == null) {
            return;
        }
        mswVar.toString();
        if (mswVar.sup && (abstractC0048ypw = this.sz) != null) {
            abstractC0048ypw.ycc();
        }
        msw mswVarSz = sz();
        if (mswVarSz instanceof emc) {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVarEe = mswVarSz.ee();
            if (emcVarEe == null || !com.bytedance.sdk.openadsdk.core.model.ul.bw(emcVarEe.ypw)) {
                ((emc) mswVarSz).ylm();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(msw mswVar, boolean z6) {
        ypw.AbstractC0048ypw abstractC0048ypw;
        super.emc(mswVar, z6);
        if (mswVar == null) {
            return;
        }
        mswVar.toString();
        if (!mswVar.sup || (abstractC0048ypw = this.sz) == null) {
            return;
        }
        abstractC0048ypw.emc(z6);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(View view) {
        super.emc(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.gbl.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(View view, boolean z6) {
        super.emc(view, z6);
        if (view.getParent() == null && this.gbl != null) {
            view.setVisibility(4);
            int childCount = this.gbl.getChildCount();
            if (z6) {
                this.gbl.addView(view, 0);
            } else {
                this.gbl.addView(view, childCount - 1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public boolean emc(msw mswVar, int i) {
        return i == this.uym.size() - 1 && this.uym.get(i) != null && (this.uym.get(i) instanceof bw);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(boolean z6) {
        super.emc(z6);
        msw mswVar = this.vk;
        if (mswVar != null) {
            mswVar.xq(z6);
        }
    }
}
