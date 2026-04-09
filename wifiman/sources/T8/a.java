package T8;

import T8.b;
import gg.i;
import i9.InterfaceC6137a;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f21453a = b.f21454a;

    /* renamed from: T8.a$a, reason: collision with other inner class name */
    public static final class C0784a {
        public static UUID a(UUID uuid) {
            AbstractC6492s.i(uuid, "uuid");
            return uuid;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f21454a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static InterfaceC6137a f21455b;

        private b() {
        }

        public final InterfaceC6137a a() {
            return f21455b;
        }

        public final void b(InterfaceC6137a interfaceC6137a) {
            f21455b = interfaceC6137a;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f21456a;

        private /* synthetic */ c(UUID uuid) {
            this.f21456a = uuid;
        }

        public static final /* synthetic */ c a(UUID uuid) {
            return new c(uuid);
        }

        public static UUID b(UUID uuid) {
            AbstractC6492s.i(uuid, "uuid");
            return uuid;
        }

        public static boolean c(UUID uuid, Object obj) {
            return (obj instanceof c) && AbstractC6492s.d(uuid, ((c) obj).f());
        }

        public static int d(UUID uuid) {
            return uuid.hashCode();
        }

        public static String e(UUID uuid) {
            return "Service(uuid=" + uuid + ")";
        }

        public boolean equals(Object obj) {
            return c(this.f21456a, obj);
        }

        public final /* synthetic */ UUID f() {
            return this.f21456a;
        }

        public int hashCode() {
            return d(this.f21456a);
        }

        public String toString() {
            return e(this.f21456a);
        }
    }

    public static abstract class d {

        /* renamed from: T8.a$d$a, reason: collision with other inner class name */
        public static final class C0785a extends d {
            public C0785a() {
                super(null);
            }
        }

        public static final class b extends d {
            public b() {
                super(null);
            }
        }

        public static final class c extends d {
            public c() {
                super(null);
            }
        }

        /* renamed from: T8.a$d$d, reason: collision with other inner class name */
        public static final class C0786d extends d {
            public C0786d() {
                super(null);
            }
        }

        public static final class e extends d {

            /* renamed from: a, reason: collision with root package name */
            private final T8.c f21457a;

            /* renamed from: b, reason: collision with root package name */
            private final b.a f21458b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(T8.c deviceScanner, b.a connectionFactory) {
                super(null);
                AbstractC6492s.i(deviceScanner, "deviceScanner");
                AbstractC6492s.i(connectionFactory, "connectionFactory");
                this.f21457a = deviceScanner;
                this.f21458b = connectionFactory;
            }

            public final b.a a() {
                return this.f21458b;
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return AbstractC6492s.d(getClass(), obj != null ? obj.getClass() : null);
        }

        public int hashCode() {
            return getClass().hashCode();
        }

        public String toString() {
            if (this instanceof b) {
                return "BTLE State [ Bluetooth Adapter Unavailable ]";
            }
            if (this instanceof C0785a) {
                return "BTLE State [ Bluetooth Adapter Disabled ]";
            }
            if (this instanceof c) {
                return "BTLE State [ Insufficient Permissions ]";
            }
            if (this instanceof C0786d) {
                return "BTLE State [ Location Disabled ]";
            }
            if (this instanceof e) {
                return "BTLE State [ Ready ]";
            }
            throw new NoWhenBranchMatchedException();
        }

        private d() {
        }
    }

    i getState();
}
