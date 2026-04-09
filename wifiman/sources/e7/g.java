package e7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class g {

    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46232a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -692977026;
        }

        public String toString() {
            return "Stopped";
        }
    }

    public static abstract class b extends g {

        public static abstract class a extends b {

            /* renamed from: e7.g$b$a$a, reason: collision with other inner class name */
            public static final class C1731a extends a {

                /* renamed from: a, reason: collision with root package name */
                public static final C1731a f46233a = new C1731a();

                private C1731a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1731a);
                }

                public int hashCode() {
                    return 1925626749;
                }

                public String toString() {
                    return "CameraUnavailable";
                }
            }

            /* renamed from: e7.g$b$a$b, reason: collision with other inner class name */
            public static final class C1732b extends a {

                /* renamed from: a, reason: collision with root package name */
                public static final C1732b f46234a = new C1732b();

                private C1732b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1732b);
                }

                public int hashCode() {
                    return -615012514;
                }

                public String toString() {
                    return "ExcesiveMotion";
                }
            }

            public static final class c extends a {

                /* renamed from: a, reason: collision with root package name */
                public static final c f46235a = new c();

                private c() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public int hashCode() {
                    return 1179548814;
                }

                public String toString() {
                    return "InsufficientFeatures";
                }
            }

            public static final class d extends a {

                /* renamed from: a, reason: collision with root package name */
                public static final d f46236a = new d();

                private d() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public int hashCode() {
                    return -1675893147;
                }

                public String toString() {
                    return "InsufficientLight";
                }
            }

            public static final class e extends a {

                /* renamed from: a, reason: collision with root package name */
                public static final e f46237a = new e();

                private e() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof e);
                }

                public int hashCode() {
                    return -980573461;
                }

                public String toString() {
                    return "Internal";
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
                super(null);
            }
        }

        /* renamed from: e7.g$b$b, reason: collision with other inner class name */
        public static final class C1733b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1733b f46238a = new C1733b();

            private C1733b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1733b);
            }

            public int hashCode() {
                return 1016238102;
            }

            public String toString() {
                return "Paused";
            }
        }

        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f46239a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -968612881;
            }

            public String toString() {
                return "Resumed";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
            super(null);
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private g() {
    }
}
