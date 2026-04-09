package u3;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f23192a;

    public l0(View view) {
        this.f23192a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.f23192a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.f23192a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f23192a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(m0 m0Var) {
        View view = (View) this.f23192a.get();
        if (view != null) {
            if (m0Var != null) {
                view.animate().setListener(new t7.j(1, view, m0Var));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.f23192a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
