package ee;

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
import d5.o0;
import io.sentry.android.core.e0;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class i extends Drawable implements v {

    /* renamed from: b0, reason: collision with root package name */
    public static final Paint f8113b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final h[] f8114c0;
    public boolean B;
    public final Matrix D;
    public final Path E;
    public final Path F;
    public final RectF G;
    public final RectF H;
    public final Region I;
    public final Region J;
    public final Paint K;
    public final Paint L;
    public final de.a M;
    public final b9.c N;
    public final o0 O;
    public PorterDuffColorFilter P;
    public PorterDuffColorFilter Q;
    public int R;
    public final RectF S;
    public boolean T;
    public boolean U;
    public l V;
    public i4.g W;
    public final i4.f[] X;
    public float[] Y;
    public float[] Z;

    /* renamed from: a, reason: collision with root package name */
    public final a2.g f8115a;

    /* renamed from: a0, reason: collision with root package name */
    public io.sentry.android.replay.capture.e f8116a0;

    /* renamed from: d, reason: collision with root package name */
    public g f8117d;

    /* renamed from: g, reason: collision with root package name */
    public final t[] f8118g;

    /* renamed from: r, reason: collision with root package name */
    public final t[] f8119r;

    /* renamed from: x, reason: collision with root package name */
    public final BitSet f8120x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8121y;

    static {
        Paint paint = new Paint(1);
        f8113b0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f8114c0 = new h[4];
        int i10 = 0;
        while (true) {
            h[] hVarArr = f8114c0;
            if (i10 >= hVarArr.length) {
                return;
            }
            hVarArr[i10] = new h(i10);
            i10++;
        }
    }

    public i() {
        this(new l());
    }

    public static float c(RectF rectF, l lVar, float[] fArr) {
        if (fArr == null) {
            if (lVar.f(rectF)) {
                return lVar.f8128e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f10 = fArr[0];
            for (int i10 = 1; i10 < fArr.length; i10++) {
                if (fArr[i10] != f10) {
                    return -1.0f;
                }
            }
        }
        if (lVar.e()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void b(RectF rectF, Path path) {
        g gVar = this.f8117d;
        this.O.b(gVar.f8097a, this.Y, gVar.j, rectF, this.N, path);
        if (this.f8117d.f8105i != 1.0f) {
            Matrix matrix = this.D;
            matrix.reset();
            float f10 = this.f8117d.f8105i;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.S, true);
    }

    public final int d(int i10) {
        int i11;
        g gVar = this.f8117d;
        float f10 = gVar.f8108n + 0.0f + gVar.f8107m;
        ud.a aVar = gVar.f8099c;
        if (aVar == null || !aVar.f23540a || k3.c.d(i10, 255) != aVar.f23543d) {
            return i10;
        }
        float fMin = (aVar.f23544e <= 0.0f || f10 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f10 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i10);
        int iB0 = io.sentry.config.a.b0(k3.c.d(i10, 255), fMin, aVar.f23541b);
        if (fMin > 0.0f && (i11 = aVar.f23542c) != 0) {
            iB0 = k3.c.b(k3.c.d(i11, ud.a.f23539f), iB0);
        }
        return k3.c.d(iB0, iAlpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.P;
        Paint paint2 = this.K;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i10 = this.f8117d.f8106l;
        paint2.setAlpha(((i10 + (i10 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.Q;
        Paint paint3 = this.L;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f8117d.k);
        int alpha2 = paint3.getAlpha();
        int i11 = this.f8117d.f8106l;
        paint3.setAlpha(((i11 + (i11 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.f8117d.f8111q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z10 = this.f8121y;
            paint = paint2;
            Path path = this.E;
            if (z10) {
                b(h(), path);
                this.f8121y = false;
            }
            g gVar = this.f8117d;
            gVar.getClass();
            if (gVar.f8109o > 0 && !n() && !path.isConvex() && Build.VERSION.SDK_INT < 29) {
                canvas.save();
                double d6 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d6)) * this.f8117d.f8110p), (int) (Math.cos(Math.toRadians(d6)) * this.f8117d.f8110p));
                if (this.T) {
                    RectF rectF = this.S;
                    int iWidth = (int) (rectF.width() - getBounds().width());
                    int iHeight = (int) (rectF.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f8117d.f8109o * 2) + ((int) rectF.width()) + iWidth, (this.f8117d.f8109o * 2) + ((int) rectF.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f10 = (getBounds().left - this.f8117d.f8109o) - iWidth;
                    float f11 = (getBounds().top - this.f8117d.f8109o) - iHeight;
                    canvas2.translate(-f10, -f11);
                    e(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            f(canvas, paint, path, this.f8117d.f8097a, this.Y, h());
        } else {
            paint = paint2;
        }
        if (l()) {
            if (this.B) {
                l lVar = this.f8117d.f8097a;
                bk.f fVarG = lVar.g();
                d dVar = lVar.f8128e;
                a2.g gVar2 = this.f8115a;
                fVarG.f2807e = gVar2.c(dVar);
                fVarG.f2808f = gVar2.c(lVar.f8129f);
                fVarG.f2810h = gVar2.c(lVar.f8131h);
                fVarG.f2809g = gVar2.c(lVar.f8130g);
                this.V = fVarG.b();
                float[] fArr = this.Y;
                if (fArr != null) {
                    if (this.Z == null) {
                        this.Z = new float[fArr.length];
                    }
                    float fJ = j();
                    int i12 = 0;
                    while (true) {
                        float[] fArr2 = this.Y;
                        if (i12 >= fArr2.length) {
                            break;
                        }
                        this.Z[i12] = Math.max(0.0f, fArr2[i12] - fJ);
                        i12++;
                    }
                } else {
                    this.Z = null;
                }
                l lVar2 = this.V;
                float[] fArr3 = this.Z;
                float f12 = this.f8117d.j;
                RectF rectFH = h();
                RectF rectF2 = this.H;
                rectF2.set(rectFH);
                float fJ2 = j();
                rectF2.inset(fJ2, fJ2);
                this.O.b(lVar2, fArr3, f12, rectF2, null, this.F);
                this.B = false;
            }
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.f8120x.cardinality() > 0) {
            e0.p("i", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f8117d.f8110p;
        Path path = this.E;
        de.a aVar = this.M;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.f7328a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            t tVar = this.f8118g[i11];
            int i12 = this.f8117d.f8109o;
            Matrix matrix = t.f8151b;
            tVar.a(matrix, aVar, i12, canvas);
            this.f8119r[i11].a(matrix, aVar, this.f8117d.f8109o, canvas);
        }
        if (this.T) {
            double d6 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d6)) * this.f8117d.f8110p);
            int iCos = (int) (Math.cos(Math.toRadians(d6)) * this.f8117d.f8110p);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f8113b0);
            canvas.translate(iSin, iCos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, l lVar, float[] fArr, RectF rectF) {
        float fC = c(rectF, lVar, fArr);
        if (fC < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f10 = fC * this.f8117d.j;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public void g(Canvas canvas) {
        l lVar = this.V;
        float[] fArr = this.Z;
        RectF rectFH = h();
        RectF rectF = this.H;
        rectF.set(rectFH);
        float fJ = j();
        rectF.inset(fJ, fJ);
        f(canvas, this.L, this.F, lVar, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f8117d.f8106l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f8117d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f8117d.getClass();
        RectF rectFH = h();
        if (rectFH.isEmpty()) {
            return;
        }
        float fC = c(rectFH, this.f8117d.f8097a, this.Y);
        if (fC >= 0.0f) {
            outline.setRoundRect(getBounds(), fC * this.f8117d.j);
            return;
        }
        boolean z10 = this.f8121y;
        Path path = this.E;
        if (z10) {
            b(rectFH, path);
            this.f8121y = false;
        }
        ba.m.Q(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f8117d.f8104h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.I;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.E;
        b(rectFH, path);
        Region region2 = this.J;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.G;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        float[] fArr = this.Y;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFH = h();
        l lVar = this.f8117d.f8097a;
        o0 o0Var = this.O;
        o0Var.getClass();
        float fA = lVar.f8128e.a(rectFH);
        l lVar2 = this.f8117d.f8097a;
        o0Var.getClass();
        float fA2 = lVar2.f8131h.a(rectFH) + fA;
        l lVar3 = this.f8117d.f8097a;
        o0Var.getClass();
        float fA3 = fA2 - lVar3.f8130g.a(rectFH);
        l lVar4 = this.f8117d.f8097a;
        o0Var.getClass();
        return (fA3 - lVar4.f8129f.a(rectFH)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f8121y = true;
        this.B = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f8117d.f8102f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f8117d.getClass();
        ColorStateList colorStateList2 = this.f8117d.f8101e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f8117d.f8100d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        y yVar = this.f8117d.f8098b;
        return yVar != null && yVar.d();
    }

    public final float j() {
        if (l()) {
            return this.L.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float k() {
        float[] fArr = this.Y;
        return fArr != null ? fArr[3] : this.f8117d.f8097a.f8128e.a(h());
    }

    public final boolean l() {
        Paint.Style style = this.f8117d.f8111q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.L.getStrokeWidth() > 0.0f;
    }

    public final void m(Context context) {
        this.f8117d.f8099c = new ud.a(context);
        x();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f8117d = new g(this.f8117d);
        return this;
    }

    public final boolean n() {
        if (!this.f8117d.f8097a.f(h())) {
            float[] fArr = this.Y;
            if (fArr != null) {
                if (fArr.length > 1) {
                    float f10 = fArr[0];
                    for (int i10 = 1; i10 < fArr.length; i10++) {
                        if (fArr[i10] != f10) {
                            break;
                        }
                    }
                }
                if (this.f8117d.f8097a.e()) {
                }
            }
            return false;
        }
        return true;
    }

    public final void o(i4.g gVar) {
        if (this.W == gVar) {
            return;
        }
        this.W = gVar;
        int i10 = 0;
        while (true) {
            i4.f[] fVarArr = this.X;
            if (i10 >= fVarArr.length) {
                v(getState(), true);
                invalidateSelf();
                return;
            }
            if (fVarArr[i10] == null) {
                fVarArr[i10] = new i4.f(this, f8114c0[i10]);
            }
            i4.f fVar = fVarArr[i10];
            i4.g gVar2 = new i4.g();
            gVar2.a((float) gVar.f11230b);
            double d6 = gVar.f11229a;
            gVar2.b((float) (d6 * d6));
            fVar.f11226m = gVar2;
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f8121y = true;
        this.B = true;
        super.onBoundsChange(rect);
        if (this.f8117d.f8098b != null && !rect.isEmpty()) {
            v(getState(), this.U);
        }
        this.U = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f8117d.f8098b != null) {
            v(iArr, false);
        }
        boolean z10 = u(iArr) || w();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public final void p(float f10) {
        g gVar = this.f8117d;
        if (gVar.f8108n != f10) {
            gVar.f8108n = f10;
            x();
        }
    }

    public final void q(ColorStateList colorStateList) {
        g gVar = this.f8117d;
        if (gVar.f8100d != colorStateList) {
            gVar.f8100d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void r(float f10) {
        g gVar = this.f8117d;
        if (gVar.j != f10) {
            gVar.j = f10;
            this.f8121y = true;
            this.B = true;
            invalidateSelf();
        }
    }

    public final void s() {
        this.M.a(-12303292);
        this.f8117d.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        g gVar = this.f8117d;
        if (gVar.f8106l != i10) {
            gVar.f8106l = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f8117d.getClass();
        super.invalidateSelf();
    }

    @Override // ee.v
    public final void setShapeAppearanceModel(l lVar) {
        g gVar = this.f8117d;
        gVar.f8097a = lVar;
        gVar.f8098b = null;
        this.Y = null;
        this.Z = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f8117d.f8102f = colorStateList;
        w();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        g gVar = this.f8117d;
        if (gVar.f8103g != mode) {
            gVar.f8103g = mode;
            w();
            super.invalidateSelf();
        }
    }

    public final void t(y yVar) {
        g gVar = this.f8117d;
        if (gVar.f8098b != yVar) {
            gVar.f8098b = yVar;
            v(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean u(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f8117d.f8100d == null || color2 == (colorForState2 = this.f8117d.f8100d.getColorForState(iArr, (color2 = (paint2 = this.K).getColor())))) {
            z10 = false;
        } else {
            paint2.setColor(colorForState2);
            z10 = true;
        }
        if (this.f8117d.f8101e == null || color == (colorForState = this.f8117d.f8101e.getColorForState(iArr, (color = (paint = this.L).getColor())))) {
            return z10;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void v(int[] iArr, boolean z10) {
        l lVarB;
        int i10;
        RectF rectFH = h();
        if (this.f8117d.f8098b == null || rectFH.isEmpty()) {
            return;
        }
        boolean z11 = z10 | (this.W == null);
        if (this.Y == null) {
            this.Y = new float[4];
        }
        y yVar = this.f8117d.f8098b;
        l[] lVarArr = yVar.f8176d;
        int i11 = yVar.f8173a;
        int[][] iArr2 = yVar.f8175c;
        w wVar = yVar.f8180h;
        w wVar2 = yVar.f8179g;
        w wVar3 = yVar.f8178f;
        w wVar4 = yVar.f8177e;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                i12 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i12], iArr)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    i10 = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i13], iArr3)) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
            }
            i12 = i10;
        }
        if (wVar4 == null && wVar3 == null && wVar2 == null && wVar == null) {
            lVarB = lVarArr[i12];
        } else {
            bk.f fVarG = lVarArr[i12].g();
            if (wVar4 != null) {
                fVarG.f2807e = wVar4.c(iArr);
            }
            if (wVar3 != null) {
                fVarG.f2808f = wVar3.c(iArr);
            }
            if (wVar2 != null) {
                fVarG.f2810h = wVar2.c(iArr);
            }
            if (wVar != null) {
                fVarG.f2809g = wVar.c(iArr);
            }
            lVarB = fVarG.b();
        }
        int i14 = 0;
        while (i14 < 4) {
            this.O.getClass();
            float fA = (i14 != 1 ? i14 != 2 ? i14 != 3 ? lVarB.f8129f : lVarB.f8128e : lVarB.f8131h : lVarB.f8130g).a(rectFH);
            if (z11) {
                this.Y[i14] = fA;
            }
            i4.f[] fVarArr = this.X;
            i4.f fVar = fVarArr[i14];
            if (fVar != null) {
                fVar.a(fA);
                if (z11) {
                    fVarArr[i14].d();
                }
            }
            i14++;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public final boolean w() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.P;
        PorterDuffColorFilter porterDuffColorFilter3 = this.Q;
        g gVar = this.f8117d;
        ColorStateList colorStateList = gVar.f8102f;
        PorterDuff.Mode mode = gVar.f8103g;
        if (colorStateList == null || mode == null) {
            int color = this.K.getColor();
            int iD = d(color);
            this.R = iD;
            porterDuffColorFilter = iD != color ? new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iD2 = d(colorStateList.getColorForState(getState(), 0));
            this.R = iD2;
            porterDuffColorFilter = new PorterDuffColorFilter(iD2, mode);
        }
        this.P = porterDuffColorFilter;
        this.f8117d.getClass();
        this.Q = null;
        this.f8117d.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.P) && Objects.equals(porterDuffColorFilter3, this.Q)) ? false : true;
    }

    public final void x() {
        g gVar = this.f8117d;
        float f10 = gVar.f8108n + 0.0f;
        gVar.f8109o = (int) Math.ceil(0.75f * f10);
        this.f8117d.f8110p = (int) Math.ceil(f10 * 0.25f);
        w();
        super.invalidateSelf();
    }

    public i(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(l.c(context, attributeSet, i10, i11).b());
    }

    public i(l lVar) {
        this(new g(lVar));
    }

    public i(g gVar) {
        o0 o0Var;
        this.f8115a = new a2.g(this);
        this.f8118g = new t[4];
        this.f8119r = new t[4];
        this.f8120x = new BitSet(8);
        this.D = new Matrix();
        this.E = new Path();
        this.F = new Path();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new Region();
        this.J = new Region();
        Paint paint = new Paint(1);
        this.K = paint;
        Paint paint2 = new Paint(1);
        this.L = paint2;
        this.M = new de.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            o0Var = m.f8134a;
        } else {
            o0Var = new o0();
        }
        this.O = o0Var;
        this.S = new RectF();
        this.T = true;
        this.U = true;
        this.X = new i4.f[4];
        this.f8117d = gVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        w();
        u(getState());
        this.N = new b9.c(17, this);
    }
}
