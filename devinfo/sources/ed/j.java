package ed;

import android.content.Context;
import android.content.res.ColorStateList;
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
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import com.google.android.gms.internal.ads.wj0;
import j$.util.Objects;
import java.util.BitSet;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class j extends Drawable implements y {
    public static final Paint F;
    public static final i[] G;
    public v4.f A;
    public final v4.e[] B;
    public float[] C;
    public float[] D;
    public lf.e E;

    /* renamed from: a, reason: collision with root package name */
    public final o7.d f23315a;

    /* renamed from: b, reason: collision with root package name */
    public h f23316b;

    /* renamed from: c, reason: collision with root package name */
    public final w[] f23317c;

    /* renamed from: d, reason: collision with root package name */
    public final w[] f23318d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f23319e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23320f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f23321h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f23322i;
    public final Path j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f23323k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f23324l;

    /* renamed from: m, reason: collision with root package name */
    public final Region f23325m;

    /* renamed from: n, reason: collision with root package name */
    public final Region f23326n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f23327o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f23328p;

    /* renamed from: q, reason: collision with root package name */
    public final dd.a f23329q;

    /* renamed from: r, reason: collision with root package name */
    public final p6.i f23330r;

    /* renamed from: s, reason: collision with root package name */
    public final wj0 f23331s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f23332t;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuffColorFilter f23333u;

    /* renamed from: v, reason: collision with root package name */
    public int f23334v;

    /* renamed from: w, reason: collision with root package name */
    public final RectF f23335w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f23336x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f23337y;

    /* renamed from: z, reason: collision with root package name */
    public o f23338z;

    static {
        Paint paint = new Paint(1);
        F = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        G = new i[4];
        int i4 = 0;
        while (true) {
            i[] iVarArr = G;
            if (i4 >= iVarArr.length) {
                return;
            }
            iVarArr[i4] = new i(i4);
            i4++;
        }
    }

    public j() {
        this(new o());
    }

    public static float c(RectF rectF, o oVar, float[] fArr) {
        if (fArr == null) {
            if (oVar.f(rectF)) {
                return oVar.f23357e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f10 = fArr[0];
            for (int i4 = 1; i4 < fArr.length; i4++) {
                if (fArr[i4] != f10) {
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
        h hVar = this.f23316b;
        this.f23331s.b(hVar.f23298a, this.C, hVar.j, rectF, this.f23330r, path);
        if (this.f23316b.f23305i != 1.0f) {
            Matrix matrix = this.f23321h;
            matrix.reset();
            float f10 = this.f23316b.f23305i;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f23335w, true);
    }

    public final int d(int i4) {
        int i10;
        h hVar = this.f23316b;
        float f10 = hVar.f23309n + 0.0f + hVar.f23308m;
        wc.a aVar = hVar.f23300c;
        if (aVar == null || !aVar.f36599a || v3.a.d(i4, 255) != aVar.f36602d) {
            return i4;
        }
        float fMin = (aVar.f36603e <= 0.0f || f10 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f10 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i4);
        int iO = i0.o(fMin, v3.a.d(i4, 255), aVar.f36600b);
        if (fMin > 0.0f && (i10 = aVar.f36601c) != 0) {
            iO = v3.a.b(v3.a.d(i10, wc.a.f36598f), iO);
        }
        return v3.a.d(iO, iAlpha);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[EDGE_INSN: B:68:0x009b->B:34:0x009b BREAK  A[LOOP:1: B:25:0x0082->B:30:0x008c]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.j.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        if (this.f23319e.cardinality() > 0) {
            Log.w("j", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i4 = this.f23316b.f23312q;
        Path path = this.f23322i;
        dd.a aVar = this.f23329q;
        if (i4 != 0) {
            canvas.drawPath(path, aVar.f22182a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            w wVar = this.f23317c[i10];
            int i11 = this.f23316b.f23311p;
            Matrix matrix = w.f23379b;
            wVar.a(matrix, aVar, i11, canvas);
            this.f23318d[i10].a(matrix, aVar, this.f23316b.f23311p, canvas);
        }
        if (this.f23336x) {
            double d10 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d10)) * this.f23316b.f23312q);
            int iCos = (int) (Math.cos(Math.toRadians(d10)) * this.f23316b.f23312q);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, F);
            canvas.translate(iSin, iCos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, o oVar, float[] fArr, RectF rectF) {
        float fC = c(rectF, oVar, fArr);
        if (fC < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f10 = fC * this.f23316b.j;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public void g(Canvas canvas) {
        o oVar = this.f23338z;
        float[] fArr = this.D;
        RectF rectFH = h();
        RectF rectF = this.f23324l;
        rectF.set(rectFH);
        float fJ = j();
        rectF.inset(fJ, fJ);
        f(canvas, this.f23328p, this.j, oVar, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f23316b.f23307l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f23316b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f23316b.f23310o == 2) {
            return;
        }
        RectF rectFH = h();
        if (rectFH.isEmpty()) {
            return;
        }
        float fC = c(rectFH, this.f23316b.f23298a, this.C);
        if (fC >= 0.0f) {
            outline.setRoundRect(getBounds(), fC * this.f23316b.j);
            return;
        }
        boolean z3 = this.f23320f;
        Path path = this.f23322i;
        if (z3) {
            b(rectFH, path);
            this.f23320f = false;
        }
        a4.l.i(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f23316b.f23304h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f23325m;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.f23322i;
        b(rectFH, path);
        Region region2 = this.f23326n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.f23323k;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        float[] fArr = this.C;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFH = h();
        o oVar = this.f23316b.f23298a;
        wj0 wj0Var = this.f23331s;
        wj0Var.getClass();
        float fA = oVar.f23357e.a(rectFH);
        o oVar2 = this.f23316b.f23298a;
        wj0Var.getClass();
        float fA2 = oVar2.f23359h.a(rectFH) + fA;
        o oVar3 = this.f23316b.f23298a;
        wj0Var.getClass();
        float fA3 = fA2 - oVar3.g.a(rectFH);
        o oVar4 = this.f23316b.f23298a;
        wj0Var.getClass();
        return (fA3 - oVar4.f23358f.a(rectFH)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f23320f = true;
        this.g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f23316b.f23303f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f23316b.getClass();
        ColorStateList colorStateList2 = this.f23316b.f23302e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f23316b.f23301d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        b0 b0Var = this.f23316b.f23299b;
        return b0Var != null && b0Var.d();
    }

    public final float j() {
        if (k()) {
            return this.f23328p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final boolean k() {
        Paint.Style style = this.f23316b.f23313r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f23328p.getStrokeWidth() > 0.0f;
    }

    public final void l(Context context) {
        this.f23316b.f23300c = new wc.a(context);
        v();
    }

    public final void m(v4.f fVar) {
        if (this.A == fVar) {
            return;
        }
        this.A = fVar;
        int i4 = 0;
        while (true) {
            v4.e[] eVarArr = this.B;
            if (i4 >= eVarArr.length) {
                t(getState(), true);
                invalidateSelf();
                return;
            }
            if (eVarArr[i4] == null) {
                eVarArr[i4] = new v4.e(this, G[i4]);
            }
            v4.e eVar = eVarArr[i4];
            v4.f fVar2 = new v4.f();
            fVar2.a((float) fVar.f35849b);
            double d10 = fVar.f35848a;
            fVar2.b((float) (d10 * d10));
            eVar.f35845m = fVar2;
            i4++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f23316b = new h(this.f23316b);
        return this;
    }

    public final void n(float f10) {
        h hVar = this.f23316b;
        if (hVar.f23309n != f10) {
            hVar.f23309n = f10;
            v();
        }
    }

    public final void o(ColorStateList colorStateList) {
        h hVar = this.f23316b;
        if (hVar.f23301d != colorStateList) {
            hVar.f23301d = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f23320f = true;
        this.g = true;
        super.onBoundsChange(rect);
        if (this.f23316b.f23299b != null && !rect.isEmpty()) {
            t(getState(), this.f23337y);
        }
        this.f23337y = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f23316b.f23299b != null) {
            t(iArr, false);
        }
        boolean z3 = s(iArr) || u();
        if (z3) {
            invalidateSelf();
        }
        return z3;
    }

    public final void p() {
        h hVar = this.f23316b;
        if (hVar.f23310o != 2) {
            hVar.f23310o = 2;
            super.invalidateSelf();
        }
    }

    public final void q(b0 b0Var) {
        h hVar = this.f23316b;
        if (hVar.f23299b != b0Var) {
            hVar.f23299b = b0Var;
            t(getState(), true);
            invalidateSelf();
        }
    }

    public final void r(ColorStateList colorStateList) {
        h hVar = this.f23316b;
        if (hVar.f23302e != colorStateList) {
            hVar.f23302e = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean s(int[] iArr) {
        boolean z3;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f23316b.f23301d == null || color2 == (colorForState2 = this.f23316b.f23301d.getColorForState(iArr, (color2 = (paint2 = this.f23327o).getColor())))) {
            z3 = false;
        } else {
            paint2.setColor(colorForState2);
            z3 = true;
        }
        if (this.f23316b.f23302e == null || color == (colorForState = this.f23316b.f23302e.getColorForState(iArr, (color = (paint = this.f23328p).getColor())))) {
            return z3;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        h hVar = this.f23316b;
        if (hVar.f23307l != i4) {
            hVar.f23307l = i4;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f23316b.getClass();
        super.invalidateSelf();
    }

    @Override // ed.y
    public final void setShapeAppearanceModel(o oVar) {
        h hVar = this.f23316b;
        hVar.f23298a = oVar;
        hVar.f23299b = null;
        this.C = null;
        this.D = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f23316b.f23303f = colorStateList;
        u();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        h hVar = this.f23316b;
        if (hVar.g != mode) {
            hVar.g = mode;
            u();
            super.invalidateSelf();
        }
    }

    public final void t(int[] iArr, boolean z3) {
        o oVarA;
        int i4;
        RectF rectFH = h();
        if (this.f23316b.f23299b == null || rectFH.isEmpty()) {
            return;
        }
        boolean z10 = z3 | (this.A == null);
        if (this.C == null) {
            this.C = new float[4];
        }
        b0 b0Var = this.f23316b.f23299b;
        o[] oVarArr = b0Var.f23269d;
        int i10 = b0Var.f23266a;
        int[][] iArr2 = b0Var.f23268c;
        z zVar = b0Var.f23272h;
        z zVar2 = b0Var.g;
        z zVar3 = b0Var.f23271f;
        z zVar4 = b0Var.f23270e;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                i11 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i12 = 0;
            while (true) {
                if (i12 >= i10) {
                    i4 = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i12], iArr3)) {
                        i4 = i12;
                        break;
                    }
                    i12++;
                }
            }
            i11 = i4;
        }
        if (zVar4 == null && zVar3 == null && zVar2 == null && zVar == null) {
            oVarA = oVarArr[i11];
        } else {
            n nVarG = oVarArr[i11].g();
            if (zVar4 != null) {
                nVarG.f23346e = zVar4.c(iArr);
            }
            if (zVar3 != null) {
                nVarG.f23347f = zVar3.c(iArr);
            }
            if (zVar2 != null) {
                nVarG.f23348h = zVar2.c(iArr);
            }
            if (zVar != null) {
                nVarG.g = zVar.c(iArr);
            }
            oVarA = nVarG.a();
        }
        int i13 = 0;
        while (i13 < 4) {
            this.f23331s.getClass();
            float fA = (i13 != 1 ? i13 != 2 ? i13 != 3 ? oVarA.f23358f : oVarA.f23357e : oVarA.f23359h : oVarA.g).a(rectFH);
            if (z10) {
                this.C[i13] = fA;
            }
            v4.e[] eVarArr = this.B;
            v4.e eVar = eVarArr[i13];
            if (eVar != null) {
                eVar.a(fA);
                if (z10) {
                    eVarArr[i13].d();
                }
            }
            i13++;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    public final boolean u() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f23332t;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f23333u;
        h hVar = this.f23316b;
        ColorStateList colorStateList = hVar.f23303f;
        PorterDuff.Mode mode = hVar.g;
        if (colorStateList == null || mode == null) {
            int color = this.f23327o.getColor();
            int iD = d(color);
            this.f23334v = iD;
            porterDuffColorFilter = iD != color ? new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iD2 = d(colorStateList.getColorForState(getState(), 0));
            this.f23334v = iD2;
            porterDuffColorFilter = new PorterDuffColorFilter(iD2, mode);
        }
        this.f23332t = porterDuffColorFilter;
        this.f23316b.getClass();
        this.f23333u = null;
        this.f23316b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f23332t) && Objects.equals(porterDuffColorFilter3, this.f23333u)) ? false : true;
    }

    public final void v() {
        h hVar = this.f23316b;
        float f10 = hVar.f23309n + 0.0f;
        hVar.f23311p = (int) Math.ceil(0.75f * f10);
        this.f23316b.f23312q = (int) Math.ceil(f10 * 0.25f);
        u();
        super.invalidateSelf();
    }

    public j(Context context, AttributeSet attributeSet, int i4, int i10) {
        this(o.c(context, attributeSet, i4, i10).a());
    }

    public j(o oVar) {
        this(new h(oVar));
    }

    public j(h hVar) {
        wj0 wj0Var;
        this.f23315a = new o7.d(16, this);
        this.f23317c = new w[4];
        this.f23318d = new w[4];
        this.f23319e = new BitSet(8);
        this.f23321h = new Matrix();
        this.f23322i = new Path();
        this.j = new Path();
        this.f23323k = new RectF();
        this.f23324l = new RectF();
        this.f23325m = new Region();
        this.f23326n = new Region();
        Paint paint = new Paint(1);
        this.f23327o = paint;
        Paint paint2 = new Paint(1);
        this.f23328p = paint2;
        this.f23329q = new dd.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            wj0Var = p.f23363a;
        } else {
            wj0Var = new wj0();
        }
        this.f23331s = wj0Var;
        this.f23335w = new RectF();
        this.f23336x = true;
        this.f23337y = true;
        this.B = new v4.e[4];
        this.f23316b = hVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        u();
        s(getState());
        this.f23330r = new p6.i(this);
    }
}
