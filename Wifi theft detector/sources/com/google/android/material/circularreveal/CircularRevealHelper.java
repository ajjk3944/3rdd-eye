package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class CircularRevealHelper {

    /* renamed from: a, reason: collision with root package name */
    public final a f10267a;

    /* renamed from: b, reason: collision with root package name */
    public final View f10268b;

    /* renamed from: c, reason: collision with root package name */
    public final Path f10269c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f10270d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f10271e;

    /* renamed from: f, reason: collision with root package name */
    public c.e f10272f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f10273g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10274h;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Strategy {
    }

    public interface a {
        void c(Canvas canvas);

        boolean d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CircularRevealHelper(a aVar) {
        this.f10267a = aVar;
        View view = (View) aVar;
        this.f10268b = view;
        view.setWillNotDraw(false);
        this.f10269c = new Path();
        this.f10270d = new Paint(7);
        Paint paint = new Paint(1);
        this.f10271e = paint;
        paint.setColor(0);
    }

    public void a() {
    }

    public void b() {
    }

    public void c(Canvas canvas) {
        Canvas canvas2;
        if (n()) {
            this.f10267a.c(canvas);
            if (p()) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, this.f10268b.getWidth(), this.f10268b.getHeight(), this.f10271e);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
            this.f10267a.c(canvas2);
            if (p()) {
                canvas2.drawRect(0.0f, 0.0f, this.f10268b.getWidth(), this.f10268b.getHeight(), this.f10271e);
            }
        }
        d(canvas2);
    }

    public final void d(Canvas canvas) {
        if (o()) {
            Rect bounds = this.f10273g.getBounds();
            float fWidth = this.f10272f.f10281a - (bounds.width() / 2.0f);
            float fHeight = this.f10272f.f10282b - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.f10273g.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    public Drawable e() {
        return this.f10273g;
    }

    public int f() {
        return this.f10271e.getColor();
    }

    public final float g(c.e eVar) {
        return a5.a.c(eVar.f10281a, eVar.f10282b, 0.0f, 0.0f, this.f10268b.getWidth(), this.f10268b.getHeight());
    }

    public c.e h() {
        c.e eVar = this.f10272f;
        if (eVar == null) {
            return null;
        }
        c.e eVar2 = new c.e(eVar);
        if (eVar2.a()) {
            eVar2.f10283c = g(eVar2);
        }
        return eVar2;
    }

    public final void i() {
        this.f10268b.invalidate();
    }

    public boolean j() {
        return this.f10267a.d() && !n();
    }

    public void k(Drawable drawable) {
        this.f10273g = drawable;
        this.f10268b.invalidate();
    }

    public void l(int i10) {
        this.f10271e.setColor(i10);
        this.f10268b.invalidate();
    }

    public void m(c.e eVar) {
        if (eVar == null) {
            this.f10272f = null;
        } else {
            c.e eVar2 = this.f10272f;
            if (eVar2 == null) {
                this.f10272f = new c.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (a5.a.d(eVar.f10283c, g(eVar), 1.0E-4f)) {
                this.f10272f.f10283c = Float.MAX_VALUE;
            }
        }
        i();
    }

    public final boolean n() {
        c.e eVar = this.f10272f;
        return !(eVar == null || eVar.a());
    }

    public final boolean o() {
        return (this.f10274h || this.f10273g == null || this.f10272f == null) ? false : true;
    }

    public final boolean p() {
        return (this.f10274h || Color.alpha(this.f10271e.getColor()) == 0) ? false : true;
    }
}
