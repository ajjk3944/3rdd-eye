package n2;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* compiled from: CubicCurveData.java */
/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5347a {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f44245a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f44246b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f44247c;

    public C5347a() {
        this.f44245a = new PointF();
        this.f44246b = new PointF();
        this.f44247c = new PointF();
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        PointF pointF = this.f44247c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f44245a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f44246b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public C5347a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f44245a = pointF;
        this.f44246b = pointF2;
        this.f44247c = pointF3;
    }
}
