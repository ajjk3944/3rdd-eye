package K1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final x f3039a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f3040b;

    /* compiled from: ViewUtils.java */
    public class a extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(s.f3039a.a(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            float fFloatValue = f10.floatValue();
            s.f3039a.b(view, fFloatValue);
        }
    }

    /* compiled from: ViewUtils.java */
    public class b extends Property<View, Rect> {
        @Override // android.util.Property
        public final Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f3039a = new y();
        } else {
            f3039a = new x();
        }
        f3040b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    public static void a(View view, int i, int i10, int i11, int i12) {
        f3039a.f(view, i, i10, i11, i12);
    }

    public static void b(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        f3039a.c(view, i);
    }
}
