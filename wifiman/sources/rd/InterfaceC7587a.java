package rd;

import gg.AbstractC5912b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: rd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7587a {

    /* renamed from: rd.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC2100a {

        /* renamed from: rd.a$a$a, reason: collision with other inner class name */
        public static final class C2101a extends AbstractC2100a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2101a f60252a = new C2101a();

            private C2101a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2101a);
            }

            public int hashCode() {
                return -495998530;
            }

            public String toString() {
                return "Disabled";
            }
        }

        /* renamed from: rd.a$a$b */
        public static abstract class b extends AbstractC2100a {

            /* renamed from: rd.a$a$b$a, reason: collision with other inner class name */
            public static final class C2102a extends b {

                /* renamed from: a, reason: collision with root package name */
                private final int f60253a;

                public C2102a(int i10) {
                    super(null);
                    this.f60253a = i10;
                }

                public final int a() {
                    return this.f60253a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2102a) && this.f60253a == ((C2102a) obj).f60253a;
                }

                public int hashCode() {
                    return Integer.hashCode(this.f60253a);
                }

                public String toString() {
                    return "Idle(port=" + this.f60253a + ")";
                }
            }

            /* renamed from: rd.a$a$b$b, reason: collision with other inner class name */
            public static final class C2103b extends b {

                /* renamed from: a, reason: collision with root package name */
                public static final C2103b f60254a = new C2103b();

                private C2103b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2103b);
                }

                public int hashCode() {
                    return -89763168;
                }

                public String toString() {
                    return "Off";
                }
            }

            /* renamed from: rd.a$a$b$c */
            public static final class c extends b {

                /* renamed from: a, reason: collision with root package name */
                private final int f60255a;

                /* renamed from: b, reason: collision with root package name */
                private final int f60256b;

                public c(int i10, int i11) {
                    super(null);
                    this.f60255a = i10;
                    this.f60256b = i11;
                }

                public final int a() {
                    return this.f60256b;
                }

                public final int b() {
                    return this.f60255a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return this.f60255a == cVar.f60255a && this.f60256b == cVar.f60256b;
                }

                public int hashCode() {
                    return (Integer.hashCode(this.f60255a) * 31) + Integer.hashCode(this.f60256b);
                }

                public String toString() {
                    return "Running(port=" + this.f60255a + ", connections=" + this.f60256b + ")";
                }
            }

            /* renamed from: rd.a$a$b$d */
            public static final class d extends b {

                /* renamed from: a, reason: collision with root package name */
                public static final d f60257a = new d();

                private d() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public int hashCode() {
                    return 1033163183;
                }

                public String toString() {
                    return "Starting";
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC2100a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC2100a() {
        }
    }

    AbstractC5912b a();
}
