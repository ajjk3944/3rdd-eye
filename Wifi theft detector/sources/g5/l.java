package g5;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import p4.a;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.material.shape.a f21198c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f21196a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21197b = false;

    /* renamed from: d, reason: collision with root package name */
    public RectF f21199d = new RectF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f21200e = new Path();

    public static l a(View view) {
        return Build.VERSION.SDK_INT >= 33 ? new n(view) : new m(view);
    }

    public abstract void b(View view);

    public final boolean c() {
        RectF rectF = this.f21199d;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    public void d(Canvas canvas, a.InterfaceC0453a interfaceC0453a) {
        if (!i() || this.f21200e.isEmpty()) {
            interfaceC0453a.a(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f21200e);
        interfaceC0453a.a(canvas);
        canvas.restore();
    }

    public void e(View view, RectF rectF) {
        this.f21199d = rectF;
        j();
        b(view);
    }

    public void f(View view, com.google.android.material.shape.a aVar) {
        this.f21198c = aVar;
        j();
        b(view);
    }

    public void g(View view, boolean z10) {
        if (z10 != this.f21196a) {
            this.f21196a = z10;
            b(view);
        }
    }

    public void h(View view, boolean z10) {
        this.f21197b = z10;
        b(view);
    }

    public abstract boolean i();

    public final void j() {
        if (!c() || this.f21198c == null) {
            return;
        }
        com.google.android.material.shape.b.l().d(this.f21198c, 1.0f, this.f21199d, this.f21200e);
    }
}
