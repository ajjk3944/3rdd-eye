package Wb;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final a f23796e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f23797a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23798b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23799c;

    /* renamed from: d, reason: collision with root package name */
    private final long f23800d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(long j10, String str, String str2, long j11) {
        this.f23797a = j10;
        this.f23798b = str;
        this.f23799c = str2;
        this.f23800d = j11;
    }

    public static /* synthetic */ d b(d dVar, long j10, String str, String str2, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = dVar.f23797a;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            str = dVar.f23798b;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            str2 = dVar.f23799c;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            j11 = dVar.f23800d;
        }
        return dVar.a(j12, str3, str4, j11);
    }

    public final d a(long j10, String str, String str2, long j11) {
        return new d(j10, str, str2, j11);
    }

    public final long c() {
        return this.f23797a;
    }

    public final String d() {
        return this.f23798b;
    }

    public final String e() {
        return this.f23799c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f23797a == dVar.f23797a && AbstractC6492s.d(this.f23798b, dVar.f23798b) && AbstractC6492s.d(this.f23799c, dVar.f23799c) && this.f23800d == dVar.f23800d;
    }

    public final long f() {
        return this.f23800d;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f23797a) * 31;
        String str = this.f23798b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23799c;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.f23800d);
    }

    public String toString() {
        return "RoomFloorplanRecord(id=" + this.f23797a + ", name=" + this.f23798b + ", ssid=" + this.f23799c + ", timestamp=" + this.f23800d + ")";
    }

    public /* synthetic */ d(long j10, String str, String str2, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, str, str2, j11);
    }
}
