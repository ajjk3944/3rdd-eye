package Q2;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    final Set f19126a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f19127b;

    class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f19128a;

        /* renamed from: Q2.h$a$a, reason: collision with other inner class name */
        class RunnableC0671a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f19130a;

            RunnableC0671a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f19130a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.bumptech.glide.load.resource.bitmap.p.b().h();
                h.this.f19127b = true;
                h.b(a.this.f19128a, this.f19130a);
                h.this.f19126a.clear();
            }
        }

        a(View view) {
            this.f19128a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            W2.l.u(new RunnableC0671a(this));
        }
    }

    h() {
    }

    static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // Q2.i
    public void a(Activity activity) {
        if (!this.f19127b && this.f19126a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
