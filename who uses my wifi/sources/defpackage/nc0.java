package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
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
import android.util.StateSet;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class nc0 extends Drawable implements rv0 {
    public static final Paint K;
    public static final mc0[] L;
    public int A;
    public final RectF B;
    public boolean C;
    public boolean D;
    public su0 E;
    public ox0 F;
    public final nx0[] G;
    public float[] H;
    public float[] I;
    public dk J;
    public final sq0 f;
    public lc0 g;
    public final kv0[] h;
    public final kv0[] i;
    public final BitSet j;
    public boolean k;
    public boolean l;
    public final Matrix m;
    public final Path n;
    public final Path o;
    public final RectF p;
    public final RectF q;
    public final Region r;
    public final Region s;
    public final Paint t;
    public final Paint u;
    public final ru0 v;
    public final f20 w;
    public final uu0 x;
    public PorterDuffColorFilter y;
    public PorterDuffColorFilter z;

    static {
        Paint paint = new Paint(1);
        K = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        L = new mc0[4];
        int i = 0;
        while (true) {
            mc0[] mc0VarArr = L;
            if (i >= mc0VarArr.length) {
                return;
            }
            mc0VarArr[i] = new mc0(i);
            i++;
        }
    }

    public nc0() {
        this(new su0());
    }

    public static float b(RectF rectF, su0 su0Var, float[] fArr) {
        if (fArr == null) {
            if (su0Var.e(rectF)) {
                return su0Var.e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f) {
                    return -1.0f;
                }
            }
        }
        if (su0Var.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void a(RectF rectF, Path path) {
        lc0 lc0Var = this.g;
        this.x.a(lc0Var.a, this.H, lc0Var.j, rectF, this.w, path);
        if (this.g.i != 1.0f) {
            Matrix matrix = this.m;
            matrix.reset();
            float f = this.g.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.B, true);
    }

    public final int c(int i) {
        int i2;
        lc0 lc0Var = this.g;
        float f = lc0Var.n + 0.0f + lc0Var.m;
        jr jrVar = lc0Var.c;
        if (jrVar == null || !jrVar.a || hg.d(i, 255) != jrVar.d) {
            return i;
        }
        float fMin = (jrVar.e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iN = i41.n(fMin, hg.d(i, 255), jrVar.b);
        if (fMin > 0.0f && (i2 = jrVar.c) != 0) {
            iN = hg.b(hg.d(i2, jr.f), iN);
        }
        return hg.d(iN, iAlpha);
    }

    public final void d(Canvas canvas) {
        this.j.cardinality();
        int i = this.g.q;
        Path path = this.n;
        ru0 ru0Var = this.v;
        if (i != 0) {
            canvas.drawPath(path, (Paint) ru0Var.d);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            kv0 kv0Var = this.h[i2];
            int i3 = this.g.p;
            Matrix matrix = kv0.b;
            kv0Var.a(matrix, ru0Var, i3, canvas);
            this.i[i2].a(matrix, ru0Var, this.g.p, canvas);
        }
        if (this.C) {
            int iSin = (int) (Math.sin(Math.toRadians(0)) * this.g.q);
            int i4 = i();
            canvas.translate(-iSin, -i4);
            canvas.drawPath(path, K);
            canvas.translate(iSin, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.y;
        Paint paint2 = this.t;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.g.l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.z;
        Paint paint3 = this.u;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.g.k);
        int alpha2 = paint3.getAlpha();
        int i2 = this.g.l;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.g.r;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z = this.k;
            paint = paint2;
            Path path = this.n;
            if (z) {
                a(g(), path);
                this.k = false;
            }
            lc0 lc0Var = this.g;
            int i3 = lc0Var.o;
            if (i3 != 1 && lc0Var.p > 0 && (i3 == 2 || (!n() && !path.isConvex() && Build.VERSION.SDK_INT < 29))) {
                canvas.save();
                canvas.translate((int) (Math.sin(Math.toRadians(0)) * this.g.q), i());
                if (this.C) {
                    RectF rectF = this.B;
                    int iWidth = (int) (rectF.width() - getBounds().width());
                    int iHeight = (int) (rectF.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.g.p * 2) + ((int) rectF.width()) + iWidth, (this.g.p * 2) + ((int) rectF.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f = (getBounds().left - this.g.p) - iWidth;
                    float f2 = (getBounds().top - this.g.p) - iHeight;
                    canvas2.translate(-f, -f2);
                    d(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    d(canvas);
                    canvas.restore();
                }
            }
            e(canvas, paint, path, this.g.a, this.H, g());
        } else {
            paint = paint2;
        }
        if (l()) {
            if (this.l) {
                su0 su0Var = this.g.a;
                f2 f2VarF = su0Var.f();
                ck ckVar = su0Var.e;
                sq0 sq0Var = this.f;
                f2VarF.e = sq0Var.j(ckVar);
                f2VarF.f = sq0Var.j(su0Var.f);
                f2VarF.h = sq0Var.j(su0Var.h);
                f2VarF.g = sq0Var.j(su0Var.g);
                this.E = f2VarF.a();
                float[] fArr = this.H;
                if (fArr != null) {
                    if (this.I == null) {
                        this.I = new float[fArr.length];
                    }
                    float fJ = j();
                    int i4 = 0;
                    while (true) {
                        float[] fArr2 = this.H;
                        if (i4 >= fArr2.length) {
                            break;
                        }
                        this.I[i4] = Math.max(0.0f, fArr2[i4] - fJ);
                        i4++;
                    }
                } else {
                    this.I = null;
                }
                su0 su0Var2 = this.E;
                float[] fArr3 = this.I;
                float f3 = this.g.j;
                RectF rectFG = g();
                RectF rectF2 = this.q;
                rectF2.set(rectFG);
                float fJ2 = j();
                rectF2.inset(fJ2, fJ2);
                this.x.a(su0Var2, fArr3, f3, rectF2, null, this.o);
                this.l = false;
            }
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, su0 su0Var, float[] fArr, RectF rectF) {
        float fB = b(rectF, su0Var, fArr);
        if (fB < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fB * this.g.j;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public void f(Canvas canvas) {
        su0 su0Var = this.E;
        float[] fArr = this.I;
        RectF rectFG = g();
        RectF rectF = this.q;
        rectF.set(rectFG);
        float fJ = j();
        rectF.inset(fJ, fJ);
        e(canvas, this.u, this.o, su0Var, fArr, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.p;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.g.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.g.o == 2) {
            return;
        }
        RectF rectFG = g();
        if (rectFG.isEmpty()) {
            return;
        }
        float fB = b(rectFG, this.g.a, this.H);
        if (fB >= 0.0f) {
            outline.setRoundRect(getBounds(), fB * this.g.j);
            return;
        }
        boolean z = this.k;
        Path path = this.n;
        if (z) {
            a(rectFG, path);
            this.k = false;
        }
        qb1.q(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.g.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.r;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.n;
        a(rectFG, path);
        Region region2 = this.s;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        float[] fArr = this.H;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFG = g();
        su0 su0Var = this.g.a;
        uu0 uu0Var = this.x;
        uu0Var.getClass();
        float fA = su0Var.e.a(rectFG);
        su0 su0Var2 = this.g.a;
        uu0Var.getClass();
        float fA2 = su0Var2.h.a(rectFG) + fA;
        su0 su0Var3 = this.g.a;
        uu0Var.getClass();
        float fA3 = fA2 - su0Var3.g.a(rectFG);
        su0 su0Var4 = this.g.a;
        uu0Var.getClass();
        return (fA3 - su0Var4.f.a(rectFG)) / 2.0f;
    }

    public final int i() {
        return (int) (Math.cos(Math.toRadians(0)) * this.g.q);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.k = true;
        this.l = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.g.f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.g.getClass();
        ColorStateList colorStateList2 = this.g.e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.g.d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        dy0 dy0Var = this.g.b;
        return dy0Var != null && dy0Var.d();
    }

    public final float j() {
        if (l()) {
            return this.u.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float k() {
        float[] fArr = this.H;
        return fArr != null ? fArr[3] : this.g.a.e.a(g());
    }

    public final boolean l() {
        Paint.Style style = this.g.r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.u.getStrokeWidth() > 0.0f;
    }

    public final void m(Context context) {
        this.g.c = new jr(context);
        z();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.g = new lc0(this.g);
        return this;
    }

    public final boolean n() {
        if (!this.g.a.e(g())) {
            float[] fArr = this.H;
            if (fArr != null) {
                if (fArr.length > 1) {
                    float f = fArr[0];
                    for (int i = 1; i < fArr.length; i++) {
                        if (fArr[i] != f) {
                            break;
                        }
                    }
                }
                if (this.g.a.d()) {
                }
            }
            return false;
        }
        return true;
    }

    public final void o(ox0 ox0Var) {
        if (this.F == ox0Var) {
            return;
        }
        this.F = ox0Var;
        int i = 0;
        while (true) {
            nx0[] nx0VarArr = this.G;
            if (i >= nx0VarArr.length) {
                x(getState(), true);
                invalidateSelf();
                return;
            }
            if (nx0VarArr[i] == null) {
                nx0VarArr[i] = new nx0(this, L[i]);
            }
            nx0 nx0Var = nx0VarArr[i];
            ox0 ox0Var2 = new ox0();
            ox0Var2.a((float) ox0Var.b);
            double d = ox0Var.a;
            ox0Var2.b((float) (d * d));
            nx0Var.k = ox0Var2;
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.k = true;
        this.l = true;
        super.onBoundsChange(rect);
        if (this.g.b != null && !rect.isEmpty()) {
            x(getState(), this.D);
        }
        this.D = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.g.b != null) {
            x(iArr, false);
        }
        boolean z = w(iArr) || y();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(float f) {
        lc0 lc0Var = this.g;
        if (lc0Var.n != f) {
            lc0Var.n = f;
            z();
        }
    }

    public final void q(ColorStateList colorStateList) {
        lc0 lc0Var = this.g;
        if (lc0Var.d != colorStateList) {
            lc0Var.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void r(float f) {
        lc0 lc0Var = this.g;
        if (lc0Var.j != f) {
            lc0Var.j = f;
            this.k = true;
            this.l = true;
            invalidateSelf();
        }
    }

    public final void s() {
        this.g.r = Paint.Style.FILL;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        lc0 lc0Var = this.g;
        if (lc0Var.l != i) {
            lc0Var.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.g.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.rv0
    public final void setShapeAppearanceModel(su0 su0Var) {
        lc0 lc0Var = this.g;
        lc0Var.a = su0Var;
        lc0Var.b = null;
        this.H = null;
        this.I = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.g.f = colorStateList;
        y();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        lc0 lc0Var = this.g;
        if (lc0Var.g != mode) {
            lc0Var.g = mode;
            y();
            super.invalidateSelf();
        }
    }

    public final void t() {
        this.v.a(-12303292);
        this.g.getClass();
        super.invalidateSelf();
    }

    public final void u(int i) {
        lc0 lc0Var = this.g;
        if (lc0Var.o != i) {
            lc0Var.o = i;
            super.invalidateSelf();
        }
    }

    public final void v(dy0 dy0Var) {
        lc0 lc0Var = this.g;
        if (lc0Var.b != dy0Var) {
            lc0Var.b = dy0Var;
            x(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean w(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.g.d == null || color2 == (colorForState2 = this.g.d.getColorForState(iArr, (color2 = (paint2 = this.t).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.g.e == null || color == (colorForState = this.g.e.getColorForState(iArr, (color = (paint = this.u).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void x(int[] iArr, boolean z) {
        su0 su0VarA;
        int i;
        RectF rectFG = g();
        if (this.g.b == null || rectFG.isEmpty()) {
            return;
        }
        boolean z2 = z | (this.F == null);
        if (this.H == null) {
            this.H = new float[4];
        }
        dy0 dy0Var = this.g.b;
        su0[] su0VarArr = dy0Var.d;
        int i2 = dy0Var.a;
        int[][] iArr2 = dy0Var.c;
        cy0 cy0Var = dy0Var.h;
        cy0 cy0Var2 = dy0Var.g;
        cy0 cy0Var3 = dy0Var.f;
        cy0 cy0Var4 = dy0Var.e;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    i = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i4], iArr3)) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
            }
            i3 = i;
        }
        if (cy0Var4 == null && cy0Var3 == null && cy0Var2 == null && cy0Var == null) {
            su0VarA = su0VarArr[i3];
        } else {
            f2 f2VarF = su0VarArr[i3].f();
            if (cy0Var4 != null) {
                f2VarF.e = cy0Var4.c(iArr);
            }
            if (cy0Var3 != null) {
                f2VarF.f = cy0Var3.c(iArr);
            }
            if (cy0Var2 != null) {
                f2VarF.h = cy0Var2.c(iArr);
            }
            if (cy0Var != null) {
                f2VarF.g = cy0Var.c(iArr);
            }
            su0VarA = f2VarF.a();
        }
        int i5 = 0;
        while (i5 < 4) {
            this.x.getClass();
            float fA = (i5 != 1 ? i5 != 2 ? i5 != 3 ? su0VarA.f : su0VarA.e : su0VarA.h : su0VarA.g).a(rectFG);
            if (z2) {
                this.H[i5] = fA;
            }
            nx0[] nx0VarArr = this.G;
            nx0 nx0Var = nx0VarArr[i5];
            if (nx0Var != null) {
                nx0Var.a(fA);
                if (z2) {
                    nx0VarArr[i5].d();
                }
            }
            i5++;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public final boolean y() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.y;
        PorterDuffColorFilter porterDuffColorFilter3 = this.z;
        lc0 lc0Var = this.g;
        ColorStateList colorStateList = lc0Var.f;
        PorterDuff.Mode mode = lc0Var.g;
        if (colorStateList == null || mode == null) {
            int color = this.t.getColor();
            int iC = c(color);
            this.A = iC;
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iC2 = c(colorStateList.getColorForState(getState(), 0));
            this.A = iC2;
            porterDuffColorFilter = new PorterDuffColorFilter(iC2, mode);
        }
        this.y = porterDuffColorFilter;
        this.g.getClass();
        this.z = null;
        this.g.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.y) && Objects.equals(porterDuffColorFilter3, this.z)) ? false : true;
    }

    public final void z() {
        lc0 lc0Var = this.g;
        float f = lc0Var.n + 0.0f;
        lc0Var.p = (int) Math.ceil(0.75f * f);
        this.g.q = (int) Math.ceil(f * 0.25f);
        y();
        super.invalidateSelf();
    }

    public nc0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(su0.b(context, attributeSet, i, i2).a());
    }

    public nc0(su0 su0Var) {
        this(new lc0(su0Var));
    }

    public nc0(lc0 lc0Var) {
        uu0 uu0Var;
        this.f = new sq0(5, this);
        this.h = new kv0[4];
        this.i = new kv0[4];
        this.j = new BitSet(8);
        this.m = new Matrix();
        this.n = new Path();
        this.o = new Path();
        this.p = new RectF();
        this.q = new RectF();
        this.r = new Region();
        this.s = new Region();
        Paint paint = new Paint(1);
        this.t = paint;
        Paint paint2 = new Paint(1);
        this.u = paint2;
        this.v = new ru0();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            uu0Var = tu0.a;
        } else {
            uu0Var = new uu0();
        }
        this.x = uu0Var;
        this.B = new RectF();
        this.C = true;
        this.D = true;
        this.G = new nx0[4];
        this.g = lc0Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        y();
        w(getState());
        this.w = new f20(6, this);
    }
}
