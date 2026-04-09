package G;

import C0.D;
import E0.B;
import Yg.J;
import androidx.compose.ui.layout.m;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class b extends G.a implements B {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f6750a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6751b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6752c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t tVar, int i10, int i11) {
            super(1);
            this.f6750a = tVar;
            this.f6751b = i10;
            this.f6752c = i11;
        }

        public final void a(t.a aVar) {
            t.a.h(aVar, this.f6750a, -this.f6751b, -this.f6752c, 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public b(InterfaceC6824a interfaceC6824a) {
        super(interfaceC6824a);
    }

    @Override // E0.s0
    public boolean E1() {
        return true;
    }

    @Override // E0.B
    public D b(m mVar, C0.B b10, long j10) {
        int iX1 = mVar.x1(androidx.compose.foundation.text.handwriting.a.b());
        int iX12 = mVar.x1(androidx.compose.foundation.text.handwriting.a.a());
        int i10 = iX12 * 2;
        int i11 = iX1 * 2;
        t tVarT = b10.T(Y0.c.n(j10, i10, i11));
        return m.x0(mVar, tVarT.I0() - i10, tVarT.C0() - i11, null, new a(tVarT, iX12, iX1), 4, null);
    }
}
