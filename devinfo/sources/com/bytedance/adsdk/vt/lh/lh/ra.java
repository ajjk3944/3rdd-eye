package com.bytedance.adsdk.vt.lh.lh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.vt.lh.vt.rn;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra extends ouw {

    /* renamed from: cf, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.ouw.ouw.yu f7091cf;
    private final vt ryl;

    public ra(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar, vt vtVar, com.bytedance.adsdk.vt.ra raVar) {
        super(blyVar, fkwVar);
        this.ryl = vtVar;
        com.bytedance.adsdk.vt.ouw.ouw.yu yuVar = new com.bytedance.adsdk.vt.ouw.ouw.yu(blyVar, this, new rn("__container", fkwVar.ouw, false), raVar);
        this.f7091cf = yuVar;
        List<com.bytedance.adsdk.vt.ouw.ouw.lh> list = Collections.EMPTY_LIST;
        yuVar.ouw(list, list);
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final com.bytedance.adsdk.vt.fkw.tlj lh() {
        com.bytedance.adsdk.vt.fkw.tlj tljVarLh = super.lh();
        return tljVarLh != null ? tljVarLh : this.ryl.lh();
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw, com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z3) {
        super.ouw(rectF, matrix, z3);
        this.f7091cf.ouw(rectF, this.ouw, z3);
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final void vt(Canvas canvas, Matrix matrix, int i4) {
        super.vt(canvas, matrix, i4);
        this.f7091cf.ouw(canvas, matrix, i4);
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final com.bytedance.adsdk.vt.lh.vt.ouw vt() {
        com.bytedance.adsdk.vt.lh.vt.ouw ouwVarVt = super.vt();
        return ouwVarVt != null ? ouwVarVt : this.ryl.vt();
    }
}
