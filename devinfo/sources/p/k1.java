package p;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f30746a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f30747b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f30748c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f30749d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f30746a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f30747b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f30748c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f30749d = true;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
}
