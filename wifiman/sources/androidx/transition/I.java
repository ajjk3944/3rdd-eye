package androidx.transition;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
class I extends G {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f32369g = true;

    static class a {
        static void a(View view, int i10) {
            view.setTransitionVisibility(i10);
        }
    }

    I() {
    }

    @Override // androidx.transition.B
    public void f(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f32369g) {
            try {
                a.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f32369g = false;
            }
        }
    }
}
