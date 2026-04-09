package F;

import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.snmp4j.mp.MPv3;

/* renamed from: F.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2728s implements C0.x {

    /* renamed from: a, reason: collision with root package name */
    private final f0 f5610a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5611b;

    /* renamed from: c, reason: collision with root package name */
    private final R0.a0 f5612c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6824a f5613d;

    /* renamed from: F.s$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m f5614a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2728s f5615b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f5616c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5617d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.m mVar, C2728s c2728s, androidx.compose.ui.layout.t tVar, int i10) {
            super(1);
            this.f5614a = mVar;
            this.f5615b = c2728s;
            this.f5616c = tVar;
            this.f5617d = i10;
        }

        public final void a(t.a aVar) {
            androidx.compose.ui.layout.m mVar = this.f5614a;
            int iA = this.f5615b.a();
            R0.a0 a0VarE = this.f5615b.e();
            j0 j0Var = (j0) this.f5615b.d().invoke();
            this.f5615b.c().j(w.q.Horizontal, e0.b(mVar, iA, a0VarE, j0Var != null ? j0Var.f() : null, this.f5614a.getLayoutDirection() == Y0.t.Rtl, this.f5616c.I0()), this.f5617d, this.f5616c.I0());
            t.a.l(aVar, this.f5616c, Math.round(-this.f5615b.c().d()), 0, 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return Yg.J.f24997a;
        }
    }

    public C2728s(f0 f0Var, int i10, R0.a0 a0Var, InterfaceC6824a interfaceC6824a) {
        this.f5610a = f0Var;
        this.f5611b = i10;
        this.f5612c = a0Var;
        this.f5613d = interfaceC6824a;
    }

    public final int a() {
        return this.f5611b;
    }

    @Override // C0.x
    public C0.D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        androidx.compose.ui.layout.t tVarT = b10.T(b10.S(Y0.b.k(j10)) < Y0.b.l(j10) ? j10 : Y0.b.d(j10, 0, MPv3.MAX_MESSAGE_ID, 0, 0, 13, null));
        int iMin = Math.min(tVarT.I0(), Y0.b.l(j10));
        return androidx.compose.ui.layout.m.x0(mVar, iMin, tVarT.C0(), null, new a(mVar, this, tVarT, iMin), 4, null);
    }

    public final f0 c() {
        return this.f5610a;
    }

    public final InterfaceC6824a d() {
        return this.f5613d;
    }

    public final R0.a0 e() {
        return this.f5612c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2728s)) {
            return false;
        }
        C2728s c2728s = (C2728s) obj;
        return AbstractC6492s.d(this.f5610a, c2728s.f5610a) && this.f5611b == c2728s.f5611b && AbstractC6492s.d(this.f5612c, c2728s.f5612c) && AbstractC6492s.d(this.f5613d, c2728s.f5613d);
    }

    public int hashCode() {
        return (((((this.f5610a.hashCode() * 31) + Integer.hashCode(this.f5611b)) * 31) + this.f5612c.hashCode()) * 31) + this.f5613d.hashCode();
    }

    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f5610a + ", cursorOffset=" + this.f5611b + ", transformedText=" + this.f5612c + ", textLayoutResultProvider=" + this.f5613d + ')';
    }
}
