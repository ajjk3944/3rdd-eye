package Pb;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.smi.GenericAddress;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final a f18565e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f18566a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18567b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18568c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18569d;

    public static final class a {

        /* renamed from: Pb.i$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0656a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18570a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.NAME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.IP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f18570a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(b bVar) {
            int i10 = C0656a.f18570a[bVar.ordinal()];
            if (i10 == 1) {
                return "name";
            }
            if (i10 == 2) {
                return GenericAddress.TYPE_IP;
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
        public static final b IP = new b("IP", 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{NAME, IP};
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

    public i(int i10, String sortTypeId, boolean z10, boolean z11) {
        AbstractC6492s.i(sortTypeId, "sortTypeId");
        this.f18566a = i10;
        this.f18567b = sortTypeId;
        this.f18568c = z10;
        this.f18569d = z11;
    }

    public final boolean a() {
        return this.f18568c;
    }

    public final int b() {
        return this.f18566a;
    }

    public final b c() {
        String str = this.f18567b;
        if (AbstractC6492s.d(str, "name")) {
            return b.NAME;
        }
        if (AbstractC6492s.d(str, GenericAddress.TYPE_IP)) {
            return b.IP;
        }
        throw new IllegalStateException("unexpected value in sortType - `" + this.f18567b + "`");
    }

    public final String d() {
        return this.f18567b;
    }

    public final boolean e() {
        return this.f18569d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f18566a == iVar.f18566a && AbstractC6492s.d(this.f18567b, iVar.f18567b) && this.f18568c == iVar.f18568c && this.f18569d == iVar.f18569d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f18566a) * 31) + this.f18567b.hashCode()) * 31) + Boolean.hashCode(this.f18568c)) * 31) + Boolean.hashCode(this.f18569d);
    }

    public String toString() {
        return "RoomDiscoveryLanListConfig(id=" + this.f18566a + ", sortTypeId=" + this.f18567b + ", favoritesOnTop=" + this.f18568c + ", ubiquitiOnTop=" + this.f18569d + ")";
    }

    public /* synthetic */ i(int i10, String str, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, str, z10, z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(b sortType, boolean z10, boolean z11) {
        this(0, f18565e.b(sortType), z10, z11, 1, null);
        AbstractC6492s.i(sortType, "sortType");
    }
}
