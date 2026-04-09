package com.bytedance.adsdk.vt.lh;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {

    /* renamed from: lh, reason: collision with root package name */
    public final PointF f7098lh;
    public final PointF ouw;
    public final PointF vt;

    public ouw() {
        this.ouw = new PointF();
        this.vt = new PointF();
        this.f7098lh = new PointF();
    }

    public final void lh(float f10, float f11) {
        this.f7098lh.set(f10, f11);
    }

    public final void ouw(float f10, float f11) {
        this.ouw.set(f10, f11);
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f7098lh.x), Float.valueOf(this.f7098lh.y), Float.valueOf(this.ouw.x), Float.valueOf(this.ouw.y), Float.valueOf(this.vt.x), Float.valueOf(this.vt.y));
    }

    public final void vt(float f10, float f11) {
        this.vt.set(f10, f11);
    }

    public ouw(PointF pointF, PointF pointF2, PointF pointF3) {
        this.ouw = pointF;
        this.vt = pointF2;
        this.f7098lh = pointF3;
    }
}
