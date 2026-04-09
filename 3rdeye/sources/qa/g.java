package qa;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import x7.C5779a;
import x7.C5780b;

/* compiled from: TemporalAdjusters.java */
/* loaded from: classes3.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    public int f45473b;

    /* renamed from: c, reason: collision with root package name */
    public int f45474c;

    public g(int i, ma.b bVar) {
        com.google.gson.internal.c.v(bVar, "dayOfWeek");
        this.f45473b = i;
        this.f45474c = bVar.getValue();
    }

    public void a(Canvas canvas, Drawable drawable, int i) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i - intrinsicWidth, (this.f45474c / 2) - (drawable.getIntrinsicHeight() / 2), i + intrinsicWidth, (drawable.getIntrinsicHeight() / 2) + (this.f45474c / 2));
        drawable.draw(canvas);
    }

    @Override // qa.f
    public d adjustInto(d dVar) {
        int i = dVar.get(a.DAY_OF_WEEK);
        int i10 = this.f45474c;
        int i11 = this.f45473b;
        if (i11 < 2 && i == i10) {
            return dVar;
        }
        if ((i11 & 1) == 0) {
            return dVar.q(i - i10 >= 0 ? 7 - r0 : -r0, b.DAYS);
        }
        return dVar.u(i10 - i >= 0 ? 7 - r2 : -r2, b.DAYS);
    }

    public void b(Canvas canvas, int i, Drawable drawable, int i10, C5780b c5780b) {
        a(canvas, drawable, i);
        if (c5780b != null) {
            String text = String.valueOf(i10);
            kotlin.jvm.internal.l.f(text, "text");
            C5779a c5779a = c5780b.f47804b;
            c5779a.f47800d = text;
            Paint paint = c5779a.f47799c;
            paint.getTextBounds(text, 0, text.length(), c5779a.f47798b);
            c5779a.f47801e = paint.measureText(c5779a.f47800d) / 2.0f;
            c5779a.f47802f = r3.height() / 2.0f;
            c5780b.invalidateSelf();
            a(canvas, c5780b, i);
        }
    }

    public void c(Canvas canvas, Drawable drawable, int i, int i10) {
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, (this.f45474c / 2) - (drawable.getIntrinsicHeight() / 2), i10, (drawable.getIntrinsicHeight() / 2) + (this.f45474c / 2));
        drawable.draw(canvas);
    }
}
