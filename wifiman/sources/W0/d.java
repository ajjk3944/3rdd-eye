package W0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6713l0;
import m0.C6733v0;

/* loaded from: classes.dex */
final class d implements n {

    /* renamed from: b, reason: collision with root package name */
    private final long f23482b;

    public /* synthetic */ d(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    @Override // W0.n
    public float b() {
        return C6733v0.n(c());
    }

    @Override // W0.n
    public long c() {
        return this.f23482b;
    }

    @Override // W0.n
    public AbstractC6713l0 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && C6733v0.m(this.f23482b, ((d) obj).f23482b);
    }

    public int hashCode() {
        return C6733v0.s(this.f23482b);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) C6733v0.t(this.f23482b)) + ')';
    }

    private d(long j10) {
        this.f23482b = j10;
        if (j10 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }
}
