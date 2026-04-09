package E9;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6713l0;
import m0.C6733v0;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6713l0 f4392a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4393b;

    public /* synthetic */ e(AbstractC6713l0 abstractC6713l0, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6713l0, j10);
    }

    public final long a() {
        return this.f4393b;
    }

    public final AbstractC6713l0 b() {
        return this.f4392a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return AbstractC6492s.d(this.f4392a, eVar.f4392a) && C6733v0.m(this.f4393b, eVar.f4393b);
    }

    public int hashCode() {
        return (this.f4392a.hashCode() * 31) + C6733v0.s(this.f4393b);
    }

    public String toString() {
        return "UiProgressIndicatorColors(color=" + this.f4392a + ", backgroundColor=" + C6733v0.t(this.f4393b) + ")";
    }

    private e(AbstractC6713l0 color, long j10) {
        AbstractC6492s.i(color, "color");
        this.f4392a = color;
        this.f4393b = j10;
    }
}
