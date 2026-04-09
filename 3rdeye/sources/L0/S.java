package L0;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<View> f3819a;

    public S(View view) {
        this.f3819a = new WeakReference<>(view);
    }

    public final void a(float f10) {
        View view = this.f3819a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = this.f3819a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j4) {
        View view = this.f3819a.get();
        if (view != null) {
            view.animate().setDuration(j4);
        }
    }

    public final void d(T t10) {
        View view = this.f3819a.get();
        if (view != null) {
            if (t10 != null) {
                view.animate().setListener(new K1.j(t10, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = this.f3819a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
