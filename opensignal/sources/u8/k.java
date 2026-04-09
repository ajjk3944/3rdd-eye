package u8;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class k extends f9.a {

    /* renamed from: q, reason: collision with root package name */
    public Path f23466q;

    /* renamed from: r, reason: collision with root package name */
    public final f9.a f23467r;

    public k(r8.h hVar, f9.a aVar) {
        super(hVar, (PointF) aVar.f8705b, (PointF) aVar.f8706c, aVar.f8707d, aVar.f8708e, aVar.f8709f, aVar.f8710g, aVar.f8711h);
        this.f23467r = aVar;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.f8706c;
        Object obj3 = this.f8705b;
        boolean z10 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f8706c) == null || z10) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        f9.a aVar = this.f23467r;
        PointF pointF3 = aVar.f8716o;
        PointF pointF4 = aVar.f8717p;
        Matrix matrix = e9.j.f8019a;
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
        this.f23466q = path;
    }
}
