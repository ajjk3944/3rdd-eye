package R;

import A3.C0134c;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f3278a;

    public S(View view) {
        this.f3278a = new WeakReference(view);
    }

    public final void a(float f2) {
        View view = (View) this.f3278a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    public final void b() {
        View view = (View) this.f3278a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j6) {
        View view = (View) this.f3278a.get();
        if (view != null) {
            view.animate().setDuration(j6);
        }
    }

    public final void d(T t6) {
        View view = (View) this.f3278a.get();
        if (view != null) {
            if (t6 != null) {
                view.animate().setListener(new C0134c(view, 2, t6));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f2) {
        View view = (View) this.f3278a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }
}
