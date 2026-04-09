package lf;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class k {

    public static final class a extends k {

        /* renamed from: a, reason: collision with root package name */
        public static final a f52612a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -619267104;
        }

        public String toString() {
            return "Content";
        }
    }

    public static abstract class b extends k {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f52613a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1820727416;
            }

            public String toString() {
                return "FailedToLoadServers";
            }
        }

        /* renamed from: lf.k$b$b, reason: collision with other inner class name */
        public static final class C1945b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1945b f52614a = new C1945b();

            private C1945b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1945b);
            }

            public int hashCode() {
                return 1411630611;
            }

            public String toString() {
                return "NoNetwork";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
            super(null);
        }
    }

    public static final class c extends k {

        /* renamed from: a, reason: collision with root package name */
        public static final c f52615a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1234147165;
        }

        public String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private k() {
    }
}
