package j0;

import android.graphics.Paint;
import androidx.annotation.DoNotInline;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f21690a = new ThreadLocal();

    public static class a {
        @DoNotInline
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }
}
