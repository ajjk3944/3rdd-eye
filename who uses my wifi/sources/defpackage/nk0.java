package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nk0 extends x40 {
    public final PointF i;
    public final float[] j;
    public final float[] k;
    public final PathMeasure l;
    public mk0 m;

    public nk0(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new float[2];
        this.l = new PathMeasure();
    }

    @Override // defpackage.ba
    public final Object f(w40 w40Var, float f) {
        float f2;
        mk0 mk0Var = (mk0) w40Var;
        Path path = mk0Var.q;
        vq2 vq2Var = this.e;
        if (vq2Var == null || w40Var.h == null) {
            f2 = f;
        } else {
            f2 = f;
            PointF pointF = (PointF) vq2Var.j(mk0Var.g, mk0Var.h.floatValue(), (PointF) mk0Var.b, (PointF) mk0Var.c, d(), f2, this.d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) w40Var.b;
        }
        mk0 mk0Var2 = this.m;
        PathMeasure pathMeasure = this.l;
        if (mk0Var2 != mk0Var) {
            pathMeasure.setPath(path, false);
            this.m = mk0Var;
        }
        float length = pathMeasure.getLength();
        float f3 = f2 * length;
        float[] fArr = this.j;
        float[] fArr2 = this.k;
        pathMeasure.getPosTan(f3, fArr, fArr2);
        float f4 = fArr[0];
        float f5 = fArr[1];
        PointF pointF2 = this.i;
        pointF2.set(f4, f5);
        if (f3 < 0.0f) {
            pointF2.offset(fArr2[0] * f3, fArr2[1] * f3);
            return pointF2;
        }
        if (f3 > length) {
            float f6 = f3 - length;
            pointF2.offset(fArr2[0] * f6, fArr2[1] * f6);
        }
        return pointF2;
    }
}
