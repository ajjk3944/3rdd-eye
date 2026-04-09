package com.google.android.material.shape;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.material.shape.a;
import com.google.android.material.shape.b;
import com.google.android.material.shape.c;
import d1.l;
import g5.i;
import g5.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class MaterialShapeDrawable extends Drawable implements k {
    public static final String F = "MaterialShapeDrawable";
    public static final com.google.android.material.shape.a G = com.google.android.material.shape.a.a().q(0, 0.0f).m();
    public static final Paint H;
    public static final e[] I;
    public l A;
    public d1.k[] B;
    public float[] C;
    public float[] D;
    public d E;

    /* renamed from: a, reason: collision with root package name */
    public final a.c f10920a;

    /* renamed from: b, reason: collision with root package name */
    public c f10921b;

    /* renamed from: c, reason: collision with root package name */
    public final c.g[] f10922c;

    /* renamed from: d, reason: collision with root package name */
    public final c.g[] f10923d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f10924e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10925f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10926g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f10927h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f10928i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f10929j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f10930k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f10931l;

    /* renamed from: m, reason: collision with root package name */
    public final Region f10932m;

    /* renamed from: n, reason: collision with root package name */
    public final Region f10933n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f10934o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f10935p;

    /* renamed from: q, reason: collision with root package name */
    public final f5.a f10936q;

    /* renamed from: r, reason: collision with root package name */
    public final b.InterfaceC0211b f10937r;

    /* renamed from: s, reason: collision with root package name */
    public final com.google.android.material.shape.b f10938s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f10939t;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuffColorFilter f10940u;

    /* renamed from: v, reason: collision with root package name */
    public int f10941v;

    /* renamed from: w, reason: collision with root package name */
    public final RectF f10942w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10943x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10944y;

    /* renamed from: z, reason: collision with root package name */
    public com.google.android.material.shape.a f10945z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    public class a implements a.c {
        public a() {
        }

        @Override // com.google.android.material.shape.a.c
        public g5.d a(g5.d dVar) {
            return dVar instanceof i ? dVar : new g5.b(-MaterialShapeDrawable.this.M(), dVar);
        }
    }

    public class b implements b.InterfaceC0211b {
        public b() {
        }

        @Override // com.google.android.material.shape.b.InterfaceC0211b
        public void a(com.google.android.material.shape.c cVar, Matrix matrix, int i10) {
            MaterialShapeDrawable.this.f10924e.set(i10, cVar.e());
            MaterialShapeDrawable.this.f10922c[i10] = cVar.f(matrix);
        }

        @Override // com.google.android.material.shape.b.InterfaceC0211b
        public void b(com.google.android.material.shape.c cVar, Matrix matrix, int i10) {
            MaterialShapeDrawable.this.f10924e.set(i10 + 4, cVar.e());
            MaterialShapeDrawable.this.f10923d[i10] = cVar.f(matrix);
        }
    }

    public interface d {
        void a(float f10);
    }

    public static class e extends d1.i {

        /* renamed from: b, reason: collision with root package name */
        public final int f10971b;

        public e(int i10) {
            super("cornerSizeAtIndex" + i10);
            this.f10971b = i10;
        }

        @Override // d1.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(MaterialShapeDrawable materialShapeDrawable) {
            if (materialShapeDrawable.C != null) {
                return materialShapeDrawable.C[this.f10971b];
            }
            return 0.0f;
        }

        @Override // d1.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MaterialShapeDrawable materialShapeDrawable, float f10) {
            if (materialShapeDrawable.C == null || materialShapeDrawable.C[this.f10971b] == f10) {
                return;
            }
            materialShapeDrawable.C[this.f10971b] = f10;
            if (materialShapeDrawable.E != null) {
                materialShapeDrawable.E.a(materialShapeDrawable.B());
            }
            materialShapeDrawable.invalidateSelf();
        }
    }

    static {
        int i10 = 0;
        Paint paint = new Paint(1);
        H = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        I = new e[4];
        while (true) {
            e[] eVarArr = I;
            if (i10 >= eVarArr.length) {
                return;
            }
            eVarArr[i10] = new e(i10);
            i10++;
        }
    }

    public MaterialShapeDrawable() {
        this(new com.google.android.material.shape.a());
    }

    public static int b0(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    public static MaterialShapeDrawable r(Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(u4.a.c(context, j4.b.colorSurface, MaterialShapeDrawable.class.getSimpleName()));
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.W(context);
        materialShapeDrawable.i0(colorStateList);
        materialShapeDrawable.h0(f10);
        return materialShapeDrawable;
    }

    public final RectF A() {
        this.f10931l.set(z());
        float fM = M();
        this.f10931l.inset(fM, fM);
        return this.f10931l;
    }

    public final boolean A0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f10939t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f10940u;
        c cVar = this.f10921b;
        this.f10939t = p(cVar.f10955h, cVar.f10956i, this.f10934o, true);
        c cVar2 = this.f10921b;
        this.f10940u = p(cVar2.f10954g, cVar2.f10956i, this.f10935p, false);
        c cVar3 = this.f10921b;
        if (cVar3.f10969v) {
            this.f10936q.d(cVar3.f10955h.getColorForState(getState(), 0));
        }
        return (r0.d.a(porterDuffColorFilter, this.f10939t) && r0.d.a(porterDuffColorFilter2, this.f10940u)) ? false : true;
    }

    public float B() {
        float fA;
        float fA2;
        float[] fArr = this.C;
        if (fArr != null) {
            fA = (fArr[3] + fArr[2]) - fArr[1];
            fA2 = fArr[0];
        } else {
            RectF rectFZ = z();
            fA = (this.f10938s.h(3, K()).a(rectFZ) + this.f10938s.h(2, K()).a(rectFZ)) - this.f10938s.h(1, K()).a(rectFZ);
            fA2 = this.f10938s.h(0, K()).a(rectFZ);
        }
        return (fA - fA2) / 2.0f;
    }

    public final void B0() {
        float fS = S();
        this.f10921b.f10966s = (int) Math.ceil(0.75f * fS);
        this.f10921b.f10967t = (int) Math.ceil(fS * 0.25f);
        A0();
        X();
    }

    public float C() {
        return this.f10921b.f10963p;
    }

    public ColorStateList D() {
        return this.f10921b.f10952e;
    }

    public float E() {
        return this.f10921b.f10959l;
    }

    public float F() {
        return this.f10921b.f10962o;
    }

    public int G() {
        return this.f10941v;
    }

    public int H() {
        c cVar = this.f10921b;
        return (int) (cVar.f10967t * Math.sin(Math.toRadians(cVar.f10968u)));
    }

    public int I() {
        c cVar = this.f10921b;
        return (int) (cVar.f10967t * Math.cos(Math.toRadians(cVar.f10968u)));
    }

    public int J() {
        return this.f10921b.f10966s;
    }

    public com.google.android.material.shape.a K() {
        return this.f10921b.f10948a;
    }

    public ColorStateList L() {
        return this.f10921b.f10953f;
    }

    public final float M() {
        if (V()) {
            return this.f10935p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float N() {
        return this.f10921b.f10960m;
    }

    public ColorStateList O() {
        return this.f10921b.f10955h;
    }

    public float P() {
        float[] fArr = this.C;
        return fArr != null ? fArr[3] : this.f10921b.f10948a.r().a(z());
    }

    public float Q() {
        float[] fArr = this.C;
        return fArr != null ? fArr[0] : this.f10921b.f10948a.t().a(z());
    }

    public float R() {
        return this.f10921b.f10964q;
    }

    public float S() {
        return C() + R();
    }

    public final boolean T() {
        c cVar = this.f10921b;
        int i10 = cVar.f10965r;
        if (i10 == 1 || cVar.f10966s <= 0) {
            return false;
        }
        return i10 == 2 || d0();
    }

    public final boolean U() {
        Paint.Style style = this.f10921b.f10970w;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean V() {
        Paint.Style style = this.f10921b.f10970w;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f10935p.getStrokeWidth() > 0.0f;
    }

    public void W(Context context) {
        this.f10921b.f10950c = new x4.a(context);
        B0();
    }

    public final void X() {
        super.invalidateSelf();
    }

    public boolean Y() {
        x4.a aVar = this.f10921b.f10950c;
        return aVar != null && aVar.d();
    }

    public boolean Z() {
        if (this.f10921b.f10948a.v(z())) {
            return true;
        }
        float[] fArr = this.C;
        return fArr != null && a5.a.a(fArr) && this.f10921b.f10948a.u();
    }

    public final void a0(Canvas canvas) {
        if (T()) {
            canvas.save();
            c0(canvas);
            if (!this.f10943x) {
                s(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f10942w.width() - getBounds().width());
            int iHeight = (int) (this.f10942w.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f10942w.width()) + (this.f10921b.f10966s * 2) + iWidth, ((int) this.f10942w.height()) + (this.f10921b.f10966s * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f10921b.f10966s) - iWidth;
            float f11 = (getBounds().top - this.f10921b.f10966s) - iHeight;
            canvas2.translate(-f10, -f11);
            s(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    public final void c0(Canvas canvas) {
        canvas.translate(H(), I());
    }

    public boolean d0() {
        return (Z() || this.f10928i.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f10934o.setColorFilter(this.f10939t);
        int alpha = this.f10934o.getAlpha();
        this.f10934o.setAlpha(b0(alpha, this.f10921b.f10961n));
        this.f10935p.setColorFilter(this.f10940u);
        this.f10935p.setStrokeWidth(this.f10921b.f10960m);
        int alpha2 = this.f10935p.getAlpha();
        this.f10935p.setAlpha(b0(alpha2, this.f10921b.f10961n));
        if (U()) {
            if (this.f10925f) {
                k(z(), this.f10928i);
                this.f10925f = false;
            }
            a0(canvas);
            t(canvas);
        }
        if (V()) {
            if (this.f10926g) {
                n();
                this.f10926g = false;
            }
            w(canvas);
        }
        this.f10934o.setAlpha(alpha);
        this.f10935p.setAlpha(alpha2);
    }

    public void e0(float f10) {
        setShapeAppearanceModel(this.f10921b.f10948a.x(f10));
    }

    public void f0(g5.d dVar) {
        setShapeAppearanceModel(this.f10921b.f10948a.y(dVar));
    }

    public void g0(l lVar) {
        if (this.A == lVar) {
            return;
        }
        this.A = lVar;
        int i10 = 0;
        while (true) {
            d1.k[] kVarArr = this.B;
            if (i10 >= kVarArr.length) {
                y0(getState(), true);
                invalidateSelf();
                return;
            } else {
                if (kVarArr[i10] == null) {
                    kVarArr[i10] = new d1.k(this, I[i10]);
                }
                this.B[i10].p(new l().f(lVar.a()).h(lVar.c()));
                i10++;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f10921b.f10961n;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f10921b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f10921b.f10965r == 2) {
            return;
        }
        RectF rectFZ = z();
        if (rectFZ.isEmpty()) {
            return;
        }
        float fM = m(rectFZ, this.f10921b.f10948a, this.C);
        if (fM >= 0.0f) {
            outline.setRoundRect(getBounds(), fM * this.f10921b.f10959l);
            return;
        }
        if (this.f10925f) {
            k(rectFZ, this.f10928i);
            this.f10925f = false;
        }
        w4.d.j(outline, this.f10928i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f10921b.f10957j;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f10932m.set(getBounds());
        k(z(), this.f10928i);
        this.f10933n.setPath(this.f10928i, this.f10932m);
        this.f10932m.op(this.f10933n, Region.Op.DIFFERENCE);
        return this.f10932m;
    }

    public void h0(float f10) {
        c cVar = this.f10921b;
        if (cVar.f10963p != f10) {
            cVar.f10963p = f10;
            B0();
        }
    }

    public void i0(ColorStateList colorStateList) {
        c cVar = this.f10921b;
        if (cVar.f10952e != colorStateList) {
            cVar.f10952e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f10925f = true;
        this.f10926g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f10921b.f10955h;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f10921b.f10954g;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f10921b.f10953f;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f10921b.f10952e;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        com.google.android.material.shape.e eVar = this.f10921b.f10949b;
        return eVar != null && eVar.f();
    }

    public final PorterDuffColorFilter j(Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iQ = q(color);
        this.f10941v = iQ;
        if (iQ != color) {
            return new PorterDuffColorFilter(iQ, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public void j0(float f10) {
        c cVar = this.f10921b;
        if (cVar.f10959l != f10) {
            cVar.f10959l = f10;
            this.f10925f = true;
            this.f10926g = true;
            invalidateSelf();
        }
    }

    public final void k(RectF rectF, Path path) {
        l(rectF, path);
        if (this.f10921b.f10958k != 1.0f) {
            this.f10927h.reset();
            Matrix matrix = this.f10927h;
            float f10 = this.f10921b.f10958k;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f10927h);
        }
        path.computeBounds(this.f10942w, true);
    }

    public void k0(d dVar) {
        this.E = dVar;
    }

    public final void l(RectF rectF, Path path) {
        com.google.android.material.shape.b bVar = this.f10938s;
        c cVar = this.f10921b;
        bVar.f(cVar.f10948a, this.C, cVar.f10959l, rectF, this.f10937r, path);
    }

    public void l0(int i10, int i11, int i12, int i13) {
        c cVar = this.f10921b;
        if (cVar.f10957j == null) {
            cVar.f10957j = new Rect();
        }
        this.f10921b.f10957j.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public final float m(RectF rectF, com.google.android.material.shape.a aVar, float[] fArr) {
        if (fArr == null) {
            if (aVar.v(rectF)) {
                return aVar.r().a(rectF);
            }
            return -1.0f;
        }
        if (a5.a.a(fArr) && aVar.u()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public void m0(Paint.Style style) {
        this.f10921b.f10970w = style;
        X();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f10921b = new c(this.f10921b);
        return this;
    }

    public final void n() {
        z0();
        this.f10938s.f(this.f10945z, this.D, this.f10921b.f10959l, A(), null, this.f10929j);
    }

    public void n0(float f10) {
        c cVar = this.f10921b;
        if (cVar.f10962o != f10) {
            cVar.f10962o = f10;
            B0();
        }
    }

    public final PorterDuffColorFilter o(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = q(colorForState);
        }
        this.f10941v = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public void o0(boolean z10) {
        this.f10943x = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f10925f = true;
        this.f10926g = true;
        super.onBoundsChange(rect);
        if (this.f10921b.f10949b != null && !rect.isEmpty()) {
            y0(getState(), this.f10944y);
        }
        this.f10944y = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.y.b
    public boolean onStateChange(int[] iArr) {
        if (this.f10921b.f10949b != null) {
            x0(iArr);
        }
        boolean z10 = w0(iArr) || A0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public final PorterDuffColorFilter p(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? j(paint, z10) : o(colorStateList, mode, z10);
    }

    public void p0(int i10) {
        this.f10936q.d(i10);
        this.f10921b.f10969v = false;
        X();
    }

    public int q(int i10) {
        float fS = S() + F();
        x4.a aVar = this.f10921b.f10950c;
        return aVar != null ? aVar.c(i10, fS) : i10;
    }

    public void q0(int i10) {
        c cVar = this.f10921b;
        if (cVar.f10965r != i10) {
            cVar.f10965r = i10;
            X();
        }
    }

    public void r0(com.google.android.material.shape.e eVar) {
        c cVar = this.f10921b;
        if (cVar.f10949b != eVar) {
            cVar.f10949b = eVar;
            y0(getState(), true);
            invalidateSelf();
        }
    }

    public final void s(Canvas canvas) {
        if (this.f10924e.cardinality() > 0) {
            Log.w(F, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f10921b.f10967t != 0) {
            canvas.drawPath(this.f10928i, this.f10936q.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f10922c[i10].b(this.f10936q, this.f10921b.f10966s, canvas);
            this.f10923d[i10].b(this.f10936q, this.f10921b.f10966s, canvas);
        }
        if (this.f10943x) {
            int iH = H();
            int I2 = I();
            canvas.translate(-iH, -I2);
            canvas.drawPath(this.f10928i, H);
            canvas.translate(iH, I2);
        }
    }

    public void s0(float f10, int i10) {
        v0(f10);
        u0(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f10921b;
        if (cVar.f10961n != i10) {
            cVar.f10961n = i10;
            X();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f10921b.f10951d = colorFilter;
        X();
    }

    @Override // g5.k
    public void setShapeAppearanceModel(com.google.android.material.shape.a aVar) {
        c cVar = this.f10921b;
        cVar.f10948a = aVar;
        cVar.f10949b = null;
        this.C = null;
        this.D = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f10921b.f10955h = colorStateList;
        A0();
        X();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f10921b;
        if (cVar.f10956i != mode) {
            cVar.f10956i = mode;
            A0();
            X();
        }
    }

    public final void t(Canvas canvas) {
        v(canvas, this.f10934o, this.f10928i, this.f10921b.f10948a, this.C, z());
    }

    public void t0(float f10, ColorStateList colorStateList) {
        v0(f10);
        u0(colorStateList);
    }

    public void u(Canvas canvas, Paint paint, Path path, RectF rectF) {
        v(canvas, paint, path, this.f10921b.f10948a, this.C, rectF);
    }

    public void u0(ColorStateList colorStateList) {
        c cVar = this.f10921b;
        if (cVar.f10953f != colorStateList) {
            cVar.f10953f = colorStateList;
            onStateChange(getState());
        }
    }

    public final void v(Canvas canvas, Paint paint, Path path, com.google.android.material.shape.a aVar, float[] fArr, RectF rectF) {
        float fM = m(rectF, aVar, fArr);
        if (fM < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f10 = fM * this.f10921b.f10959l;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public void v0(float f10) {
        this.f10921b.f10960m = f10;
        invalidateSelf();
    }

    public void w(Canvas canvas) {
        v(canvas, this.f10935p, this.f10929j, this.f10945z, this.D, A());
    }

    public final boolean w0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f10921b.f10952e == null || color2 == (colorForState2 = this.f10921b.f10952e.getColorForState(iArr, (color2 = this.f10934o.getColor())))) {
            z10 = false;
        } else {
            this.f10934o.setColor(colorForState2);
            z10 = true;
        }
        if (this.f10921b.f10953f == null || color == (colorForState = this.f10921b.f10953f.getColorForState(iArr, (color = this.f10935p.getColor())))) {
            return z10;
        }
        this.f10935p.setColor(colorForState);
        return true;
    }

    public float x() {
        float[] fArr = this.C;
        return fArr != null ? fArr[2] : this.f10921b.f10948a.j().a(z());
    }

    public final void x0(int[] iArr) {
        y0(iArr, false);
    }

    public float y() {
        float[] fArr = this.C;
        return fArr != null ? fArr[1] : this.f10921b.f10948a.l().a(z());
    }

    public final void y0(int[] iArr, boolean z10) {
        RectF rectFZ = z();
        if (this.f10921b.f10949b == null || rectFZ.isEmpty()) {
            return;
        }
        boolean z11 = z10 | (this.A == null);
        if (this.C == null) {
            this.C = new float[4];
        }
        com.google.android.material.shape.a aVarD = this.f10921b.f10949b.d(iArr);
        for (int i10 = 0; i10 < 4; i10++) {
            float fA = this.f10938s.h(i10, aVarD).a(rectFZ);
            if (z11) {
                this.C[i10] = fA;
            }
            d1.k kVar = this.B[i10];
            if (kVar != null) {
                kVar.l(fA);
                if (z11) {
                    this.B[i10].q();
                }
            }
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public RectF z() {
        this.f10930k.set(getBounds());
        return this.f10930k;
    }

    public final void z0() {
        this.f10945z = K().z(this.f10920a);
        float[] fArr = this.C;
        if (fArr == null) {
            this.D = null;
            return;
        }
        if (this.D == null) {
            this.D = new float[fArr.length];
        }
        float fM = M();
        int i10 = 0;
        while (true) {
            float[] fArr2 = this.C;
            if (i10 >= fArr2.length) {
                return;
            }
            this.D[i10] = Math.max(0.0f, fArr2[i10] - fM);
            i10++;
        }
    }

    public MaterialShapeDrawable(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(com.google.android.material.shape.a.e(context, attributeSet, i10, i11).m());
    }

    public MaterialShapeDrawable(com.google.android.material.shape.a aVar) {
        this(new c(aVar, null));
    }

    public MaterialShapeDrawable(c cVar) {
        com.google.android.material.shape.b bVar;
        this.f10920a = new a();
        this.f10922c = new c.g[4];
        this.f10923d = new c.g[4];
        this.f10924e = new BitSet(8);
        this.f10927h = new Matrix();
        this.f10928i = new Path();
        this.f10929j = new Path();
        this.f10930k = new RectF();
        this.f10931l = new RectF();
        this.f10932m = new Region();
        this.f10933n = new Region();
        Paint paint = new Paint(1);
        this.f10934o = paint;
        Paint paint2 = new Paint(1);
        this.f10935p = paint2;
        this.f10936q = new f5.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            bVar = com.google.android.material.shape.b.l();
        } else {
            bVar = new com.google.android.material.shape.b();
        }
        this.f10938s = bVar;
        this.f10942w = new RectF();
        this.f10943x = true;
        this.f10944y = true;
        this.B = new d1.k[4];
        this.f10921b = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        A0();
        w0(getState());
        this.f10937r = new b();
    }

    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public com.google.android.material.shape.a f10948a;

        /* renamed from: b, reason: collision with root package name */
        public com.google.android.material.shape.e f10949b;

        /* renamed from: c, reason: collision with root package name */
        public x4.a f10950c;

        /* renamed from: d, reason: collision with root package name */
        public ColorFilter f10951d;

        /* renamed from: e, reason: collision with root package name */
        public ColorStateList f10952e;

        /* renamed from: f, reason: collision with root package name */
        public ColorStateList f10953f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f10954g;

        /* renamed from: h, reason: collision with root package name */
        public ColorStateList f10955h;

        /* renamed from: i, reason: collision with root package name */
        public PorterDuff.Mode f10956i;

        /* renamed from: j, reason: collision with root package name */
        public Rect f10957j;

        /* renamed from: k, reason: collision with root package name */
        public float f10958k;

        /* renamed from: l, reason: collision with root package name */
        public float f10959l;

        /* renamed from: m, reason: collision with root package name */
        public float f10960m;

        /* renamed from: n, reason: collision with root package name */
        public int f10961n;

        /* renamed from: o, reason: collision with root package name */
        public float f10962o;

        /* renamed from: p, reason: collision with root package name */
        public float f10963p;

        /* renamed from: q, reason: collision with root package name */
        public float f10964q;

        /* renamed from: r, reason: collision with root package name */
        public int f10965r;

        /* renamed from: s, reason: collision with root package name */
        public int f10966s;

        /* renamed from: t, reason: collision with root package name */
        public int f10967t;

        /* renamed from: u, reason: collision with root package name */
        public int f10968u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f10969v;

        /* renamed from: w, reason: collision with root package name */
        public Paint.Style f10970w;

        public c(com.google.android.material.shape.a aVar, x4.a aVar2) {
            this.f10952e = null;
            this.f10953f = null;
            this.f10954g = null;
            this.f10955h = null;
            this.f10956i = PorterDuff.Mode.SRC_IN;
            this.f10957j = null;
            this.f10958k = 1.0f;
            this.f10959l = 1.0f;
            this.f10961n = 255;
            this.f10962o = 0.0f;
            this.f10963p = 0.0f;
            this.f10964q = 0.0f;
            this.f10965r = 0;
            this.f10966s = 0;
            this.f10967t = 0;
            this.f10968u = 0;
            this.f10969v = false;
            this.f10970w = Paint.Style.FILL_AND_STROKE;
            this.f10948a = aVar;
            this.f10950c = aVar2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.f10925f = true;
            materialShapeDrawable.f10926g = true;
            return materialShapeDrawable;
        }

        public c(c cVar) {
            this.f10952e = null;
            this.f10953f = null;
            this.f10954g = null;
            this.f10955h = null;
            this.f10956i = PorterDuff.Mode.SRC_IN;
            this.f10957j = null;
            this.f10958k = 1.0f;
            this.f10959l = 1.0f;
            this.f10961n = 255;
            this.f10962o = 0.0f;
            this.f10963p = 0.0f;
            this.f10964q = 0.0f;
            this.f10965r = 0;
            this.f10966s = 0;
            this.f10967t = 0;
            this.f10968u = 0;
            this.f10969v = false;
            this.f10970w = Paint.Style.FILL_AND_STROKE;
            this.f10948a = cVar.f10948a;
            this.f10949b = cVar.f10949b;
            this.f10950c = cVar.f10950c;
            this.f10960m = cVar.f10960m;
            this.f10951d = cVar.f10951d;
            this.f10952e = cVar.f10952e;
            this.f10953f = cVar.f10953f;
            this.f10956i = cVar.f10956i;
            this.f10955h = cVar.f10955h;
            this.f10961n = cVar.f10961n;
            this.f10958k = cVar.f10958k;
            this.f10967t = cVar.f10967t;
            this.f10965r = cVar.f10965r;
            this.f10969v = cVar.f10969v;
            this.f10959l = cVar.f10959l;
            this.f10962o = cVar.f10962o;
            this.f10963p = cVar.f10963p;
            this.f10964q = cVar.f10964q;
            this.f10966s = cVar.f10966s;
            this.f10968u = cVar.f10968u;
            this.f10954g = cVar.f10954g;
            this.f10970w = cVar.f10970w;
            if (cVar.f10957j != null) {
                this.f10957j = new Rect(cVar.f10957j);
            }
        }
    }
}
