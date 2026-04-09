package androidx.transition;

import android.view.View;

/* loaded from: classes.dex */
abstract class G extends E {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f32368f = true;

    static class a {
        static void a(View view, int i10, int i11, int i12, int i13) {
            view.setLeftTopRightBottom(i10, i11, i12, i13);
        }
    }

    G() {
    }

    @Override // androidx.transition.B
    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f32368f) {
            try {
                a.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f32368f = false;
            }
        }
    }
}
