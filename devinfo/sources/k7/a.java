package k7;

import android.graphics.PointF;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f28038a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f28039b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f28040c;

    public a() {
        this.f28038a = new PointF();
        this.f28039b = new PointF();
        this.f28040c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f28040c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f28038a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f28039b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f28038a = pointF;
        this.f28039b = pointF2;
        this.f28040c = pointF3;
    }
}
