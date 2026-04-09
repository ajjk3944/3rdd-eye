package Ob;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final a f17773f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f17774a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17775b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17776c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17777d;

    /* renamed from: e, reason: collision with root package name */
    private final long f17778e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(String id2, String mac, boolean z10, String str, long j10) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(mac, "mac");
        this.f17774a = id2;
        this.f17775b = mac;
        this.f17776c = z10;
        this.f17777d = str;
        this.f17778e = j10;
    }

    public final String a() {
        return this.f17777d;
    }

    public final boolean b() {
        return this.f17776c;
    }

    public final String c() {
        return this.f17774a;
    }

    public final String d() {
        return this.f17775b;
    }

    public final long e() {
        return this.f17778e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC6492s.d(this.f17774a, cVar.f17774a) && AbstractC6492s.d(this.f17775b, cVar.f17775b) && this.f17776c == cVar.f17776c && AbstractC6492s.d(this.f17777d, cVar.f17777d) && this.f17778e == cVar.f17778e;
    }

    public int hashCode() {
        int iHashCode = ((((this.f17774a.hashCode() * 31) + this.f17775b.hashCode()) * 31) + Boolean.hashCode(this.f17776c)) * 31;
        String str = this.f17777d;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.f17778e);
    }

    public String toString() {
        return "RoomDeviceRecord(id=" + this.f17774a + ", mac=" + this.f17775b + ", favorite=" + this.f17776c + ", customName=" + this.f17777d + ", updated=" + this.f17778e + ")";
    }

    public /* synthetic */ c(String str, String str2, boolean z10, String str3, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? false : z10, str3, j10);
    }
}
