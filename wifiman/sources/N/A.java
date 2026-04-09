package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.o1;
import T.z1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;
import q.AbstractC7402u;
import r.AbstractC7535j;

/* loaded from: classes.dex */
final class A implements InterfaceC3348u0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f13515a;

    /* renamed from: b, reason: collision with root package name */
    private final long f13516b;

    /* renamed from: c, reason: collision with root package name */
    private final long f13517c;

    public /* synthetic */ A(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    @Override // N.InterfaceC3348u0
    public z1 a(boolean z10, boolean z11, InterfaceC3540l interfaceC3540l, int i10) {
        z1 z1VarN;
        interfaceC3540l.U(1243421834);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1243421834, i10, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:186)");
        }
        long j10 = !z10 ? this.f13517c : !z11 ? this.f13516b : this.f13515a;
        if (z10) {
            interfaceC3540l.U(1872507307);
            z1VarN = AbstractC7402u.a(j10, AbstractC7535j.l(100, 0, null, 6, null), null, null, interfaceC3540l, 48, 12);
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(1872610010);
            z1VarN = o1.n(C6733v0.g(j10), interfaceC3540l, 0);
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return z1VarN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || A.class != obj.getClass()) {
            return false;
        }
        A a10 = (A) obj;
        return C6733v0.m(this.f13515a, a10.f13515a) && C6733v0.m(this.f13516b, a10.f13516b) && C6733v0.m(this.f13517c, a10.f13517c);
    }

    public int hashCode() {
        return (((C6733v0.s(this.f13515a) * 31) + C6733v0.s(this.f13516b)) * 31) + C6733v0.s(this.f13517c);
    }

    private A(long j10, long j11, long j12) {
        this.f13515a = j10;
        this.f13516b = j11;
        this.f13517c = j12;
    }
}
