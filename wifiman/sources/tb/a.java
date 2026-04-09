package Tb;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0791a f21534f = new C0791a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f21535a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21536b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21537c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21538d;

    /* renamed from: e, reason: collision with root package name */
    private final String f21539e;

    /* renamed from: Tb.a$a, reason: collision with other inner class name */
    public static final class C0791a {

        /* renamed from: Tb.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0792a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f21540a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f21541b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f21542c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ int[] f21543d;

            static {
                int[] iArr = new int[e.values().length];
                try {
                    iArr[e.ALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.GHZ_2.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.GHZ_5.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[e.GHZ_6.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f21540a = iArr;
                int[] iArr2 = new int[b.values().length];
                try {
                    iArr2[b.NETWORKS.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[b.CHANNEL_HEALTH.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                f21541b = iArr2;
                int[] iArr3 = new int[d.values().length];
                try {
                    iArr3[d.SSID.ordinal()] = 1;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr3[d.SIGNAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused8) {
                }
                f21542c = iArr3;
                int[] iArr4 = new int[c.values().length];
                try {
                    iArr4[c.NUMBER.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr4[c.HEALTH.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                f21543d = iArr4;
            }
        }

        public /* synthetic */ C0791a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String e(b bVar) {
            int i10 = C0792a.f21541b[bVar.ordinal()];
            if (i10 == 1) {
                return "ssid_scan";
            }
            if (i10 == 2) {
                return "channel_quality";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(c cVar) {
            int i10 = C0792a.f21543d[cVar.ordinal()];
            if (i10 == 1) {
                return "number";
            }
            if (i10 == 2) {
                return "quality";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String g(d dVar) {
            int i10 = C0792a.f21542c[dVar.ordinal()];
            if (i10 == 1) {
                return "ssid";
            }
            if (i10 == 2) {
                return "signal";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String h(e eVar) {
            int i10 = C0792a.f21540a[eVar.ordinal()];
            if (i10 == 1) {
                return "all";
            }
            if (i10 == 2) {
                return "2ghz";
            }
            if (i10 == 3) {
                return "5ghz";
            }
            if (i10 == 4) {
                return "6ghz";
            }
            throw new NoWhenBranchMatchedException();
        }

        private C0791a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b NETWORKS = new b("NETWORKS", 0);
        public static final b CHANNEL_HEALTH = new b("CHANNEL_HEALTH", 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{NETWORKS, CHANNEL_HEALTH};
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
        public static final c NUMBER = new c("NUMBER", 0);
        public static final c HEALTH = new c("HEALTH", 1);

        private static final /* synthetic */ c[] $values() {
            return new c[]{NUMBER, HEALTH};
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
        public static final d SSID = new d("SSID", 0);
        public static final d SIGNAL = new d("SIGNAL", 1);

        private static final /* synthetic */ d[] $values() {
            return new d[]{SSID, SIGNAL};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ e[] $VALUES;
        public static final e ALL = new e("ALL", 0);
        public static final e GHZ_2 = new e("GHZ_2", 1);
        public static final e GHZ_5 = new e("GHZ_5", 2);
        public static final e GHZ_6 = new e("GHZ_6", 3);

        private static final /* synthetic */ e[] $values() {
            return new e[]{ALL, GHZ_2, GHZ_5, GHZ_6};
        }

        static {
            e[] eVarArr$values = $values();
            $VALUES = eVarArr$values;
            $ENTRIES = AbstractC5827b.a(eVarArr$values);
        }

        private e(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    public a(int i10, String spectrumId, String sortTypeNetworksId, String sortTypeChannelHealthId, String sectionId) {
        AbstractC6492s.i(spectrumId, "spectrumId");
        AbstractC6492s.i(sortTypeNetworksId, "sortTypeNetworksId");
        AbstractC6492s.i(sortTypeChannelHealthId, "sortTypeChannelHealthId");
        AbstractC6492s.i(sectionId, "sectionId");
        this.f21535a = i10;
        this.f21536b = spectrumId;
        this.f21537c = sortTypeNetworksId;
        this.f21538d = sortTypeChannelHealthId;
        this.f21539e = sectionId;
    }

    public final int a() {
        return this.f21535a;
    }

    public final b b() {
        String str = this.f21539e;
        if (AbstractC6492s.d(str, "ssid_scan")) {
            return b.NETWORKS;
        }
        if (AbstractC6492s.d(str, "channel_quality")) {
            return b.CHANNEL_HEALTH;
        }
        throw new IllegalStateException("unexpected value in scan_feature - `" + this.f21539e + "`");
    }

    public final String c() {
        return this.f21539e;
    }

    public final c d() {
        String str = this.f21538d;
        if (AbstractC6492s.d(str, "number")) {
            return c.NUMBER;
        }
        if (AbstractC6492s.d(str, "quality")) {
            return c.HEALTH;
        }
        throw new IllegalStateException("unexpected value in sort_type_quality - `" + this.f21538d + "`");
    }

    public final String e() {
        return this.f21538d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f21535a == aVar.f21535a && AbstractC6492s.d(this.f21536b, aVar.f21536b) && AbstractC6492s.d(this.f21537c, aVar.f21537c) && AbstractC6492s.d(this.f21538d, aVar.f21538d) && AbstractC6492s.d(this.f21539e, aVar.f21539e);
    }

    public final d f() {
        String str = this.f21537c;
        if (AbstractC6492s.d(str, "ssid")) {
            return d.SSID;
        }
        if (AbstractC6492s.d(str, "signal")) {
            return d.SIGNAL;
        }
        throw new IllegalStateException("unexpected value in sort_type - `" + this.f21537c + "`");
    }

    public final String g() {
        return this.f21537c;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final e h() {
        String str = this.f21536b;
        switch (str.hashCode()) {
            case 96673:
                if (str.equals("all")) {
                    return e.ALL;
                }
                break;
            case 1591879:
                if (str.equals("2ghz")) {
                    return e.GHZ_2;
                }
                break;
            case 1681252:
                if (str.equals("5ghz")) {
                    return e.GHZ_5;
                }
                break;
            case 1711043:
                if (str.equals("6ghz")) {
                    return e.GHZ_6;
                }
                break;
        }
        throw new IllegalStateException("unexpected value in chart_spectrum - `" + this.f21536b + "`");
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f21535a) * 31) + this.f21536b.hashCode()) * 31) + this.f21537c.hashCode()) * 31) + this.f21538d.hashCode()) * 31) + this.f21539e.hashCode();
    }

    public final String i() {
        return this.f21536b;
    }

    public String toString() {
        return "RoomWifiScanHomeConfig(id=" + this.f21535a + ", spectrumId=" + this.f21536b + ", sortTypeNetworksId=" + this.f21537c + ", sortTypeChannelHealthId=" + this.f21538d + ", sectionId=" + this.f21539e + ")";
    }

    public /* synthetic */ a(int i10, String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, str, str2, str3, str4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(e spectrum, b section, d sortTypeNetworks, c sortTypeChannelHealth) {
        AbstractC6492s.i(spectrum, "spectrum");
        AbstractC6492s.i(section, "section");
        AbstractC6492s.i(sortTypeNetworks, "sortTypeNetworks");
        AbstractC6492s.i(sortTypeChannelHealth, "sortTypeChannelHealth");
        C0791a c0791a = f21534f;
        int i10 = 0;
        this(i10, c0791a.h(spectrum), c0791a.g(sortTypeNetworks), c0791a.f(sortTypeChannelHealth), c0791a.e(section), 1, null);
    }
}
