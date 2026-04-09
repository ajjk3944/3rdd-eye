package If;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class E {

    public static final class a extends E {

        /* renamed from: a, reason: collision with root package name */
        private final String f9132a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String version) {
            super(null);
            AbstractC6492s.i(version, "version");
            this.f9132a = version;
        }

        public String a() {
            return this.f9132a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f9132a, ((a) obj).f9132a);
        }

        public int hashCode() {
            return this.f9132a.hashCode();
        }

        public String toString() {
            return "Available(version=" + this.f9132a + ")";
        }
    }

    public static final class b extends E {

        /* renamed from: a, reason: collision with root package name */
        private final String f9133a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String version) {
            super(null);
            AbstractC6492s.i(version, "version");
            this.f9133a = version;
        }

        public String a() {
            return this.f9133a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f9133a, ((b) obj).f9133a);
        }

        public int hashCode() {
            return this.f9133a.hashCode();
        }

        public String toString() {
            return "Failed(version=" + this.f9133a + ")";
        }
    }

    public static final class c extends E {

        /* renamed from: a, reason: collision with root package name */
        private final String f9134a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String version) {
            super(null);
            AbstractC6492s.i(version, "version");
            this.f9134a = version;
        }

        public String a() {
            return this.f9134a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC6492s.d(this.f9134a, ((c) obj).f9134a);
        }

        public int hashCode() {
            return this.f9134a.hashCode();
        }

        public String toString() {
            return "Success(version=" + this.f9134a + ")";
        }
    }

    public /* synthetic */ E(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private E() {
    }
}
