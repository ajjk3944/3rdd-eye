package Id;

import Id.a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface h {

    public static abstract class a {

        /* renamed from: Id.h$a$a, reason: collision with other inner class name */
        public static final class C0376a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0376a f9088a = new C0376a();

            private C0376a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0376a);
            }

            public int hashCode() {
                return 174739920;
            }

            public String toString() {
                return "Available";
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final Id.c f9089a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Id.c reason) {
                super(null);
                AbstractC6492s.i(reason, "reason");
                this.f9089a = reason;
            }

            public final Id.c a() {
                return this.f9089a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(this.f9089a, ((b) obj).f9089a);
            }

            public int hashCode() {
                return this.f9089a.hashCode();
            }

            public String toString() {
                return "ConnectionFailed(reason=" + this.f9089a + ")";
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            private final a.c f9090a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a.c reason) {
                super(null);
                AbstractC6492s.i(reason, "reason");
                this.f9090a = reason;
            }

            public final a.c a() {
                return this.f9090a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC6492s.d(this.f9090a, ((c) obj).f9090a);
            }

            public int hashCode() {
                return this.f9090a.hashCode();
            }

            public String toString() {
                return "Disabled(reason=" + this.f9090a + ")";
            }
        }

        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f9091a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 301841923;
            }

            public String toString() {
                return "Loading";
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
