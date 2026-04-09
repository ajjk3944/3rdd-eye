package P3;

import G3.C0153g;
import G3.j;
import G3.k;
import G3.n;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import x3.x;
import x3.y;

/* loaded from: classes.dex */
public final class b extends j implements x {

    /* renamed from: V, reason: collision with root package name */
    public CharSequence f3128V;

    /* renamed from: W, reason: collision with root package name */
    public final Context f3129W;

    /* renamed from: X, reason: collision with root package name */
    public final Paint.FontMetrics f3130X;

    /* renamed from: Y, reason: collision with root package name */
    public final y f3131Y;

    /* renamed from: Z, reason: collision with root package name */
    public final a f3132Z;

    /* renamed from: a0, reason: collision with root package name */
    public final Rect f3133a0;
    public int b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f3134c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f3135d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f3136e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f3137f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f3138g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f3139h0;

    /* renamed from: i0, reason: collision with root package name */
    public float f3140i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f3141j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f3142k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f3143l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f3144m0;

    public b(Context context, int i) {
        super(context, null, 0, i);
        this.f3130X = new Paint.FontMetrics();
        y yVar = new y(this);
        this.f3131Y = yVar;
        this.f3132Z = new a(0, this);
        this.f3133a0 = new Rect();
        this.f3140i0 = 1.0f;
        this.f3141j0 = 1.0f;
        this.f3142k0 = 0.5f;
        this.f3143l0 = 0.5f;
        this.f3144m0 = 1.0f;
        this.f3129W = context;
        float f2 = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = yVar.f24176a;
        textPaint.density = f2;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final float A() {
        int i;
        Rect rect = this.f3133a0;
        if (((rect.right - getBounds().right) - this.f3139h0) - this.f3136e0 < 0) {
            i = ((rect.right - getBounds().right) - this.f3139h0) - this.f3136e0;
        } else {
            if (((rect.left - getBounds().left) - this.f3139h0) + this.f3136e0 <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.f3139h0) + this.f3136e0;
        }
        return i;
    }

    public final k B() {
        float f2 = -A();
        float fWidth = (float) ((getBounds().width() - (Math.sqrt(2.0d) * this.f3138g0)) / 2.0d);
        return new k(new C0153g(this.f3138g0), Math.min(Math.max(f2, -fWidth), fWidth));
    }

    @Override // G3.j, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float fA = A();
        float f2 = (float) (-((Math.sqrt(2.0d) * this.f3138g0) - this.f3138g0));
        canvas.scale(this.f3140i0, this.f3141j0, (getBounds().width() * this.f3142k0) + getBounds().left, (getBounds().height() * this.f3143l0) + getBounds().top);
        canvas.translate(fA, f2);
        super.draw(canvas);
        if (this.f3128V == null) {
            canvas2 = canvas;
        } else {
            float fCenterY = getBounds().centerY();
            y yVar = this.f3131Y;
            TextPaint textPaint = yVar.f24176a;
            Paint.FontMetrics fontMetrics = this.f3130X;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (yVar.f24182g != null) {
                textPaint.drawableState = getState();
                yVar.f24182g.d(this.f3129W, yVar.f24176a, yVar.f24177b);
                textPaint.setAlpha((int) (this.f3144m0 * 255.0f));
            }
            CharSequence charSequence = this.f3128V;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.f3131Y.f24176a.getTextSize(), this.f3135d0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f2 = this.b0 * 2;
        CharSequence charSequence = this.f3128V;
        return (int) Math.max(f2 + (charSequence == null ? 0.0f : this.f3131Y.a(charSequence.toString())), this.f3134c0);
    }

    @Override // G3.j, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f3137f0) {
            n nVarG = this.f1597b.f1560a.g();
            nVarG.f1621k = B();
            setShapeAppearanceModel(nVarG.a());
        }
    }
}
