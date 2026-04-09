package Sb;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0734a f20409c = new C0734a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f20410a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20411b;

    /* renamed from: Sb.a$a, reason: collision with other inner class name */
    public static final class C0734a {

        /* renamed from: Sb.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0735a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f20412a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.NAME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.SIGNAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f20412a = iArr;
            }
        }

        public /* synthetic */ C0734a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(b bVar) {
            int i10 = C0735a.f20412a[bVar.ordinal()];
            if (i10 == 1) {
                return "name";
            }
            if (i10 == 2) {
                return "signal";
            }
            throw new NoWhenBranchMatchedException();
        }

        private C0734a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b NAME = new b("NAME", 0);
        public static final b SIGNAL = new b("SIGNAL", 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{NAME, SIGNAL};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public a(int i10, String sortTypeNetworksApId) {
        AbstractC6492s.i(sortTypeNetworksApId, "sortTypeNetworksApId");
        this.f20410a = i10;
        this.f20411b = sortTypeNetworksApId;
    }

    public final int a() {
        return this.f20410a;
    }

    public final b b() {
        String str = this.f20411b;
        if (AbstractC6492s.d(str, "name")) {
            return b.NAME;
        }
        if (AbstractC6492s.d(str, "signal")) {
            return b.SIGNAL;
        }
        throw new IllegalStateException("unexpected value in sort_type - `" + this.f20411b + "`");
    }

    public final String c() {
        return this.f20411b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f20410a == aVar.f20410a && AbstractC6492s.d(this.f20411b, aVar.f20411b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f20410a) * 31) + this.f20411b.hashCode();
    }

    public String toString() {
        return "RoomWifiNetworkDetailConfig(id=" + this.f20410a + ", sortTypeNetworksApId=" + this.f20411b + ")";
    }

    public /* synthetic */ a(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(b sortTypeNetworks) {
        this(0, f20409c.b(sortTypeNetworks), 1, null);
        AbstractC6492s.i(sortTypeNetworks, "sortTypeNetworks");
    }
}
