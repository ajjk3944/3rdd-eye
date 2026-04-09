package y1;

import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.DoNotInline;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f25096a = true;

    public static class a {
        @DoNotInline
        public static int a(ViewGroup viewGroup, int i10) {
            return viewGroup.getChildDrawingOrder(i10);
        }

        @DoNotInline
        public static void b(ViewGroup viewGroup, boolean z10) {
            viewGroup.suppressLayout(z10);
        }
    }

    public static void a(ViewGroup viewGroup, boolean z10) {
        if (f25096a) {
            try {
                a.b(viewGroup, z10);
            } catch (NoSuchMethodError unused) {
                f25096a = false;
            }
        }
    }

    public static void b(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(viewGroup, z10);
        } else {
            a(viewGroup, z10);
        }
    }
}
