package L0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final A f2491a;

    /* renamed from: b, reason: collision with root package name */
    public static final B3.h f2492b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2491a = new B();
        } else {
            f2491a = new A();
        }
        f2492b = new B3.h(12, Float.class, "translationAlpha");
        new B3.h(13, Rect.class, "clipBounds");
    }

    public static void a(View view, int i, int i3, int i6, int i7) {
        f2491a.J(view, i, i3, i6, i7);
    }

    public static void b(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        f2491a.s(view, i);
    }
}
