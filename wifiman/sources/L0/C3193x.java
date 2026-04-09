package L0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: L0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3193x {

    /* renamed from: a, reason: collision with root package name */
    private final long f11195a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11196b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11197c;

    public /* synthetic */ C3193x(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, i10);
    }

    public final long a() {
        return this.f11196b;
    }

    public final int b() {
        return this.f11197c;
    }

    public final long c() {
        return this.f11195a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3193x)) {
            return false;
        }
        C3193x c3193x = (C3193x) obj;
        return Y0.v.e(this.f11195a, c3193x.f11195a) && Y0.v.e(this.f11196b, c3193x.f11196b) && AbstractC3194y.i(this.f11197c, c3193x.f11197c);
    }

    public int hashCode() {
        return (((Y0.v.i(this.f11195a) * 31) + Y0.v.i(this.f11196b)) * 31) + AbstractC3194y.j(this.f11197c);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) Y0.v.j(this.f11195a)) + ", height=" + ((Object) Y0.v.j(this.f11196b)) + ", placeholderVerticalAlign=" + ((Object) AbstractC3194y.k(this.f11197c)) + ')';
    }

    private C3193x(long j10, long j11, int i10) {
        this.f11195a = j10;
        this.f11196b = j11;
        this.f11197c = i10;
        if (Y0.w.h(j10)) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if (Y0.w.h(j11)) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }
}
