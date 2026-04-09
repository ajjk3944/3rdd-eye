package ke;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ke.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6456a {

    /* renamed from: ke.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1905a extends AbstractC6456a {

        /* renamed from: ke.a$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC1906a extends AbstractC1905a {

            /* renamed from: ke.a$a$a$a, reason: collision with other inner class name */
            public static final class C1907a extends AbstractC1906a {

                /* renamed from: a, reason: collision with root package name */
                public static final C1907a f51416a = new C1907a();

                private C1907a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1907a);
                }

                public int hashCode() {
                    return 901168961;
                }

                public String toString() {
                    return "Active";
                }
            }

            /* renamed from: ke.a$a$a$b */
            public static final class b extends AbstractC1906a {

                /* renamed from: a, reason: collision with root package name */
                public static final b f51417a = new b();

                private b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public int hashCode() {
                    return 443634383;
                }

                public String toString() {
                    return "Idle";
                }
            }

            public /* synthetic */ AbstractC1906a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC1906a() {
                super(null);
            }
        }

        /* renamed from: ke.a$a$b */
        public static final class b extends AbstractC1905a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f51418a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -19507503;
            }

            public String toString() {
                return "Disconnected";
            }
        }

        public /* synthetic */ AbstractC1905a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1905a() {
            super(null);
        }
    }

    /* renamed from: ke.a$b */
    public static final class b extends AbstractC6456a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f51419a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -317552431;
        }

        public String toString() {
            return "Unaffiliated";
        }
    }

    public /* synthetic */ AbstractC6456a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC6456a() {
    }
}
