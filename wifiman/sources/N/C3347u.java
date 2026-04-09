package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.o1;
import T.z1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;

/* renamed from: N.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3347u implements InterfaceC3314d {

    /* renamed from: a, reason: collision with root package name */
    private final long f14794a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14795b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14796c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14797d;

    public /* synthetic */ C3347u(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    @Override // N.InterfaceC3314d
    public z1 a(boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-655254499);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-655254499, i10, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:587)");
        }
        z1 z1VarN = o1.n(C6733v0.g(z10 ? this.f14794a : this.f14796c), interfaceC3540l, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return z1VarN;
    }

    @Override // N.InterfaceC3314d
    public z1 b(boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-2133647540);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-2133647540, i10, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:592)");
        }
        z1 z1VarN = o1.n(C6733v0.g(z10 ? this.f14795b : this.f14797d), interfaceC3540l, 0);
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
        if (obj == null || C3347u.class != obj.getClass()) {
            return false;
        }
        C3347u c3347u = (C3347u) obj;
        return C6733v0.m(this.f14794a, c3347u.f14794a) && C6733v0.m(this.f14795b, c3347u.f14795b) && C6733v0.m(this.f14796c, c3347u.f14796c) && C6733v0.m(this.f14797d, c3347u.f14797d);
    }

    public int hashCode() {
        return (((((C6733v0.s(this.f14794a) * 31) + C6733v0.s(this.f14795b)) * 31) + C6733v0.s(this.f14796c)) * 31) + C6733v0.s(this.f14797d);
    }

    private C3347u(long j10, long j11, long j12, long j13) {
        this.f14794a = j10;
        this.f14795b = j11;
        this.f14796c = j12;
        this.f14797d = j13;
    }
}
