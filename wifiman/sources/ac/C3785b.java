package ac;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.PSKKeyManager;

/* renamed from: ac.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3785b {

    /* renamed from: o, reason: collision with root package name */
    public static final a f25914o = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f25915a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25916b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25917c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25918d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25919e;

    /* renamed from: f, reason: collision with root package name */
    private final String f25920f;

    /* renamed from: g, reason: collision with root package name */
    private final String f25921g;

    /* renamed from: h, reason: collision with root package name */
    private final String f25922h;

    /* renamed from: i, reason: collision with root package name */
    private final Integer f25923i;

    /* renamed from: j, reason: collision with root package name */
    private final String f25924j;

    /* renamed from: k, reason: collision with root package name */
    private final Integer f25925k;

    /* renamed from: l, reason: collision with root package name */
    private final Double f25926l;

    /* renamed from: m, reason: collision with root package name */
    private final Double f25927m;

    /* renamed from: n, reason: collision with root package name */
    private final String f25928n;

    /* renamed from: ac.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3785b(String id2, String consoleId, String str, String str2, String name, String str3, String str4, String str5, Integer num, String str6, Integer num2, Double d10, Double d11, String str7) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(consoleId, "consoleId");
        AbstractC6492s.i(name, "name");
        this.f25915a = id2;
        this.f25916b = consoleId;
        this.f25917c = str;
        this.f25918d = str2;
        this.f25919e = name;
        this.f25920f = str3;
        this.f25921g = str4;
        this.f25922h = str5;
        this.f25923i = num;
        this.f25924j = str6;
        this.f25925k = num2;
        this.f25926l = d10;
        this.f25927m = d11;
        this.f25928n = str7;
    }

    public final String a() {
        return this.f25916b;
    }

    public final String b() {
        return this.f25915a;
    }

    public final Integer c() {
        return this.f25925k;
    }

    public final Integer d() {
        return this.f25923i;
    }

    public final String e() {
        return this.f25924j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3785b)) {
            return false;
        }
        C3785b c3785b = (C3785b) obj;
        return AbstractC6492s.d(this.f25915a, c3785b.f25915a) && AbstractC6492s.d(this.f25916b, c3785b.f25916b) && AbstractC6492s.d(this.f25917c, c3785b.f25917c) && AbstractC6492s.d(this.f25918d, c3785b.f25918d) && AbstractC6492s.d(this.f25919e, c3785b.f25919e) && AbstractC6492s.d(this.f25920f, c3785b.f25920f) && AbstractC6492s.d(this.f25921g, c3785b.f25921g) && AbstractC6492s.d(this.f25922h, c3785b.f25922h) && AbstractC6492s.d(this.f25923i, c3785b.f25923i) && AbstractC6492s.d(this.f25924j, c3785b.f25924j) && AbstractC6492s.d(this.f25925k, c3785b.f25925k) && AbstractC6492s.d(this.f25926l, c3785b.f25926l) && AbstractC6492s.d(this.f25927m, c3785b.f25927m) && AbstractC6492s.d(this.f25928n, c3785b.f25928n);
    }

    public final Double f() {
        return this.f25926l;
    }

    public final String g() {
        return this.f25928n;
    }

    public final Double h() {
        return this.f25927m;
    }

    public int hashCode() {
        int iHashCode = ((this.f25915a.hashCode() * 31) + this.f25916b.hashCode()) * 31;
        String str = this.f25917c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25918d;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f25919e.hashCode()) * 31;
        String str3 = this.f25920f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25921g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f25922h;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f25923i;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f25924j;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.f25925k;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d10 = this.f25926l;
        int iHashCode10 = (iHashCode9 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f25927m;
        int iHashCode11 = (iHashCode10 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str7 = this.f25928n;
        return iHashCode11 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String i() {
        return this.f25919e;
    }

    public final String j() {
        return this.f25920f;
    }

    public final String k() {
        return this.f25922h;
    }

    public final String l() {
        return this.f25918d;
    }

    public final String m() {
        return this.f25917c;
    }

    public final String n() {
        return this.f25921g;
    }

    public String toString() {
        return "RoomTeleportTunnelRecord(id=" + this.f25915a + ", consoleId=" + this.f25916b + ", ssoAccountId=" + this.f25917c + ", publicSecret=" + this.f25918d + ", name=" + this.f25919e + ", networkName=" + this.f25920f + ", wanIp=" + this.f25921g + ", product=" + this.f25922h + ", imageResourceId=" + this.f25923i + ", imageResourceIdStr=" + this.f25924j + ", imageResourceEngineId=" + this.f25925k + ", latitude=" + this.f25926l + ", longitude=" + this.f25927m + ", location=" + this.f25928n + ")";
    }

    public /* synthetic */ C3785b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, Integer num2, Double d10, Double d11, String str10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : num, str9, num2, d10, d11, str10);
    }
}
