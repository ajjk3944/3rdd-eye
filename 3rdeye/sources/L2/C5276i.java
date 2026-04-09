package l2;

import android.graphics.Path;
import android.graphics.PointF;
import i2.C4448h;
import u2.C5629h;
import v2.C5673a;

/* compiled from: PathKeyframe.java */
/* renamed from: l2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5276i extends C5673a<PointF> {

    /* renamed from: q, reason: collision with root package name */
    public Path f43716q;

    /* renamed from: r, reason: collision with root package name */
    public final C5673a<PointF> f43717r;

    public C5276i(C4448h c4448h, C5673a<PointF> c5673a) {
        super(c4448h, c5673a.f47012b, c5673a.f47013c, c5673a.f47014d, c5673a.f47015e, c5673a.f47016f, c5673a.f47017g, c5673a.f47018h);
        this.f43717r = c5673a;
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        T t10;
        T t11 = this.f47013c;
        T t12 = this.f47012b;
        boolean z10 = (t11 == 0 || t12 == 0 || !((PointF) t12).equals(((PointF) t11).x, ((PointF) t11).y)) ? false : true;
        if (t12 == 0 || (t10 = this.f47013c) == 0 || z10) {
            return;
        }
        PointF pointF = (PointF) t12;
        PointF pointF2 = (PointF) t10;
        C5673a<PointF> c5673a = this.f43717r;
        PointF pointF3 = c5673a.f47024o;
        PointF pointF4 = c5673a.f47025p;
        C5629h.a aVar = C5629h.f46557a;
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
        this.f43716q = path;
    }
}
