package com.bytedance.sdk.component.ycc.emc.emc;

import com.bytedance.sdk.component.ycc.emc.emc.ypw.uym;
import com.bytedance.sdk.component.ycc.emc.msw;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public class ycc implements dg {
    private uym bw;
    private com.bytedance.sdk.component.ycc.emc.emc.ypw.ypw dg;
    bw emc = msw.uym().dg();
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc gbl;
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc msw;
    private Queue<String> qh;
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc ru;
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc sup;
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc sz;
    private com.bytedance.sdk.component.ycc.emc.emc.ypw.ycc uym;
    private com.bytedance.sdk.component.ycc.emc.emc.ypw.emc xq;
    private com.bytedance.sdk.component.ycc.emc.emc.ypw.xq ycc;
    private com.bytedance.sdk.component.ycc.emc.emc.ypw.bw ypw;
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc zz;

    public ycc(Queue<String> queue) {
        this.qh = queue;
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.emc()) {
            com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVarSup = msw.uym().sup();
            this.msw = emcVarSup;
            this.ypw = new com.bytedance.sdk.component.ycc.emc.emc.ypw.bw(emcVarSup, queue);
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.bw()) {
            if (msw.uym().ru() != null) {
                this.ru = msw.uym().ru();
            } else {
                this.ru = msw.uym().sz();
            }
            this.dg = new com.bytedance.sdk.component.ycc.emc.emc.ypw.ypw(this.ru, queue);
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.ypw()) {
            com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVarSz = msw.uym().sz();
            this.zz = emcVarSz;
            this.xq = new com.bytedance.sdk.component.ycc.emc.emc.ypw.emc(emcVarSz, queue);
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.xq()) {
            com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVarSz2 = msw.uym().sz();
            this.gbl = emcVarSz2;
            this.bw = new uym(emcVarSz2, queue);
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.dg()) {
            com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVarQh = msw.uym().qh();
            this.sup = emcVarQh;
            this.ycc = new com.bytedance.sdk.component.ycc.emc.emc.ypw.xq(emcVarQh, queue);
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.ycc()) {
            com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVarCf = msw.uym().cf();
            this.sz = emcVarCf;
            this.uym = new com.bytedance.sdk.component.ycc.emc.emc.ypw.ycc(emcVarCf, queue);
        }
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.dg
    public void emc(int i10, long j10) {
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.dg
    public void emc(com.bytedance.sdk.component.ycc.emc.dg.emc emcVar, int i10) {
        try {
            byte bDg = emcVar.dg();
            byte bBw = emcVar.bw();
            if (bDg == 0 && bBw == 1 && com.bytedance.sdk.component.ycc.emc.ypw.emc.emc()) {
                this.ypw.emc(emcVar);
                return;
            }
            if (bDg == 3 && bBw == 2 && com.bytedance.sdk.component.ycc.emc.ypw.emc.bw()) {
                this.dg.emc(emcVar);
                return;
            }
            if (bDg == 0 && bBw == 2 && com.bytedance.sdk.component.ycc.emc.ypw.emc.ypw()) {
                this.xq.emc(emcVar);
                return;
            }
            if (bDg == 1 && bBw == 2 && com.bytedance.sdk.component.ycc.emc.ypw.emc.xq()) {
                this.bw.emc(emcVar);
                return;
            }
            if (bDg == 1 && bBw == 3 && com.bytedance.sdk.component.ycc.emc.ypw.emc.dg()) {
                this.ycc.emc(emcVar);
            } else if (bDg == 2 && bBw == 3 && com.bytedance.sdk.component.ycc.emc.ypw.emc.ycc()) {
                this.uym.emc(emcVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.dg
    public void emc(int i10, List<com.bytedance.sdk.component.ycc.emc.dg.emc> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.ycc.emc.dg.emc emcVar = list.get(0);
        byte bBw = emcVar.bw();
        byte bDg = emcVar.dg();
        if (bDg == 0 && bBw == 1 && com.bytedance.sdk.component.ycc.emc.ypw.emc.emc()) {
            this.ypw.emc(i10, list);
            return;
        }
        if (bDg == 3 && bBw == 2 && com.bytedance.sdk.component.ycc.emc.ypw.emc.bw()) {
            this.dg.emc(i10, list);
            return;
        }
        if (bDg == 0 && bBw == 2 && com.bytedance.sdk.component.ycc.emc.ypw.emc.ypw()) {
            this.xq.emc(i10, list);
            return;
        }
        if (bDg == 1 && bBw == 2 && com.bytedance.sdk.component.ycc.emc.ypw.emc.xq()) {
            this.bw.emc(i10, list);
            return;
        }
        if (bDg == 1 && bBw == 3 && com.bytedance.sdk.component.ycc.emc.ypw.emc.dg()) {
            this.ycc.emc(i10, list);
        } else if (bDg == 2 && bBw == 3 && com.bytedance.sdk.component.ycc.emc.ypw.emc.ycc()) {
            this.uym.emc(i10, list);
        }
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.dg
    public List<com.bytedance.sdk.component.ycc.emc.dg.emc> emc(int i10, int i11, List<String> list) {
        List<com.bytedance.sdk.component.ycc.emc.dg.emc> listEmc;
        List<com.bytedance.sdk.component.ycc.emc.dg.emc> listEmc2;
        List<com.bytedance.sdk.component.ycc.emc.dg.emc> listEmc3;
        List<com.bytedance.sdk.component.ycc.emc.dg.emc> listEmc4;
        List<com.bytedance.sdk.component.ycc.emc.dg.emc> listEmc5;
        List<com.bytedance.sdk.component.ycc.emc.dg.emc> listEmc6;
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.emc() && this.ypw.ypw(i10, i11) && (listEmc6 = this.ypw.emc(i10, i11)) != null && listEmc6.size() != 0) {
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.sba(), 1);
            return listEmc6;
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.bw() && this.dg.ypw(i10, i11) && (listEmc5 = this.dg.emc(i10, i11)) != null && listEmc5.size() != 0) {
            return listEmc5;
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.ypw() && this.xq.ypw(i10, i11) && (listEmc4 = this.xq.emc(i10, i11)) != null && listEmc4.size() != 0) {
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.yzg(), 1);
            return listEmc4;
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.xq() && this.bw.ypw(i10, i11) && (listEmc3 = this.bw.emc(i10, i11)) != null && listEmc3.size() != 0) {
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.ul(), 1);
            return listEmc3;
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.dg() && this.ycc.ypw(i10, i11) && (listEmc2 = this.ycc.emc(i10, i11)) != null && listEmc2.size() != 0) {
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.ylm(), 1);
            return listEmc2;
        }
        if (!com.bytedance.sdk.component.ycc.emc.ypw.emc.ycc() || !this.uym.ypw(i10, i11) || (listEmc = this.uym.emc(i10, i11)) == null || listEmc.size() == 0) {
            return null;
        }
        return listEmc;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.dg
    public boolean emc(int i10, boolean z10) {
        com.bytedance.sdk.component.ycc.emc.emc.ypw.ycc yccVar;
        com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar;
        com.bytedance.sdk.component.ycc.emc.emc.ypw.xq xqVar;
        com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar2;
        uym uymVar;
        com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar3;
        com.bytedance.sdk.component.ycc.emc.emc.ypw.emc emcVar4;
        com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar5;
        com.bytedance.sdk.component.ycc.emc.emc.ypw.ypw ypwVar;
        com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar6;
        com.bytedance.sdk.component.ycc.emc.emc.ypw.bw bwVar;
        com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar7;
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.emc() && (bwVar = this.ypw) != null && (emcVar7 = this.msw) != null && bwVar.ypw(i10, emcVar7.emc())) {
            return true;
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.bw() && (ypwVar = this.dg) != null && (emcVar6 = this.ru) != null && ypwVar.ypw(i10, emcVar6.emc())) {
            return true;
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.ypw() && (emcVar4 = this.xq) != null && (emcVar5 = this.zz) != null && emcVar4.ypw(i10, emcVar5.emc())) {
            return true;
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.xq() && (uymVar = this.bw) != null && (emcVar3 = this.gbl) != null && uymVar.ypw(i10, emcVar3.emc())) {
            return true;
        }
        if (!com.bytedance.sdk.component.ycc.emc.ypw.emc.dg() || (xqVar = this.ycc) == null || (emcVar2 = this.sup) == null || !xqVar.ypw(i10, emcVar2.emc())) {
            return com.bytedance.sdk.component.ycc.emc.ypw.emc.ycc() && (yccVar = this.uym) != null && (emcVar = this.sz) != null && yccVar.ypw(i10, emcVar.emc());
        }
        return true;
    }
}
