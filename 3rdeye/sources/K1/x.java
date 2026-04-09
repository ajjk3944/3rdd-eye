package K1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23.java */
/* loaded from: classes.dex */
public class x extends w {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f3047g = true;

    /* compiled from: ViewUtilsApi23.java */
    public static class a {
        public static void a(View view, int i) {
            view.setTransitionVisibility(i);
        }
    }

    @Override // K1.t
    @SuppressLint({"NewApi"})
    public void c(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.c(view, i);
        } else if (f3047g) {
            try {
                a.a(view, i);
            } catch (NoSuchMethodError unused) {
                f3047g = false;
            }
        }
    }
}
