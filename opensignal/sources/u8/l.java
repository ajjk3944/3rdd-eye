package u8;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends j {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f23468i;
    public final float[] j;
    public final float[] k;

    /* renamed from: l, reason: collision with root package name */
    public final PathMeasure f23469l;

    /* renamed from: m, reason: collision with root package name */
    public k f23470m;

    public l(ArrayList arrayList) {
        super(arrayList);
        this.f23468i = new PointF();
        this.j = new float[2];
        this.k = new float[2];
        this.f23469l = new PathMeasure();
    }

    @Override // u8.d
    public final Object g(f9.a aVar, float f10) {
        float f11;
        k kVar = (k) aVar;
        Path path = kVar.f23466q;
        bm.e eVar = this.f23451e;
        if (eVar == null || aVar.f8711h == null) {
            f11 = f10;
        } else {
            f11 = f10;
            PointF pointF = (PointF) eVar.B(kVar.f8710g, kVar.f8711h.floatValue(), (PointF) kVar.f8705b, (PointF) kVar.f8706c, e(), f11, this.f23450d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) aVar.f8705b;
        }
        k kVar2 = this.f23470m;
        PathMeasure pathMeasure = this.f23469l;
        if (kVar2 != kVar) {
            pathMeasure.setPath(path, false);
            this.f23470m = kVar;
        }
        float length = pathMeasure.getLength();
        float f12 = f11 * length;
        float[] fArr = this.j;
        float[] fArr2 = this.k;
        pathMeasure.getPosTan(f12, fArr, fArr2);
        float f13 = fArr[0];
        float f14 = fArr[1];
        PointF pointF2 = this.f23468i;
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
