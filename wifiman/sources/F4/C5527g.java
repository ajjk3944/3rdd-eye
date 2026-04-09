package f4;

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
import e4.C5420a;
import f4.C5531k;
import f4.C5532l;
import f4.C5533m;
import java.util.BitSet;

/* renamed from: f4.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5527g extends Drawable implements InterfaceC5534n {

    /* renamed from: x, reason: collision with root package name */
    private static final String f46993x = "g";

    /* renamed from: y, reason: collision with root package name */
    private static final Paint f46994y;

    /* renamed from: a, reason: collision with root package name */
    private c f46995a;

    /* renamed from: b, reason: collision with root package name */
    private final C5533m.g[] f46996b;

    /* renamed from: c, reason: collision with root package name */
    private final C5533m.g[] f46997c;

    /* renamed from: d, reason: collision with root package name */
    private final BitSet f46998d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f46999e;

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f47000f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f47001g;

    /* renamed from: h, reason: collision with root package name */
    private final Path f47002h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f47003i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f47004j;

    /* renamed from: k, reason: collision with root package name */
    private final Region f47005k;

    /* renamed from: l, reason: collision with root package name */
    private final Region f47006l;

    /* renamed from: m, reason: collision with root package name */
    private C5531k f47007m;

    /* renamed from: n, reason: collision with root package name */
    private final Paint f47008n;

    /* renamed from: o, reason: collision with root package name */
    private final Paint f47009o;

    /* renamed from: p, reason: collision with root package name */
    private final C5420a f47010p;

    /* renamed from: q, reason: collision with root package name */
    private final C5532l.b f47011q;

    /* renamed from: r, reason: collision with root package name */
    private final C5532l f47012r;

    /* renamed from: s, reason: collision with root package name */
    private PorterDuffColorFilter f47013s;

    /* renamed from: t, reason: collision with root package name */
    private PorterDuffColorFilter f47014t;

    /* renamed from: u, reason: collision with root package name */
    private int f47015u;

    /* renamed from: v, reason: collision with root package name */
    private final RectF f47016v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f47017w;

    /* renamed from: f4.g$a */
    class a implements C5532l.b {
        a() {
        }

        @Override // f4.C5532l.b
        public void a(C5533m c5533m, Matrix matrix, int i10) {
            C5527g.this.f46998d.set(i10, c5533m.e());
            C5527g.this.f46996b[i10] = c5533m.f(matrix);
        }

        @Override // f4.C5532l.b
        public void b(C5533m c5533m, Matrix matrix, int i10) {
            C5527g.this.f46998d.set(i10 + 4, c5533m.e());
            C5527g.this.f46997c[i10] = c5533m.f(matrix);
        }
    }

    /* renamed from: f4.g$b */
    class b implements C5531k.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f47019a;

        b(float f10) {
            this.f47019a = f10;
        }

        @Override // f4.C5531k.c
        public InterfaceC5523c a(InterfaceC5523c interfaceC5523c) {
            return interfaceC5523c instanceof C5529i ? interfaceC5523c : new C5522b(this.f47019a, interfaceC5523c);
        }
    }

    static {
        Paint paint = new Paint(1);
        f46994y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C5527g() {
        this(new C5531k());
    }

    private float B() {
        if (I()) {
            return this.f47009o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean G() {
        c cVar = this.f46995a;
        int i10 = cVar.f47037q;
        return i10 != 1 && cVar.f47038r > 0 && (i10 == 2 || Q());
    }

    private boolean H() {
        Paint.Style style = this.f46995a.f47042v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean I() {
        Paint.Style style = this.f46995a.f47042v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f47009o.getStrokeWidth() > 0.0f;
    }

    private void K() {
        super.invalidateSelf();
    }

    private void N(Canvas canvas) {
        if (G()) {
            canvas.save();
            P(canvas);
            if (!this.f47017w) {
                n(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f47016v.width() - getBounds().width());
            int iHeight = (int) (this.f47016v.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f47016v.width()) + (this.f46995a.f47038r * 2) + iWidth, ((int) this.f47016v.height()) + (this.f46995a.f47038r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f46995a.f47038r) - iWidth;
            float f11 = (getBounds().top - this.f46995a.f47038r) - iHeight;
            canvas2.translate(-f10, -f11);
            n(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int O(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void P(Canvas canvas) {
        canvas.translate(y(), z());
    }

    private boolean b0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f46995a.f47024d == null || color2 == (colorForState2 = this.f46995a.f47024d.getColorForState(iArr, (color2 = this.f47008n.getColor())))) {
            z10 = false;
        } else {
            this.f47008n.setColor(colorForState2);
            z10 = true;
        }
        if (this.f46995a.f47025e == null || color == (colorForState = this.f46995a.f47025e.getColorForState(iArr, (color = this.f47009o.getColor())))) {
            return z10;
        }
        this.f47009o.setColor(colorForState);
        return true;
    }

    private boolean c0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f47013s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f47014t;
        c cVar = this.f46995a;
        this.f47013s = k(cVar.f47027g, cVar.f47028h, this.f47008n, true);
        c cVar2 = this.f46995a;
        this.f47014t = k(cVar2.f47026f, cVar2.f47028h, this.f47009o, false);
        c cVar3 = this.f46995a;
        if (cVar3.f47041u) {
            this.f47010p.d(cVar3.f47027g.getColorForState(getState(), 0));
        }
        return (E1.d.a(porterDuffColorFilter, this.f47013s) && E1.d.a(porterDuffColorFilter2, this.f47014t)) ? false : true;
    }

    private void d0() {
        float F10 = F();
        this.f46995a.f47038r = (int) Math.ceil(0.75f * F10);
        this.f46995a.f47039s = (int) Math.ceil(F10 * 0.25f);
        c0();
        K();
    }

    private PorterDuffColorFilter f(Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.f47015u = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f46995a.f47030j != 1.0f) {
            this.f47000f.reset();
            Matrix matrix = this.f47000f;
            float f10 = this.f46995a.f47030j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f47000f);
        }
        path.computeBounds(this.f47016v, true);
    }

    private void i() {
        C5531k c5531kY = A().y(new b(-B()));
        this.f47007m = c5531kY;
        this.f47012r.d(c5531kY, this.f46995a.f47031k, t(), this.f47002h);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f47015u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? f(paint, z10) : j(colorStateList, mode, z10);
    }

    public static C5527g m(Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(V3.a.c(context, O3.a.f16972k, C5527g.class.getSimpleName()));
        }
        C5527g c5527g = new C5527g();
        c5527g.J(context);
        c5527g.T(colorStateList);
        c5527g.S(f10);
        return c5527g;
    }

    private void n(Canvas canvas) {
        if (this.f46998d.cardinality() > 0) {
            Log.w(f46993x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f46995a.f47039s != 0) {
            canvas.drawPath(this.f47001g, this.f47010p.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f46996b[i10].b(this.f47010p, this.f46995a.f47038r, canvas);
            this.f46997c[i10].b(this.f47010p, this.f46995a.f47038r, canvas);
        }
        if (this.f47017w) {
            int iY = y();
            int iZ = z();
            canvas.translate(-iY, -iZ);
            canvas.drawPath(this.f47001g, f46994y);
            canvas.translate(iY, iZ);
        }
    }

    private void o(Canvas canvas) {
        q(canvas, this.f47008n, this.f47001g, this.f46995a.f47021a, s());
    }

    private void q(Canvas canvas, Paint paint, Path path, C5531k c5531k, RectF rectF) {
        if (!c5531k.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = c5531k.t().a(rectF) * this.f46995a.f47031k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    private RectF t() {
        this.f47004j.set(s());
        float fB = B();
        this.f47004j.inset(fB, fB);
        return this.f47004j;
    }

    public C5531k A() {
        return this.f46995a.f47021a;
    }

    public float C() {
        return this.f46995a.f47021a.r().a(s());
    }

    public float D() {
        return this.f46995a.f47021a.t().a(s());
    }

    public float E() {
        return this.f46995a.f47036p;
    }

    public float F() {
        return u() + E();
    }

    public void J(Context context) {
        this.f46995a.f47022b = new X3.a(context);
        d0();
    }

    public boolean L() {
        X3.a aVar = this.f46995a.f47022b;
        return aVar != null && aVar.d();
    }

    public boolean M() {
        return this.f46995a.f47021a.u(s());
    }

    public boolean Q() {
        return (M() || this.f47001g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void R(InterfaceC5523c interfaceC5523c) {
        setShapeAppearanceModel(this.f46995a.f47021a.x(interfaceC5523c));
    }

    public void S(float f10) {
        c cVar = this.f46995a;
        if (cVar.f47035o != f10) {
            cVar.f47035o = f10;
            d0();
        }
    }

    public void T(ColorStateList colorStateList) {
        c cVar = this.f46995a;
        if (cVar.f47024d != colorStateList) {
            cVar.f47024d = colorStateList;
            onStateChange(getState());
        }
    }

    public void U(float f10) {
        c cVar = this.f46995a;
        if (cVar.f47031k != f10) {
            cVar.f47031k = f10;
            this.f46999e = true;
            invalidateSelf();
        }
    }

    public void V(int i10, int i11, int i12, int i13) {
        c cVar = this.f46995a;
        if (cVar.f47029i == null) {
            cVar.f47029i = new Rect();
        }
        this.f46995a.f47029i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void W(float f10) {
        c cVar = this.f46995a;
        if (cVar.f47034n != f10) {
            cVar.f47034n = f10;
            d0();
        }
    }

    public void X(float f10, int i10) {
        a0(f10);
        Z(ColorStateList.valueOf(i10));
    }

    public void Y(float f10, ColorStateList colorStateList) {
        a0(f10);
        Z(colorStateList);
    }

    public void Z(ColorStateList colorStateList) {
        c cVar = this.f46995a;
        if (cVar.f47025e != colorStateList) {
            cVar.f47025e = colorStateList;
            onStateChange(getState());
        }
    }

    public void a0(float f10) {
        this.f46995a.f47032l = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f47008n.setColorFilter(this.f47013s);
        int alpha = this.f47008n.getAlpha();
        this.f47008n.setAlpha(O(alpha, this.f46995a.f47033m));
        this.f47009o.setColorFilter(this.f47014t);
        this.f47009o.setStrokeWidth(this.f46995a.f47032l);
        int alpha2 = this.f47009o.getAlpha();
        this.f47009o.setAlpha(O(alpha2, this.f46995a.f47033m));
        if (this.f46999e) {
            i();
            g(s(), this.f47001g);
            this.f46999e = false;
        }
        N(canvas);
        if (H()) {
            o(canvas);
        }
        if (I()) {
            r(canvas);
        }
        this.f47008n.setAlpha(alpha);
        this.f47009o.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f46995a.f47033m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f46995a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f46995a.f47037q == 2) {
            return;
        }
        if (M()) {
            outline.setRoundRect(getBounds(), C() * this.f46995a.f47031k);
        } else {
            g(s(), this.f47001g);
            com.google.android.material.drawable.d.i(outline, this.f47001g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f46995a.f47029i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f47005k.set(getBounds());
        g(s(), this.f47001g);
        this.f47006l.setPath(this.f47001g, this.f47005k);
        this.f47005k.op(this.f47006l, Region.Op.DIFFERENCE);
        return this.f47005k;
    }

    protected final void h(RectF rectF, Path path) {
        C5532l c5532l = this.f47012r;
        c cVar = this.f46995a;
        c5532l.e(cVar.f47021a, cVar.f47031k, rectF, this.f47011q, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f46999e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f46995a.f47027g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f46995a.f47026f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f46995a.f47025e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f46995a.f47024d) != null && colorStateList4.isStateful())));
    }

    protected int l(int i10) {
        float F10 = F() + x();
        X3.a aVar = this.f46995a.f47022b;
        return aVar != null ? aVar.c(i10, F10) : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f46995a = new c(this.f46995a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f46999e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.i.b
    protected boolean onStateChange(int[] iArr) {
        boolean z10 = b0(iArr) || c0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    protected void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f46995a.f47021a, rectF);
    }

    protected void r(Canvas canvas) {
        q(canvas, this.f47009o, this.f47002h, this.f47007m, t());
    }

    protected RectF s() {
        this.f47003i.set(getBounds());
        return this.f47003i;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f46995a;
        if (cVar.f47033m != i10) {
            cVar.f47033m = i10;
            K();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f46995a.f47023c = colorFilter;
        K();
    }

    @Override // f4.InterfaceC5534n
    public void setShapeAppearanceModel(C5531k c5531k) {
        this.f46995a.f47021a = c5531k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f46995a.f47027g = colorStateList;
        c0();
        K();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f46995a;
        if (cVar.f47028h != mode) {
            cVar.f47028h = mode;
            c0();
            K();
        }
    }

    public float u() {
        return this.f46995a.f47035o;
    }

    public ColorStateList v() {
        return this.f46995a.f47024d;
    }

    public float w() {
        return this.f46995a.f47031k;
    }

    public float x() {
        return this.f46995a.f47034n;
    }

    public int y() {
        c cVar = this.f46995a;
        return (int) (cVar.f47039s * Math.sin(Math.toRadians(cVar.f47040t)));
    }

    public int z() {
        c cVar = this.f46995a;
        return (int) (cVar.f47039s * Math.cos(Math.toRadians(cVar.f47040t)));
    }

    public C5527g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(C5531k.e(context, attributeSet, i10, i11).m());
    }

    public C5527g(C5531k c5531k) {
        this(new c(c5531k, null));
    }

    protected C5527g(c cVar) {
        C5532l c5532l;
        this.f46996b = new C5533m.g[4];
        this.f46997c = new C5533m.g[4];
        this.f46998d = new BitSet(8);
        this.f47000f = new Matrix();
        this.f47001g = new Path();
        this.f47002h = new Path();
        this.f47003i = new RectF();
        this.f47004j = new RectF();
        this.f47005k = new Region();
        this.f47006l = new Region();
        Paint paint = new Paint(1);
        this.f47008n = paint;
        Paint paint2 = new Paint(1);
        this.f47009o = paint2;
        this.f47010p = new C5420a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c5532l = C5532l.k();
        } else {
            c5532l = new C5532l();
        }
        this.f47012r = c5532l;
        this.f47016v = new RectF();
        this.f47017w = true;
        this.f46995a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        c0();
        b0(getState());
        this.f47011q = new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f4.g$c */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        C5531k f47021a;

        /* renamed from: b, reason: collision with root package name */
        X3.a f47022b;

        /* renamed from: c, reason: collision with root package name */
        ColorFilter f47023c;

        /* renamed from: d, reason: collision with root package name */
        ColorStateList f47024d;

        /* renamed from: e, reason: collision with root package name */
        ColorStateList f47025e;

        /* renamed from: f, reason: collision with root package name */
        ColorStateList f47026f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f47027g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f47028h;

        /* renamed from: i, reason: collision with root package name */
        Rect f47029i;

        /* renamed from: j, reason: collision with root package name */
        float f47030j;

        /* renamed from: k, reason: collision with root package name */
        float f47031k;

        /* renamed from: l, reason: collision with root package name */
        float f47032l;

        /* renamed from: m, reason: collision with root package name */
        int f47033m;

        /* renamed from: n, reason: collision with root package name */
        float f47034n;

        /* renamed from: o, reason: collision with root package name */
        float f47035o;

        /* renamed from: p, reason: collision with root package name */
        float f47036p;

        /* renamed from: q, reason: collision with root package name */
        int f47037q;

        /* renamed from: r, reason: collision with root package name */
        int f47038r;

        /* renamed from: s, reason: collision with root package name */
        int f47039s;

        /* renamed from: t, reason: collision with root package name */
        int f47040t;

        /* renamed from: u, reason: collision with root package name */
        boolean f47041u;

        /* renamed from: v, reason: collision with root package name */
        Paint.Style f47042v;

        public c(C5531k c5531k, X3.a aVar) {
            this.f47024d = null;
            this.f47025e = null;
            this.f47026f = null;
            this.f47027g = null;
            this.f47028h = PorterDuff.Mode.SRC_IN;
            this.f47029i = null;
            this.f47030j = 1.0f;
            this.f47031k = 1.0f;
            this.f47033m = 255;
            this.f47034n = 0.0f;
            this.f47035o = 0.0f;
            this.f47036p = 0.0f;
            this.f47037q = 0;
            this.f47038r = 0;
            this.f47039s = 0;
            this.f47040t = 0;
            this.f47041u = false;
            this.f47042v = Paint.Style.FILL_AND_STROKE;
            this.f47021a = c5531k;
            this.f47022b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C5527g c5527g = new C5527g(this);
            c5527g.f46999e = true;
            return c5527g;
        }

        public c(c cVar) {
            this.f47024d = null;
            this.f47025e = null;
            this.f47026f = null;
            this.f47027g = null;
            this.f47028h = PorterDuff.Mode.SRC_IN;
            this.f47029i = null;
            this.f47030j = 1.0f;
            this.f47031k = 1.0f;
            this.f47033m = 255;
            this.f47034n = 0.0f;
            this.f47035o = 0.0f;
            this.f47036p = 0.0f;
            this.f47037q = 0;
            this.f47038r = 0;
            this.f47039s = 0;
            this.f47040t = 0;
            this.f47041u = false;
            this.f47042v = Paint.Style.FILL_AND_STROKE;
            this.f47021a = cVar.f47021a;
            this.f47022b = cVar.f47022b;
            this.f47032l = cVar.f47032l;
            this.f47023c = cVar.f47023c;
            this.f47024d = cVar.f47024d;
            this.f47025e = cVar.f47025e;
            this.f47028h = cVar.f47028h;
            this.f47027g = cVar.f47027g;
            this.f47033m = cVar.f47033m;
            this.f47030j = cVar.f47030j;
            this.f47039s = cVar.f47039s;
            this.f47037q = cVar.f47037q;
            this.f47041u = cVar.f47041u;
            this.f47031k = cVar.f47031k;
            this.f47034n = cVar.f47034n;
            this.f47035o = cVar.f47035o;
            this.f47036p = cVar.f47036p;
            this.f47038r = cVar.f47038r;
            this.f47040t = cVar.f47040t;
            this.f47026f = cVar.f47026f;
            this.f47042v = cVar.f47042v;
            if (cVar.f47029i != null) {
                this.f47029i = new Rect(cVar.f47029i);
            }
        }
    }
}
