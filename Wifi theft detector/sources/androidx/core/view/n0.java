package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f2740a;

    public static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final View f2741a;

        public a(View view) {
            this.f2741a = view;
        }

        @Override // androidx.core.view.n0.c
        public void a() {
            View view = this.f2741a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f2741a.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.n0.c
        public void b() {
            final View viewFindViewById = this.f2741a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f2741a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: androidx.core.view.m0
                @Override // java.lang.Runnable
                public final void run() {
                    View view = viewFindViewById;
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }
    }

    public static class c {
        public abstract void a();

        public abstract void b();
    }

    public n0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2740a = new b(view);
        } else {
            this.f2740a = new a(view);
        }
    }

    public void a() {
        this.f2740a.a();
    }

    public void b() {
        this.f2740a.b();
    }

    public static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public View f2742b;

        /* renamed from: c, reason: collision with root package name */
        public WindowInsetsController f2743c;

        public b(View view) {
            super(view);
            this.f2742b = view;
        }

        @Override // androidx.core.view.n0.a, androidx.core.view.n0.c
        public void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f2743c;
            if (windowInsetsController == null) {
                View view2 = this.f2742b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.u0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    atomicBoolean.set((i10 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f2742b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f2742b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.n0.a, androidx.core.view.n0.c
        public void b() {
            View view = this.f2742b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f2743c;
            if (windowInsetsController == null) {
                View view2 = this.f2742b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            } else {
                super.b();
            }
        }

        public b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f2743c = windowInsetsController;
        }
    }

    public n0(WindowInsetsController windowInsetsController) {
        this.f2740a = new b(windowInsetsController);
    }
}
