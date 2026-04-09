package N;

import E0.AbstractC2631i;
import E0.InterfaceC2630h;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import oh.AbstractC7137b;

/* renamed from: N.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3329k0 extends e.c implements InterfaceC2630h, E0.B {

    /* renamed from: N.k0$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f14494a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f14495b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f14496c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, androidx.compose.ui.layout.t tVar, int i11) {
            super(1);
            this.f14494a = i10;
            this.f14495b = tVar;
            this.f14496c = i11;
        }

        public final void a(t.a aVar) {
            t.a.h(aVar, this.f14495b, AbstractC7137b.e((this.f14494a - this.f14495b.I0()) / 2.0f), AbstractC7137b.e((this.f14496c - this.f14495b.C0()) / 2.0f), 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return Yg.J.f24997a;
        }
    }

    @Override // E0.B
    public C0.D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        boolean z10 = k2() && ((Boolean) AbstractC2631i.a(this, AbstractC3313c0.b())).booleanValue();
        long j11 = AbstractC3313c0.f14376c;
        androidx.compose.ui.layout.t tVarT = b10.T(j10);
        int iMax = z10 ? Math.max(tVarT.I0(), mVar.x1(Y0.k.h(j11))) : tVarT.I0();
        int iMax2 = z10 ? Math.max(tVarT.C0(), mVar.x1(Y0.k.g(j11))) : tVarT.C0();
        return androidx.compose.ui.layout.m.x0(mVar, iMax, iMax2, null, new a(iMax, tVarT, iMax2), 4, null);
    }
}
