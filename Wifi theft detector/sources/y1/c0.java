package y1;

import android.view.View;
import androidx.annotation.DoNotInline;

/* loaded from: classes.dex */
public abstract class c0 extends a0 {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f25085f = true;

    public static class a {
        @DoNotInline
        public static void a(View view, int i10, int i11, int i12, int i13) {
            view.setLeftTopRightBottom(i10, i11, i12, i13);
        }
    }

    @Override // y1.w
    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f25085f) {
            try {
                a.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f25085f = false;
            }
        }
    }
}
