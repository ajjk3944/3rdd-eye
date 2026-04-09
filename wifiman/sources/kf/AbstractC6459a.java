package kf;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6459a {

    /* renamed from: kf.a$a, reason: collision with other inner class name */
    public static final class C1908a extends AbstractC6459a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1908a f51423a = new C1908a();

        private C1908a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1908a);
        }

        public int hashCode() {
            return 1436370078;
        }

        public String toString() {
            return "Content";
        }
    }

    /* renamed from: kf.a$b */
    public static abstract class b extends AbstractC6459a {

        /* renamed from: kf.a$b$a, reason: collision with other inner class name */
        public static final class C1909a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1909a f51424a = new C1909a();

            private C1909a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1909a);
            }

            public int hashCode() {
                return -1253724110;
            }

            public String toString() {
                return "AllFilteredOut";
            }
        }

        /* renamed from: kf.a$b$b, reason: collision with other inner class name */
        public static final class C1910b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1910b f51425a = new C1910b();

            private C1910b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1910b);
            }

            public int hashCode() {
                return 1424954767;
            }

            public String toString() {
                return "NoResultsYet";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
            super(null);
        }
    }

    /* renamed from: kf.a$c */
    public static final class c extends AbstractC6459a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f51426a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 821490017;
        }

        public String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ AbstractC6459a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC6459a() {
    }
}
