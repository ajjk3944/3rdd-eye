package F3;

import android.content.Context;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: d, reason: collision with root package name */
    private static E f5853d;

    /* renamed from: a, reason: collision with root package name */
    private final C f5854a;

    /* renamed from: b, reason: collision with root package name */
    private final H f5855b;

    /* renamed from: c, reason: collision with root package name */
    private final F f5856c;

    public E(Context context, D d10) {
        F f10 = new F(context);
        this.f5856c = f10;
        this.f5855b = new H(context);
        this.f5854a = new C(d10, f10);
    }

    public static synchronized E a(Context context) {
        try {
            if (f5853d == null) {
                f5853d = new E(context, I.f5860a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f5853d;
    }
}
