package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Path;
import com.bytedance.adsdk.vt.ouw.vt.ouw;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vm implements mwh, ouw.InterfaceC0040ouw {
    private final com.bytedance.adsdk.vt.ouw.vt.mwh fkw;

    /* renamed from: le, reason: collision with root package name */
    private boolean f7169le;

    /* renamed from: lh, reason: collision with root package name */
    private final boolean f7170lh;
    private final Path ouw = new Path();
    private final vt ra = new vt();
    private final String vt;
    private final com.bytedance.adsdk.vt.bly yu;

    public vm(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.zih zihVar) {
        this.vt = zihVar.ouw;
        this.f7170lh = zihVar.f7135lh;
        this.yu = blyVar;
        com.bytedance.adsdk.vt.ouw.vt.mwh mwhVarOuw = zihVar.vt.ouw();
        this.fkw = mwhVarOuw;
        ouwVar.ouw(mwhVarOuw);
        mwhVarOuw.ouw(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ouw(java.util.List<com.bytedance.adsdk.vt.ouw.ouw.lh> r6, java.util.List<com.bytedance.adsdk.vt.ouw.ouw.lh> r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r0 >= r1) goto L37
            java.lang.Object r1 = r6.get(r0)
            com.bytedance.adsdk.vt.ouw.ouw.lh r1 = (com.bytedance.adsdk.vt.ouw.ouw.lh) r1
            boolean r2 = r1 instanceof com.bytedance.adsdk.vt.ouw.ouw.zin
            if (r2 == 0) goto L24
            r2 = r1
            com.bytedance.adsdk.vt.ouw.ouw.zin r2 = (com.bytedance.adsdk.vt.ouw.ouw.zin) r2
            com.bytedance.adsdk.vt.lh.vt.th$ouw r3 = r2.vt
            com.bytedance.adsdk.vt.lh.vt.th$ouw r4 = com.bytedance.adsdk.vt.lh.vt.th.ouw.SIMULTANEOUSLY
            if (r3 != r4) goto L24
            com.bytedance.adsdk.vt.ouw.ouw.vt r1 = r5.ra
            r1.ouw(r2)
            r2.ouw(r5)
            goto L34
        L24:
            boolean r2 = r1 instanceof com.bytedance.adsdk.vt.ouw.ouw.th
            if (r2 == 0) goto L34
            if (r7 != 0) goto L2f
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L2f:
            com.bytedance.adsdk.vt.ouw.ouw.th r1 = (com.bytedance.adsdk.vt.ouw.ouw.th) r1
            r7.add(r1)
        L34:
            int r0 = r0 + 1
            goto L2
        L37:
            com.bytedance.adsdk.vt.ouw.vt.mwh r6 = r5.fkw
            r6.fkw = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.ouw.ouw.vm.ouw(java.util.List, java.util.List):void");
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.mwh
    public final Path yu() {
        if (this.f7169le) {
            return this.ouw;
        }
        this.ouw.reset();
        if (this.f7170lh) {
            this.f7169le = true;
            return this.ouw;
        }
        Path pathLe = this.fkw.le();
        if (pathLe == null) {
            return this.ouw;
        }
        this.ouw.set(pathLe);
        this.ouw.setFillType(Path.FillType.EVEN_ODD);
        this.ra.ouw(this.ouw);
        this.f7169le = true;
        return this.ouw;
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0040ouw
    public final void ouw() {
        this.f7169le = false;
        this.yu.invalidateSelf();
    }
}
