package v3;

import G3.InterfaceC0150d;
import G3.o;
import G3.p;
import G3.q;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2961a extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f23832b;

    /* renamed from: h, reason: collision with root package name */
    public float f23838h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f23839j;

    /* renamed from: k, reason: collision with root package name */
    public int f23840k;

    /* renamed from: l, reason: collision with root package name */
    public int f23841l;

    /* renamed from: m, reason: collision with root package name */
    public int f23842m;

    /* renamed from: o, reason: collision with root package name */
    public o f23844o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f23845p;

    /* renamed from: a, reason: collision with root package name */
    public final q f23831a = p.f1635a;

    /* renamed from: c, reason: collision with root package name */
    public final Path f23833c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f23834d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final RectF f23835e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f23836f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final M0.e f23837g = new M0.e(this);

    /* renamed from: n, reason: collision with root package name */
    public boolean f23843n = true;

    public C2961a(o oVar) {
        this.f23844o = oVar;
        Paint paint = new Paint(1);
        this.f23832b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z6 = this.f23843n;
        Rect rect = this.f23834d;
        Paint paint = this.f23832b;
        if (z6) {
            copyBounds(rect);
            float fHeight = this.f23838h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{J.a.c(this.i, this.f23842m), J.a.c(this.f23839j, this.f23842m), J.a.c(J.a.e(this.f23839j, 0), this.f23842m), J.a.c(J.a.e(this.f23841l, 0), this.f23842m), J.a.c(this.f23841l, this.f23842m), J.a.c(this.f23840k, this.f23842m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f23843n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f23835e;
        rectF.set(rect);
        InterfaceC0150d interfaceC0150d = this.f23844o.f1628e;
        Rect bounds = getBounds();
        RectF rectF2 = this.f23836f;
        rectF2.set(bounds);
        float fMin = Math.min(interfaceC0150d.a(rectF2), rectF.width() / 2.0f);
        o oVar = this.f23844o;
        rectF2.set(getBounds());
        if (oVar.f(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f23837g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f23838h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        o oVar = this.f23844o;
        Rect bounds = getBounds();
        RectF rectF = this.f23836f;
        rectF.set(bounds);
        if (oVar.f(rectF)) {
            InterfaceC0150d interfaceC0150d = this.f23844o.f1628e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), interfaceC0150d.a(rectF));
            return;
        }
        Rect rect = this.f23834d;
        copyBounds(rect);
        RectF rectF2 = this.f23835e;
        rectF2.set(rect);
        o oVar2 = this.f23844o;
        q qVar = this.f23831a;
        Path path = this.f23833c;
        qVar.a(oVar2, null, 1.0f, rectF2, null, path);
        R2.a.F(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        o oVar = this.f23844o;
        Rect bounds = getBounds();
        RectF rectF = this.f23836f;
        rectF.set(bounds);
        if (!oVar.f(rectF)) {
            return true;
        }
        int iRound = Math.round(this.f23838h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f23845p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f23843n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f23845p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f23842m)) != this.f23842m) {
            this.f23843n = true;
            this.f23842m = colorForState;
        }
        if (this.f23843n) {
            invalidateSelf();
        }
        return this.f23843n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f23832b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23832b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
