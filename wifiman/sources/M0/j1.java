package m0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class j1 extends AbstractC6713l0 {

    /* renamed from: c, reason: collision with root package name */
    private final long f52920c;

    public /* synthetic */ j1(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    @Override // m0.AbstractC6713l0
    public void a(long j10, S0 s02, float f10) {
        long jK;
        s02.a(1.0f);
        if (f10 == 1.0f) {
            jK = this.f52920c;
        } else {
            long j11 = this.f52920c;
            jK = C6733v0.k(j11, C6733v0.n(j11) * f10, 0.0f, 0.0f, 0.0f, 14, null);
        }
        s02.I(jK);
        if (s02.z() != null) {
            s02.y(null);
        }
    }

    public final long b() {
        return this.f52920c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && C6733v0.m(this.f52920c, ((j1) obj).f52920c);
    }

    public int hashCode() {
        return C6733v0.s(this.f52920c);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) C6733v0.t(this.f52920c)) + ')';
    }

    private j1(long j10) {
        super(null);
        this.f52920c = j10;
    }
}
