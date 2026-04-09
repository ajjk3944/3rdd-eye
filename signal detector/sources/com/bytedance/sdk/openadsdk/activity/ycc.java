package com.bytedance.sdk.openadsdk.activity;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.gbl;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.core.sb;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.cf;

/* loaded from: classes.dex */
public class ycc extends emc {
    private boolean ylm;

    public ycc(ypw ypwVar, rie rieVar, int i, int i3, boolean z6) {
        super(ypwVar, rieVar, i, i3, z6);
    }

    private boolean emc(rie rieVar) {
        return rieVar == null || rieVar.kx() == 100.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void a_() {
        ypw ypwVar = this.uym;
        if (ypwVar != null && ypwVar.xq()) {
            super.a_();
            return;
        }
        final View viewRu = this.zz.mkp.ru();
        if (viewRu != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.ycc.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ycc.this.zz.xmt.ul() && ycc.this.zz.zz.get()) {
                        boolean zSz = ycc.this.zz.lt.sz();
                        ycc.this.zz.xmt.ycc(zSz);
                        ycc.this.zz.mkp.ycc(8);
                        ycc.this.zz.ra.sendEmptyMessageDelayed(600, 5000L);
                        if (!rie.xq(ycc.this.zz.ypw)) {
                            return;
                        }
                        if (rie.xq(ycc.this.zz.ypw) && zSz) {
                            return;
                        }
                    }
                    ycc.this.zz.xmt.ylm();
                    ycc.this.zz.lt.gbl();
                    ycc.this.zz.db.ycc();
                    ycc.this.yz();
                }
            };
            viewRu.setOnClickListener(onClickListener);
            viewRu.setTag(viewRu.getId(), onClickListener);
        }
        this.zz.cuf.emc(new com.bytedance.sdk.openadsdk.component.reward.top.ypw() { // from class: com.bytedance.sdk.openadsdk.activity.ycc.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void dg(View view) {
                ycc yccVar = ycc.this;
                yccVar.ypw(yccVar.zz);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void emc(View view) {
                com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
                if (ul.emc(ycc.this.zz.ypw) && !ycc.this.zz.sz.get()) {
                    ycc.this.yz();
                    return;
                }
                ycc.this.zz.ylm.xmt();
                cf.emc emcVar = new cf.emc();
                emcVar.ypw(ycc.this.zz.ylm.sup());
                emcVar.dg(ycc.this.zz.ylm.ee());
                emcVar.xq(ycc.this.zz.ylm.vk());
                emcVar.xq(3);
                emcVar.dg(ycc.this.zz.ylm.hxp());
                emcVar.emc(ycc.this.zz.ylm.ypw());
                com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(ycc.this.zz.ylm.msw(), emcVar, ycc.this.zz.ylm.bw());
                sb.xq(ycc.this.zz.ycc);
                ycc.this.zz.ylm.emc("skip", false);
                ycc.this.zz.cuf.dg(false);
                ycc yccVar = ycc.this;
                if (yccVar.zz.xq) {
                    yccVar.emc(true, 4);
                } else {
                    yccVar.yz();
                }
                rie rieVar = ycc.this.zz.ypw;
                if (rieVar != null && rieVar.eh() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = ycc.this.zz;
                    if (emcVar2.ylm != null && (dgVarEmc = emcVar2.ypw.eh().emc()) != null) {
                        dgVarEmc.ycc(ycc.this.zz.ylm.sup());
                        dgVarEmc.bw(ycc.this.zz.ylm.sup());
                    }
                }
                com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(ycc.this.zz.ypw, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void xq(View view) {
                View view2 = viewRu;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void ypw(View view) {
                ycc.this.e_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void emc(View view, String str) {
                ycc.this.emc(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public boolean b_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public boolean c_() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public String d_() {
        return "fullscreen_interstitial_ad";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.emc, com.bytedance.sdk.openadsdk.activity.msw
    public void dg() {
        super.dg();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        if (emcVar == null || !ypw(emcVar.ypw) || emc(this.zz.ypw)) {
            return;
        }
        if (this.ylm) {
            this.ylm = false;
            yz();
        } else if (this.zz.xmt.sb()) {
            yz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void e_() {
        this.zz.sf.emc(((emc) this).ypw);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public boolean f_() {
        return this.zz.yz;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw, com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void iyl() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw, com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void mkp() {
        if (this.zz.ypw.kx() != 100.0f) {
            this.ylm = true;
        }
        super.mkp();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void mxo() {
        super.mxo();
        this.bw = false;
        this.zz.hxp.ypw(false);
        this.zz.ylm.wo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.emc
    public FrameLayout uym() {
        gbl gblVar;
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar;
        if (this.ycc.ycc()) {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
            if (emcVar == null || (zzVar = emcVar.hxp) == null) {
                return null;
            }
            return zzVar.ypw();
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.zz;
        if (emcVar2 == null || (gblVar = emcVar2.mkp) == null) {
            return null;
        }
        return gblVar.ycc();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.emc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ypw() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.zz
            com.bytedance.sdk.openadsdk.core.model.rie r0 = r0.ypw
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.rie.bw(r0)
            r1 = 0
            if (r0 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.zz
            boolean r2 = r0.xq
            if (r2 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.emc.sup r0 = r0.cuf
            java.lang.String r2 = "X"
            r0.emc(r1, r2)
            goto L24
        L19:
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.emc.sup r0 = r0.cuf
            java.lang.String r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText()
            r0.emc(r1, r2)
        L24:
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.emc.sup r0 = r0.cuf
            r1 = 1
            r0.bw(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.ycc.ypw():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void emc(String str) {
        com.bytedance.sdk.openadsdk.core.model.dg dgVarEh;
        com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        emcVar.yz = !emcVar.yz;
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar = emcVar.hxp;
        if (zzVar != null && zzVar.emc() != null) {
            this.zz.hxp.emc().setSoundMute(this.zz.yz);
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.zz;
        emcVar2.ylm.emc(emcVar2.yz, str);
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar3 = this.zz;
        emcVar3.xmt.bw(emcVar3.yz);
        rie rieVar = this.zz.ypw;
        if (rieVar == null || (dgVarEh = rieVar.eh()) == null || (dgVarEmc = dgVarEh.emc()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar4 = this.zz;
        if (emcVar4.yz) {
            dgVarEmc.msw(emcVar4.ylm.sup());
        } else {
            dgVarEmc.zz(emcVar4.ylm.sup());
        }
    }

    private boolean ypw(rie rieVar) {
        if (rieVar == null) {
            return false;
        }
        return aa.dg().ul(String.valueOf(this.zz.ycc));
    }
}
