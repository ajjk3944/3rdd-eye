package z;

import F1.C2755j0;
import F1.C2780w0;
import android.os.Build;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
final class E extends C2755j0.b implements Runnable, F1.F, View.OnAttachStateChangeListener {

    /* renamed from: c, reason: collision with root package name */
    private final g0 f66787c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f66788d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f66789e;

    /* renamed from: f, reason: collision with root package name */
    private C2780w0 f66790f;

    public E(g0 g0Var) {
        super(!g0Var.c() ? 1 : 0);
        this.f66787c = g0Var;
    }

    @Override // F1.F
    public C2780w0 a(View view, C2780w0 c2780w0) {
        this.f66790f = c2780w0;
        this.f66787c.l(c2780w0);
        if (this.f66788d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f66789e) {
            this.f66787c.k(c2780w0);
            g0.j(this.f66787c, c2780w0, 0, 2, null);
        }
        return this.f66787c.c() ? C2780w0.f5774b : c2780w0;
    }

    @Override // F1.C2755j0.b
    public void c(C2755j0 c2755j0) {
        this.f66788d = false;
        this.f66789e = false;
        C2780w0 c2780w0 = this.f66790f;
        if (c2755j0.a() != 0 && c2780w0 != null) {
            this.f66787c.k(c2780w0);
            this.f66787c.l(c2780w0);
            g0.j(this.f66787c, c2780w0, 0, 2, null);
        }
        this.f66790f = null;
        super.c(c2755j0);
    }

    @Override // F1.C2755j0.b
    public void d(C2755j0 c2755j0) {
        this.f66788d = true;
        this.f66789e = true;
        super.d(c2755j0);
    }

    @Override // F1.C2755j0.b
    public C2780w0 e(C2780w0 c2780w0, List list) {
        g0.j(this.f66787c, c2780w0, 0, 2, null);
        return this.f66787c.c() ? C2780w0.f5774b : c2780w0;
    }

    @Override // F1.C2755j0.b
    public C2755j0.a f(C2755j0 c2755j0, C2755j0.a aVar) {
        this.f66788d = false;
        return super.f(c2755j0, aVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f66788d) {
            this.f66788d = false;
            this.f66789e = false;
            C2780w0 c2780w0 = this.f66790f;
            if (c2780w0 != null) {
                this.f66787c.k(c2780w0);
                g0.j(this.f66787c, c2780w0, 0, 2, null);
                this.f66790f = null;
            }
        }
    }
}
