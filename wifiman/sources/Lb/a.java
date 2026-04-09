package Lb;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: l, reason: collision with root package name */
    public static final C0453a f11518l = new C0453a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f11519a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11520b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11521c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11522d;

    /* renamed from: e, reason: collision with root package name */
    private final String f11523e;

    /* renamed from: f, reason: collision with root package name */
    private final String f11524f;

    /* renamed from: g, reason: collision with root package name */
    private final Boolean f11525g;

    /* renamed from: h, reason: collision with root package name */
    private final String f11526h;

    /* renamed from: i, reason: collision with root package name */
    private final String f11527i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f11528j;

    /* renamed from: k, reason: collision with root package name */
    private final long f11529k;

    /* renamed from: Lb.a$a, reason: collision with other inner class name */
    public static final class C0453a {
        public /* synthetic */ C0453a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0453a() {
        }
    }

    public a(String uuid, String username, String str, String str2, String email, String str3, Boolean bool, String str4, String str5, boolean z10, long j10) {
        AbstractC6492s.i(uuid, "uuid");
        AbstractC6492s.i(username, "username");
        AbstractC6492s.i(email, "email");
        this.f11519a = uuid;
        this.f11520b = username;
        this.f11521c = str;
        this.f11522d = str2;
        this.f11523e = email;
        this.f11524f = str3;
        this.f11525g = bool;
        this.f11526h = str4;
        this.f11527i = str5;
        this.f11528j = z10;
        this.f11529k = j10;
    }

    public final a a(String uuid, String username, String str, String str2, String email, String str3, Boolean bool, String str4, String str5, boolean z10, long j10) {
        AbstractC6492s.i(uuid, "uuid");
        AbstractC6492s.i(username, "username");
        AbstractC6492s.i(email, "email");
        return new a(uuid, username, str, str2, email, str3, bool, str4, str5, z10, j10);
    }

    public final String c() {
        return this.f11524f;
    }

    public final String d() {
        return this.f11523e;
    }

    public final String e() {
        return this.f11521c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC6492s.d(this.f11519a, aVar.f11519a) && AbstractC6492s.d(this.f11520b, aVar.f11520b) && AbstractC6492s.d(this.f11521c, aVar.f11521c) && AbstractC6492s.d(this.f11522d, aVar.f11522d) && AbstractC6492s.d(this.f11523e, aVar.f11523e) && AbstractC6492s.d(this.f11524f, aVar.f11524f) && AbstractC6492s.d(this.f11525g, aVar.f11525g) && AbstractC6492s.d(this.f11526h, aVar.f11526h) && AbstractC6492s.d(this.f11527i, aVar.f11527i) && this.f11528j == aVar.f11528j && this.f11529k == aVar.f11529k;
    }

    public final String f() {
        return this.f11522d;
    }

    public final String g() {
        return this.f11526h;
    }

    public final String h() {
        return this.f11527i;
    }

    public int hashCode() {
        int iHashCode = ((this.f11519a.hashCode() * 31) + this.f11520b.hashCode()) * 31;
        String str = this.f11521c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11522d;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f11523e.hashCode()) * 31;
        String str3 = this.f11524f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f11525g;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f11526h;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f11527i;
        return ((((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.f11528j)) * 31) + Long.hashCode(this.f11529k);
    }

    public final long i() {
        return this.f11529k;
    }

    public final String j() {
        return this.f11520b;
    }

    public final String k() {
        return this.f11519a;
    }

    public final Boolean l() {
        return this.f11525g;
    }

    public final boolean m() {
        return this.f11528j;
    }

    public String toString() {
        return "RoomSSOAccount(uuid=" + this.f11519a + ", username=" + this.f11520b + ", firstName=" + this.f11521c + ", lastName=" + this.f11522d + ", email=" + this.f11523e + ", avatarUrl=" + this.f11524f + ", verified=" + this.f11525g + ", privacyRevision=" + this.f11526h + ", termsRevision=" + this.f11527i + ", isPrimary=" + this.f11528j + ", updated=" + this.f11529k + ")";
    }
}
