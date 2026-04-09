package Id;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: Id.a$a, reason: collision with other inner class name */
    public static final class C0370a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0370a f9044a = new C0370a();

        private C0370a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0370a);
        }

        public int hashCode() {
            return -367903683;
        }

        public String toString() {
            return "Available";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f9045a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1409006462;
        }

        public String toString() {
            return "InProgress";
        }
    }

    public static abstract class c extends a {

        /* renamed from: Id.a$c$a, reason: collision with other inner class name */
        public static final class C0371a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final C0371a f9046a = new C0371a();

            private C0371a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0371a);
            }

            public int hashCode() {
                return -1606779520;
            }

            public String toString() {
                return "CloudApiOutage";
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f9047a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -246896874;
            }

            public String toString() {
                return "ConsoleOffline";
            }
        }

        /* renamed from: Id.a$c$c, reason: collision with other inner class name */
        public static final class C0372c extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final C0372c f9048a = new C0372c();

            private C0372c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0372c);
            }

            public int hashCode() {
                return -351176764;
            }

            public String toString() {
                return "InsufficientPermissionForTokenGeneration";
            }
        }

        public static final class d extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f9049a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 1177608097;
            }

            public String toString() {
                return "NoNetworkConnection";
            }
        }

        public static final class e extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final e f9050a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -449313071;
            }

            public String toString() {
                return "TeleportDisabled";
            }
        }

        public static final class f extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final f f9051a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return 622295488;
            }

            public String toString() {
                return "TeleportUnsupported";
            }
        }

        public static final class g extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final g f9052a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return 2002958024;
            }

            public String toString() {
                return "TokenInvalid";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
            super(null);
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
