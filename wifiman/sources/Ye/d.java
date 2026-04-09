package Ye;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f24914a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -476028512;
        }

        public String toString() {
            return "Available";
        }
    }

    public static abstract class b extends d {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f24915a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 326993813;
            }

            public String toString() {
                return "Loading";
            }
        }

        /* renamed from: Ye.d$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC0952b extends b {

            /* renamed from: Ye.d$b$b$a */
            public static final class a extends AbstractC0952b {

                /* renamed from: a, reason: collision with root package name */
                public static final a f24916a = new a();

                private a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public int hashCode() {
                    return -626055291;
                }

                public String toString() {
                    return "ArCoreNotInstalled";
                }
            }

            /* renamed from: Ye.d$b$b$b, reason: collision with other inner class name */
            public static final class C0953b extends AbstractC0952b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0953b f24917a = new C0953b();

                private C0953b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0953b);
                }

                public int hashCode() {
                    return -1935390622;
                }

                public String toString() {
                    return "CameraPermission";
                }
            }

            /* renamed from: Ye.d$b$b$c */
            public static final class c extends AbstractC0952b {

                /* renamed from: a, reason: collision with root package name */
                public static final c f24918a = new c();

                private c() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public int hashCode() {
                    return 1936743985;
                }

                public String toString() {
                    return "DeviceUnsupported";
                }
            }

            /* renamed from: Ye.d$b$b$d, reason: collision with other inner class name */
            public static final class C0954d extends AbstractC0952b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0954d f24919a = new C0954d();

                private C0954d() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0954d);
                }

                public int hashCode() {
                    return 1047971580;
                }

                public String toString() {
                    return "Unknown";
                }
            }

            public /* synthetic */ AbstractC0952b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC0952b() {
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

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private d() {
    }
}
