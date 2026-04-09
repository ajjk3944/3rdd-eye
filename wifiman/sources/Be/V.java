package Be;

import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;

/* loaded from: classes4.dex */
final class V {

    /* renamed from: a, reason: collision with root package name */
    private final long f1503a;

    /* renamed from: b, reason: collision with root package name */
    private final long f1504b;

    /* renamed from: c, reason: collision with root package name */
    private final long f1505c;

    /* renamed from: d, reason: collision with root package name */
    private final long f1506d;

    public /* synthetic */ V(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    public final long a() {
        return this.f1503a;
    }

    public final long b() {
        return this.f1504b;
    }

    public final long c() {
        return this.f1505c;
    }

    public final long d() {
        return this.f1506d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        return C6733v0.m(this.f1503a, v10.f1503a) && C6733v0.m(this.f1504b, v10.f1504b) && C6733v0.m(this.f1505c, v10.f1505c) && C6733v0.m(this.f1506d, v10.f1506d);
    }

    public int hashCode() {
        return (((((C6733v0.s(this.f1503a) * 31) + C6733v0.s(this.f1504b)) * 31) + C6733v0.s(this.f1505c)) * 31) + C6733v0.s(this.f1506d);
    }

    public String toString() {
        return "UiNavigationBarColors(background=" + C6733v0.t(this.f1503a) + ", contentTint=" + C6733v0.t(this.f1504b) + ", contentTintSelected=" + C6733v0.t(this.f1505c) + ", ripple=" + C6733v0.t(this.f1506d) + ")";
    }

    private V(long j10, long j11, long j12, long j13) {
        this.f1503a = j10;
        this.f1504b = j11;
        this.f1505c = j12;
        this.f1506d = j13;
    }
}
