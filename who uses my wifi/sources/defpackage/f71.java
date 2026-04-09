package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class f71 {
    public static final m71 a;
    public static final ae b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new n71();
        } else {
            a = new m71();
        }
        b = new ae(9, Float.class, "translationAlpha");
        new ae(10, Rect.class, "clipBounds");
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.T(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        a.z(view, i);
    }
}
