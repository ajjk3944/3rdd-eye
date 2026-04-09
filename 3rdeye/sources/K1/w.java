package K1;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22.java */
/* loaded from: classes.dex */
public class w extends v {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3046f = true;

    /* compiled from: ViewUtilsApi22.java */
    public static class a {
        public static void a(View view, int i, int i10, int i11, int i12) {
            view.setLeftTopRightBottom(i, i10, i11, i12);
        }
    }

    @SuppressLint({"NewApi"})
    public void f(View view, int i, int i10, int i11, int i12) {
        if (f3046f) {
            try {
                a.a(view, i, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                f3046f = false;
            }
        }
    }
}
