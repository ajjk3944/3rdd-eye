package re;

import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: re.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7588a {

    /* renamed from: re.a$a, reason: collision with other inner class name */
    public static final class C2110a {

        /* renamed from: a, reason: collision with root package name */
        private final C5969a f60336a;

        /* renamed from: b, reason: collision with root package name */
        private final S8.c f60337b;

        /* renamed from: c, reason: collision with root package name */
        private final int f60338c;

        public C2110a(C5969a bssid, S8.c band, int i10) {
            AbstractC6492s.i(bssid, "bssid");
            AbstractC6492s.i(band, "band");
            this.f60336a = bssid;
            this.f60337b = band;
            this.f60338c = i10;
        }

        public final S8.c a() {
            return this.f60337b;
        }

        public final C5969a b() {
            return this.f60336a;
        }

        public final int c() {
            return this.f60338c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2110a) {
                return AbstractC6492s.d(this.f60336a, ((C2110a) obj).f60336a);
            }
            return false;
        }

        public int hashCode() {
            return this.f60336a.hashCode();
        }
    }

    /* renamed from: re.a$b */
    public static abstract class b {

        /* renamed from: re.a$b$a, reason: collision with other inner class name */
        public static final class C2111a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC7590c f60339a;

            /* renamed from: b, reason: collision with root package name */
            private final InterfaceC7601n f60340b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2111a(InterfaceC7590c manager, InterfaceC7601n stats) {
                super(null);
                AbstractC6492s.i(manager, "manager");
                AbstractC6492s.i(stats, "stats");
                this.f60339a = manager;
                this.f60340b = stats;
            }

            public final InterfaceC7590c a() {
                return this.f60339a;
            }

            public final InterfaceC7601n b() {
                return this.f60340b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2111a)) {
                    return false;
                }
                C2111a c2111a = (C2111a) obj;
                return AbstractC6492s.d(this.f60339a, c2111a.f60339a) && AbstractC6492s.d(this.f60340b, c2111a.f60340b);
            }

            public int hashCode() {
                return (this.f60339a.hashCode() * 31) + this.f60340b.hashCode();
            }

            public String toString() {
                return "Available(manager=" + this.f60339a + ", stats=" + this.f60340b + ")";
            }
        }

        /* renamed from: re.a$b$b, reason: collision with other inner class name */
        public static final class C2112b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C2112b f60341a = new C2112b();

            private C2112b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2112b);
            }

            public int hashCode() {
                return -718154020;
            }

            public String toString() {
                return "Unavailable";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    gg.i getState();
}
