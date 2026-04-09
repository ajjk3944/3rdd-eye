package Jd;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0404a f9991e = new C0404a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f9992a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9993b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9994c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9995d;

    /* renamed from: Jd.a$a, reason: collision with other inner class name */
    public static final class C0404a {
        public /* synthetic */ C0404a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0404a() {
        }
    }

    public a(long j10, String cloudToken, String cloudSecret, String key) {
        AbstractC6492s.i(cloudToken, "cloudToken");
        AbstractC6492s.i(cloudSecret, "cloudSecret");
        AbstractC6492s.i(key, "key");
        this.f9992a = j10;
        this.f9993b = cloudToken;
        this.f9994c = cloudSecret;
        this.f9995d = key;
    }

    public final String a() {
        return this.f9994c;
    }

    public final String b() {
        return this.f9993b;
    }

    public final long c() {
        return this.f9992a;
    }

    public final String d() {
        return this.f9995d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9992a == aVar.f9992a && AbstractC6492s.d(this.f9993b, aVar.f9993b) && AbstractC6492s.d(this.f9994c, aVar.f9994c) && AbstractC6492s.d(this.f9995d, aVar.f9995d);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f9992a) * 31) + this.f9993b.hashCode()) * 31) + this.f9994c.hashCode()) * 31) + this.f9995d.hashCode();
    }

    public String toString() {
        return "RoomTeleportConfig(id=" + this.f9992a + ", cloudToken=" + this.f9993b + ", cloudSecret=" + this.f9994c + ", key=" + this.f9995d + ")";
    }

    public /* synthetic */ a(long j10, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, str, str2, str3);
    }
}
