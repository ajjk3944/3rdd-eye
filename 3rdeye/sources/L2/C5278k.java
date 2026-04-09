package l2;

import android.graphics.PointF;
import java.util.List;
import v2.C5673a;

/* compiled from: PointKeyframeAnimation.java */
/* renamed from: l2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5278k extends AbstractC5274g<PointF> {
    public final PointF i;

    public C5278k(List<C5673a<PointF>> list) {
        super(list);
        this.i = new PointF();
    }

    @Override // l2.AbstractC5268a
    public final Object g(C5673a c5673a, float f10) {
        return h(c5673a, f10, f10, f10);
    }

    @Override // l2.AbstractC5268a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final PointF h(C5673a<PointF> c5673a, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2 = c5673a.f47012b;
        if (pointF2 == null || (pointF = c5673a.f47013c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        B0.f fVar = this.f43690e;
        if (fVar != null) {
            PointF pointF5 = (PointF) fVar.e(c5673a.f47017g, c5673a.f47018h.floatValue(), pointF3, pointF4, f10, e(), this.f43689d);
            if (pointF5 != null) {
                return pointF5;
            }
        }
        PointF pointF6 = this.i;
        float f13 = pointF3.x;
        float fE = com.google.android.gms.measurement.internal.a.e(pointF4.x, f13, f11, f13);
        float f14 = pointF3.y;
        pointF6.set(fE, com.google.android.gms.measurement.internal.a.e(pointF4.y, f14, f12, f14));
        return pointF6;
    }
}
