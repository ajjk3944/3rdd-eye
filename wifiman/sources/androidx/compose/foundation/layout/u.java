package androidx.compose.foundation.layout;

import C0.D;
import E0.B;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.MPv3;
import sh.AbstractC7978m;
import z.EnumC8691n;

/* loaded from: classes.dex */
final class u extends e.c implements B {

    /* renamed from: n, reason: collision with root package name */
    private EnumC8691n f28220n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f28221o;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC6839p f28222p;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28224b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f28225c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f28226d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m f28227e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, androidx.compose.ui.layout.t tVar, int i11, androidx.compose.ui.layout.m mVar) {
            super(1);
            this.f28224b = i10;
            this.f28225c = tVar;
            this.f28226d = i11;
            this.f28227e = mVar;
        }

        public final void a(t.a aVar) {
            t.a.j(aVar, this.f28225c, ((Y0.n) u.this.D2().invoke(Y0.r.b(Y0.s.a(this.f28224b - this.f28225c.I0(), this.f28226d - this.f28225c.C0())), this.f28227e.getLayoutDirection())).n(), 0.0f, 2, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public u(EnumC8691n enumC8691n, boolean z10, InterfaceC6839p interfaceC6839p) {
        this.f28220n = enumC8691n;
        this.f28221o = z10;
        this.f28222p = interfaceC6839p;
    }

    public final InterfaceC6839p D2() {
        return this.f28222p;
    }

    public final void E2(InterfaceC6839p interfaceC6839p) {
        this.f28222p = interfaceC6839p;
    }

    public final void F2(EnumC8691n enumC8691n) {
        this.f28220n = enumC8691n;
    }

    public final void G2(boolean z10) {
        this.f28221o = z10;
    }

    @Override // E0.B
    public D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        EnumC8691n enumC8691n = this.f28220n;
        EnumC8691n enumC8691n2 = EnumC8691n.Vertical;
        int iN = enumC8691n != enumC8691n2 ? 0 : Y0.b.n(j10);
        EnumC8691n enumC8691n3 = this.f28220n;
        EnumC8691n enumC8691n4 = EnumC8691n.Horizontal;
        int iM = enumC8691n3 == enumC8691n4 ? Y0.b.m(j10) : 0;
        EnumC8691n enumC8691n5 = this.f28220n;
        int iK = MPv3.MAX_MESSAGE_ID;
        int iL = (enumC8691n5 == enumC8691n2 || !this.f28221o) ? Y0.b.l(j10) : Integer.MAX_VALUE;
        if (this.f28220n == enumC8691n4 || !this.f28221o) {
            iK = Y0.b.k(j10);
        }
        androidx.compose.ui.layout.t tVarT = b10.T(Y0.c.a(iN, iL, iM, iK));
        int iK2 = AbstractC7978m.k(tVarT.I0(), Y0.b.n(j10), Y0.b.l(j10));
        int iK3 = AbstractC7978m.k(tVarT.C0(), Y0.b.m(j10), Y0.b.k(j10));
        return androidx.compose.ui.layout.m.x0(mVar, iK2, iK3, null, new a(iK2, tVarT, iK3, mVar), 4, null);
    }
}
