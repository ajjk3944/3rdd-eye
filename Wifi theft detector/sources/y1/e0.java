package y1;

import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;

/* loaded from: classes.dex */
public class e0 extends c0 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f25086g = true;

    public static class a {
        @DoNotInline
        public static void a(View view, int i10) {
            view.setTransitionVisibility(i10);
        }
    }

    @Override // y1.w
    public void f(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f25086g) {
            try {
                a.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f25086g = false;
            }
        }
    }
}
