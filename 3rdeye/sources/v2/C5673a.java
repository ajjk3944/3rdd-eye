package v2;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import i2.C4448h;
import p2.C5443c;

/* compiled from: Keyframe.java */
/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5673a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final C4448h f47011a;

    /* renamed from: b, reason: collision with root package name */
    public final T f47012b;

    /* renamed from: c, reason: collision with root package name */
    public T f47013c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f47014d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f47015e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f47016f;

    /* renamed from: g, reason: collision with root package name */
    public final float f47017g;

    /* renamed from: h, reason: collision with root package name */
    public Float f47018h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f47019j;

    /* renamed from: k, reason: collision with root package name */
    public int f47020k;

    /* renamed from: l, reason: collision with root package name */
    public int f47021l;

    /* renamed from: m, reason: collision with root package name */
    public float f47022m;

    /* renamed from: n, reason: collision with root package name */
    public float f47023n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f47024o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f47025p;

    public C5673a(C4448h c4448h, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.i = -3987645.8f;
        this.f47019j = -3987645.8f;
        this.f47020k = 784923401;
        this.f47021l = 784923401;
        this.f47022m = Float.MIN_VALUE;
        this.f47023n = Float.MIN_VALUE;
        this.f47024o = null;
        this.f47025p = null;
        this.f47011a = c4448h;
        this.f47012b = t10;
        this.f47013c = t11;
        this.f47014d = interpolator;
        this.f47015e = null;
        this.f47016f = null;
        this.f47017g = f10;
        this.f47018h = f11;
    }

    public final float a() {
        C4448h c4448h = this.f47011a;
        if (c4448h == null) {
            return 1.0f;
        }
        if (this.f47023n == Float.MIN_VALUE) {
            if (this.f47018h == null) {
                this.f47023n = 1.0f;
            } else {
                this.f47023n = ((this.f47018h.floatValue() - this.f47017g) / (c4448h.f38356m - c4448h.f38355l)) + b();
            }
        }
        return this.f47023n;
    }

    public final float b() {
        C4448h c4448h = this.f47011a;
        if (c4448h == null) {
            return 0.0f;
        }
        if (this.f47022m == Float.MIN_VALUE) {
            float f10 = c4448h.f38355l;
            this.f47022m = (this.f47017g - f10) / (c4448h.f38356m - f10);
        }
        return this.f47022m;
    }

    public final boolean c() {
        return this.f47014d == null && this.f47015e == null && this.f47016f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f47012b + ", endValue=" + this.f47013c + ", startFrame=" + this.f47017g + ", endFrame=" + this.f47018h + ", interpolator=" + this.f47014d + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5673a(C4448h c4448h, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f10) {
        this.i = -3987645.8f;
        this.f47019j = -3987645.8f;
        this.f47020k = 784923401;
        this.f47021l = 784923401;
        this.f47022m = Float.MIN_VALUE;
        this.f47023n = Float.MIN_VALUE;
        this.f47024o = null;
        this.f47025p = null;
        this.f47011a = c4448h;
        this.f47012b = obj;
        this.f47013c = obj2;
        this.f47014d = null;
        this.f47015e = interpolator;
        this.f47016f = interpolator2;
        this.f47017g = f10;
        this.f47018h = null;
    }

    public C5673a(C4448h c4448h, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.i = -3987645.8f;
        this.f47019j = -3987645.8f;
        this.f47020k = 784923401;
        this.f47021l = 784923401;
        this.f47022m = Float.MIN_VALUE;
        this.f47023n = Float.MIN_VALUE;
        this.f47024o = null;
        this.f47025p = null;
        this.f47011a = c4448h;
        this.f47012b = t10;
        this.f47013c = t11;
        this.f47014d = interpolator;
        this.f47015e = interpolator2;
        this.f47016f = interpolator3;
        this.f47017g = f10;
        this.f47018h = f11;
    }

    public C5673a(T t10) {
        this.i = -3987645.8f;
        this.f47019j = -3987645.8f;
        this.f47020k = 784923401;
        this.f47021l = 784923401;
        this.f47022m = Float.MIN_VALUE;
        this.f47023n = Float.MIN_VALUE;
        this.f47024o = null;
        this.f47025p = null;
        this.f47011a = null;
        this.f47012b = t10;
        this.f47013c = t10;
        this.f47014d = null;
        this.f47015e = null;
        this.f47016f = null;
        this.f47017g = Float.MIN_VALUE;
        this.f47018h = Float.valueOf(Float.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5673a(C5443c c5443c, C5443c c5443c2) {
        this.i = -3987645.8f;
        this.f47019j = -3987645.8f;
        this.f47020k = 784923401;
        this.f47021l = 784923401;
        this.f47022m = Float.MIN_VALUE;
        this.f47023n = Float.MIN_VALUE;
        this.f47024o = null;
        this.f47025p = null;
        this.f47011a = null;
        this.f47012b = c5443c;
        this.f47013c = c5443c2;
        this.f47014d = null;
        this.f47015e = null;
        this.f47016f = null;
        this.f47017g = Float.MIN_VALUE;
        this.f47018h = Float.valueOf(Float.MAX_VALUE);
    }
}
