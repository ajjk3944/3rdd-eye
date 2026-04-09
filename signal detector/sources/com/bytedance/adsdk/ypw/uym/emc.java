package com.bytedance.adsdk.ypw.uym;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.ypw.uym;

/* loaded from: classes.dex */
public class emc<T> {
    public final Interpolator bw;
    private float cf;
    public final Interpolator dg;
    public final T emc;
    private float gbl;
    public PointF msw;
    private int qh;
    private final uym ru;
    private float sup;
    private int sz;
    public Float uym;
    private float vk;
    public final Interpolator xq;
    public final float ycc;
    public T ypw;
    public PointF zz;

    public emc(uym uymVar, T t6, T t7, Interpolator interpolator, float f2, Float f5) {
        this.gbl = -3987645.8f;
        this.sup = -3987645.8f;
        this.sz = 784923401;
        this.qh = 784923401;
        this.cf = Float.MIN_VALUE;
        this.vk = Float.MIN_VALUE;
        this.msw = null;
        this.zz = null;
        this.ru = uymVar;
        this.emc = t6;
        this.ypw = t7;
        this.xq = interpolator;
        this.dg = null;
        this.bw = null;
        this.ycc = f2;
        this.uym = f5;
    }

    public boolean bw() {
        return this.xq == null && this.dg == null && this.bw == null;
    }

    public float dg() {
        if (this.ru == null) {
            return 1.0f;
        }
        if (this.vk == Float.MIN_VALUE) {
            if (this.uym == null) {
                this.vk = 1.0f;
            } else {
                this.vk = ((this.uym.floatValue() - this.ycc) / this.ru.aa()) + xq();
            }
        }
        return this.vk;
    }

    public emc<T> emc(T t6, T t7) {
        return new emc<>(t6, t7);
    }

    public int msw() {
        if (this.sz == 784923401) {
            this.sz = ((Integer) this.emc).intValue();
        }
        return this.sz;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.emc + ", endValue=" + this.ypw + ", startFrame=" + this.ycc + ", endFrame=" + this.uym + ", interpolator=" + this.xq + '}';
    }

    public float uym() {
        if (this.sup == -3987645.8f) {
            this.sup = ((Float) this.ypw).floatValue();
        }
        return this.sup;
    }

    public float xq() {
        uym uymVar = this.ru;
        if (uymVar == null) {
            return 0.0f;
        }
        if (this.cf == Float.MIN_VALUE) {
            this.cf = (this.ycc - uymVar.ycc()) / this.ru.aa();
        }
        return this.cf;
    }

    public float ycc() {
        if (this.gbl == -3987645.8f) {
            this.gbl = ((Float) this.emc).floatValue();
        }
        return this.gbl;
    }

    public int zz() {
        if (this.qh == 784923401) {
            this.qh = ((Integer) this.ypw).intValue();
        }
        return this.qh;
    }

    public boolean emc(float f2) {
        return f2 >= xq() && f2 < dg();
    }

    public emc(uym uymVar, T t6, T t7, Interpolator interpolator, Interpolator interpolator2, float f2, Float f5) {
        this.gbl = -3987645.8f;
        this.sup = -3987645.8f;
        this.sz = 784923401;
        this.qh = 784923401;
        this.cf = Float.MIN_VALUE;
        this.vk = Float.MIN_VALUE;
        this.msw = null;
        this.zz = null;
        this.ru = uymVar;
        this.emc = t6;
        this.ypw = t7;
        this.xq = null;
        this.dg = interpolator;
        this.bw = interpolator2;
        this.ycc = f2;
        this.uym = f5;
    }

    public emc(uym uymVar, T t6, T t7, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f2, Float f5) {
        this.gbl = -3987645.8f;
        this.sup = -3987645.8f;
        this.sz = 784923401;
        this.qh = 784923401;
        this.cf = Float.MIN_VALUE;
        this.vk = Float.MIN_VALUE;
        this.msw = null;
        this.zz = null;
        this.ru = uymVar;
        this.emc = t6;
        this.ypw = t7;
        this.xq = interpolator;
        this.dg = interpolator2;
        this.bw = interpolator3;
        this.ycc = f2;
        this.uym = f5;
    }

    public emc(T t6) {
        this.gbl = -3987645.8f;
        this.sup = -3987645.8f;
        this.sz = 784923401;
        this.qh = 784923401;
        this.cf = Float.MIN_VALUE;
        this.vk = Float.MIN_VALUE;
        this.msw = null;
        this.zz = null;
        this.ru = null;
        this.emc = t6;
        this.ypw = t6;
        this.xq = null;
        this.dg = null;
        this.bw = null;
        this.ycc = Float.MIN_VALUE;
        this.uym = Float.valueOf(Float.MAX_VALUE);
    }

    private emc(T t6, T t7) {
        this.gbl = -3987645.8f;
        this.sup = -3987645.8f;
        this.sz = 784923401;
        this.qh = 784923401;
        this.cf = Float.MIN_VALUE;
        this.vk = Float.MIN_VALUE;
        this.msw = null;
        this.zz = null;
        this.ru = null;
        this.emc = t6;
        this.ypw = t7;
        this.xq = null;
        this.dg = null;
        this.bw = null;
        this.ycc = Float.MIN_VALUE;
        this.uym = Float.valueOf(Float.MAX_VALUE);
    }
}
