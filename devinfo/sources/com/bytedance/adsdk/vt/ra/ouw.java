package com.bytedance.adsdk.vt.ra;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.vt.ra;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw<T> {
    public float bly;

    /* renamed from: cf, reason: collision with root package name */
    public int f7202cf;
    public final Interpolator fkw;

    /* renamed from: jg, reason: collision with root package name */
    public PointF f7203jg;
    private float ko;

    /* renamed from: le, reason: collision with root package name */
    public final Interpolator f7204le;

    /* renamed from: lh, reason: collision with root package name */
    public T f7205lh;
    public PointF mwh;
    private final ra ouw;
    public Float pno;
    public final float ra;
    private float rn;
    public int ryl;
    public float tlj;
    public final T vt;
    public final Interpolator yu;

    public ouw(ra raVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.bly = -3987645.8f;
        this.tlj = -3987645.8f;
        this.f7202cf = 784923401;
        this.ryl = 784923401;
        this.ko = Float.MIN_VALUE;
        this.rn = Float.MIN_VALUE;
        this.mwh = null;
        this.f7203jg = null;
        this.ouw = raVar;
        this.vt = t10;
        this.f7205lh = t11;
        this.yu = interpolator;
        this.fkw = null;
        this.f7204le = null;
        this.ra = f10;
        this.pno = f11;
    }

    public final float lh() {
        if (this.ouw == null) {
            return 1.0f;
        }
        if (this.rn == Float.MIN_VALUE) {
            if (this.pno == null) {
                this.rn = 1.0f;
            } else {
                this.rn = ((this.pno.floatValue() - this.ra) / this.ouw.vt()) + vt();
            }
        }
        return this.rn;
    }

    public final boolean ouw(float f10) {
        return f10 >= vt() && f10 < lh();
    }

    public String toString() {
        return "Keyframe{startValue=" + this.vt + ", endValue=" + this.f7205lh + ", startFrame=" + this.ra + ", endFrame=" + this.pno + ", interpolator=" + this.yu + '}';
    }

    public final float vt() {
        ra raVar = this.ouw;
        if (raVar == null) {
            return 0.0f;
        }
        if (this.ko == Float.MIN_VALUE) {
            this.ko = (this.ra - raVar.tlj) / raVar.vt();
        }
        return this.ko;
    }

    public final boolean yu() {
        return this.yu == null && this.fkw == null && this.f7204le == null;
    }

    public ouw(ra raVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.bly = -3987645.8f;
        this.tlj = -3987645.8f;
        this.f7202cf = 784923401;
        this.ryl = 784923401;
        this.ko = Float.MIN_VALUE;
        this.rn = Float.MIN_VALUE;
        this.mwh = null;
        this.f7203jg = null;
        this.ouw = raVar;
        this.vt = t10;
        this.f7205lh = t11;
        this.yu = null;
        this.fkw = interpolator;
        this.f7204le = interpolator2;
        this.ra = f10;
        this.pno = f11;
    }

    public ouw(ra raVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.bly = -3987645.8f;
        this.tlj = -3987645.8f;
        this.f7202cf = 784923401;
        this.ryl = 784923401;
        this.ko = Float.MIN_VALUE;
        this.rn = Float.MIN_VALUE;
        this.mwh = null;
        this.f7203jg = null;
        this.ouw = raVar;
        this.vt = t10;
        this.f7205lh = t11;
        this.yu = interpolator;
        this.fkw = interpolator2;
        this.f7204le = interpolator3;
        this.ra = f10;
        this.pno = f11;
    }

    public ouw(T t10) {
        this.bly = -3987645.8f;
        this.tlj = -3987645.8f;
        this.f7202cf = 784923401;
        this.ryl = 784923401;
        this.ko = Float.MIN_VALUE;
        this.rn = Float.MIN_VALUE;
        this.mwh = null;
        this.f7203jg = null;
        this.ouw = null;
        this.vt = t10;
        this.f7205lh = t10;
        this.yu = null;
        this.fkw = null;
        this.f7204le = null;
        this.ra = Float.MIN_VALUE;
        this.pno = Float.valueOf(Float.MAX_VALUE);
    }

    public ouw(T t10, T t11) {
        this.bly = -3987645.8f;
        this.tlj = -3987645.8f;
        this.f7202cf = 784923401;
        this.ryl = 784923401;
        this.ko = Float.MIN_VALUE;
        this.rn = Float.MIN_VALUE;
        this.mwh = null;
        this.f7203jg = null;
        this.ouw = null;
        this.vt = t10;
        this.f7205lh = t11;
        this.yu = null;
        this.fkw = null;
        this.f7204le = null;
        this.ra = Float.MIN_VALUE;
        this.pno = Float.valueOf(Float.MAX_VALUE);
    }
}
