package j5;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Method f21465a;

    /* renamed from: b, reason: collision with root package name */
    public Method f21466b;

    /* renamed from: c, reason: collision with root package name */
    public Method f21467c;

    public e(Method method, Method method2, Method method3) {
        this.f21465a = method;
        this.f21466b = method2;
        this.f21467c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
