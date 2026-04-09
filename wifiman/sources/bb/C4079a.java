package bb;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: bb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4079a {

    /* renamed from: a, reason: collision with root package name */
    private final String f33091a;

    /* renamed from: b, reason: collision with root package name */
    private final List f33092b;

    /* renamed from: bb.a$a, reason: collision with other inner class name */
    public static final class C1151a {

        /* renamed from: a, reason: collision with root package name */
        private final long f33093a;

        /* renamed from: b, reason: collision with root package name */
        private final Ya.a f33094b;

        public C1151a(long j10, Ya.a aVar) {
            this.f33093a = j10;
            this.f33094b = aVar;
        }

        public final long a() {
            return this.f33093a;
        }

        public final Ya.a b() {
            return this.f33094b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1151a)) {
                return false;
            }
            C1151a c1151a = (C1151a) obj;
            return this.f33093a == c1151a.f33093a && AbstractC6492s.d(this.f33094b, c1151a.f33094b);
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.f33093a) * 31;
            Ya.a aVar = this.f33094b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "Metadata(created=" + this.f33093a + ", etag=" + this.f33094b + ")";
        }
    }

    /* renamed from: bb.a$b */
    public static final class b {
        public static String a(String value) {
            AbstractC6492s.i(value, "value");
            return value;
        }

        public static final boolean b(String str, String str2) {
            return AbstractC6492s.d(str, str2);
        }

        public static int c(String str) {
            return str.hashCode();
        }

        public static String d(String str) {
            return "Version(value=" + str + ")";
        }
    }

    public /* synthetic */ C4079a(String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list);
    }

    public final List a() {
        return this.f33092b;
    }

    public final String b() {
        return this.f33091a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4079a) && b.b(this.f33091a, ((C4079a) obj).f33091a);
    }

    public int hashCode() {
        return b.c(this.f33091a);
    }

    public String toString() {
        return "UiDBSnapshot(version=" + b.d(this.f33091a) + ", products=" + this.f33092b + ")";
    }

    private C4079a(String version, List products) {
        AbstractC6492s.i(version, "version");
        AbstractC6492s.i(products, "products");
        this.f33091a = version;
        this.f33092b = products;
    }
}
