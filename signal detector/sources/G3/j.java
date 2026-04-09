package G3;

import a.AbstractC0241a;
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
import android.util.StateSet;
import e0.C2297e;
import j$.util.Objects;
import java.util.BitSet;

/* loaded from: classes.dex */
public class j extends Drawable implements z {

    /* renamed from: T, reason: collision with root package name */
    public static final Paint f1578T;

    /* renamed from: U, reason: collision with root package name */
    public static final C0155i[] f1579U;

    /* renamed from: C, reason: collision with root package name */
    public final Paint f1580C;

    /* renamed from: D, reason: collision with root package name */
    public final Paint f1581D;

    /* renamed from: E, reason: collision with root package name */
    public final F3.a f1582E;

    /* renamed from: F, reason: collision with root package name */
    public final U0.j f1583F;

    /* renamed from: G, reason: collision with root package name */
    public final q f1584G;

    /* renamed from: H, reason: collision with root package name */
    public PorterDuffColorFilter f1585H;

    /* renamed from: I, reason: collision with root package name */
    public PorterDuffColorFilter f1586I;

    /* renamed from: J, reason: collision with root package name */
    public int f1587J;

    /* renamed from: K, reason: collision with root package name */
    public final RectF f1588K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f1589L;
    public boolean M;

    /* renamed from: N, reason: collision with root package name */
    public o f1590N;

    /* renamed from: O, reason: collision with root package name */
    public e0.f f1591O;

    /* renamed from: P, reason: collision with root package name */
    public final C2297e[] f1592P;

    /* renamed from: Q, reason: collision with root package name */
    public float[] f1593Q;

    /* renamed from: R, reason: collision with root package name */
    public float[] f1594R;

    /* renamed from: S, reason: collision with root package name */
    public F4.c f1595S;

    /* renamed from: a, reason: collision with root package name */
    public final A0.e f1596a;

    /* renamed from: b, reason: collision with root package name */
    public C0154h f1597b;

    /* renamed from: c, reason: collision with root package name */
    public final x[] f1598c;

    /* renamed from: d, reason: collision with root package name */
    public final x[] f1599d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f1600e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1601f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1602g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f1603h;
    public final Path i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f1604j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f1605k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f1606l;

    /* renamed from: m, reason: collision with root package name */
    public final Region f1607m;

    /* renamed from: n, reason: collision with root package name */
    public final Region f1608n;

    static {
        int i = 0;
        AbstractC0241a abstractC0241aD = a4.p.d(0);
        n.b(abstractC0241aD);
        n.b(abstractC0241aD);
        n.b(abstractC0241aD);
        n.b(abstractC0241aD);
        Paint paint = new Paint(1);
        f1578T = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f1579U = new C0155i[4];
        while (true) {
            C0155i[] c0155iArr = f1579U;
            if (i >= c0155iArr.length) {
                return;
            }
            c0155iArr[i] = new C0155i(i);
            i++;
        }
    }

    public j() {
        this(new o());
    }

    public static float c(RectF rectF, o oVar, float[] fArr) {
        if (fArr == null) {
            if (oVar.f(rectF)) {
                return oVar.f1628e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f2 = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f2) {
                    return -1.0f;
                }
            }
        }
        if (oVar.e()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        C0154h c0154h = this.f1597b;
        this.f1584G.a(c0154h.f1560a, this.f1593Q, c0154h.f1568j, rectF, this.f1583F, path);
        if (this.f1597b.i != 1.0f) {
            Matrix matrix = this.f1603h;
            matrix.reset();
            float f2 = this.f1597b.i;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f1588K, true);
    }

    public final int d(int i) {
        C0154h c0154h = this.f1597b;
        float f2 = c0154h.f1572n + 0.0f + c0154h.f1571m;
        t3.a aVar = c0154h.f1562c;
        return aVar != null ? aVar.a(i, f2) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.f1585H;
        Paint paint2 = this.f1580C;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.f1597b.f1570l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1586I;
        Paint paint3 = this.f1581D;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f1597b.f1569k);
        int alpha2 = paint3.getAlpha();
        int i3 = this.f1597b.f1570l;
        paint3.setAlpha(((i3 + (i3 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.f1597b.f1576r;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z6 = this.f1601f;
            paint = paint2;
            Path path = this.i;
            if (z6) {
                b(h(), path);
                this.f1601f = false;
            }
            C0154h c0154h = this.f1597b;
            int i6 = c0154h.f1573o;
            if (i6 != 1 && c0154h.f1574p > 0 && (i6 == 2 || (!n() && !path.isConvex() && Build.VERSION.SDK_INT < 29))) {
                canvas.save();
                double d6 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d6)) * this.f1597b.f1575q), (int) (Math.cos(Math.toRadians(d6)) * this.f1597b.f1575q));
                if (this.f1589L) {
                    RectF rectF = this.f1588K;
                    int iWidth = (int) (rectF.width() - getBounds().width());
                    int iHeight = (int) (rectF.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f1597b.f1574p * 2) + ((int) rectF.width()) + iWidth, (this.f1597b.f1574p * 2) + ((int) rectF.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f2 = (getBounds().left - this.f1597b.f1574p) - iWidth;
                    float f5 = (getBounds().top - this.f1597b.f1574p) - iHeight;
                    canvas2.translate(-f2, -f5);
                    e(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f2, f5, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            f(canvas, paint, path, this.f1597b.f1560a, this.f1593Q, h());
        } else {
            paint = paint2;
        }
        if (l()) {
            if (this.f1602g) {
                o oVar = this.f1597b.f1560a;
                n nVarG = oVar.g();
                InterfaceC0150d interfaceC0150d = oVar.f1628e;
                A0.e eVar = this.f1596a;
                nVarG.f1616e = eVar.g(interfaceC0150d);
                nVarG.f1617f = eVar.g(oVar.f1629f);
                nVarG.f1619h = eVar.g(oVar.f1631h);
                nVarG.f1618g = eVar.g(oVar.f1630g);
                this.f1590N = nVarG.a();
                float[] fArr = this.f1593Q;
                if (fArr != null) {
                    if (this.f1594R == null) {
                        this.f1594R = new float[fArr.length];
                    }
                    float fJ = j();
                    int i7 = 0;
                    while (true) {
                        float[] fArr2 = this.f1593Q;
                        if (i7 >= fArr2.length) {
                            break;
                        }
                        this.f1594R[i7] = Math.max(0.0f, fArr2[i7] - fJ);
                        i7++;
                    }
                } else {
                    this.f1594R = null;
                }
                o oVar2 = this.f1590N;
                float[] fArr3 = this.f1594R;
                float f6 = this.f1597b.f1568j;
                RectF rectFH = h();
                RectF rectF2 = this.f1606l;
                rectF2.set(rectFH);
                float fJ2 = j();
                rectF2.inset(fJ2, fJ2);
                this.f1584G.a(oVar2, fArr3, f6, rectF2, null, this.f1604j);
                this.f1602g = false;
            }
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.f1600e.cardinality() > 0) {
            Log.w("j", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f1597b.f1575q;
        Path path = this.i;
        F3.a aVar = this.f1582E;
        if (i != 0) {
            canvas.drawPath(path, aVar.f1445a);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            x xVar = this.f1598c[i3];
            int i6 = this.f1597b.f1574p;
            Matrix matrix = x.f1663b;
            xVar.a(matrix, aVar, i6, canvas);
            this.f1599d[i3].a(matrix, aVar, this.f1597b.f1574p, canvas);
        }
        if (this.f1589L) {
            double d6 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d6)) * this.f1597b.f1575q);
            int iCos = (int) (Math.cos(Math.toRadians(d6)) * this.f1597b.f1575q);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f1578T);
            canvas.translate(iSin, iCos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, o oVar, float[] fArr, RectF rectF) {
        float fC = c(rectF, oVar, fArr);
        if (fC < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f2 = fC * this.f1597b.f1568j;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    public void g(Canvas canvas) {
        o oVar = this.f1590N;
        float[] fArr = this.f1594R;
        RectF rectFH = h();
        RectF rectF = this.f1606l;
        rectF.set(rectFH);
        float fJ = j();
        rectF.inset(fJ, fJ);
        f(canvas, this.f1581D, this.f1604j, oVar, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1597b.f1570l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1597b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f1597b.f1573o == 2) {
            return;
        }
        RectF rectFH = h();
        if (rectFH.isEmpty()) {
            return;
        }
        float fC = c(rectFH, this.f1597b.f1560a, this.f1593Q);
        if (fC >= 0.0f) {
            outline.setRoundRect(getBounds(), fC * this.f1597b.f1568j);
            return;
        }
        boolean z6 = this.f1601f;
        Path path = this.i;
        if (z6) {
            b(rectFH, path);
            this.f1601f = false;
        }
        R2.a.F(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f1597b.f1567h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f1607m;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.i;
        b(rectFH, path);
        Region region2 = this.f1608n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.f1605k;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        float[] fArr = this.f1593Q;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFH = h();
        o oVar = this.f1597b.f1560a;
        q qVar = this.f1584G;
        qVar.getClass();
        float fA = oVar.f1628e.a(rectFH);
        o oVar2 = this.f1597b.f1560a;
        qVar.getClass();
        float fA2 = oVar2.f1631h.a(rectFH) + fA;
        o oVar3 = this.f1597b.f1560a;
        qVar.getClass();
        float fA3 = fA2 - oVar3.f1630g.a(rectFH);
        o oVar4 = this.f1597b.f1560a;
        qVar.getClass();
        return (fA3 - oVar4.f1629f.a(rectFH)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f1601f = true;
        this.f1602g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f1597b.f1565f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f1597b.getClass();
        ColorStateList colorStateList2 = this.f1597b.f1564e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f1597b.f1563d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        G g2 = this.f1597b.f1561b;
        return g2 != null && g2.d();
    }

    public final float j() {
        if (l()) {
            return this.f1581D.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float k() {
        float[] fArr = this.f1593Q;
        return fArr != null ? fArr[3] : this.f1597b.f1560a.f1628e.a(h());
    }

    public final boolean l() {
        Paint.Style style = this.f1597b.f1576r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f1581D.getStrokeWidth() > 0.0f;
    }

    public final void m(Context context) {
        this.f1597b.f1562c = new t3.a(context);
        z();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f1597b = new C0154h(this.f1597b);
        return this;
    }

    public final boolean n() {
        if (!this.f1597b.f1560a.f(h())) {
            float[] fArr = this.f1593Q;
            if (fArr != null) {
                if (fArr.length > 1) {
                    float f2 = fArr[0];
                    for (int i = 1; i < fArr.length; i++) {
                        if (fArr[i] != f2) {
                            break;
                        }
                    }
                }
                if (this.f1597b.f1560a.e()) {
                }
            }
            return false;
        }
        return true;
    }

    public final void o(e0.f fVar) {
        if (this.f1591O == fVar) {
            return;
        }
        this.f1591O = fVar;
        int i = 0;
        while (true) {
            C2297e[] c2297eArr = this.f1592P;
            if (i >= c2297eArr.length) {
                x(getState(), true);
                invalidateSelf();
                return;
            }
            if (c2297eArr[i] == null) {
                c2297eArr[i] = new C2297e(this, f1579U[i]);
            }
            C2297e c2297e = c2297eArr[i];
            e0.f fVar2 = new e0.f();
            fVar2.a((float) fVar.f19888b);
            double d6 = fVar.f19887a;
            fVar2.b((float) (d6 * d6));
            c2297e.f19884k = fVar2;
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f1601f = true;
        this.f1602g = true;
        super.onBoundsChange(rect);
        if (this.f1597b.f1561b != null && !rect.isEmpty()) {
            x(getState(), this.M);
        }
        this.M = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f1597b.f1561b != null) {
            x(iArr, false);
        }
        boolean z6 = w(iArr) || y();
        if (z6) {
            invalidateSelf();
        }
        return z6;
    }

    public final void p(float f2) {
        C0154h c0154h = this.f1597b;
        if (c0154h.f1572n != f2) {
            c0154h.f1572n = f2;
            z();
        }
    }

    public final void q(ColorStateList colorStateList) {
        C0154h c0154h = this.f1597b;
        if (c0154h.f1563d != colorStateList) {
            c0154h.f1563d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void r(float f2) {
        C0154h c0154h = this.f1597b;
        if (c0154h.f1568j != f2) {
            c0154h.f1568j = f2;
            this.f1601f = true;
            this.f1602g = true;
            invalidateSelf();
        }
    }

    public final void s() {
        this.f1582E.a(-12303292);
        this.f1597b.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C0154h c0154h = this.f1597b;
        if (c0154h.f1570l != i) {
            c0154h.f1570l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1597b.getClass();
        super.invalidateSelf();
    }

    @Override // G3.z
    public final void setShapeAppearanceModel(o oVar) {
        C0154h c0154h = this.f1597b;
        c0154h.f1560a = oVar;
        c0154h.f1561b = null;
        this.f1593Q = null;
        this.f1594R = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1597b.f1565f = colorStateList;
        y();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C0154h c0154h = this.f1597b;
        if (c0154h.f1566g != mode) {
            c0154h.f1566g = mode;
            y();
            super.invalidateSelf();
        }
    }

    public final void t() {
        C0154h c0154h = this.f1597b;
        if (c0154h.f1573o != 2) {
            c0154h.f1573o = 2;
            super.invalidateSelf();
        }
    }

    public final void u(G g2) {
        C0154h c0154h = this.f1597b;
        if (c0154h.f1561b != g2) {
            c0154h.f1561b = g2;
            x(getState(), true);
            invalidateSelf();
        }
    }

    public final void v(ColorStateList colorStateList) {
        C0154h c0154h = this.f1597b;
        if (c0154h.f1564e != colorStateList) {
            c0154h.f1564e = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean w(int[] iArr) {
        boolean z6;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f1597b.f1563d == null || color2 == (colorForState2 = this.f1597b.f1563d.getColorForState(iArr, (color2 = (paint2 = this.f1580C).getColor())))) {
            z6 = false;
        } else {
            paint2.setColor(colorForState2);
            z6 = true;
        }
        if (this.f1597b.f1564e == null || color == (colorForState = this.f1597b.f1564e.getColorForState(iArr, (color = (paint = this.f1581D).getColor())))) {
            return z6;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void x(int[] iArr, boolean z6) {
        o oVarA;
        int i;
        RectF rectFH = h();
        if (this.f1597b.f1561b == null || rectFH.isEmpty()) {
            return;
        }
        boolean z7 = z6 | (this.f1591O == null);
        if (this.f1593Q == null) {
            this.f1593Q = new float[4];
        }
        G g2 = this.f1597b.f1561b;
        o[] oVarArr = g2.f1543d;
        int i3 = g2.f1540a;
        int[][] iArr2 = g2.f1542c;
        E e6 = g2.f1547h;
        E e7 = g2.f1546g;
        E e8 = g2.f1545f;
        E e9 = g2.f1544e;
        int i6 = 0;
        while (true) {
            if (i6 >= i3) {
                i6 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i6], iArr)) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i7 = 0;
            while (true) {
                if (i7 >= i3) {
                    i = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i7], iArr3)) {
                        i = i7;
                        break;
                    }
                    i7++;
                }
            }
            i6 = i;
        }
        if (e9 == null && e8 == null && e7 == null && e6 == null) {
            oVarA = oVarArr[i6];
        } else {
            n nVarG = oVarArr[i6].g();
            if (e9 != null) {
                nVarG.f1616e = e9.c(iArr);
            }
            if (e8 != null) {
                nVarG.f1617f = e8.c(iArr);
            }
            if (e7 != null) {
                nVarG.f1619h = e7.c(iArr);
            }
            if (e6 != null) {
                nVarG.f1618g = e6.c(iArr);
            }
            oVarA = nVarG.a();
        }
        int i8 = 0;
        while (i8 < 4) {
            this.f1584G.getClass();
            float fA = (i8 != 1 ? i8 != 2 ? i8 != 3 ? oVarA.f1629f : oVarA.f1628e : oVarA.f1631h : oVarA.f1630g).a(rectFH);
            if (z7) {
                this.f1593Q[i8] = fA;
            }
            C2297e[] c2297eArr = this.f1592P;
            C2297e c2297e = c2297eArr[i8];
            if (c2297e != null) {
                c2297e.a(fA);
                if (z7) {
                    c2297eArr[i8].d();
                }
            }
            i8++;
        }
        if (z7) {
            invalidateSelf();
        }
    }

    public final boolean y() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1585H;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f1586I;
        C0154h c0154h = this.f1597b;
        ColorStateList colorStateList = c0154h.f1565f;
        PorterDuff.Mode mode = c0154h.f1566g;
        if (colorStateList == null || mode == null) {
            int color = this.f1580C.getColor();
            int iD = d(color);
            this.f1587J = iD;
            porterDuffColorFilter = iD != color ? new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iD2 = d(colorStateList.getColorForState(getState(), 0));
            this.f1587J = iD2;
            porterDuffColorFilter = new PorterDuffColorFilter(iD2, mode);
        }
        this.f1585H = porterDuffColorFilter;
        this.f1597b.getClass();
        this.f1586I = null;
        this.f1597b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f1585H) && Objects.equals(porterDuffColorFilter3, this.f1586I)) ? false : true;
    }

    public final void z() {
        C0154h c0154h = this.f1597b;
        float f2 = c0154h.f1572n + 0.0f;
        c0154h.f1574p = (int) Math.ceil(0.75f * f2);
        this.f1597b.f1575q = (int) Math.ceil(f2 * 0.25f);
        y();
        super.invalidateSelf();
    }

    public j(Context context, AttributeSet attributeSet, int i, int i3) {
        this(o.c(context, attributeSet, i, i3).a());
    }

    public j(o oVar) {
        this(new C0154h(oVar));
    }

    public j(C0154h c0154h) {
        q qVar;
        this.f1596a = new A0.e(5, this);
        this.f1598c = new x[4];
        this.f1599d = new x[4];
        this.f1600e = new BitSet(8);
        this.f1603h = new Matrix();
        this.i = new Path();
        this.f1604j = new Path();
        this.f1605k = new RectF();
        this.f1606l = new RectF();
        this.f1607m = new Region();
        this.f1608n = new Region();
        Paint paint = new Paint(1);
        this.f1580C = paint;
        Paint paint2 = new Paint(1);
        this.f1581D = paint2;
        this.f1582E = new F3.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            qVar = p.f1635a;
        } else {
            qVar = new q();
        }
        this.f1584G = qVar;
        this.f1588K = new RectF();
        this.f1589L = true;
        this.M = true;
        this.f1592P = new C2297e[4];
        this.f1597b = c0154h;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        y();
        w(getState());
        this.f1583F = new U0.j(3, this);
    }
}
