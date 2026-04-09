package B3;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import e0.C2297e;

/* loaded from: classes.dex */
public final class o extends q {
    public static final n M = new n(0);

    /* renamed from: C, reason: collision with root package name */
    public final e0.f f621C;

    /* renamed from: D, reason: collision with root package name */
    public final C2297e f622D;

    /* renamed from: E, reason: collision with root package name */
    public final r f623E;

    /* renamed from: F, reason: collision with root package name */
    public float f624F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f625G;

    /* renamed from: H, reason: collision with root package name */
    public final ValueAnimator f626H;

    /* renamed from: I, reason: collision with root package name */
    public ValueAnimator f627I;

    /* renamed from: J, reason: collision with root package name */
    public TimeInterpolator f628J;

    /* renamed from: K, reason: collision with root package name */
    public TimeInterpolator f629K;

    /* renamed from: L, reason: collision with root package name */
    public TimeInterpolator f630L;

    /* renamed from: n, reason: collision with root package name */
    public final t f631n;

    public o(Context context, e eVar, t tVar) {
        super(context, eVar);
        this.f625G = false;
        this.f631n = tVar;
        r rVar = new r();
        this.f623E = rVar;
        rVar.f653h = true;
        e0.f fVar = new e0.f();
        this.f621C = fVar;
        fVar.a(1.0f);
        fVar.b(50.0f);
        C2297e c2297e = new C2297e(this, M);
        this.f622D = c2297e;
        c2297e.f19884k = fVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f626H = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new m(this, 0, eVar));
        if (eVar.b(true) && eVar.f570m != 0) {
            valueAnimator.start();
        }
        if (this.i != 1.0f) {
            this.i = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f645l)) {
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.f638d;
            boolean z6 = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f639e;
            boolean z7 = objectAnimator2 != null && objectAnimator2.isRunning();
            t tVar = this.f631n;
            tVar.f657a.d();
            tVar.a(canvas, bounds, fB, z6, z7);
            float fC = c();
            r rVar = this.f623E;
            rVar.f651f = fC;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f643j;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            e eVar = this.f636b;
            rVar.f648c = eVar.f563e[0];
            int iE = eVar.i;
            if (iE > 0) {
                if (!(this.f631n instanceof w)) {
                    iE = (int) ((d5.y.e(rVar.f647b, 0.0f, 0.01f) * iE) / 0.01f);
                }
                this.f631n.d(canvas, paint, rVar.f647b, 1.0f, eVar.f564f, this.f644k, iE);
            } else {
                this.f631n.d(canvas, paint, 0.0f, 1.0f, eVar.f564f, this.f644k, 0);
            }
            this.f631n.c(canvas, paint, rVar, this.f644k);
            this.f631n.b(eVar.f563e[0], this.f644k, canvas, paint);
            canvas.restore();
        }
    }

    @Override // B3.q
    public final boolean e(boolean z6, boolean z7, boolean z8) {
        boolean zE = super.e(z6, z7, z8);
        C0137a c0137a = this.f637c;
        ContentResolver contentResolver = this.f635a.getContentResolver();
        c0137a.getClass();
        float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f2 == 0.0f) {
            this.f625G = true;
            return zE;
        }
        this.f625G = false;
        this.f621C.b(50.0f / f2);
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f631n.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f631n.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f622D.d();
        this.f623E.f647b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        float f2 = i;
        float f5 = (f2 < 1000.0f || f2 > 9000.0f) ? 0.0f : 1.0f;
        boolean z6 = this.f625G;
        r rVar = this.f623E;
        C2297e c2297e = this.f622D;
        if (!z6) {
            c2297e.f19876b = rVar.f647b * 10000.0f;
            c2297e.f19877c = true;
            c2297e.a(f2);
            return true;
        }
        c2297e.d();
        rVar.f647b = f2 / 10000.0f;
        invalidateSelf();
        rVar.f650e = f5;
        invalidateSelf();
        return true;
    }
}
