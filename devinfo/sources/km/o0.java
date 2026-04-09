package km;

import android.os.Build;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b4.n f28447a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f28448b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f28449c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f28447a = null;
            f28448b = new a(7);
            f28449c = new a(6);
        } else {
            if (!property.equals("Dalvik")) {
                f28447a = null;
                f28448b = new q0(7);
                f28449c = new c(6);
                return;
            }
            f28447a = new b4.n(2);
            if (Build.VERSION.SDK_INT >= 24) {
                f28448b = new p0(7);
                f28449c = new c(6);
            } else {
                f28448b = new a(7);
                f28449c = new a(6);
            }
        }
    }
}
