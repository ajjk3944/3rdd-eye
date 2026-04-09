package x8;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f25068a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f25069b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f25070c;

    public a() {
        this.f25068a = new PointF();
        this.f25069b = new PointF();
        this.f25070c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f25070c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f25068a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f25069b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f25068a = pointF;
        this.f25069b = pointF2;
        this.f25070c = pointF3;
    }
}
