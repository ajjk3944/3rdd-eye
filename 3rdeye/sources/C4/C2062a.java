package c4;

import android.annotation.TargetApi;
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
import l4.C5290i;
import l4.InterfaceC5284c;
import l4.j;

/* compiled from: BorderDrawable.java */
/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2062a extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f18461b;

    /* renamed from: h, reason: collision with root package name */
    public float f18467h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f18468j;

    /* renamed from: k, reason: collision with root package name */
    public int f18469k;

    /* renamed from: l, reason: collision with root package name */
    public int f18470l;

    /* renamed from: m, reason: collision with root package name */
    public int f18471m;

    /* renamed from: o, reason: collision with root package name */
    public C5290i f18473o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f18474p;

    /* renamed from: a, reason: collision with root package name */
    public final j f18460a = j.a.f43833a;

    /* renamed from: c, reason: collision with root package name */
    public final Path f18462c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f18463d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final RectF f18464e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f18465f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final C0278a f18466g = new C0278a();

    /* renamed from: n, reason: collision with root package name */
    public boolean f18472n = true;

    /* compiled from: BorderDrawable.java */
    /* renamed from: c4.a$a, reason: collision with other inner class name */
    public class C0278a extends Drawable.ConstantState {
        public C0278a() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return C2062a.this;
        }
    }

    public C2062a(C5290i c5290i) {
        this.f18473o = c5290i;
        Paint paint = new Paint(1);
        this.f18461b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10 = this.f18472n;
        Paint paint = this.f18461b;
        Rect rect = this.f18463d;
        if (z10) {
            copyBounds(rect);
            float fHeight = this.f18467h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{C0.d.c(this.i, this.f18471m), C0.d.c(this.f18468j, this.f18471m), C0.d.c(C0.d.e(this.f18468j, 0), this.f18471m), C0.d.c(C0.d.e(this.f18470l, 0), this.f18471m), C0.d.c(this.f18470l, this.f18471m), C0.d.c(this.f18469k, this.f18471m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f18472n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f18464e;
        rectF.set(rect);
        InterfaceC5284c interfaceC5284c = this.f18473o.f43804e;
        RectF rectF2 = this.f18465f;
        rectF2.set(getBounds());
        float fMin = Math.min(interfaceC5284c.a(rectF2), rectF.width() / 2.0f);
        C5290i c5290i = this.f18473o;
        rectF2.set(getBounds());
        if (c5290i.d(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f18466g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f18467h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        C5290i c5290i = this.f18473o;
        RectF rectF = this.f18465f;
        rectF.set(getBounds());
        if (c5290i.d(rectF)) {
            InterfaceC5284c interfaceC5284c = this.f18473o.f43804e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), interfaceC5284c.a(rectF));
            return;
        }
        Rect rect = this.f18463d;
        copyBounds(rect);
        RectF rectF2 = this.f18464e;
        rectF2.set(rect);
        C5290i c5290i2 = this.f18473o;
        Path path = this.f18462c;
        this.f18460a.a(c5290i2, 1.0f, rectF2, null, path);
        Z3.a.b(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C5290i c5290i = this.f18473o;
        RectF rectF = this.f18465f;
        rectF.set(getBounds());
        if (!c5290i.d(rectF)) {
            return true;
        }
        int iRound = Math.round(this.f18467h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f18474p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f18472n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f18474p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f18471m)) != this.f18471m) {
            this.f18472n = true;
            this.f18471m = colorForState;
        }
        if (this.f18472n) {
            invalidateSelf();
        }
        return this.f18472n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f18461b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f18461b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
