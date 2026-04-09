package u9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;

/* renamed from: u9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8142a {

    /* renamed from: a, reason: collision with root package name */
    private final long f62738a;

    /* renamed from: b, reason: collision with root package name */
    private final long f62739b;

    /* renamed from: c, reason: collision with root package name */
    private final long f62740c;

    public /* synthetic */ C8142a(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    public final long a() {
        return this.f62739b;
    }

    public final long b() {
        return this.f62740c;
    }

    public final long c() {
        return this.f62738a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8142a)) {
            return false;
        }
        C8142a c8142a = (C8142a) obj;
        return C6733v0.m(this.f62738a, c8142a.f62738a) && C6733v0.m(this.f62739b, c8142a.f62739b) && C6733v0.m(this.f62740c, c8142a.f62740c);
    }

    public int hashCode() {
        return (((C6733v0.s(this.f62738a) * 31) + C6733v0.s(this.f62739b)) * 31) + C6733v0.s(this.f62740c);
    }

    public String toString() {
        return "Colors(text=" + C6733v0.t(this.f62738a) + ", error=" + C6733v0.t(this.f62739b) + ", fieldBorder=" + C6733v0.t(this.f62740c) + ")";
    }

    private C8142a(long j10, long j11, long j12) {
        this.f62738a = j10;
        this.f62739b = j11;
        this.f62740c = j12;
    }
}
