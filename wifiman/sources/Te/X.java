package Te;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;
import s9.d;
import sh.C7974i;

/* loaded from: classes4.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    private final C7974i f21778a;

    /* renamed from: b, reason: collision with root package name */
    private final long f21779b;

    /* renamed from: c, reason: collision with root package name */
    private final long f21780c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.d f21781d;

    /* renamed from: e, reason: collision with root package name */
    private final s9.d f21782e;

    public /* synthetic */ X(C7974i c7974i, long j10, long j11, s9.d dVar, s9.d dVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7974i, j10, j11, dVar, dVar2);
    }

    public final long a() {
        return this.f21780c;
    }

    public final long b() {
        return this.f21779b;
    }

    public final C7974i c() {
        return this.f21778a;
    }

    public final float d(float f10) {
        return Math.abs((f10 - this.f21778a.i()) / (this.f21778a.j() - this.f21778a.i()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x10 = (X) obj;
        return AbstractC6492s.d(this.f21778a, x10.f21778a) && C6733v0.m(this.f21779b, x10.f21779b) && C6733v0.m(this.f21780c, x10.f21780c) && AbstractC6492s.d(this.f21781d, x10.f21781d) && AbstractC6492s.d(this.f21782e, x10.f21782e);
    }

    public int hashCode() {
        return (((((((this.f21778a.hashCode() * 31) + C6733v0.s(this.f21779b)) * 31) + C6733v0.s(this.f21780c)) * 31) + this.f21781d.hashCode()) * 31) + this.f21782e.hashCode();
    }

    public String toString() {
        return "Segment(range=" + this.f21778a + ", colorStart=" + C6733v0.t(this.f21779b) + ", colorEnd=" + C6733v0.t(this.f21780c) + ", labelStart=" + this.f21781d + ", labelEnd=" + this.f21782e + ")";
    }

    private X(C7974i range, long j10, long j11, s9.d labelStart, s9.d labelEnd) {
        AbstractC6492s.i(range, "range");
        AbstractC6492s.i(labelStart, "labelStart");
        AbstractC6492s.i(labelEnd, "labelEnd");
        this.f21778a = range;
        this.f21779b = j10;
        this.f21780c = j11;
        this.f21781d = labelStart;
        this.f21782e = labelEnd;
    }

    public /* synthetic */ X(C7974i c7974i, long j10, long j11, s9.d dVar, s9.d dVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7974i, j10, j11, (i10 & 8) != 0 ? new d.c(String.valueOf(c7974i.i())) : dVar, (i10 & 16) != 0 ? new d.c(String.valueOf(c7974i.j())) : dVar2, null);
    }
}
