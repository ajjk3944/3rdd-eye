package e7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class f {

    public static abstract class a extends f {

        /* renamed from: e7.f$a$a, reason: collision with other inner class name */
        public static final class C1730a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1730a f46227a = new C1730a();

            private C1730a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1730a);
            }

            public int hashCode() {
                return 87073708;
            }

            public String toString() {
                return "ArInternal";
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f46228a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 299690341;
            }

            public String toString() {
                return "ArSdkUnavailable";
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f46229a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 415719073;
            }

            public String toString() {
                return "DeviceUnsupported";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(null);
        }
    }

    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f46230a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1108696492;
        }

        public String toString() {
            return "Idle";
        }
    }

    public static final class c extends f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f46231a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 765200615;
        }

        public String toString() {
            return "Running";
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private f() {
    }
}
