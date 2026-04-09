package i7;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l extends s7.a {

    /* renamed from: q, reason: collision with root package name */
    public Path f25889q;

    /* renamed from: r, reason: collision with root package name */
    public final s7.a f25890r;

    public l(f7.j jVar, s7.a aVar) {
        super(jVar, (PointF) aVar.f33484b, (PointF) aVar.f33485c, aVar.f33486d, aVar.f33487e, aVar.f33488f, aVar.g, aVar.f33489h);
        this.f25890r = aVar;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.f33485c;
        Object obj3 = this.f33484b;
        boolean z3 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f33485c) == null || z3) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        s7.a aVar = this.f25890r;
        PointF pointF3 = aVar.f33495o;
        PointF pointF4 = aVar.f33496p;
        Matrix matrix = r7.j.f32892a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f10 = pointF3.x + pointF.x;
            float f11 = pointF.y + pointF3.y;
            float f12 = pointF2.x;
            float f13 = f12 + pointF4.x;
            float f14 = pointF2.y;
            path.cubicTo(f10, f11, f13, f14 + pointF4.y, f12, f14);
        }
        this.f25889q = path;
    }
}
