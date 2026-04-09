package Be;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public static final N f1476a = new N();

    /* renamed from: b, reason: collision with root package name */
    private static final z.N f1477b = androidx.compose.foundation.layout.o.b(Y0.h.j(16), Y0.h.j(4));

    private N() {
    }

    public final z.N a() {
        return f1477b;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f1478a;

        /* renamed from: b, reason: collision with root package name */
        private final s9.b f1479b;

        /* renamed from: c, reason: collision with root package name */
        private final s9.d f1480c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f1481d;

        /* renamed from: e, reason: collision with root package name */
        private final EnumC0068a f1482e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: Be.N$a$a, reason: collision with other inner class name */
        public static final class EnumC0068a {
            private static final /* synthetic */ InterfaceC5826a $ENTRIES;
            private static final /* synthetic */ EnumC0068a[] $VALUES;
            public static final EnumC0068a DEFAULT = new EnumC0068a("DEFAULT", 0);
            public static final EnumC0068a DESTRUCTIVE = new EnumC0068a("DESTRUCTIVE", 1);

            private static final /* synthetic */ EnumC0068a[] $values() {
                return new EnumC0068a[]{DEFAULT, DESTRUCTIVE};
            }

            static {
                EnumC0068a[] enumC0068aArr$values = $values();
                $VALUES = enumC0068aArr$values;
                $ENTRIES = AbstractC5827b.a(enumC0068aArr$values);
            }

            private EnumC0068a(String str, int i10) {
            }

            public static InterfaceC5826a getEntries() {
                return $ENTRIES;
            }

            public static EnumC0068a valueOf(String str) {
                return (EnumC0068a) Enum.valueOf(EnumC0068a.class, str);
            }

            public static EnumC0068a[] values() {
                return (EnumC0068a[]) $VALUES.clone();
            }
        }

        public a(String id2, s9.b bVar, s9.d text, boolean z10, EnumC0068a type) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(text, "text");
            AbstractC6492s.i(type, "type");
            this.f1478a = id2;
            this.f1479b = bVar;
            this.f1480c = text;
            this.f1481d = z10;
            this.f1482e = type;
        }

        public final boolean a() {
            return this.f1481d;
        }

        public final s9.b b() {
            return this.f1479b;
        }

        public final String c() {
            return this.f1478a;
        }

        public final s9.d d() {
            return this.f1480c;
        }

        public final EnumC0068a e() {
            return this.f1482e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f1478a, aVar.f1478a) && AbstractC6492s.d(this.f1479b, aVar.f1479b) && AbstractC6492s.d(this.f1480c, aVar.f1480c) && this.f1481d == aVar.f1481d && this.f1482e == aVar.f1482e;
        }

        public int hashCode() {
            int iHashCode = this.f1478a.hashCode() * 31;
            s9.b bVar = this.f1479b;
            return ((((((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f1480c.hashCode()) * 31) + Boolean.hashCode(this.f1481d)) * 31) + this.f1482e.hashCode();
        }

        public String toString() {
            return "Item(id=" + this.f1478a + ", icon=" + this.f1479b + ", text=" + this.f1480c + ", enabled=" + this.f1481d + ", type=" + this.f1482e + ")";
        }

        public /* synthetic */ a(String str, s9.b bVar, s9.d dVar, boolean z10, EnumC0068a enumC0068a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : bVar, dVar, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? EnumC0068a.DEFAULT : enumC0068a);
        }
    }
}
