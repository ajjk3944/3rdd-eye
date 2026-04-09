package H1;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: H1.a$a, reason: collision with other inner class name */
    static class C0306a {
        static Interpolator a(float f10, float f11, float f12, float f13) {
            return new PathInterpolator(f10, f11, f12, f13);
        }

        static Interpolator b(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f10, float f11, float f12, float f13) {
        return C0306a.a(f10, f11, f12, f13);
    }

    public static Interpolator b(Path path) {
        return C0306a.b(path);
    }
}
