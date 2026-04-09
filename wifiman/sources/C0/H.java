package C0;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class H implements C {

    /* renamed from: a, reason: collision with root package name */
    private final G f2122a;

    public H(G g10) {
        this.f2122a = g10;
    }

    @Override // C0.C
    public D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
        return this.f2122a.b(mVar, E0.U.a(mVar), j10);
    }

    @Override // C0.C
    public int c(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return this.f2122a.c(interfaceC2535o, E0.U.a(interfaceC2535o), i10);
    }

    @Override // C0.C
    public int e(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return this.f2122a.e(interfaceC2535o, E0.U.a(interfaceC2535o), i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H) && AbstractC6492s.d(this.f2122a, ((H) obj).f2122a);
    }

    @Override // C0.C
    public int f(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return this.f2122a.f(interfaceC2535o, E0.U.a(interfaceC2535o), i10);
    }

    public int hashCode() {
        return this.f2122a.hashCode();
    }

    @Override // C0.C
    public int i(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return this.f2122a.i(interfaceC2535o, E0.U.a(interfaceC2535o), i10);
    }

    public String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f2122a + ')';
    }
}
