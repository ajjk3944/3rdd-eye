package com.bytedance.adsdk.vt.ouw.ouw;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class qbp extends ouw {
    private final String fkw;

    /* renamed from: le, reason: collision with root package name */
    private final boolean f7161le;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> pno;
    private final com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ra;
    private final com.bytedance.adsdk.vt.lh.lh.ouw yu;

    public qbp(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar, com.bytedance.adsdk.vt.lh.vt.vm vmVar) {
        super(blyVar, ouwVar, vmVar.ra.ouw(), vmVar.pno.ouw(), vmVar.bly, vmVar.fkw, vmVar.f7130le, vmVar.f7131lh, vmVar.vt);
        this.yu = ouwVar;
        this.fkw = vmVar.ouw;
        this.f7161le = vmVar.tlj;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVarOuw = vmVar.yu.ouw();
        this.ra = ouwVarOuw;
        ouwVarOuw.ouw(this);
        ouwVar.ouw(ouwVarOuw);
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.ouw, com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(Canvas canvas, Matrix matrix, int i4) {
        if (this.f7161le) {
            return;
        }
        this.vt.setColor(((com.bytedance.adsdk.vt.ouw.vt.vt) this.ra).pno());
        com.bytedance.adsdk.vt.ouw.vt.ouw<ColorFilter, ColorFilter> ouwVar = this.pno;
        if (ouwVar != null) {
            this.vt.setColorFilter(ouwVar.le());
        }
        super.ouw(canvas, matrix, i4);
    }
}
