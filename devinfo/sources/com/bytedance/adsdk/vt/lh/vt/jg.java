package com.bytedance.adsdk.vt.lh.vt;

import android.graphics.PointF;
import d.h;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jg {

    /* renamed from: lh, reason: collision with root package name */
    public boolean f7111lh;
    public final List<com.bytedance.adsdk.vt.lh.ouw> ouw;
    public PointF vt;

    public jg(PointF pointF, boolean z3, List<com.bytedance.adsdk.vt.lh.ouw> list) {
        this.vt = pointF;
        this.f7111lh = z3;
        this.ouw = new ArrayList(list);
    }

    public final void ouw(float f10, float f11) {
        if (this.vt == null) {
            this.vt = new PointF();
        }
        this.vt.set(f10, f11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.ouw.size());
        sb2.append("closed=");
        return h.x(sb2, this.f7111lh, '}');
    }

    public jg() {
        this.ouw = new ArrayList();
    }
}
