package Pb;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final a f18555e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f18556a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18557b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18558c;

    /* renamed from: d, reason: collision with root package name */
    private final String f18559d;

    public static final class a {

        /* renamed from: Pb.g$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0654a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18560a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.NAME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.MAC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.SIGNAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f18560a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(b bVar) {
            int i10 = C0654a.f18560a[bVar.ordinal()];
            if (i10 == 1) {
                return "name";
            }
            if (i10 == 2) {
                return "mac";
            }
            if (i10 == 3) {
                return "signal";
            }
            throw new NoWhenBranchMatchedException();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b NAME = new b("NAME", 0);
        public static final b SIGNAL = new b("SIGNAL", 1);
        public static final b MAC = new b("MAC", 2);

        private static final /* synthetic */ b[] $values() {
            return new b[]{NAME, SIGNAL, MAC};
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

    public g(int i10, boolean z10, boolean z11, String sortTypeId) {
        AbstractC6492s.i(sortTypeId, "sortTypeId");
        this.f18556a = i10;
        this.f18557b = z10;
        this.f18558c = z11;
        this.f18559d = sortTypeId;
    }

    public final boolean a() {
        return this.f18557b;
    }

    public final int b() {
        return this.f18556a;
    }

    public final b c() {
        String str = this.f18559d;
        int iHashCode = str.hashCode();
        if (iHashCode != -902467928) {
            if (iHashCode != 107855) {
                if (iHashCode == 3373707 && str.equals("name")) {
                    return b.NAME;
                }
            } else if (str.equals("mac")) {
                return b.MAC;
            }
        } else if (str.equals("signal")) {
            return b.SIGNAL;
        }
        throw new IllegalStateException("unexpected value in sort_type - `" + this.f18559d + "`");
    }

    public final String d() {
        return this.f18559d;
    }

    public final boolean e() {
        return this.f18558c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f18556a == gVar.f18556a && this.f18557b == gVar.f18557b && this.f18558c == gVar.f18558c && AbstractC6492s.d(this.f18559d, gVar.f18559d);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f18556a) * 31) + Boolean.hashCode(this.f18557b)) * 31) + Boolean.hashCode(this.f18558c)) * 31) + this.f18559d.hashCode();
    }

    public String toString() {
        return "RoomDiscoveryBluetoothListConfig(id=" + this.f18556a + ", connectedOnTop=" + this.f18557b + ", ubiquitiGrouped=" + this.f18558c + ", sortTypeId=" + this.f18559d + ")";
    }

    public /* synthetic */ g(int i10, boolean z10, boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, z10, z11, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(boolean z10, boolean z11, b sortType) {
        this(0, z10, z11, f18555e.b(sortType), 1, null);
        AbstractC6492s.i(sortType, "sortType");
    }
}
