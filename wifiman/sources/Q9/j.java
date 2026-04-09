package Q9;

import Li.D;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public interface j {

    public static abstract class a {

        /* renamed from: Q9.j$a$a, reason: collision with other inner class name */
        public static final class C0677a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0677a f19270a = new C0677a();

            private C0677a() {
                super(null);
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final b f19271a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(b dest) {
                super(null);
                AbstractC6492s.i(dest, "dest");
                this.f19271a = dest;
            }

            public final b a() {
                return this.f19271a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(this.f19271a, ((b) obj).f19271a);
            }

            public int hashCode() {
                return this.f19271a.hashCode();
            }

            public String toString() {
                return "NavigateBackTo(dest=" + this.f19271a + ")";
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            private final String f19272a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f19273b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String key, Object obj) {
                super(null);
                AbstractC6492s.i(key, "key");
                this.f19272a = key;
                this.f19273b = obj;
            }

            public final String a() {
                return this.f19272a;
            }

            public final Object b() {
                return this.f19273b;
            }
        }

        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            private final b f19274a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(b dest) {
                super(null);
                AbstractC6492s.i(dest, "dest");
                this.f19274a = dest;
            }

            public final b a() {
                return this.f19274a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && AbstractC6492s.d(this.f19274a, ((d) obj).f19274a);
            }

            public int hashCode() {
                return this.f19274a.hashCode();
            }

            public String toString() {
                return "NavigateTo(dest=" + this.f19274a + ")";
            }
        }

        public static final class e extends a {

            /* renamed from: a, reason: collision with root package name */
            private final String f19275a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String url) {
                super(null);
                AbstractC6492s.i(url, "url");
                this.f19275a = url;
            }

            public final String a() {
                return this.f19275a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && AbstractC6492s.d(this.f19275a, ((e) obj).f19275a);
            }

            public int hashCode() {
                return this.f19275a.hashCode();
            }

            public String toString() {
                return "OpenWebBrowser(url=" + this.f19275a + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        String a();
    }

    D a();

    void b(a aVar);
}
