package of;

import Li.N;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import m8.AbstractC6778a;
import s9.InterfaceC7929a;
import s9.c;
import ze.AbstractC8735d;

/* renamed from: of.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7125a {

    /* renamed from: a, reason: collision with root package name */
    public static final C7125a f55657a = new C7125a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: of.a$a, reason: collision with other inner class name */
    public static final class EnumC2013a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC2013a[] $VALUES;
        public static final EnumC2013a IN_PROGRESS = new EnumC2013a("IN_PROGRESS", 0);
        public static final EnumC2013a NO_ACCOUNT = new EnumC2013a("NO_ACCOUNT", 1);
        public static final EnumC2013a LOGGED_IN = new EnumC2013a("LOGGED_IN", 2);
        public static final EnumC2013a UNAUTHENTICATED = new EnumC2013a("UNAUTHENTICATED", 3);
        public static final EnumC2013a ERROR = new EnumC2013a("ERROR", 4);

        private static final /* synthetic */ EnumC2013a[] $values() {
            return new EnumC2013a[]{IN_PROGRESS, NO_ACCOUNT, LOGGED_IN, UNAUTHENTICATED, ERROR};
        }

        static {
            EnumC2013a[] enumC2013aArr$values = $values();
            $VALUES = enumC2013aArr$values;
            $ENTRIES = AbstractC5827b.a(enumC2013aArr$values);
        }

        private EnumC2013a(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static EnumC2013a valueOf(String str) {
            return (EnumC2013a) Enum.valueOf(EnumC2013a.class, str);
        }

        public static EnumC2013a[] values() {
            return (EnumC2013a[]) $VALUES.clone();
        }
    }

    /* renamed from: of.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f55658a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final int f55659b = 24;

        /* renamed from: c, reason: collision with root package name */
        private static final int f55660c = 2;

        private b() {
        }

        public final int a() {
            return f55660c;
        }

        public final int b() {
            return f55659b;
        }

        public final InterfaceC7929a.b c() {
            return new c.a(AbstractC6778a.f53255t0, null, 2, null);
        }
    }

    /* renamed from: of.a$c */
    public static abstract class c extends AbstractC8735d {
        public abstract N n0();

        public abstract N o0();

        public abstract N p0();

        public abstract N q0();

        public abstract void r0();
    }

    private C7125a() {
    }
}
