package E8;

import gg.AbstractC5912b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rd.b;

/* renamed from: E8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2653a {

    /* renamed from: E8.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0176a {

        /* renamed from: E8.a$a$a, reason: collision with other inner class name */
        public static final class C0177a {

            /* renamed from: a, reason: collision with root package name */
            private final b.a f4129a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f4130b;

            public C0177a(b.a endpoint, boolean z10) {
                AbstractC6492s.i(endpoint, "endpoint");
                this.f4129a = endpoint;
                this.f4130b = z10;
            }

            public final b.a a() {
                return this.f4129a;
            }

            public final boolean b() {
                return this.f4130b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0177a)) {
                    return false;
                }
                C0177a c0177a = (C0177a) obj;
                return AbstractC6492s.d(this.f4129a, c0177a.f4129a) && this.f4130b == c0177a.f4130b;
            }

            public int hashCode() {
                return (this.f4129a.hashCode() * 31) + Boolean.hashCode(this.f4130b);
            }

            public String toString() {
                return "EndpointItem(endpoint=" + this.f4129a + ", seen=" + this.f4130b + ")";
            }
        }

        /* renamed from: E8.a$a$b */
        public static final class b extends AbstractC0176a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f4131a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1582811159;
            }

            public String toString() {
                return "NothingToShow";
            }
        }

        /* renamed from: E8.a$a$c */
        public static final class c extends AbstractC0176a {

            /* renamed from: a, reason: collision with root package name */
            private final List f4132a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List items) {
                super(null);
                AbstractC6492s.i(items, "items");
                this.f4132a = items;
            }

            public final List a() {
                return this.f4132a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC6492s.d(this.f4132a, ((c) obj).f4132a);
            }

            public int hashCode() {
                return this.f4132a.hashCode();
            }

            public String toString() {
                return "Visible(items=" + this.f4132a + ")";
            }
        }

        public /* synthetic */ AbstractC0176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0176a() {
        }
    }

    AbstractC5912b a();

    gg.i getState();
}
