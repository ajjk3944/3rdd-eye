package xf;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private final s9.d f66038a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s9.d name) {
            super(null);
            AbstractC6492s.i(name, "name");
            this.f66038a = name;
        }

        public final s9.d a() {
            return this.f66038a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f66038a, ((a) obj).f66038a);
        }

        public int hashCode() {
            return this.f66038a.hashCode();
        }

        public String toString() {
            return "Known(name=" + this.f66038a + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f66039a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1217351731;
        }

        public String toString() {
            return "Unknown";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
