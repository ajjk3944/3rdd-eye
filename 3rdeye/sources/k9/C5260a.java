package k9;

import j9.C5202a;
import kotlin.jvm.internal.l;

/* compiled from: JDK7PlatformImplementations.kt */
/* renamed from: k9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5260a extends C5202a {

    /* compiled from: JDK7PlatformImplementations.kt */
    /* renamed from: k9.a$a, reason: collision with other inner class name */
    public static final class C0485a {

        /* renamed from: a, reason: collision with root package name */
        public static final Integer f43635a;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f43635a = num;
        }
    }

    @Override // j9.C5202a
    public final void a(Throwable cause, Throwable exception) {
        l.f(cause, "cause");
        l.f(exception, "exception");
        Integer num = C0485a.f43635a;
        if (num == null || num.intValue() >= 19) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
