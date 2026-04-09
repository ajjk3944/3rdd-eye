package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
abstract class x {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f32523a = true;

    static class a {
        static int a(ViewGroup viewGroup, int i10) {
            return viewGroup.getChildDrawingOrder(i10);
        }

        static void b(ViewGroup viewGroup, boolean z10) {
            viewGroup.suppressLayout(z10);
        }
    }

    private static void a(ViewGroup viewGroup, boolean z10) {
        if (f32523a) {
            try {
                a.b(viewGroup, z10);
            } catch (NoSuchMethodError unused) {
                f32523a = false;
            }
        }
    }

    static void b(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(viewGroup, z10);
        } else {
            a(viewGroup, z10);
        }
    }
}
