package q0;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: b, reason: collision with root package name */
    public static final D f22927b = new D(5, false);

    /* renamed from: c, reason: collision with root package name */
    public static final D f22928c = new D(8, false);

    /* renamed from: d, reason: collision with root package name */
    public static final D f22929d = new D(4, true);

    /* renamed from: e, reason: collision with root package name */
    public static final D f22930e = new D(7, false);

    /* renamed from: f, reason: collision with root package name */
    public static final D f22931f = new D(6, true);

    /* renamed from: g, reason: collision with root package name */
    public static final D f22932g = new D(3, false);

    /* renamed from: h, reason: collision with root package name */
    public static final D f22933h = new D(2, true);
    public static final D i = new D(1, false);

    /* renamed from: j, reason: collision with root package name */
    public static final D f22934j = new D(0, true);

    /* renamed from: k, reason: collision with root package name */
    public static final D f22935k = new D(10, true);

    /* renamed from: l, reason: collision with root package name */
    public static final D f22936l = new D(9, true);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22937a;

    public J(boolean z6) {
        this.f22937a = z6;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public abstract Object c(String str);

    public Object d(String str, Object obj) {
        return c(str);
    }

    public abstract void e(Bundle bundle, String str, Object obj);

    public final String toString() {
        return b();
    }
}
