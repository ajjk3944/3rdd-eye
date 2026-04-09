package J9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final long f9918a;

    /* renamed from: b, reason: collision with root package name */
    private final long f9919b;

    /* renamed from: c, reason: collision with root package name */
    private final long f9920c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9921d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9922e;

    /* renamed from: f, reason: collision with root package name */
    private final long f9923f;

    /* renamed from: g, reason: collision with root package name */
    private final long f9924g;

    public /* synthetic */ b(long j10, long j11, long j12, long j13, long j14, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16);
    }

    public final long a() {
        return this.f9918a;
    }

    public final long b() {
        return this.f9922e;
    }

    public final long c() {
        return this.f9921d;
    }

    public final long d() {
        return this.f9923f;
    }

    public final long e() {
        return this.f9920c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C6733v0.m(this.f9918a, bVar.f9918a) && C6733v0.m(this.f9919b, bVar.f9919b) && C6733v0.m(this.f9920c, bVar.f9920c) && C6733v0.m(this.f9921d, bVar.f9921d) && C6733v0.m(this.f9922e, bVar.f9922e) && C6733v0.m(this.f9923f, bVar.f9923f) && C6733v0.m(this.f9924g, bVar.f9924g);
    }

    public final long f() {
        return this.f9919b;
    }

    public final long g() {
        return this.f9924g;
    }

    public int hashCode() {
        return (((((((((((C6733v0.s(this.f9918a) * 31) + C6733v0.s(this.f9919b)) * 31) + C6733v0.s(this.f9920c)) * 31) + C6733v0.s(this.f9921d)) * 31) + C6733v0.s(this.f9922e)) * 31) + C6733v0.s(this.f9923f)) * 31) + C6733v0.s(this.f9924g);
    }

    public String toString() {
        return "UiTabLayoutColors(background=" + C6733v0.t(this.f9918a) + ", textUnselected=" + C6733v0.t(this.f9919b) + ", textSelected=" + C6733v0.t(this.f9920c) + ", selected=" + C6733v0.t(this.f9921d) + ", ripple=" + C6733v0.t(this.f9922e) + ", selectedBorder=" + C6733v0.t(this.f9923f) + ", unSelected=" + C6733v0.t(this.f9924g) + ")";
    }

    private b(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f9918a = j10;
        this.f9919b = j11;
        this.f9920c = j12;
        this.f9921d = j13;
        this.f9922e = j14;
        this.f9923f = j15;
        this.f9924g = j16;
    }
}
