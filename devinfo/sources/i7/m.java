package i7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m extends k {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f25891i;
    public final float[] j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f25892k;

    /* renamed from: l, reason: collision with root package name */
    public final PathMeasure f25893l;

    /* renamed from: m, reason: collision with root package name */
    public l f25894m;

    public m(ArrayList arrayList) {
        super(arrayList);
        this.f25891i = new PointF();
        this.j = new float[2];
        this.f25892k = new float[2];
        this.f25893l = new PathMeasure();
    }

    @Override // i7.e
    public final Object f(s7.a aVar, float f10) {
        float f11;
        l lVar = (l) aVar;
        Path path = lVar.f25889q;
        km.o oVar = this.f25876e;
        if (oVar == null || aVar.f33489h == null) {
            f11 = f10;
        } else {
            f11 = f10;
            PointF pointF = (PointF) oVar.l(lVar.g, lVar.f33489h.floatValue(), (PointF) lVar.f33484b, (PointF) lVar.f33485c, d(), f11, this.f25875d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) aVar.f33484b;
        }
        l lVar2 = this.f25894m;
        PathMeasure pathMeasure = this.f25893l;
        if (lVar2 != lVar) {
            pathMeasure.setPath(path, false);
            this.f25894m = lVar;
        }
        float length = pathMeasure.getLength();
        float f12 = f11 * length;
        float[] fArr = this.j;
        float[] fArr2 = this.f25892k;
        pathMeasure.getPosTan(f12, fArr, fArr2);
        float f13 = fArr[0];
        float f14 = fArr[1];
        PointF pointF2 = this.f25891i;
        pointF2.set(f13, f14);
        if (f12 < 0.0f) {
            pointF2.offset(fArr2[0] * f12, fArr2[1] * f12);
            return pointF2;
        }
        if (f12 > length) {
            float f15 = f12 - length;
            pointF2.offset(fArr2[0] * f15, fArr2[1] * f15);
        }
        return pointF2;
    }
}
