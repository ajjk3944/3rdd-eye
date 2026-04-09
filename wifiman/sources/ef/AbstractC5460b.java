package ef;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ef.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5460b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f46388a = 0;

    /* renamed from: ef.b$a */
    public static abstract class a extends AbstractC5460b {

        /* renamed from: ef.b$a$a, reason: collision with other inner class name */
        public static final class C1745a extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final C1745a f46389b = new C1745a();

            private C1745a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1745a);
            }

            public int hashCode() {
                return -307356443;
            }

            public String toString() {
                return "Signal";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(null);
        }
    }

    /* renamed from: ef.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC1746b extends AbstractC5460b {

        /* renamed from: ef.b$b$a */
        public static final class a extends AbstractC1746b {

            /* renamed from: b, reason: collision with root package name */
            public static final a f46390b = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -2036306323;
            }

            public String toString() {
                return "ChannelHealth";
            }
        }

        /* renamed from: ef.b$b$b, reason: collision with other inner class name */
        public static final class C1747b extends AbstractC1746b {

            /* renamed from: b, reason: collision with root package name */
            public static final C1747b f46391b = new C1747b();

            private C1747b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1747b);
            }

            public int hashCode() {
                return -1073338373;
            }

            public String toString() {
                return "Overall";
            }
        }

        /* renamed from: ef.b$b$c */
        public static final class c extends AbstractC1746b {

            /* renamed from: b, reason: collision with root package name */
            public static final c f46392b = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1231688993;
            }

            public String toString() {
                return "RadioCapability";
            }
        }

        /* renamed from: ef.b$b$d */
        public static final class d extends AbstractC1746b {

            /* renamed from: b, reason: collision with root package name */
            public static final d f46393b = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1575779869;
            }

            public String toString() {
                return "Spectrum";
            }
        }

        public /* synthetic */ AbstractC1746b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1746b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC5460b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC5460b() {
    }
}
