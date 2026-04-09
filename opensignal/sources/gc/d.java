package gc;

import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import io.sentry.android.core.e0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f9490a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f9491b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f9492c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f9493d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f9494e;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f9490a = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f9491b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f9492c = method3;
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e4) {
                e0.q("WorkSourceUtil", "Missing WorkChain API createWorkChain", e4);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception e10) {
                e0.q("WorkSourceUtil", "Missing WorkChain class", e10);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                method4 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method4.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
            }
        } else {
            method4 = null;
        }
        f9493d = method4;
        f9494e = null;
    }

    public static void a(WorkSource workSource, int i10, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f9491b;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e4) {
                e0.r("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
                return;
            }
        }
        Method method2 = f9490a;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e10) {
                e0.r("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
    }
}
