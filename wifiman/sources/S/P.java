package s;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6737x0;
import m0.C6733v0;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private final long f60689a;

    /* renamed from: b, reason: collision with root package name */
    private final z.N f60690b;

    public /* synthetic */ P(long j10, z.N n10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, n10);
    }

    public final z.N a() {
        return this.f60690b;
    }

    public final long b() {
        return this.f60689a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC6492s.d(P.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC6492s.g(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        P p10 = (P) obj;
        return C6733v0.m(this.f60689a, p10.f60689a) && AbstractC6492s.d(this.f60690b, p10.f60690b);
    }

    public int hashCode() {
        return (C6733v0.s(this.f60689a) * 31) + this.f60690b.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) C6733v0.t(this.f60689a)) + ", drawPadding=" + this.f60690b + ')';
    }

    private P(long j10, z.N n10) {
        this.f60689a = j10;
        this.f60690b = n10;
    }

    public /* synthetic */ P(long j10, z.N n10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC6737x0.d(4284900966L) : j10, (i10 & 2) != 0 ? androidx.compose.foundation.layout.o.c(0.0f, 0.0f, 3, null) : n10, null);
    }
}
