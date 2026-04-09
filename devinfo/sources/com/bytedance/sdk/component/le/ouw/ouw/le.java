package com.bytedance.sdk.component.le.ouw.ouw;

import com.bytedance.sdk.component.le.ouw.ouw.vt.ra;
import com.bytedance.sdk.component.le.ouw.pno;
import java.util.List;
import java.util.Queue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le implements yu {
    private com.bytedance.sdk.component.le.ouw.yu.vt.ouw bly;

    /* renamed from: cf, reason: collision with root package name */
    private com.bytedance.sdk.component.le.ouw.yu.vt.ouw f7536cf;
    private ra fkw;

    /* renamed from: jg, reason: collision with root package name */
    private Queue<String> f7537jg;

    /* renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.component.le.ouw.ouw.vt.lh f7538le;

    /* renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.component.le.ouw.ouw.vt.ouw f7539lh;
    private com.bytedance.sdk.component.le.ouw.yu.vt.ouw mwh;
    fkw ouw = pno.vt().ra;
    private com.bytedance.sdk.component.le.ouw.yu.vt.ouw pno;
    private com.bytedance.sdk.component.le.ouw.ouw.vt.le ra;
    private com.bytedance.sdk.component.le.ouw.yu.vt.ouw ryl;
    private com.bytedance.sdk.component.le.ouw.yu.vt.ouw tlj;
    private com.bytedance.sdk.component.le.ouw.ouw.vt.fkw vt;
    private com.bytedance.sdk.component.le.ouw.ouw.vt.vt yu;

    public le(Queue<String> queue) {
        this.f7537jg = queue;
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.ouw()) {
            com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar = pno.vt().vt;
            this.pno = ouwVar;
            this.vt = new com.bytedance.sdk.component.le.ouw.ouw.vt.fkw(ouwVar, queue);
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.fkw()) {
            if (pno.vt().f7554le != null) {
                this.tlj = pno.vt().f7554le;
            } else {
                this.tlj = pno.vt().f7555lh;
            }
            this.yu = new com.bytedance.sdk.component.le.ouw.ouw.vt.vt(this.tlj, queue);
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.vt()) {
            com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar2 = pno.vt().f7555lh;
            this.bly = ouwVar2;
            this.f7539lh = new com.bytedance.sdk.component.le.ouw.ouw.vt.ouw(ouwVar2, queue);
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.lh()) {
            com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar3 = pno.vt().f7555lh;
            this.f7536cf = ouwVar3;
            this.fkw = new ra(ouwVar3, queue);
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.yu()) {
            com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar4 = pno.vt().yu;
            this.ryl = ouwVar4;
            this.f7538le = new com.bytedance.sdk.component.le.ouw.ouw.vt.lh(ouwVar4, queue);
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.le()) {
            com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar5 = pno.vt().fkw;
            this.mwh = ouwVar5;
            this.ra = new com.bytedance.sdk.component.le.ouw.ouw.vt.le(ouwVar5, queue);
        }
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final void ouw(int i4, long j) {
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final void ouw(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar, int i4) {
        try {
            byte bYu = ouwVar.yu();
            byte bFkw = ouwVar.fkw();
            if (bYu == 0 && bFkw == 1 && com.bytedance.sdk.component.le.ouw.vt.ouw.ouw()) {
                this.vt.ouw((com.bytedance.sdk.component.le.ouw.ouw.vt.fkw) ouwVar);
                return;
            }
            if (bYu == 3 && bFkw == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.fkw()) {
                this.yu.ouw((com.bytedance.sdk.component.le.ouw.ouw.vt.vt) ouwVar);
                return;
            }
            if (bYu == 0 && bFkw == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.vt()) {
                this.f7539lh.ouw((com.bytedance.sdk.component.le.ouw.ouw.vt.ouw) ouwVar);
                return;
            }
            if (bYu == 1 && bFkw == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.lh()) {
                this.fkw.ouw((ra) ouwVar);
                return;
            }
            if (bYu == 1 && bFkw == 3 && com.bytedance.sdk.component.le.ouw.vt.ouw.yu()) {
                this.f7538le.ouw((com.bytedance.sdk.component.le.ouw.ouw.vt.lh) ouwVar);
            } else if (bYu == 2 && bFkw == 3 && com.bytedance.sdk.component.le.ouw.vt.ouw.le()) {
                this.ra.ouw((com.bytedance.sdk.component.le.ouw.ouw.vt.le) ouwVar);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final void ouw(int i4, List<com.bytedance.sdk.component.le.ouw.yu.ouw> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar = list.get(0);
        byte bFkw = ouwVar.fkw();
        byte bYu = ouwVar.yu();
        if (bYu == 0 && bFkw == 1 && com.bytedance.sdk.component.le.ouw.vt.ouw.ouw()) {
            this.vt.ouw(i4, list);
            return;
        }
        if (bYu == 3 && bFkw == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.fkw()) {
            this.yu.ouw(i4, list);
            return;
        }
        if (bYu == 0 && bFkw == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.vt()) {
            this.f7539lh.ouw(i4, list);
            return;
        }
        if (bYu == 1 && bFkw == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.lh()) {
            this.fkw.ouw(i4, list);
            return;
        }
        if (bYu == 1 && bFkw == 3 && com.bytedance.sdk.component.le.ouw.vt.ouw.yu()) {
            this.f7538le.ouw(i4, list);
        } else if (bYu == 2 && bFkw == 3 && com.bytedance.sdk.component.le.ouw.vt.ouw.le()) {
            this.ra.ouw(i4, list);
        }
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final List<com.bytedance.sdk.component.le.ouw.yu.ouw> ouw(int i4, int i10, List<String> list) {
        List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw;
        List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw2;
        List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw3;
        List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw4;
        List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw5;
        List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw6;
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.ouw() && this.vt.vt(i4) && (listOuw6 = this.vt.ouw(i4)) != null && listOuw6.size() != 0) {
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
            return listOuw6;
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.fkw() && this.yu.vt(i4) && (listOuw5 = this.yu.ouw(i4)) != null && listOuw5.size() != 0) {
            return listOuw5;
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.vt() && this.f7539lh.vt(i4) && (listOuw4 = this.f7539lh.ouw(i4)) != null && listOuw4.size() != 0) {
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            com.bytedance.sdk.component.le.ouw.fkw fkwVar2 = pno.vt().bly;
            return listOuw4;
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.lh() && this.fkw.vt(i4) && (listOuw3 = this.fkw.ouw(i4)) != null && listOuw3.size() != 0) {
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar3 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            com.bytedance.sdk.component.le.ouw.fkw fkwVar3 = pno.vt().bly;
            return listOuw3;
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.yu() && this.f7538le.vt(i4) && (listOuw2 = this.f7538le.ouw(i4)) != null && listOuw2.size() != 0) {
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar4 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            com.bytedance.sdk.component.le.ouw.fkw fkwVar4 = pno.vt().bly;
            return listOuw2;
        }
        if (!com.bytedance.sdk.component.le.ouw.vt.ouw.le() || !this.ra.vt(i4) || (listOuw = this.ra.ouw(i4)) == null || listOuw.size() == 0) {
            return null;
        }
        return listOuw;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final boolean ouw(int i4, boolean z3) {
        com.bytedance.sdk.component.le.ouw.ouw.vt.le leVar;
        com.bytedance.sdk.component.le.ouw.ouw.vt.lh lhVar;
        ra raVar;
        com.bytedance.sdk.component.le.ouw.ouw.vt.ouw ouwVar;
        com.bytedance.sdk.component.le.ouw.ouw.vt.vt vtVar;
        com.bytedance.sdk.component.le.ouw.ouw.vt.fkw fkwVar;
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.ouw() && (fkwVar = this.vt) != null && this.pno != null && fkwVar.vt(i4)) {
            return true;
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.fkw() && (vtVar = this.yu) != null && this.tlj != null && vtVar.vt(i4)) {
            return true;
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.vt() && (ouwVar = this.f7539lh) != null && this.bly != null && ouwVar.vt(i4)) {
            return true;
        }
        if (com.bytedance.sdk.component.le.ouw.vt.ouw.lh() && (raVar = this.fkw) != null && this.f7536cf != null && raVar.vt(i4)) {
            return true;
        }
        if (!com.bytedance.sdk.component.le.ouw.vt.ouw.yu() || (lhVar = this.f7538le) == null || this.ryl == null || !lhVar.vt(i4)) {
            return com.bytedance.sdk.component.le.ouw.vt.ouw.le() && (leVar = this.ra) != null && this.mwh != null && leVar.vt(i4);
        }
        return true;
    }
}
