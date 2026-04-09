package nd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import ed.g;
import ed.j;
import ed.n;
import zc.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends j implements zc.j {
    public CharSequence H;
    public final Context I;
    public final Paint.FontMetrics J;
    public final k K;
    public final nc.a L;
    public final Rect M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public int S;
    public int T;
    public float U;
    public float V;
    public float W;
    public float X;
    public float Y;

    public a(Context context, int i4) {
        super(context, null, 0, i4);
        this.J = new Paint.FontMetrics();
        k kVar = new k(this);
        this.K = kVar;
        this.L = new nc.a(1, this);
        this.M = new Rect();
        this.U = 1.0f;
        this.V = 1.0f;
        this.W = 0.5f;
        this.X = 0.5f;
        this.Y = 1.0f;
        this.I = context;
        float f10 = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = kVar.f38228a;
        textPaint.density = f10;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // ed.j, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float fW = w();
        float f10 = (float) (-((Math.sqrt(2.0d) * this.S) - this.S));
        canvas.scale(this.U, this.V, (getBounds().width() * this.W) + getBounds().left, (getBounds().height() * this.X) + getBounds().top);
        canvas.translate(fW, f10);
        super.draw(canvas);
        if (this.H == null) {
            canvas2 = canvas;
        } else {
            float fCenterY = getBounds().centerY();
            k kVar = this.K;
            TextPaint textPaint = kVar.f38228a;
            Paint.FontMetrics fontMetrics = this.J;
            textPaint.getFontMetrics(fontMetrics);
            int i4 = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (kVar.g != null) {
                textPaint.drawableState = getState();
                kVar.g.d(this.I, kVar.f38228a, kVar.f38229b);
                textPaint.setAlpha((int) (this.Y * 255.0f));
            }
            CharSequence charSequence = this.H;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i4, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.K.f38228a.getTextSize(), this.P);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f10 = this.N * 2;
        CharSequence charSequence = this.H;
        return (int) Math.max(f10 + (charSequence == null ? 0.0f : this.K.a(charSequence.toString())), this.O);
    }

    @Override // ed.j, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.R) {
            n nVarG = this.f23316b.f23298a.g();
            nVarG.f23350k = x();
            setShapeAppearanceModel(nVarG.a());
        }
    }

    public final float w() {
        int i4;
        Rect rect = this.M;
        if (((rect.right - getBounds().right) - this.T) - this.Q < 0) {
            i4 = ((rect.right - getBounds().right) - this.T) - this.Q;
        } else {
            if (((rect.left - getBounds().left) - this.T) + this.Q <= 0) {
                return 0.0f;
            }
            i4 = ((rect.left - getBounds().left) - this.T) + this.Q;
        }
        return i4;
    }

    public final ed.k x() {
        float f10 = -w();
        float fWidth = (float) ((getBounds().width() - (Math.sqrt(2.0d) * this.S)) / 2.0d);
        return new ed.k(new g(this.S), Math.min(Math.max(f10, -fWidth), fWidth));
    }
}
