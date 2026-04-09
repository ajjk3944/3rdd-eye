package t7;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import p.f2;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f22457a;

    /* renamed from: b, reason: collision with root package name */
    public static final f2 f22458b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f22457a = new g0();
        } else {
            f22457a = new f0();
        }
        f22458b = new f2(Float.class, "translationAlpha", 6);
        new f2(Rect.class, "clipBounds", 7);
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f22457a.T(view, i10, i11, i12, i13);
    }

    public static void b(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        f22457a.C(view, i10);
    }
}
