package ac;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ac.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3784a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0996a f25909e = new C0996a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f25910a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25911b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25912c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25913d;

    /* renamed from: ac.a$a, reason: collision with other inner class name */
    public static final class C0996a {
        public /* synthetic */ C0996a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0996a() {
        }
    }

    public C3784a(int i10, boolean z10, String str, String str2) {
        this.f25910a = i10;
        this.f25911b = z10;
        this.f25912c = str;
        this.f25913d = str2;
    }

    public static /* synthetic */ C3784a b(C3784a c3784a, int i10, boolean z10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c3784a.f25910a;
        }
        if ((i11 & 2) != 0) {
            z10 = c3784a.f25911b;
        }
        if ((i11 & 4) != 0) {
            str = c3784a.f25912c;
        }
        if ((i11 & 8) != 0) {
            str2 = c3784a.f25913d;
        }
        return c3784a.a(i10, z10, str, str2);
    }

    public final C3784a a(int i10, boolean z10, String str, String str2) {
        return new C3784a(i10, z10, str, str2);
    }

    public final String c() {
        return this.f25912c;
    }

    public final boolean d() {
        return this.f25911b;
    }

    public final int e() {
        return this.f25910a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3784a)) {
            return false;
        }
        C3784a c3784a = (C3784a) obj;
        return this.f25910a == c3784a.f25910a && this.f25911b == c3784a.f25911b && AbstractC6492s.d(this.f25912c, c3784a.f25912c) && AbstractC6492s.d(this.f25913d, c3784a.f25913d);
    }

    public final String f() {
        return this.f25913d;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f25910a) * 31) + Boolean.hashCode(this.f25911b)) * 31;
        String str = this.f25912c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25913d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "RoomTeleportState(id=" + this.f25910a + ", dataCollectionApproved=" + this.f25911b + ", consolePrimaryId=" + this.f25912c + ", tunnelPrimaryId=" + this.f25913d + ")";
    }

    public /* synthetic */ C3784a(int i10, boolean z10, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, z10, str, str2);
    }
}
