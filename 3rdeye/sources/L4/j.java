package l4;

import T1.B;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import l4.C5287f;

/* compiled from: ShapeAppearancePathProvider.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final l[] f43822a = new l[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f43823b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f43824c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f43825d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f43826e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f43827f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final l f43828g = new l();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f43829h = new float[2];
    public final float[] i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f43830j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f43831k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f43832l = true;

    /* compiled from: ShapeAppearancePathProvider.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f43833a = new j();
    }

    public j() {
        for (int i = 0; i < 4; i++) {
            this.f43822a[i] = new l();
            this.f43823b[i] = new Matrix();
            this.f43824c[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public final void a(C5290i c5290i, float f10, RectF rectF, C5287f.a aVar, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        l[] lVarArr;
        int i;
        boolean z10;
        float[] fArr;
        float f11;
        boolean z11;
        int i10;
        j jVar = this;
        path.rewind();
        Path path2 = jVar.f43826e;
        path2.rewind();
        Path path3 = jVar.f43827f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            matrixArr = jVar.f43824c;
            matrixArr2 = jVar.f43823b;
            lVarArr = jVar.f43822a;
            i = 4;
            z10 = 0;
            fArr = jVar.f43829h;
            if (i11 >= 4) {
                break;
            }
            InterfaceC5284c interfaceC5284c = i11 != 1 ? i11 != 2 ? i11 != 3 ? c5290i.f43805f : c5290i.f43804e : c5290i.f43807h : c5290i.f43806g;
            B b10 = i11 != 1 ? i11 != 2 ? i11 != 3 ? c5290i.f43801b : c5290i.f43800a : c5290i.f43803d : c5290i.f43802c;
            l lVar = lVarArr[i11];
            b10.getClass();
            b10.i(lVar, f10, interfaceC5284c.a(rectF));
            int i12 = i11 + 1;
            float f12 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = jVar.f43825d;
            if (i11 == 1) {
                i10 = i11;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i11 == 2) {
                i10 = i11;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i11 != 3) {
                i10 = i11;
                pointF.set(rectF.right, rectF.top);
            } else {
                i10 = i11;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i10].setTranslate(pointF.x, pointF.y);
            matrixArr2[i10].preRotate(f12);
            l lVar2 = lVarArr[i10];
            fArr[0] = lVar2.f43837b;
            fArr[1] = lVar2.f43838c;
            matrixArr2[i10].mapPoints(fArr);
            matrixArr[i10].reset();
            matrixArr[i10].setTranslate(fArr[0], fArr[1]);
            matrixArr[i10].preRotate(f12);
            i11 = i12;
        }
        int i13 = 0;
        while (i13 < i) {
            l lVar3 = lVarArr[i13];
            lVar3.getClass();
            fArr[z10] = 0.0f;
            fArr[1] = lVar3.f43836a;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path.moveTo(fArr[z10], fArr[1]);
            } else {
                path.lineTo(fArr[z10], fArr[1]);
            }
            lVarArr[i13].b(matrixArr2[i13], path);
            if (aVar != null) {
                l lVar4 = lVarArr[i13];
                Matrix matrix = matrixArr2[i13];
                C5287f c5287f = C5287f.this;
                BitSet bitSet = c5287f.f43762e;
                lVar4.getClass();
                f11 = 0.0f;
                bitSet.set(i13, z10);
                lVar4.a(lVar4.f43840e);
                c5287f.f43760c[i13] = new k(new ArrayList(lVar4.f43842g), new Matrix(matrix));
            } else {
                f11 = 0.0f;
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            l lVar5 = lVarArr[i13];
            fArr[0] = lVar5.f43837b;
            fArr[1] = lVar5.f43838c;
            matrixArr2[i13].mapPoints(fArr);
            l lVar6 = lVarArr[i15];
            lVar6.getClass();
            float[] fArr2 = jVar.i;
            fArr2[0] = f11;
            fArr2[1] = lVar6.f43836a;
            matrixArr2[i15].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr2;
            l[] lVarArr2 = lVarArr;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f11);
            l lVar7 = lVarArr2[i13];
            fArr[0] = lVar7.f43837b;
            fArr[1] = lVar7.f43838c;
            matrixArr3[i13].mapPoints(fArr);
            if (i13 == 1 || i13 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            l lVar8 = jVar.f43828g;
            lVar8.d(0.0f, 270.0f, 0.0f);
            (i13 != 1 ? i13 != 2 ? i13 != 3 ? c5290i.f43808j : c5290i.i : c5290i.f43810l : c5290i.f43809k).getClass();
            lVar8.c(fMax, 0.0f);
            Path path4 = jVar.f43830j;
            path4.reset();
            lVar8.b(matrixArr[i13], path4);
            if (jVar.f43832l && (jVar.b(path4, i13) || jVar.b(path4, i15))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = lVar8.f43836a;
                matrixArr[i13].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                lVar8.b(matrixArr[i13], path2);
            } else {
                lVar8.b(matrixArr[i13], path);
            }
            if (aVar != null) {
                Matrix matrix2 = matrixArr[i13];
                C5287f c5287f2 = C5287f.this;
                z11 = false;
                c5287f2.f43762e.set(i13 + 4, false);
                lVar8.a(lVar8.f43840e);
                c5287f2.f43761d[i13] = new k(new ArrayList(lVar8.f43842g), new Matrix(matrix2));
            } else {
                z11 = false;
            }
            z10 = z11;
            i13 = i14;
            lVarArr = lVarArr2;
            matrixArr2 = matrixArr3;
            i = 4;
            jVar = this;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.f43831k;
        path2.reset();
        this.f43822a[i].b(this.f43823b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
