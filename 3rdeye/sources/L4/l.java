package l4;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import k4.C5216a;

/* compiled from: ShapePath.java */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f43836a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f43837b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f43838c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f43839d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f43840e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f43841f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f43842g = new ArrayList();

    /* compiled from: ShapePath.java */
    public static class a extends f {

        /* renamed from: c, reason: collision with root package name */
        public final c f43843c;

        public a(c cVar) {
            this.f43843c = cVar;
        }

        @Override // l4.l.f
        public final void a(Matrix matrix, C5216a c5216a, int i, Canvas canvas) {
            c cVar = this.f43843c;
            float f10 = cVar.f43852f;
            float f11 = cVar.f43853g;
            RectF rectF = new RectF(cVar.f43848b, cVar.f43849c, cVar.f43850d, cVar.f43851e);
            c5216a.getClass();
            boolean z10 = f11 < 0.0f;
            Path path = c5216a.f43386g;
            int[] iArr = C5216a.f43378k;
            if (z10) {
                iArr[0] = 0;
                iArr[1] = c5216a.f43385f;
                iArr[2] = c5216a.f43384e;
                iArr[3] = c5216a.f43383d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f10, f11);
                path.close();
                float f12 = -i;
                rectF.inset(f12, f12);
                iArr[0] = 0;
                iArr[1] = c5216a.f43383d;
                iArr[2] = c5216a.f43384e;
                iArr[3] = c5216a.f43385f;
            }
            float fWidth = rectF.width() / 2.0f;
            if (fWidth <= 0.0f) {
                return;
            }
            float f13 = 1.0f - (i / fWidth);
            float[] fArr = C5216a.f43379l;
            fArr[1] = f13;
            fArr[2] = ((1.0f - f13) / 2.0f) + f13;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = c5216a.f43381b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z10) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, c5216a.f43387h);
            }
            canvas.drawArc(rectF, f10, f11, true, paint);
            canvas.restore();
        }
    }

    /* compiled from: ShapePath.java */
    public static class b extends f {

        /* renamed from: c, reason: collision with root package name */
        public final d f43844c;

        /* renamed from: d, reason: collision with root package name */
        public final float f43845d;

        /* renamed from: e, reason: collision with root package name */
        public final float f43846e;

        public b(d dVar, float f10, float f11) {
            this.f43844c = dVar;
            this.f43845d = f10;
            this.f43846e = f11;
        }

        @Override // l4.l.f
        public final void a(Matrix matrix, C5216a c5216a, int i, Canvas canvas) {
            d dVar = this.f43844c;
            float f10 = dVar.f43855c;
            float f11 = this.f43846e;
            float f12 = dVar.f43854b;
            float f13 = this.f43845d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
            Matrix matrix2 = this.f43858a;
            matrix2.set(matrix);
            matrix2.preTranslate(f13, f11);
            matrix2.preRotate(b());
            c5216a.getClass();
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            int[] iArr = C5216a.i;
            iArr[0] = c5216a.f43385f;
            iArr[1] = c5216a.f43384e;
            iArr[2] = c5216a.f43383d;
            Paint paint = c5216a.f43382c;
            float f14 = rectF.left;
            paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, C5216a.f43377j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.f43844c;
            return (float) Math.toDegrees(Math.atan((dVar.f43855c - this.f43846e) / (dVar.f43854b - this.f43845d)));
        }
    }

    /* compiled from: ShapePath.java */
    public static class c extends e {

        /* renamed from: h, reason: collision with root package name */
        public static final RectF f43847h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public final float f43848b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public final float f43849c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public final float f43850d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public final float f43851e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f43852f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f43853g;

        public c(float f10, float f11, float f12, float f13) {
            this.f43848b = f10;
            this.f43849c = f11;
            this.f43850d = f12;
            this.f43851e = f13;
        }

        @Override // l4.l.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f43856a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f43847h;
            rectF.set(this.f43848b, this.f43849c, this.f43850d, this.f43851e);
            path.arcTo(rectF, this.f43852f, this.f43853g, false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    public static class d extends e {

        /* renamed from: b, reason: collision with root package name */
        public float f43854b;

        /* renamed from: c, reason: collision with root package name */
        public float f43855c;

        @Override // l4.l.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f43856a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f43854b, this.f43855c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f43856a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath.java */
    public static abstract class f {

        /* renamed from: b, reason: collision with root package name */
        public static final Matrix f43857b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f43858a = new Matrix();

        public abstract void a(Matrix matrix, C5216a c5216a, int i, Canvas canvas);
    }

    public l() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10) {
        float f11 = this.f43839d;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f43837b;
        float f14 = this.f43838c;
        c cVar = new c(f13, f14, f13, f14);
        cVar.f43852f = this.f43839d;
        cVar.f43853g = f12;
        this.f43842g.add(new a(cVar));
        this.f43839d = f10;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f43841f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((e) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f10, float f11) {
        d dVar = new d();
        dVar.f43854b = f10;
        dVar.f43855c = f11;
        this.f43841f.add(dVar);
        b bVar = new b(dVar, this.f43837b, this.f43838c);
        float fB = bVar.b() + 270.0f;
        float fB2 = bVar.b() + 270.0f;
        a(fB);
        this.f43842g.add(bVar);
        this.f43839d = fB2;
        this.f43837b = f10;
        this.f43838c = f11;
    }

    public final void d(float f10, float f11, float f12) {
        this.f43836a = f10;
        this.f43837b = 0.0f;
        this.f43838c = f10;
        this.f43839d = f11;
        this.f43840e = (f11 + f12) % 360.0f;
        this.f43841f.clear();
        this.f43842g.clear();
    }
}
