package l4;

import a4.C1650a;
import android.annotation.TargetApi;
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
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
import k4.C5216a;
import kotlin.KotlinVersion;
import l4.C5290i;
import l4.j;
import l4.l;

/* compiled from: MaterialShapeDrawable.java */
/* renamed from: l4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5287f extends Drawable implements m {

    /* renamed from: y, reason: collision with root package name */
    public static final Paint f43758y;

    /* renamed from: b, reason: collision with root package name */
    public b f43759b;

    /* renamed from: c, reason: collision with root package name */
    public final l.f[] f43760c;

    /* renamed from: d, reason: collision with root package name */
    public final l.f[] f43761d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f43762e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f43763f;

    /* renamed from: g, reason: collision with root package name */
    public final Matrix f43764g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f43765h;
    public final Path i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f43766j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f43767k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f43768l;

    /* renamed from: m, reason: collision with root package name */
    public final Region f43769m;

    /* renamed from: n, reason: collision with root package name */
    public C5290i f43770n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f43771o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f43772p;

    /* renamed from: q, reason: collision with root package name */
    public final C5216a f43773q;

    /* renamed from: r, reason: collision with root package name */
    public final a f43774r;

    /* renamed from: s, reason: collision with root package name */
    public final j f43775s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f43776t;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuffColorFilter f43777u;

    /* renamed from: v, reason: collision with root package name */
    public int f43778v;

    /* renamed from: w, reason: collision with root package name */
    public final RectF f43779w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f43780x;

    /* compiled from: MaterialShapeDrawable.java */
    /* renamed from: l4.f$a */
    public class a {
        public a() {
        }
    }

    static {
        Paint paint = new Paint(1);
        f43758y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C5287f() {
        this(new C5290i());
    }

    public final void b(RectF rectF, Path path) {
        b bVar = this.f43759b;
        this.f43775s.a(bVar.f43782a, bVar.i, rectF, this.f43774r, path);
        if (this.f43759b.f43789h != 1.0f) {
            Matrix matrix = this.f43764g;
            matrix.reset();
            float f10 = this.f43759b.f43789h;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f43779w, true);
    }

    public final int c(int i) {
        int i10;
        b bVar = this.f43759b;
        float f10 = bVar.f43793m + 0.0f + bVar.f43792l;
        C1650a c1650a = bVar.f43783b;
        if (c1650a == null || !c1650a.f14159a || C0.d.e(i, KotlinVersion.MAX_COMPONENT_VALUE) != c1650a.f14162d) {
            return i;
        }
        float fMin = (c1650a.f14163e <= 0.0f || f10 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f10 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iS = B7.d.s(fMin, C0.d.e(i, KotlinVersion.MAX_COMPONENT_VALUE), c1650a.f14160b);
        if (fMin > 0.0f && (i10 = c1650a.f14161c) != 0) {
            iS = C0.d.c(C0.d.e(i10, C1650a.f14158f), iS);
        }
        return C0.d.e(iS, iAlpha);
    }

    public final void d(Canvas canvas) {
        if (this.f43762e.cardinality() > 0) {
            Log.w("f", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f43759b.f43795o;
        Path path = this.f43765h;
        C5216a c5216a = this.f43773q;
        if (i != 0) {
            canvas.drawPath(path, c5216a.f43380a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            l.f fVar = this.f43760c[i10];
            int i11 = this.f43759b.f43794n;
            Matrix matrix = l.f.f43857b;
            fVar.a(matrix, c5216a, i11, canvas);
            this.f43761d[i10].a(matrix, c5216a, this.f43759b.f43794n, canvas);
        }
        if (this.f43780x) {
            b bVar = this.f43759b;
            int iSin = (int) (Math.sin(Math.toRadians(bVar.f43796p)) * bVar.f43795o);
            b bVar2 = this.f43759b;
            int iCos = (int) (Math.cos(Math.toRadians(bVar2.f43796p)) * bVar2.f43795o);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f43758y);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f43771o;
        paint.setColorFilter(this.f43776t);
        int alpha = paint.getAlpha();
        int i = this.f43759b.f43791k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f43772p;
        paint2.setColorFilter(this.f43777u);
        paint2.setStrokeWidth(this.f43759b.f43790j);
        int alpha2 = paint2.getAlpha();
        int i10 = this.f43759b.f43791k;
        paint2.setAlpha(((i10 + (i10 >>> 7)) * alpha2) >>> 8);
        boolean z10 = this.f43763f;
        Path path = this.f43765h;
        if (z10) {
            float f10 = -(h() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C5290i c5290i = this.f43759b.f43782a;
            C5290i.a aVarE = c5290i.e();
            InterfaceC5284c c5283b = c5290i.f43804e;
            if (!(c5283b instanceof C5288g)) {
                c5283b = new C5283b(f10, c5283b);
            }
            aVarE.f43815e = c5283b;
            InterfaceC5284c c5283b2 = c5290i.f43805f;
            if (!(c5283b2 instanceof C5288g)) {
                c5283b2 = new C5283b(f10, c5283b2);
            }
            aVarE.f43816f = c5283b2;
            InterfaceC5284c c5283b3 = c5290i.f43807h;
            if (!(c5283b3 instanceof C5288g)) {
                c5283b3 = new C5283b(f10, c5283b3);
            }
            aVarE.f43818h = c5283b3;
            InterfaceC5284c c5283b4 = c5290i.f43806g;
            if (!(c5283b4 instanceof C5288g)) {
                c5283b4 = new C5283b(f10, c5283b4);
            }
            aVarE.f43817g = c5283b4;
            C5290i c5290iA = aVarE.a();
            this.f43770n = c5290iA;
            float f11 = this.f43759b.i;
            RectF rectF = this.f43767k;
            rectF.set(g());
            float strokeWidth = h() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f43775s.a(c5290iA, f11, rectF, null, this.i);
            b(g(), path);
            this.f43763f = false;
        }
        b bVar = this.f43759b;
        bVar.getClass();
        if (bVar.f43794n > 0) {
            int i11 = Build.VERSION.SDK_INT;
            if (!this.f43759b.f43782a.d(g()) && !path.isConvex() && i11 < 29) {
                canvas.save();
                b bVar2 = this.f43759b;
                int iSin = (int) (Math.sin(Math.toRadians(bVar2.f43796p)) * bVar2.f43795o);
                b bVar3 = this.f43759b;
                canvas.translate(iSin, (int) (Math.cos(Math.toRadians(bVar3.f43796p)) * bVar3.f43795o));
                if (this.f43780x) {
                    RectF rectF2 = this.f43779w;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f43759b.f43794n * 2) + ((int) rectF2.width()) + iWidth, (this.f43759b.f43794n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f12 = (getBounds().left - this.f43759b.f43794n) - iWidth;
                    float f13 = (getBounds().top - this.f43759b.f43794n) - iHeight;
                    canvas2.translate(-f12, -f13);
                    d(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f12, f13, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    d(canvas);
                    canvas.restore();
                }
            }
        }
        b bVar4 = this.f43759b;
        Paint.Style style = bVar4.f43797q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, bVar4.f43782a, g());
        }
        if (h()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, C5290i c5290i, RectF rectF) {
        if (!c5290i.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = c5290i.f43805f.a(rectF) * this.f43759b.i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void f(Canvas canvas) {
        Paint paint = this.f43772p;
        Path path = this.i;
        C5290i c5290i = this.f43770n;
        RectF rectF = this.f43767k;
        rectF.set(g());
        float strokeWidth = h() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, path, c5290i, rectF);
    }

    public final RectF g() {
        RectF rectF = this.f43766j;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f43759b.f43791k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f43759b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        this.f43759b.getClass();
        if (this.f43759b.f43782a.d(g())) {
            outline.setRoundRect(getBounds(), this.f43759b.f43782a.f43804e.a(g()) * this.f43759b.i);
        } else {
            RectF rectFG = g();
            Path path = this.f43765h;
            b(rectFG, path);
            Z3.a.b(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f43759b.f43788g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f43768l;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.f43765h;
        b(rectFG, path);
        Region region2 = this.f43769m;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h() {
        Paint.Style style = this.f43759b.f43797q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f43772p.getStrokeWidth() > 0.0f;
    }

    public final void i(Context context) {
        this.f43759b.f43783b = new C1650a(context);
        n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f43763f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f43759b.f43786e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f43759b.getClass();
        ColorStateList colorStateList2 = this.f43759b.f43785d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f43759b.f43784c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(float f10) {
        b bVar = this.f43759b;
        if (bVar.f43793m != f10) {
            bVar.f43793m = f10;
            n();
        }
    }

    public final void k(ColorStateList colorStateList) {
        b bVar = this.f43759b;
        if (bVar.f43784c != colorStateList) {
            bVar.f43784c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean l(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f43759b.f43784c == null || color2 == (colorForState2 = this.f43759b.f43784c.getColorForState(iArr, (color2 = (paint2 = this.f43771o).getColor())))) {
            z10 = false;
        } else {
            paint2.setColor(colorForState2);
            z10 = true;
        }
        if (this.f43759b.f43785d == null || color == (colorForState = this.f43759b.f43785d.getColorForState(iArr, (color = (paint = this.f43772p).getColor())))) {
            return z10;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f43776t;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f43777u;
        b bVar = this.f43759b;
        ColorStateList colorStateList = bVar.f43786e;
        PorterDuff.Mode mode = bVar.f43787f;
        Paint paint = this.f43771o;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iC = c(color);
            this.f43778v = iC;
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iC2 = c(colorStateList.getColorForState(getState(), 0));
            this.f43778v = iC2;
            porterDuffColorFilter = new PorterDuffColorFilter(iC2, mode);
        }
        this.f43776t = porterDuffColorFilter;
        this.f43759b.getClass();
        this.f43777u = null;
        this.f43759b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f43776t) && Objects.equals(porterDuffColorFilter3, this.f43777u)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f43759b = new b(this.f43759b);
        return this;
    }

    public final void n() {
        b bVar = this.f43759b;
        float f10 = bVar.f43793m + 0.0f;
        bVar.f43794n = (int) Math.ceil(0.75f * f10);
        this.f43759b.f43795o = (int) Math.ceil(f10 * 0.25f);
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f43763f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, d4.h.b
    public boolean onStateChange(int[] iArr) {
        boolean z10 = l(iArr) || m();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        b bVar = this.f43759b;
        if (bVar.f43791k != i) {
            bVar.f43791k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f43759b.getClass();
        super.invalidateSelf();
    }

    @Override // l4.m
    public final void setShapeAppearanceModel(C5290i c5290i) {
        this.f43759b.f43782a = c5290i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f43759b.f43786e = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f43759b;
        if (bVar.f43787f != mode) {
            bVar.f43787f = mode;
            m();
            super.invalidateSelf();
        }
    }

    public C5287f(Context context, AttributeSet attributeSet, int i, int i10) {
        this(C5290i.b(context, attributeSet, i, i10).a());
    }

    public C5287f(C5290i c5290i) {
        this(new b(c5290i));
    }

    public C5287f(b bVar) {
        j jVar;
        this.f43760c = new l.f[4];
        this.f43761d = new l.f[4];
        this.f43762e = new BitSet(8);
        this.f43764g = new Matrix();
        this.f43765h = new Path();
        this.i = new Path();
        this.f43766j = new RectF();
        this.f43767k = new RectF();
        this.f43768l = new Region();
        this.f43769m = new Region();
        Paint paint = new Paint(1);
        this.f43771o = paint;
        Paint paint2 = new Paint(1);
        this.f43772p = paint2;
        this.f43773q = new C5216a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            jVar = j.a.f43833a;
        } else {
            jVar = new j();
        }
        this.f43775s = jVar;
        this.f43779w = new RectF();
        this.f43780x = true;
        this.f43759b = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.f43774r = new a();
    }

    /* compiled from: MaterialShapeDrawable.java */
    /* renamed from: l4.f$b */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public C5290i f43782a;

        /* renamed from: b, reason: collision with root package name */
        public C1650a f43783b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f43784c;

        /* renamed from: d, reason: collision with root package name */
        public ColorStateList f43785d;

        /* renamed from: e, reason: collision with root package name */
        public ColorStateList f43786e;

        /* renamed from: f, reason: collision with root package name */
        public PorterDuff.Mode f43787f;

        /* renamed from: g, reason: collision with root package name */
        public Rect f43788g;

        /* renamed from: h, reason: collision with root package name */
        public final float f43789h;
        public float i;

        /* renamed from: j, reason: collision with root package name */
        public float f43790j;

        /* renamed from: k, reason: collision with root package name */
        public int f43791k;

        /* renamed from: l, reason: collision with root package name */
        public float f43792l;

        /* renamed from: m, reason: collision with root package name */
        public float f43793m;

        /* renamed from: n, reason: collision with root package name */
        public int f43794n;

        /* renamed from: o, reason: collision with root package name */
        public int f43795o;

        /* renamed from: p, reason: collision with root package name */
        public final int f43796p;

        /* renamed from: q, reason: collision with root package name */
        public final Paint.Style f43797q;

        public b(C5290i c5290i) {
            this.f43784c = null;
            this.f43785d = null;
            this.f43786e = null;
            this.f43787f = PorterDuff.Mode.SRC_IN;
            this.f43788g = null;
            this.f43789h = 1.0f;
            this.i = 1.0f;
            this.f43791k = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f43792l = 0.0f;
            this.f43793m = 0.0f;
            this.f43794n = 0;
            this.f43795o = 0;
            this.f43796p = 0;
            this.f43797q = Paint.Style.FILL_AND_STROKE;
            this.f43782a = c5290i;
            this.f43783b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C5287f c5287f = new C5287f(this);
            c5287f.f43763f = true;
            return c5287f;
        }

        public b(b bVar) {
            this.f43784c = null;
            this.f43785d = null;
            this.f43786e = null;
            this.f43787f = PorterDuff.Mode.SRC_IN;
            this.f43788g = null;
            this.f43789h = 1.0f;
            this.i = 1.0f;
            this.f43791k = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f43792l = 0.0f;
            this.f43793m = 0.0f;
            this.f43794n = 0;
            this.f43795o = 0;
            this.f43796p = 0;
            this.f43797q = Paint.Style.FILL_AND_STROKE;
            this.f43782a = bVar.f43782a;
            this.f43783b = bVar.f43783b;
            this.f43790j = bVar.f43790j;
            this.f43784c = bVar.f43784c;
            this.f43785d = bVar.f43785d;
            this.f43787f = bVar.f43787f;
            this.f43786e = bVar.f43786e;
            this.f43791k = bVar.f43791k;
            this.f43789h = bVar.f43789h;
            this.f43795o = bVar.f43795o;
            this.i = bVar.i;
            this.f43792l = bVar.f43792l;
            this.f43793m = bVar.f43793m;
            this.f43794n = bVar.f43794n;
            this.f43796p = bVar.f43796p;
            this.f43797q = bVar.f43797q;
            if (bVar.f43788g != null) {
                this.f43788g = new Rect(bVar.f43788g);
            }
        }
    }
}
