package ih;

import hh.AbstractC6046a;
import qh.AbstractC7510c;
import rh.C7609a;

/* renamed from: ih.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6153a extends AbstractC6046a {

    /* renamed from: ih.a$a, reason: collision with other inner class name */
    private static final class C1851a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1851a f49174a = new C1851a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f49175b;

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
            f49175b = num;
        }

        private C1851a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C1851a.f49175b;
        return num == null || num.intValue() >= i10;
    }

    @Override // gh.AbstractC5916a
    public AbstractC7510c b() {
        return c(34) ? new C7609a() : super.b();
    }
}
