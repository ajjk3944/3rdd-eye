package cc;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: cc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4237a {

    /* renamed from: e, reason: collision with root package name */
    public static final C1179a f33919e = new C1179a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f33920a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33921b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33922c;

    /* renamed from: d, reason: collision with root package name */
    private final String f33923d;

    /* renamed from: cc.a$a, reason: collision with other inner class name */
    public static final class C1179a {
        public /* synthetic */ C1179a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1179a() {
        }
    }

    public C4237a(int i10, String mac, String name, String str) {
        AbstractC6492s.i(mac, "mac");
        AbstractC6492s.i(name, "name");
        this.f33920a = i10;
        this.f33921b = mac;
        this.f33922c = name;
        this.f33923d = str;
    }

    public static /* synthetic */ C4237a b(C4237a c4237a, int i10, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c4237a.f33920a;
        }
        if ((i11 & 2) != 0) {
            str = c4237a.f33921b;
        }
        if ((i11 & 4) != 0) {
            str2 = c4237a.f33922c;
        }
        if ((i11 & 8) != 0) {
            str3 = c4237a.f33923d;
        }
        return c4237a.a(i10, str, str2, str3);
    }

    public final C4237a a(int i10, String mac, String name, String str) {
        AbstractC6492s.i(mac, "mac");
        AbstractC6492s.i(name, "name");
        return new C4237a(i10, mac, name, str);
    }

    public final String c() {
        return this.f33923d;
    }

    public final int d() {
        return this.f33920a;
    }

    public final String e() {
        return this.f33921b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4237a)) {
            return false;
        }
        C4237a c4237a = (C4237a) obj;
        return this.f33920a == c4237a.f33920a && AbstractC6492s.d(this.f33921b, c4237a.f33921b) && AbstractC6492s.d(this.f33922c, c4237a.f33922c) && AbstractC6492s.d(this.f33923d, c4237a.f33923d);
    }

    public final String f() {
        return this.f33922c;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f33920a) * 31) + this.f33921b.hashCode()) * 31) + this.f33922c.hashCode()) * 31;
        String str = this.f33923d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RoomWifimanWizardAdoption(id=" + this.f33920a + ", mac=" + this.f33921b + ", name=" + this.f33922c + ", fwRecommended=" + this.f33923d + ")";
    }
}
