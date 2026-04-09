package Od;

import gg.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: Od.a$a, reason: collision with other inner class name */
    public interface InterfaceC0616a {
        i a();
    }

    public static abstract class b {

        /* renamed from: Od.a$b$a, reason: collision with other inner class name */
        public static abstract class AbstractC0617a extends b {

            /* renamed from: Od.a$b$a$a, reason: collision with other inner class name */
            public static final class C0618a extends AbstractC0617a {

                /* renamed from: a, reason: collision with root package name */
                public static final C0618a f17780a = new C0618a();

                private C0618a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0618a);
                }

                public int hashCode() {
                    return 579308492;
                }

                public String toString() {
                    return "DegradedPerformance";
                }
            }

            /* renamed from: Od.a$b$a$b, reason: collision with other inner class name */
            public static final class C0619b extends AbstractC0617a {

                /* renamed from: a, reason: collision with root package name */
                public static final C0619b f17781a = new C0619b();

                private C0619b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0619b);
                }

                public int hashCode() {
                    return 1423488848;
                }

                public String toString() {
                    return "Fine";
                }
            }

            public /* synthetic */ AbstractC0617a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC0617a() {
                super(null);
            }
        }

        /* renamed from: Od.a$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC0620b extends b {

            /* renamed from: Od.a$b$b$a, reason: collision with other inner class name */
            public static final class C0621a extends AbstractC0620b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0621a f17782a = new C0621a();

                private C0621a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0621a);
                }

                public int hashCode() {
                    return -1130038730;
                }

                public String toString() {
                    return "Major";
                }
            }

            /* renamed from: Od.a$b$b$b, reason: collision with other inner class name */
            public static final class C0622b extends AbstractC0620b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0622b f17783a = new C0622b();

                private C0622b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0622b);
                }

                public int hashCode() {
                    return -965418306;
                }

                public String toString() {
                    return "Partial";
                }
            }

            public /* synthetic */ AbstractC0620b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC0620b() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    b a();

    b b();
}
