package Xb;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f24235e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f24236a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24237b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24238c;

    /* renamed from: d, reason: collision with root package name */
    private final long f24239d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(long j10, String str, String str2, long j11) {
        this.f24236a = j10;
        this.f24237b = str;
        this.f24238c = str2;
        this.f24239d = j11;
    }

    public static /* synthetic */ b b(b bVar, long j10, String str, String str2, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = bVar.f24236a;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            str = bVar.f24237b;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            str2 = bVar.f24238c;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            j11 = bVar.f24239d;
        }
        return bVar.a(j12, str3, str4, j11);
    }

    public final b a(long j10, String str, String str2, long j11) {
        return new b(j10, str, str2, j11);
    }

    public final String c() {
        return this.f24237b;
    }

    public final long d() {
        return this.f24236a;
    }

    public final long e() {
        return this.f24239d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f24236a == bVar.f24236a && AbstractC6492s.d(this.f24237b, bVar.f24237b) && AbstractC6492s.d(this.f24238c, bVar.f24238c) && this.f24239d == bVar.f24239d;
    }

    public final String f() {
        return this.f24238c;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f24236a) * 31;
        String str = this.f24237b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24238c;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.f24239d);
    }

    public String toString() {
        return "RoomSpeedtestIdentification(id=" + this.f24236a + ", cloudID=" + this.f24237b + ", unifiControllerId=" + this.f24238c + ", time=" + this.f24239d + ")";
    }
}
