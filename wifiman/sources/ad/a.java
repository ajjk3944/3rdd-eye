package Ad;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.i;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Ad.a$a, reason: collision with other inner class name */
    public static final class EnumC0020a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC0020a[] $VALUES;
        public static final EnumC0020a DROPPED_CONNECTIVITY = new EnumC0020a("DROPPED_CONNECTIVITY", 0);
        public static final EnumC0020a POOR_LATENCY = new EnumC0020a("POOR_LATENCY", 1);
        public static final EnumC0020a POOR_THROUGHPUT = new EnumC0020a("POOR_THROUGHPUT", 2);
        public static final EnumC0020a NOT_AS_EXPECTED = new EnumC0020a("NOT_AS_EXPECTED", 3);

        private static final /* synthetic */ EnumC0020a[] $values() {
            return new EnumC0020a[]{DROPPED_CONNECTIVITY, POOR_LATENCY, POOR_THROUGHPUT, NOT_AS_EXPECTED};
        }

        static {
            EnumC0020a[] enumC0020aArr$values = $values();
            $VALUES = enumC0020aArr$values;
            $ENTRIES = AbstractC5827b.a(enumC0020aArr$values);
        }

        private EnumC0020a(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static EnumC0020a valueOf(String str) {
            return (EnumC0020a) Enum.valueOf(EnumC0020a.class, str);
        }

        public static EnumC0020a[] values() {
            return (EnumC0020a[]) $VALUES.clone();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f615a;

        /* renamed from: b, reason: collision with root package name */
        private final C0021a f616b;

        /* renamed from: Ad.a$b$a, reason: collision with other inner class name */
        public static final class C0021a {

            /* renamed from: a, reason: collision with root package name */
            private final EnumC0020a f617a;

            /* renamed from: b, reason: collision with root package name */
            private final String f618b;

            public C0021a(EnumC0020a enumC0020a, String str) {
                this.f617a = enumC0020a;
                this.f618b = str;
            }

            public final String a() {
                return this.f618b;
            }

            public final EnumC0020a b() {
                return this.f617a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0021a)) {
                    return false;
                }
                C0021a c0021a = (C0021a) obj;
                return this.f617a == c0021a.f617a && AbstractC6492s.d(this.f618b, c0021a.f618b);
            }

            public int hashCode() {
                EnumC0020a enumC0020a = this.f617a;
                int iHashCode = (enumC0020a == null ? 0 : enumC0020a.hashCode()) * 31;
                String str = this.f618b;
                return iHashCode + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "Form(issueType=" + this.f617a + ", comment=" + this.f618b + ")";
            }
        }

        public b(long j10, C0021a c0021a) {
            this.f615a = j10;
            this.f616b = c0021a;
        }

        public final C0021a a() {
            return this.f616b;
        }

        public final long b() {
            return this.f615a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f615a == bVar.f615a && AbstractC6492s.d(this.f616b, bVar.f616b);
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.f615a) * 31;
            C0021a c0021a = this.f616b;
            return iHashCode + (c0021a == null ? 0 : c0021a.hashCode());
        }

        public String toString() {
            return "Params(resultId=" + this.f615a + ", form=" + this.f616b + ")";
        }
    }

    AbstractC5912b a(b bVar);

    i b();
}
