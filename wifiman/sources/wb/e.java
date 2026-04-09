package Wb;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final a f23801f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f23802a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23803b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23804c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23805d;

    /* renamed from: e, reason: collision with root package name */
    private final String f23806e;

    public static final class a {

        /* renamed from: Wb.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0894a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23807a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f23808b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f23809c;

            static {
                int[] iArr = new int[d.values().length];
                try {
                    iArr[d.SIGNAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d.FLOORPLAN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f23807a = iArr;
                int[] iArr2 = new int[b.values().length];
                try {
                    iArr2[b.SIGNAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[b.THROUGHPUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[b.LATENCY.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                f23808b = iArr2;
                int[] iArr3 = new int[c.values().length];
                try {
                    iArr3[c.WIFI.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr3[c.CELLULAR.ordinal()] = 2;
                } catch (NoSuchFieldError unused7) {
                }
                f23809c = iArr3;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String d(b bVar) {
            int i10 = C0894a.f23808b[bVar.ordinal()];
            if (i10 == 1) {
                return "signal";
            }
            if (i10 == 2) {
                return "throughput";
            }
            if (i10 == 3) {
                return "latency";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String e(c cVar) {
            int i10 = C0894a.f23809c[cVar.ordinal()];
            if (i10 == 1) {
                return "wifi";
            }
            if (i10 == 2) {
                return "cellular";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(d dVar) {
            int i10 = C0894a.f23807a[dVar.ordinal()];
            if (i10 == 1) {
                return "signal";
            }
            if (i10 == 2) {
                return "floorplan";
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
        public static final b SIGNAL = new b("SIGNAL", 0);
        public static final b THROUGHPUT = new b("THROUGHPUT", 1);
        public static final b LATENCY = new b("LATENCY", 2);

        private static final /* synthetic */ b[] $values() {
            return new b[]{SIGNAL, THROUGHPUT, LATENCY};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c WIFI = new c("WIFI", 0);
        public static final c CELLULAR = new c("CELLULAR", 1);

        private static final /* synthetic */ c[] $values() {
            return new c[]{WIFI, CELLULAR};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = AbstractC5827b.a(cVarArr$values);
        }

        private c(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d SIGNAL = new d("SIGNAL", 0);
        public static final d FLOORPLAN = new d("FLOORPLAN", 1);

        private static final /* synthetic */ d[] $values() {
            return new d[]{SIGNAL, FLOORPLAN};
        }

        static {
            d[] dVarArr$values = $values();
            $VALUES = dVarArr$values;
            $ENTRIES = AbstractC5827b.a(dVarArr$values);
        }

        private d(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    public e(int i10, boolean z10, String sectionId, String signalTypeId, String tabId) {
        AbstractC6492s.i(sectionId, "sectionId");
        AbstractC6492s.i(signalTypeId, "signalTypeId");
        AbstractC6492s.i(tabId, "tabId");
        this.f23802a = i10;
        this.f23803b = z10;
        this.f23804c = sectionId;
        this.f23805d = signalTypeId;
        this.f23806e = tabId;
    }

    public final int a() {
        return this.f23802a;
    }

    public final b b() {
        String str = this.f23804c;
        int iHashCode = str.hashCode();
        if (iHashCode != -902467928) {
            if (iHashCode != -323914198) {
                if (iHashCode == -46576386 && str.equals("latency")) {
                    return b.LATENCY;
                }
            } else if (str.equals("throughput")) {
                return b.THROUGHPUT;
            }
        } else if (str.equals("signal")) {
            return b.SIGNAL;
        }
        throw new IllegalStateException("unexpected value in section - `" + this.f23804c + "`");
    }

    public final String c() {
        return this.f23804c;
    }

    public final c d() {
        String str = this.f23805d;
        if (AbstractC6492s.d(str, "wifi")) {
            return c.WIFI;
        }
        if (AbstractC6492s.d(str, "cellular")) {
            return c.CELLULAR;
        }
        throw new IllegalStateException("unexpected value in signalType - `" + this.f23805d + "`");
    }

    public final String e() {
        return this.f23805d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f23802a == eVar.f23802a && this.f23803b == eVar.f23803b && AbstractC6492s.d(this.f23804c, eVar.f23804c) && AbstractC6492s.d(this.f23805d, eVar.f23805d) && AbstractC6492s.d(this.f23806e, eVar.f23806e);
    }

    public final d f() {
        String str = this.f23806e;
        if (AbstractC6492s.d(str, "signal")) {
            return d.SIGNAL;
        }
        if (AbstractC6492s.d(str, "floorplan")) {
            return d.FLOORPLAN;
        }
        throw new IllegalStateException("unexpected value in tab - `" + this.f23806e + "`");
    }

    public final String g() {
        return this.f23806e;
    }

    public final boolean h() {
        return this.f23803b;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f23802a) * 31) + Boolean.hashCode(this.f23803b)) * 31) + this.f23804c.hashCode()) * 31) + this.f23805d.hashCode()) * 31) + this.f23806e.hashCode();
    }

    public String toString() {
        return "RoomSignalMapperConfig(id=" + this.f23802a + ", tutorialShown=" + this.f23803b + ", sectionId=" + this.f23804c + ", signalTypeId=" + this.f23805d + ", tabId=" + this.f23806e + ")";
    }

    public /* synthetic */ e(int i10, boolean z10, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? false : z10, str, str2, str3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(d tab, b section, c signalType) {
        AbstractC6492s.i(tab, "tab");
        AbstractC6492s.i(section, "section");
        AbstractC6492s.i(signalType, "signalType");
        a aVar = f23801f;
        int i10 = 0;
        boolean z10 = false;
        this(i10, z10, aVar.d(section), aVar.e(signalType), aVar.f(tab), 3, null);
    }
}
