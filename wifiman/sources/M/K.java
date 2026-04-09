package M;

import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final long f12146a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12147b;

    public /* synthetic */ K(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    public final long a() {
        return this.f12147b;
    }

    public final long b() {
        return this.f12146a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        return C6733v0.m(this.f12146a, k10.f12146a) && C6733v0.m(this.f12147b, k10.f12147b);
    }

    public int hashCode() {
        return (C6733v0.s(this.f12146a) * 31) + C6733v0.s(this.f12147b);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) C6733v0.t(this.f12146a)) + ", selectionBackgroundColor=" + ((Object) C6733v0.t(this.f12147b)) + ')';
    }

    private K(long j10, long j11) {
        this.f12146a = j10;
        this.f12147b = j11;
    }
}
