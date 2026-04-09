package androidx.compose.foundation.layout;

import C0.D;
import E0.B;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import z.N;

/* loaded from: classes.dex */
final class q extends e.c implements B {

    /* renamed from: n, reason: collision with root package name */
    private N f28172n;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f28173a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m f28174b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f28175c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.t tVar, androidx.compose.ui.layout.m mVar, q qVar) {
            super(1);
            this.f28173a = tVar;
            this.f28174b = mVar;
            this.f28175c = qVar;
        }

        public final void a(t.a aVar) {
            t.a.h(aVar, this.f28173a, this.f28174b.x1(this.f28175c.D2().a(this.f28174b.getLayoutDirection())), this.f28174b.x1(this.f28175c.D2().d()), 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public q(N n10) {
        this.f28172n = n10;
    }

    public final N D2() {
        return this.f28172n;
    }

    public final void E2(N n10) {
        this.f28172n = n10;
    }

    @Override // E0.B
    public D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        float f10 = 0;
        if (Y0.h.h(this.f28172n.a(mVar.getLayoutDirection()), Y0.h.j(f10)) < 0 || Y0.h.h(this.f28172n.d(), Y0.h.j(f10)) < 0 || Y0.h.h(this.f28172n.b(mVar.getLayoutDirection()), Y0.h.j(f10)) < 0 || Y0.h.h(this.f28172n.c(), Y0.h.j(f10)) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int iX1 = mVar.x1(this.f28172n.a(mVar.getLayoutDirection())) + mVar.x1(this.f28172n.b(mVar.getLayoutDirection()));
        int iX12 = mVar.x1(this.f28172n.d()) + mVar.x1(this.f28172n.c());
        androidx.compose.ui.layout.t tVarT = b10.T(Y0.c.n(j10, -iX1, -iX12));
        return androidx.compose.ui.layout.m.x0(mVar, Y0.c.i(j10, tVarT.I0() + iX1), Y0.c.h(j10, tVarT.C0() + iX12), null, new a(tVarT, mVar, this), 4, null);
    }
}
