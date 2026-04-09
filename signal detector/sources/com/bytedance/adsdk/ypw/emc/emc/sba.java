package com.bytedance.adsdk.ypw.emc.emc;

import android.graphics.Path;
import com.bytedance.adsdk.ypw.emc.ypw.emc;

/* loaded from: classes.dex */
public class sba implements sz, emc.InterfaceC0021emc {
    private final com.bytedance.adsdk.ypw.emc.ypw.sz bw;
    private final com.bytedance.adsdk.ypw.zz dg;
    private final Path emc = new Path();
    private final ypw uym = new ypw();
    private final boolean xq;
    private boolean ycc;
    private final String ypw;

    public sba(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar, com.bytedance.adsdk.ypw.xq.ypw.aa aaVar) {
        this.ypw = aaVar.emc();
        this.xq = aaVar.xq();
        this.dg = zzVar;
        com.bytedance.adsdk.ypw.emc.ypw.sz szVarEmc = aaVar.ypw().emc();
        this.bw = szVarEmc;
        emcVar.emc(szVarEmc);
        szVarEmc.emc(this);
    }

    private void ypw() {
        this.ycc = false;
        this.dg.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.sz
    public Path dg() {
        if (this.ycc) {
            return this.emc;
        }
        this.emc.reset();
        if (this.xq) {
            this.ycc = true;
            return this.emc;
        }
        Path pathUym = this.bw.uym();
        if (pathUym == null) {
            return this.emc;
        }
        this.emc.set(pathUym);
        this.emc.setFillType(Path.FillType.EVEN_ODD);
        this.uym.emc(this.emc);
        this.ycc = true;
        return this.emc;
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.InterfaceC0021emc
    public void emc() {
        ypw();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // com.bytedance.adsdk.ypw.emc.emc.xq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(java.util.List<com.bytedance.adsdk.ypw.emc.emc.xq> r6, java.util.List<com.bytedance.adsdk.ypw.emc.emc.xq> r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r0 >= r1) goto L39
            java.lang.Object r1 = r6.get(r0)
            com.bytedance.adsdk.ypw.emc.emc.xq r1 = (com.bytedance.adsdk.ypw.emc.emc.xq) r1
            boolean r2 = r1 instanceof com.bytedance.adsdk.ypw.emc.emc.ylm
            if (r2 == 0) goto L26
            r2 = r1
            com.bytedance.adsdk.ypw.emc.emc.ylm r2 = (com.bytedance.adsdk.ypw.emc.emc.ylm) r2
            com.bytedance.adsdk.ypw.xq.ypw.yzg$emc r3 = r2.ypw()
            com.bytedance.adsdk.ypw.xq.ypw.yzg$emc r4 = com.bytedance.adsdk.ypw.xq.ypw.yzg.emc.SIMULTANEOUSLY
            if (r3 != r4) goto L26
            com.bytedance.adsdk.ypw.emc.emc.ypw r1 = r5.uym
            r1.emc(r2)
            r2.emc(r5)
            goto L36
        L26:
            boolean r2 = r1 instanceof com.bytedance.adsdk.ypw.emc.emc.yzg
            if (r2 == 0) goto L36
            if (r7 != 0) goto L31
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L31:
            com.bytedance.adsdk.ypw.emc.emc.yzg r1 = (com.bytedance.adsdk.ypw.emc.emc.yzg) r1
            r7.add(r1)
        L36:
            int r0 = r0 + 1
            goto L2
        L39:
            com.bytedance.adsdk.ypw.emc.ypw.sz r6 = r5.bw
            r6.emc(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ypw.emc.emc.sba.emc(java.util.List, java.util.List):void");
    }
}
