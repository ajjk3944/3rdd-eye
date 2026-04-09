package l2;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;
import v2.C5673a;

/* compiled from: PathKeyframeAnimation.java */
/* renamed from: l2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5277j extends AbstractC5274g<PointF> {
    public final PointF i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f43718j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f43719k;

    /* renamed from: l, reason: collision with root package name */
    public final PathMeasure f43720l;

    /* renamed from: m, reason: collision with root package name */
    public C5276i f43721m;

    public C5277j(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.f43718j = new float[2];
        this.f43719k = new float[2];
        this.f43720l = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l2.AbstractC5268a
    public final Object g(C5673a c5673a, float f10) {
        float f11;
        C5276i c5276i = (C5276i) c5673a;
        Path path = c5276i.f43716q;
        if (path == null) {
            return (PointF) c5673a.f47012b;
        }
        B0.f fVar = this.f43690e;
        if (fVar != null) {
            f11 = f10;
            PointF pointF = (PointF) fVar.e(c5276i.f47017g, c5276i.f47018h.floatValue(), (PointF) c5276i.f47012b, (PointF) c5276i.f47013c, e(), f11, this.f43689d);
            if (pointF != null) {
                return pointF;
            }
        } else {
            f11 = f10;
        }
        C5276i c5276i2 = this.f43721m;
        PathMeasure pathMeasure = this.f43720l;
        if (c5276i2 != c5276i) {
            pathMeasure.setPath(path, false);
            this.f43721m = c5276i;
        }
        float length = pathMeasure.getLength();
        float f12 = f11 * length;
        float[] fArr = this.f43718j;
        float[] fArr2 = this.f43719k;
        pathMeasure.getPosTan(f12, fArr, fArr2);
        PointF pointF2 = this.i;
        pointF2.set(fArr[0], fArr[1]);
        if (f12 < 0.0f) {
            pointF2.offset(fArr2[0] * f12, fArr2[1] * f12);
            return pointF2;
        }
        if (f12 > length) {
            float f13 = f12 - length;
            pointF2.offset(fArr2[0] * f13, fArr2[1] * f13);
        }
        return pointF2;
    }
}
