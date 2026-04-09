package F;

import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
final class z0 implements C0.x {

    /* renamed from: a, reason: collision with root package name */
    private final f0 f5639a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5640b;

    /* renamed from: c, reason: collision with root package name */
    private final R0.a0 f5641c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6824a f5642d;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m f5643a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z0 f5644b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f5645c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5646d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.m mVar, z0 z0Var, androidx.compose.ui.layout.t tVar, int i10) {
            super(1);
            this.f5643a = mVar;
            this.f5644b = z0Var;
            this.f5645c = tVar;
            this.f5646d = i10;
        }

        public final void a(t.a aVar) {
            androidx.compose.ui.layout.m mVar = this.f5643a;
            int iA = this.f5644b.a();
            R0.a0 a0VarE = this.f5644b.e();
            j0 j0Var = (j0) this.f5644b.d().invoke();
            this.f5644b.c().j(w.q.Vertical, e0.b(mVar, iA, a0VarE, j0Var != null ? j0Var.f() : null, false, this.f5645c.I0()), this.f5646d, this.f5645c.C0());
            t.a.l(aVar, this.f5645c, 0, Math.round(-this.f5644b.c().d()), 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return Yg.J.f24997a;
        }
    }

    public z0(f0 f0Var, int i10, R0.a0 a0Var, InterfaceC6824a interfaceC6824a) {
        this.f5639a = f0Var;
        this.f5640b = i10;
        this.f5641c = a0Var;
        this.f5642d = interfaceC6824a;
    }

    public final int a() {
        return this.f5640b;
    }

    @Override // C0.x
    public C0.D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        androidx.compose.ui.layout.t tVarT = b10.T(Y0.b.d(j10, 0, 0, 0, MPv3.MAX_MESSAGE_ID, 7, null));
        int iMin = Math.min(tVarT.C0(), Y0.b.k(j10));
        return androidx.compose.ui.layout.m.x0(mVar, tVarT.I0(), iMin, null, new a(mVar, this, tVarT, iMin), 4, null);
    }

    public final f0 c() {
        return this.f5639a;
    }

    public final InterfaceC6824a d() {
        return this.f5642d;
    }

    public final R0.a0 e() {
        return this.f5641c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return AbstractC6492s.d(this.f5639a, z0Var.f5639a) && this.f5640b == z0Var.f5640b && AbstractC6492s.d(this.f5641c, z0Var.f5641c) && AbstractC6492s.d(this.f5642d, z0Var.f5642d);
    }

    public int hashCode() {
        return (((((this.f5639a.hashCode() * 31) + Integer.hashCode(this.f5640b)) * 31) + this.f5641c.hashCode()) * 31) + this.f5642d.hashCode();
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f5639a + ", cursorOffset=" + this.f5640b + ", transformedText=" + this.f5641c + ", textLayoutResultProvider=" + this.f5642d + ')';
    }
}
