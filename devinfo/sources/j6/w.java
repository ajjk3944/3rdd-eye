package j6;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final x f27460a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f27461b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f27460a = new y();
        } else {
            f27460a = new x();
        }
        f27461b = new b(5, Float.class, "translationAlpha");
        new b(6, Rect.class, "clipBounds");
    }

    public static void a(View view, int i4, int i10, int i11, int i12) {
        f27460a.c0(view, i4, i10, i11, i12);
    }

    public static void b(int i4, View view) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        f27460a.K(i4, view);
    }
}
