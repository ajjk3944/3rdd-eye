package h9;

import kotlin.random.Random;

/* loaded from: classes4.dex */
public class a extends g9.a {

    /* renamed from: h9.a$a, reason: collision with other inner class name */
    public static final class C0413a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0413a f21486a = new C0413a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f21487b;

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
            f21487b = num;
        }
    }

    @Override // f9.a
    public Random b() {
        return c(34) ? new p9.a() : super.b();
    }

    public final boolean c(int i10) {
        Integer num = C0413a.f21487b;
        return num == null || num.intValue() >= i10;
    }
}
