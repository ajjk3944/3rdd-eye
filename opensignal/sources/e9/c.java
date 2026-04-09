package e9;

import io.sentry.android.core.e0;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f7982a = new b();

    public static void a() {
        f7982a.getClass();
        r8.a aVar = r8.d.f21312a;
    }

    public static void b(String str) {
        f7982a.getClass();
        HashSet hashSet = b.f7981a;
        if (hashSet.contains(str)) {
            return;
        }
        e0.q("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void c(String str, Throwable th2) {
        f7982a.getClass();
        HashSet hashSet = b.f7981a;
        if (hashSet.contains(str)) {
            return;
        }
        e0.q("LOTTIE", str, th2);
        hashSet.add(str);
    }
}
