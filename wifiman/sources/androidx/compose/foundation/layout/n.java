package androidx.compose.foundation.layout;

import C0.D;
import E0.B;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
final class n extends e.c implements B {

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC6835l f28151n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f28152o;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m f28154b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f28155c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.m mVar, androidx.compose.ui.layout.t tVar) {
            super(1);
            this.f28154b = mVar;
            this.f28155c = tVar;
        }

        public final void a(t.a aVar) {
            long jN = ((Y0.n) n.this.D2().invoke(this.f28154b)).n();
            if (n.this.E2()) {
                t.a.p(aVar, this.f28155c, Y0.n.h(jN), Y0.n.i(jN), 0.0f, null, 12, null);
            } else {
                t.a.v(aVar, this.f28155c, Y0.n.h(jN), Y0.n.i(jN), 0.0f, null, 12, null);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public n(InterfaceC6835l interfaceC6835l, boolean z10) {
        this.f28151n = interfaceC6835l;
        this.f28152o = z10;
    }

    public final InterfaceC6835l D2() {
        return this.f28151n;
    }

    public final boolean E2() {
        return this.f28152o;
    }

    public final void F2(InterfaceC6835l interfaceC6835l) {
        this.f28151n = interfaceC6835l;
    }

    public final void G2(boolean z10) {
        this.f28152o = z10;
    }

    @Override // E0.B
    public D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        androidx.compose.ui.layout.t tVarT = b10.T(j10);
        return androidx.compose.ui.layout.m.x0(mVar, tVarT.I0(), tVarT.C0(), null, new a(mVar, tVarT), 4, null);
    }
}
