package Rb;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final a f19694e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f19695a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19696b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19697c;

    /* renamed from: d, reason: collision with root package name */
    private final long f19698d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(long j10, String host, int i10, long j11) {
        AbstractC6492s.i(host, "host");
        this.f19695a = j10;
        this.f19696b = host;
        this.f19697c = i10;
        this.f19698d = j11;
    }

    public static /* synthetic */ c b(c cVar, long j10, String str, int i10, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = cVar.f19695a;
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            str = cVar.f19696b;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            i10 = cVar.f19697c;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            j11 = cVar.f19698d;
        }
        return cVar.a(j12, str2, i12, j11);
    }

    public final c a(long j10, String host, int i10, long j11) {
        AbstractC6492s.i(host, "host");
        return new c(j10, host, i10, j11);
    }

    public final String c() {
        return this.f19696b;
    }

    public final long d() {
        return this.f19695a;
    }

    public final int e() {
        return this.f19697c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f19695a == cVar.f19695a && AbstractC6492s.d(this.f19696b, cVar.f19696b) && this.f19697c == cVar.f19697c && this.f19698d == cVar.f19698d;
    }

    public final long f() {
        return this.f19698d;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f19695a) * 31) + this.f19696b.hashCode()) * 31) + Integer.hashCode(this.f19697c)) * 31) + Long.hashCode(this.f19698d);
    }

    public String toString() {
        return "RoomFavoriteHost(id=" + this.f19695a + ", host=" + this.f19696b + ", priority=" + this.f19697c + ", updated=" + this.f19698d + ")";
    }

    public /* synthetic */ c(long j10, String str, int i10, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j10, str, i10, j11);
    }
}
