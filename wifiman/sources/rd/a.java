package Rd;

import com.ui.common.semver.SemVer;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: Rd.a$a, reason: collision with other inner class name */
    public static final class C0705a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0705a f19712a = new C0705a();

        private C0705a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0705a);
        }

        public int hashCode() {
            return 688892226;
        }

        public String toString() {
            return "Disabled";
        }
    }

    public static abstract class b extends a {

        /* renamed from: Rd.a$b$a, reason: collision with other inner class name */
        public static final class C0706a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0706a f19713a = new C0706a();

            private C0706a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0706a);
            }

            public int hashCode() {
                return 2077593709;
            }

            public String toString() {
                return "FullSupport";
            }
        }

        /* renamed from: Rd.a$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC0707b extends b {

            /* renamed from: Rd.a$b$b$a, reason: collision with other inner class name */
            public static final class C0708a extends AbstractC0707b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0708a f19714a = new C0708a();

                private C0708a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0708a);
                }

                public int hashCode() {
                    return 1042733519;
                }

                public String toString() {
                    return "InsufficientPermissions";
                }
            }

            /* renamed from: Rd.a$b$b$b, reason: collision with other inner class name */
            public static final class C0709b extends AbstractC0707b {

                /* renamed from: a, reason: collision with root package name */
                private final SemVer f19715a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0709b(SemVer version) {
                    super(null);
                    AbstractC6492s.i(version, "version");
                    this.f19715a = version;
                }

                public final SemVer a() {
                    return this.f19715a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0709b) && AbstractC6492s.d(this.f19715a, ((C0709b) obj).f19715a);
                }

                public int hashCode() {
                    return this.f19715a.hashCode();
                }

                public String toString() {
                    return "UnsupportedNetworkVersion(version=" + this.f19715a + ")";
                }
            }

            public /* synthetic */ AbstractC0707b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC0707b() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
            super(null);
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f19716a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 129496495;
        }

        public String toString() {
            return "Unsupported";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
