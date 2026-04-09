package Z3;

import H2.e;
import I0.g;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: DrawableUtils.java */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: DrawableUtils.java */
    /* renamed from: Z3.a$a, reason: collision with other inner class name */
    public static class C0205a {
        public static void a(Outline outline, Path path) {
            outline.setConvexPath(path);
        }
    }

    /* compiled from: DrawableUtils.java */
    public static class b {
        public static void a(Outline outline, Path path) {
            outline.setPath(path);
        }
    }

    public static ColorStateList a(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !e.r(drawable)) {
            return null;
        }
        return g.e(drawable).getColorStateList();
    }

    public static void b(Outline outline, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            b.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                C0205a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            C0205a.a(outline, path);
        }
    }
}
