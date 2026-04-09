package w9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;

/* renamed from: w9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8284a {

    /* renamed from: a, reason: collision with root package name */
    private final long f64650a;

    /* renamed from: b, reason: collision with root package name */
    private final long f64651b;

    /* renamed from: c, reason: collision with root package name */
    private final long f64652c;

    /* renamed from: d, reason: collision with root package name */
    private final long f64653d;

    /* renamed from: e, reason: collision with root package name */
    private final long f64654e;

    public /* synthetic */ C8284a(long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14);
    }

    public final long a() {
        return this.f64650a;
    }

    public final long b() {
        return this.f64651b;
    }

    public final long c() {
        return this.f64653d;
    }

    public final long d() {
        return this.f64654e;
    }

    public final long e() {
        return this.f64652c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8284a)) {
            return false;
        }
        C8284a c8284a = (C8284a) obj;
        return C6733v0.m(this.f64650a, c8284a.f64650a) && C6733v0.m(this.f64651b, c8284a.f64651b) && C6733v0.m(this.f64652c, c8284a.f64652c) && C6733v0.m(this.f64653d, c8284a.f64653d) && C6733v0.m(this.f64654e, c8284a.f64654e);
    }

    public int hashCode() {
        return (((((((C6733v0.s(this.f64650a) * 31) + C6733v0.s(this.f64651b)) * 31) + C6733v0.s(this.f64652c)) * 31) + C6733v0.s(this.f64653d)) * 31) + C6733v0.s(this.f64654e);
    }

    public String toString() {
        return "Colors(backgroundColor=" + C6733v0.t(this.f64650a) + ", contentColor=" + C6733v0.t(this.f64651b) + ", iconTint=" + C6733v0.t(this.f64652c) + ", disabledBackgroundColor=" + C6733v0.t(this.f64653d) + ", disabledContentColor=" + C6733v0.t(this.f64654e) + ")";
    }

    private C8284a(long j10, long j11, long j12, long j13, long j14) {
        this.f64650a = j10;
        this.f64651b = j11;
        this.f64652c = j12;
        this.f64653d = j13;
        this.f64654e = j14;
    }

    public /* synthetic */ C8284a(long j10, long j11, long j12, long j13, long j14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, (i10 & 4) != 0 ? j11 : j12, j13, j14, null);
    }
}
