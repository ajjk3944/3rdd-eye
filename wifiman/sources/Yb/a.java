package Yb;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: m, reason: collision with root package name */
    public static final C0944a f24830m = new C0944a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f24831a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24832b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24833c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24834d;

    /* renamed from: e, reason: collision with root package name */
    private final Double f24835e;

    /* renamed from: f, reason: collision with root package name */
    private final Double f24836f;

    /* renamed from: g, reason: collision with root package name */
    private final String f24837g;

    /* renamed from: h, reason: collision with root package name */
    private final String f24838h;

    /* renamed from: i, reason: collision with root package name */
    private final Integer f24839i;

    /* renamed from: j, reason: collision with root package name */
    private final String f24840j;

    /* renamed from: k, reason: collision with root package name */
    private final long f24841k;

    /* renamed from: l, reason: collision with root package name */
    private final String f24842l;

    /* renamed from: Yb.a$a, reason: collision with other inner class name */
    public static final class C0944a {
        public /* synthetic */ C0944a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0944a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b AUTO = new b("AUTO", 0);
        public static final b MANUAL = new b("MANUAL", 1);
        public static final b ISP = new b("ISP", 2);

        /* renamed from: Yb.a$b$a, reason: collision with other inner class name */
        public /* synthetic */ class C0945a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f24843a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.AUTO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.MANUAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ISP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f24843a = iArr;
            }
        }

        private static final /* synthetic */ b[] $values() {
            return new b[]{AUTO, MANUAL, ISP};
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

        public final String getDbId() {
            int i10 = C0945a.f24843a[ordinal()];
            if (i10 == 1) {
                return "auto";
            }
            if (i10 == 2) {
                return "man";
            }
            if (i10 == 3) {
                return "isp";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public a(String id2, String str, String str2, String str3, Double d10, Double d11, String str4, String str5, Integer num, String str6, long j10, String _type) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(_type, "_type");
        this.f24831a = id2;
        this.f24832b = str;
        this.f24833c = str2;
        this.f24834d = str3;
        this.f24835e = d10;
        this.f24836f = d11;
        this.f24837g = str4;
        this.f24838h = str5;
        this.f24839i = num;
        this.f24840j = str6;
        this.f24841k = j10;
        this.f24842l = _type;
    }

    public final String a() {
        return this.f24832b;
    }

    public final String b() {
        return this.f24833c;
    }

    public final String c() {
        return this.f24834d;
    }

    public final String d() {
        return this.f24831a;
    }

    public final Double e() {
        return this.f24835e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && t.C(((a) obj).f24831a, this.f24831a, true);
    }

    public final Double f() {
        return this.f24836f;
    }

    public final String g() {
        return this.f24837g;
    }

    public final String h() {
        return this.f24838h;
    }

    public int hashCode() {
        String str = this.f24840j;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final Integer i() {
        return this.f24839i;
    }

    public final long j() {
        return this.f24841k;
    }

    public final b k() {
        String str = this.f24842l;
        int iHashCode = str.hashCode();
        if (iHashCode != 104582) {
            if (iHashCode != 107866) {
                if (iHashCode == 3005871 && str.equals("auto")) {
                    return b.AUTO;
                }
            } else if (str.equals("man")) {
                return b.MANUAL;
            }
        } else if (str.equals("isp")) {
            return b.ISP;
        }
        return b.AUTO;
    }

    public final String l() {
        return this.f24840j;
    }

    protected final String m() {
        return this.f24842l;
    }

    public String toString() {
        return "SPEEDTEST SERVER " + this.f24840j + " by " + this.f24837g + " in " + this.f24832b + "(" + this.f24833c + ") - lat: " + this.f24835e + ", lon: " + this.f24836f + ", speedMbps: " + this.f24839i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String id2, String str, String str2, String str3, Double d10, Double d11, String str4, String str5, Integer num, String str6, long j10, b type) {
        this(id2, str, str2, str3, d10, d11, str4, str5, num, str6, j10, type.getDbId());
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(type, "type");
    }
}
