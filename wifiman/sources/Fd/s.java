package Fd;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface s {

    public static abstract class a {

        /* renamed from: Fd.s$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0251a extends a {

            /* renamed from: Fd.s$a$a$a, reason: collision with other inner class name */
            public static final class C0252a extends AbstractC0251a {

                /* renamed from: a, reason: collision with root package name */
                private final boolean f6458a;

                public C0252a(boolean z10) {
                    super(null);
                    this.f6458a = z10;
                }

                public final boolean a() {
                    return this.f6458a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0252a) && this.f6458a == ((C0252a) obj).f6458a;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.f6458a);
                }

                public String toString() {
                    return "Tunnel(noInternetConnection=" + this.f6458a + ")";
                }
            }

            public /* synthetic */ AbstractC0251a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC0251a() {
                super(null);
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f6459a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -251055792;
            }

            public String toString() {
                return "Loading";
            }
        }

        public static abstract class c extends a {

            /* renamed from: Fd.s$a$c$a, reason: collision with other inner class name */
            public static final class C0253a extends c {

                /* renamed from: a, reason: collision with root package name */
                public static final C0253a f6460a = new C0253a();

                private C0253a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0253a);
                }

                public int hashCode() {
                    return -911909608;
                }

                public String toString() {
                    return "NCAApiUnavailable";
                }
            }

            public static final class b extends c {

                /* renamed from: a, reason: collision with root package name */
                public static final b f6461a = new b();

                private b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public int hashCode() {
                    return 1852989150;
                }

                public String toString() {
                    return "NoConsolesAndNoSSO";
                }
            }

            /* renamed from: Fd.s$a$c$c, reason: collision with other inner class name */
            public static final class C0254c extends c {

                /* renamed from: a, reason: collision with root package name */
                public static final C0254c f6462a = new C0254c();

                private C0254c() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0254c);
                }

                public int hashCode() {
                    return 231617760;
                }

                public String toString() {
                    return "NoHosts";
                }
            }

            public static final class d extends c {

                /* renamed from: a, reason: collision with root package name */
                public static final d f6463a = new d();

                private d() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public int hashCode() {
                    return 1968306698;
                }

                public String toString() {
                    return "NoInternetConnection";
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

    gg.i getState();
}
