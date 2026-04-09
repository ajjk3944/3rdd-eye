package af;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: af.O, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3806O {

    /* renamed from: a, reason: collision with root package name */
    private final String f26015a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f26016b;

    /* renamed from: c, reason: collision with root package name */
    private final List f26017c;

    /* renamed from: d, reason: collision with root package name */
    private final a f26018d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f26019e;

    /* renamed from: af.O$a */
    public static abstract class a {

        /* renamed from: af.O$a$a, reason: collision with other inner class name */
        public static final class C1006a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1006a f26020a = new C1006a();

            private C1006a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1006a);
            }

            public int hashCode() {
                return 21530147;
            }

            public String toString() {
                return "AllRight";
            }
        }

        /* renamed from: af.O$a$b */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final int f26021a;

            public b(int i10) {
                super(null);
                this.f26021a = i10;
            }

            public final int a() {
                return this.f26021a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f26021a == ((b) obj).f26021a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f26021a);
            }

            public String toString() {
                return "Issues(count=" + this.f26021a + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3806O(String id2, s9.d title, List values, a rating, boolean z10) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(title, "title");
        AbstractC6492s.i(values, "values");
        AbstractC6492s.i(rating, "rating");
        this.f26015a = id2;
        this.f26016b = title;
        this.f26017c = values;
        this.f26018d = rating;
        this.f26019e = z10;
    }

    public final String a() {
        return this.f26015a;
    }

    public final a b() {
        return this.f26018d;
    }

    public final s9.d c() {
        return this.f26016b;
    }

    public final List d() {
        return this.f26017c;
    }

    public final boolean e() {
        return this.f26019e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3806O)) {
            return false;
        }
        C3806O c3806o = (C3806O) obj;
        return AbstractC6492s.d(this.f26015a, c3806o.f26015a) && AbstractC6492s.d(this.f26016b, c3806o.f26016b) && AbstractC6492s.d(this.f26017c, c3806o.f26017c) && AbstractC6492s.d(this.f26018d, c3806o.f26018d) && this.f26019e == c3806o.f26019e;
    }

    public int hashCode() {
        return (((((((this.f26015a.hashCode() * 31) + this.f26016b.hashCode()) * 31) + this.f26017c.hashCode()) * 31) + this.f26018d.hashCode()) * 31) + Boolean.hashCode(this.f26019e);
    }

    public String toString() {
        return "Item(id=" + this.f26015a + ", title=" + this.f26016b + ", values=" + this.f26017c + ", rating=" + this.f26018d + ", isClickable=" + this.f26019e + ")";
    }

    /* renamed from: af.O$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final a f26022a;

        /* renamed from: b, reason: collision with root package name */
        private final s9.d f26023b;

        /* renamed from: c, reason: collision with root package name */
        private final W7.e f26024c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: af.O$b$a */
        public static final class a {
            private static final /* synthetic */ InterfaceC5826a $ENTRIES;
            private static final /* synthetic */ a[] $VALUES;
            public static final a BAND = new a("BAND", 0);
            public static final a CHANNEL = new a("CHANNEL", 1);
            public static final a CHANNEL_WIDTH = new a("CHANNEL_WIDTH", 2);
            public static final a STANDARD = new a("STANDARD", 3);
            public static final a MIMO = new a("MIMO", 4);
            public static final a SIGNAL = new a("SIGNAL", 5);
            public static final a UTILIZATION = new a("UTILIZATION", 6);
            public static final a TX_RETRIES = new a("TX_RETRIES", 7);
            public static final a PROVIDER = new a("PROVIDER", 8);

            private static final /* synthetic */ a[] $values() {
                return new a[]{BAND, CHANNEL, CHANNEL_WIDTH, STANDARD, MIMO, SIGNAL, UTILIZATION, TX_RETRIES, PROVIDER};
            }

            static {
                a[] aVarArr$values = $values();
                $VALUES = aVarArr$values;
                $ENTRIES = AbstractC5827b.a(aVarArr$values);
            }

            private a(String str, int i10) {
            }

            public static InterfaceC5826a getEntries() {
                return $ENTRIES;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        public b(a type, s9.d value, W7.e eVar) {
            AbstractC6492s.i(type, "type");
            AbstractC6492s.i(value, "value");
            this.f26022a = type;
            this.f26023b = value;
            this.f26024c = eVar;
        }

        public final W7.e a() {
            return this.f26024c;
        }

        public final a b() {
            return this.f26022a;
        }

        public final s9.d c() {
            return this.f26023b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f26022a == bVar.f26022a && AbstractC6492s.d(this.f26023b, bVar.f26023b) && this.f26024c == bVar.f26024c;
        }

        public int hashCode() {
            int iHashCode = ((this.f26022a.hashCode() * 31) + this.f26023b.hashCode()) * 31;
            W7.e eVar = this.f26024c;
            return iHashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            return "Value(type=" + this.f26022a + ", value=" + this.f26023b + ", rating=" + this.f26024c + ")";
        }

        public /* synthetic */ b(a aVar, s9.d dVar, W7.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, dVar, (i10 & 4) != 0 ? null : eVar);
        }
    }

    public /* synthetic */ C3806O(String str, s9.d dVar, List list, a aVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, dVar, list, aVar, (i10 & 16) != 0 ? aVar instanceof a.b : z10);
    }
}
