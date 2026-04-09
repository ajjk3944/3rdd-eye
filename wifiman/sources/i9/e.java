package I9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final long f8961a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8962b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8963c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8964d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8965e;

    /* renamed from: f, reason: collision with root package name */
    private final long f8966f;

    /* renamed from: g, reason: collision with root package name */
    private final long f8967g;

    /* renamed from: h, reason: collision with root package name */
    private final long f8968h;

    public /* synthetic */ e(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17);
    }

    public final long a() {
        return this.f8961a;
    }

    public final long b() {
        return this.f8965e;
    }

    public final long c() {
        return this.f8962b;
    }

    public final long d() {
        return this.f8966f;
    }

    public final long e() {
        return this.f8964d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C6733v0.m(this.f8961a, eVar.f8961a) && C6733v0.m(this.f8962b, eVar.f8962b) && C6733v0.m(this.f8963c, eVar.f8963c) && C6733v0.m(this.f8964d, eVar.f8964d) && C6733v0.m(this.f8965e, eVar.f8965e) && C6733v0.m(this.f8966f, eVar.f8966f) && C6733v0.m(this.f8967g, eVar.f8967g) && C6733v0.m(this.f8968h, eVar.f8968h);
    }

    public final long f() {
        return this.f8968h;
    }

    public final long g() {
        return this.f8963c;
    }

    public final long h() {
        return this.f8967g;
    }

    public int hashCode() {
        return (((((((((((((C6733v0.s(this.f8961a) * 31) + C6733v0.s(this.f8962b)) * 31) + C6733v0.s(this.f8963c)) * 31) + C6733v0.s(this.f8964d)) * 31) + C6733v0.s(this.f8965e)) * 31) + C6733v0.s(this.f8966f)) * 31) + C6733v0.s(this.f8967g)) * 31) + C6733v0.s(this.f8968h);
    }

    public String toString() {
        return "Colors(checkedThumbColor=" + C6733v0.t(this.f8961a) + ", disabledCheckedThumbColor=" + C6733v0.t(this.f8962b) + ", uncheckedThumbColor=" + C6733v0.t(this.f8963c) + ", disabledUncheckedThumbColor=" + C6733v0.t(this.f8964d) + ", checkedTrackColor=" + C6733v0.t(this.f8965e) + ", disabledCheckedTrackColor=" + C6733v0.t(this.f8966f) + ", uncheckedTrackColor=" + C6733v0.t(this.f8967g) + ", disabledUncheckedTrackColor=" + C6733v0.t(this.f8968h) + ")";
    }

    private e(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.f8961a = j10;
        this.f8962b = j11;
        this.f8963c = j12;
        this.f8964d = j13;
        this.f8965e = j14;
        this.f8966f = j15;
        this.f8967g = j16;
        this.f8968h = j17;
    }
}
