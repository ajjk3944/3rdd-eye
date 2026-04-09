package ek;

import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public Method f23532a;

    /* renamed from: b, reason: collision with root package name */
    public Method f23533b;

    /* renamed from: c, reason: collision with root package name */
    public Method f23534c;

    public f(Method method, Method method2, Method method3) {
        this.f23532a = method;
        this.f23533b = method2;
        this.f23534c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
