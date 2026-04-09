package Bf;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f1721a;

    /* renamed from: b, reason: collision with root package name */
    private final List f1722b;

    /* renamed from: c, reason: collision with root package name */
    private final Float f1723c;

    /* renamed from: d, reason: collision with root package name */
    private final long f1724d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f1725e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final float f1726a;

        /* renamed from: b, reason: collision with root package name */
        private final float f1727b;

        public a(float f10, float f11) {
            this.f1726a = f10;
            this.f1727b = f11;
        }

        public final float a() {
            return this.f1726a;
        }

        public final float b() {
            return this.f1727b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f1726a, aVar.f1726a) == 0 && Float.compare(this.f1727b, aVar.f1727b) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f1726a) * 31) + Float.hashCode(this.f1727b);
        }

        public String toString() {
            return "Channel(centerFrequency=" + this.f1726a + ", channelWidth=" + this.f1727b + ")";
        }
    }

    public /* synthetic */ c(String str, List list, Float f10, long j10, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, f10, j10, bool);
    }

    public static /* synthetic */ c b(c cVar, String str, List list, Float f10, long j10, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cVar.f1721a;
        }
        if ((i10 & 2) != 0) {
            list = cVar.f1722b;
        }
        List list2 = list;
        if ((i10 & 4) != 0) {
            f10 = cVar.f1723c;
        }
        Float f11 = f10;
        if ((i10 & 8) != 0) {
            j10 = cVar.f1724d;
        }
        long j11 = j10;
        if ((i10 & 16) != 0) {
            bool = cVar.f1725e;
        }
        return cVar.a(str, list2, f11, j11, bool);
    }

    public final c a(String id2, List channels, Float f10, long j10, Boolean bool) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(channels, "channels");
        return new c(id2, channels, f10, j10, bool, null);
    }

    public final List c() {
        return this.f1722b;
    }

    public final long d() {
        return this.f1724d;
    }

    public final String e() {
        return this.f1721a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC6492s.d(this.f1721a, cVar.f1721a) && AbstractC6492s.d(this.f1722b, cVar.f1722b) && AbstractC6492s.d(this.f1723c, cVar.f1723c) && C6733v0.m(this.f1724d, cVar.f1724d) && AbstractC6492s.d(this.f1725e, cVar.f1725e);
    }

    public final Float f() {
        return this.f1723c;
    }

    public final Boolean g() {
        return this.f1725e;
    }

    public int hashCode() {
        int iHashCode = ((this.f1721a.hashCode() * 31) + this.f1722b.hashCode()) * 31;
        Float f10 = this.f1723c;
        int iHashCode2 = (((iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31) + C6733v0.s(this.f1724d)) * 31;
        Boolean bool = this.f1725e;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "Signal(id=" + this.f1721a + ", channels=" + this.f1722b + ", signalStrength=" + this.f1723c + ", color=" + C6733v0.t(this.f1724d) + ", isHighlighted=" + this.f1725e + ")";
    }

    private c(String id2, List channels, Float f10, long j10, Boolean bool) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(channels, "channels");
        this.f1721a = id2;
        this.f1722b = channels;
        this.f1723c = f10;
        this.f1724d = j10;
        this.f1725e = bool;
    }
}
