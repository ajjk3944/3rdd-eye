package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.vt.lh.vt.th;
import com.bytedance.adsdk.vt.ouw.vt.ouw;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le implements cf, mwh, ouw.InterfaceC0040ouw {
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, PointF> fkw;

    /* renamed from: le, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.lh.vt.vt f7150le;

    /* renamed from: lh, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.bly f7151lh;
    private boolean pno;
    private final String vt;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<?, PointF> yu;
    private final Path ouw = new Path();
    private final vt ra = new vt();

    public le(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.vt vtVar) {
        this.vt = vtVar.ouw;
        this.f7151lh = blyVar;
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw = vtVar.f7134lh.ouw();
        this.yu = ouwVarOuw;
        com.bytedance.adsdk.vt.ouw.vt.ouw<PointF, PointF> ouwVarOuw2 = vtVar.vt.ouw();
        this.fkw = ouwVarOuw2;
        this.f7150le = vtVar;
        ouwVar.ouw(ouwVarOuw);
        ouwVar.ouw(ouwVarOuw2);
        ouwVarOuw.ouw(this);
        ouwVarOuw2.ouw(this);
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            lh lhVar = list.get(i4);
            if (lhVar instanceof zin) {
                zin zinVar = (zin) lhVar;
                if (zinVar.vt == th.ouw.SIMULTANEOUSLY) {
                    this.ra.ouw(zinVar);
                    zinVar.ouw(this);
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.mwh
    public final Path yu() {
        if (this.pno) {
            return this.ouw;
        }
        this.ouw.reset();
        if (this.f7150le.fkw) {
            this.pno = true;
            return this.ouw;
        }
        PointF pointFLe = this.yu.le();
        float f10 = pointFLe.x / 2.0f;
        float f11 = pointFLe.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.ouw.reset();
        if (this.f7150le.yu) {
            float f14 = -f11;
            this.ouw.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.ouw.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.ouw.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.ouw.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.ouw.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.ouw.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.ouw.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.ouw.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.ouw.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.ouw.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointFLe2 = this.fkw.le();
        this.ouw.offset(pointFLe2.x, pointFLe2.y);
        this.ouw.close();
        this.ra.ouw(this.ouw);
        this.pno = true;
        return this.ouw;
    }

    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw.InterfaceC0040ouw
    public final void ouw() {
        this.pno = false;
        this.f7151lh.invalidateSelf();
    }
}
