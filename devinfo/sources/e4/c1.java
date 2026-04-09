package e4;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f22313a;

    public c1(View view) {
        this.f22313a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.f22313a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.f22313a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f22313a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(d1 d1Var) {
        View view = (View) this.f22313a.get();
        if (view != null) {
            if (d1Var != null) {
                view.animate().setListener(new b1(d1Var, view, 0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.f22313a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
