package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.PointF;
import com.bytedance.adsdk.vt.ouw.vt.ouw;
import java.util.ArrayList;
import java.util.List;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class zih implements th, ouw.InterfaceC0040ouw {

    /* renamed from: lh, reason: collision with root package name */
    private final String f7174lh;
    final com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouw;
    private final com.bytedance.adsdk.vt.bly vt;
    private com.bytedance.adsdk.vt.lh.vt.jg yu;

    public zih(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.mwh mwhVar) {
        this.vt = blyVar;
        this.f7174lh = mwhVar.ouw;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw = mwhVar.vt.ouw();
        this.ouw = ouwVarOuw;
        ouwVar.ouw(ouwVarOuw);
        ouwVarOuw.ouw(this);
    }

    private static int vt(int i4, int i10) {
        int i11 = i4 / i10;
        return ((i4 ^ i10) >= 0 || i10 * i11 == i4) ? i11 : i11 - 1;
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0040ouw
    public final void ouw() {
        this.vt.invalidateSelf();
    }

    private static int ouw(int i4, int i10) {
        return i4 - (vt(i4, i10) * i10);
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.th
    public final com.bytedance.adsdk.vt.lh.vt.jg ouw(com.bytedance.adsdk.vt.lh.vt.jg jgVar) {
        PointF pointF;
        List<com.bytedance.adsdk.vt.lh.ouw> list;
        PointF pointF2;
        com.bytedance.adsdk.vt.lh.vt.jg jgVar2 = jgVar;
        List<com.bytedance.adsdk.vt.lh.ouw> list2 = jgVar2.ouw;
        if (list2.size() > 2) {
            float fFloatValue = this.ouw.le().floatValue();
            if (fFloatValue != 0.0f) {
                List<com.bytedance.adsdk.vt.lh.ouw> list3 = jgVar2.ouw;
                boolean z3 = jgVar2.f7111lh;
                boolean z10 = true;
                int size = list3.size() - 1;
                int i4 = 0;
                while (size >= 0) {
                    com.bytedance.adsdk.vt.lh.ouw ouwVar = list3.get(size);
                    com.bytedance.adsdk.vt.lh.ouw ouwVar2 = list3.get(ouw(size - 1, list3.size()));
                    if (size == 0 && !z3) {
                        pointF2 = jgVar2.vt;
                    } else {
                        pointF2 = ouwVar2.f7098lh;
                    }
                    i4 = (((size != 0 || z3) ? ouwVar2.vt : pointF2).equals(pointF2) && ouwVar.ouw.equals(pointF2) && !(!jgVar2.f7111lh && size == 0 && size == list3.size() - 1)) ? i4 + 2 : i4 + 1;
                    size--;
                }
                com.bytedance.adsdk.vt.lh.vt.jg jgVar3 = this.yu;
                if (jgVar3 == null || jgVar3.ouw.size() != i4) {
                    ArrayList arrayList = new ArrayList(i4);
                    for (int i10 = 0; i10 < i4; i10++) {
                        arrayList.add(new com.bytedance.adsdk.vt.lh.ouw());
                    }
                    this.yu = new com.bytedance.adsdk.vt.lh.vt.jg(new PointF(0.0f, 0.0f), false, arrayList);
                }
                com.bytedance.adsdk.vt.lh.vt.jg jgVar4 = this.yu;
                jgVar4.f7111lh = z3;
                PointF pointF3 = jgVar2.vt;
                jgVar4.ouw(pointF3.x, pointF3.y);
                List<com.bytedance.adsdk.vt.lh.ouw> list4 = jgVar4.ouw;
                boolean z11 = jgVar2.f7111lh;
                int i11 = 0;
                int i12 = 0;
                while (i11 < list2.size()) {
                    com.bytedance.adsdk.vt.lh.ouw ouwVar3 = list2.get(i11);
                    com.bytedance.adsdk.vt.lh.ouw ouwVar4 = list2.get(ouw(i11 - 1, list2.size()));
                    com.bytedance.adsdk.vt.lh.ouw ouwVar5 = list2.get(ouw(i11 - 2, list2.size()));
                    if (i11 == 0 && !z11) {
                        pointF = jgVar2.vt;
                    } else {
                        pointF = ouwVar4.f7098lh;
                    }
                    PointF pointF4 = (i11 != 0 || z11) ? ouwVar4.vt : pointF;
                    boolean z12 = z10;
                    PointF pointF5 = ouwVar3.ouw;
                    PointF pointF6 = ouwVar5.f7098lh;
                    PointF pointF7 = ouwVar3.f7098lh;
                    boolean z13 = (!jgVar2.f7111lh && i11 == 0 && i11 == list2.size() + (-1)) ? z12 : false;
                    if (pointF4.equals(pointF) && pointF5.equals(pointF) && !z13) {
                        float f10 = pointF.x;
                        float f11 = f10 - pointF6.x;
                        float f12 = pointF.y;
                        float f13 = f12 - pointF6.y;
                        float f14 = pointF7.x - f10;
                        float f15 = pointF7.y - f12;
                        list = list2;
                        float fHypot = (float) Math.hypot(f11, f13);
                        float fHypot2 = (float) Math.hypot(f14, f15);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f16 = pointF.x;
                        float fC = c.c(pointF6.x, f16, fMin, f16);
                        float f17 = pointF.y;
                        float fC2 = c.c(pointF6.y, f17, fMin, f17);
                        float fC3 = c.c(pointF7.x, f16, fMin2, f16);
                        float fC4 = c.c(pointF7.y, f17, fMin2, f17);
                        float f18 = fC - ((fC - f16) * 0.5519f);
                        float f19 = fC2 - ((fC2 - f17) * 0.5519f);
                        float f20 = fC3 - ((fC3 - f16) * 0.5519f);
                        float f21 = fC4 - ((fC4 - f17) * 0.5519f);
                        com.bytedance.adsdk.vt.lh.ouw ouwVar6 = list4.get(ouw(i12 - 1, list4.size()));
                        com.bytedance.adsdk.vt.lh.ouw ouwVar7 = list4.get(i12);
                        ouwVar6.vt(fC, fC2);
                        ouwVar6.lh(fC, fC2);
                        if (i11 == 0) {
                            jgVar4.ouw(fC, fC2);
                        }
                        ouwVar7.ouw(f18, f19);
                        com.bytedance.adsdk.vt.lh.ouw ouwVar8 = list4.get(i12 + 1);
                        ouwVar7.vt(f20, f21);
                        ouwVar7.lh(fC3, fC4);
                        ouwVar8.ouw(fC3, fC4);
                        i12 += 2;
                    } else {
                        list = list2;
                        com.bytedance.adsdk.vt.lh.ouw ouwVar9 = list4.get(ouw(i12 - 1, list4.size()));
                        com.bytedance.adsdk.vt.lh.ouw ouwVar10 = list4.get(i12);
                        PointF pointF8 = ouwVar4.vt;
                        ouwVar9.vt(pointF8.x, pointF8.y);
                        PointF pointF9 = ouwVar4.f7098lh;
                        ouwVar9.lh(pointF9.x, pointF9.y);
                        PointF pointF10 = ouwVar3.ouw;
                        ouwVar10.ouw(pointF10.x, pointF10.y);
                        i12++;
                    }
                    i11++;
                    jgVar2 = jgVar;
                    z10 = z12;
                    list2 = list;
                }
                return jgVar4;
            }
        }
        return jgVar2;
    }
}
