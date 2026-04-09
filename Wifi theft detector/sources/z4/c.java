package z4;

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

/* loaded from: classes2.dex */
public class c extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f25336b;

    /* renamed from: h, reason: collision with root package name */
    public float f25342h;

    /* renamed from: i, reason: collision with root package name */
    public int f25343i;

    /* renamed from: j, reason: collision with root package name */
    public int f25344j;

    /* renamed from: k, reason: collision with root package name */
    public int f25345k;

    /* renamed from: l, reason: collision with root package name */
    public int f25346l;

    /* renamed from: m, reason: collision with root package name */
    public int f25347m;

    /* renamed from: o, reason: collision with root package name */
    public com.google.android.material.shape.a f25349o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f25350p;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.material.shape.b f25335a = com.google.android.material.shape.b.l();

    /* renamed from: c, reason: collision with root package name */
    public final Path f25337c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f25338d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final RectF f25339e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f25340f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final b f25341g = new b();

    /* renamed from: n, reason: collision with root package name */
    public boolean f25348n = true;

    public class b extends Drawable.ConstantState {
        public b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return c.this;
        }
    }

    public c(com.google.android.material.shape.a aVar) {
        this.f25349o = aVar;
        Paint paint = new Paint(1);
        this.f25336b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public final Shader a() {
        copyBounds(this.f25338d);
        float fHeight = this.f25342h / r1.height();
        return new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{j0.a.g(this.f25343i, this.f25347m), j0.a.g(this.f25344j, this.f25347m), j0.a.g(j0.a.k(this.f25344j, 0), this.f25347m), j0.a.g(j0.a.k(this.f25346l, 0), this.f25347m), j0.a.g(this.f25346l, this.f25347m), j0.a.g(this.f25345k, this.f25347m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    public RectF b() {
        this.f25340f.set(getBounds());
        return this.f25340f;
    }

    public void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f25347m = colorStateList.getColorForState(getState(), this.f25347m);
        }
        this.f25350p = colorStateList;
        this.f25348n = true;
        invalidateSelf();
    }

    public void d(float f10) {
        if (this.f25342h != f10) {
            this.f25342h = f10;
            this.f25336b.setStrokeWidth(f10 * 1.3333f);
            this.f25348n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f25348n) {
            this.f25336b.setShader(a());
            this.f25348n = false;
        }
        float strokeWidth = this.f25336b.getStrokeWidth() / 2.0f;
        copyBounds(this.f25338d);
        this.f25339e.set(this.f25338d);
        float fMin = Math.min(this.f25349o.r().a(b()), this.f25339e.width() / 2.0f);
        if (this.f25349o.v(b())) {
            this.f25339e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f25339e, fMin, fMin, this.f25336b);
        }
    }

    public void e(int i10, int i11, int i12, int i13) {
        this.f25343i = i10;
        this.f25344j = i11;
        this.f25345k = i12;
        this.f25346l = i13;
    }

    public void f(com.google.android.material.shape.a aVar) {
        this.f25349o = aVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f25341g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f25342h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f25349o.v(b())) {
            outline.setRoundRect(getBounds(), this.f25349o.r().a(b()));
        } else {
            copyBounds(this.f25338d);
            this.f25339e.set(this.f25338d);
            this.f25335a.d(this.f25349o, 1.0f, this.f25339e, this.f25337c);
            w4.d.j(outline, this.f25337c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f25349o.v(b())) {
            return true;
        }
        int iRound = Math.round(this.f25342h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f25350p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f25348n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f25350p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f25347m)) != this.f25347m) {
            this.f25348n = true;
            this.f25347m = colorForState;
        }
        if (this.f25348n) {
            invalidateSelf();
        }
        return this.f25348n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f25336b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f25336b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
