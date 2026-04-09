package com.bytedance.adsdk.ypw.xq;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* loaded from: classes.dex */
public class emc {
    private final PointF emc;
    private final PointF xq;
    private final PointF ypw;

    public emc() {
        this.emc = new PointF();
        this.ypw = new PointF();
        this.xq = new PointF();
    }

    public void emc(float f10, float f11) {
        this.emc.set(f10, f11);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.xq.x), Float.valueOf(this.xq.y), Float.valueOf(this.emc.x), Float.valueOf(this.emc.y), Float.valueOf(this.ypw.x), Float.valueOf(this.ypw.y));
    }

    public void xq(float f10, float f11) {
        this.xq.set(f10, f11);
    }

    public void ypw(float f10, float f11) {
        this.ypw.set(f10, f11);
    }

    public PointF emc() {
        return this.emc;
    }

    public PointF xq() {
        return this.xq;
    }

    public PointF ypw() {
        return this.ypw;
    }

    public emc(PointF pointF, PointF pointF2, PointF pointF3) {
        this.emc = pointF;
        this.ypw = pointF2;
        this.xq = pointF3;
    }
}
