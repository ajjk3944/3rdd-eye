package o;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: o.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2724l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f22566a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f22567b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f22568c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f22569d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f22566a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f22567b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f22568c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f22569d = true;
        } catch (NoSuchMethodException e6) {
            e6.printStackTrace();
        }
    }
}
