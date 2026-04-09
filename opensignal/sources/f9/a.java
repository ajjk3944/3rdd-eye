package f9;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import r8.h;
import z8.c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final h f8704a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8705b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8706c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f8707d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f8708e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f8709f;

    /* renamed from: g, reason: collision with root package name */
    public final float f8710g;

    /* renamed from: h, reason: collision with root package name */
    public Float f8711h;

    /* renamed from: i, reason: collision with root package name */
    public float f8712i;
    public float j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f8713l;

    /* renamed from: m, reason: collision with root package name */
    public float f8714m;

    /* renamed from: n, reason: collision with root package name */
    public float f8715n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f8716o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f8717p;

    public a(h hVar, Object obj, Object obj2, Interpolator interpolator, float f10, Float f11) {
        this.f8712i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f8713l = 784923401;
        this.f8714m = Float.MIN_VALUE;
        this.f8715n = Float.MIN_VALUE;
        this.f8716o = null;
        this.f8717p = null;
        this.f8704a = hVar;
        this.f8705b = obj;
        this.f8706c = obj2;
        this.f8707d = interpolator;
        this.f8708e = null;
        this.f8709f = null;
        this.f8710g = f10;
        this.f8711h = f11;
    }

    public final float a() {
        if (this.f8704a == null) {
            return 1.0f;
        }
        if (this.f8715n == Float.MIN_VALUE) {
            if (this.f8711h == null) {
                this.f8715n = 1.0f;
            } else {
                this.f8715n = (float) (b() + ((this.f8711h.floatValue() - this.f8710g) / (r1.f21333m - r1.f21332l)));
            }
        }
        return this.f8715n;
    }

    public final float b() {
        h hVar = this.f8704a;
        if (hVar == null) {
            return 0.0f;
        }
        if (this.f8714m == Float.MIN_VALUE) {
            float f10 = hVar.f21332l;
            this.f8714m = (this.f8710g - f10) / (hVar.f21333m - f10);
        }
        return this.f8714m;
    }

    public final boolean c() {
        return this.f8707d == null && this.f8708e == null && this.f8709f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f8705b + ", endValue=" + this.f8706c + ", startFrame=" + this.f8710g + ", endFrame=" + this.f8711h + ", interpolator=" + this.f8707d + '}';
    }

    public a(h hVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f10) {
        this.f8712i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f8713l = 784923401;
        this.f8714m = Float.MIN_VALUE;
        this.f8715n = Float.MIN_VALUE;
        this.f8716o = null;
        this.f8717p = null;
        this.f8704a = hVar;
        this.f8705b = obj;
        this.f8706c = obj2;
        this.f8707d = null;
        this.f8708e = interpolator;
        this.f8709f = interpolator2;
        this.f8710g = f10;
        this.f8711h = null;
    }

    public a(h hVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f8712i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f8713l = 784923401;
        this.f8714m = Float.MIN_VALUE;
        this.f8715n = Float.MIN_VALUE;
        this.f8716o = null;
        this.f8717p = null;
        this.f8704a = hVar;
        this.f8705b = obj;
        this.f8706c = obj2;
        this.f8707d = interpolator;
        this.f8708e = interpolator2;
        this.f8709f = interpolator3;
        this.f8710g = f10;
        this.f8711h = f11;
    }

    public a(Object obj) {
        this.f8712i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f8713l = 784923401;
        this.f8714m = Float.MIN_VALUE;
        this.f8715n = Float.MIN_VALUE;
        this.f8716o = null;
        this.f8717p = null;
        this.f8704a = null;
        this.f8705b = obj;
        this.f8706c = obj;
        this.f8707d = null;
        this.f8708e = null;
        this.f8709f = null;
        this.f8710g = Float.MIN_VALUE;
        this.f8711h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(c cVar, c cVar2) {
        this.f8712i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f8713l = 784923401;
        this.f8714m = Float.MIN_VALUE;
        this.f8715n = Float.MIN_VALUE;
        this.f8716o = null;
        this.f8717p = null;
        this.f8704a = null;
        this.f8705b = cVar;
        this.f8706c = cVar2;
        this.f8707d = null;
        this.f8708e = null;
        this.f8709f = null;
        this.f8710g = Float.MIN_VALUE;
        this.f8711h = Float.valueOf(Float.MAX_VALUE);
    }
}
