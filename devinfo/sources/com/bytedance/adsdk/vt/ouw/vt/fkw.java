package com.bytedance.adsdk.vt.ouw.vt;

import java.util.List;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw extends ra<com.bytedance.adsdk.vt.lh.vt.yu> {
    private final com.bytedance.adsdk.vt.lh.vt.yu fkw;

    public fkw(List<com.bytedance.adsdk.vt.ra.ouw<com.bytedance.adsdk.vt.lh.vt.yu>> list) {
        super(list);
        com.bytedance.adsdk.vt.lh.vt.yu yuVar = list.get(0).vt;
        int length = yuVar != null ? yuVar.vt.length : 0;
        this.fkw = new com.bytedance.adsdk.vt.lh.vt.yu(new float[length], new int[length]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final /* synthetic */ Object ouw(com.bytedance.adsdk.vt.ra.ouw ouwVar, float f10) {
        com.bytedance.adsdk.vt.lh.vt.yu yuVar = this.fkw;
        com.bytedance.adsdk.vt.lh.vt.yu yuVar2 = (com.bytedance.adsdk.vt.lh.vt.yu) ouwVar.vt;
        com.bytedance.adsdk.vt.lh.vt.yu yuVar3 = (com.bytedance.adsdk.vt.lh.vt.yu) ouwVar.f7205lh;
        if (yuVar2.vt.length != yuVar3.vt.length) {
            StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb2.append(yuVar2.vt.length);
            sb2.append(" vs ");
            throw new IllegalArgumentException(c.j(yuVar3.vt.length, ")", sb2));
        }
        for (int i4 = 0; i4 < yuVar2.vt.length; i4++) {
            yuVar.ouw[i4] = com.bytedance.adsdk.vt.le.ra.ouw(yuVar2.ouw[i4], yuVar3.ouw[i4], f10);
            yuVar.vt[i4] = com.bytedance.adsdk.vt.le.vt.ouw(f10, yuVar2.vt[i4], yuVar3.vt[i4]);
        }
        return this.fkw;
    }
}
