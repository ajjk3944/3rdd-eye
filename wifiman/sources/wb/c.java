package Wb;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f23793c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f23794a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23795b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(long j10, String gpx) {
        AbstractC6492s.i(gpx, "gpx");
        this.f23794a = j10;
        this.f23795b = gpx;
    }

    public final String a() {
        return this.f23795b;
    }

    public final long b() {
        return this.f23794a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f23794a == cVar.f23794a && AbstractC6492s.d(this.f23795b, cVar.f23795b);
    }

    public int hashCode() {
        return (Long.hashCode(this.f23794a) * 31) + this.f23795b.hashCode();
    }

    public String toString() {
        return "RoomFloorplanGpx(id=" + this.f23794a + ", gpx=" + this.f23795b + ")";
    }
}
