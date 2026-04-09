package s7;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import f7.j;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final j f33483a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f33484b;

    /* renamed from: c, reason: collision with root package name */
    public Object f33485c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f33486d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f33487e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f33488f;
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public Float f33489h;

    /* renamed from: i, reason: collision with root package name */
    public float f33490i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public int f33491k;

    /* renamed from: l, reason: collision with root package name */
    public int f33492l;

    /* renamed from: m, reason: collision with root package name */
    public float f33493m;

    /* renamed from: n, reason: collision with root package name */
    public float f33494n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f33495o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f33496p;

    public a(j jVar, Object obj, Object obj2, Interpolator interpolator, float f10, Float f11) {
        this.f33490i = -3987645.8f;
        this.j = -3987645.8f;
        this.f33491k = 784923401;
        this.f33492l = 784923401;
        this.f33493m = Float.MIN_VALUE;
        this.f33494n = Float.MIN_VALUE;
        this.f33495o = null;
        this.f33496p = null;
        this.f33483a = jVar;
        this.f33484b = obj;
        this.f33485c = obj2;
        this.f33486d = interpolator;
        this.f33487e = null;
        this.f33488f = null;
        this.g = f10;
        this.f33489h = f11;
    }

    public final float a() {
        if (this.f33483a == null) {
            return 1.0f;
        }
        if (this.f33494n == Float.MIN_VALUE) {
            if (this.f33489h == null) {
                this.f33494n = 1.0f;
            } else {
                this.f33494n = (float) (b() + ((this.f33489h.floatValue() - this.g) / (r1.f23760m - r1.f23759l)));
            }
        }
        return this.f33494n;
    }

    public final float b() {
        j jVar = this.f33483a;
        if (jVar == null) {
            return 0.0f;
        }
        if (this.f33493m == Float.MIN_VALUE) {
            float f10 = jVar.f23759l;
            this.f33493m = (this.g - f10) / (jVar.f23760m - f10);
        }
        return this.f33493m;
    }

    public final boolean c() {
        return this.f33486d == null && this.f33487e == null && this.f33488f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f33484b + ", endValue=" + this.f33485c + ", startFrame=" + this.g + ", endFrame=" + this.f33489h + ", interpolator=" + this.f33486d + '}';
    }

    public a(j jVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f10) {
        this.f33490i = -3987645.8f;
        this.j = -3987645.8f;
        this.f33491k = 784923401;
        this.f33492l = 784923401;
        this.f33493m = Float.MIN_VALUE;
        this.f33494n = Float.MIN_VALUE;
        this.f33495o = null;
        this.f33496p = null;
        this.f33483a = jVar;
        this.f33484b = obj;
        this.f33485c = obj2;
        this.f33486d = null;
        this.f33487e = interpolator;
        this.f33488f = interpolator2;
        this.g = f10;
        this.f33489h = null;
    }

    public a(j jVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f33490i = -3987645.8f;
        this.j = -3987645.8f;
        this.f33491k = 784923401;
        this.f33492l = 784923401;
        this.f33493m = Float.MIN_VALUE;
        this.f33494n = Float.MIN_VALUE;
        this.f33495o = null;
        this.f33496p = null;
        this.f33483a = jVar;
        this.f33484b = obj;
        this.f33485c = obj2;
        this.f33486d = interpolator;
        this.f33487e = interpolator2;
        this.f33488f = interpolator3;
        this.g = f10;
        this.f33489h = f11;
    }

    public a(Object obj) {
        this.f33490i = -3987645.8f;
        this.j = -3987645.8f;
        this.f33491k = 784923401;
        this.f33492l = 784923401;
        this.f33493m = Float.MIN_VALUE;
        this.f33494n = Float.MIN_VALUE;
        this.f33495o = null;
        this.f33496p = null;
        this.f33483a = null;
        this.f33484b = obj;
        this.f33485c = obj;
        this.f33486d = null;
        this.f33487e = null;
        this.f33488f = null;
        this.g = Float.MIN_VALUE;
        this.f33489h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(m7.c cVar, m7.c cVar2) {
        this.f33490i = -3987645.8f;
        this.j = -3987645.8f;
        this.f33491k = 784923401;
        this.f33492l = 784923401;
        this.f33493m = Float.MIN_VALUE;
        this.f33494n = Float.MIN_VALUE;
        this.f33495o = null;
        this.f33496p = null;
        this.f33483a = null;
        this.f33484b = cVar;
        this.f33485c = cVar2;
        this.f33486d = null;
        this.f33487e = null;
        this.f33488f = null;
        this.g = Float.MIN_VALUE;
        this.f33489h = Float.valueOf(Float.MAX_VALUE);
    }
}
