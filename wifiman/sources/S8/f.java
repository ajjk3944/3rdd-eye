package S8;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final double f20379a;

    /* renamed from: b, reason: collision with root package name */
    private final a f20380b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a EXCELLENT = new a("EXCELLENT", 0);
        public static final a GOOD = new a("GOOD", 1);
        public static final a FAIR = new a("FAIR", 2);
        public static final a POOR = new a("POOR", 3);

        private static final /* synthetic */ a[] $values() {
            return new a[]{EXCELLENT, GOOD, FAIR, POOR};
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

    public f(double d10) {
        this.f20379a = d10;
        this.f20380b = d10 >= 0.6d ? a.EXCELLENT : d10 >= 0.4d ? a.GOOD : d10 >= 0.25d ? a.FAIR : a.POOR;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f other) {
        AbstractC6492s.i(other, "other");
        return Double.compare(this.f20379a, other.f20379a);
    }

    public final a b() {
        return this.f20380b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Double.compare(this.f20379a, ((f) obj).f20379a) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.f20379a);
    }

    public String toString() {
        return "WifiChannelHealth(channelCapacity=" + this.f20379a + ")";
    }
}
