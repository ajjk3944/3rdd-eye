package com.bytedance.sdk.openadsdk.common;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sb;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.cf;

/* loaded from: classes.dex */
public class emc {

    /* renamed from: com.bytedance.sdk.openadsdk.common.emc$emc, reason: collision with other inner class name */
    public interface InterfaceC0050emc {
        void emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar, View view);
    }

    public interface ypw {
        void emc();

        void emc(boolean z6, int i);
    }

    private static com.bytedance.sdk.openadsdk.component.reward.top.ypw xq(final qh qhVar) {
        final com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVarEmc = qhVar.emc();
        final String strYpw = qhVar.ypw();
        final ypw ypwVarDg = qhVar.dg();
        final vk vkVarYcc = qhVar.ycc();
        final boolean zBw = qhVar.bw();
        return new com.bytedance.sdk.openadsdk.component.reward.top.ypw() { // from class: com.bytedance.sdk.openadsdk.common.emc.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void dg(View view) {
                if (qhVar.emc() == null || qhVar.uym() == null) {
                    return;
                }
                qhVar.uym().emc(qhVar.emc(), view);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void emc(View view) {
                if (emc.ypw(vkVarYcc, emcVarEmc, false, strYpw)) {
                    return;
                }
                if (zBw && emc.ypw(emcVarEmc, strYpw, ypwVarDg)) {
                    return;
                }
                emc.emc(emcVarEmc);
                emc.emc(emcVarEmc, ypwVarDg);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void xq(View view) {
                com.bytedance.sdk.openadsdk.component.reward.view.gbl gblVar;
                View viewRu;
                com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = emcVarEmc;
                if (emcVar == null || (gblVar = emcVar.mkp) == null || (viewRu = gblVar.ru()) == null) {
                    return;
                }
                viewRu.performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void ypw(View view) {
                com.bytedance.sdk.openadsdk.component.reward.emc.xq xqVar;
                com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar;
                com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = emcVarEmc;
                if (emcVar == null || (xqVar = emcVar.sf) == null || (ypwVar = emcVar.cn) == null) {
                    return;
                }
                xqVar.emc(ypwVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void emc(View view, String str) {
                com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = emcVarEmc;
                if (emcVar == null) {
                    return;
                }
                emc.emc(emcVar, emcVar.cn, str);
            }
        };
    }

    public static void ypw(qh qhVar) {
        emc(qhVar);
        qhVar.emc().cuf.emc(xq(qhVar));
    }

    public static void emc(final qh qhVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.gbl gblVar;
        final View viewRu;
        final com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVarEmc = qhVar.emc();
        if (emcVarEmc == null || (gblVar = emcVarEmc.mkp) == null || (viewRu = gblVar.ru()) == null) {
            return;
        }
        final String strYpw = qhVar.ypw();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.emc.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (emc.ypw(emcVarEmc, viewRu)) {
                    return;
                }
                emcVarEmc.xmt.ylm();
                emcVarEmc.lt.gbl();
                emcVarEmc.db.ycc();
                vk vkVarYcc = qhVar.ycc();
                if (vkVarYcc == null || !dr.dg(emcVarEmc.ypw)) {
                    qhVar.xq().run();
                    return;
                }
                boolean zYpw = emc.ypw(vkVarYcc, emcVarEmc, true, strYpw);
                if (!(emcVarEmc.pe instanceof com.bytedance.sdk.openadsdk.activity.bw) || zYpw) {
                    return;
                }
                qhVar.xq().run();
            }
        };
        viewRu.setOnClickListener(onClickListener);
        viewRu.setTag(viewRu.getId(), onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean ypw(vk vkVar, com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar, boolean z6, String str) {
        if (vkVar == null) {
            return false;
        }
        if (!vkVar.emc(dr.xq(emcVar.ypw), z6, null) && (emcVar.pe instanceof com.bytedance.sdk.openadsdk.activity.bw)) {
            return ((com.bytedance.sdk.openadsdk.activity.bw) emcVar.pe).msw();
        }
        return true;
    }

    private static void xq(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        rie rieVar;
        com.bytedance.sdk.openadsdk.core.model.dg dgVarEh;
        if (emcVar == null || (rieVar = emcVar.ypw) == null || (dgVarEh = rieVar.eh()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc = dgVarEh.emc();
        long jSup = emcVar.ylm.sup();
        if (emcVar.yz) {
            dgVarEmc.msw(jSup);
        } else {
            dgVarEmc.zz(jSup);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean ypw(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar, String str, ypw ypwVar) {
        if (emcVar.pe instanceof com.bytedance.sdk.openadsdk.activity.bw) {
            ypwVar.emc();
            return true;
        }
        boolean zMsw = dr.msw(emcVar.ypw);
        boolean zYcc = dr.ycc(emcVar.ypw);
        boolean zBw = dr.bw(emcVar.ypw);
        if (!zYcc && (!zBw || !emcVar.rie.dg(com.bytedance.sdk.openadsdk.component.reward.emc.msw.ypw))) {
            if (com.bytedance.sdk.openadsdk.core.model.ul.emc(emcVar.ypw) && !emcVar.sz.get()) {
                ypwVar.emc();
                return true;
            }
            emcVar.cuf.dg(false);
            return false;
        }
        if (zMsw) {
            emcVar.rie.zz();
        } else {
            View viewRu = emcVar.mkp.ru();
            if (viewRu != null) {
                viewRu.performClick();
            } else {
                ypwVar.emc();
            }
        }
        return true;
    }

    public static void emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        if (emcVar == null) {
            return;
        }
        cf.emc emcVar2 = new cf.emc();
        emcVar2.ypw(emcVar.ylm.sup());
        emcVar2.dg(emcVar.ylm.ee());
        emcVar2.xq(emcVar.ylm.vk());
        emcVar2.xq(3);
        emcVar2.dg(emcVar.ylm.hxp());
        emcVar2.emc(emcVar.ylm.ypw());
        com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(emcVar.ylm.msw(), emcVar2, emcVar.ylm.bw());
        sb.xq(emcVar.ycc);
        emcVar.ylm.emc("skip", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean ypw(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar, View view) {
        if (!emcVar.xmt.ul() || (!emcVar.wbn && !emcVar.zz.get())) {
            return false;
        }
        boolean zSz = emcVar.lt.sz();
        emcVar.xmt.ycc(zSz);
        emcVar.mkp.ycc(8);
        if (view instanceof com.bytedance.sdk.openadsdk.core.ycc.dg) {
            ((com.bytedance.sdk.openadsdk.core.ycc.dg) view).setImageResource(com.bytedance.sdk.component.utils.rie.dg(emcVar.vw, "tt_close_btn"));
        }
        emcVar.ra.sendEmptyMessageDelayed(600, 5000L);
        return !rie.xq(emcVar.ypw) || zSz;
    }

    public static void emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar, ypw ypwVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.xq xqVarEmc;
        if (emcVar.xq && (!com.bytedance.sdk.openadsdk.core.model.ul.xq(emcVar.ypw) || (xqVarEmc = emcVar.hxp.emc()) == null || xqVarEmc.dg != 0)) {
            ypwVar.emc(true, 4);
        } else {
            ypwVar.emc();
        }
        ypw(emcVar);
    }

    public static void emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar, com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar, String str) {
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar;
        if (emcVar == null || emcVar.cn == null) {
            return;
        }
        emcVar.yz = !emcVar.yz;
        boolean z6 = emcVar.pe instanceof com.bytedance.sdk.openadsdk.activity.bw;
        if (emcVar.wbn && !z6 && (zzVar = emcVar.hxp) != null && zzVar.emc() != null) {
            emcVar.hxp.emc().setSoundMute(emcVar.yz);
        }
        emcVar.ylm.emc(emcVar.yz, str);
        emcVar.xmt.bw(emcVar.yz);
        emcVar.rie.ypw(emcVar.yz);
        if (z6) {
            return;
        }
        xq(emcVar);
    }

    public static void ypw(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        com.bytedance.sdk.openadsdk.core.model.dg dgVarEh;
        com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
        if (emcVar == null) {
            return;
        }
        rie rieVar = emcVar.ypw;
        if (rieVar != null && (dgVarEh = rieVar.eh()) != null && (dgVarEmc = dgVarEh.emc()) != null) {
            long jSup = emcVar.ylm.sup();
            dgVarEmc.ycc(jSup);
            dgVarEmc.bw(jSup);
        }
        com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(emcVar.ypw, 5);
    }
}
